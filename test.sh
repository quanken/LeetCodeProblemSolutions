#!/usr/bin/env bash

usage(){
    echo
    echo "./test.sh problemNo"
    echo "  problem number should be greater than 1"
    echo
    echo "e.g: ./test.sh 1"
    echo
}

problem_number=$1
# 如果是数字,那么返回的是数字本身,如果是字符串,那么返回的是0,刚好输入为0,也视为非法参数
is_number=`echo $problem_number | bc 2>/dev/null`

if [ -z $problem_number ] || [ $is_number -le 0 ]; then
    usage
    exit
elif [ ! -e "src/test/java/com/quanken/leetcode/problem$problem_number/Tester.java" ]; then
    echo "Test Case not exist!"
else
    testcase="com.quanken.leetcode.problem$problem_number.Tester"
    echo "Running TestCase: $testcase"
    gradle test --tests $testcase
fi

