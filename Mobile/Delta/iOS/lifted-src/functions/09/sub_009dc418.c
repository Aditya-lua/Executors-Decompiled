/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9dc418..0x9dc5ec (468 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9dc418_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
} st_9dc418_0;


st_9dc418_0 * sub_9dc418(st_9dc418_0 *a0, unsigned long long *a1, void* a2)
{
    unsigned long v0;  // x10
    unsigned long long v1;  // x13
    unsigned long long v10;  // x11
    unsigned long long v11;  // x14
    unsigned long long v12;  // x8
    unsigned long long v13;  // x8
    unsigned long long v14;  // 4140
    unsigned long long v15;  // x11
    unsigned long v16;  // 4118
    unsigned long long v17;  // x9
    unsigned long long v18;  // 4130
    unsigned long long v19;  // x14
    unsigned long long v2;  // x8
    unsigned long long v20;  // x11
    unsigned long long v21;  // x8
    unsigned long long v22;  // 4153
    unsigned long long v23;  // x11
    unsigned long long v24;  // x9
    unsigned long long v25;  // 4117
    unsigned long long v26;  // x14
    unsigned long long v27;  // x12
    unsigned long long v28;  // 4138
    unsigned long long v29;  // x12
    unsigned long long v3;  // x8
    unsigned long long v30;  // x9
    unsigned long v31;  // 4123
    unsigned long long v32;  // x10
    unsigned long long v33;  // x14
    unsigned long long v34;  // x8
    unsigned long long v35;  // x8
    unsigned long long v36;  // 4155
    unsigned long long v37;  // x9
    unsigned long long v38;  // x12
    unsigned long long v39;  // x14
    unsigned long long v4;  // 4155
    unsigned long long v40;  // x11
    unsigned long long v41;  // x8
    unsigned long long v42;  // 4124
    unsigned long long v43;  // x11
    unsigned long long v44;  // x11
    unsigned long long v45;  // 4123
    unsigned long v46;  // x12
    unsigned long long v47;  // x15
    unsigned long long v48;  // x9
    unsigned long long v49;  // 4150
    unsigned long long v5;  // x10
    unsigned long long v50;  // x8
    unsigned long long v51;  // 4111
    unsigned long long v52;  // x9
    unsigned long long v53;  // x9
    unsigned long long v54;  // 4115
    unsigned long long v55;  // x13
    unsigned long long v56;  // x10
    unsigned long long v57;  // 4134
    unsigned long long v58;  // x10
    unsigned long long v59;  // x9
    unsigned long long v6;  // x11
    unsigned long v60;  // 4121
    unsigned long long v61;  // x10
    unsigned long long v62;  // x13
    unsigned long long v63;  // x8
    unsigned long long v64;  // x8
    unsigned long long v65;  // 4151
    unsigned long long v66;  // x9
    unsigned long long v67;  // x9
    unsigned long long v68;  // 4119
    unsigned long long v69;  // x14
    unsigned long long v7;  // x9
    unsigned long long v70;  // x11
    unsigned long long v71;  // x8
    unsigned long long v72;  // 4142
    unsigned long long v73;  // x11
    unsigned long long v74;  // x9
    unsigned long long v75;  // 4117
    unsigned long long v76;  // x14
    unsigned long long v77;  // x12
    unsigned long long v78;  // 4138
    unsigned long long v79;  // x12
    unsigned long long v8;  // 4119
    unsigned long long v80;  // x9
    unsigned long v81;  // 4123
    unsigned long long v82;  // x10
    unsigned long long v83;  // x14
    unsigned long long v84;  // x8
    unsigned long long v85;  // x8
    unsigned long long v86;  // 4106
    unsigned long long v87;  // x9
    unsigned long long v88;  // x12
    unsigned long long v89;  // x11
    unsigned long long v9;  // x9
    unsigned long long v90;  // 4119
    unsigned long long v91;  // x11
    unsigned long long v92;  // x9
    unsigned long long v93;  // x12
    unsigned long long v94;  // 4127
    unsigned long long v95;  // x9
    unsigned long long v96;  // 4123
    unsigned long long v97;  // x8
    unsigned long v98;  // 4132

    v0 = *(long long *)a2 * *a1 >> 64;
    a0->field_0 = *a1 * *(long long *)a2;
    v1 = (long long)a2[8] * *a1 >> 64;
    v2 = *a1 * (long long)a2[8];
    v3 = v2 + v0;
    v4 = arm64g_calculate_condition(50, v2, v0, 0);
    if (v4 & 1)
        v5 = v1;
    else
        v5 = v1 + 1;
    v6 = *(long long *)a2 * a1[1] >> 64;
    v7 = a1[1] * *(long long *)a2;
    v8 = arm64g_calculate_condition(50, v3, v7, 0);
    if (v8 & 1)
        v9 = v6;
    else
        v9 = v6 + 1;
    v10 = v5 + v9;
    a0->field_8 = v3 + v7;
    v11 = *(long long *)a2 * a1[2] >> 64;
    v12 = a1[2] * *(long long *)a2;
    v13 = v10 + v12;
    v14 = arm64g_calculate_condition(50, v10, v12, 0);
    if (v14 & 1)
        v15 = v11;
    else
        v15 = v11 + 1;
    v16 = arm64g_calculate_flag_c(2, v5, v9, 0);
    v17 = v15 + v16;
    v18 = arm64g_calculate_condition(54, v15, 0, v16);
    v19 = (long long)a2[8] * a1[1] >> 64;
    v20 = a1[1] * (long long)a2[8];
    v21 = v13 + v20;
    v22 = arm64g_calculate_condition(50, v13, v20, 0);
    if (v22 & 1)
        v23 = v19;
    else
        v23 = v19 + 1;
    v24 = v17 + v23;
    v25 = arm64g_calculate_condition(50, v17, v23, 0);
    v26 = (long long)a2[16] * *a1 >> 64;
    v27 = *a1 * (long long)a2[16];
    v28 = arm64g_calculate_condition(50, v21, v27, 0);
    if (v28 & 1)
        v29 = v26;
    else
        v29 = v26 + 1;
    v30 = v24 + v29;
    v31 = arm64g_calculate_flag_c(2, v24, v29, 0);
    v32 = !(v25 & 1) + !(v18 & 1) + v31;
    a0->field_10 = v21 + v27;
    v33 = (long long)a2[24] * *a1 >> 64;
    v34 = *a1 * (long long)a2[24];
    v35 = v30 + v34;
    v36 = arm64g_calculate_condition(50, v30, v34, 0);
    if (v36 & 1)
        v37 = v33;
    else
        v37 = v33 + 1;
    v38 = v32 + v37;
    v39 = (long long)a2[16] * a1[1] >> 64;
    v40 = a1[1] * (long long)a2[16];
    v41 = v35 + v40;
    v42 = arm64g_calculate_condition(50, v35, v40, 0);
    if (v42 & 1)
        v43 = v39;
    else
        v43 = v39 + 1;
    v44 = v38 + v43;
    v45 = arm64g_calculate_condition(50, v38, v43, 0);
    v46 = !(v45 & 1);
    v47 = (long long)a2[8] * a1[2] >> 64;
    v48 = a1[2] * (long long)a2[8];
    v49 = arm64g_calculate_condition(50, v32, v37, 0);
    if (!(v49 & 1))
        v46 += 1;
    v50 = v41 + v48;
    v51 = arm64g_calculate_condition(50, v41, v48, 0);
    if (v51 & 1)
        v52 = v47;
    else
        v52 = v47 + 1;
    v53 = v44 + v52;
    v54 = arm64g_calculate_condition(50, v44, v52, 0);
    v55 = *(long long *)a2 * a1[3] >> 64;
    v56 = a1[3] * *(long long *)a2;
    v57 = arm64g_calculate_condition(50, v50, v56, 0);
    if (v57 & 1)
        v58 = v55;
    else
        v58 = v55 + 1;
    v59 = v58 + v53;
    v60 = arm64g_calculate_flag_c(2, v58, v53, 0);
    v61 = v46 + !(v54 & 1) + v60;
    a0->field_18 = v50 + v56;
    v62 = (long long)a2[8] * a1[3] >> 64;
    v63 = a1[3] * (long long)a2[8];
    v64 = v59 + v63;
    v65 = arm64g_calculate_condition(50, v59, v63, 0);
    if (v65 & 1)
        v66 = v62;
    else
        v66 = v62 + 1;
    v67 = v61 + v66;
    v68 = arm64g_calculate_condition(50, v61, v66, 0);
    v69 = (long long)a2[16] * a1[2] >> 64;
    v70 = a1[2] * (long long)a2[16];
    v71 = v64 + v70;
    v72 = arm64g_calculate_condition(50, v64, v70, 0);
    if (v72 & 1)
        v73 = v69;
    else
        v73 = v69 + 1;
    v74 = v67 + v73;
    v75 = arm64g_calculate_condition(50, v67, v73, 0);
    v76 = (long long)a2[24] * a1[1] >> 64;
    v77 = a1[1] * (long long)a2[24];
    v78 = arm64g_calculate_condition(50, v71, v77, 0);
    if (v78 & 1)
        v79 = v76;
    else
        v79 = v76 + 1;
    v80 = v74 + v79;
    v81 = arm64g_calculate_flag_c(2, v74, v79, 0);
    v82 = !(v75 & 1) + !(v68 & 1) + v81;
    a0->field_20 = v71 + v77;
    v83 = (long long)a2[24] * a1[2] >> 64;
    v84 = a1[2] * (long long)a2[24];
    v85 = v80 + v84;
    v86 = arm64g_calculate_condition(50, v80, v84, 0);
    if (v86 & 1)
        v87 = v83;
    else
        v87 = v83 + 1;
    v88 = (long long)a2[16] * a1[3] >> 64;
    v89 = a1[3] * (long long)a2[16];
    v90 = arm64g_calculate_condition(50, v85, v89, 0);
    if (v90 & 1)
        v91 = v88;
    else
        v91 = v88 + 1;
    v92 = v82 + v87;
    a0->field_28 = v85 + v89;
    v93 = (long long)a2[24] * a1[3] >> 64;
    v94 = arm64g_calculate_condition(50, v82, v87, 0);
    if (!(v94 & 1))
        v93 += 1;
    v95 = v92 + v91;
    v96 = arm64g_calculate_condition(50, v92, v91, 0);
    v97 = a1[3] * (long long)a2[24];
    v98 = arm64g_calculate_flag_c(2, v95, v97, 0);
    a0->field_30 = v95 + v97;
    a0->field_38 = v93 + !(v96 & 1) + v98;
    return a0;
}
