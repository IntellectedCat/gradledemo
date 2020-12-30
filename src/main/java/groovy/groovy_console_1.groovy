package groovy

//groovy 高校特性
//1 可选的类型定义
def version = 1

//2 assert
//assert version == 2

//3 括号是可选的
//println version

//4 字符串
// 单引号即单纯的字符串
def s1 = 'imooc'
// 双引号可以插入值
def s2 = "gradle version is ${version}"
// 三引号可以换行
def s3 = '''my
name is
imooc'''

//println(s1)
//println(s2)
//println(s3)


// 集合API
// list
def buildTools=['ant', 'maven']
buildTools << 'gradle'
assert buildTools.getClass() == ArrayList
assert buildTools.size() == 3

// map
def buildYears = ['ant':2000, 'maven':2004]
buildYears.gradle = 2009

println(buildYears.ant)
println(buildYears['gradle'])
println(buildYears.getClass())

//6 闭包
def c1 = {
    v ->
        println v
}

def c2 = {
    println('hello')
}

def method1(Closure closure) {
    closure('param')
}

def method2(Closure closure) {
    closure()
}


method1(c1);
method2 {
    c1 '123'
};