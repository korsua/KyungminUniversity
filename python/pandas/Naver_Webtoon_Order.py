# 네이버 웹튭 순위를 크랩핑하여 csv 파일에 저장하기
# https://cflab2017.tistory.com/76

# Chrome Driver 실핼
from selenium import webdriver
from bs4 import BeautifulSoup
import time
import csv

# Chrome Driver를 여는 함수
def openDriver():
    url = 'https://comic.naver.com/webtoon/weekday.nhn'
    driver = webdriver.Chrome()
    driver.implicitly_wait(3)
    driver.get(url)
    time.sleep(2)
    return driver

# 웹튠 슌위를 검색하는 함수
def searchWebtoon(driver):
    html = driver.page_source
    soup = BeautifulSoup(html, 'html.parser')
    tags = soup.find_all(class_='asideBoxRank', id="realTimeRankFavorite")[0]

    mList = []

    for i in range(1,11):
        try:            
            searTag = f'rank{i:02d}'     
            title = tags.find_all(class_=searTag).a.text
            print(f'순위 : {i}\n제목 : {title[0]}\n')
            mList.append([i, title])
        except:
            pass

    driver.close()
    return mList

# 웹튭 순위 리스트를 csv 파일에 저장하는 함수
def saveToFile(filename, mList):
    with open(filename, 'w', encoding='utf-8-sig', newline='') as f:
        writer = csv.writer(f)
        writer.writerows(mList)

driver = openDriver()
mList = searchWebtoon(driver)
saveToFile('webtoon.csv', mList)