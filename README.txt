Author: Danielle DeLooze
Student ID: 29493487
Email: ddelooze@u.rochester.edu
Project: Project 2

Description: This project had us taking in a infix expression, converting it to postfix, and then evaluating it. We did this by making use of stacks and queues. For converting 
infix to postfix, we used the shuntting-yard algorthim. All operands are enqueued to the queue and the operators are stored in the queue and removed when operators of higher 
precedence are pushed into the stack. To evalute  the post fix expression, you push any operands that you are in the queue. When you get to an operator, you pop the first two
values in the stack and perform that operation on them. Eventually you'll be left with just 1 number at the very end. Pop that and you have your answer! I had some issues 
trying to read from the file that was provided. Unfortunately I could not figure out how to seperate without spaces in between, so my input file has spaces between every character 
and then splits it. I've included all of my source code files for my doubly linked list, linked list, stack, and queue. I have 3 java files that are for just this project. One
that converts a string to postfix, another that evaluates this postfix, and a tester file. My output file is a txt file in the zip. I used the run as configuarition button in eclipse
to access the arguments for my program.