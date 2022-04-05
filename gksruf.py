shapeTypeA = input()
colorTypeA = input()
aType      = int(input())
shapeTypeB = input()
colorTypeB = input()
bType      = int(input())

def getValue(shape, color, type):
    if   color == "RED"   and shape == "HEART"  : return type * 2
    elif color == "RED"   and shape == "CLOVER" : return 0
    elif color == "GREEN" and shape == "HEART"  : return type - 1
    elif color == "GREEN" and shape == "CLOVER" : return type + 2

aType = getValue(shapeTypeA, colorTypeA, aType)
bType = getValue(shapeTypeB, colorTypeB, bType)

if aType == bType  : print("draw")
elif aType > bType : print("player1 win, player2 lose")
elif aType < bType : print("player1 lose, player2 win")
 
'''
RED HEART *2
RED CLOVER 0
GREEN HEART -1
GREEN CLOVER +2
'''