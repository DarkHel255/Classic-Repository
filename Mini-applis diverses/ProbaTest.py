#-------------------------------------------------------------------------------
# Name:        ProbaTest
# Purpose:
#
# Author:      solow
#
# Created:     07/03/2019
# Copyright:   (c) solow 2019
# Licence:     <your licence>
#-------------------------------------------------------------------------------
from random import *

def lancer():
    dé = randint(1,6)
    return dé

def ExperienceInitiale(X):
    i = 0
    total = 0
    résultat = [0]*(X)
    for i in range (X):
        résultat[i] = lancer()
        total = total + résultat[i]
    print (résultat)
    print ("total = ",total)
    return total

def ExperienceAleatoire(K):

    effectif = [0]*K
    for i in range (K):

        effectif[i] = ExperienceInitiale(lancer())

    print ("effectif total : ", effectif)
    return effectif

def ValEffectif(K, J):
    D = 0
    valeffect = [0]*37
    I = K
    for i in range (J):
        D = I[i]
        valeffect[D] = valeffect[D]+1
    print("Effectif par valeur : ", valeffect)
    return valeffect

def Frequence(K, J):

    freq = 0
    A = K
    i = 1
    for i in range (1, len(A)):

        freq = (A[i])/J
        print("fréquence d'occurence de ",i," : ", freq*100,"%")
    return freq



A = lancer()
print("lancer initial : ", A)
B = int(input("Combien de fois voulez-vous tenter l'éxperience ?"))

C = ExperienceAleatoire(B)

D = ValEffectif(C, B)

Frequence(D, B)
