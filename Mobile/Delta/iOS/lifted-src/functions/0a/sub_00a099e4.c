/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa099e4..0xa09b60 (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_a099e4(unsigned long long *a0, unsigned long long *a1, unsigned long long *a2, unsigned long a3)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // 4125
    unsigned long long v10;  // x10
    unsigned long long v11;  // 4142
    unsigned long long v12;  // x10
    unsigned long long v13;  // 4121
    long long v14;  // x11
    long long v15;  // x12
    unsigned long long v16;  // x11
    unsigned long long v17;  // 4142
    unsigned long long v18;  // x11
    unsigned long long v19;  // 4121
    long long v2;  // x9
    long long v20;  // x12
    long long v21;  // x13
    unsigned long long v22;  // x12
    unsigned long long v23;  // 4142
    unsigned long long v24;  // x12
    unsigned long long v25;  // 4121
    long long v26;  // x13
    long long v27;  // x14
    unsigned long long v28;  // x13
    unsigned long long v29;  // 4142
    long long v3;  // x10
    unsigned long long v30;  // x13
    unsigned long long v31;  // 4121
    long long v32;  // x14
    long long v33;  // x15
    unsigned long long v34;  // x14
    unsigned long long v35;  // 4142
    unsigned long long v36;  // x16
    unsigned long long v37;  // 4215
    unsigned long long v38;  // x15
    unsigned long long v39;  // x16
    unsigned long long v4;  // x9
    unsigned long v40;  // 4229
    unsigned long long v41;  // x9
    unsigned long long v42;  // 4241
    unsigned long v43;  // x16
    unsigned long long v44;  // x17
    unsigned long v45;  // 4256
    unsigned long long v46;  // x8
    unsigned long long v47;  // 4268
    unsigned long v48;  // x9
    unsigned long long v49;  // x10
    unsigned long long v5;  // 4146
    unsigned long v50;  // 4279
    unsigned long long v51;  // x9
    unsigned long long v52;  // 4291
    unsigned long v53;  // x10
    unsigned long long v54;  // x11
    unsigned long v55;  // 4302
    unsigned long long v56;  // x8
    unsigned long long v57;  // 4314
    unsigned long v58;  // x9
    unsigned long v59;  // 4319
    unsigned long long v6;  // x9
    unsigned long long v60;  // x9
    unsigned long long v61;  // 4331
    unsigned long v62;  // 4340
    unsigned long long v7;  // 4121
    long long v8;  // x10
    long long v9;  // x11

    v0 = *a1 - *a2;
    v1 = arm64g_calculate_flag_c(4, *a1, *a2, 0);
    v2 = -(v1 ^ 1);
    *a0 = v0;
    v3 = v2 >> 63;
    v4 = v2 + a1[1];
    v5 = arm64g_calculate_condition(50, v2, a1[1], 0);
    if (!(v5 & 1))
        v3 += 1;
    v6 = v4 - a2[1];
    v7 = arm64g_calculate_flag_c(4, v4, a2[1], 0);
    v8 = v3 - (v7 ^ 1);
    a0[1] = v6;
    v9 = v8 >> 63;
    v10 = v8 + a1[2];
    v11 = arm64g_calculate_condition(50, v8, a1[2], 0);
    if (!(v11 & 1))
        v9 += 1;
    v12 = v10 - a2[2];
    v13 = arm64g_calculate_flag_c(4, v10, a2[2], 0);
    v14 = v9 - (v13 ^ 1);
    a0[2] = v12;
    v15 = v14 >> 63;
    v16 = v14 + a1[3];
    v17 = arm64g_calculate_condition(50, v14, a1[3], 0);
    if (!(v17 & 1))
        v15 += 1;
    v18 = v16 - a2[3];
    v19 = arm64g_calculate_flag_c(4, v16, a2[3], 0);
    v20 = v15 - (v19 ^ 1);
    a0[3] = v18;
    v21 = v20 >> 63;
    v22 = v20 + a1[4];
    v23 = arm64g_calculate_condition(50, v20, a1[4], 0);
    if (!(v23 & 1))
        v21 += 1;
    v24 = v22 - a2[4];
    v25 = arm64g_calculate_flag_c(4, v22, a2[4], 0);
    v26 = v21 - (v25 ^ 1);
    a0[4] = v24;
    v27 = v26 >> 63;
    v28 = v26 + a1[5];
    v29 = arm64g_calculate_condition(50, v26, a1[5], 0);
    if (!(v29 & 1))
        v27 += 1;
    v30 = v28 - a2[5];
    v31 = arm64g_calculate_flag_c(4, v28, a2[5], 0);
    v32 = v27 - (v31 ^ 1);
    a0[5] = v30;
    v33 = v32 >> 63;
    v34 = v32 + a1[6];
    v35 = arm64g_calculate_condition(50, v32, a1[6], 0);
    if (!(v35 & 1))
        v33 += 1;
    v36 = a2[6];
    v37 = arm64g_calculate_flag_c(4, v34, a2[6], 0);
    v38 = v33 - (v37 ^ 1) + a3;
    v39 = v38 & 2556006723728458995;
    v40 = arm64g_calculate_flag_c(2, v0, v39, 0);
    v41 = v6 + v40;
    v42 = arm64g_calculate_condition(54, v6, 0, v40);
    v43 = !(v42 & 1);
    v44 = v38 & 2408513697996967765;
    *a0 = v0 + v39;
    a0[1] = v41 + v44;
    v45 = arm64g_calculate_flag_c(2, v41, v44, 0);
    v46 = v12 + v43 + v45;
    v47 = arm64g_calculate_condition(54, v12, v43, v45);
    v48 = !(v47 & 1);
    v49 = v38 & 14145484589129676432;
    v50 = arm64g_calculate_flag_c(2, v46, v49, 0);
    v51 = v18 + v48 + v50;
    v52 = arm64g_calculate_condition(54, v18, v48, v50);
    v53 = !(v52 & 1);
    v54 = v38 & 0xffffffff7cca23e9;
    a0[2] = v46 + v49;
    a0[3] = v51 + v54;
    v55 = arm64g_calculate_flag_c(2, v51, v54, 0);
    v56 = v24 + v53 + v55;
    v57 = arm64g_calculate_condition(54, v24, v53, v55);
    v58 = !(v57 & 1);
    v59 = arm64g_calculate_flag_c(2, v56, v38, 0);
    v60 = v30 + v58 + v59;
    v61 = arm64g_calculate_condition(54, v30, v58, v59);
    a0[4] = v56 + v38;
    a0[5] = v60 + v38;
    v62 = arm64g_calculate_flag_c(2, v60, v38, 0);
    a0[6] = (v38 & 0x3fffffffffffffff) + v34 - v36 + !(v61 & 1) + v62;
    return a0;
}
