/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa25540..0xa25620 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_a25540(unsigned long long *a0, unsigned long long *a1)
{
    unsigned long long v0;  // x7
    unsigned long long v1;  // x8
    unsigned long long v10;  // x10
    unsigned long long v11;  // 4206
    unsigned long long v12;  // x15
    unsigned long long v13;  // 4221
    unsigned long long v14;  // 4229
    unsigned long long v15;  // 4237
    unsigned long long v16;  // x10
    unsigned long v17;  // 4245
    unsigned long v18;  // cc_dep1
    unsigned long v19;  // cc_ndep
    unsigned long long v2;  // x9
    unsigned long long v20;  // 4258
    unsigned long long v21;  // x7
    unsigned long long v22;  // 4105
    unsigned long long v23;  // 4105
    unsigned long long v24;  // x8
    unsigned long long v25;  // 4105
    unsigned long long v26;  // 4105
    unsigned long long v27;  // x9
    unsigned long long v28;  // 4105
    unsigned long long v29;  // 4105
    unsigned long long v3;  // x10
    unsigned long long v30;  // x7
    unsigned long v31;  // 4189
    unsigned long long v32;  // x8
    unsigned long v33;  // 4196
    unsigned long long v34;  // x9
    unsigned long v35;  // 4203
    unsigned long long v36;  // x10
    unsigned long long v37;  // 4210
    unsigned long long v38;  // x15
    unsigned long long v39;  // 4225
    unsigned long long v4;  // x7
    unsigned long long v40;  // 4233
    unsigned long long v41;  // 4241
    unsigned long long v42;  // x10
    unsigned long v43;  // 4249
    unsigned long v44;  // cc_dep1
    unsigned long v45;  // cc_ndep
    unsigned long long v46;  // 4262
    unsigned long long v47;  // x7
    unsigned long long v48;  // 4105
    unsigned long long v49;  // 4105
    unsigned long v5;  // 4185
    unsigned long long v50;  // x8
    unsigned long long v51;  // 4105
    unsigned long long v52;  // 4105
    unsigned long long v53;  // x9
    unsigned long long v54;  // 4105
    unsigned long long v55;  // 4105
    unsigned long long v6;  // x8
    unsigned long v7;  // 4192
    unsigned long long v8;  // x9
    unsigned long v9;  // 4199

    v0 = *a1;
    v1 = a1[1];
    v2 = a1[2];
    v3 = a1[3];
    v4 = v0 * 2;
    v5 = arm64g_calculate_flag_c(2, v0, v0, 0);
    v6 = v1 * 2 + v5;
    v7 = arm64g_calculate_flag_c(6, v1, v1, v5);
    v8 = v2 * 2 + v7;
    v9 = arm64g_calculate_flag_c(6, v2, v2, v7);
    v10 = v3 * 2 + v9;
    v11 = arm64g_calculate_flag_c(6, v3, v3, v9);
    v12 = v11;
    v13 = arm64g_calculate_flag_c(4, v4, 0xffffffffffffffff, 0);
    v14 = arm64g_calculate_flag_c(8, v6, 0xffffffff00000000, v13);
    v15 = arm64g_calculate_flag_c(8, v8, 0xffffffffffffffff, v14);
    v16 = v10 + 4294967297 - (v15 ^ 1);
    v17 = arm64g_calculate_flag_c(8, v10, 0xfffffffeffffffff, v15);
    v18 = v12;
    v19 = v17;
    v20 = arm64g_calculate_condition(40, v12, 0, v17);
    if (v20 & 1)
    {
        v21 = v4 + 1;
        v22 = arm64g_calculate_condition(40, v18, 0, v19);
        if (!(v22 & 1))
            goto LABEL_a25596;
LABEL_a25595:
        v24 = v6 + 0x100000000 - (v13 ^ 1);
        v25 = arm64g_calculate_condition(40, v18, 0, v19);
        if (!(v25 & 1))
            goto LABEL_a2559a;
LABEL_a25599:
        v27 = v8 + 1 - (v14 ^ 1);
        v28 = arm64g_calculate_condition(40, v18, 0, v19);
        if (!(v28 & 1))
            goto LABEL_a2559e;
LABEL_a2559d:
        v10 = v16;
    }
    else
    {
        v21 = v4;
        v23 = arm64g_calculate_condition(40, v18, 0, v19);
        if (v23 & 1)
            goto LABEL_a25595;
LABEL_a25596:
        v24 = v6;
        v26 = arm64g_calculate_condition(40, v18, 0, v19);
        if (v26 & 1)
            goto LABEL_a25599;
LABEL_a2559a:
        v27 = v8;
        v29 = arm64g_calculate_condition(40, v18, 0, v19);
        if (v29 & 1)
            goto LABEL_a2559d;
LABEL_a2559e:
    }
    v30 = v21 + *a1;
    v31 = arm64g_calculate_flag_c(2, v21, *a1, 0);
    v32 = v24 + a1[1] + v31;
    v33 = arm64g_calculate_flag_c(6, v24, a1[1], v31);
    v34 = v27 + a1[2] + v33;
    v35 = arm64g_calculate_flag_c(6, v27, a1[2], v33);
    v36 = v10 + a1[3] + v35;
    v37 = arm64g_calculate_flag_c(6, v10, a1[3], v35);
    v38 = v37;
    v39 = arm64g_calculate_flag_c(4, v30, 0xffffffffffffffff, 0);
    v40 = arm64g_calculate_flag_c(8, v32, 0xffffffff00000000, v39);
    v41 = arm64g_calculate_flag_c(8, v34, 0xffffffffffffffff, v40);
    v42 = v36 + 4294967297 - (v41 ^ 1);
    v43 = arm64g_calculate_flag_c(8, v36, 0xfffffffeffffffff, v41);
    v44 = v38;
    v45 = v43;
    v46 = arm64g_calculate_condition(40, v38, 0, v43);
    if (v46 & 1)
    {
        v47 = v30 + 1;
        v48 = arm64g_calculate_condition(40, v44, 0, v45);
        if (!(v48 & 1))
            goto LABEL_a255fa;
LABEL_a255f9:
        v50 = v32 + 0x100000000 - (v39 ^ 1);
        v51 = arm64g_calculate_condition(40, v44, 0, v45);
        if (!(v51 & 1))
            goto LABEL_a255fe;
LABEL_a255fd:
        v53 = v34 + 1 - (v40 ^ 1);
        v54 = arm64g_calculate_condition(40, v44, 0, v45);
        if (!(v54 & 1))
            goto LABEL_a25602;
LABEL_a25601:
        v36 = v42;
    }
    else
    {
        v47 = v30;
        v49 = arm64g_calculate_condition(40, v44, 0, v45);
        if (v49 & 1)
            goto LABEL_a255f9;
LABEL_a255fa:
        v50 = v32;
        v52 = arm64g_calculate_condition(40, v44, 0, v45);
        if (v52 & 1)
            goto LABEL_a255fd;
LABEL_a255fe:
        v53 = v34;
        v55 = arm64g_calculate_condition(40, v44, 0, v45);
        if (v55 & 1)
            goto LABEL_a25601;
LABEL_a25602:
    }
    *a0 = v47;
    a0[1] = v50;
    a0[2] = v53;
    a0[3] = v36;
    return a0;
}
