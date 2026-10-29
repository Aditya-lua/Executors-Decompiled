/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4cff8..0xb4d0d8 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

char sub_b4cff8(char idx, long long a1, long long a2)
{
    unsigned int v10;  // w0
    char v11;  // x0
    uint128_t v0;  // [bp-0xb0]
    uint128_t v1;  // [bp-0xa0]
    unsigned long long v2;  // [bp-0x90]
    char v3;  // [bp-0x88]
    uint128_t v4;  // [bp-0x60]
    uint128_t v5;  // [bp-0x50]
    unsigned long long v6;  // [bp-0x40]
    unsigned long v7;  // [bp-0x38]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    v10 = sub_a2f9e0();
    v11 = 0;
    if (idx && v10)
    {
        if (*(long long *)(idx + 360) && !(*(char *)(idx + 28) & 1))
        {
            sub_a71bbc(sub_a71670("signature", a1, a2), a1, a2);
            v4 = v0;
            v5 = v1;
            v6 = v2;
            v11 = sub_b4d7b0(idx, &v3);
            if (v11)
                v11 = sub_b4d6d8(idx);
            *(char *)(idx + 28) = *(char *)(idx + 28) | 2;
        }
        else
        {
            v11 = 0;
        }
    }
    if (*(long long *)&g_10002b0 == v7)
        return v11;
    ___stack_chk_fail();
}
