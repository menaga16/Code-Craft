def merge_the_tools(string, k):
    # your code goes here
    n=len(string)
    for i in range(0, n, k):
        substr=string[i:i+k]
        seen=set()
        result=''
        for char in substr:
            if char not in seen:
                result+=char
                seen.add(char)
        print(result)

if __name__ == '__main__':
    string, k = input(), int(input())
    merge_the_tools(string, k)
