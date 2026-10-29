/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2f17c..0xb2f214 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_b2f17c(long long a0, int a1, int a2)
{
    unsigned long long v10;  // x0
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
    v10 = 1;
    if (a1 && a2)
    {
        sub_a71bbc(sub_a71670("custom"));
        v4 = v0;
        v5 = v1;
        v6 = v2;
        v10 = (int)sub_a58410(a0, &v3) > 0;
    }
    if (*(long long *)&g_10002b0 == v7)
        return v10;
    ___stack_chk_fail();
}
