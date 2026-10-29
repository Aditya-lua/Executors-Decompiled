/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cb8b8..0x9cba74 (444 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9cb8b8(unsigned long long a0, unsigned long long *a1, unsigned long a2, unsigned int *a3, char a4, long long a5, long long a6, long long a7)
{
    unsigned long v9;  // x8
    unsigned long long v10;  // x0
    unsigned long long v11;  // 4112
    long long v12;  // x19
    long long v13;  // x20
    unsigned long v14;  // x8
    unsigned int v0;  // [bp-0x90]
    char v1;  // [bp-0x8c]
    long long v2;  // [bp-0x88]
    char v3;  // [bp-0x72], Other Possible Types: unsigned long long
    char v4;  // [bp-0x71], Other Possible Types: unsigned long long
    unsigned long v5;  // [bp-0x70]
    char v6;  // [bp-0x68], Other Possible Types: long long, unsigned long long
    char *v7;  // [bp-0x10]
    long long v8;  // [bp+0x0]

    v7 = &v8;
    if (!a0)
        return a0;
    v9 = *a3;
    v5 = *a1;
    if (!(v9 >> 4 & 1))
        return sub_9cc568();
    v2 = a5;
    v1 = a4;
    v0 = (unsigned int)v9 & 192;
    v10 = sub_9cc2f8(&v6, 0, 0, &v4, &v3, &v5);
    v11 = arm64g_calculate_condition(1, v10 & 0xffffffff, 1, 0);
    if (v11 & 1)
        return v10;
    v12 = 524554;
    if (!(unsigned int)v10)
    {
        v13 = 551;
    }
    else if (!v3)
    {
        v12 = 120;
        v13 = 556;
    }
    else if (sub_9cc568(a0, &v5, v6, a3, 0, a5, a6, a7, v8))
    {
        v14 = v5;
        v6 += v5 - v14;
        if (v4)
        {
            if ((long long)v6 >= 2 && !*(char *)v14 && !*(char *)(v14 + 1))
            {
                *a1 = v14 + 2;
                return 1;
            }
            v12 = 137;
            v13 = 571;
        }
        else if (v6)
        {
            v12 = 0x77;
            v13 = 579;
        }
        else
        {
            *a1 = v14;
            return 1;
        }
    }
    else
    {
        v13 = 563;
    }
    sub_a368c8();
    sub_a369bc("crypto/asn1/tasn_dec.c", v13, "asn1_template_ex_d2i");
    sub_a36abc(13, v12, 0);
    return 0;
}
