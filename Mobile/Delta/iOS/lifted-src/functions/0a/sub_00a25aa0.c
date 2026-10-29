/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa25aa0..0xa25d10 (624 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_a25aa0(unsigned long long *a0, void* a1)
{
    unsigned long long v11;  // x30
    unsigned long long v12;  // x16
    unsigned long v21;  // x9
    unsigned long long v111;  // x7
    unsigned long long v112;  // x4
    unsigned long long v113;  // x9
    unsigned long long v114;  // x15
    unsigned long long v115;  // x12
    unsigned long v116;  // 4287
    unsigned long long v117;  // x4
    unsigned long v118;  // 4294
    unsigned long long v119;  // x11
    unsigned long v120;  // 4301
    unsigned long v22;  // x3
    unsigned long long v121;  // x14
    unsigned long v122;  // 4308
    unsigned long long v123;  // x7
    unsigned long v124;  // 4323
    unsigned long long v125;  // x8
    unsigned long v126;  // 4330
    unsigned long long v127;  // x9
    unsigned long v128;  // 4337
    unsigned long long v129;  // x10
    unsigned long v130;  // 4344
    unsigned long long v23;  // x9
    unsigned long long v131;  // x8
    unsigned long long v132;  // 4351
    unsigned long long v133;  // x9
    unsigned long long v134;  // 4359
    unsigned long long v135;  // x10
    unsigned long long v136;  // 4367
    unsigned long long v137;  // x3
    unsigned long long v138;  // x4
    unsigned long long v139;  // x5
    unsigned long long v140;  // x7
    unsigned long v24;  // 4445
    unsigned long v141;  // 4377
    unsigned long long v142;  // x8
    unsigned long v143;  // 4384
    unsigned long long v144;  // x9
    unsigned long v145;  // 4391
    unsigned long long v146;  // x10
    unsigned long long v147;  // 4406
    unsigned long long v148;  // x16
    unsigned long long v149;  // 4413
    unsigned long long v150;  // 4421
    unsigned long long v25;  // x10
    unsigned long long v151;  // 4429
    unsigned long long v152;  // x10
    unsigned long v153;  // 4437
    unsigned long v154;  // cc_dep1
    unsigned long v155;  // cc_ndep
    unsigned long long v156;  // 4450
    unsigned long long v157;  // x7
    unsigned long long v158;  // 4105
    unsigned long long v159;  // 4105
    unsigned long long v160;  // x8
    unsigned long v26;  // x3
    unsigned long long v161;  // 4105
    unsigned long long v162;  // 4105
    unsigned long long v163;  // x9
    unsigned long long v164;  // 4105
    unsigned long long v165;  // 4105
    unsigned long long v27;  // x10
    unsigned long v28;  // 4460
    unsigned long long v29;  // x7
    unsigned long v30;  // x3
    unsigned long long v13;  // x17
    unsigned long v31;  // x4
    unsigned long long v32;  // x10
    unsigned long v33;  // 4475
    unsigned long long v34;  // x7
    unsigned long v35;  // 4482
    unsigned long v36;  // x3
    unsigned long long v37;  // x7
    unsigned long v38;  // 4497
    unsigned long long v39;  // x5
    unsigned long v40;  // x3
    unsigned long long v14;  // x19
    unsigned long long v41;  // x5
    unsigned long v42;  // 4512
    unsigned long long v43;  // x6
    unsigned long long v44;  // x8
    unsigned long v45;  // 4519
    unsigned long long v46;  // x9
    unsigned long v47;  // 4526
    unsigned long long v48;  // x10
    unsigned long v49;  // 4533
    unsigned long long v50;  // x7
    unsigned long long v15;  // x20
    unsigned long v51;  // 4540
    unsigned long long v52;  // x5
    unsigned long v53;  // 4547
    unsigned long long v54;  // x6
    unsigned long v55;  // 4554
    unsigned long v56;  // x17
    unsigned long v57;  // x11
    unsigned long v58;  // x12
    unsigned long v59;  // x3
    unsigned long v60;  // x4
    unsigned long v16;  // x11
    unsigned long v61;  // x19
    unsigned long long v62;  // x8
    unsigned long v63;  // 4593
    unsigned long long v64;  // x9
    unsigned long v65;  // 4600
    unsigned long long v66;  // x10
    unsigned long v67;  // 4607
    unsigned long v68;  // 4614
    unsigned long v69;  // 4621
    unsigned long v70;  // 4628
    unsigned long v17;  // x12
    unsigned long long v71;  // x11
    unsigned long v72;  // x7
    unsigned long long v73;  // x12
    unsigned long long v74;  // x13
    unsigned long long v75;  // x14
    unsigned long long v76;  // x5
    unsigned long v77;  // 4635
    unsigned long long v78;  // x5
    unsigned long v79;  // 4642
    unsigned long long v80;  // x4
    unsigned long v18;  // x13
    unsigned long long v81;  // x6
    unsigned long v82;  // 4649
    unsigned long long v83;  // x6
    unsigned long v84;  // 4656
    unsigned long long v85;  // x15
    unsigned long v86;  // 4663
    unsigned long v87;  // 4670
    unsigned long v88;  // 4677
    unsigned long long v89;  // x10
    unsigned long v90;  // 4684
    unsigned long v19;  // x14
    unsigned long v91;  // 4691
    unsigned long long v92;  // x7
    unsigned long long v93;  // x8
    unsigned long long v94;  // x10
    unsigned long long v95;  // x11
    unsigned long long v96;  // x12
    unsigned long long v97;  // x13
    unsigned long long v98;  // x14
    unsigned long long v99;  // x4
    unsigned long long v100;  // x5
    unsigned long v20;  // x8
    unsigned long long v101;  // x6
    unsigned long long v102;  // x15
    unsigned long long v103;  // x14
    unsigned long long v104;  // x9
    unsigned long long v105;  // x8
    unsigned long long v106;  // x9
    unsigned long long v107;  // x6
    unsigned long long v108;  // x11
    unsigned long long v109;  // x12
    unsigned long long v110;  // x4
    char *v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    unsigned long long v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    v0 = &v10;
    v1 = v11;
    v2 = v12;
    v3 = v13;
    v8 = v14;
    v9 = v15;
    v16 = *(long long *)a1;
    v17 = (long long)a1[8];
    v18 = (long long)a1[16];
    v19 = (long long)a1[24];
    v20 = v17 * v16;
    v21 = v16 * v17 >> 64;
    v22 = v16 * v18;
    v23 = v21 + v22;
    v24 = arm64g_calculate_flag_c(2, v21, v22, 0);
    v25 = (v18 * v16 >> 64) + v24;
    v26 = v16 * v19;
    v27 = v25 + v26;
    v28 = arm64g_calculate_flag_c(2, v25, v26, 0);
    v29 = (v19 * v16 >> 64) + v28;
    v30 = v17 * v18;
    v31 = v18 * v17 >> 64;
    v32 = v27 + v30;
    v33 = arm64g_calculate_flag_c(2, v27, v30, 0);
    v34 = v29 + v31 + v33;
    v35 = arm64g_calculate_flag_c(6, v29, v31, v33);
    v36 = v17 * v19;
    v37 = v34 + v36;
    v38 = arm64g_calculate_flag_c(2, v34, v36, 0);
    v39 = v35 + (v19 * v17 >> 64) + v38;
    v40 = v18 * v19;
    v41 = v39 + v40;
    v42 = arm64g_calculate_flag_c(2, v39, v40, 0);
    v43 = (v19 * v18 >> 64) + v42;
    v44 = v20 * 2;
    v45 = arm64g_calculate_flag_c(2, v20, v20, 0);
    v46 = v23 * 2 + v45;
    v47 = arm64g_calculate_flag_c(6, v23, v23, v45);
    v48 = v32 * 2 + v47;
    v49 = arm64g_calculate_flag_c(6, v32, v32, v47);
    v50 = v37 * 2 + v49;
    v51 = arm64g_calculate_flag_c(6, v37, v37, v49);
    v52 = v41 * 2 + v51;
    v53 = arm64g_calculate_flag_c(6, v41, v41, v51);
    v54 = v43 * 2 + v53;
    v55 = arm64g_calculate_flag_c(6, v43, v43, v53);
    v56 = v16 * v16 >> 64;
    v57 = v17 * v17;
    v58 = v17 * v17 >> 64;
    v59 = v18 * v18;
    v60 = v18 * v18 >> 64;
    v61 = v19 * v19;
    v62 = v44 + v56;
    v63 = arm64g_calculate_flag_c(2, v44, v56, 0);
    v64 = v46 + v57 + v63;
    v65 = arm64g_calculate_flag_c(6, v46, v57, v63);
    v66 = v48 + v58 + v65;
    v67 = arm64g_calculate_flag_c(6, v48, v58, v65);
    v68 = arm64g_calculate_flag_c(6, v50, v59, v67);
    v69 = arm64g_calculate_flag_c(6, v52, v60, v68);
    v70 = arm64g_calculate_flag_c(6, v54, v61, v69);
    v71 = v50 + v59 + v67;
    v72 = v16 * v16;
    v73 = v52 + v60 + v68;
    v74 = v54 + v61 + v69;
    v75 = v55 + (v19 * v19 >> 64) + v70;
    v76 = v74 + v75;
    v77 = arm64g_calculate_flag_c(2, v74, v75, 0);
    v78 = v76 + v75;
    v79 = arm64g_calculate_flag_c(2, v76, v75, 0);
    v80 = v77 + v79;
    v81 = v71 + v78;
    v82 = arm64g_calculate_flag_c(2, v71, v78, 0);
    v83 = v81 + v73;
    v84 = arm64g_calculate_flag_c(2, v81, v73, 0);
    v85 = v80 + v82 + v84;
    v86 = arm64g_calculate_flag_c(2, v72, v83, 0);
    v87 = arm64g_calculate_flag_c(6, v62, v85, v86);
    v88 = arm64g_calculate_flag_c(6, v64, v78, v87);
    v89 = v66 + v75 + v88;
    v90 = arm64g_calculate_flag_c(6, v66, v75, v88);
    v91 = arm64g_calculate_flag_c(2, v89, v80, 0);
    v4 = v72 + v83;
    v5 = v62 + v85 + v86;
    v6 = v64 + v78 + v87;
    v7 = v89 + v80;
    v92 = v71 & 0xffffffff;
    v93 = v73 & 0xffffffff;
    v94 = v75 & 0xffffffff;
    v95 = v71 >> 32;
    v96 = v73 >> 32;
    v97 = v74 >> 32;
    v98 = v75 >> 32;
    v99 = v94 + (v74 & 0xffffffff);
    v100 = v98 + v97;
    v101 = v92 + v95;
    v102 = v94 + v93;
    v103 = v98 + v96;
    v104 = v100 + v99;
    v105 = v93 + v104 + v104 + v101 + v96;
    v106 = v104 + v97 + v96 + v92;
    v107 = v101 + v94 + v97;
    v108 = v95 + v100;
    v109 = v96 + v108 + v100;
    v110 = v99 + v102;
    v111 = v110 * 0x100000000;
    v112 = v106 * 0x100000000 | v110 >> 32;
    v113 = v102 * 0x100000000 | v106 >> 32;
    v114 = v105 * 0x100000000 | v102 >> 32;
    v115 = v109 + v111;
    v116 = arm64g_calculate_flag_c(2, v109, v111, 0);
    v117 = v112 + v116;
    v118 = arm64g_calculate_flag_c(6, v112, 0, v116);
    v119 = v108 + v113 + v118;
    v120 = arm64g_calculate_flag_c(6, v108, v113, v118);
    v121 = v103 + v114 + v120;
    v122 = arm64g_calculate_flag_c(6, v103, v114, v120);
    v123 = v4 + v115;
    v124 = arm64g_calculate_flag_c(2, v4, v115, 0);
    v125 = v5 + v117 + v124;
    v126 = arm64g_calculate_flag_c(6, v5, v117, v124);
    v127 = v6 + v119 + v126;
    v128 = arm64g_calculate_flag_c(6, v6, v119, v126);
    v129 = v7 + v121 + v128;
    v130 = arm64g_calculate_flag_c(6, v7, v121, v128);
    v131 = v125 - v107;
    v132 = arm64g_calculate_flag_c(4, v125, v107, 0);
    v133 = v127 - (v132 ^ 1);
    v134 = arm64g_calculate_flag_c(8, v127, 0, v132);
    v135 = v129 - (v134 ^ 1);
    v136 = arm64g_calculate_flag_c(8, v129, 0, v134);
    v137 = v90 + v91 + (v105 >> 32) + v122 + v130 - (v136 ^ 1);
    v138 = v137 * 0x100000000;
    v139 = v138 - v137;
    v140 = v123 + v137;
    v141 = arm64g_calculate_flag_c(2, v123, v137, 0);
    v142 = v131 + v139 + v141;
    v143 = arm64g_calculate_flag_c(6, v131, v139, v141);
    v144 = v133 + v143;
    v145 = arm64g_calculate_flag_c(6, v133, 0, v143);
    v146 = v135 + v138 + v145;
    v147 = arm64g_calculate_flag_c(6, v135, v138, v145);
    v148 = v147;
    v149 = arm64g_calculate_flag_c(4, v140, 0xffffffffffffffff, 0);
    v150 = arm64g_calculate_flag_c(8, v142, 0xffffffff00000000, v149);
    v151 = arm64g_calculate_flag_c(8, v144, 0xffffffffffffffff, v150);
    v152 = v146 + 4294967297 - (v151 ^ 1);
    v153 = arm64g_calculate_flag_c(8, v146, 0xfffffffeffffffff, v151);
    v154 = v148;
    v155 = v153;
    v156 = arm64g_calculate_condition(40, v148, 0, v153);
    if (v156 & 1)
    {
        v157 = v140 + 1;
        v158 = arm64g_calculate_condition(40, v154, 0, v155);
        if (!(v158 & 1))
            goto LABEL_a25cee;
LABEL_a25ced:
        v160 = v142 + 0x100000000 - (v149 ^ 1);
        v161 = arm64g_calculate_condition(40, v154, 0, v155);
        if (!(v161 & 1))
            goto LABEL_a25cf2;
LABEL_a25cf1:
        v163 = v144 + 1 - (v150 ^ 1);
        v164 = arm64g_calculate_condition(40, v154, 0, v155);
        if (!(v164 & 1))
            goto LABEL_a25cf6;
LABEL_a25cf5:
        v146 = v152;
    }
    else
    {
        v157 = v140;
        v159 = arm64g_calculate_condition(40, v154, 0, v155);
        if (v159 & 1)
            goto LABEL_a25ced;
LABEL_a25cee:
        v160 = v142;
        v162 = arm64g_calculate_condition(40, v154, 0, v155);
        if (v162 & 1)
            goto LABEL_a25cf1;
LABEL_a25cf2:
        v163 = v144;
        v165 = arm64g_calculate_condition(40, v154, 0, v155);
        if (v165 & 1)
            goto LABEL_a25cf5;
LABEL_a25cf6:
    }
    *a0 = v157;
    a0[1] = v160;
    a0[2] = v163;
    a0[3] = v146;
    return a0;
}
