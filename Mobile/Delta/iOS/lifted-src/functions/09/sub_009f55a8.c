/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f55a8..0x9f56f4 (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_7fffff;

unsigned long long sub_9f55a8(long long a0, unsigned long long a1, long long a2, unsigned long long a3)
{
    unsigned long long v2;  // x22
    unsigned long long v3;  // x0
    unsigned long v11;  // cc_dep1
    unsigned long v12;  // cc_dep2
    unsigned long v13;  // cc_ndep
    unsigned long long v14;  // 4110
    unsigned long long v15;  // 4107
    unsigned long v16;  // cc_op
    unsigned long long v17;  // 4110
    unsigned long long v4;  // w20
    unsigned long long v18;  // 4107
    unsigned long long v19;  // x19
    unsigned long long v5;  // x21
    unsigned long long v6;  // x23
    unsigned long long v7;  // w24
    unsigned long long v8;  // w0
    unsigned int v9;  // w8
    unsigned long long v10;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1;
    v3 = sub_a68564();
    v4 = (unsigned int)v3;
    sub_a36c8c(v3);
    v5 = v2;
    if (v5)
    {
LABEL_9f55e4:
        v6 = sub_9f4e78(a0, 0);
        if (!v6)
        {
LABEL_9f565c:
            v7 = 0;
            if (v2)
                goto LABEL_9f5684;
        }
        else if ((int)sub_9f4f04(v6, v5, 0) > 0)
        {
            v7 = (unsigned int)sub_9f4f8c(v6, a2, a3);
            v4 = (unsigned int)sub_a68564(a0);
            if (v2)
                goto LABEL_9f5684;
        }
        else
        {
            if (!(a3 >> 4 & 1))
                goto LABEL_9f565c;
            v8 = (unsigned int)sub_a36000();
            if (0 <= v8)
                v9 = (unsigned int)&g_7fffff;
            else
                v9 = 0x7fffffff;
            v7 = (v9 & v8) == 114;
            if (v2)
                goto LABEL_9f5684;
        }
    }
    else
    {
        v5 = sub_9f56f4();
        if (v5)
        {
            if (*(char *)v5)
                goto LABEL_9f55e4;
            v6 = 0;
            v7 = 1;
        }
        else
        {
            v7 = 0;
            v6 = 0;
        }
    }
    sub_a6c2e4(v5, "crypto/conf/conf_mod.c", 229);
LABEL_9f5684:
    sub_9f4ef0(v6);
    v10 = a3 & 2;
    if (!v4)
    {
        v14 = arm64g_calculate_condition(v16, v11, v12, v13);
        v15 = arm64g_calculate_condition(4, (v14 & 1 ? v10 : 0x40000000), 0, 0);
        if (!(v15 & 1))
            goto LABEL_9f569a;
LABEL_9f5699:
        v19 = v7;
    }
    else
    {
        v17 = arm64g_calculate_condition(v16, v11, v12, v13);
        v18 = arm64g_calculate_condition(0, (v17 & 1 ? v10 : 0x40000000), 0, 0);
        if (v18 & 1)
            goto LABEL_9f5699;
LABEL_9f569a:
        v19 = 1;
    }
    if ((int)v19 < 1)
    {
        sub_a36e70();
        return v19;
    }
    sub_a36cd4();
    return v19;
}
