/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa4520..0xaa4560 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_aa4520(unsigned long long *a0, unsigned long long *a1, unsigned long long *a2)
{
    unsigned long long v0;  // x4
    unsigned long long v1;  // x5
    unsigned long v10;  // 4113
    unsigned long long v11;  // x5
    unsigned long v2;  // 4156
    unsigned long long v3;  // x13
    unsigned long v4;  // 4157
    unsigned long long v5;  // x14
    unsigned long v6;  // cc_dep1
    unsigned long long v7;  // x4
    unsigned long long v8;  // 4105
    unsigned long long v9;  // 4105

    v0 = *a0;
    v1 = a0[1];
    v2 = arm64g_calculate_flag_c(2, v0, 5, 0);
    v3 = v1 + v2;
    v4 = arm64g_calculate_flag_c(6, v1, 0, v2);
    v5 = a0[2] + v4;
    v6 = v5 & 0xfffffffffffffffc;
    if (!(v5 & 0xfffffffffffffffc))
    {
        v7 = v0;
        v8 = arm64g_calculate_condition(10, v6, 0, 0);
        if (!(v8 & 1))
            goto LABEL_aa4542;
LABEL_aa4541:
    }
    else
    {
        v7 = v0 + 5;
        v9 = arm64g_calculate_condition(10, v6, 0, 0);
        if (v9 & 1)
            goto LABEL_aa4541;
LABEL_aa4542:
        v1 = v3;
    }
    v10 = arm64g_calculate_flag_c(2, v7, *a2, 0);
    v11 = v1 + a2[1] + v10;
    *a1 = v7 + *a2;
    a1[1] = v11;
    return a0;
}
