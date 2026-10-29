/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb546a0..0xb54754 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_b546a0(unsigned long long a0, unsigned long long a1, unsigned long long *a2, unsigned long a3)
{
    unsigned int v9;  // w0
    long long v10;  // x0
    uint128_t v0;  // [bp-0xb0]
    uint128_t v1;  // [bp-0xa0]
    unsigned long long v2;  // [bp-0x90]
    uint128_t v3;  // [bp-0x60]
    uint128_t v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x40]
    unsigned long v6;  // [bp-0x38]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v9 = sub_a2f9e0();
    if (a1 >> 1 & 1 && a0 && v9)
    {
        v10 = sub_a71670("raw-bytes", *(long long *)(a0 + 16), *(long long *)(a0 + 24));
        sub_a71bbc(v10, *(long long *)(a0 + 16), *(long long *)(a0 + 24));
        v3 = v0;
        v4 = v1;
        v5 = v2;
        a2();
    }
    if (*(long long *)&g_10002b0 == v6)
        return 0;
    ___stack_chk_fail();
}
