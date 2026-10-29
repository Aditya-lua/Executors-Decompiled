/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa25620..0xa256a0 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_a25620(unsigned long long *a0, unsigned long long *a1, unsigned long long *a2)
{
    unsigned long v0;  // 4201
    unsigned long v1;  // 4208
    unsigned long long v10;  // 4237
    unsigned long long v11;  // 4245
    unsigned long long v12;  // 4253
    unsigned long long v13;  // x6
    unsigned long v14;  // 4261
    unsigned long v15;  // cc_dep1
    unsigned long v16;  // cc_ndep
    unsigned long long v17;  // 4274
    unsigned long long v18;  // x7
    unsigned long long v19;  // 4105
    unsigned long v2;  // 4215
    unsigned long long v20;  // 4105
    unsigned long long v21;  // x8
    unsigned long long v22;  // 4105
    unsigned long long v23;  // 4105
    unsigned long long v24;  // x9
    unsigned long long v25;  // 4105
    unsigned long long v26;  // 4105
    unsigned long long v3;  // x10
    unsigned long long v4;  // 4222
    unsigned long long v5;  // x15
    unsigned long long v6;  // x3
    unsigned long long v7;  // x4
    unsigned long long v8;  // x5
    unsigned long long v9;  // x6

    v0 = arm64g_calculate_flag_c(2, *a1, *a2, 0);
    v1 = arm64g_calculate_flag_c(6, a1[1], a2[1], v0);
    v2 = arm64g_calculate_flag_c(6, a1[2], a2[2], v1);
    v3 = a1[3] + a2[3] + v2;
    v4 = arm64g_calculate_flag_c(6, a1[3], a2[3], v2);
    v5 = v4;
    v6 = *a1 + *a2;
    v7 = a1[1] + a2[1] + v0;
    v8 = a1[2] + a2[2] + v1;
    v9 = v3;
    v10 = arm64g_calculate_flag_c(4, v6, 0xffffffffffffffff, 0);
    v11 = arm64g_calculate_flag_c(8, v7, 0xffffffff00000000, v10);
    v12 = arm64g_calculate_flag_c(8, v8, 0xffffffffffffffff, v11);
    v13 = v9 + 4294967297 - (v12 ^ 1);
    v14 = arm64g_calculate_flag_c(8, v9, 0xfffffffeffffffff, v12);
    v15 = v5;
    v16 = v14;
    v17 = arm64g_calculate_condition(56, v5, 0, v14);
    if (v17 & 1)
    {
        v18 = v6;
        v19 = arm64g_calculate_condition(56, v15, 0, v16);
        if (!(v19 & 1))
            goto LABEL_a2567e;
LABEL_a2567d:
        v21 = v7;
        v22 = arm64g_calculate_condition(56, v15, 0, v16);
        if (!(v22 & 1))
            goto LABEL_a25682;
LABEL_a25681:
        v24 = v8;
        v25 = arm64g_calculate_condition(56, v15, 0, v16);
        if (!(v25 & 1))
            goto LABEL_a25686;
LABEL_a25685:
    }
    else
    {
        v18 = v6 + 1;
        v20 = arm64g_calculate_condition(56, v15, 0, v16);
        if (v20 & 1)
            goto LABEL_a2567d;
LABEL_a2567e:
        v21 = v7 + 0x100000000 - (v10 ^ 1);
        v23 = arm64g_calculate_condition(56, v15, 0, v16);
        if (v23 & 1)
            goto LABEL_a25681;
LABEL_a25682:
        v24 = v8 + 1 - (v11 ^ 1);
        v26 = arm64g_calculate_condition(56, v15, 0, v16);
        if (v26 & 1)
            goto LABEL_a25685;
LABEL_a25686:
        v3 = v13;
    }
    *a0 = v18;
    a0[1] = v21;
    a0[2] = v24;
    a0[3] = v3;
    return a0;
}
