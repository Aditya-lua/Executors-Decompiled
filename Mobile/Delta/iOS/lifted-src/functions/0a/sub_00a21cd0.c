/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa21cd0..0xa21f80 (688 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_a21cd0(unsigned long long *a0, void* a1, unsigned long long *a2)
{
    unsigned long long v9;  // x30
    unsigned long long v10;  // x19
    unsigned long v19;  // x6
    unsigned long v109;  // 4698
    unsigned long long v110;  // x17
    unsigned long v111;  // 4705
    unsigned long long v112;  // x14
    unsigned long v113;  // x8
    unsigned long v114;  // 4716
    unsigned long long v115;  // x15
    unsigned long v116;  // x9
    unsigned long v117;  // 4727
    unsigned long long v118;  // x16
    unsigned long v20;  // x7
    unsigned long v119;  // x10
    unsigned long v120;  // 4738
    unsigned long long v121;  // x17
    unsigned long v122;  // x11
    unsigned long v123;  // 4749
    unsigned long long v124;  // x19
    unsigned long long v125;  // x24
    unsigned long long v126;  // x15
    unsigned long v127;  // 4760
    unsigned long long v128;  // x16
    unsigned long long v21;  // x14
    unsigned long v129;  // 4767
    unsigned long long v130;  // x17
    unsigned long v131;  // 4273
    unsigned long long v132;  // x19
    unsigned long v133;  // 4280
    unsigned long long v134;  // x3
    unsigned long long v135;  // x8
    unsigned long long v136;  // x16
    unsigned long long v137;  // x9
    unsigned long long v138;  // 4293
    unsigned long v22;  // x8
    unsigned long long v139;  // x17
    unsigned long long v140;  // 4301
    unsigned long long v141;  // x19
    unsigned long long v142;  // 4309
    unsigned long v143;  // x9
    unsigned long long v144;  // x10
    unsigned long v145;  // 4329
    unsigned long long v146;  // x10
    unsigned long long v147;  // x8
    unsigned long v148;  // 4340
    unsigned long long v23;  // x15
    unsigned long long v149;  // x11
    unsigned long long v150;  // x9
    unsigned long long v151;  // x14
    unsigned long long v152;  // x10
    unsigned long v153;  // 4355
    unsigned long long v154;  // x15
    unsigned long long v155;  // x11
    unsigned long v156;  // 4366
    unsigned long long v157;  // x16
    unsigned long v158;  // 4373
    unsigned long v24;  // x9
    unsigned long long v159;  // x17
    unsigned long v160;  // 4380
    unsigned long long v161;  // x14
    unsigned long v162;  // x8
    unsigned long v163;  // 4391
    unsigned long long v164;  // x15
    unsigned long v165;  // x9
    unsigned long v166;  // 4402
    unsigned long long v167;  // x16
    unsigned long v168;  // x10
    unsigned long long v25;  // x16
    unsigned long v169;  // 4413
    unsigned long long v170;  // x17
    unsigned long v171;  // x11
    unsigned long v172;  // 4424
    unsigned long long v173;  // x19
    unsigned long long v174;  // x24
    unsigned long long v175;  // x15
    unsigned long v176;  // 4435
    unsigned long long v177;  // x16
    unsigned long v178;  // 4442
    unsigned long v26;  // x10
    unsigned long long v179;  // x17
    unsigned long v180;  // 4449
    unsigned long long v181;  // x19
    unsigned long v182;  // 4456
    unsigned long long v183;  // x8
    unsigned long long v184;  // x16
    unsigned long long v185;  // x9
    unsigned long long v186;  // 4467
    unsigned long long v187;  // x17
    unsigned long long v188;  // 4475
    unsigned long long v27;  // x17
    unsigned long long v189;  // x19
    unsigned long long v190;  // 4483
    unsigned long v191;  // x9
    unsigned long long v192;  // x10
    unsigned long v193;  // 4503
    unsigned long long v194;  // x10
    unsigned long v195;  // 4510
    unsigned long long v196;  // x11
    unsigned long long v197;  // x14
    unsigned long v198;  // 4517
    unsigned long long v28;  // x24
    unsigned long long v199;  // x15
    unsigned long v200;  // 4524
    unsigned long long v201;  // x16
    unsigned long v202;  // 4531
    unsigned long long v203;  // x17
    unsigned long v204;  // 4538
    unsigned long long v205;  // x19
    unsigned long long v206;  // 4545
    unsigned long long v207;  // 4553
    unsigned long long v208;  // x10
    unsigned long long v11;  // x20
    unsigned long long v29;  // x15
    unsigned long long v209;  // 4561
    unsigned long v210;  // 4569
    unsigned long v211;  // cc_dep1
    unsigned long v212;  // cc_ndep
    unsigned long long v213;  // 4582
    unsigned long long v214;  // x14
    unsigned long long v215;  // 4105
    unsigned long long v216;  // 4105
    unsigned long long v217;  // x15
    unsigned long long v218;  // 4105
    unsigned long v30;  // 4415
    unsigned long long v219;  // 4105
    unsigned long long v220;  // 4113
    unsigned long long v31;  // x16
    unsigned long v32;  // 4422
    unsigned long long v33;  // x17
    unsigned long v34;  // 4429
    unsigned long long v35;  // x19
    unsigned long long v36;  // x3
    unsigned long long v37;  // x8
    unsigned long long v38;  // x16
    unsigned long long v12;  // x21
    unsigned long long v39;  // x9
    unsigned long long v40;  // 4442
    unsigned long long v41;  // x17
    unsigned long long v42;  // 4450
    unsigned long long v43;  // x19
    unsigned long long v44;  // 4458
    unsigned long v45;  // x9
    unsigned long long v46;  // x10
    unsigned long v47;  // 4478
    unsigned long long v48;  // x10
    unsigned long long v13;  // x22
    unsigned long long v49;  // x8
    unsigned long v50;  // 4489
    unsigned long long v51;  // x11
    unsigned long long v52;  // x9
    unsigned long long v53;  // x14
    unsigned long long v54;  // x10
    unsigned long v55;  // 4504
    unsigned long long v56;  // x15
    unsigned long long v57;  // x11
    unsigned long v58;  // 4515
    unsigned long long v14;  // x23
    unsigned long long v59;  // x16
    unsigned long v60;  // 4522
    unsigned long long v61;  // x17
    unsigned long v62;  // 4529
    unsigned long long v63;  // x14
    unsigned long v64;  // x8
    unsigned long v65;  // 4540
    unsigned long long v66;  // x15
    unsigned long v67;  // x9
    unsigned long v68;  // 4551
    unsigned long long v15;  // x24
    unsigned long long v69;  // x16
    unsigned long v70;  // x10
    unsigned long v71;  // 4562
    unsigned long long v72;  // x17
    unsigned long v73;  // x11
    unsigned long v74;  // 4573
    unsigned long long v75;  // x19
    unsigned long long v76;  // x24
    unsigned long long v77;  // x15
    unsigned long v78;  // 4584
    unsigned long long v16;  // x3
    unsigned long long v79;  // x16
    unsigned long v80;  // 4591
    unsigned long long v81;  // x17
    unsigned long v82;  // 4598
    unsigned long long v83;  // x19
    unsigned long v84;  // 4605
    unsigned long long v85;  // x3
    unsigned long long v86;  // x8
    unsigned long long v87;  // x16
    unsigned long long v88;  // x9
    unsigned long v17;  // x4
    unsigned long long v89;  // 4618
    unsigned long long v90;  // x17
    unsigned long long v91;  // 4626
    unsigned long long v92;  // x19
    unsigned long long v93;  // 4634
    unsigned long v94;  // x9
    unsigned long long v95;  // x10
    unsigned long v96;  // 4654
    unsigned long long v97;  // x10
    unsigned long long v98;  // x8
    unsigned long v18;  // x5
    unsigned long v99;  // 4665
    unsigned long long v100;  // x11
    unsigned long long v101;  // x9
    unsigned long long v102;  // x14
    unsigned long long v103;  // x10
    unsigned long v104;  // 4680
    unsigned long long v105;  // x15
    unsigned long long v106;  // x11
    unsigned long v107;  // 4691
    unsigned long long v108;  // x16
    char *v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    unsigned long long v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v0 = &v8;
    v1 = v9;
    v2 = v10;
    v3 = v11;
    v4 = v12;
    v5 = v13;
    v6 = v14;
    v7 = v15;
    v16 = *a2;
    v17 = *(long long *)a1;
    v18 = (long long)a1[8];
    v19 = (long long)a1[16];
    v20 = (long long)a1[24];
    v21 = v16 * v17;
    v22 = v17 * v16 >> 64;
    v23 = v16 * v18;
    v24 = v18 * v16 >> 64;
    v25 = v16 * v19;
    v26 = v19 * v16 >> 64;
    v27 = v16 * v20;
    v28 = 14758798090332847183 * v21;
    v29 = v23 + v22;
    v30 = arm64g_calculate_flag_c(2, v23, v22, 0);
    v31 = v25 + v24 + v30;
    v32 = arm64g_calculate_flag_c(6, v25, v24, v30);
    v33 = v27 + v26 + v32;
    v34 = arm64g_calculate_flag_c(6, v27, v26, v32);
    v35 = (v20 * v16 >> 64) + v34;
    v36 = a2[1];
    v37 = v28 * 0x100000000;
    v38 = v31 - v28;
    v39 = v28 >> 32;
    v40 = arm64g_calculate_flag_c(4, v31, v28, 0);
    v41 = v33 - v37 - (v40 ^ 1);
    v42 = arm64g_calculate_flag_c(8, v33, v37, v40);
    v43 = v35 - v39 - (v42 ^ 1);
    v44 = arm64g_calculate_flag_c(8, v35, v39, v42);
    v45 = 17562291160714782033 * v28 >> 64;
    v46 = v28 * 13611842547513532036;
    v47 = arm64g_calculate_flag_c(4, v21, 1, 0);
    v48 = v46 + v45 + v47;
    v49 = v36 * v17;
    v50 = arm64g_calculate_flag_c(6, v46, v45, v47);
    v51 = (unsigned long long)(13611842547513532036 * v28 >> 64) + v50;
    v52 = v36 * v18;
    v53 = v29 + v48;
    v54 = v36 * v19;
    v55 = arm64g_calculate_flag_c(2, v29, v48, 0);
    v56 = v38 + v51 + v55;
    v57 = v36 * v20;
    v58 = arm64g_calculate_flag_c(6, v38, v51, v55);
    v59 = v41 + v28 + v58;
    v60 = arm64g_calculate_flag_c(6, v41, v28, v58);
    v61 = v43 + v28 + v60;
    v62 = arm64g_calculate_flag_c(6, v43, v28, v60);
    v63 = v53 + v49;
    v64 = v17 * v36 >> 64;
    v65 = arm64g_calculate_flag_c(2, v53, v49, 0);
    v66 = v56 + v52 + v65;
    v67 = v18 * v36 >> 64;
    v68 = arm64g_calculate_flag_c(6, v56, v52, v65);
    v69 = v59 + v54 + v68;
    v70 = v19 * v36 >> 64;
    v71 = arm64g_calculate_flag_c(6, v59, v54, v68);
    v72 = v61 + v57 + v71;
    v73 = v20 * v36 >> 64;
    v74 = arm64g_calculate_flag_c(6, v61, v57, v71);
    v75 = -(v44 ^ 1) + v62 + v74;
    v76 = 14758798090332847183 * v63;
    v77 = v66 + v64;
    v78 = arm64g_calculate_flag_c(2, v66, v64, 0);
    v79 = v69 + v67 + v78;
    v80 = arm64g_calculate_flag_c(6, v69, v67, v78);
    v81 = v72 + v70 + v80;
    v82 = arm64g_calculate_flag_c(6, v72, v70, v80);
    v83 = v75 + v73 + v82;
    v84 = arm64g_calculate_flag_c(6, v75, v73, v82);
    v85 = a2[2];
    v86 = v76 * 0x100000000;
    v87 = v79 - v76;
    v88 = v76 >> 32;
    v89 = arm64g_calculate_flag_c(4, v79, v76, 0);
    v90 = v81 - v86 - (v89 ^ 1);
    v91 = arm64g_calculate_flag_c(8, v81, v86, v89);
    v92 = v83 - v88 - (v91 ^ 1);
    v93 = arm64g_calculate_flag_c(8, v83, v88, v91);
    v94 = 17562291160714782033 * v76 >> 64;
    v95 = v76 * 13611842547513532036;
    v96 = arm64g_calculate_flag_c(4, v63, 1, 0);
    v97 = v95 + v94 + v96;
    v98 = v85 * v17;
    v99 = arm64g_calculate_flag_c(6, v95, v94, v96);
    v100 = (unsigned long long)(13611842547513532036 * v76 >> 64) + v99;
    v101 = v85 * v18;
    v102 = v77 + v97;
    v103 = v85 * v19;
    v104 = arm64g_calculate_flag_c(2, v77, v97, 0);
    v105 = v87 + v100 + v104;
    v106 = v85 * v20;
    v107 = arm64g_calculate_flag_c(6, v87, v100, v104);
    v108 = v90 + v76 + v107;
    v109 = arm64g_calculate_flag_c(6, v90, v76, v107);
    v110 = v92 + v76 + v109;
    v111 = arm64g_calculate_flag_c(6, v92, v76, v109);
    v112 = v102 + v98;
    v113 = v17 * v85 >> 64;
    v114 = arm64g_calculate_flag_c(2, v102, v98, 0);
    v115 = v105 + v101 + v114;
    v116 = v18 * v85 >> 64;
    v117 = arm64g_calculate_flag_c(6, v105, v101, v114);
    v118 = v108 + v103 + v117;
    v119 = v19 * v85 >> 64;
    v120 = arm64g_calculate_flag_c(6, v108, v103, v117);
    v121 = v110 + v106 + v120;
    v122 = v20 * v85 >> 64;
    v123 = arm64g_calculate_flag_c(6, v110, v106, v120);
    v124 = v84 - (v93 ^ 1) + v111 + v123;
    v125 = 14758798090332847183 * v112;
    v126 = v115 + v113;
    v127 = arm64g_calculate_flag_c(2, v115, v113, 0);
    v128 = v118 + v116 + v127;
    v129 = arm64g_calculate_flag_c(6, v118, v116, v127);
    v130 = v121 + v119 + v129;
    v131 = arm64g_calculate_flag_c(6, v121, v119, v129);
    v132 = v124 + v122 + v131;
    v133 = arm64g_calculate_flag_c(6, v124, v122, v131);
    v134 = a2[3];
    v135 = v125 * 0x100000000;
    v136 = v128 - v125;
    v137 = v125 >> 32;
    v138 = arm64g_calculate_flag_c(4, v128, v125, 0);
    v139 = v130 - v135 - (v138 ^ 1);
    v140 = arm64g_calculate_flag_c(8, v130, v135, v138);
    v141 = v132 - v137 - (v140 ^ 1);
    v142 = arm64g_calculate_flag_c(8, v132, v137, v140);
    v143 = 17562291160714782033 * v125 >> 64;
    v144 = v125 * 13611842547513532036;
    v145 = arm64g_calculate_flag_c(4, v112, 1, 0);
    v146 = v144 + v143 + v145;
    v147 = v134 * v17;
    v148 = arm64g_calculate_flag_c(6, v144, v143, v145);
    v149 = (unsigned long long)(13611842547513532036 * v125 >> 64) + v148;
    v150 = v134 * v18;
    v151 = v126 + v146;
    v152 = v134 * v19;
    v153 = arm64g_calculate_flag_c(2, v126, v146, 0);
    v154 = v136 + v149 + v153;
    v155 = v134 * v20;
    v156 = arm64g_calculate_flag_c(6, v136, v149, v153);
    v157 = v139 + v125 + v156;
    v158 = arm64g_calculate_flag_c(6, v139, v125, v156);
    v159 = v141 + v125 + v158;
    v160 = arm64g_calculate_flag_c(6, v141, v125, v158);
    v161 = v151 + v147;
    v162 = v17 * v134 >> 64;
    v163 = arm64g_calculate_flag_c(2, v151, v147, 0);
    v164 = v154 + v150 + v163;
    v165 = v18 * v134 >> 64;
    v166 = arm64g_calculate_flag_c(6, v154, v150, v163);
    v167 = v157 + v152 + v166;
    v168 = v19 * v134 >> 64;
    v169 = arm64g_calculate_flag_c(6, v157, v152, v166);
    v170 = v159 + v155 + v169;
    v171 = v20 * v134 >> 64;
    v172 = arm64g_calculate_flag_c(6, v159, v155, v169);
    v173 = v133 - (v142 ^ 1) + v160 + v172;
    v174 = 14758798090332847183 * v161;
    v175 = v164 + v162;
    v176 = arm64g_calculate_flag_c(2, v164, v162, 0);
    v177 = v167 + v165 + v176;
    v178 = arm64g_calculate_flag_c(6, v167, v165, v176);
    v179 = v170 + v168 + v178;
    v180 = arm64g_calculate_flag_c(6, v170, v168, v178);
    v181 = v173 + v171 + v180;
    v182 = arm64g_calculate_flag_c(6, v173, v171, v180);
    v183 = v174 * 0x100000000;
    v184 = v177 - v174;
    v185 = v174 >> 32;
    v186 = arm64g_calculate_flag_c(4, v177, v174, 0);
    v187 = v179 - v183 - (v186 ^ 1);
    v188 = arm64g_calculate_flag_c(8, v179, v183, v186);
    v189 = v181 - v185 - (v188 ^ 1);
    v190 = arm64g_calculate_flag_c(8, v181, v185, v188);
    v191 = 17562291160714782033 * v174 >> 64;
    v192 = v174 * 13611842547513532036;
    v193 = arm64g_calculate_flag_c(4, v161, 1, 0);
    v194 = v192 + v191 + v193;
    v195 = arm64g_calculate_flag_c(6, v192, v191, v193);
    v196 = (unsigned long long)(13611842547513532036 * v174 >> 64) + v195;
    v197 = v175 + v194;
    v198 = arm64g_calculate_flag_c(2, v175, v194, 0);
    v199 = v184 + v196 + v198;
    v200 = arm64g_calculate_flag_c(6, v184, v196, v198);
    v201 = v187 + v174 + v200;
    v202 = arm64g_calculate_flag_c(6, v187, v174, v200);
    v203 = v189 + v174 + v202;
    v204 = arm64g_calculate_flag_c(6, v189, v174, v202);
    v205 = v182 - (v190 ^ 1) + v204;
    v206 = arm64g_calculate_flag_c(4, v197, 17562291160714782033, 0);
    v207 = arm64g_calculate_flag_c(8, v199, 13611842547513532036, v206);
    v208 = v201 + 1 - (v207 ^ 1);
    v209 = arm64g_calculate_flag_c(8, v201, 0xffffffffffffffff, v207);
    v210 = arm64g_calculate_flag_c(8, v203, 0xffffffff00000000, v209);
    v211 = v205;
    v212 = v210;
    v213 = arm64g_calculate_condition(56, v205, 0, v210);
    if (v213 & 1)
    {
        v214 = v197;
        v215 = arm64g_calculate_condition(56, v211, 0, v212);
        if (!(v215 & 1))
            goto LABEL_a21f56;
LABEL_a21f55:
        v217 = v199;
        v218 = arm64g_calculate_condition(56, v211, 0, v212);
        if (!(v218 & 1))
            goto LABEL_a21f5a;
LABEL_a21f59:
    }
    else
    {
        v214 = v197 + 884452912994769583;
        v216 = arm64g_calculate_condition(56, v211, 0, v212);
        if (v216 & 1)
            goto LABEL_a21f55;
LABEL_a21f56:
        v217 = v199 + 4834901526196019580 - (v206 ^ 1);
        v219 = arm64g_calculate_condition(56, v211, 0, v212);
        if (v219 & 1)
            goto LABEL_a21f59;
LABEL_a21f5a:
        v201 = v208;
    }
    *a0 = v214;
    a0[1] = v217;
    v220 = arm64g_calculate_condition(56, v211, 0, v212);
    if (!(v220 & 1))
        v203 = v203 + 0x100000000 - (v209 ^ 1);
    a0[2] = v201;
    a0[3] = v203;
    return a0;
}
