#-------------------------------------------------------------------------------
# Name:        AdrIP
# Purpose:     Découpage d'une adresse IP
#
# Author:      solow
#
# Created:     21/03/2019
# Copyright:   (c) solow 2019
# Licence:     <your licence>
#-------------------------------------------------------------------------------
from math import pow
from verif import *
from masque import *
from machines import *
from adresses import *

def main():

    AdresseBrute = input ("Donnez une adresse IP et son masque (sous la forme 'xxx.xxx.xxx.xxx/xx')")

    Adresse = verif(AdresseBrute)

    Masque_deci = masque_deci(AdresseBrute)

    Masque_Binaire = masque_binaire(Masque_deci)

    print(Masque_Binaire)

    nb_machines(Masque_deci)

    AdresseBloc = decoupe(Adresse)

    b = []
    for i in range(len(AdresseBloc)):
        j = adresseBin(AdresseBloc[i])
        b = b+j

    ADR_RSO = adresse_RSO(AdresseBloc, Masque_Binaire, Adresse)

    ADR_BCT = adresse_BCT(AdresseBloc, Masque_Binaire, Adresse)

    print("Adresse (Binaire):",b)

    print("Adresse RSO:",ARD_RSO)

    print("Adresse RSO:",ARD_BCT)

    Adresses_Util()

main()