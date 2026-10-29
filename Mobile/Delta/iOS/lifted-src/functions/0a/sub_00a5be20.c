/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5be20..0xa5bfbc (412 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_a5be20(long long a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v14;  // x0
    unsigned long long v16;  // x22
    unsigned long long v17;  // x20
    unsigned long long v18;  // x0
    uint128_t v0;  // [bp-0x8c0]
    uint128_t v1;  // [bp-0x8b0]
    unsigned long long v2;  // [bp-0x8a0]
    char v3;  // [bp-0x898]
    char v4;  // [bp-0x98]
    unsigned long long v5;  // [bp-0x88]
    unsigned long long v6;  // [bp-0x80]
    unsigned long long v7;  // [bp-0x78]
    uint128_t v8;  // [bp-0x70]
    uint128_t v9;  // [bp-0x60]
    unsigned long long v10;  // [bp-0x50]
    unsigned long v11;  // [bp-0x48]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v14 = 0;
    v11 = *(long long *)&g_10002b0;
    if (a1 && a2)
    {
        _bzero(&v3, 0x800);
        sub_a71bbc(sub_a71204(a1, &v3, 0x800), &v3, 0x800);
        v8 = v0;
        v9 = v1;
        v10 = v2;
        if (sub_a5bfbc(a0, &v4))
        {
            v16 = 0;
            v17 = 0;
LABEL_a5beb8:
            v18 = sub_a6fc18(&v4);
            if ((unsigned int)v18)
                v18 = sub_a70f20(&v4, a2);
            v14 = v18;
            if (v16)
                goto LABEL_a5bed8;
            if (sub_a6fc18(&v4))
            {
                sub_a66ec0(&v3, v6);
                goto LABEL_a5bf84;
            }
        }
        else
        {
            v14 = 0;
            if (!sub_a6fc18(&v4))
            {
                if (*(long long *)&g_10002b0 == v11)
                    return 0;
                ___stack_chk_fail();
            }
            v17 = v7;
            if (v17 && (v14 = sub_a6bffc(v17, "crypto/evp/p_lib.c", 2243), v14))
            {
                v16 = v14;
                v5 = v14;
                v6 = v17;
                if (sub_a5bfbc(a0, &v4))
                    goto LABEL_a5beb8;
                v14 = 0;
LABEL_a5bed8:
                if (sub_a6fc18(&v4))
                    sub_a6c4e8(v16, v17, "crypto/evp/p_lib.c", 2259);
                else
                    sub_a6c2e4(v16, "crypto/evp/p_lib.c", 2261);
LABEL_a5bf84:
            }
        }
    }
    if (*(long long *)&g_10002b0 == v11)
        return v14;
    ___stack_chk_fail();
}
