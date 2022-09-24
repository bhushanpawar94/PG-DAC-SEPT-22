#!/bin/bash
echo "Enter input:-"
read n
for a in {1..10}
do
        res=`expr $n \* $a`
        res1=`expr $res % 2`
        if [ $res1 -eq  0 ];
        then
                echo $res "even"
        else
                echo $res "odd"
        fi

done