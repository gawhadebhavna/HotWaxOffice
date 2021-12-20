Que 1 -> List all the columns of the Salespeople table.

Query -> SELECT snum,sname,city,comm FROM salespeople;
+------+---------+-----------+------+
| snum | sname   | city      | comm |
+------+---------+-----------+------+
| 1001 | Peel    | London    | 12   |
| 1002 | Serres  | SanJose   | 13   |
| 1003 | AxelRod | New York  | 10   |
| 1004 | Motika  | London    | 11   |
| 1007 | Rifkin  | Barcelona | 15   |
| 1008 | Fran    | London    | 25   |
+------+---------+-----------+------+
6 rows in set (0.00 sec)





**************************************************************************************************************************************





Que 2 -> List all customers with a rating of 100.

Query -> SELECT cname FROM Customers  
         WHERE rating = 100;
+---------+
| cname   |
+---------+
| hoffman |
| Clemens |
| Pereira |
+---------+
3 rows in set (0.00 sec)





**************************************************************************************************************************************






Que 3 -> Find the largest order taken by each salesperson on each date.

Query -> mysql> SELECT snum ,odate,MAX(AMT) AS Max_Amount 
         FROM Orders GROUP BY ODATE,SNUM;
+------+------------+------------+
| snum | odate      | Max_Amount |
+------+------------+------------+
| 1001 | 1990-03-10 |     767.19 |
| 1002 | 1990-03-10 |    5160.45 |
| 1004 | 1990-03-10 |     1900.1 |
| 1007 | 1990-03-10 |    1098.16 |
| 1002 | 1990-04-10 |      75.75 |
| 1003 | 1990-04-10 |    1713.23 |
| 1001 | 1990-05-10 |       4723 |
| 1001 | 1990-06-10 |    9891.88 |
| 1002 | 1990-06-10 |    1309.95 |
+------+------------+------------+
9 rows in set (0.00 sec)





**************************************************************************************************************************************





Que 4 ->  Arrange the Order table by descending customer number. 

Query ->  SELECT onum, amt, odate, cnum,snum  
          FROM Orders ORDER  BY cnum DESC;
+------+---------+------------+------+------+
| onum | amt     | odate      | cnum | snum |
+------+---------+------------+------+------+
| 3001 |   18.69 | 1990-03-10 | 2008 | 1007 |
| 3006 | 1098.16 | 1990-03-10 | 2008 | 1007 |
| 3002 |  1900.1 | 1990-03-10 | 2007 | 1004 |
| 3008 |    4723 | 1990-05-10 | 2006 | 1001 |
| 3011 | 9891.88 | 1990-06-10 | 2006 | 1001 |
| 3007 |   75.75 | 1990-04-10 | 2004 | 1002 |
| 3010 | 1309.95 | 1990-06-10 | 2004 | 1002 |
| 3005 | 5160.45 | 1990-03-10 | 2003 | 1002 |
| 3009 | 1713.23 | 1990-04-10 | 2002 | 1003 |
| 3003 |  767.19 | 1990-03-10 | 2001 | 1001 |
+------+---------+------------+------+------+
10 rows in set (0.00 sec)





**************************************************************************************************************************************






Que 5 ->  Find which salespeople currently have orders in the order table. 

Query ->   SELECT DISTINCT sname  
           FROM salespeople 
           INNER  JOIN Orders ON salespeople.snum = Orders.snum;
+---------+
| sname   |
+---------+
| Peel    |
| Serres  |
| AxelRod |
| Motika  |
| Rifkin  |
+---------+
5 rows in set (0.00 sec)






**************************************************************************************************************************************



Que 6 -> List names of all customers matched with the salespeople serving them. 

Query -> SELECT cust.cnum,cname  
      -> FROM Customers cust 
      -> INNER JOIN salespeople sale ON cust.snum=sale.snum;
+------+----------+
| cnum | cname    |
+------+----------+
| 2001 | hoffman  |
| 2002 | Giovanni |
| 2003 | Liu      |
| 2004 | Grass    |
| 2006 | Clemens  |
| 2007 | Pereira  |
| 2008 | Cisneros |
+------+----------+
7 rows in set (0.00 sec)




**************************************************************************************************************************************





Que 7 ->  Find the names and numbers of all salespeople who have more than one customer. 

Query ->   
         -> SELECT S.snum, S.sname, COUNT(C.snum) AS count  
         -> FROM salespeople S   
         -> INNER JOIN Customers C ON S.snum = C.snum GROUP BY C.snum;
+------+---------+-------+
| snum | sname   | count |
+------+---------+-------+
| 1001 | Peel    |     2 |
| 1002 | Serres  |     2 |
| 1003 | AxelRod |     1 |
| 1004 | Motika  |     1 |
| 1007 | Rifkin  |     1 |
+------+---------+-------+
5 rows in set (0.00 sec)




**************************************************************************************************************************************





Que 8 -> Count the orders of each of the salespeople and output the results in descending order.

