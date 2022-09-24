#!/bin/bash
echo "enter number for factorial:-"
read n
n1=1
for (( i=1;i<=n;i++ ));
do
        n1=`expr $n1 \* $i`

done
echo "factorial= $n1"