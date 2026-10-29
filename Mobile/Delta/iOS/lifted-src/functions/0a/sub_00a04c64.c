/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa04c64..0xa04f78 (788 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a04c64_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
} st_a04c64_0;


st_a04c64_0 * sub_a04c64(st_a04c64_0 *a0, void* a1)
{
    unsigned long long v10;  // x28
    unsigned long long v11;  // x27
    unsigned long v20;  // x5
    unsigned long v110;  // 4298
    unsigned long long v111;  // x20
    unsigned long v112;  // x19
    unsigned long long v113;  // x19
    unsigned long long v114;  // 4313
    unsigned long long v115;  // x19
    unsigned long long v116;  // x7
    unsigned long v117;  // 4323
    unsigned long long v118;  // x23
    unsigned long long v119;  // x19
    unsigned long v21;  // x14
    unsigned long v120;  // 4338
    unsigned long long v121;  // x4
    unsigned long long v122;  // x4
    unsigned long v123;  // 4350
    unsigned long long v124;  // x19
    unsigned long long v125;  // x22
    unsigned long v126;  // x23
    unsigned long long v127;  // x22
    unsigned long v128;  // 4373
    unsigned long long v129;  // x14
    unsigned long v22;  // x16
    uint128_t v130;  // x16
    unsigned long v131;  // x21
    unsigned long long v132;  // x21
    unsigned long v133;  // x1
    unsigned long v134;  // 4396
    uint128_t v135;  // x23
    unsigned long long v136;  // x21
    unsigned long v137;  // 4411
    unsigned long long v138;  // x17
    unsigned long long v139;  // 4418
    unsigned long v23;  // x10
    unsigned long long v140;  // x21
    unsigned long long v141;  // x17
    unsigned long v142;  // 4434
    unsigned long long v143;  // x15
    unsigned long long v144;  // x15
    unsigned long v145;  // 4446
    unsigned long long v146;  // x13
    unsigned long v147;  // x17
    unsigned long long v148;  // x16
    unsigned long long v149;  // 4461
    unsigned long v24;  // x12
    unsigned long long v150;  // x16
    unsigned long v151;  // 4469
    unsigned long v152;  // x14
    unsigned long long v153;  // x14
    unsigned long v154;  // 4484
    unsigned long long v155;  // x10
    unsigned long long v156;  // x10
    unsigned long v157;  // 4499
    unsigned long long v158;  // x9
    unsigned long long v159;  // x9
    unsigned long v25;  // x4
    unsigned long long v160;  // x10
    unsigned long long v161;  // x11
    unsigned long v162;  // 4529
    unsigned long long v163;  // x8
    unsigned long long v164;  // x9
    unsigned long long v165;  // x8
    unsigned long long v166;  // x9
    unsigned long long v167;  // x10
    unsigned long long v168;  // 4552
    unsigned long long v169;  // x10
    unsigned long v26;  // x9
    unsigned long long v170;  // x11
    unsigned long long v171;  // 4133
    unsigned long long v172;  // x11
    uint128_t v27;  // x6
    unsigned long v28;  // x8
    unsigned long v29;  // x17
    unsigned long long v12;  // x26
    uint128_t v30;  // x1
    uint128_t v31;  // x15
    uint128_t v32;  // x13
    uint128_t v33;  // x3
    unsigned long v34;  // x19
    unsigned long v35;  // x21
    unsigned long long v36;  // x12
    unsigned long v37;  // 4393
    unsigned long long v38;  // x20
    uint128_t v39;  // x11
    unsigned long long v13;  // x25
    unsigned long v40;  // x23
    unsigned long long v41;  // x3
    unsigned long long v42;  // 4416
    unsigned long long v43;  // x11
    unsigned long v44;  // 4424
    unsigned long long v45;  // x2
    unsigned long long v46;  // x12
    unsigned long v47;  // 4431
    unsigned long long v48;  // x12
    unsigned long v49;  // 4438
    unsigned long long v14;  // x24
    unsigned long long v50;  // x3
    unsigned long long v51;  // x7
    unsigned long long v52;  // x3
    unsigned long long v53;  // x20
    uint128_t v54;  // x20
    unsigned long long v55;  // x22
    unsigned long v56;  // x22
    uint128_t v57;  // x25
    unsigned long long v58;  // x20
    unsigned long v59;  // 4483
    unsigned long long v15;  // x23
    unsigned long long v60;  // x7
    unsigned long v61;  // 4490
    unsigned long long v62;  // x20
    unsigned long long v63;  // x2
    unsigned long v64;  // x24
    unsigned long v65;  // x25
    uint128_t v66;  // x27
    unsigned long long v67;  // x27
    unsigned long long v68;  // 4519
    unsigned long long v69;  // x22
    unsigned long long v16;  // x22
    unsigned long v70;  // x27
    unsigned long v71;  // 4531
    unsigned long v72;  // x28
    unsigned long long v73;  // x2
    unsigned long v74;  // 4550
    unsigned long v75;  // x23
    unsigned long long v76;  // x2
    unsigned long v77;  // 4561
    unsigned long long v78;  // x2
    unsigned long v79;  // 4568
    unsigned long long v17;  // x21
    unsigned long long v80;  // x19
    unsigned long v81;  // x21
    unsigned long long v82;  // x21
    unsigned long v83;  // 4583
    unsigned long long v84;  // x21
    unsigned long long v85;  // 4590
    unsigned long long v86;  // x21
    unsigned long long v87;  // 4598
    unsigned long long v88;  // x3
    unsigned long v89;  // 4606
    unsigned long long v18;  // x20
    unsigned long long v90;  // x22
    unsigned long long v91;  // x7
    uint128_t v92;  // x23
    unsigned long long v93;  // x20
    unsigned long long v94;  // x21
    unsigned long v95;  // x24
    unsigned long long v96;  // x25
    unsigned long long v97;  // x6
    unsigned long long v98;  // x26
    unsigned long long v99;  // x26
    unsigned long long v19;  // x19
    unsigned long long v100;  // 4641
    unsigned long long v101;  // x26
    unsigned long v102;  // x27
    unsigned long v103;  // 4653
    unsigned long v104;  // x7
    unsigned long long v105;  // x7
    unsigned long v106;  // 4284
    unsigned long long v107;  // x5
    unsigned long long v108;  // x5
    unsigned long long v109;  // x7
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    unsigned long long v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]

    v0 = v10;
    v1 = v11;
    v2 = v12;
    v3 = v13;
    v4 = v14;
    v5 = v15;
    v6 = v16;
    v7 = v17;
    v8 = v18;
    v9 = v19;
    v20 = *(long long *)a1;
    v21 = (long long)a1[8];
    v22 = (long long)a1[16];
    v23 = (long long)a1[24];
    v24 = v20 * v23;
    v25 = (long long)a1[32];
    v26 = (long long)a1[40];
    v27 = v25 + v20;
    v28 = (long long)a1[48];
    v29 = (long long)a1[56];
    v30 = v29 + v23;
    v31 = v26 + v21;
    v32 = v28 + v22;
    v33 = v27 * v30;
    v34 = v25 * v29;
    v35 = v21 * v22;
    v36 = v35 + v24;
    v37 = arm64g_calculate_flag_c(2, v35, v24, 0);
    v38 = (v22 * v21 >> 64) + (v23 * v20 >> 64) + v37;
    v39 = v31 * v32;
    v40 = v26 * v28;
    v41 = v33 - v36;
    v42 = arm64g_calculate_flag_c(4, v33, v36, 0);
    v43 = v41 + v39;
    v44 = arm64g_calculate_flag_c(2, v41, v39, 0);
    v45 = (unsigned long long)(v30 * v27 >> 64) - v38 - (v42 ^ 1) + (unsigned long long)(v32 * v31 >> 64) + v44;
    v46 = v36 + v34;
    v47 = arm64g_calculate_flag_c(2, v36, v34, 0);
    v48 = v46 + v40;
    v49 = arm64g_calculate_flag_c(2, v46, v40, 0);
    v50 = v38 + (v29 * v25 >> 64) + v47 + (v28 * v26 >> 64) + v49;
    v51 = v45 * 0x200 | v43 >> 55;
    v52 = v50 * 0x200 | v48 >> 55;
    v53 = v31 * 2;
    v54 = v30 * v53;
    v55 = v26 * 2;
    v56 = v29 * v55;
    v57 = v32 * v32;
    v58 = v57 + v54;
    v59 = arm64g_calculate_flag_c(2, v57, v54, 0);
    v60 = v58 + v51;
    v61 = arm64g_calculate_flag_c(2, v58, v51, 0);
    v62 = (unsigned long long)(v32 * v32 >> 64) + (unsigned long long)(v53 * v30 >> 64) + v59 + (v45 >> 55) + v61;
    v63 = v21 * 2;
    v64 = v20 * v20 >> 64;
    v65 = v20 * v20;
    v66 = v27 * v27;
    v67 = v66 - v65;
    v68 = arm64g_calculate_flag_c(4, v66, v65, 0);
    v69 = v67 + v56;
    v70 = v28 * v28;
    v71 = arm64g_calculate_flag_c(2, v67, v56, 0);
    v72 = v23 * v63;
    v73 = v69 + v70;
    v74 = arm64g_calculate_flag_c(2, v69, v70, 0);
    v75 = v22 * v22;
    v76 = v73 + v60;
    v77 = arm64g_calculate_flag_c(2, v73, v60, 0);
    v78 = v76 + v52;
    v79 = arm64g_calculate_flag_c(2, v76, v52, 0);
    v80 = (unsigned long long)(v27 * v27 >> 64) - v64 - (v68 ^ 1) + (v55 * v29 >> 64) + v71 + (v28 * v28 >> 64) + v74 + v62 + v77 + (v50 >> 55) + v79;
    v81 = v25 * v25;
    v82 = v81 + v65;
    v83 = arm64g_calculate_flag_c(2, v81, v65, 0);
    v84 = v82 - v72;
    v85 = arm64g_calculate_flag_c(4, v82, v72, 0);
    v86 = v84 - v75;
    v87 = arm64g_calculate_flag_c(4, v84, v75, 0);
    v88 = v86 + v60;
    v89 = arm64g_calculate_flag_c(2, v86, v60, 0);
    v90 = (v25 * v25 >> 64) + v64 + v83 - (v63 * v23 >> 64) - (v85 ^ 1) - (v22 * v22 >> 64) - (v87 ^ 1) + v62 + v89;
    v91 = v32 * 2;
    v92 = v30 * v91;
    v93 = v28 * 2;
    v94 = v20 * 2;
    v95 = v21 * v94 >> 64;
    v96 = v94 * v21;
    v97 = v27 * 2;
    v98 = v97 * v31;
    v99 = v98 - v96;
    v100 = arm64g_calculate_flag_c(4, v98, v96, 0);
    v101 = v99 + v92;
    v102 = v91 * v30 >> 64;
    v103 = arm64g_calculate_flag_c(2, v99, v92, 0);
    v104 = v29 * v93;
    v105 = v101 + v104;
    v106 = arm64g_calculate_flag_c(2, v101, v104, 0);
    v107 = v80 * 0x100 | v78 >> 56;
    v108 = v105 + v107;
    v109 = v22 * 2;
    v110 = arm64g_calculate_flag_c(2, v105, v107, 0);
    v111 = (unsigned long long)(v31 * v97 >> 64) - v95 - (v100 ^ 1) + v102 + v103 + (v93 * v29 >> 64) + v106 + (v80 >> 56) + v110;
    v112 = v23 * v109;
    v113 = v96 - v112;
    v114 = arm64g_calculate_flag_c(4, v96, v112, 0);
    v115 = v113 + v92;
    v116 = v25 * 2;
    v117 = arm64g_calculate_flag_c(2, v113, v92, 0);
    v118 = v116 * v26;
    v119 = v115 + v118;
    v120 = arm64g_calculate_flag_c(2, v115, v118, 0);
    v121 = v90 * 0x100 | v88 >> 56;
    v122 = v119 + v121;
    v123 = arm64g_calculate_flag_c(2, v119, v121, 0);
    v124 = v95 - (v109 * v23 >> 64) - (v114 ^ 1) + v102 + v117 + (v26 * v116 >> 64) + v120 + (v90 >> 56) + v123;
    v125 = v94 * v22;
    v126 = v21 * v21;
    v127 = v125 + v126;
    v128 = arm64g_calculate_flag_c(2, v125, v126, 0);
    v129 = (v22 * v94 >> 64) + (v21 * v21 >> 64) + v128;
    v130 = v30 * v30;
    v131 = v29 * v29;
    v132 = v131 + v130;
    v133 = v30 * v30 >> 64;
    v134 = arm64g_calculate_flag_c(2, v131, v130, 0);
    v135 = v31 * v31;
    v136 = v132 + v135;
    v137 = arm64g_calculate_flag_c(2, v132, v135, 0);
    v138 = v136 - v127;
    v139 = arm64g_calculate_flag_c(4, v136, v127, 0);
    v140 = v97 * v32;
    v141 = v138 + v140;
    v142 = arm64g_calculate_flag_c(2, v138, v140, 0);
    v143 = v111 * 0x100 | v108 >> 56;
    v144 = v141 + v143;
    v145 = arm64g_calculate_flag_c(2, v141, v143, 0);
    v146 = (v29 * v29 >> 64) + v133 + v134 + (unsigned long long)(v31 * v31 >> 64) + v137 - v129 - (v139 ^ 1) + (unsigned long long)(v32 * v97 >> 64) + v142 + (v111 >> 56) + v145;
    v147 = v23 * v23;
    v148 = v130 - v147;
    v149 = arm64g_calculate_flag_c(4, v130, v147, 0);
    v150 = v148 + v127;
    v151 = arm64g_calculate_flag_c(2, v148, v127, 0);
    v152 = v26 * v26;
    v153 = v150 + v152;
    v154 = arm64g_calculate_flag_c(2, v150, v152, 0);
    v155 = v116 * v28;
    v156 = v153 + v155;
    v157 = arm64g_calculate_flag_c(2, v153, v155, 0);
    v158 = v124 * 0x100 | v122 >> 56;
    v159 = v156 + v158;
    v160 = (v48 * 2 | v48 >> 63) & 0xfffffffffffffe & 0xffffffffffffff;
    v161 = (v43 * 2 | v43 >> 63) & 0xfffffffffffffe & 0xffffffffffffff;
    v162 = arm64g_calculate_flag_c(2, v156, v158, 0);
    v163 = v133 - (v23 * v23 >> 64) - (v149 ^ 1) + v129 + v151 + (v26 * v26 >> 64) + v154 + (v28 * v116 >> 64) + v157 + (v124 >> 56) + v162;
    v164 = v163 * 0x100 | v159 >> 56;
    v165 = v163 >> 56;
    v166 = v164 + v160;
    v167 = v146 * 0x100 | v144 >> 56;
    v168 = arm64g_calculate_condition(50, v164, v160, 0);
    if (!(v168 & 1))
        v165 += 1;
    v169 = v167 + v161;
    a0->field_10 = v159 & 0xffffffffffffff;
    a0->field_18 = v166 & 0xffffffffffffff;
    v170 = v146 >> 56;
    v171 = arm64g_calculate_condition(50, v167, v161, 0);
    if (!(v171 & 1))
        v170 += 1;
    v172 = v170 * 0x100 | v169 >> 56;
    a0->field_30 = v144 & 0xffffffffffffff;
    a0->field_38 = v169 & 0xffffffffffffff;
    a0->field_20 = (v78 & 0xffffffffffffff) + (v165 * 0x100 | v166 >> 56) + v172;
    a0->field_28 = v108 & 0xffffffffffffff;
    a0->field_0 = (v88 & 0xffffffffffffff) + v172;
    a0->field_8 = v122 & 0xffffffffffffff;
    return a0;
}