Query -> SELECT DISTINCT  C.SNUM,S.SNAME,COUNT(*) AS Order_Count 
      -> FROM Orders O,Customers C,salespeople S 
      -> WHERE S.snum=C.snum AND O.cnum=C.cnum GROUP BY snum ORDER BY COUNT(onum) DESC;
+------+---------+-------------+
| SNUM | SNAME   | Order_Count |
+------+---------+-------------+
| 1001 | Peel    |           3 |
| 1002 | Serres  |           3 |
| 1007 | Rifkin  |           2 |
| 1003 | AxelRod |           1 |
| 1004 | Motika  |           1 |
+------+---------+-------------+
5 rows in set (0.00 sec)




**************************************************************************************************************************************




Que 9 -> List the customer table if and only if one or more of the customers in the Customer table are located in SanJose.

Query -> SELECT cnum,cname,city,rating,snum
      -> FROM Customers 
      -> WHERE city = 'SanJose' ;
    
+------+----------+---------+--------+------+
| cnum | cname    | city    | rating | snum |
+------+----------+---------+--------+------+
| 2003 | Liu      | SanJose |    200 | 1002 |
| 2008 | Cisneros | SanJose |    300 | 1007 |
+------+----------+---------+--------+------+




**************************************************************************************************************************************





Que 10 -> Match salespeople to customers according to what city they live in.

Query  -> SELECT S.sname,C.cname,S.city 
       -> FROM salespeople S,Customers C 
       -> WHERE S.city=C.city;
+--------+----------+---------+
| sname  | cname    | city    |
+--------+----------+---------+
| Peel   | hoffman  | London  |
| Motika | hoffman  | London  |
| Fran   | hoffman  | London  |
| Serres | Liu      | SanJose |
| Peel   | Clemens  | London  |
| Motika | Clemens  | London  |
| Fran   | Clemens  | London  |
| Serres | Cisneros | SanJose |
+--------+----------+---------+
8 rows in set (0.01 sec)




**************************************************************************************************************************************




Que 11-> Find all the customers in SanJose who have a rating above 200.

Query -> SELECT cnum,cname,city,rating
      -> FROM Customers
      -> WHERE city='SanJose' AND rating > 200;
+------+----------+---------+--------+
| cnum | cname    | city    | rating |
+------+----------+---------+--------+
| 2008 | Cisneros | SanJose |    300 |
+------+----------+---------+--------+
1 row in set (0.00 sec)


**************************************************************************************************************************************



Que 12 -> List the names and commissions of all salespeople in London.

Query  -> SELECT sname,comm 
       -> FROM salespeople 
       -> WHERE city ='London';
+--------+------+
| sname  | comm |
+--------+------+
| Peel   | 12   |
| Motika | 11   |
| Fran   | 25   |
+--------+------+
3 rows in set (0.00 sec)



**************************************************************************************************************************************



Que 13 -> List all the orders of Salesperson Motika from the orders table.

Query  -> SELECT O.onum,amt,odate
       -> FROM Orders O
       -> WHERE O.snum IN (SELECT S.snum
       ->                  FROM salespeople S
       ->                  WHERE S.sname = 'Motika');
+------+--------+------------+
| onum | amt    | odate      |
+------+--------+------------+
| 3002 | 1900.1 | 1990-03-10 |
+------+--------+------------+
1 row in set (0.00 sec)

 
**************************************************************************************************************************************
 
       

Que 14  -> Find all customers who booked orders on October 3.

Query  -> SELECT C.cnum,C.name,C.rating
       -> FROM Customers C
       -> INNER JOIN Orders O ON C.cnum=O.cnum 
       -> WHERE O.odate = '1990-03-10';

+------+----------+--------+
| cnum | cname    | rating |
+------+----------+--------+
| 2008 | Cisneros |    300 |
| 2007 | Pereira  |    100 |
| 2001 | hoffman  |    100 |
| 2003 | Liu      |    200 |
| 2008 | Cisneros |    300 |
+------+----------+--------+
5 rows in set (0.00 sec)


**************************************************************************************************************************************




Que 15  ->  Give the sums of the amounts from the Orders table, grouped by date, eliminating all those dates where the SUM was not at    least 2000 above  the maximum Amount.

Query  ->SELECT odate,SUM(amt) AS total_amt 
       ->FROM Orders  
       ->GROUP BY odate;
+------------+-----------+
| odate      | total_amt |
+------------+-----------+
| 1990-03-10 |   8944.59 |
| 1990-04-10 |   1788.98 |
| 1990-05-10 |      4723 |
| 1990-06-10 |  11201.83 |
+------------+-----------+
4 rows in set (0.00 sec)



**************************************************************************************************************************************



Que 16 -> Select all orders that had amounts that were greater than at least one of the orders from October 6.

Query   -> SELECT onum,amt,odate 
        -> FROM Orders 
        -> WHERE amt > (SELECT MIN(amt)
        ->              FROM Orders
        ->              WHERE odate ='1990-06-10');
+------+---------+------------+
| onum | amt     | odate      |
+------+---------+------------+
| 3002 |  1900.1 | 1990-03-10 |
| 3005 | 5160.45 | 1990-03-10 |
| 3008 |    4723 | 1990-05-10 |
| 3009 | 1713.23 | 1990-04-10 |
| 3011 | 9891.88 | 1990-06-10 |
+------+---------+------------+
5 rows in set (0.00 sec)

