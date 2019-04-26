#-------------------------------------------------------------------------------
# Name:        Verif
# Purpose:
#
# Author:      solow
#
# Created:     16/04/2019
# Copyright:   (c) solow 2019
# Licence:     <your licence>
#-------------------------------------------------------------------------------
def verif(a):

    b = a.find("/")
    c = int(a[b+1])
    d = int(a[b+2])
    m = ""
    z = ""
    if (c == 3):
        if (d > 0):
            print("Masque décimal invalide")
            a = input ("Donnez une adresse IP et son masque (sous la forme 'xxx.xxx.xxx.xxx/xx')")
            verif(a)

    acopy = a
    s = a.find(".")
    e = ""
    for i in range (s):
        e = e+acopy[i]

    int_e = int(e)
    if (int_e > 255 or int_e < 0):
        print("Adresse IP invalide")
        a = input ("Donnez une adresse IP et son masque (sous la forme 'xxx.xxx.xxx.xxx/xx')")
        verif(a)
    else:
        for i in range (s+1):
            acopy.replace(acopy[i],'0')

    s = acopy.find(".")
    f = ""
    for i in range (s):
        f = f+acopy[i]

    int_f = int(f)
    if (int_f > 255 or int_f < 0):
        print("Adresse IP invalide")
        a = input ("Donnez une adresse IP et son masque (sous la forme 'xxx.xxx.xxx.xxx/xx')")
        verif(a)
    else:
        for i in range (s+1):
            acopy.replace(acopy[i],'0')

    s = acopy.find(".")
    g = ""
    for i in range (s):
        g = g+acopy[i]

    int_g = int(g)
    if (int_e > 255 or int_e < 0):
        print("Adresse IP invalide")
        a = input ("Donnez une adresse IP et son masque (sous la forme 'xxx.xxx.xxx.xxx/xx')")
        verif(a)
    else:
        for i in range (s+1):
            acopy.replace(acopy[i],'0')

    s = acopy.find(".")
    h = ""
    for i in range (s):
        h = h+acopy[i]

    int_h = int(h)
    if (int_h > 255 or int_h < 0):
        print("Adresse IP invalide")
        a = input ("Donnez une adresse IP et son masque (sous la forme 'xxx.xxx.xxx.xxx/xx')")
        verif(a)
    else:
        for i in range (s+1):
           acopy.replace(acopy[i],'0')


    for i in range (b):
        z = z + a[i]

    for i in range (b+1, len(a)):
        m = m + a[i]

    print("Adresse IP valide")
    print("Adresse IP:",z)
    print("Masque:",m)
    return z
