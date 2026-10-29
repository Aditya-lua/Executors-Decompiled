/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa21f80..0xa221d0 (592 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_a21f80(void* a0, void* a1, unsigned long long i)
{
    unsigned long long v3;  // x30
    unsigned long v4;  // x4
    unsigned long long v13;  // x16
    unsigned long v103;  // x9
    unsigned long long v104;  // x10
    unsigned long v105;  // 4694
    unsigned long long v106;  // x10
    unsigned long v107;  // 4701
    unsigned long long v108;  // x11
    unsigned long long v109;  // x14
    unsigned long v110;  // 4708
    unsigned long long v111;  // x15
    unsigned long v112;  // 4715
    unsigned long v14;  // x8
    unsigned long long v113;  // x16
    unsigned long v114;  // 4722
    unsigned long long v115;  // x11
    unsigned long long v116;  // x8
    unsigned long long v117;  // x15
    unsigned long long v118;  // 4737
    unsigned long long v119;  // x16
    unsigned long long v120;  // 4745
    unsigned long long v121;  // x17
    unsigned long v122;  // x9
    unsigned long v15;  // x9
    unsigned long long v123;  // x10
    unsigned long v124;  // 4112
    unsigned long long v125;  // x10
    unsigned long v126;  // 4119
    unsigned long long v127;  // x24
    unsigned long long v128;  // x14
    unsigned long v129;  // 4172
    unsigned long long v130;  // x15
    unsigned long v131;  // 4179
    unsigned long long v132;  // x16
    unsigned long v16;  // 4362
    unsigned long v133;  // 4186
    unsigned long long v134;  // x8
    unsigned long long v135;  // x15
    unsigned long long v136;  // 4197
    unsigned long long v137;  // x16
    unsigned long long v138;  // 4205
    unsigned long long v139;  // x17
    unsigned long v140;  // x14
    unsigned long v141;  // 4213
    unsigned long v142;  // x15
    unsigned long long v17;  // x17
    unsigned long v143;  // 4220
    unsigned long v144;  // x16
    unsigned long v145;  // 4227
    unsigned long long v146;  // 4234
    unsigned long long v147;  // x19
    unsigned long long v148;  // 4241
    unsigned long long v149;  // 4249
    unsigned long long v150;  // 4257
    unsigned long v151;  // x11
    unsigned long v152;  // 4265
    unsigned long v18;  // x10
    unsigned long v153;  // cc_dep1
    unsigned long v154;  // cc_ndep
    unsigned long long v155;  // 4278
    unsigned long long v156;  // 4105
    unsigned long long v157;  // 4105
    unsigned long long v158;  // 4105
    unsigned long long v159;  // 4105
    unsigned long long v160;  // 4105
    unsigned long long v161;  // 4105
    unsigned long v19;  // 4377
    unsigned long long v20;  // x19
    unsigned long v21;  // x20
    unsigned long long v22;  // x9
    unsigned long v5;  // x5
    unsigned long v23;  // x14
    unsigned long v24;  // 4396
    unsigned long long v25;  // x10
    unsigned long long v26;  // x17
    unsigned long v27;  // x4
    unsigned long v28;  // 4407
    unsigned long long v29;  // x19
    unsigned long v30;  // x9
    unsigned long v31;  // 4418
    unsigned long long v32;  // x20
    unsigned long v6;  // x6
    unsigned long v33;  // x5
    unsigned long v34;  // 4429
    unsigned long long v35;  // x1
    unsigned long long v36;  // x15
    unsigned long v37;  // x10
    unsigned long v38;  // 4440
    unsigned long long v39;  // x16
    unsigned long v40;  // x6
    unsigned long v41;  // 4451
    unsigned long long v42;  // x17
    unsigned long v7;  // x7
    unsigned long v43;  // x11
    unsigned long v44;  // 4462
    unsigned long long v45;  // x19
    unsigned long v46;  // 4473
    unsigned long long v47;  // x20
    unsigned long v48;  // 4480
    unsigned long long v49;  // x1
    unsigned long v50;  // 4487
    unsigned long long v51;  // x15
    unsigned long long v52;  // x24
    unsigned long v8;  // x15
    unsigned long v53;  // 4498
    unsigned long long v54;  // x16
    unsigned long v55;  // 4505
    unsigned long long v56;  // x17
    unsigned long v57;  // 4512
    unsigned long long v58;  // x19
    unsigned long v59;  // 4519
    unsigned long long v60;  // x20
    unsigned long v61;  // 4526
    unsigned long long v62;  // x1
    unsigned long v9;  // x9
    unsigned long v63;  // 4533
    unsigned long long v64;  // x3
    unsigned long v65;  // x9
    unsigned long long v66;  // x10
    unsigned long v67;  // 4552
    unsigned long long v68;  // x10
    unsigned long v69;  // 4559
    unsigned long long v70;  // x11
    unsigned long long v71;  // x14
    unsigned long v72;  // 4566
    unsigned long v10;  // x16
    unsigned long long v73;  // x15
    unsigned long v74;  // 4573
    unsigned long long v75;  // x16
    unsigned long v76;  // 4580
    unsigned long long v77;  // x11
    unsigned long long v78;  // x8
    unsigned long long v79;  // x15
    unsigned long long v80;  // 4595
    unsigned long long v81;  // x16
    unsigned long long v82;  // 4603
    unsigned long v11;  // x10
    unsigned long long v83;  // x17
    unsigned long v84;  // x9
    unsigned long long v85;  // x10
    unsigned long v86;  // 4623
    unsigned long long v87;  // x10
    unsigned long v88;  // 4630
    unsigned long long v89;  // x24
    unsigned long long v90;  // x14
    unsigned long v91;  // 4637
    unsigned long long v92;  // x15
    unsigned long v12;  // x17
    unsigned long v93;  // 4644
    unsigned long long v94;  // x16
    unsigned long v95;  // 4651
    unsigned long long v96;  // x24
    unsigned long long v97;  // x8
    unsigned long long v98;  // x15
    unsigned long long v99;  // 4666
    unsigned long long v100;  // x16
    unsigned long long v101;  // 4674
    unsigned long long v102;  // x17
    char *v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    char v2;  // [bp+0x0]

    v0 = &v2;
    v1 = v3;
    v4 = *(long long *)a1;
    v5 = (long long)a1[8];
    v6 = (long long)a1[16];
    v7 = (long long)a1[24];
    do
    {
        i -= 1;
        v8 = v4 * v5;
        v9 = v5 * v4 >> 64;
        v10 = v4 * v6;
        v11 = v6 * v4 >> 64;
        v12 = v4 * v7;
        v13 = v10 + v9;
        v14 = v5 * v6;
        v15 = v6 * v5 >> 64;
        v16 = arm64g_calculate_flag_c(2, v10, v9, 0);
        v17 = v12 + v11 + v16;
        v18 = v5 * v7;
        v19 = arm64g_calculate_flag_c(6, v12, v11, v16);
        v20 = (v7 * v4 >> 64) + v19;
        v21 = v6 * v7;
        v22 = v15 + v18;
        v23 = v4 * v4;
        v24 = arm64g_calculate_flag_c(2, v15, v18, 0);
        v25 = (v7 * v5 >> 64) + v24;
        v26 = v17 + v14;
        v27 = v4 * v4 >> 64;
        v28 = arm64g_calculate_flag_c(2, v17, v14, 0);
        v29 = v20 + v22 + v28;
        v30 = v5 * v5;
        v31 = arm64g_calculate_flag_c(6, v20, v22, v28);
        v32 = v21 + v25 + v31;
        v33 = v5 * v5 >> 64;
        v34 = arm64g_calculate_flag_c(6, v21, v25, v31);
        v35 = (v7 * v6 >> 64) + v34;
        v36 = v8 * 2;
        v37 = v6 * v6;
        v38 = arm64g_calculate_flag_c(2, v8, v8, 0);
        v39 = v13 * 2 + v38;
        v40 = v6 * v6 >> 64;
        v41 = arm64g_calculate_flag_c(6, v13, v13, v38);
        v42 = v26 * 2 + v41;
        v43 = v7 * v7;
        v44 = arm64g_calculate_flag_c(6, v26, v26, v41);
        v45 = v29 * 2 + v44;
        v46 = arm64g_calculate_flag_c(6, v29, v29, v44);
        v47 = v32 * 2 + v46;
        v48 = arm64g_calculate_flag_c(6, v32, v32, v46);
        v49 = v35 * 2 + v48;
        v50 = arm64g_calculate_flag_c(6, v35, v35, v48);
        v51 = v36 + v27;
        v52 = 14758798090332847183 * v23;
        v53 = arm64g_calculate_flag_c(2, v36, v27, 0);
        v54 = v39 + v30 + v53;
        v55 = arm64g_calculate_flag_c(6, v39, v30, v53);
        v56 = v42 + v33 + v55;
        v57 = arm64g_calculate_flag_c(6, v42, v33, v55);
        v58 = v45 + v37 + v57;
        v59 = arm64g_calculate_flag_c(6, v45, v37, v57);
        v60 = v47 + v40 + v59;
        v61 = arm64g_calculate_flag_c(6, v47, v40, v59);
        v62 = v49 + v43 + v61;
        v63 = arm64g_calculate_flag_c(6, v49, v43, v61);
        v64 = v50 + (v7 * v7 >> 64) + v63;
        v65 = 17562291160714782033 * v52 >> 64;
        v66 = v52 * 13611842547513532036;
        v67 = arm64g_calculate_flag_c(4, v23, 1, 0);
        v68 = v66 + v65 + v67;
        v69 = arm64g_calculate_flag_c(6, v66, v65, v67);
        v70 = (unsigned long long)(13611842547513532036 * v52 >> 64) + v69;
        v71 = v51 + v68;
        v72 = arm64g_calculate_flag_c(2, v51, v68, 0);
        v73 = v54 + v70 + v72;
        v74 = arm64g_calculate_flag_c(6, v54, v70, v72);
        v75 = v56 + v52 + v74;
        v76 = arm64g_calculate_flag_c(6, v56, v52, v74);
        v77 = 14758798090332847183 * v71;
        v78 = v52 * 0x100000000;
        v79 = v73 - v52;
        v80 = arm64g_calculate_flag_c(4, v73, v52, 0);
        v81 = v75 - v78 - (v80 ^ 1);
        v82 = arm64g_calculate_flag_c(8, v75, v78, v80);
        v83 = v52 + v76 - (v52 >> 32) - (v82 ^ 1);
        v84 = 17562291160714782033 * v77 >> 64;
        v85 = v77 * 13611842547513532036;
        v86 = arm64g_calculate_flag_c(4, v71, 1, 0);
        v87 = v85 + v84 + v86;
        v88 = arm64g_calculate_flag_c(6, v85, v84, v86);
        v89 = (unsigned long long)(13611842547513532036 * v77 >> 64) + v88;
        v90 = v79 + v87;
        v91 = arm64g_calculate_flag_c(2, v79, v87, 0);
        v92 = v81 + v89 + v91;
        v93 = arm64g_calculate_flag_c(6, v81, v89, v91);
        v94 = v83 + v77 + v93;
        v95 = arm64g_calculate_flag_c(6, v83, v77, v93);
        v96 = 14758798090332847183 * v90;
        v97 = v77 * 0x100000000;
        v98 = v92 - v77;
        v99 = arm64g_calculate_flag_c(4, v92, v77, 0);
        v100 = v94 - v97 - (v99 ^ 1);
        v101 = arm64g_calculate_flag_c(8, v94, v97, v99);
        v102 = v77 + v95 - (v77 >> 32) - (v101 ^ 1);
        v103 = 17562291160714782033 * v96 >> 64;
        v104 = v96 * 13611842547513532036;
        v105 = arm64g_calculate_flag_c(4, v90, 1, 0);
        v106 = v104 + v103 + v105;
        v107 = arm64g_calculate_flag_c(6, v104, v103, v105);
        v108 = (unsigned long long)(13611842547513532036 * v96 >> 64) + v107;
        v109 = v98 + v106;
        v110 = arm64g_calculate_flag_c(2, v98, v106, 0);
        v111 = v100 + v108 + v110;
        v112 = arm64g_calculate_flag_c(6, v100, v108, v110);
        v113 = v102 + v96 + v112;
        v114 = arm64g_calculate_flag_c(6, v102, v96, v112);
        v115 = 14758798090332847183 * v109;
        v116 = v96 * 0x100000000;
        v117 = v111 - v96;
        v118 = arm64g_calculate_flag_c(4, v111, v96, 0);
        v119 = v113 - v116 - (v118 ^ 1);
        v120 = arm64g_calculate_flag_c(8, v113, v116, v118);
        v121 = v96 + v114 - (v96 >> 32) - (v120 ^ 1);
        v122 = 17562291160714782033 * v115 >> 64;
        v123 = v115 * 13611842547513532036;
        v124 = arm64g_calculate_flag_c(4, v109, 1, 0);
        v125 = v123 + v122 + v124;
        v126 = arm64g_calculate_flag_c(6, v123, v122, v124);
        v127 = (unsigned long long)(13611842547513532036 * v115 >> 64) + v126;
        v128 = v117 + v125;
        v129 = arm64g_calculate_flag_c(2, v117, v125, 0);
        v130 = v119 + v127 + v129;
        v131 = arm64g_calculate_flag_c(6, v119, v127, v129);
        v132 = v121 + v115 + v131;
        v133 = arm64g_calculate_flag_c(6, v121, v115, v131);
        v134 = v115 * 0x100000000;
        v135 = v130 - v115;
        v136 = arm64g_calculate_flag_c(4, v130, v115, 0);
        v137 = v132 - v134 - (v136 ^ 1);
        v138 = arm64g_calculate_flag_c(8, v132, v134, v136);
        v139 = v115 + v133 - (v115 >> 32) - (v138 ^ 1);
        v140 = v128 + v58;
        v141 = arm64g_calculate_flag_c(2, v128, v58, 0);
        v142 = v135 + v60 + v141;
        v143 = arm64g_calculate_flag_c(6, v135, v60, v141);
        v144 = v137 + v62 + v143;
        v145 = arm64g_calculate_flag_c(6, v137, v62, v143);
        v7 = v139 + v64 + v145;
        v146 = arm64g_calculate_flag_c(6, v139, v64, v145);
        v147 = v146;
        v148 = arm64g_calculate_flag_c(4, v140, 17562291160714782033, 0);
        v149 = arm64g_calculate_flag_c(8, v142, 13611842547513532036, v148);
        v150 = arm64g_calculate_flag_c(8, v144, 0xffffffffffffffff, v149);
        v151 = v7 + 0x100000000 - (v150 ^ 1);
        v152 = arm64g_calculate_flag_c(8, v7, 0xffffffff00000000, v150);
        v153 = v147;
        v154 = v152;
        v155 = arm64g_calculate_condition(56, v147, 0, v152);
        if (v155 & 1)
        {
            v4 = v140;
            v156 = arm64g_calculate_condition(56, v153, 0, v154);
            if (!(v156 & 1))
                goto LABEL_a2219e;
            goto LABEL_a2219d;
        }
        else
        {
            v4 = v140 + 884452912994769583;
            v157 = arm64g_calculate_condition(56, v153, 0, v154);
            if (v157 & 1)
            {
LABEL_a2219d:
                v5 = v142;
                v158 = arm64g_calculate_condition(56, v153, 0, v154);
                if (!(v158 & 1))
                    goto LABEL_a221a2;
                goto LABEL_a221a1;
            }
            else
            {
LABEL_a2219e:
                v5 = v142 + 4834901526196019580 - (v148 ^ 1);
                v159 = arm64g_calculate_condition(56, v153, 0, v154);
                if (v159 & 1)
                {
LABEL_a221a1:
                    v6 = v144;
                    v160 = arm64g_calculate_condition(56, v153, 0, v154);
                    if (!(v160 & 1))
                        goto LABEL_a221a6;
                    goto LABEL_a221a5;
                }
                else
                {
LABEL_a221a2:
                    v6 = v144 + 1 - (v149 ^ 1);
                    v161 = arm64g_calculate_condition(56, v153, 0, v154);
                    if (v161 & 1)
                    {
LABEL_a221a5:
                        continue;
                    }
                    else
                    {
LABEL_a221a6:
                        v7 = v151;
                    }
                }
            }
        }
    } while (i);
    *(unsigned long *)a0 = v4;
    *(unsigned long *)&a0[8] = v5;
    *(unsigned long *)&a0[16] = v6;
    *(unsigned long *)&a0[24] = v7;
    return a0;
}