**************************************************************************************************************************************



Que 17 ->  Write a query that uses the EXISTS operator to extract all salespeople who have customers with a rating of 300.

Query  ->   SELECT S.snum,S.sname,S.city 
       ->   FROM salespeople S 
       ->   WHERE EXISTS( SELECT C.snum                
                          FROM Customers C               
                          WHERE C.snum=S.snum AND  C.rating = 300
                        );
+------+--------+-----------+
| snum | sname  | city      |
+------+--------+-----------+
| 1002 | Serres | SanJose   |
| 1007 | Rifkin | Barcelona |
+------+--------+-----------+
2 rows in set (0.01 sec)


**************************************************************************************************************************************



Que 18  ->  Find all customers whose cnum is 1000 above the snum of Serres.

Query   -> SELECT C.CNUM,C.CNAME 
        -> FROM Customers C,Salespeople S 
        -> WHERE S.SNUM=C.SNUM and C.CNUM>S.SNUM+1000;
+------+---------+
| CNUM | CNAME   |
+------+---------+
| 2003 | Liu     |
| 2004 | Grass   |
| 2005 | Clemens |
| 2007 | Pereira |
+------+---------+



**************************************************************************************************************************************



Que 19  -> Give the salespeople’s commissions as percentages instead of decimal numbers.

Query   -> SELECT sname,comm*100 AS COMM 
        -> FROM Salespeople.
        
+---------+------+
| SNAME   | COMM |
+---------+------+
| Peel    | 1200 |
| Serres  | 1300 |
| AxelRod | 1000 |
| Motika  | 1100 |
| Rifkin  | 1500 |
| Fran    | 2500 |
+---------+------+
6 rows in set (0.00 sec)
 
**************************************************************************************************************************************
 
 
 
Que 20 -> Find the largest order taken by each salesperson on each date, eliminating those Maximum orders, which are less than 3000.

Query  -> SELECT onum,odate,MAX(amt) 
       -> FROM Orders 
       -> GROUP BY onum HAVING MAX(amt)>3000;
+------+------------+----------+
| onum | odate      | MAX(amt) |
+------+------------+----------+
| 3005 | 1990-03-10 |  5160.45 |
| 3008 | 1990-05-10 |     4723 |
| 3011 | 1990-06-10 |  9891.88 |
+------+------------+----------+
3 rows in set (0.00 sec)  




**************************************************************************************************************************************
      


Que 21 ->  List all the largest orders for October 3, for each salesperson.

Query  -> SELECT  MAX(amt) AS total_amount 
       -> FROM Orders O,salespeople S 
       -> WHERE O.snum = S.snum AND odate='1990-03-10';
+--------------+
| total_amount |
+--------------+
|      5160.45 |
+--------------+
1 row in set (0.00 sec)



**************************************************************************************************************************************




Que 22 ->  Find all customers located in cities where Serres has customers.

Query  -> SELECT C.cnum,C.cname,C.city 
       -> FROM Customers C
       -> INNER JOIN salespeople S ON S.snum=C.snum
       -> WHERE S.sname='Serres';
+------+-------+---------+
| cnum | cname | city    |
+------+-------+---------+
| 2003 | Liu   | SanJose |
| 2004 | Grass | Berlin  |
+------+-------+---------+
2 rows in set (0.00 sec)



**************************************************************************************************************************************




Que 23 -> Select all customers with a rating above 200

Query  -> SELECT cnum,cname,city,rating 
       -> FROM Customers 
       -> WHERE rating > 200;
+------+----------+---------+--------+
| cnum | cname    | city    | rating |
+------+----------+---------+--------+
| 2004 | Grass    | Berlin  |    300 |
| 2008 | Cisneros | SanJose |    300 |
+------+----------+---------+--------+
2 rows in set (0.00 sec)





**************************************************************************************************************************************





Que 24 -> Count the number of salespeople currently having orders in the orders table.

Query  ->SELECT S.sname,COUNT(O.snum) AS total_order 
       ->FROM salespeople S INNER JOIN Orders O ON O.snum=S.snum 
       ->GROUP BY S.sname ;
+---------+---------------+
| sname   | total_order   |
+---------+---------------+
| AxelRod |             1 |
| Motika  |             1 |
| Peel    |             3 |
| Rifkin  |             2 |
| Serres  |             3 |
+---------+---------------+
5 rows in set (0.00 sec)





**************************************************************************************************************************************



Que 25 -> Write a query that produces all customers serviced by salespeople with a commission above 12%. Output the customer’s name,salesperson’s name and the salesperson’s rate of commission.

Query  ->






**************************************************************************************************************************************

Que 26 ->






**************************************************************************************************************************************

Que 27 ->













**************************************************************************************************************************************


Que 28 ->






**************************************************************************************************************************************

Que 29 ->







**************************************************************************************************************************************
Que 30 ->



**************************************************************************************************************************************

