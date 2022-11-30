# 멜론 사이트에 Top 100 음원의 타이틀과 가수 이름을 가져오는 웹크롤링 프로그램
# 크롬 드라이버 실행
from selenium import webdriver
options = webdriver.ChromeOptions()
options.add_experimental_option("excludeSwitches", ["enable-logging"])
browser = webdriver.Chrome('./chromedriver.exe', options=options)

# 멜론 인기차트 웹페이지 접속하기
url = 'http://www.melon.com/chart/index.htm'
browser.get(url)


# HTML 다운로드 및 BeautifulSoup으로 읽기
from bs4 import BeautifulSoup
html = browser.page_source
soup = BeautifulSoup(html, 'html.parser')


# 100개의 노래 태그 찾기
songs = soup.select('tr')  
print(len(songs))
print(songs[0])


# 100개의 곡을 찾고 싶으나, 101개의 태그 뭉치가 검색됨    len(songs)  -->  101 
# 101개 중 첫 번째 태그 뭉치(songs[0]) 을 살펴보니 표에서 컬럼제목(곡정보/앨범/좋아요... )을 나타내고 있음
# 101개 중 첫 번째는 컬럼 제목,   두 번째 부터 끝까지,  남은 100개는 노래 정보 일 것으로 예상됨

songs = soup.select('tr')[1:]     # 첫 번째는 제외하고, 두 번째(인덱스번호 1) 부터 끝까지만 선택
#print(len(songs))                 # 100으로  정리하고 싶은 노래 개수에 맞게 선택됨
#print(songs[0])                   # 그 중 첫 번째 태그를 보니, 1위 곡으로 조회됨



# 멜론 100위 노래순위 정보 가져와서 인쇄하기
for song in songs:                                        
    title = song.select('div.ellipsis.rank01 > span > a')[0].text
    singer = song.select ('div.ellipsis.rank02 > a')[0].text  
    print(title, singer, sep = ' | ')

