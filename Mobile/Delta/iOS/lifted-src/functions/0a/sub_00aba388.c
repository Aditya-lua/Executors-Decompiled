/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaba388..0xaba458 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_aba388(char *iter, unsigned int a1, long long a2, unsigned int a3)
{
    long long v2;  // w8
    char v3;  // x8
    unsigned long n;  // x21
    char *v5;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1 - a3;
    if (1 >= v2)
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_x931.c", 56, "RSA_padding_add_X931");
        sub_a36abc(4, 110, 0);
        return -0x1;
    }
    if (v2 == 2)
    {
        v3 = 106;
    }
    else
    {
        *iter = 107;
        iter += 1;
        if (v2 >= 4)
        {
            n = v2 - 3;
            _memset(iter, 0xbb, n);
            iter = &iter[n];
        }
        v3 = 186;
    }
    *iter = v3;
    v5 = iter + 1;
    _memcpy(v5, a2, a3);
    v5[a3] = 0xcc;
    return 1;
}
