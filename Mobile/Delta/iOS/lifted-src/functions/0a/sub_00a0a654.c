/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa0a654..0xa0a75c (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_a0a654(unsigned long long *a0, unsigned long long *a1)
{
    unsigned long long v0;  // x9
    unsigned long long v1;  // x8
    unsigned long v10;  // 4263
    unsigned long long v11;  // x11
    unsigned long long v12;  // 4275
    unsigned long v13;  // x12
    unsigned long long v14;  // x13
    unsigned long long v15;  // x11
    unsigned long v16;  // 4291
    unsigned long long v17;  // x12
    unsigned long long v18;  // 4303
    unsigned long v19;  // x13
    unsigned long long v2;  // x10
    unsigned long long v20;  // x14
    unsigned long long v21;  // x12
    unsigned long v22;  // 4315
    unsigned long long v23;  // x13
    unsigned long long v24;  // 4327
    unsigned long v25;  // x14
    unsigned long long v26;  // x13
    unsigned long v27;  // 4337
    unsigned long long v28;  // x14
    unsigned long long v29;  // 4349
    unsigned long long v3;  // x9
    unsigned long v30;  // x15
    unsigned long long v31;  // x14
    unsigned long v32;  // 4365
    unsigned long long v33;  // x15
    unsigned long long v34;  // 4377
    unsigned long v35;  // x16
    unsigned long long v36;  // x8
    unsigned long long v37;  // x8
    unsigned long long v38;  // 4393
    unsigned long v39;  // x15
    unsigned long v4;  // 4235
    unsigned long long v5;  // x10
    unsigned long long v6;  // 4247
    unsigned long v7;  // x11
    unsigned long long v8;  // x12
    unsigned long long v9;  // x10

    v0 = *a1;
    v1 = -(v0 & 1);
    v2 = v1 & 2556006723728458995;
    v3 = v0 + v2;
    *a0 = v3;
    v4 = arm64g_calculate_flag_c(2, v0, v2, 0);
    v5 = a1[1] + v4;
    v6 = arm64g_calculate_condition(54, a1[1], 0, v4);
    v7 = !(v6 & 1);
    v8 = v1 & 2408513697996967765;
    v9 = v5 + v8;
    a0[1] = v9;
    v10 = arm64g_calculate_flag_c(2, v5, v8, 0);
    v11 = a1[2] + v7 + v10;
    v12 = arm64g_calculate_condition(54, a1[2], v7, v10);
    v13 = !(v12 & 1);
    v14 = v1 & 14145484589129676432;
    v15 = v11 + v14;
    a0[2] = v15;
    v16 = arm64g_calculate_flag_c(2, v11, v14, 0);
    v17 = a1[3] + v13 + v16;
    v18 = arm64g_calculate_condition(54, a1[3], v13, v16);
    v19 = !(v18 & 1);
    v20 = v1 & 0xffffffff7cca23e9;
    v21 = v17 + v20;
    a0[3] = v21;
    v22 = arm64g_calculate_flag_c(2, v17, v20, 0);
    v23 = a1[4] + v19 + v22;
    v24 = arm64g_calculate_condition(54, a1[4], v19, v22);
    v25 = !(v24 & 1);
    v26 = v23 + v1;
    a0[4] = v26;
    v27 = arm64g_calculate_flag_c(2, v23, v1, 0);
    v28 = a1[5] + v25 + v27;
    v29 = arm64g_calculate_condition(54, a1[5], v25, v27);
    v30 = !(v29 & 1);
    v31 = v28 + v1;
    a0[5] = v31;
    v32 = arm64g_calculate_flag_c(2, v28, v1, 0);
    v33 = a1[6] + v30 + v32;
    v34 = arm64g_calculate_condition(54, a1[6], v30, v32);
    v35 = !(v34 & 1);
    v36 = v1 & 0x3fffffffffffffff;
    v37 = v33 + v36;
    v38 = arm64g_calculate_condition(50, v33, v36, 0);
    if (v38 & 1)
        v39 = v35;
    else
        v39 = v35 + 1;
    *a0 = v9 * 0x8000000000000000 | v3 >> 1;
    a0[1] = v15 * 0x8000000000000000 | v9 >> 1;
    a0[2] = v21 * 0x8000000000000000 | v15 >> 1;
    a0[3] = v26 * 0x8000000000000000 | v21 >> 1;
    a0[4] = v31 * 0x8000000000000000 | v26 >> 1;
    a0[5] = v37 * 0x8000000000000000 | v31 >> 1;
    a0[6] = v39 * 0x8000000000000000 | v37 >> 1;
    return a0;
}
