#!/bin/bash
echo "Enter input:-"
read n
for a in {1..10}
do
        res=`expr $n /* $a`
        echo $res

done