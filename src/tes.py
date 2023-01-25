# inisialisasi angka
numstr = input("input number: ")
numarr = numstr.split()

# inisialisasi operator
opr = ['+', '-', '*', '/']

# hitung ekspresi
def calc(ope1, ope2, opr):
    if (opr == '+'):
        return float(ope1)+float(ope2)
    if (opr == '-'):
        return float(ope1)-float(ope2)
    if (opr == '*'):
        return float(ope1)*float(ope2)
    if (opr == '/'):
        if (float(ope2) != 0):
            return float(ope1)/float(ope2)
        else:
            return 0

# form 1
def form1(numarr, oprarr):
    a = calc(numarr[0], numarr[1], oprarr[0])
    b = calc(a, numarr[2], oprarr[1])
    res = calc(b, numarr[3], oprarr[2])
    return res
# form 2
def form2(numarr, oprarr):
    a = calc(numarr[1], numarr[2], oprarr[1])
    b = calc(numarr[0], a, oprarr[0])
    res = calc(b, numarr[3], oprarr[2])
    return res
# group 3
def form3(numarr, oprarr):
    a = calc(numarr[1], numarr[2], oprarr[1])
    b = calc(a, numarr[3], oprarr[2])
    res = calc(numarr[0], b, oprarr[0])
    return res
# group 4
def form4(numarr, oprarr):
    a = calc(numarr[2], numarr[3], oprarr[2])
    b = calc(numarr[1], a, oprarr[1])
    res = calc(numarr[0], b, oprarr[0])
    return res
# group 5
def form5(numarr, oprarr):
    a = calc(numarr[0], numarr[1], oprarr[0])
    b = calc(numarr[2], numarr[3], oprarr[2])
    res = calc(a, b, oprarr[1])
    return res

# print list
def toString(List):
    return ''.join(List)

# permutasi angka
def permute(numarr, l, r, oprarr):
    if l == r:
        curcount = 0
        for i in range(len(oprarr)):
            for j in range(len(oprarr)):
                for k in range(len(oprarr)):
                    curopr = [oprarr[i], oprarr[j], oprarr[k]]
                    res1 = form1(numarr, curopr)
                    if (res1 == 24):
                        print(f"(({numarr[0]}{curopr[0]}{numarr[1]}){curopr[1]}{numarr[2]}){curopr[2]}{numarr[3]}")
                        curcount += 1
                    res2 = form2(numarr, curopr)
                    if (res2 == 24):
                        print(f"({numarr[0]}{curopr[0]}({numarr[1]}{curopr[1]}{numarr[2]})){curopr[2]}{numarr[3]}")
                        curcount += 1
                    res3 = form3(numarr, curopr)
                    if (res3 == 24):
                        print(f"{numarr[0]}{curopr[0]}(({numarr[1]}{curopr[1]}{numarr[2]}){curopr[2]}{numarr[3]})")
                        curcount += 1
                    res4 = form4(numarr, curopr)
                    if (res4 == 24):
                        print(f"{numarr[0]}{curopr[0]}({numarr[1]}{curopr[1]}({numarr[2]}{curopr[2]}{numarr[3]}))")
                        curcount += 1
                    res5 = form5(numarr, curopr)
                    if (res5 == 24):
                        print(f"({numarr[0]}{curopr[0]}{numarr[1]}){curopr[1]}({numarr[2]}{curopr[2]}{numarr[3]})")
                        curcount += 1
    else:
        for i in range(l, r):
            numarr[l], numarr[i] = numarr[i], numarr[l]
            permute(numarr, l+1, r, oprarr)
            numarr[l], numarr[i] = numarr[i], numarr[l]

permute(numarr, 0, 4, opr)