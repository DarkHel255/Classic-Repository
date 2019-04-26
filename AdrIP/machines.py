#-------------------------------------------------------------------------------
# Name:        machines
# Purpose:
#
# Author:      solow
#
# Created:     16/04/2019
# Copyright:   (c) solow 2019
# Licence:     <your licence>
#-------------------------------------------------------------------------------
from math import pow
def nb_machines(a):
    d = 32-a
    e = pow(2,d)
    print("sur ce réseau, vous pouvez avoir", (e-2),"machines")


def decoupe(a):
    blocs= a.split(".")
    return blocs
