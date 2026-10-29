/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x994b28..0x994b7c (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_994b28(unsigned long long *a0, unsigned long long *a1)
{
    unsigned long long v0;  // x9
    unsigned long long v1;  // x10
    unsigned long long v10;  // 4110
    unsigned long long v2;  // x8
    unsigned long v3;  // cc_dep1
    unsigned long v4;  // cc_dep2
    unsigned long long v5;  // 4110
    unsigned long long v6;  // 4102
    unsigned long long v7;  // 4110
    unsigned long long v8;  // 4102
    unsigned long long v9;  // x10

    v0 = __builtin_bswap64(*a0);
    v1 = __builtin_bswap64(*a1);
    v2 = v0 - v1;
    v3 = v0;
    v4 = v1;
    if (v0 > v1 && (long long)v2 < 0)
        return 128;
    if (v0 < v1)
    {
        v5 = arm64g_calculate_condition(52, v3, v4, 0);
        v6 = arm64g_calculate_condition(196, (v5 & 1 ? v2 : 0x40000000), 0, 0);
        if (v6 & 1)
            return 0xffffff80;
    }
    else
    {
        v7 = arm64g_calculate_condition(52, v3, v4, 0);
        v8 = arm64g_calculate_condition(192, (v7 & 1 ? v2 : 0x40000000), 0, 0);
        if (v8 & 1)
            return 0xffffff80;
    }
    v9 = 0xffffffffffffff80;
    v10 = arm64g_calculate_condition(194, v2, 128, 0);
    if (v10 & 1)
        v9 = v2;
    if (128 >= (long long)v2)
        return v9 & 0xffffffff;
    return 128;
}
