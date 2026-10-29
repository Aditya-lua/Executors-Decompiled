/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa213b0..0xa21400 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_a213b0(unsigned long long *a0, unsigned long a1, unsigned long long *a2)
{
    unsigned long v0;  // x14
    unsigned long long v1;  // x14
    unsigned long long v10;  // x17
    unsigned long long v11;  // 4220
    unsigned long v12;  // x1
    unsigned long v13;  // 4221
    unsigned long v14;  // x12
    unsigned long v15;  // 4222
    unsigned long long v16;  // x10
    unsigned long v17;  // 4223
    unsigned long v18;  // cc_dep1
    unsigned long long v19;  // x14
    unsigned long long v2;  // 4217
    unsigned long long v20;  // 4105
    unsigned long long v21;  // 4105
    unsigned long long v22;  // x15
    unsigned long long v23;  // 4105
    unsigned long long v24;  // 4105
    unsigned long long v25;  // 4113
    unsigned long v26;  // x13
    unsigned long v3;  // x15
    unsigned long long v4;  // x15
    unsigned long long v5;  // 4218
    unsigned long v6;  // x16
    unsigned long long v7;  // x16
    unsigned long long v8;  // 4219
    unsigned long v9;  // x17

    v1 = v0 - *a2;
    v2 = arm64g_calculate_flag_c(4, v0, *a2, 0);
    v4 = v3 - a2[1] - (v2 ^ 1);
    v5 = arm64g_calculate_flag_c(8, v3, a2[1], v2);
    v7 = v6 - a2[2] - (v5 ^ 1);
    v8 = arm64g_calculate_flag_c(8, v6, a2[2], v5);
    v10 = v9 - a2[3] - (v8 ^ 1);
    v11 = arm64g_calculate_flag_c(8, v9, a2[3], v8);
    v12 = -(v11 ^ 1);
    v13 = arm64g_calculate_flag_c(4, v1, 1, 0);
    v15 = arm64g_calculate_flag_c(6, v4, v14, v13);
    v16 = v7 + v15;
    v17 = arm64g_calculate_flag_c(6, v7, 0, v15);
    v18 = v12;
    if (!v12)
    {
        v19 = v1;
        v20 = arm64g_calculate_condition(4, v18, 0, 0);
        if (!(v20 & 1))
            goto LABEL_a213e6;
LABEL_a213e5:
        v22 = v4;
        v23 = arm64g_calculate_condition(4, v18, 0, 0);
        if (!(v23 & 1))
            goto LABEL_a213ea;
LABEL_a213e9:
    }
    else
    {
        v19 = v1 - 1;
        v21 = arm64g_calculate_condition(4, v18, 0, 0);
        if (v21 & 1)
            goto LABEL_a213e5;
LABEL_a213e6:
        v22 = v4 + v14 + v13;
        v24 = arm64g_calculate_condition(4, v18, 0, 0);
        if (v24 & 1)
            goto LABEL_a213e9;
LABEL_a213ea:
        v7 = v16;
    }
    *a0 = v19;
    a0[1] = v22;
    v25 = arm64g_calculate_condition(4, v18, 0, 0);
    if (!(v25 & 1))
        v10 = v10 + v26 + v17;
    a0[2] = v7;
    a0[3] = v10;
    return a0;
}
