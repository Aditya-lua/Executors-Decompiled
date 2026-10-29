/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa11a14..0xa11c20 (524 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a11a14_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
} st_a11a14_0;


st_a11a14_0 * sub_a11a14(st_a11a14_0 *a0, void* a1, void* a2)
{
    unsigned long long v4;  // x22
    unsigned long long v5;  // x21
    unsigned long v14;  // x13
    unsigned long v15;  // x3
    unsigned long long v16;  // x5
    unsigned long long v17;  // x7
    unsigned long v18;  // x11
    unsigned long long v19;  // x19
    unsigned long long v20;  // x11
    unsigned long long v21;  // x21
    unsigned long long v22;  // x15
    unsigned long v23;  // 4374
    unsigned long long v6;  // x20
    unsigned long v24;  // x21
    unsigned long long v25;  // x17
    unsigned long v26;  // 4389
    unsigned long v27;  // x21
    unsigned long long v28;  // x5
    unsigned long v29;  // 4404
    unsigned long v30;  // x21
    unsigned long long v31;  // x7
    unsigned long v32;  // 4419
    unsigned long v33;  // x12
    unsigned long long v7;  // x19
    unsigned long long v34;  // x19
    unsigned long v35;  // 4434
    unsigned long long v36;  // x12
    unsigned long v37;  // x3
    unsigned long v38;  // x20
    unsigned long long v39;  // x21
    unsigned long long v40;  // x15
    unsigned long v41;  // 4457
    unsigned long long v42;  // x21
    unsigned long long v43;  // x17
    unsigned long v8;  // x8
    unsigned long v44;  // 4472
    unsigned long v45;  // x21
    unsigned long long v46;  // x5
    unsigned long v47;  // 4487
    unsigned long v48;  // x21
    unsigned long long v49;  // x7
    unsigned long v50;  // 4502
    unsigned long v51;  // x3
    unsigned long long v52;  // x3
    unsigned long v53;  // 4517
    unsigned long v9;  // x10
    unsigned long long v54;  // x13
    unsigned long long v55;  // x21
    unsigned long long v56;  // x15
    unsigned long v57;  // 4536
    unsigned long long v58;  // x21
    unsigned long long v59;  // x17
    unsigned long v60;  // 4551
    unsigned long long v61;  // x21
    unsigned long long v62;  // x5
    unsigned long v63;  // 4566
    unsigned long long v10;  // x9
    unsigned long v64;  // x21
    unsigned long long v65;  // x7
    unsigned long v66;  // 4581
    unsigned long v67;  // x19
    unsigned long long v68;  // x3
    unsigned long v69;  // 4596
    unsigned long v70;  // x1
    unsigned long long v71;  // x10
    unsigned long long v72;  // x19
    unsigned long long v73;  // x15
    unsigned long v11;  // x12
    unsigned long v74;  // 4617
    unsigned long long v75;  // x14
    unsigned long long v76;  // x14
    unsigned long v77;  // 4632
    unsigned long long v78;  // x13
    unsigned long long v79;  // x16
    unsigned long long v80;  // x16
    unsigned long v81;  // 4647
    unsigned long long v82;  // x17
    unsigned long long v83;  // x17
    unsigned long long v12;  // x15
    unsigned long v84;  // 4662
    unsigned long long v85;  // x11
    unsigned long v86;  // x4
    unsigned long long v87;  // x3
    unsigned long v88;  // 4125
    unsigned long long v89;  // x8
    unsigned long long v90;  // x12
    unsigned long long v91;  // x12
    unsigned long long v92;  // 4141
    unsigned long long v93;  // x10
    unsigned long long v13;  // x17
    unsigned long long v94;  // x10
    unsigned long long v95;  // 4120
    unsigned long long v96;  // x11
    unsigned long long v97;  // x11
    unsigned long long v98;  // 4120
    unsigned long long v99;  // x13
    unsigned long long v100;  // x8
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    unsigned long long v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]

    v0 = v4;
    v1 = v5;
    v2 = v6;
    v3 = v7;
    v8 = *(long long *)a2;
    v9 = (long long)a2[8];
    v10 = *(long long *)a1;
    v11 = (long long)a1[8];
    v12 = v10 * v8;
    v13 = v10 * v9;
    v14 = (long long)a2[16];
    v15 = (long long)a2[24];
    v16 = v10 * v14;
    v17 = v10 * v15;
    v18 = (long long)a2[32];
    v19 = v10 * v18;
    v20 = 19 * v18;
    v21 = v20 * v11;
    v22 = v21 + v12;
    v23 = arm64g_calculate_flag_c(2, v21, v12, 0);
    v24 = v8 * v11;
    v25 = v24 + v13;
    v26 = arm64g_calculate_flag_c(2, v24, v13, 0);
    v27 = v9 * v11;
    v28 = v27 + v16;
    v29 = arm64g_calculate_flag_c(2, v27, v16, 0);
    v30 = v14 * v11;
    v31 = v30 + v17;
    v32 = arm64g_calculate_flag_c(2, v30, v17, 0);
    v33 = v15 * v11;
    v34 = v33 + v19;
    v35 = arm64g_calculate_flag_c(2, v33, v19, 0);
    v36 = 19 * v15;
    v37 = (long long)a1[16];
    v38 = (long long)a1[24];
    v39 = v36 * v37;
    v40 = v22 + v39;
    v41 = arm64g_calculate_flag_c(2, v22, v39, 0);
    v42 = v20 * v37;
    v43 = v25 + v42;
    v44 = arm64g_calculate_flag_c(2, v25, v42, 0);
    v45 = v8 * v37;
    v46 = v28 + v45;
    v47 = arm64g_calculate_flag_c(2, v28, v45, 0);
    v48 = v9 * v37;
    v49 = v31 + v48;
    v50 = arm64g_calculate_flag_c(2, v31, v48, 0);
    v51 = v14 * v37;
    v52 = v34 + v51;
    v53 = arm64g_calculate_flag_c(2, v34, v51, 0);
    v54 = 19 * v14;
    v55 = v54 * v38;
    v56 = v40 + v55;
    v57 = arm64g_calculate_flag_c(2, v40, v55, 0);
    v58 = v36 * v38;
    v59 = v43 + v58;
    v60 = arm64g_calculate_flag_c(2, v43, v58, 0);
    v61 = v20 * v38;
    v62 = v46 + v61;
    v63 = arm64g_calculate_flag_c(2, v46, v61, 0);
    v64 = v8 * v38;
    v65 = v49 + v64;
    v66 = arm64g_calculate_flag_c(2, v49, v64, 0);
    v67 = v9 * v38;
    v68 = v52 + v67;
    v69 = arm64g_calculate_flag_c(2, v52, v67, 0);
    v70 = (long long)a1[32];
    v71 = 19 * v9;
    v72 = v71 * v70;
    v73 = v56 + v72;
    v74 = arm64g_calculate_flag_c(2, v56, v72, 0);
    v75 = v54 * v70;
    v76 = v59 + v75;
    v77 = arm64g_calculate_flag_c(2, v59, v75, 0);
    v78 = (v11 * v8 >> 64) + (v9 * v10 >> 64) + v26 + (v37 * v20 >> 64) + v44 + (v38 * v36 >> 64) + v60 + (v70 * v54 >> 64) + v77;
    v79 = v36 * v70;
    v80 = v62 + v79;
    v81 = arm64g_calculate_flag_c(2, v62, v79, 0);
    v82 = v20 * v70;
    v83 = v65 + v82;
    v84 = arm64g_calculate_flag_c(2, v65, v82, 0);
    v85 = (v11 * v14 >> 64) + (v15 * v10 >> 64) + v32 + (v37 * v9 >> 64) + v50 + (v38 * v8 >> 64) + v66 + (v70 * v20 >> 64) + v84;
    v86 = v8 * v70;
    v87 = v68 + v86;
    v88 = arm64g_calculate_flag_c(2, v68, v86, 0);
    v89 = (v11 * v15 >> 64) + (v18 * v10 >> 64) + v35 + (v37 * v14 >> 64) + v53 + (v38 * v9 >> 64) + v69 + (v70 * v8 >> 64) + v88;
    v90 = ((v11 * v9 >> 64) + (v14 * v10 >> 64) + v29 + (v37 * v8 >> 64) + v47 + (v38 * v20 >> 64) + v63 + (v70 * v36 >> 64) + v81) * 0x2000 | v80 >> 0x33;
    v91 = v83 + v90;
    v92 = arm64g_calculate_condition(50, v83, v90, 0);
    if (!(v92 & 1))
        v85 += 1;
    v93 = ((v11 * v20 >> 64) + (v8 * v10 >> 64) + v23 + (v37 * v36 >> 64) + v41 + (v38 * v54 >> 64) + v57 + (v70 * v71 >> 64) + v74) * 0x2000 | v73 >> 0x33;
    v94 = v76 + v93;
    v95 = arm64g_calculate_condition(50, v76, v93, 0);
    if (!(v95 & 1))
        v78 += 1;
    v96 = v85 * 0x2000 | v91 >> 0x33;
    v97 = v87 + v96;
    v98 = arm64g_calculate_condition(50, v87, v96, 0);
    if (!(v98 & 1))
        v89 += 1;
    v99 = (v80 & 0x7ffffffffffff) + (v78 * 0x2000 | v94 >> 0x33);
    v100 = (v73 & 0x7ffffffffffff) + 19 * (v89 * 0x2000 | v97 >> 0x33);
    a0->field_0 = v100 & 0x7ffffffffffff;
    a0->field_8 = (v94 & 0x7ffffffffffff) + (v100 >> 0x33);
    a0->field_10 = v99 & 0x7ffffffffffff;
    a0->field_18 = (v91 & 0x7ffffffffffff) + (v99 >> 0x33);
    a0->field_20 = v97 & 0x7ffffffffffff;
    return a0;
}
