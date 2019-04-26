#-------------------------------------------------------------------------------
# Name:        masque
# Purpose:
#
# Author:      solow
#
# Created:     16/04/2019
# Copyright:   (c) solow 2019
# Licence:     <your licence>
#-------------------------------------------------------------------------------
def masque_deci(a):

    m = ""
    for i in range ((a.find("/")+1), len(a)):
        m = m + a[i]
    int_m = int(m)
    return int_m

def masque_binaire(a):

    int_a = int(a)
    b = [0]*32

    for i in range (int_a):
        b[i] = 1
    return b
