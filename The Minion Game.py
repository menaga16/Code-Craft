def minion_game(string):
    # your code goes here
    vowels='AEIOU'
    length=len(string)
    stuart_score=0
    kevin_score=0

    for i in range(length):
        if string[i] in vowels:
            kevin_score+=length-i
        else:
            stuart_score+=length-i

    if kevin_score>stuart_score:
        print(f"Kevin {kevin_score}")
        
    elif kevin_score<stuart_score:
        print(f"Stuart {stuart_score}")
        
    else:
        print("Draw")

if __name__ == '__main__':
    s = input()
    minion_game(s)
