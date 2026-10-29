/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa085fc..0xa087ac (432 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_a085fc(unsigned long long *a0)
{
    unsigned long long v0;  // x10
    unsigned long long v1;  // x11
    unsigned long long v10;  // x10
    unsigned long v11;  // 4212
    long long v12;  // x1
    unsigned long long v13;  // x2
    long long v14;  // x1
    unsigned long long v15;  // x15
    unsigned long long v16;  // 4230
    unsigned long long v17;  // x15
    unsigned long v18;  // 4117
    long long v19;  // x1
    unsigned long long v2;  // x8
    long long v20;  // x2
    unsigned long long v21;  // x1
    unsigned long long v22;  // x14
    unsigned long long v23;  // 4135
    unsigned long long v24;  // x14
    unsigned long v25;  // 4117
    long long v26;  // x1
    long long v27;  // x2
    unsigned long long v28;  // x1
    unsigned long long v29;  // x13
    unsigned long long v3;  // x9
    unsigned long long v30;  // 4135
    unsigned long long v31;  // x13
    unsigned long v32;  // 4117
    long long v33;  // x1
    long long v34;  // x2
    unsigned long long v35;  // x1
    unsigned long long v36;  // x11
    unsigned long long v37;  // 4135
    unsigned long long v38;  // x11
    unsigned long v39;  // 4120
    unsigned long long v4;  // x12
    long long v40;  // x1
    long long v41;  // x2
    unsigned long long v42;  // x1
    unsigned long long v43;  // x12
    unsigned long long v44;  // 4138
    unsigned long long v45;  // x12
    unsigned long v46;  // 4117
    long long v47;  // x1
    unsigned long long v48;  // x2
    long long v49;  // x1
    unsigned long long v5;  // x11
    unsigned long long v50;  // x9
    unsigned long long v51;  // 4135
    unsigned long long v52;  // x9
    unsigned long v53;  // 4117
    long long v54;  // x1
    long long v55;  // x2
    unsigned long long v56;  // x1
    unsigned long long v57;  // x8
    unsigned long long v58;  // 4135
    unsigned long long v59;  // x8
    unsigned long long v6;  // x13
    unsigned long v60;  // 4182
    unsigned long long v61;  // x16
    unsigned long long v62;  // x17
    unsigned long long v63;  // x10
    unsigned long long v64;  // x10
    unsigned long long v65;  // x10
    unsigned long long v66;  // x10
    unsigned long long v67;  // x10
    unsigned long long v68;  // x10
    unsigned long long v69;  // x9
    unsigned long long v7;  // x14
    unsigned long long v8;  // x15
    unsigned long long v9;  // x10

    v0 = a0[7] >> 56;
    v1 = a0[4] + v0;
    v2 = (a0[7] & 0xffffffffffffff) + (a0[6] >> 56);
    v3 = (a0[6] & 0xffffffffffffff) + (a0[5] >> 56);
    v4 = (a0[5] & 0xffffffffffffff) + (v1 >> 56);
    v5 = (v1 & 0xffffffffffffff) + (a0[3] >> 56);
    v6 = (a0[3] & 0xffffffffffffff) + (a0[2] >> 56);
    v7 = (a0[2] & 0xffffffffffffff) + (a0[1] >> 56);
    v8 = (a0[1] & 0xffffffffffffff) + (*a0 >> 56);
    v9 = (*a0 & 0xffffffffffffff) + v0;
    v10 = v9 + 0xff00000000000001;
    v11 = arm64g_calculate_flag_c(2, v9, 0xff00000000000001, 0);
    v12 = 0xffffffffffffffff + v11;
    v13 = v12 * 0x100 | v10 >> 56;
    v14 = v12 >> 56;
    v15 = v13 + v8;
    v16 = arm64g_calculate_condition(50, v13, v8, 0);
    if (!(v16 & 1))
        v14 += 1;
    v17 = v15 + 0xff00000000000001;
    v18 = arm64g_calculate_flag_c(2, v15, 0xff00000000000001, 0);
    v19 = v14 + 0xffffffffffffffff + v18;
    v20 = v19 >> 56;
    v21 = v19 * 0x100 | v17 >> 56;
    v22 = v21 + v7;
    v23 = arm64g_calculate_condition(50, v21, v7, 0);
    if (!(v23 & 1))
        v20 += 1;
    v24 = v22 + 0xff00000000000001;
    v25 = arm64g_calculate_flag_c(2, v22, 0xff00000000000001, 0);
    v26 = v20 + 0xffffffffffffffff + v25;
    v27 = v26 >> 56;
    v28 = v26 * 0x100 | v24 >> 56;
    v29 = v28 + v6;
    v30 = arm64g_calculate_condition(50, v28, v6, 0);
    if (!(v30 & 1))
        v27 += 1;
    v31 = v29 + 0xff00000000000001;
    v32 = arm64g_calculate_flag_c(2, v29, 0xff00000000000001, 0);
    v33 = v27 + 0xffffffffffffffff + v32;
    v34 = v33 >> 56;
    v35 = v33 * 0x100 | v31 >> 56;
    v36 = v35 + v5;
    v37 = arm64g_calculate_condition(50, v35, v5, 0);
    if (!(v37 & 1))
        v34 += 1;
    v38 = v36 + 0xff00000000000002;
    v39 = arm64g_calculate_flag_c(2, v36, 0xff00000000000002, 0);
    v40 = v34 + 0xffffffffffffffff + v39;
    v41 = v40 >> 56;
    v42 = v40 * 0x100 | v38 >> 56;
    v43 = v42 + v4;
    v44 = arm64g_calculate_condition(50, v42, v4, 0);
    if (!(v44 & 1))
        v41 += 1;
    v45 = v43 + 0xff00000000000001;
    v46 = arm64g_calculate_flag_c(2, v43, 0xff00000000000001, 0);
    v47 = v41 + 0xffffffffffffffff + v46;
    v48 = v47 * 0x100 | v45 >> 56;
    v49 = v47 >> 56;
    v50 = v48 + v3;
    v51 = arm64g_calculate_condition(50, v48, v3, 0);
    if (!(v51 & 1))
        v49 += 1;
    v52 = v50 + 0xff00000000000001;
    v53 = arm64g_calculate_flag_c(2, v50, 0xff00000000000001, 0);
    v54 = v49 + 0xffffffffffffffff + v53;
    v55 = v54 >> 56;
    v56 = v54 * 0x100 | v52 >> 56;
    v57 = v56 + v2;
    v58 = arm64g_calculate_condition(50, v56, v2, 0);
    if (!(v58 & 1))
        v55 += 1;
    v59 = v57 + 0xff00000000000001;
    v60 = arm64g_calculate_flag_c(2, v57, 0xff00000000000001, 0);
    v61 = (v55 + 0xffffffffffffffff + v60) * 0x100 | v59 >> 56;
    v62 = v61 & 0xffffffffffffff;
    v63 = (v10 & 0xffffffffffffff) + v62;
    v64 = (v17 & 0xffffffffffffff) + (v63 >> 56) + v62;
    *a0 = v63 & 0xffffffffffffff;
    a0[1] = v64 & 0xffffffffffffff;
    v65 = (v24 & 0xffffffffffffff) + (v64 >> 56) + v62;
    v66 = (v31 & 0xffffffffffffff) + (v65 >> 56) + v62;
    a0[2] = v65 & 0xffffffffffffff;
    a0[3] = v66 & 0xffffffffffffff;
    v67 = (v38 & 0xffffffffffffff) + (v66 >> 56) + (v61 & 0xfffffffffffffe);
    v68 = (v45 & 0xffffffffffffff) + (v67 >> 56) + v62;
    a0[4] = v67 & 0xffffffffffffff;
    a0[5] = v68 & 0xffffffffffffff;
    v69 = (v52 & 0xffffffffffffff) + (v68 >> 56) + v62;
    a0[6] = v69 & 0xffffffffffffff;
    a0[7] = v59 + (v69 >> 56) + v61 & 0xffffffffffffff;
    return a0;
}
