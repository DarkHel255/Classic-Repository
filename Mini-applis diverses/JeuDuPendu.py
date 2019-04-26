#-------------------------------------------------------------------------------
# Name:        Jeu du pendu
# Purpose:
#
# Author:      solow
#
# Created:     14/03/2019
# Copyright:   (c) solow 2019
# Licence:     <your licence>
#-------------------------------------------------------------------------------
from random import *

def default():
    motsdéfaut = ['CASPIAN','NOBLE','APOCALYPSE','WAGON','XYLOPHONE','PRIMARQUE','DETACHEMENT','BALTIQUE','LOCOMOTIVE','VOLCANIQUE']
    defaultchosen = motsdéfaut[randint(0,9)]
    return defaultchosen

def index(my_list, s):
    start = 0
    while True:
        try:
            index = my_list.index(s, start)
            start = index+1
            return index
        except ValueError:
            break


LettresAuto = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
Mot = default()
TabJoueur = ['_']*(len(Mot))
Compte = 0
i = []
Lettre = 'a'
j = len(Mot)
Win = 0
while ((Compte < 6) or (Win < j)):

    print(len(Mot))
    print(TabJoueur)
    Lettre = input("Donnez une lettre de l'alphabet en majuscule: ")
    if (Mot.find(Lettre) == -1):
        Compte = Compte + 1
        print(Compte)
        Lettre = input("Donnez une lettre de l'alphabet en majuscule: ")
    else:
        i = index(Mot, Lettre)
        print(i)
        TabJoueur[i] = Lettre
        print(TabJoueur)
        Win = Win + 1
        print(Win)
        Lettre = input("Donnez une lettre de l'alphabet en majuscule: ")

if (Win == j):
    print ("GG !")
elif (Compte == 6):
    Print ("Take the L !")



