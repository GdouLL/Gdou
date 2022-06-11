import execjs
import multiprocessing
from multiprocessing import Process
def js_from_file(file_name): #打开js文件
    with open(file_name, 'r', encoding='UTF-8') as file:
        result = file.read()
    return result
def jm():
    fp = open('1000.txt', "r")
    # print('fp.read()\n', fp.read())  # 原样读出
    names = fp.read().split("\n")[:-1]  # 之所以写[:-1] 是因为文件最后一行是个空行，读出来的是个字符串
    for i in names:
        context1 = execjs.compile(js_from_file('宁波大学.js'))  # 编译加载js字符串
        result1 = context1.call("encryptAES", i, "qPG2ty0XL7wWQx7V")  # js内容
        result2 = context1.call("_gas", result1, "BnKt2nCHmGFcIDtk", "XXpESi7BMNPEGxD5")
        print(result2)
if __name__ == '__main__':

    test=Process(target=jm)
    test.start()
    test2=Process(target=jm)
    test2.start()