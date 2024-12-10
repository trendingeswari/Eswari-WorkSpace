/*
Midpint of line

The x,y co-ordinates of the end points of a line are provided as the input. The program must print the
co-ordinates of the mid-point of the line.
Input Format:
The first line denotes the x co-ordinate of point 1.
The second line denotes the y co-ordinate of point 1.
The third line denotes the x co-ordinate of point 2.
The fourth line denotes the y co-ordinate of point 2.
Output Format:
The first line denotes the x co-ordinate of the mid-point rounded upto 1 decimal place.
The second line denotes the y co-ordinate of the mid-point rounded upto 1 decimal place.
Example Input/Output:
Input:
10
2
20
5
Output:
15.0
3.5

*/

//in python

p1x = float(input())
p1y = float(input())
p2x = float(input())
p2y = float(input())
midx = (p1x+p2x)/2
midy = (p1y+p2y)/2
print ("%.1f" %midx)
print ("%.1f" %midy)