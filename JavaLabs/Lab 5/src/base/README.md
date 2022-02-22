# Lab 5: Drying Code
Nicholas Suchy

[Markdown Guide](https://www.markdownguide.org/)

## Choosing an Overall Design
---
When I first started the lab, I thought of several possible ideas on how to dry the code. Firstly, I had thought about using employee input, so that the employee would input the required variables into the system, the system would do it's thing, then would loop back to be ready for the next transaction until closing time. But looking back on notes I wasn't sure exactly how input in Java worked. So I changed my line of thinking and thought to put everything into a list, and then loop through the list, pull out the needed variables, and perform the needed calculations in order to print out a summary of the transactions within the list.

## Variables
---
Before creating the list, I looked at the all the variables used in the `wet_inventory()` function and realized a couple things.

- New variables could be made to prevent single numbers from floating around
- The amount of cash spent in each transaction could be found using simple math
- I didn't need to add variables that could be calculated to the list

I created 4 new variables, two of which `pretzels_multiplier` and `lemonade_multiplier`, the prices for one pretzels and lemonade, are constants which will be used to help find the cost of the transcation. I added the other two new variables, `pretzels_brought` and `lemonades_brought`, along with the existing variable, `tips`, to `customer_list()`, the list which holds a customer transaction data.

## Creating the List
---
I manually went through the `wet_inventory()` and, for each customer, added the number of pretzels brought, the number of lemonades brought, and the tips earned. If a customer didn't leave a tip or didn't buy a lemonade or a pretzel, a 0 was put into the list to help keep structure and help wth calculations later on. In the list every three items represented **one** customer's transaction with the items representing the number of pretzels brought, the number of lemonades brought, and the tip they left behind in that order.

## Creating the Loop
---
Since every three items where related to one customer, the loop needed to recognize these groups within the list. I came up with the loop: 

`for(int x = 0; x < 45; x = x + 3)`

 This loop starts at the first item in the list and goes through all 45 items in the list, counting by 3. This effectively breaks the list into 15 customers for the loop to go through and within the list.

## Calculations
---
I needed to report 4 things in the printed summary for the end of the day:

  1. The amount of pretzels left in the inventory
  2. The amount of lemonades left in the inventory
  3. The total cash at the end of the day
  4. The total tips given that day

Each of these were calculated every time the program ran through the loop. 1, 2, and 4 simply either added or subtracted the data from the list that correspondedto their variable. Finding the cash, 3, took a couple more steps. I kept track of the number of pretzels and lemonades brought by each customer then multiplied them by their respective prices held in `pretzels_multiplier` and `lemonade_multiplier` which gave me the overall cost for each individual customer. I then added the cash we earned from one customer to the total cash the stand had.

## Printing the Summary
---
When it came to printing the summary, I created one big print statement, to avoid having to repeatedly type `System.out.println`.