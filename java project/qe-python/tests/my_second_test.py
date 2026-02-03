import math
num1=5
num2=5

def sum(num1,num2):
    return num1+num2
def test_sum():
    assert sum(num1,num2)==10

def sub(num1,num2):
    return num1-num2
def test_sub():
    assert sub(5,5)==0

def mul(num1,num2):
    return num1*num2
def test_mul():
    assert mul(5,5)==25

def div(num1,num2):
    return num1/num2
def test_div():
    assert div(5,5)==1

