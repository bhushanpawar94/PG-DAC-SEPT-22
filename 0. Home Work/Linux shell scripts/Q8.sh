
#!/bin/bash
echo "enter number:"
read n
until [ $n -ge 3 ] //greter than 
do
        echo "number is less than 3 :$n"
        (( n++ ))
done
echo "number is geater than 3 please enter smaller number"
