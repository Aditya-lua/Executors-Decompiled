/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaba458..0xaba5a8 (336 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_aba458(unsigned long a0, unsigned long a1, char *a2, long long a3, long long a4)
{
    unsigned int v2;  // w8
    unsigned long long v3;  // x8
    unsigned long v4;  // x9
    char *v5;  // x1
    unsigned int v6;  // w10
    unsigned long long v7;  // x19
    unsigned int v8;  // x1
    long long v9;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a4 != a3 || (v2 = *a2, (v2 >> 1 & 127) != 53))
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_x931.c", 87, "RSA_padding_check_X931");
        v9 = 137;
    }
    else if (v2 != 107)
    {
        v5 = a2 + 1;
        v7 = a4 - 2;
        goto LABEL_aba508;
    }
    else if (a4 >= 4)
    {
        v3 = 0;
        v4 = a4 - 3;
        v5 = &a2[a4] - 2;
        while (1)
        {
            v6 = a2[1 + v3];
            if (v6 != 0xbb)
                break;
            v3 += 1;
            if ((unsigned int)v4 == (unsigned int)v3)
            {
                v7 = 0;
                goto LABEL_aba508;
            }
        }
        if (v6 != 186)
        {
            sub_a368c8();
            v8 = 98;
            goto LABEL_aba598;
        }
        if (!(unsigned int)v3)
            goto LABEL_aba564;
        v7 = v4 - v3;
        v5 = &a2[v3 + 2];
LABEL_aba508:
        if (v5[(unsigned int)v7] == 0xcc)
        {
            _memcpy();
            return v7;
        }
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_x931.c", 115, "RSA_padding_check_X931");
        v9 = 139;
    }
    else
    {
LABEL_aba564:
        sub_a368c8();
        v8 = 106;
LABEL_aba598:
        sub_a369bc("crypto/rsa/rsa_x931.c", v8, "RSA_padding_check_X931");
        v9 = 138;
    }
    sub_a36abc(4, v9, 0);
    return 0xffffffff;
}
