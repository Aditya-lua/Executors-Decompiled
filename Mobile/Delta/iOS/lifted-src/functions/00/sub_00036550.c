/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x36550..0x36cec (1948 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e64948;

long long sub_36550(unsigned int a0)
{
    unsigned int v0;  // x8
    unsigned int v1;  // x9
    unsigned long long v10;  // 4106
    unsigned long v100;  // cc_dep1
    unsigned long v101;  // cc_dep2
    unsigned int v102;  // w13
    unsigned long long v103;  // 4118
    unsigned long v104;  // 4112
    unsigned long long v105;  // 4118
    unsigned long v106;  // 4112
    unsigned long v107;  // cc_op
    unsigned long v108;  // cc_dep1
    unsigned long v109;  // cc_dep2
    unsigned long v11;  // cc_dep1
    unsigned long long v110;  // 4113
    unsigned long v111;  // 4112
    unsigned long long v112;  // 4113
    unsigned long v113;  // 4112
    unsigned long v114;  // cc_op
    unsigned long v115;  // cc_dep1
    unsigned long v116;  // cc_dep2
    unsigned long long v117;  // 4113
    unsigned long v118;  // 4112
    unsigned long long v119;  // 4113
    unsigned int v12;  // x10
    unsigned long long v120;  // 4112
    unsigned long long v121;  // 4106
    unsigned long long v122;  // 4112
    unsigned long long v123;  // 4106
    unsigned int v124;  // x13
    unsigned int v125;  // x13
    unsigned long v126;  // cc_dep1
    unsigned int v127;  // x13
    unsigned long long v128;  // 4112
    unsigned long long v129;  // 4106
    unsigned int v13;  // w10
    unsigned long long v130;  // 4112
    unsigned long long v131;  // 4106
    unsigned int v132;  // x13
    unsigned int v133;  // x13
    unsigned int v134;  // x13
    unsigned int v135;  // x13
    unsigned int v136;  // x13
    unsigned long long v137;  // 4105
    unsigned int v138;  // x13
    unsigned long v139;  // cc_dep1
    unsigned long v14;  // 4112
    unsigned int v140;  // x13
    unsigned int v141;  // w14
    unsigned long v142;  // 4112
    unsigned long v143;  // cc_op
    unsigned long v144;  // cc_dep1
    unsigned long v145;  // cc_dep2
    unsigned long long v146;  // 4112
    unsigned long v147;  // 4112
    unsigned long long v148;  // 4112
    unsigned long v149;  // 4112
    unsigned long v15;  // cc_op
    unsigned long v150;  // cc_op
    unsigned long v151;  // cc_dep1
    unsigned long v152;  // cc_dep2
    unsigned long long v153;  // 4112
    unsigned long v154;  // 4112
    unsigned long long v155;  // 4112
    unsigned long long v156;  // 4112
    unsigned long long v157;  // 4106
    unsigned long long v158;  // 4112
    unsigned long long v159;  // 4106
    unsigned long v16;  // cc_dep1
    unsigned long v160;  // cc_dep1
    unsigned int v161;  // x12
    unsigned long v162;  // 4112
    unsigned long v163;  // cc_op
    unsigned long v164;  // cc_dep1
    unsigned long v165;  // cc_dep2
    unsigned long long v166;  // 4112
    unsigned long v167;  // 4112
    unsigned long long v168;  // 4112
    unsigned long v169;  // 4112
    unsigned long v17;  // cc_dep2
    unsigned long v170;  // cc_op
    unsigned long v171;  // cc_dep1
    unsigned long v172;  // cc_dep2
    unsigned long long v173;  // 4112
    unsigned long v174;  // 4112
    unsigned long long v175;  // 4112
    unsigned long v176;  // 4112
    unsigned long v177;  // cc_op
    unsigned long v178;  // cc_dep1
    unsigned long v179;  // cc_dep2
    unsigned long long v18;  // 4112
    unsigned long long v180;  // 4113
    unsigned long v181;  // 4112
    unsigned long long v182;  // 4113
    unsigned long long v183;  // 4112
    unsigned long long v184;  // 4106
    unsigned long long v185;  // 4112
    unsigned long long v186;  // 4106
    unsigned long v187;  // cc_dep1
    unsigned int v188;  // x9
    unsigned int v189;  // w10
    unsigned long v19;  // 4112
    __m128i v191;  // q0
    unsigned int v192;  // s0
    unsigned long v193;  // 4112
    unsigned long v194;  // cc_op
    unsigned long v195;  // cc_dep1
    unsigned long v196;  // cc_dep2
    unsigned long v197;  // 4112
    unsigned long long v198;  // 4133
    unsigned int v199;  // x9
    unsigned long v2;  // cc_dep1
    unsigned long long v20;  // 4112
    unsigned long long v21;  // 4112
    unsigned long long v22;  // 4106
    unsigned long long v23;  // 4112
    unsigned long long v24;  // 4106
    unsigned int v25;  // x11
    unsigned int v26;  // x11
    unsigned int v27;  // x11
    unsigned int v28;  // x11
    unsigned int v29;  // x11
    __m128i v3;  // q0
    unsigned int v30;  // x11
    unsigned int v31;  // x11
    unsigned long v32;  // cc_dep1
    unsigned int v33;  // x11
    unsigned long long v34;  // 4112
    unsigned long long v35;  // 4106
    unsigned long long v36;  // 4112
    unsigned long long v37;  // 4106
    unsigned int v38;  // x11
    unsigned int v39;  // x11
    unsigned int v4;  // x10
    unsigned int v40;  // x11
    unsigned int v41;  // x11
    unsigned int v42;  // x11
    unsigned int v43;  // x11
    unsigned int v44;  // x11
    unsigned int v45;  // x10
    unsigned int v46;  // x12
    unsigned int v47;  // x11
    unsigned int v48;  // x13
    unsigned int v49;  // x13
    uint128_t v5;  // q1
    unsigned int v50;  // x13
    unsigned int v51;  // x13
    unsigned int v52;  // x13
    unsigned int v53;  // x13
    unsigned int v54;  // x13
    unsigned int v55;  // x13
    unsigned int v56;  // x13
    unsigned int v57;  // x13
    unsigned int v58;  // x13
    unsigned int v59;  // x13
    unsigned int v6;  // w8
    unsigned int v60;  // x13
    unsigned int v61;  // x13
    unsigned int v62;  // x13
    unsigned int v63;  // x13
    unsigned int v64;  // x13
    unsigned int v65;  // x13
    unsigned long v66;  // cc_dep1
    unsigned int v67;  // x13
    unsigned int v68;  // w13
    unsigned int v69;  // w14
    unsigned long long v7;  // 4112
    unsigned long v70;  // 4112
    unsigned long v71;  // cc_op
    unsigned long v72;  // cc_dep1
    unsigned long v73;  // cc_dep2
    unsigned long long v74;  // 4112
    unsigned long v75;  // 4112
    unsigned long long v76;  // 4112
    unsigned long v77;  // 4112
    unsigned long v78;  // cc_op
    unsigned long v79;  // cc_dep1
    unsigned long long v8;  // 4106
    unsigned long v80;  // cc_dep2
    unsigned long long v81;  // 4113
    unsigned long v82;  // 4112
    unsigned long long v83;  // 4113
    unsigned long v84;  // 4112
    unsigned long v85;  // cc_op
    unsigned long v86;  // cc_dep1
    unsigned long v87;  // cc_dep2
    unsigned long long v88;  // 4113
    unsigned long v89;  // 4112
    unsigned long long v9;  // 4112
    unsigned long long v90;  // 4113
    unsigned long v91;  // 4112
    unsigned long v92;  // cc_op
    unsigned long v93;  // cc_dep1
    unsigned long v94;  // cc_dep2
    unsigned long long v95;  // 4106
    unsigned long v96;  // 4112
    unsigned long long v97;  // 4106
    unsigned long v98;  // 4112
    unsigned long v99;  // cc_op

    v0 = 456;
    v1 = 496;
    if (!a0)
        v0 = v1;
    v2 = a0;
    v3 = (__m128i)(CONCAT(a0 | a0 * 0x100000000, a0 | a0 * 0x100000000));
    v4 = 432;
    v5 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_and_si128(v3, _mm_set_epi64x(0, 0xfffffffefffffffc)));
    v6 = *(unsigned int *)((void*)&v5 + 4);
    if (a0 == 1)
        v0 = v4;
    if (v6 != 2)
    {
        v7 = arm64g_calculate_condition(19, v2, 1, 0);
        v8 = arm64g_calculate_condition(3, (v7 & 1 ? a0 : 0x40000000), (v7 & 1 ? 4 : 0), 0);
        if (!(v8 & 1))
            goto LABEL_3658e;
        v0 = 504;
LABEL_3658d:
    }
    else
    {
        v9 = arm64g_calculate_condition(19, v2, 1, 0);
        v10 = arm64g_calculate_condition(0, (v9 & 1 ? a0 : 0x40000000), (v9 & 1 ? 4 : 0), 0);
        if (v10 & 1)
            goto LABEL_3658d;
LABEL_3658e:
    }
    v11 = a0;
    v12 = 104;
    if (a0 == 5)
        v0 = v12;
    v13 = *(unsigned int *)&*(unsigned int *)(void*)&v5;
    if (v6 != 6)
    {
        v14 = arm64g_calculate_condition(19, v11, 5, 0);
        v15 = 3;
        v16 = (v14 & 1 ? v13 : 0x40000000);
        v17 = (v14 & 1 ? 8 : 0);
        v18 = arm64g_calculate_condition(19, v16, v17, 0);
        if (!(v18 & 1))
            goto LABEL_365aa;
LABEL_365a9:
        v21 = arm64g_calculate_condition(v15 | 16, v16, v17, 0);
        v22 = arm64g_calculate_condition(3, (v21 & 1 ? a0 : 0x40000000), (v21 & 1 ? 12 : 0), 0);
        if (!(v22 & 1))
            goto LABEL_365b2;
        v0 = 272;
LABEL_365b1:
    }
    else
    {
        v19 = arm64g_calculate_condition(19, v11, 5, 0);
        v15 = 0;
        v16 = (v19 & 1 ? v13 : 0x40000000);
        v17 = (v19 & 1 ? 8 : 0);
        v20 = arm64g_calculate_condition(16, v16, v17, 0);
        if (v20 & 1)
            goto LABEL_365a9;
LABEL_365aa:
        v23 = arm64g_calculate_condition(v15 | 16, v16, v17, 0);
        v24 = arm64g_calculate_condition(0, (v23 & 1 ? a0 : 0x40000000), (v23 & 1 ? 12 : 0), 0);
        if (v24 & 1)
            goto LABEL_365b1;
LABEL_365b2:
    }
    v25 = 304;
    if (a0 == 13)
        v0 = v25;
    v26 = 352;
    if (a0 == 14)
        v0 = v26;
    v27 = 80;
    if (a0 == 15)
        v0 = v27;
    v28 = 232;
    if (a0 == 16)
        v0 = v28;
    v29 = 488;
    if (a0 == 0x11)
        v0 = v29;
    v30 = 144;
    if (v6 == 18)
        v0 = v30;
    v31 = 64;
    if (a0 == 20)
        v0 = v31;
    v32 = a0;
    v33 = 216;
    if (a0 == 21)
        v0 = v33;
    if (v6 != 22)
    {
        v34 = arm64g_calculate_condition(19, v32, 21, 0);
        v35 = arm64g_calculate_condition(3, (v34 & 1 ? v13 : 0x40000000), (v34 & 1 ? 24 : 0), 0);
        if (!(v35 & 1))
            goto LABEL_36622;
        v0 = 128;
LABEL_36621:
    }
    else
    {
        v36 = arm64g_calculate_condition(19, v32, 21, 0);
        v37 = arm64g_calculate_condition(0, (v36 & 1 ? v13 : 0x40000000), (v36 & 1 ? 24 : 0), 0);
        if (v37 & 1)
            goto LABEL_36621;
LABEL_36622:
    }
    v38 = 0x100;
    if (a0 == 28)
        v0 = v38;
    v39 = 312;
    if (a0 == 29)
        v0 = v39;
    v40 = 296;
    if (a0 == 30)
        v0 = v40;
    v41 = 376;
    if (a0 - 31 < 3)
        v0 = v41;
    v42 = 8;
    if (a0 == 0x22)
        v0 = v42;
    v43 = 176;
    if (a0 - 35 < 2)
        v0 = v43;
    v44 = 0x88;
    if (a0 == 37)
        v0 = v44;
    v45 = 96;
    if (v6 == 38)
        v0 = v45;
    v46 = 464;
    if (a0 == 40)
        v0 = v46;
    v47 = 112;
    if (a0 == 41)
        v0 = v47;
    v48 = 336;
    if (a0 == 42)
        v0 = v48;
    v49 = 344;
    if (a0 == 43)
        v0 = v49;
    v50 = 72;
    if (a0 == 44)
        v0 = v50;
    if (a0 == 45)
        v0 = 0;
    v51 = 328;
    if (a0 == 46)
        v0 = v51;
    v52 = 240;
    if (a0 - 47 < 2)
        v0 = v52;
    v53 = 480;
    if (a0 == 49)
        v0 = v53;
    v54 = 264;
    if (v6 == 50)
        v0 = v54;
    v55 = 16;
    if (a0 == 52)
        v0 = v55;
    v56 = 320;
    if (a0 == 53)
        v0 = v56;
    v57 = 32;
    if (a0 == 54)
        v0 = v57;
    v58 = 392;
    if (a0 - 55 < 2)
        v0 = v58;
    v59 = 360;
    if (a0 == 57)
        v0 = v59;
    v60 = 368;
    if (a0 == 58)
        v0 = v60;
    v61 = 56;
    if (a0 == 59)
        v0 = v61;
    v62 = 400;
    if (a0 == 60)
        v0 = v62;
    v63 = 160;
    if (a0 == 61)
        v0 = v63;
    v64 = 192;
    if (a0 == 62)
        v0 = v64;
    v65 = 416;
    if (a0 == 63)
        v0 = v65;
    v66 = a0;
    v67 = 248;
    if (a0 == 64)
        v0 = v67;
    v68 = a0 - 65;
    v69 = a0 - 71;
    if (v6 != 0x44)
    {
        v70 = arm64g_calculate_condition(19, v66, 64, 0);
        v71 = 3;
        v72 = (v70 & 1 ? v69 : 0);
        v73 = (v70 & 1 ? 2 : 0);
        v74 = arm64g_calculate_condition(35, v72, v73, 0);
        if (!(v74 & 1))
            goto LABEL_367aa;
LABEL_367a9:
        v77 = arm64g_calculate_condition(v71 | 32, v72, v73, 0);
        v78 = 3;
        v79 = (v77 & 1 ? v68 : 0);
        v80 = (v77 & 1 ? 2 : 0);
        v81 = arm64g_calculate_condition(35, v79, v80, 0);
        if (!(v81 & 1))
            goto LABEL_367b2;
LABEL_367b1:
        v84 = arm64g_calculate_condition(v78 | 32, v79, v80, 0);
        v85 = 3;
        v86 = (v84 & 1 ? a0 : 0x40000000);
        v87 = (v84 & 1 ? 74 : 0);
        v88 = arm64g_calculate_condition(19, v86, v87, 0);
        if (!(v88 & 1))
            goto LABEL_367ba;
LABEL_367b9:
        v91 = arm64g_calculate_condition(v85 | 16, v86, v87, 0);
        v92 = 3;
        v93 = (v91 & 1 ? a0 : 0x40000000);
        v94 = (v91 & 1 ? 76 : 0);
        v95 = arm64g_calculate_condition(3, v93, v94, 0);
        if (!(v95 & 1))
            goto LABEL_367c2;
        goto LABEL_367c1;
    }
    else
    {
        v75 = arm64g_calculate_condition(19, v66, 64, 0);
        v71 = 0;
        v72 = (v75 & 1 ? v69 : 0);
        v73 = (v75 & 1 ? 2 : 0);
        v76 = arm64g_calculate_condition(32, v72, v73, 0);
        if (v76 & 1)
            goto LABEL_367a9;
LABEL_367aa:
        v82 = arm64g_calculate_condition(v71 | 32, v72, v73, 0);
        v78 = 0;
        v79 = (v82 & 1 ? v68 : 0);
        v80 = (v82 & 1 ? 2 : 0);
        v83 = arm64g_calculate_condition(32, v79, v80, 0);
        if (v83 & 1)
            goto LABEL_367b1;
LABEL_367b2:
        v89 = arm64g_calculate_condition(v78 | 32, v79, v80, 0);
        v85 = 0;
        v86 = (v89 & 1 ? a0 : 0x40000000);
        v87 = (v89 & 1 ? 74 : 0);
        v90 = arm64g_calculate_condition(16, v86, v87, 0);
        if (v90 & 1)
            goto LABEL_367b9;
LABEL_367ba:
        v96 = arm64g_calculate_condition(v85 | 16, v86, v87, 0);
        v92 = 0;
        v93 = (v96 & 1 ? a0 : 0x40000000);
        v94 = (v96 & 1 ? 76 : 0);
        v97 = arm64g_calculate_condition(0, v93, v94, 0);
        if (v97 & 1)
        {
            v0 = 168;
LABEL_367c1:
        }
        else
        {
LABEL_367c2:
        }
    }
    if (a0 != 67)
    {
        v98 = arm64g_calculate_condition(v92 | 16, v93, v94, 0);
        v99 = 3;
        v100 = (v98 & 1 ? a0 : 0x40000000);
        v101 = (v98 & 1 ? 70 : 0);
        v102 = a0 & 0xfffffffd;
        v103 = arm64g_calculate_condition(19, v100, v101, 0);
        if (!(v103 & 1))
            goto LABEL_367da;
LABEL_367d9:
        v106 = arm64g_calculate_condition(v99 | 16, v100, v101, 0);
        v107 = 3;
        v108 = (v106 & 1 ? v102 : 0x40000000);
        v109 = (v106 & 1 ? 73 : 0);
        v110 = arm64g_calculate_condition(19, v108, v109, 0);
        if (!(v110 & 1))
            goto LABEL_367e2;
LABEL_367e1:
        v113 = arm64g_calculate_condition(v107 | 16, v108, v109, 0);
        v114 = 3;
        v115 = (v113 & 1 ? a0 : 0x40000000);
        v116 = (v113 & 1 ? 77 : 0);
        v117 = arm64g_calculate_condition(19, v115, v116, 0);
        if (!(v117 & 1))
            goto LABEL_367ea;
LABEL_367e9:
        v120 = arm64g_calculate_condition(v114 | 16, v115, v116, 0);
        v121 = arm64g_calculate_condition(3, (v120 & 1 ? a0 : 0x40000000), (v120 & 1 ? 132 : 0), 0);
        if (!(v121 & 1))
            goto LABEL_367f2;
        goto LABEL_367f1;
    }
    else
    {
        v104 = arm64g_calculate_condition(v92 | 16, v93, v94, 0);
        v99 = 0;
        v100 = (v104 & 1 ? a0 : 0x40000000);
        v101 = (v104 & 1 ? 70 : 0);
        v102 = a0 & 0xfffffffd;
        v105 = arm64g_calculate_condition(16, v100, v101, 0);
        if (v105 & 1)
            goto LABEL_367d9;
LABEL_367da:
        v111 = arm64g_calculate_condition(v99 | 16, v100, v101, 0);
        v107 = 0;
        v108 = (v111 & 1 ? v102 : 0x40000000);
        v109 = (v111 & 1 ? 73 : 0);
        v112 = arm64g_calculate_condition(16, v108, v109, 0);
        if (v112 & 1)
            goto LABEL_367e1;
LABEL_367e2:
        v118 = arm64g_calculate_condition(v107 | 16, v108, v109, 0);
        v114 = 0;
        v115 = (v118 & 1 ? a0 : 0x40000000);
        v116 = (v118 & 1 ? 77 : 0);
        v119 = arm64g_calculate_condition(16, v115, v116, 0);
        if (v119 & 1)
            goto LABEL_367e9;
LABEL_367ea:
        v122 = arm64g_calculate_condition(v114 | 16, v115, v116, 0);
        v123 = arm64g_calculate_condition(0, (v122 & 1 ? a0 : 0x40000000), (v122 & 1 ? 132 : 0), 0);
        if (v123 & 1)
        {
            v0 = 440;
LABEL_367f1:
        }
        else
        {
LABEL_367f2:
        }
    }
    v124 = 408;
    if (a0 == 131)
        v0 = v124;
    v125 = 24;
    if (v6 == 78)
        v0 = v125;
    v126 = v6;
    v127 = 48;
    if (v6 == 80)
        v0 = v127;
    if (v6 != 82)
    {
        v128 = arm64g_calculate_condition(19, v126, 80, 0);
        v129 = arm64g_calculate_condition(3, (v128 & 1 ? v6 : 0x40000000), (v128 & 1 ? 84 : 0), 0);
        if (!(v129 & 1))
            goto LABEL_3682a;
        v0 = 120;
LABEL_36829:
    }
    else
    {
        v130 = arm64g_calculate_condition(19, v126, 80, 0);
        v131 = arm64g_calculate_condition(0, (v130 & 1 ? v6 : 0x40000000), (v130 & 1 ? 84 : 0), 0);
        if (v131 & 1)
            goto LABEL_36829;
LABEL_3682a:
    }
    v132 = 200;
    if (a0 == 86)
        v0 = v132;
    v133 = 424;
    if (a0 - 87 < 2)
        v0 = v133;
    v134 = 448;
    if (a0 == 90)
        v0 = v134;
    v135 = 184;
    if (a0 == 89)
        v0 = v135;
    v136 = 472;
    v137 = arm64g_calculate_condition(3, a0, 91, 0);
    if (v137 & 1)
        v0 = v136;
    v138 = 280;
    if (a0 == 92)
        v0 = v138;
    v139 = a0;
    v140 = 40;
    if (a0 == 93)
        v0 = v140;
    v141 = a0 - 101;
    if (2 <= a0 - 109)
    {
        v142 = arm64g_calculate_condition(35, v139, 93, 0);
        v143 = 3;
        v144 = (v142 & 1 ? a0 : 0x40000000);
        v145 = (v142 & 1 ? 127 : 0);
        v146 = arm64g_calculate_condition(19, v144, v145, 0);
        if (!(v146 & 1))
            goto LABEL_3689a;
LABEL_36899:
        v149 = arm64g_calculate_condition(v143 | 16, v144, v145, 0);
        v150 = 3;
        v151 = (v149 & 1 ? a0 : 0x40000000);
        v152 = (v149 & 1 ? 112 : 0);
        v153 = arm64g_calculate_condition(19, v151, v152, 0);
        if (!(v153 & 1))
            goto LABEL_3689e;
LABEL_3689d:
        v156 = arm64g_calculate_condition(v150 | 16, v151, v152, 0);
        v157 = arm64g_calculate_condition(0x33, (v156 & 1 ? v141 : 0), (v156 & 1 ? 2 : 0), 0);
        if (!(v157 & 1))
            goto LABEL_368a6;
        v0 = 288;
LABEL_368a5:
    }
    else
    {
        v147 = arm64g_calculate_condition(35, v139, 93, 0);
        v143 = 0;
        v144 = (v147 & 1 ? a0 : 0x40000000);
        v145 = (v147 & 1 ? 127 : 0);
        v148 = arm64g_calculate_condition(16, v144, v145, 0);
        if (v148 & 1)
            goto LABEL_36899;
LABEL_3689a:
        v154 = arm64g_calculate_condition(v143 | 16, v144, v145, 0);
        v150 = 0;
        v151 = (v154 & 1 ? a0 : 0x40000000);
        v152 = (v154 & 1 ? 112 : 0);
        v155 = arm64g_calculate_condition(16, v151, v152, 0);
        if (v155 & 1)
            goto LABEL_3689d;
LABEL_3689e:
        v158 = arm64g_calculate_condition(v150 | 16, v151, v152, 0);
        v159 = arm64g_calculate_condition(48, (v158 & 1 ? v141 : 0), (v158 & 1 ? 2 : 0), 0);
        if (v159 & 1)
            goto LABEL_368a5;
LABEL_368a6:
    }
    v160 = a0;
    v161 = 224;
    if (a0 == 126)
        v0 = v161;
    if (a0 != 111)
    {
        v162 = arm64g_calculate_condition(19, v160, 126, 0);
        v163 = 3;
        v164 = (v162 & 1 ? a0 : 0x40000000);
        v165 = (v162 & 1 ? 130 : 0);
        v166 = arm64g_calculate_condition(19, v164, v165, 0);
        if (!(v166 & 1))
            goto LABEL_368c2;
LABEL_368c1:
        v169 = arm64g_calculate_condition(v163 | 16, v164, v165, 0);
        v170 = 3;
        v171 = (v169 & 1 ? a0 : 0x40000000);
        v172 = (v169 & 1 ? 96 : 0);
        v173 = arm64g_calculate_condition(19, v171, v172, 0);
        if (!(v173 & 1))
            goto LABEL_368c6;
LABEL_368c5:
        v176 = arm64g_calculate_condition(v170 | 16, v171, v172, 0);
        v177 = 3;
        v178 = (v176 & 1 ? v6 : 0x40000000);
        v179 = (v176 & 1 ? 128 : 0);
        v180 = arm64g_calculate_condition(19, v178, v179, 0);
        if (!(v180 & 1))
            goto LABEL_368ce;
LABEL_368cd:
        v183 = arm64g_calculate_condition(v177 | 16, v178, v179, 0);
        v184 = arm64g_calculate_condition(3, (v183 & 1 ? v6 : 0x40000000), (v183 & 1 ? 94 : 0), 0);
        if (!(v184 & 1))
            goto LABEL_368d6;
        goto LABEL_368d5;
    }
    else
    {
        v167 = arm64g_calculate_condition(19, v160, 126, 0);
        v163 = 0;
        v164 = (v167 & 1 ? a0 : 0x40000000);
        v165 = (v167 & 1 ? 130 : 0);
        v168 = arm64g_calculate_condition(16, v164, v165, 0);
        if (v168 & 1)
            goto LABEL_368c1;
LABEL_368c2:
        v174 = arm64g_calculate_condition(v163 | 16, v164, v165, 0);
        v170 = 0;
        v171 = (v174 & 1 ? a0 : 0x40000000);
        v172 = (v174 & 1 ? 96 : 0);
        v175 = arm64g_calculate_condition(16, v171, v172, 0);
        if (v175 & 1)
            goto LABEL_368c5;
LABEL_368c6:
        v181 = arm64g_calculate_condition(v170 | 16, v171, v172, 0);
        v177 = 0;
        v178 = (v181 & 1 ? v6 : 0x40000000);
        v179 = (v181 & 1 ? 128 : 0);
        v182 = arm64g_calculate_condition(16, v178, v179, 0);
        if (v182 & 1)
            goto LABEL_368cd;
LABEL_368ce:
        v185 = arm64g_calculate_condition(v177 | 16, v178, v179, 0);
        v186 = arm64g_calculate_condition(0, (v185 & 1 ? v6 : 0x40000000), (v185 & 1 ? 94 : 0), 0);
        if (v186 & 1)
        {
            v0 = 152;
LABEL_368d5:
        }
        else
        {
LABEL_368d6:
        }
    }
    v187 = a0;
    v188 = 88;
    if (a0 == 108)
        v0 = v188;
    v189 = a0 - 105;
    v191 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn16to8x8(CatEvenLanesV(_mm_cmpeq_epi32(v3, _mm_set_epi32(104, 99, 103, 100)), _mm_cmpeq_epi32(_INSERT(v5, 8, *(unsigned long long *)&*(unsigned long long *)(void*)&v5), _mm_set_epi32(124, 120, 114, 116)))));
    v192 = __dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))))))))));
    if (2 <= a0 - 97)
    {
        v193 = arm64g_calculate_condition(35, v187, 108, 0);
        v194 = 3;
        v195 = (v193 & 1 ? v189 : 0);
        v196 = (v193 & 1 ? 3 : 0);
    }
    else
    {
        v197 = arm64g_calculate_condition(35, v187, 108, 0);
        v194 = 0;
        v195 = (v197 & 1 ? v189 : 0);
        v196 = (v197 & 1 ? 3 : 0);
    }
    v198 = arm64g_calculate_condition(v194 | 32, v195, v196, 0);
    v199 = 208;
    if (__float_as_int(v192) & 1 || a0 == 113 || !(v198 & 1))
        v0 = v199;
    goto *((void *)(*(long long *)((char *)&g_e64948 + v0)));
}
