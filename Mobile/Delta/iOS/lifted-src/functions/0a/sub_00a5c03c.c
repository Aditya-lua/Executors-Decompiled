/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5c03c..0xa5c0e0 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_a5c03c(long long a0, unsigned long long a1, long long a2)
{
    unsigned long long v11;  // x0
    uint128_t v0;  // [bp-0xa0]
    uint128_t v1;  // [bp-0x90]
    unsigned long long v2;  // [bp-0x80]
    char v3;  // [bp-0x78]
    uint128_t v4;  // [bp-0x50]
    uint128_t v5;  // [bp-0x40]
    unsigned long long v6;  // [bp-0x30]
    unsigned long v7;  // [bp-0x28]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    if (a1)
    {
        sub_a71bbc(sub_a6ffac(a1, a2), a2);
        v4 = v0;
        v5 = v1;
        v6 = v2;
        v11 = sub_a5bfbc(a0, &v3);
        if ((unsigned int)v11)
            v11 = sub_a6fc18(&v3) != 0;
    }
    else
    {
        v11 = 0;
    }
    if (*(long long *)&g_10002b0 == v7)
        return v11;
    ___stack_chk_fail();
}
