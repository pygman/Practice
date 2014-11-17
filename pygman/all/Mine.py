import urllib.request


def bt(url,begin_page,end_page):
    for i in range(begin_page,end_page+1):
        sName='d:/test/'+str(i).zfill(5)+'.html'
        print('正在下载第'+str(i)+'个页面并另存为'+sName)
        m=urllib.request.urlopen(url+str(i)).read()
        with open(sName,'wb') as file:
            file.write(m)
        file.close()
if __name__== "__main__":
    url="http://tieba.baidu.com/p/"
    begin_page=1
    end_page=3
    bt(url,begin_page,end_page)