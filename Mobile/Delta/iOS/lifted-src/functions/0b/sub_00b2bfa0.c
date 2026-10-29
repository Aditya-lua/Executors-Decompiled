/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2bfa0..0xb2c0a8 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_b2bfa0(long long a0, unsigned long a1, unsigned long a2, long long a3)
{
    unsigned long v11;  // x0
    unsigned long v12;  // x19
    uint128_t v0;  // [bp-0xb8]
    uint128_t v1;  // [bp-0xa8]
    unsigned long long v2;  // [bp-0x98]
    unsigned long v3;  // [bp-0x90]
    char v4;  // [bp-0x88]
    uint128_t v5;  // [bp-0x60]
    uint128_t v6;  // [bp-0x50]
    unsigned long long v7;  // [bp-0x40]
    unsigned long v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = 0;
    v8 = *(long long *)&g_10002b0;
    if (a1 && a2)
    {
        v3 = a2;
        v11 = sub_a3f728();
        if (v11)
        {
            v12 = v11;
            sub_a71bbc(sub_a70ed8("size", &v3), &v3);
            v5 = v0;
            v6 = v1;
            v7 = v2;
            if (sub_a3f7f0(v12, a0, &v4) == 1 && sub_a3fe10(v12, a3, 64) == 1)
                v11 = sub_a3ff7c(v12, a1, 0) == 1;
            else
                v11 = 0;
            sub_a3f73c(v12);
        }
    }
    if (*(long long *)&g_10002b0 == v8)
        return v11;
    ___stack_chk_fail();
}
