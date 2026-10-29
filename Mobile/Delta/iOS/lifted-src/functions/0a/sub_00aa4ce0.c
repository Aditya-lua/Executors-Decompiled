/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa4ce0..0xaa4d58 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa4ce0_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
    unsigned int field_10;
    char padding_14[4];
    unsigned long long field_18;
} st_aa4ce0_0;


st_aa4ce0_0 * sub_aa4ce0(st_aa4ce0_0 *a0, unsigned long long *a1, unsigned long long *a2)
{
    unsigned long v0;  // x12
    unsigned long v1;  // x14
    unsigned long long v10;  // x4
    unsigned long v11;  // 4258
    unsigned long long v12;  // x5
    unsigned long v13;  // 4259
    unsigned long v14;  // 4260
    unsigned long long v15;  // x13
    unsigned long v16;  // 4261
    unsigned long long v17;  // x14
    unsigned long v18;  // cc_dep1
    unsigned long long v19;  // x4
    unsigned long long v2;  // x4
    unsigned long long v20;  // 4105
    unsigned long long v21;  // 4105
    unsigned long v22;  // 4113
    unsigned long long v23;  // x5
    unsigned long long v3;  // x4
    unsigned long v4;  // 4256
    unsigned long long v5;  // x5
    unsigned long long v6;  // x5
    unsigned long v7;  // 4257
    unsigned long long v8;  // x6
    unsigned long long v9;  // x12

    if (!a0->field_18)
        goto LABEL_0xaa4520;
    v0 = a0->field_8;
    v1 = a0->field_10;
    v2 = a0->field_0 + a0->field_4 * 0x4000000;
    v3 = v2 + v0 * 0x10000000000000;
    v4 = arm64g_calculate_flag_c(2, v2, v0 * 0x10000000000000, 0);
    v5 = (v0 >> 12) + a0->field_c * 0x4000 + v4;
    v6 = v5 + v1 * 0x10000000000;
    v7 = arm64g_calculate_flag_c(2, v5, v1 * 0x10000000000, 0);
    v8 = (v1 >> 24) + v7;
    v9 = (v8 & 0xfffffffffffffffc) + (v8 >> 2);
    v10 = v3 + v9;
    v11 = arm64g_calculate_flag_c(2, v3, v9, 0);
    v12 = v6 + v11;
    v13 = arm64g_calculate_flag_c(6, v6, 0, v11);
    v14 = arm64g_calculate_flag_c(2, v10, 5, 0);
    v15 = v12 + v14;
    v16 = arm64g_calculate_flag_c(6, v12, 0, v14);
    v17 = (v8 & 3) + v13 + v16;
    v18 = v17 & 0xfffffffffffffffc;
    if (!(v17 & 0xfffffffffffffffc))
    {
        v19 = v10;
        v20 = arm64g_calculate_condition(10, v18, 0, 0);
        if (!(v20 & 1))
            goto LABEL_aa4d46;
LABEL_aa4d45:
    }
    else
    {
        v19 = v10 + 5;
        v21 = arm64g_calculate_condition(10, v18, 0, 0);
        if (v21 & 1)
            goto LABEL_aa4d45;
LABEL_aa4d46:
        v12 = v15;
    }
    v22 = arm64g_calculate_flag_c(2, v19, *a2, 0);
    v23 = v12 + a2[1] + v22;
    *a1 = v19 + *a2;
    a1[1] = v23;
    return a0;
}
