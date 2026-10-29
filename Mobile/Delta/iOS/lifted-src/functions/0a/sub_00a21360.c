/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa21360..0xa213b0 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_a21360(unsigned long long *a0)
{
    unsigned long v0;  // x14
    unsigned long v1;  // x8
    unsigned long long v10;  // x16
    unsigned long v11;  // 4155
    unsigned long v12;  // x17
    unsigned long v13;  // x11
    unsigned long long v14;  // x17
    unsigned long long v15;  // 4162
    unsigned long long v16;  // x1
    unsigned long long v17;  // 4169
    unsigned long v18;  // x12
    unsigned long long v19;  // 4177
    unsigned long long v2;  // x14
    unsigned long long v20;  // x10
    unsigned long long v21;  // 4185
    unsigned long v22;  // x13
    unsigned long v23;  // 4193
    unsigned long v24;  // cc_dep1
    unsigned long v25;  // cc_ndep
    unsigned long long v26;  // 4206
    unsigned long long v27;  // x14
    unsigned long long v28;  // 4105
    unsigned long long v29;  // 4105
    unsigned long v3;  // 4141
    unsigned long long v30;  // x15
    unsigned long long v31;  // 4105
    unsigned long long v32;  // 4105
    unsigned long long v33;  // 4113
    unsigned long v4;  // x15
    unsigned long v5;  // x9
    unsigned long long v6;  // x15
    unsigned long v7;  // 4148
    unsigned long v8;  // x16
    unsigned long v9;  // x10

    v2 = v0 + v1;
    v3 = arm64g_calculate_flag_c(2, v0, v1, 0);
    v6 = v4 + v5 + v3;
    v7 = arm64g_calculate_flag_c(6, v4, v5, v3);
    v10 = v8 + v9 + v7;
    v11 = arm64g_calculate_flag_c(6, v8, v9, v7);
    v14 = v12 + v13 + v11;
    v15 = arm64g_calculate_flag_c(6, v12, v13, v11);
    v16 = v15;
    v17 = arm64g_calculate_flag_c(2, v2, 1, 0);
    v19 = arm64g_calculate_flag_c(8, v6, v18, v17);
    v20 = v10 - (v19 ^ 1);
    v21 = arm64g_calculate_flag_c(8, v10, 0, v19);
    v23 = arm64g_calculate_flag_c(8, v14, v22, v21);
    v24 = v16;
    v25 = v23;
    v26 = arm64g_calculate_condition(56, v16, 0, v23);
    if (v26 & 1)
    {
        v27 = v2;
        v28 = arm64g_calculate_condition(56, v24, 0, v25);
        if (!(v28 & 1))
            goto LABEL_a2138e;
LABEL_a2138d:
        v30 = v6;
        v31 = arm64g_calculate_condition(56, v24, 0, v25);
        if (!(v31 & 1))
            goto LABEL_a21392;
LABEL_a21391:
    }
    else
    {
        v27 = v2 + 1;
        v29 = arm64g_calculate_condition(56, v24, 0, v25);
        if (v29 & 1)
            goto LABEL_a2138d;
LABEL_a2138e:
        v30 = v6 - v18 - (v17 ^ 1);
        v32 = arm64g_calculate_condition(56, v24, 0, v25);
        if (v32 & 1)
            goto LABEL_a21391;
LABEL_a21392:
        v10 = v20;
    }
    *a0 = v27;
    a0[1] = v30;
    v33 = arm64g_calculate_condition(56, v24, 0, v25);
    if (!(v33 & 1))
        v14 = v14 - v22 - (v21 ^ 1);
    a0[2] = v10;
    a0[3] = v14;
    return a0;
}
