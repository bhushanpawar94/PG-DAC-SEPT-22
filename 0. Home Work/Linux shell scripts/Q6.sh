#!/bin/bash
n1=1
for a in {1..4}
do
        n1=`expr $n1 \* $a`
		echo $n1
done