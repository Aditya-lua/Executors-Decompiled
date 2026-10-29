/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa257a0..0xa25aa0 (768 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_a257a0(unsigned long long *a0, void* a1, unsigned long long *a2)
{
    unsigned long long v11;  // x30
    unsigned long long v12;  // x16
    unsigned long long v21;  // x12
    unsigned long long v111;  // x9
    unsigned long long v112;  // x10
    unsigned long long v113;  // x5
    unsigned long v114;  // 4732
    unsigned long long v115;  // x5
    unsigned long v116;  // 4739
    unsigned long long v117;  // x4
    unsigned long long v118;  // x6
    unsigned long v119;  // 4746
    unsigned long long v120;  // x6
    unsigned long long v22;  // x13
    unsigned long v121;  // 4753
    unsigned long long v122;  // x15
    unsigned long v123;  // 4760
    unsigned long v124;  // 4767
    unsigned long v125;  // 4774
    unsigned long long v126;  // x10
    unsigned long v127;  // 4781
    unsigned long v128;  // 4376
    unsigned long long v129;  // x7
    unsigned long long v130;  // x8
    unsigned long long v23;  // x14
    unsigned long long v131;  // x10
    unsigned long long v132;  // x11
    unsigned long long v133;  // x12
    unsigned long long v134;  // x13
    unsigned long long v135;  // x14
    unsigned long long v136;  // x4
    unsigned long long v137;  // x5
    unsigned long long v138;  // x6
    unsigned long long v139;  // x15
    unsigned long long v140;  // x14
    unsigned long v24;  // x5
    unsigned long long v141;  // x9
    unsigned long long v142;  // x8
    unsigned long long v143;  // x9
    unsigned long long v144;  // x6
    unsigned long long v145;  // x11
    unsigned long long v146;  // x12
    unsigned long long v147;  // x4
    unsigned long long v148;  // x7
    unsigned long long v149;  // x4
    unsigned long long v150;  // x9
    unsigned long long v25;  // x3
    unsigned long long v151;  // x15
    unsigned long long v152;  // x12
    unsigned long v153;  // 4412
    unsigned long long v154;  // x4
    unsigned long v155;  // 4419
    unsigned long long v156;  // x11
    unsigned long v157;  // 4426
    unsigned long long v158;  // x14
    unsigned long v159;  // 4433
    unsigned long long v160;  // x7
    unsigned long long v26;  // x5
    unsigned long v161;  // 4448
    unsigned long long v162;  // x8
    unsigned long v163;  // 4455
    unsigned long long v164;  // x9
    unsigned long v165;  // 4462
    unsigned long long v166;  // x10
    unsigned long v167;  // 4469
    unsigned long long v168;  // x8
    unsigned long long v169;  // 4476
    unsigned long long v170;  // x9
    unsigned long v27;  // 4431
    unsigned long long v171;  // 4484
    unsigned long long v172;  // x10
    unsigned long long v173;  // 4492
    unsigned long long v174;  // x3
    unsigned long long v175;  // x4
    unsigned long long v176;  // x5
    unsigned long long v177;  // x7
    unsigned long v178;  // 4502
    unsigned long long v179;  // x8
    unsigned long v180;  // 4509
    unsigned long long v28;  // x6
    unsigned long long v181;  // x9
    unsigned long v182;  // 4516
    unsigned long long v183;  // x10
    unsigned long long v184;  // 4531
    unsigned long long v185;  // x16
    unsigned long long v186;  // 4538
    unsigned long long v187;  // 4546
    unsigned long long v188;  // 4554
    unsigned long long v189;  // x10
    unsigned long v190;  // 4562
    unsigned long long v29;  // x3
    unsigned long v191;  // cc_dep1
    unsigned long v192;  // cc_ndep
    unsigned long long v193;  // 4575
    unsigned long long v194;  // x7
    unsigned long long v195;  // 4105
    unsigned long long v196;  // 4105
    unsigned long long v197;  // x8
    unsigned long long v198;  // 4105
    unsigned long long v199;  // 4105
    unsigned long long v200;  // x9
    unsigned long v30;  // x4
    unsigned long long v201;  // 4105
    unsigned long long v202;  // 4105
    unsigned long long v13;  // x17
    unsigned long v31;  // 4446
    unsigned long long v32;  // x6
    unsigned long v33;  // 4453
    unsigned long long v34;  // x3
    unsigned long long v35;  // x6
    unsigned long v36;  // 4468
    unsigned long long v37;  // x15
    unsigned long long v38;  // x3
    unsigned long v39;  // x4
    unsigned long long v40;  // x6
    unsigned long long v14;  // x19
    unsigned long v41;  // 4483
    unsigned long long v42;  // x15
    unsigned long v43;  // 4490
    unsigned long long v44;  // x3
    unsigned long v45;  // x4
    unsigned long v46;  // 4505
    unsigned long long v47;  // x15
    unsigned long v48;  // 4512
    unsigned long long v49;  // x17
    unsigned long long v50;  // x3
    unsigned long long v15;  // x20
    unsigned long v51;  // x4
    unsigned long long v52;  // x15
    unsigned long v53;  // 4527
    unsigned long long v54;  // x17
    unsigned long v55;  // 4534
    unsigned long long v56;  // x3
    unsigned long v57;  // x4
    unsigned long long v58;  // x15
    unsigned long v59;  // 4549
    unsigned long long v60;  // x17
    unsigned long v16;  // x7
    unsigned long v61;  // 4556
    unsigned long long v62;  // x3
    unsigned long v63;  // x4
    unsigned long long v64;  // x15
    unsigned long v65;  // 4571
    unsigned long long v66;  // x17
    unsigned long v67;  // 4578
    unsigned long long v68;  // x3
    unsigned long v69;  // x4
    unsigned long v70;  // 4593
    unsigned long v17;  // x8
    unsigned long long v71;  // x17
    unsigned long v72;  // 4600
    unsigned long long v73;  // x19
    unsigned long long v74;  // x3
    unsigned long v75;  // x4
    unsigned long long v76;  // x17
    unsigned long v77;  // 4615
    unsigned long long v78;  // x19
    unsigned long v79;  // 4622
    unsigned long long v80;  // x3
    unsigned long v18;  // x9
    unsigned long v81;  // x4
    unsigned long long v82;  // x17
    unsigned long v83;  // 4637
    unsigned long long v84;  // x19
    unsigned long v85;  // 4644
    unsigned long long v86;  // x3
    unsigned long v87;  // x4
    unsigned long long v88;  // x11
    unsigned long v89;  // 4659
    unsigned long long v90;  // x19
    unsigned long v19;  // x10
    unsigned long v91;  // 4666
    unsigned long long v92;  // x20
    unsigned long long v93;  // x3
    unsigned long v94;  // x4
    unsigned long long v95;  // x19
    unsigned long v96;  // 4681
    unsigned long long v97;  // x20
    unsigned long v98;  // 4688
    unsigned long long v99;  // x3
    unsigned long v100;  // x4
    unsigned long long v20;  // x11
    unsigned long long v101;  // x12
    unsigned long v102;  // 4703
    unsigned long long v103;  // x20
    unsigned long v104;  // 4710
    unsigned long long v105;  // x3
    unsigned long long v106;  // x13
    unsigned long v107;  // 4725
    unsigned long long v108;  // x14
    unsigned long long v109;  // x7
    unsigned long long v110;  // x8
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
    v20 = *a2;
    v21 = a2[1];
    v22 = a2[2];
    v23 = a2[3];
    v24 = v16 * v20 >> 64;
    v25 = v20 * v17;
    v26 = v24 + v25;
    v27 = arm64g_calculate_flag_c(2, v24, v25, 0);
    v28 = (v17 * v20 >> 64) + v27;
    v29 = v21 * v16;
    v30 = v16 * v21 >> 64;
    v31 = arm64g_calculate_flag_c(2, v26, v29, 0);
    v32 = v28 + v30 + v31;
    v33 = arm64g_calculate_flag_c(6, v28, v30, v31);
    v34 = v20 * v18;
    v35 = v32 + v34;
    v36 = arm64g_calculate_flag_c(2, v32, v34, 0);
    v37 = v33 + (v18 * v20 >> 64) + v36;
    v38 = v21 * v17;
    v39 = v17 * v21 >> 64;
    v40 = v35 + v38;
    v41 = arm64g_calculate_flag_c(2, v35, v38, 0);
    v42 = v37 + v39 + v41;
    v43 = arm64g_calculate_flag_c(6, v37, v39, v41);
    v44 = v22 * v16;
    v45 = v16 * v22 >> 64;
    v46 = arm64g_calculate_flag_c(2, v40, v44, 0);
    v47 = v42 + v45 + v46;
    v48 = arm64g_calculate_flag_c(6, v42, v45, v46);
    v49 = v43 + v48;
    v50 = v20 * v19;
    v51 = v19 * v20 >> 64;
    v52 = v47 + v50;
    v53 = arm64g_calculate_flag_c(2, v47, v50, 0);
    v54 = v49 + v51 + v53;
    v55 = arm64g_calculate_flag_c(6, v49, v51, v53);
    v56 = v21 * v18;
    v57 = v18 * v21 >> 64;
    v58 = v52 + v56;
    v59 = arm64g_calculate_flag_c(2, v52, v56, 0);
    v60 = v54 + v57 + v59;
    v61 = arm64g_calculate_flag_c(6, v54, v57, v59);
    v62 = v22 * v17;
    v63 = v17 * v22 >> 64;
    v64 = v58 + v62;
    v65 = arm64g_calculate_flag_c(2, v58, v62, 0);
    v66 = v60 + v63 + v65;
    v67 = arm64g_calculate_flag_c(6, v60, v63, v65);
    v68 = v23 * v16;
    v69 = v16 * v23 >> 64;
    v70 = arm64g_calculate_flag_c(2, v64, v68, 0);
    v71 = v66 + v69 + v70;
    v72 = arm64g_calculate_flag_c(6, v66, v69, v70);
    v73 = v55 + v61 + v67 + v72;
    v74 = v21 * v19;
    v75 = v19 * v21 >> 64;
    v76 = v71 + v74;
    v77 = arm64g_calculate_flag_c(2, v71, v74, 0);
    v78 = v73 + v75 + v77;
    v79 = arm64g_calculate_flag_c(6, v73, v75, v77);
    v80 = v22 * v18;
    v81 = v18 * v22 >> 64;
    v82 = v76 + v80;
    v83 = arm64g_calculate_flag_c(2, v76, v80, 0);
    v84 = v78 + v81 + v83;
    v85 = arm64g_calculate_flag_c(6, v78, v81, v83);
    v86 = v23 * v17;
    v87 = v17 * v23 >> 64;
    v88 = v82 + v86;
    v89 = arm64g_calculate_flag_c(2, v82, v86, 0);
    v90 = v84 + v87 + v89;
    v91 = arm64g_calculate_flag_c(6, v84, v87, v89);
    v92 = v79 + v85 + v91;
    v93 = v22 * v19;
    v94 = v19 * v22 >> 64;
    v95 = v90 + v93;
    v96 = arm64g_calculate_flag_c(2, v90, v93, 0);
    v97 = v92 + v94 + v96;
    v98 = arm64g_calculate_flag_c(6, v92, v94, v96);
    v99 = v23 * v18;
    v100 = v18 * v23 >> 64;
    v101 = v95 + v99;
    v102 = arm64g_calculate_flag_c(2, v95, v99, 0);
    v103 = v97 + v100 + v102;
    v104 = arm64g_calculate_flag_c(6, v97, v100, v102);
    v105 = v23 * v19;
    v106 = v103 + v105;
    v107 = arm64g_calculate_flag_c(2, v103, v105, 0);
    v108 = v98 + v104 + (v19 * v23 >> 64) + v107;
    v109 = v20 * v16;
    v110 = v26 + v29;
    v111 = v40 + v44;
    v112 = v64 + v68;
    v113 = v106 + v108;
    v114 = arm64g_calculate_flag_c(2, v106, v108, 0);
    v115 = v113 + v108;
    v116 = arm64g_calculate_flag_c(2, v113, v108, 0);
    v117 = v114 + v116;
    v118 = v88 + v115;
    v119 = arm64g_calculate_flag_c(2, v88, v115, 0);
    v120 = v118 + v101;
    v121 = arm64g_calculate_flag_c(2, v118, v101, 0);
    v122 = v117 + v119 + v121;
    v123 = arm64g_calculate_flag_c(2, v109, v120, 0);
    v124 = arm64g_calculate_flag_c(6, v110, v122, v123);
    v125 = arm64g_calculate_flag_c(6, v111, v115, v124);
    v126 = v112 + v108 + v125;
    v127 = arm64g_calculate_flag_c(6, v112, v108, v125);
    v128 = arm64g_calculate_flag_c(2, v126, v117, 0);
    v4 = v109 + v120;
    v5 = v110 + v122 + v123;
    v6 = v111 + v115 + v124;
    v7 = v126 + v117;
    v129 = v88 & 0xffffffff;
    v130 = v101 & 0xffffffff;
    v131 = v108 & 0xffffffff;
    v132 = v88 >> 32;
    v133 = v101 >> 32;
    v134 = v106 >> 32;
    v135 = v108 >> 32;
    v136 = v131 + (v106 & 0xffffffff);
    v137 = v135 + v134;
    v138 = v129 + v132;
    v139 = v131 + v130;
    v140 = v135 + v133;
    v141 = v137 + v136;
    v142 = v130 + v141 + v141 + v138 + v133;
    v143 = v141 + v134 + v133 + v129;
    v144 = v138 + v131 + v134;
    v145 = v132 + v137;
    v146 = v133 + v145 + v137;
    v147 = v136 + v139;
    v148 = v147 * 0x100000000;
    v149 = v143 * 0x100000000 | v147 >> 32;
    v150 = v139 * 0x100000000 | v143 >> 32;
    v151 = v142 * 0x100000000 | v139 >> 32;
    v152 = v146 + v148;
    v153 = arm64g_calculate_flag_c(2, v146, v148, 0);
    v154 = v149 + v153;
    v155 = arm64g_calculate_flag_c(6, v149, 0, v153);
    v156 = v145 + v150 + v155;
    v157 = arm64g_calculate_flag_c(6, v145, v150, v155);
    v158 = v140 + v151 + v157;
    v159 = arm64g_calculate_flag_c(6, v140, v151, v157);
    v160 = v4 + v152;
    v161 = arm64g_calculate_flag_c(2, v4, v152, 0);
    v162 = v5 + v154 + v161;
    v163 = arm64g_calculate_flag_c(6, v5, v154, v161);
    v164 = v6 + v156 + v163;
    v165 = arm64g_calculate_flag_c(6, v6, v156, v163);
    v166 = v7 + v158 + v165;
    v167 = arm64g_calculate_flag_c(6, v7, v158, v165);
    v168 = v162 - v144;
    v169 = arm64g_calculate_flag_c(4, v162, v144, 0);
    v170 = v164 - (v169 ^ 1);
    v171 = arm64g_calculate_flag_c(8, v164, 0, v169);
    v172 = v166 - (v171 ^ 1);
    v173 = arm64g_calculate_flag_c(8, v166, 0, v171);
    v174 = v127 + v128 + (v142 >> 32) + v159 + v167 - (v173 ^ 1);
    v175 = v174 * 0x100000000;
    v176 = v175 - v174;
    v177 = v160 + v174;
    v178 = arm64g_calculate_flag_c(2, v160, v174, 0);
    v179 = v168 + v176 + v178;
    v180 = arm64g_calculate_flag_c(6, v168, v176, v178);
    v181 = v170 + v180;
    v182 = arm64g_calculate_flag_c(6, v170, 0, v180);
    v183 = v172 + v175 + v182;
    v184 = arm64g_calculate_flag_c(6, v172, v175, v182);
    v185 = v184;
    v186 = arm64g_calculate_flag_c(4, v177, 0xffffffffffffffff, 0);
    v187 = arm64g_calculate_flag_c(8, v179, 0xffffffff00000000, v186);
    v188 = arm64g_calculate_flag_c(8, v181, 0xffffffffffffffff, v187);
    v189 = v183 + 4294967297 - (v188 ^ 1);
    v190 = arm64g_calculate_flag_c(8, v183, 0xfffffffeffffffff, v188);
    v191 = v185;
    v192 = v190;
    v193 = arm64g_calculate_condition(40, v185, 0, v190);
    if (v193 & 1)
    {
        v194 = v177 + 1;
        v195 = arm64g_calculate_condition(40, v191, 0, v192);
        if (!(v195 & 1))
            goto LABEL_a25a66;
LABEL_a25a65:
        v197 = v179 + 0x100000000 - (v186 ^ 1);
        v198 = arm64g_calculate_condition(40, v191, 0, v192);
        if (!(v198 & 1))
            goto LABEL_a25a6a;
LABEL_a25a69:
        v200 = v181 + 1 - (v187 ^ 1);
        v201 = arm64g_calculate_condition(40, v191, 0, v192);
        if (!(v201 & 1))
            goto LABEL_a25a6e;
LABEL_a25a6d:
        v183 = v189;
    }
    else
    {
        v194 = v177;
        v196 = arm64g_calculate_condition(40, v191, 0, v192);
        if (v196 & 1)
            goto LABEL_a25a65;
LABEL_a25a66:
        v197 = v179;
        v199 = arm64g_calculate_condition(40, v191, 0, v192);
        if (v199 & 1)
            goto LABEL_a25a69;
LABEL_a25a6a:
        v200 = v181;
        v202 = arm64g_calculate_condition(40, v191, 0, v192);
        if (v202 & 1)
            goto LABEL_a25a6d;
LABEL_a25a6e:
    }
    *a0 = v194;
    a0[1] = v197;
    a0[2] = v200;
    a0[3] = v183;
    return a0;
}
