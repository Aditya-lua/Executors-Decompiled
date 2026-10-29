/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa62344..0xa624f0 (428 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_a62344(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6, char a7, unsigned long a8, long long a9)
{
    unsigned long long v5;  // x0
    unsigned long v6;  // x0
    long long v7;  // x19
    unsigned int v8;  // w21
    unsigned long v9;  // x20
    char v0;  // [bp-0xa8]
    char v1;  // [bp-0xa7]
    char v2;  // [bp-0xa6]
    unsigned long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]

    v4 = &a8;
    v3 = *(long long *)&g_10002b0;
    v5 = sub_a50ac8(a2);
    if ((int)v5 >= 1 && !(v6 = sub_a3f728(), !v6))
    {
        v7 = v6;
        v8 = 1;
        while (1)
        {
            v0 = a7;
            v1 = v8 >> 8;
            v2 = v8;
            if (!sub_a3fe04(v7, a2, 0) || !sub_a3fe10(v7, a8, a9) || !sub_a3fe10(v7, "ggen", 4) || !sub_a3fe10(v7, &v0, 3) || !sub_a3ff7c(v7, &v0, 0) || !sub_9e4db0(&v0, v5, a4) || !sub_9defb0(a3, a4, a6, a5, a0, a1))
            {
LABEL_a62494:
                v9 = 0;
                goto LABEL_a62498;
            }
            if (1 <= (int)sub_9e5528(a3, sub_9e4624()))
                break;
            v8 += 1;
            if (v8 == 0x10000)
                goto LABEL_a62494;
        }
        v9 = 1;
LABEL_a62498:
        sub_a3f73c(v7);
    }
    else
    {
        v9 = 0;
    }
    if (*(long long *)&g_10002b0 == v3)
        return v9;
    ___stack_chk_fail();
}
