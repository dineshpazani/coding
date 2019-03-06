#Parantheses validations

def checkParanth(str):
    if len(str)%2 != 0:
        return False


    opening = set('([{')

    matches = set([('(',')'), ('[',']'), ('{','}')])

    stack = []

    for s in str:
        if s in opening:
            stack.append(s)
        else:
            if len(stack) == 0:
                return False

            last_opne = stack.pop()

            if (last_opne, s) not in matches:
                return False

    return len(stack) == 0

print(checkParanth('[()]{()}'))
