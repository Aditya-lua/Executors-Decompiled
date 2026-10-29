/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9dcbd0..0x9dcd4c (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_9dcbd0(void* a0, void* a1)
{
    unsigned long v0;  // x8
    unsigned long v1;  // x9
    unsigned long v10;  // x8
    unsigned long long v11;  // x13
    unsigned long v12;  // x8
    unsigned long long v13;  // x8
    unsigned long long v14;  // 4136
    unsigned long long v15;  // x11
    unsigned long v16;  // 4116
    unsigned long long v17;  // x9
    unsigned long long v18;  // 4128
    unsigned long long v19;  // x13
    unsigned long long v2;  // x11
    unsigned long v20;  // x11
    unsigned long long v21;  // x8
    unsigned long long v22;  // 4149
    unsigned long long v23;  // x12
    unsigned long long v24;  // x9
    unsigned long long v25;  // 4115
    unsigned long long v26;  // 4126
    unsigned long long v27;  // x11
    unsigned long long v28;  // x9
    unsigned long v29;  // 4123
    unsigned long v3;  // x8
    unsigned long long v30;  // x10
    unsigned long long v31;  // x14
    unsigned long v32;  // x8
    unsigned long long v33;  // x9
    unsigned long long v34;  // 4155
    unsigned long long v35;  // x12
    unsigned long long v36;  // x15
    unsigned long long v37;  // x8
    unsigned long long v38;  // 4116
    unsigned long long v39;  // x9
    unsigned long long v4;  // x9
    unsigned long long v40;  // x9
    unsigned long long v41;  // 4115
    unsigned long v42;  // x14
    unsigned long long v43;  // 4126
    unsigned long v44;  // x10
    unsigned long long v45;  // x12
    unsigned long v46;  // x11
    unsigned long long v47;  // x8
    unsigned long long v48;  // 4119
    unsigned long long v49;  // x13
    unsigned long long v5;  // 4143
    unsigned long long v50;  // x9
    unsigned long long v51;  // 4115
    unsigned long long v52;  // 4126
    unsigned long long v53;  // x11
    unsigned long long v54;  // x9
    unsigned long v55;  // 4119
    unsigned long long v56;  // x10
    unsigned long v57;  // x8
    unsigned long long v58;  // x12
    unsigned long v59;  // x8
    unsigned long long v6;  // x10
    unsigned long long v60;  // x8
    unsigned long long v61;  // 4147
    unsigned long long v62;  // x9
    unsigned long long v63;  // x9
    unsigned long long v64;  // 4117
    unsigned long long v65;  // x13
    unsigned long v66;  // x11
    unsigned long long v67;  // x8
    unsigned long long v68;  // 4138
    unsigned long long v69;  // x12
    unsigned long long v7;  // 4111
    unsigned long long v70;  // x9
    unsigned long long v71;  // 4115
    unsigned long long v72;  // 4126
    unsigned long long v73;  // x11
    unsigned long long v74;  // x9
    unsigned long v75;  // 4119
    unsigned long long v76;  // x10
    unsigned long long v77;  // x12
    unsigned long v78;  // x8
    unsigned long long v79;  // x9
    unsigned long long v8;  // x9
    unsigned long long v80;  // 4147
    unsigned long long v81;  // x11
    unsigned long long v82;  // 4111
    unsigned long long v83;  // x9
    unsigned long long v84;  // x10
    unsigned long v85;  // x8
    unsigned long long v86;  // x11
    unsigned long long v87;  // 4123
    unsigned long long v88;  // x9
    unsigned long long v89;  // 4123
    unsigned long long v9;  // x11
    unsigned long v90;  // x8
    unsigned long v91;  // 4132

    v0 = *(long long *)a1;
    v1 = v0 * v0 >> 64;
    *(unsigned long *)a0 = v0 * v0;
    v2 = (unsigned long long)(*(long long *)a1 * (long long)a1[8]) >> 64;
    v3 = (long long)a1[8] * *(long long *)a1;
    v4 = v3 + v1;
    v5 = arm64g_calculate_condition(50, v3, v1, 0);
    if (v5 & 1)
        v6 = v2;
    else
        v6 = v2 + 1;
    v7 = arm64g_calculate_condition(50, v4, v3, 0);
    if (v7 & 1)
        v8 = v2;
    else
        v8 = v2 + 1;
    v9 = v6 + v8;
    *(unsigned long *)&a0[8] = v4 + v3;
    v10 = (long long)a1[8];
    v11 = v10 * v10 >> 64;
    v12 = v10 * v10;
    v13 = v9 + v12;
    v14 = arm64g_calculate_condition(50, v9, v12, 0);
    if (v14 & 1)
        v15 = v11;
    else
        v15 = v11 + 1;
    v16 = arm64g_calculate_flag_c(2, v6, v8, 0);
    v17 = v15 + v16;
    v18 = arm64g_calculate_condition(54, v15, 0, v16);
    v19 = (unsigned long long)(*(long long *)a1 * (long long)a1[16]) >> 64;
    v20 = (long long)a1[16] * *(long long *)a1;
    v21 = v13 + v20;
    v22 = arm64g_calculate_condition(50, v13, v20, 0);
    if (v22 & 1)
        v23 = v19;
    else
        v23 = v19 + 1;
    v24 = v17 + v23;
    v25 = arm64g_calculate_condition(50, v17, v23, 0);
    v26 = arm64g_calculate_condition(50, v21, v20, 0);
    if (v26 & 1)
        v27 = v19;
    else
        v27 = v19 + 1;
    v28 = v24 + v27;
    v29 = arm64g_calculate_flag_c(2, v24, v27, 0);
    v30 = !(v25 & 1) + !(v18 & 1) + v29;
    *(unsigned long *)&a0[16] = v21 + v20;
    v31 = (unsigned long long)(*(long long *)a1 * (long long)a1[24]) >> 64;
    v32 = (long long)a1[24] * *(long long *)a1;
    v33 = v28 + v32;
    v34 = arm64g_calculate_condition(50, v28, v32, 0);
    if (v34 & 1)
        v35 = v31;
    else
        v35 = v31 + 1;
    v36 = v30 + v35;
    v37 = v33 + v32;
    v38 = arm64g_calculate_condition(50, v33, v32, 0);
    if (v38 & 1)
        v39 = v31;
    else
        v39 = v31 + 1;
    v40 = v36 + v39;
    v41 = arm64g_calculate_condition(50, v36, v39, 0);
    v42 = !(v41 & 1);
    v43 = arm64g_calculate_condition(50, v30, v35, 0);
    if (v43 & 1)
        v44 = v42;
    else
        v44 = v42 + 1;
    v45 = (unsigned long long)((long long)a1[8] * (long long)a1[16]) >> 64;
    v46 = (long long)a1[16] * (long long)a1[8];
    v47 = v37 + v46;
    v48 = arm64g_calculate_condition(50, v37, v46, 0);
    if (v48 & 1)
        v49 = v45;
    else
        v49 = v45 + 1;
    v50 = v40 + v49;
    v51 = arm64g_calculate_condition(50, v40, v49, 0);
    v52 = arm64g_calculate_condition(50, v47, v46, 0);
    if (v52 & 1)
        v53 = v45;
    else
        v53 = v45 + 1;
    v54 = v50 + v53;
    v55 = arm64g_calculate_flag_c(2, v50, v53, 0);
    v56 = v44 + !(v51 & 1) + v55;
    *(unsigned long *)&a0[24] = v47 + v46;
    v57 = (long long)a1[16];
    v58 = v57 * v57 >> 64;
    v59 = v57 * v57;
    v60 = v54 + v59;
    v61 = arm64g_calculate_condition(50, v54, v59, 0);
    if (v61 & 1)
        v62 = v58;
    else
        v62 = v58 + 1;
    v63 = v56 + v62;
    v64 = arm64g_calculate_condition(50, v56, v62, 0);
    v65 = (unsigned long long)((long long)a1[8] * (long long)a1[24]) >> 64;
    v66 = (long long)a1[24] * (long long)a1[8];
    v67 = v60 + v66;
    v68 = arm64g_calculate_condition(50, v60, v66, 0);
    if (v68 & 1)
        v69 = v65;
    else
        v69 = v65 + 1;
    v70 = v63 + v69;
    v71 = arm64g_calculate_condition(50, v63, v69, 0);
    v72 = arm64g_calculate_condition(50, v67, v66, 0);
    if (v72 & 1)
        v73 = v65;
    else
        v73 = v65 + 1;
    v74 = v70 + v73;
    v75 = arm64g_calculate_flag_c(2, v70, v73, 0);
    v76 = !(v71 & 1) + !(v64 & 1) + v75;
    *(unsigned long *)&a0[32] = v67 + v66;
    v77 = (unsigned long long)((long long)a1[16] * (long long)a1[24]) >> 64;
    v78 = (long long)a1[24] * (long long)a1[16];
    v79 = v74 + v78;
    v80 = arm64g_calculate_condition(50, v74, v78, 0);
    if (v80 & 1)
        v81 = v77;
    else
        v81 = v77 + 1;
    v82 = arm64g_calculate_condition(50, v79, v78, 0);
    if (v82 & 1)
        v83 = v77;
    else
        v83 = v77 + 1;
    v84 = v76 + v81;
    *(unsigned long *)&a0[40] = v79 + v78;
    v85 = (long long)a1[24];
    v86 = v85 * v85 >> 64;
    v87 = arm64g_calculate_condition(50, v76, v81, 0);
    if (!(v87 & 1))
        v86 += 1;
    v88 = v84 + v83;
    v89 = arm64g_calculate_condition(50, v84, v83, 0);
    v90 = v85 * v85;
    v91 = arm64g_calculate_flag_c(2, v88, v90, 0);
    *(unsigned long *)&a0[48] = v88 + v90;
    *(unsigned long *)&a0[56] = v86 + !(v89 & 1) + v91;
    return a0;
}
