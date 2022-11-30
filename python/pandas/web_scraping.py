from selenium import webdriver
from bs4 import BeautifulSoup
import time
import csv

def openDriver():
    url ="https://www.melon.com/chart/index.htm"
    driver = webdriver.Chrome()
    driver.implicitly_wait(3)
    driver.get(url)
    time.sleep(2)
    return driver

def searchWebtoon(driver):
    html = driver.page_source
    soup = BeautifulSoup(html, 'html.parser')
    # tags = soup.find_all(class_='service_list_song type02 d_song_list', id='tb_list')[1]
    tags = soup.select('#tb_list > #frm > div > table > tbody > tr') # tr 100 개 
    print(len(tags))

    mList = []

    for i in range(1,101):
        try:            
            songName = ((tags[i]).find_all('td')[5]).find('.rank01 a').text
            singer = ((tags[i]).find_all('td')[5]).find('.rank02 a').text
            
            mList.append([i, songName, singer])
        except:
            pass
    driver.close()
    return mList

def saveToFile(filename, mList):
    with open(filename, 'w', encoding='utf-8-sig', newline='') as f:
        writer = csv.writer(f)
        writer.writerows(mList)

driver = openDriver()
mList = searchWebtoon(driver)
saveToFile('melon.csv', mList)
