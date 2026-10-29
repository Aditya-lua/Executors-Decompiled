/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x51088..0x510a0 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_51088(unsigned long long *a0, unsigned long long *a1)
{
    unsigned long v0;  // cc_op
    unsigned long v1;  // cc_dep1
    unsigned long v6;  // cc_dep2
    unsigned long v7;  // cc_ndep
    unsigned long v8;  // 4110
    unsigned long long v9;  // 4105
    unsigned long v2;  // 4110
    unsigned long v3;  // cc_op
    unsigned long v4;  // cc_dep1
    unsigned long v5;  // cc_dep2

    if (*a0 == *a1)
    {
        v2 = arm64g_calculate_condition(v0, v1, v6, v7);
        v3 = 4;
        v4 = (v2 & 1 ? a0[1] : 0);
        v5 = (v2 & 1 ? a1[1] : 0);
    }
    else
    {
        v8 = arm64g_calculate_condition(v0, v1, v6, v7);
        v3 = 0;
        v4 = (v8 & 1 ? a0[1] : 0);
        v5 = (v8 & 1 ? a1[1] : 0);
    }
    v9 = arm64g_calculate_condition(v3 | 16, v4, v5, 0);
    return !(v9 & 1);
}
