/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa09b60..0xa09c14 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a09b60(unsigned long long *a0, unsigned long long *a1, unsigned long long *a2)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9
    unsigned long v10;  // x9
    unsigned long long v11;  // x10
    unsigned long v12;  // 4250
    unsigned long long v13;  // x8
    unsigned long long v14;  // 4262
    unsigned long v15;  // x9
    unsigned long long v16;  // x10
    unsigned long v17;  // 4274
    unsigned long long v18;  // x8
    unsigned long long v19;  // 4286
    unsigned long v2;  // 4202
    unsigned long v20;  // x9
    unsigned long long v21;  // x10
    unsigned long v22;  // 4298
    unsigned long long v23;  // x8
    unsigned long long v24;  // 4310
    unsigned long long v25;  // x10
    unsigned long v26;  // 4322
    unsigned long long v27;  // x8
    unsigned long long v28;  // 4347
    unsigned long long v3;  // x8
    unsigned long long v4;  // 4214
    unsigned long v5;  // x9
    unsigned long long v6;  // x10
    unsigned long v7;  // 4226
    unsigned long long v8;  // x8
    unsigned long long v9;  // 4238

    v0 = *a1;
    v1 = *a2;
    *a0 = v0 + v1;
    v2 = arm64g_calculate_flag_c(2, v0, v1, 0);
    v3 = a1[1] + v2;
    v4 = arm64g_calculate_condition(54, a1[1], 0, v2);
    v5 = !(v4 & 1);
    v6 = a2[1];
    a0[1] = v3 + v6;
    v7 = arm64g_calculate_flag_c(2, v3, v6, 0);
    v8 = a1[2] + v5 + v7;
    v9 = arm64g_calculate_condition(54, a1[2], v5, v7);
    v10 = !(v9 & 1);
    v11 = a2[2];
    a0[2] = v8 + v11;
    v12 = arm64g_calculate_flag_c(2, v8, v11, 0);
    v13 = a1[3] + v10 + v12;
    v14 = arm64g_calculate_condition(54, a1[3], v10, v12);
    v15 = !(v14 & 1);
    v16 = a2[3];
    a0[3] = v13 + v16;
    v17 = arm64g_calculate_flag_c(2, v13, v16, 0);
    v18 = a1[4] + v15 + v17;
    v19 = arm64g_calculate_condition(54, a1[4], v15, v17);
    v20 = !(v19 & 1);
    v21 = a2[4];
    a0[4] = v18 + v21;
    v22 = arm64g_calculate_flag_c(2, v18, v21, 0);
    v23 = a1[5] + v20 + v22;
    v24 = arm64g_calculate_condition(54, a1[5], v20, v22);
    v25 = a2[5];
    a0[5] = v23 + v25;
    v26 = arm64g_calculate_flag_c(2, v23, v25, 0);
    v27 = a1[6] + !(v24 & 1) + v26;
    v28 = arm64g_calculate_condition(50, v27, a2[6], 0);
    a0[6] = v27 + a2[6];
}
