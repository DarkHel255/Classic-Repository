#-------------------------------------------------------------------------------
# Name:        adresses
# Purpose:
#
# Author:      solow
#
# Created:     16/04/2019
# Copyright:   (c) solow 2019
# Licence:     <your licence>
#-------------------------------------------------------------------------------
def adresseBin(a):

    b = []
    int_a = int(a)
    for i in range (1,9):
        x = 8-i
        if (int_a%pow(2,x) == 0):
            b.append(0)
        else:
            b.append(1)
            int_a = int_a-(pow(2,x))
    return(b)



def adresse_RSO(a, b, c):

    a







def adresse_BCT(a, b, c):


    a