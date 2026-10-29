/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa25720..0xa257a0 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_a25720(unsigned long long *a0, unsigned long long *a1, unsigned long long *a2)
{
    unsigned long long v0;  // 4269
    unsigned long long v1;  // 4270
    unsigned long v10;  // 4274
    unsigned long v11;  // 4275
    unsigned long long v12;  // x6
    unsigned long v13;  // cc_dep1
    unsigned long long v14;  // x7
    unsigned long long v15;  // 4105
    unsigned long long v16;  // 4105
    unsigned long long v17;  // x8
    unsigned long long v18;  // 4105
    unsigned long long v19;  // 4105
    unsigned long long v2;  // 4271
    unsigned long long v20;  // x9
    unsigned long long v21;  // 4105
    unsigned long long v22;  // 4105
    unsigned long long v3;  // x10
    unsigned long long v4;  // 4272
    unsigned long v5;  // x15
    unsigned long long v6;  // x3
    unsigned long long v7;  // x4
    unsigned long long v8;  // x5
    unsigned long v9;  // 4273

    v0 = arm64g_calculate_flag_c(4, *a1, *a2, 0);
    v1 = arm64g_calculate_flag_c(8, a1[1], a2[1], v0);
    v2 = arm64g_calculate_flag_c(8, a1[2], a2[2], v1);
    v3 = a1[3] - a2[3] - (v2 ^ 1);
    v4 = arm64g_calculate_flag_c(8, a1[3], a2[3], v2);
    v5 = -(v4 ^ 1);
    v6 = *a1 - *a2;
    v7 = a1[1] - a2[1] - (v0 ^ 1);
    v8 = a1[2] - a2[2] - (v1 ^ 1);
    v9 = arm64g_calculate_flag_c(2, v6, 6033684446255071523, 0);
    v10 = arm64g_calculate_flag_c(6, v7, 8215655796475036971, v9);
    v11 = arm64g_calculate_flag_c(6, v8, 0xffffffffffffffff, v10);
    v12 = v3 + 0xfffffffeffffffff + v11;
    v13 = v5;
    if (!v5)
    {
        v14 = v6;
        v15 = arm64g_calculate_condition(10, v13, 0, 0);
        if (!(v15 & 1))
            goto LABEL_a2577e;
LABEL_a2577d:
        v17 = v7;
        v18 = arm64g_calculate_condition(10, v13, 0, 0);
        if (!(v18 & 1))
            goto LABEL_a25782;
LABEL_a25781:
        v20 = v8;
        v21 = arm64g_calculate_condition(10, v13, 0, 0);
        if (!(v21 & 1))
            goto LABEL_a25786;
LABEL_a25785:
    }
    else
    {
        v14 = v6 + 6033684446255071523;
        v16 = arm64g_calculate_condition(10, v13, 0, 0);
        if (v16 & 1)
            goto LABEL_a2577d;
LABEL_a2577e:
        v17 = v7 + 8215655796475036971 + v9;
        v19 = arm64g_calculate_condition(10, v13, 0, 0);
        if (v19 & 1)
            goto LABEL_a25781;
LABEL_a25782:
        v20 = v8 + 0xffffffffffffffff + v10;
        v22 = arm64g_calculate_condition(10, v13, 0, 0);
        if (v22 & 1)
            goto LABEL_a25785;
LABEL_a25786:
        v3 = v12;
    }
    *a0 = v14;
    a0[1] = v17;
    a0[2] = v20;
    a0[3] = v3;
    return a0;
}
