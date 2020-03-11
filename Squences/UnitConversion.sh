# /bin/bash -x
printf  "enter 1 for feet to inch conversion / enter 2 for inch to feet conversion / enter 3 for feet to meter conversion and finding area "
read number
if(( $number == 1  ))
then
echo "enter the a value in feet"
read  feetNum
inch=$(echo "scale=2;$feetNum*12"|bc)
echo "$feetNum feet=$inch inch"
elif(( $number == 2 ))
then
echo "enter inch value"
read inchNum
feet=$(echo "scale=2;$inchNum/12"|bc)
echo "$inchNum inch=$feet feet"
elif (( $number == 3 ))
then
echo "length  and breadth in feet"
read  l b
length=$(echo "scale=2;$l*0.3048"|bc)
breadth=$(echo "scale=2;$b*0.3048"|bc)
area=$(echo "scale=2;$length*$breadth"|bc)
totalareainsqrmeters=$(echo "scale=2;$area*25"|bc)
totalacres=$(echo "scale=2;$totalareainsqrmeters/4046.86"\bc)
echo "area = $area sqauremeters"
echo "total 25 plots area =$totalacers acers"
else
echo "select correct option"
fi
