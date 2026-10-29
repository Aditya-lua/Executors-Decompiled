/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5b948..0xa5ba1c (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long * sub_a5b948(long long a0, unsigned long long *a1, long long a2, long long a3, unsigned long long *a4)
{
    unsigned long long *v12;  // w0
    unsigned long long *v13;  // w0
    unsigned long long *v14;  // w8
    unsigned long long *v15;  // x0
    uint128_t v0;  // [bp-0xa0]
    uint128_t v1;  // [bp-0x90]
    unsigned long long v2;  // [bp-0x80]
    char v3;  // [bp-0x78]
    unsigned long v4;  // [bp-0x58]
    uint128_t v5;  // [bp-0x50]
    uint128_t v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x30]
    unsigned long v8;  // [bp-0x28]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    if (a1)
    {
        sub_a71bbc(sub_a71670(a1, a2, a3), a2, a3);
        v5 = v0;
        v6 = v1;
        v7 = v2;
        v12 = (unsigned long long *)(unsigned int)sub_a5bfbc(a0, &v3);
        if (v12)
        {
            v13 = (unsigned long long *)(unsigned int)sub_a6fc18(&v3);
            v14 = (unsigned long long *)(v13 != 0);
            if (a4 && v13)
            {
                *a4 = v4;
                v14 = (unsigned long long *)1;
            }
        }
        else
        {
            v14 = (unsigned long long *)0;
        }
        if (!v12)
            v15 = 0;
        else
            v15 = v14;
    }
    else
    {
        v15 = 0;
    }
    if (*(long long *)&g_10002b0 == v8)
        return v15;
    ___stack_chk_fail();
}
