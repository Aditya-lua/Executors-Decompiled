/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4d068..0xa4d08c (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a4d068(unsigned long a0, unsigned long a1, int a2)
{
    unsigned long long v0;  // x8
    unsigned long v1;  // cc_op
    unsigned long v5;  // cc_dep2
    unsigned long v6;  // cc_ndep
    unsigned long v7;  // 4112
    unsigned long v8;  // cc_dep1
    unsigned long long v9;  // 4136
    unsigned long long v10;  // x10
    unsigned long long v11;  // x11
    unsigned long long v12;  // 4110
    unsigned long long v13;  // 4106
    unsigned long long v14;  // 4110
    unsigned long long v15;  // 4106
    unsigned long v2;  // 4112
    unsigned long v3;  // cc_op
    unsigned long v4;  // cc_dep1

    v0 = a0 - a1;
    if (a0 != a1)
    {
        v2 = arm64g_calculate_condition(v1 | 16, v8, v5, v6);
        v3 = 3;
        v4 = (v2 & 1 ? a2 : 0x40000000);
    }
    else
    {
        v7 = arm64g_calculate_condition(v1 | 16, v8, v5, v6);
        v3 = 0;
        v4 = (v7 & 1 ? a2 : 0x40000000);
    }
    v9 = arm64g_calculate_condition(v3 | 208, v4, 0, 0);
    v10 = a2;
    v11 = -v10;
    if (v10 <= v0)
    {
        v12 = arm64g_calculate_condition(v3 | 32, v4, 0, 0);
        v13 = arm64g_calculate_condition(148, (v12 & 1 ? v0 : 0x20000000), (v12 & 1 ? v11 : 0), 0);
        if (!(v13 & 1))
            return !(v9 & 1);
    }
    else
    {
        v14 = arm64g_calculate_condition(v3 | 32, v4, 0, 0);
        v15 = arm64g_calculate_condition(144, (v14 & 1 ? v0 : 0x20000000), (v14 & 1 ? v11 : 0), 0);
        if (!(v15 & 1))
            return !(v9 & 1);
    }
    return 0;
}
