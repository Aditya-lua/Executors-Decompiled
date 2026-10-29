/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa21010..0xa211f0 (480 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_a21010(unsigned long long *a0, unsigned long a1, unsigned long long *a2, unsigned long long a3, uint128_t a4, uint128_t a5, uint128_t a6, uint128_t a7)
{
    unsigned long long v0;  // x14
    unsigned long v1;  // x8
    unsigned long v10;  // 4379
    unsigned long v100;  // 4674
    unsigned long long v101;  // x15
    unsigned long long v102;  // x9
    unsigned long v103;  // 4685
    unsigned long long v104;  // x16
    unsigned long long v105;  // x10
    unsigned long v106;  // 4696
    unsigned long long v107;  // x17
    unsigned long long v108;  // x11
    unsigned long v109;  // 4707
    unsigned long long v11;  // x16
    unsigned long long v110;  // x14
    unsigned long v111;  // x8
    unsigned long v112;  // 4718
    unsigned long long v113;  // x15
    unsigned long v114;  // x9
    unsigned long v115;  // 4729
    unsigned long long v116;  // x16
    unsigned long v117;  // x10
    unsigned long v118;  // 4740
    unsigned long long v119;  // x17
    unsigned long long v12;  // x9
    unsigned long v120;  // x11
    unsigned long v121;  // 4751
    unsigned long long v122;  // x19
    unsigned long long v123;  // x15
    unsigned long long v124;  // x8
    unsigned long v125;  // 4760
    unsigned long long v126;  // x16
    unsigned long long v127;  // x9
    unsigned long v128;  // 4769
    unsigned long long v129;  // x17
    unsigned long v13;  // 4388
    unsigned long v130;  // 4776
    unsigned long long v131;  // x19
    unsigned long v132;  // 4783
    unsigned long long v133;  // x10
    unsigned long long v134;  // 4150
    unsigned long long v135;  // x11
    unsigned long long v136;  // x14
    unsigned long v137;  // 4158
    unsigned long long v138;  // x15
    unsigned long v139;  // 4165
    unsigned long long v14;  // x17
    unsigned long long v140;  // x16
    unsigned long v141;  // 4172
    unsigned long long v142;  // x17
    unsigned long v143;  // 4179
    unsigned long long v144;  // x19
    unsigned long long v145;  // 4186
    unsigned long v146;  // x12
    unsigned long long v147;  // 4194
    unsigned long long v148;  // x10
    unsigned long long v149;  // 4202
    unsigned long v15;  // 4395
    unsigned long v150;  // x13
    unsigned long v151;  // 4210
    unsigned long v152;  // cc_dep1
    unsigned long v153;  // cc_ndep
    unsigned long long v154;  // 4223
    unsigned long long v155;  // x14
    unsigned long long v156;  // 4105
    unsigned long long v157;  // 4105
    unsigned long long v158;  // x15
    unsigned long long v159;  // 4105
    unsigned long long v16;  // x19
    unsigned long long v160;  // 4105
    unsigned long long v161;  // 4113
    unsigned long long v17;  // x10
    unsigned long long v18;  // 4402
    unsigned long long v19;  // x11
    unsigned long long v2;  // x15
    unsigned long long v20;  // x14
    unsigned long long v21;  // x8
    unsigned long v22;  // 4414
    unsigned long long v23;  // x15
    unsigned long long v24;  // x9
    unsigned long v25;  // 4425
    unsigned long long v26;  // x16
    unsigned long long v27;  // x10
    unsigned long v28;  // 4436
    unsigned long long v29;  // x17
    unsigned long v3;  // x9
    unsigned long long v30;  // x11
    unsigned long v31;  // 4447
    unsigned long long v32;  // x14
    unsigned long v33;  // x8
    unsigned long v34;  // 4458
    unsigned long long v35;  // x15
    unsigned long v36;  // x9
    unsigned long v37;  // 4469
    unsigned long long v38;  // x16
    unsigned long v39;  // x10
    unsigned long long v4;  // x16
    unsigned long v40;  // 4480
    unsigned long long v41;  // x17
    unsigned long v42;  // x11
    unsigned long v43;  // 4491
    unsigned long long v44;  // x19
    unsigned long long v45;  // x3
    unsigned long long v46;  // x15
    unsigned long long v47;  // x8
    unsigned long v48;  // 4502
    unsigned long long v49;  // x16
    unsigned long v5;  // x10
    unsigned long long v50;  // x9
    unsigned long v51;  // 4511
    unsigned long long v52;  // x17
    unsigned long v53;  // 4518
    unsigned long long v54;  // x19
    unsigned long v55;  // 4525
    unsigned long long v56;  // x10
    unsigned long long v57;  // 4532
    unsigned long long v58;  // x11
    unsigned long long v59;  // x14
    unsigned long long v6;  // x17
    unsigned long long v60;  // x8
    unsigned long v61;  // 4544
    unsigned long long v62;  // x15
    unsigned long long v63;  // x9
    unsigned long v64;  // 4555
    unsigned long long v65;  // x16
    unsigned long long v66;  // x10
    unsigned long v67;  // 4566
    unsigned long long v68;  // x17
    unsigned long long v69;  // x11
    unsigned long long v7;  // x3
    unsigned long v70;  // 4577
    unsigned long long v71;  // x14
    unsigned long v72;  // x8
    unsigned long v73;  // 4588
    unsigned long long v74;  // x15
    unsigned long v75;  // x9
    unsigned long v76;  // 4599
    unsigned long long v77;  // x16
    unsigned long v78;  // x10
    unsigned long v79;  // 4610
    unsigned long long v8;  // x15
    unsigned long long v80;  // x17
    unsigned long v81;  // x11
    unsigned long v82;  // 4621
    unsigned long long v83;  // x19
    unsigned long long v84;  // x3
    unsigned long long v85;  // x15
    unsigned long long v86;  // x8
    unsigned long v87;  // 4632
    unsigned long long v88;  // x16
    unsigned long long v89;  // x9
    unsigned long long v9;  // x8
    unsigned long v90;  // 4641
    unsigned long long v91;  // x17
    unsigned long v92;  // 4648
    unsigned long long v93;  // x19
    unsigned long v94;  // 4655
    unsigned long long v95;  // x10
    unsigned long long v96;  // 4662
    unsigned long long v97;  // x11
    unsigned long long v98;  // x14
    unsigned long long v99;  // x8

    v0 = a3 * a4;
    v1 = a4 * a3 >> 64;
    v2 = a3 * a5;
    v3 = a5 * a3 >> 64;
    v4 = a3 * a6;
    v5 = a6 * a3 >> 64;
    v6 = a3 * a7;
    v7 = a2[1];
    v8 = v2 + v1;
    v9 = v0 * 0x100000000;
    v10 = arm64g_calculate_flag_c(2, v2, v1, 0);
    v11 = v4 + v3 + v10;
    v12 = v0 >> 32;
    v13 = arm64g_calculate_flag_c(6, v4, v3, v10);
    v14 = v6 + v5 + v13;
    v15 = arm64g_calculate_flag_c(6, v6, v5, v13);
    v16 = (unsigned long long)(a7 * a3 >> 64) + v15;
    v17 = v0 - v9;
    v18 = arm64g_calculate_flag_c(4, v0, v9, 0);
    v19 = v0 - v12 - (v18 ^ 1);
    v20 = v8 + v9;
    v21 = v7 * a4;
    v22 = arm64g_calculate_flag_c(2, v8, v9, 0);
    v23 = v11 + v12 + v22;
    v24 = v7 * a5;
    v25 = arm64g_calculate_flag_c(6, v11, v12, v22);
    v26 = v14 + v17 + v25;
    v27 = v7 * a6;
    v28 = arm64g_calculate_flag_c(6, v14, v17, v25);
    v29 = v16 + v19 + v28;
    v30 = v7 * a7;
    v31 = arm64g_calculate_flag_c(6, v16, v19, v28);
    v32 = v20 + v21;
    v33 = a4 * v7 >> 64;
    v34 = arm64g_calculate_flag_c(2, v20, v21, 0);
    v35 = v23 + v24 + v34;
    v36 = a5 * v7 >> 64;
    v37 = arm64g_calculate_flag_c(6, v23, v24, v34);
    v38 = v26 + v27 + v37;
    v39 = a6 * v7 >> 64;
    v40 = arm64g_calculate_flag_c(6, v26, v27, v37);
    v41 = v29 + v30 + v40;
    v42 = a7 * v7 >> 64;
    v43 = arm64g_calculate_flag_c(6, v29, v30, v40);
    v44 = 0 + v31 + v43;
    v45 = a2[2];
    v46 = v35 + v33;
    v47 = v32 * 0x100000000;
    v48 = arm64g_calculate_flag_c(2, v35, v33, 0);
    v49 = v38 + v36 + v48;
    v50 = v32 >> 32;
    v51 = arm64g_calculate_flag_c(6, v38, v36, v48);
    v52 = v41 + v39 + v51;
    v53 = arm64g_calculate_flag_c(6, v41, v39, v51);
    v54 = v44 + v42 + v53;
    v55 = arm64g_calculate_flag_c(6, v44, v42, v53);
    v56 = v32 - v47;
    v57 = arm64g_calculate_flag_c(4, v32, v47, 0);
    v58 = v32 - v50 - (v57 ^ 1);
    v59 = v46 + v47;
    v60 = v45 * a4;
    v61 = arm64g_calculate_flag_c(2, v46, v47, 0);
    v62 = v49 + v50 + v61;
    v63 = v45 * a5;
    v64 = arm64g_calculate_flag_c(6, v49, v50, v61);
    v65 = v52 + v56 + v64;
    v66 = v45 * a6;
    v67 = arm64g_calculate_flag_c(6, v52, v56, v64);
    v68 = v54 + v58 + v67;
    v69 = v45 * a7;
    v70 = arm64g_calculate_flag_c(6, v54, v58, v67);
    v71 = v59 + v60;
    v72 = a4 * v45 >> 64;
    v73 = arm64g_calculate_flag_c(2, v59, v60, 0);
    v74 = v62 + v63 + v73;
    v75 = a5 * v45 >> 64;
    v76 = arm64g_calculate_flag_c(6, v62, v63, v73);
    v77 = v65 + v66 + v76;
    v78 = a6 * v45 >> 64;
    v79 = arm64g_calculate_flag_c(6, v65, v66, v76);
    v80 = v68 + v69 + v79;
    v81 = a7 * v45 >> 64;
    v82 = arm64g_calculate_flag_c(6, v68, v69, v79);
    v83 = v55 + v70 + v82;
    v84 = a2[3];
    v85 = v74 + v72;
    v86 = v71 * 0x100000000;
    v87 = arm64g_calculate_flag_c(2, v74, v72, 0);
    v88 = v77 + v75 + v87;
    v89 = v71 >> 32;
    v90 = arm64g_calculate_flag_c(6, v77, v75, v87);
    v91 = v80 + v78 + v90;
    v92 = arm64g_calculate_flag_c(6, v80, v78, v90);
    v93 = v83 + v81 + v92;
    v94 = arm64g_calculate_flag_c(6, v83, v81, v92);
    v95 = v71 - v86;
    v96 = arm64g_calculate_flag_c(4, v71, v86, 0);
    v97 = v71 - v89 - (v96 ^ 1);
    v98 = v85 + v86;
    v99 = v84 * a4;
    v100 = arm64g_calculate_flag_c(2, v85, v86, 0);
    v101 = v88 + v89 + v100;
    v102 = v84 * a5;
    v103 = arm64g_calculate_flag_c(6, v88, v89, v100);
    v104 = v91 + v95 + v103;
    v105 = v84 * a6;
    v106 = arm64g_calculate_flag_c(6, v91, v95, v103);
    v107 = v93 + v97 + v106;
    v108 = v84 * a7;
    v109 = arm64g_calculate_flag_c(6, v93, v97, v106);
    v110 = v98 + v99;
    v111 = a4 * v84 >> 64;
    v112 = arm64g_calculate_flag_c(2, v98, v99, 0);
    v113 = v101 + v102 + v112;
    v114 = a5 * v84 >> 64;
    v115 = arm64g_calculate_flag_c(6, v101, v102, v112);
    v116 = v104 + v105 + v115;
    v117 = a6 * v84 >> 64;
    v118 = arm64g_calculate_flag_c(6, v104, v105, v115);
    v119 = v107 + v108 + v118;
    v120 = a7 * v84 >> 64;
    v121 = arm64g_calculate_flag_c(6, v107, v108, v118);
    v122 = v94 + v109 + v121;
    v123 = v113 + v111;
    v124 = v110 * 0x100000000;
    v125 = arm64g_calculate_flag_c(2, v113, v111, 0);
    v126 = v116 + v114 + v125;
    v127 = v110 >> 32;
    v128 = arm64g_calculate_flag_c(6, v116, v114, v125);
    v129 = v119 + v117 + v128;
    v130 = arm64g_calculate_flag_c(6, v119, v117, v128);
    v131 = v122 + v120 + v130;
    v132 = arm64g_calculate_flag_c(6, v122, v120, v130);
    v133 = v110 - v124;
    v134 = arm64g_calculate_flag_c(4, v110, v124, 0);
    v135 = v110 - v127 - (v134 ^ 1);
    v136 = v123 + v124;
    v137 = arm64g_calculate_flag_c(2, v123, v124, 0);
    v138 = v126 + v127 + v137;
    v139 = arm64g_calculate_flag_c(6, v126, v127, v137);
    v140 = v129 + v133 + v139;
    v141 = arm64g_calculate_flag_c(6, v129, v133, v139);
    v142 = v131 + v135 + v141;
    v143 = arm64g_calculate_flag_c(6, v131, v135, v141);
    v144 = v132 + v143;
    v145 = arm64g_calculate_flag_c(2, v136, 1, 0);
    v147 = arm64g_calculate_flag_c(8, v138, v146, v145);
    v148 = v140 - (v147 ^ 1);
    v149 = arm64g_calculate_flag_c(8, v140, 0, v147);
    v151 = arm64g_calculate_flag_c(8, v142, v150, v149);
    v152 = v144;
    v153 = v151;
    v154 = arm64g_calculate_condition(56, v144, 0, v151);
    if (v154 & 1)
    {
        v155 = v136;
        v156 = arm64g_calculate_condition(56, v152, 0, v153);
        if (!(v156 & 1))
            goto LABEL_a211d2;
LABEL_a211d1:
        v158 = v138;
        v159 = arm64g_calculate_condition(56, v152, 0, v153);
        if (!(v159 & 1))
            goto LABEL_a211d6;
LABEL_a211d5:
    }
    else
    {
        v155 = v136 + 1;
        v157 = arm64g_calculate_condition(56, v152, 0, v153);
        if (v157 & 1)
            goto LABEL_a211d1;
LABEL_a211d2:
        v158 = v138 - v146 - (v145 ^ 1);
        v160 = arm64g_calculate_condition(56, v152, 0, v153);
        if (v160 & 1)
            goto LABEL_a211d5;
LABEL_a211d6:
        v140 = v148;
    }
    *a0 = v155;
    a0[1] = v158;
    v161 = arm64g_calculate_condition(56, v152, 0, v153);
    if (!(v161 & 1))
        v142 = v142 - v150 - (v149 ^ 1);
    a0[2] = v140;
    a0[3] = v142;
    return a0;
}
