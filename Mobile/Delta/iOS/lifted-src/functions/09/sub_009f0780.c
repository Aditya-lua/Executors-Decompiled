/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f0780..0x9f0f60 (2016 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f0780_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
    uint128_t field_80;
    uint128_t field_90;
    uint128_t field_a0;
    uint128_t field_b0;
    uint128_t field_c0;
    uint128_t field_d0;
    uint128_t field_e0;
    uint128_t field_f0;
    uint128_t field_100;
    uint128_t field_110;
    uint128_t field_120;
    uint128_t field_130;
} st_9f0780_0;


st_9f0780_0 * sub_9f0780(st_9f0780_0 *a0, st_9f0780_0 *a1, unsigned long long a2, void* a3, void* a4)
{
    unsigned long v10;  // x24
    unsigned long long v11;  // x25
    unsigned long long v20;  // x5
    unsigned long long v110;  // x9
    unsigned long long v111;  // x10
    unsigned long long v112;  // x11
    unsigned long long v113;  // x12
    __m128i v114;  // q17
    __m128i v115;  // q21
    __m128i v116;  // q25
    __m128i v117;  // q29
    __m128i v118;  // q16
    unsigned long long v119;  // x5
    __m128i v21;  // q20
    __m128i v120;  // q20
    unsigned long long v121;  // x6
    __m128i v122;  // q24
    unsigned long long v123;  // x7
    __m128i v124;  // q28
    unsigned long long v125;  // x8
    __m128i v126;  // q31
    unsigned long long v127;  // x21
    __m128i v128;  // q19
    unsigned long long v129;  // x17
    unsigned long long v22;  // x6
    __m128i v130;  // q23
    unsigned long long v131;  // x19
    __m128i v132;  // q27
    unsigned long long v133;  // x20
    __m128i v134;  // q26
    unsigned long long v135;  // x15
    __m128i v136;  // q30
    unsigned long long v137;  // x16
    __m128i v138;  // q18
    unsigned long long v139;  // x13
    __m128i v23;  // q24
    __m128i v140;  // q22
    unsigned long long v141;  // x14
    unsigned long long v142;  // x10
    unsigned long long v143;  // x11
    unsigned long long v144;  // x12
    unsigned long long v145;  // x9
    __m128i v146;  // q21
    __m128i v147;  // q25
    __m128i v148;  // q29
    __m128i v149;  // q17
    unsigned long long v24;  // x7
    __m128i v150;  // q19
    __m128i v151;  // q4
    __m128i v152;  // q5
    __m128i v153;  // q6
    __m128i v154;  // q7
    __m128i v155;  // q16
    __m128i v156;  // q20
    __m128i v157;  // q24
    __m128i v158;  // q28
    __m128i v159;  // q4
    __m128i v25;  // q28
    __m128i v160;  // q5
    __m128i v161;  // q6
    __m128i v162;  // q7
    __m128i v163;  // q17
    __m128i v164;  // q21
    __m128i v165;  // q25
    __m128i v166;  // q29
    __m128i v167;  // q4
    unsigned long long v168;  // x5
    __m128i v169;  // q5
    unsigned long long v26;  // x8
    unsigned long long v170;  // x6
    __m128i v171;  // q6
    unsigned long long v172;  // x7
    __m128i v173;  // q7
    unsigned long long v174;  // x8
    __m128i v175;  // q18
    unsigned long long v176;  // x9
    __m128i v177;  // q22
    unsigned long long v178;  // x10
    __m128i v179;  // q26
    __m128i v27;  // q17
    unsigned long long v180;  // x11
    __m128i v181;  // q30
    unsigned long long v182;  // x12
    __m128i v183;  // q4
    unsigned long long v184;  // x13
    __m128i v185;  // q5
    unsigned long long v186;  // x14
    __m128i v187;  // q6
    unsigned long long v188;  // x15
    __m128i v189;  // q7
    unsigned long long v28;  // x9
    unsigned long long v190;  // x16
    __m128i v191;  // q19
    unsigned long long v192;  // x17
    __m128i v193;  // q23
    unsigned long long v194;  // x19
    __m128i v195;  // q27
    unsigned long v196;  // x20
    __m128i v197;  // q31
    unsigned long long v198;  // x21
    unsigned long long v199;  // 4306
    __m128i v29;  // q21
    unsigned long long v200;  // x8
    unsigned long long v201;  // x10
    unsigned long long v202;  // x12
    unsigned long long v203;  // x14
    unsigned long long v204;  // x16
    unsigned long long v205;  // x19
    unsigned long long v206;  // x21
    uint128_t *v207;  // x1
    __m128i v208;  // q7
    __m128i v209;  // q6
    unsigned long v12;  // x26
    unsigned long long v30;  // x10
    __m128i v210;  // q5
    __m128i v211;  // q4
    uint128_t *v212;  // x1
    __m128i v213;  // q7
    __m128i v214;  // q6
    __m128i v215;  // q5
    __m128i v216;  // q4
    uint128_t *v217;  // x1
    st_9f0780_0 *v218;  // x0
    st_9f0780_0 *v219;  // x0
    __m128i v31;  // q25
    __m128i v220;  // q19
    __m128i v221;  // q18
    __m128i v222;  // q17
    __m128i v223;  // q16
    uint128_t *v224;  // x1
    uint128_t *v225;  // x0
    __m128i v226;  // q23
    __m128i v227;  // q22
    __m128i v228;  // q21
    __m128i v229;  // q20
    unsigned long long v32;  // x11
    uint128_t *v230;  // x0
    unsigned long long v231;  // 4468
    unsigned long long v232;  // x2
    unsigned long long v233;  // x8
    unsigned long long v234;  // x10
    unsigned long long v235;  // x14
    unsigned long long v236;  // x16
    unsigned long long v237;  // x19
    unsigned long long v238;  // x21
    uint128_t *v239;  // x1
    __m128i v33;  // q29
    unsigned long v240;  // x11
    __m128i v241;  // q16
    __m128i v242;  // q17
    __m128i v243;  // q18
    __m128i v244;  // q19
    st_9f0780_0 *iter;  // x0
    unsigned long long v246;  // 4252
    unsigned long long node;  // x2
    __m128i v248;  // q6
    __m128i v249;  // q5
    unsigned long long v34;  // x12
    __m128i v250;  // q4
    uint128_t *v251;  // x1
    unsigned long long v252;  // 4142
    __m128i v253;  // q6
    __m128i v254;  // q5
    __m128i v255;  // q4
    uint128_t *v256;  // x1
    unsigned long long v257;  // 4142
    __m128i v258;  // q6
    __m128i v259;  // q5
    unsigned long long v35;  // x13
    __m128i v260;  // q4
    st_9f0780_0 *v261;  // x0
    unsigned long long v262;  // 4142
    unsigned long long i;  // x2
    unsigned long long v264;  // x2
    __m128i v36;  // q23
    unsigned long long v37;  // x14
    __m128i v38;  // q27
    unsigned long long v39;  // x15
    unsigned long long v13;  // x27
    __m128i v40;  // q31
    unsigned long long v41;  // x16
    __m128i v42;  // q19
    unsigned long long v43;  // x17
    __m128i v44;  // q18
    unsigned long long v45;  // x19
    __m128i v46;  // q22
    unsigned long long v47;  // x20
    __m128i v48;  // q26
    unsigned long long v49;  // x21
    __m128i v14;  // q2
    __m128i v50;  // q30
    unsigned long long j;  // x4
    unsigned long long v52;  // x2
    unsigned long v53;  // cc_dep1
    __m128i v54;  // q16
    unsigned long long v55;  // x5
    __m128i v56;  // q20
    unsigned long long v57;  // x6
    __m128i v58;  // q24
    unsigned long long v59;  // x7
    __m128i v15;  // q1
    __m128i v60;  // q28
    unsigned long long v61;  // x8
    __m128i v62;  // q19
    unsigned long long v63;  // x17
    __m128i v64;  // q23
    unsigned long long v65;  // x19
    __m128i v66;  // q27
    unsigned long long v67;  // x20
    __m128i v68;  // q31
    unsigned long long v69;  // x21
    unsigned long v16;  // x28
    __m128i v70;  // q18
    unsigned long long v71;  // x13
    __m128i v72;  // q22
    unsigned long long v73;  // x14
    __m128i v74;  // q26
    unsigned long long v75;  // x15
    __m128i v76;  // q30
    unsigned long long v77;  // x16
    unsigned long long v78;  // x9
    unsigned long long v79;  // x10
    __m128i v17;  // q3
    unsigned long long v80;  // x11
    unsigned long long v81;  // x12
    __m128i v82;  // q17
    unsigned long long v83;  // x5
    __m128i v84;  // q21
    unsigned long long v85;  // x6
    __m128i v86;  // q25
    unsigned long long v87;  // x7
    __m128i v88;  // q29
    unsigned long long v89;  // x8
    __m128i v18;  // q8
    __m128i v90;  // q16
    __m128i v91;  // q20
    __m128i v92;  // q24
    __m128i v93;  // q28
    unsigned long long v94;  // x17
    unsigned long long v95;  // x19
    unsigned long long v96;  // x20
    unsigned long long v97;  // x21
    __m128i v98;  // q19
    unsigned long long v99;  // x13
    __m128i v19;  // q16
    __m128i v100;  // q23
    unsigned long long v101;  // x14
    __m128i v102;  // q27
    unsigned long long v103;  // x15
    __m128i v104;  // q31
    unsigned long long v105;  // x16
    __m128i v106;  // q18
    __m128i v107;  // q22
    __m128i v108;  // q26
    __m128i v109;  // q30
    __m128i v0;  // [bp-0xa0], Other Possible Types: unsigned long long
    unsigned long long v1;  // [bp-0x98]
    __m128i v2;  // [bp-0x90], Other Possible Types: unsigned long long
    unsigned long long v3;  // [bp-0x88]
    uint128_t v4;  // [bp-0x80], Other Possible Types: unsigned long long
    unsigned long long v5;  // [bp-0x78]
    uint128_t v6;  // [bp-0x70], Other Possible Types: unsigned long long
    unsigned long long v7;  // [bp-0x68]
    char *v8;  // [bp-0x60]
    char v9;  // [bp+0x0]

    v8 = &v9;
    if (0x200 <= a2)
        goto LABEL_0x9f0f84;
    v10 = *(long long *)a3;
    v11 = (long long)a3[8];
    v12 = (long long)a3[16];
    v13 = (long long)a3[24];
    v14 = (int128_t)a3[16];
    v15 = *(int128_t *)a3;
    v16 = *(long long *)a4;
    x30 = (long long)a4[8];
    v17 = *(int128_t *)a4;
    v18 = _mm_set_epi64x(17179869187, 8589934593);
    while (1)
    {
        v19 = CatEvenLanesV(_mm_unpacklo_epi64(_mm_set_epi64x(7719281312240119090, 3684054920433006693), _mm_set_epi64x(7719281312240119090, 3684054920433006693)), _mm_unpacklo_epi64(_mm_set_epi64x(7719281312240119090, 3684054920433006693), _mm_set_epi64x(7719281312240119090, 3684054920433006693)));
        v20 = 1634760805;
        v21 = CatOddLanesV(_mm_unpacklo_epi64(_mm_set_epi64x(7719281312240119090, 3684054920433006693), _mm_set_epi64x(7719281312240119090, 3684054920433006693)), _mm_unpacklo_epi64(_mm_set_epi64x(7719281312240119090, 3684054920433006693), _mm_set_epi64x(7719281312240119090, 3684054920433006693)));
        v22 = 857760878;
        v23 = CatEvenLanesV(_mm_unpackhi_epi64(_mm_set_epi64x(7719281312240119090, 3684054920433006693), _mm_set_epi64x(7719281312240119090, 3684054920433006693)), _mm_unpackhi_epi64(_mm_set_epi64x(7719281312240119090, 3684054920433006693), _mm_set_epi64x(7719281312240119090, 3684054920433006693)));
        v24 = 2036477234;
        v25 = CatOddLanesV(_mm_unpackhi_epi64(_mm_set_epi64x(7719281312240119090, 3684054920433006693), _mm_set_epi64x(7719281312240119090, 3684054920433006693)), _mm_unpackhi_epi64(_mm_set_epi64x(7719281312240119090, 3684054920433006693), _mm_set_epi64x(7719281312240119090, 3684054920433006693)));
        v26 = 1797285236;
        v27 = CatEvenLanesV(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15));
        v28 = v10 & 0xffffffff;
        v29 = CatOddLanesV(_mm_unpacklo_epi64(v15, v15), _mm_unpacklo_epi64(v15, v15));
        v30 = v10 >> 32;
        v31 = CatEvenLanesV(_mm_unpackhi_epi64(v15, v15), _mm_unpackhi_epi64(v15, v15));
        v32 = v11 & 0xffffffff;
        v33 = CatOddLanesV(_mm_unpackhi_epi64(v15, v15), _mm_unpackhi_epi64(v15, v15));
        v34 = v11 >> 32;
        v35 = v12 & 0xffffffff;
        v36 = CatOddLanesV(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17));
        v37 = v12 >> 32;
        v38 = CatEvenLanesV(_mm_unpackhi_epi64(v17, v17), _mm_unpackhi_epi64(v17, v17));
        v39 = v13 & 0xffffffff;
        v40 = CatOddLanesV(_mm_unpackhi_epi64(v17, v17), _mm_unpackhi_epi64(v17, v17));
        v41 = v13 >> 32;
        v42 = _mm_add_epi32(CatEvenLanesV(_mm_unpacklo_epi64(v17, v17), _mm_unpacklo_epi64(v17, v17)), v18);
        v43 = v16 & 0xffffffff;
        v44 = CatEvenLanesV(_mm_unpacklo_epi64(v14, v14), _mm_unpacklo_epi64(v14, v14));
        v45 = v16 >> 32;
        v46 = CatOddLanesV(_mm_unpacklo_epi64(v14, v14), _mm_unpacklo_epi64(v14, v14));
        v47 = x30 & 0xffffffff;
        v48 = CatEvenLanesV(_mm_unpackhi_epi64(v14, v14), _mm_unpackhi_epi64(v14, v14));
        v49 = (unsigned int)(x30) >> 32;
        v50 = CatOddLanesV(_mm_unpackhi_epi64(v14, v14), _mm_unpackhi_epi64(v14, v14));
        j = 10;
        v52 = a2 - 320;
        v53 = a2;
        do
        {
            j -= 1;
            v54 = _mm_add_epi32(v19, v27);
            v55 = v20 + v28;
            v56 = _mm_add_epi32(v21, v29);
            v57 = v22 + v30;
            v58 = _mm_add_epi32(v23, v31);
            v59 = v24 + v32;
            v60 = _mm_add_epi32(v25, v33);
            v61 = v26 + v34;
            v62 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v54, v42));
            v63 = ((unsigned int)v43 ^ (unsigned int)v55) * 0x10000 | ((unsigned int)v43 ^ (unsigned int)v55) >> 16;
            v64 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v56, v36));
            v65 = ((unsigned int)v45 ^ (unsigned int)v57) * 0x10000 | ((unsigned int)v45 ^ (unsigned int)v57) >> 16;
            v66 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v58, v38));
            v67 = ((unsigned int)v47 ^ (unsigned int)v59) * 0x10000 | ((unsigned int)v47 ^ (unsigned int)v59) >> 16;
            v68 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v60, v40));
            v69 = ((unsigned int)v49 ^ (unsigned int)v61) * 0x10000 | ((unsigned int)v49 ^ (unsigned int)v61) >> 16;
            v70 = _mm_add_epi32(v44, v62);
            v71 = v35 + v63;
            v72 = _mm_add_epi32(v46, v64);
            v73 = v37 + v65;
            v74 = _mm_add_epi32(v48, v66);
            v75 = v39 + v67;
            v76 = _mm_add_epi32(v50, v68);
            v77 = v41 + v69;
            v78 = ((unsigned int)v28 ^ (unsigned int)v71) * 0x1000 | ((unsigned int)v28 ^ (unsigned int)v71) >> 20;
            v79 = ((unsigned int)v30 ^ (unsigned int)v73) * 0x1000 | ((unsigned int)v30 ^ (unsigned int)v73) >> 20;
            v80 = ((unsigned int)v32 ^ (unsigned int)v75) * 0x1000 | ((unsigned int)v32 ^ (unsigned int)v75) >> 20;
            v81 = ((unsigned int)v34 ^ (unsigned int)v77) * 0x1000 | ((unsigned int)v34 ^ (unsigned int)v77) >> 20;
            v82 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v70, v27), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v70, v27), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v83 = v55 + v78;
            v84 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v72, v29), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v72, v29), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v85 = v57 + v79;
            v86 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v74, v31), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v74, v31), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v87 = v59 + v80;
            v88 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v76, v33), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v76, v33), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v89 = v61 + v81;
            v90 = _mm_add_epi32(v54, v82);
            v91 = _mm_add_epi32(v56, v84);
            v92 = _mm_add_epi32(v58, v86);
            v93 = _mm_add_epi32(v60, v88);
            v94 = ((unsigned int)v63 ^ (unsigned int)v83) * 0x100 | ((unsigned int)v63 ^ (unsigned int)v83) >> 24;
            v95 = ((unsigned int)v65 ^ (unsigned int)v85) * 0x100 | ((unsigned int)v65 ^ (unsigned int)v85) >> 24;
            v96 = ((unsigned int)v67 ^ (unsigned int)v87) * 0x100 | ((unsigned int)v67 ^ (unsigned int)v87) >> 24;
            v97 = ((unsigned int)v69 ^ (unsigned int)v89) * 0x100 | ((unsigned int)v69 ^ (unsigned int)v89) >> 24;
            v98 = _mm_and_si128(PermV(_mm_xor_si128(v90, v62), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v99 = v71 + v94;
            v100 = _mm_and_si128(PermV(_mm_xor_si128(v91, v64), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v101 = v73 + v95;
            v102 = _mm_and_si128(PermV(_mm_xor_si128(v92, v66), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v103 = v75 + v96;
            v104 = _mm_and_si128(PermV(_mm_xor_si128(v93, v68), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v105 = v77 + v97;
            v106 = _mm_add_epi32(v70, v98);
            v107 = _mm_add_epi32(v72, v100);
            v108 = _mm_add_epi32(v74, v102);
            v109 = _mm_add_epi32(v76, v104);
            v110 = ((unsigned int)v78 ^ (unsigned int)v99) * 128 | ((unsigned int)v78 ^ (unsigned int)v99) >> 25;
            v111 = ((unsigned int)v79 ^ (unsigned int)v101) * 128 | ((unsigned int)v79 ^ (unsigned int)v101) >> 25;
            v112 = ((unsigned int)v80 ^ (unsigned int)v103) * 128 | ((unsigned int)v80 ^ (unsigned int)v103) >> 25;
            v113 = ((unsigned int)v81 ^ (unsigned int)v105) * 128 | ((unsigned int)v81 ^ (unsigned int)v105) >> 25;
            v114 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v106, v82), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v106, v82), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25)));
            v115 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v107, v84), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v107, v84), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25)));
            v116 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v108, v86), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v108, v86), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25)));
            v117 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v109, v88), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v109, v88), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25)));
            v118 = _mm_add_epi32(v90, v115);
            v119 = v83 + v111;
            v120 = _mm_add_epi32(v91, v116);
            v121 = v85 + v112;
            v122 = _mm_add_epi32(v92, v117);
            v123 = v87 + v113;
            v124 = _mm_add_epi32(v93, v114);
            v125 = v89 + v110;
            v126 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v118, v104));
            v127 = ((unsigned int)v97 ^ (unsigned int)v119) * 0x10000 | ((unsigned int)v97 ^ (unsigned int)v119) >> 16;
            v128 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v120, v98));
            v129 = ((unsigned int)v94 ^ (unsigned int)v121) * 0x10000 | ((unsigned int)v94 ^ (unsigned int)v121) >> 16;
            v130 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v122, v100));
            v131 = ((unsigned int)v95 ^ (unsigned int)v123) * 0x10000 | ((unsigned int)v95 ^ (unsigned int)v123) >> 16;
            v132 = __dirty_unsupported_Iop_Reverse16sIn32_x4(_mm_xor_si128(v124, v102));
            v133 = ((unsigned int)v96 ^ (unsigned int)v125) * 0x10000 | ((unsigned int)v96 ^ (unsigned int)v125) >> 16;
            v134 = _mm_add_epi32(v108, v126);
            v135 = v103 + v127;
            v136 = _mm_add_epi32(v109, v128);
            v137 = v105 + v129;
            v138 = _mm_add_epi32(v106, v130);
            v139 = v99 + v131;
            v140 = _mm_add_epi32(v107, v132);
            v141 = v101 + v133;
            v142 = ((unsigned int)v111 ^ (unsigned int)v135) * 0x1000 | ((unsigned int)v111 ^ (unsigned int)v135) >> 20;
            v143 = ((unsigned int)v112 ^ (unsigned int)v137) * 0x1000 | ((unsigned int)v112 ^ (unsigned int)v137) >> 20;
            v144 = ((unsigned int)v113 ^ (unsigned int)v139) * 0x1000 | ((unsigned int)v113 ^ (unsigned int)v139) >> 20;
            v145 = ((unsigned int)v110 ^ (unsigned int)v141) * 0x1000 | ((unsigned int)v110 ^ (unsigned int)v141) >> 20;
            v146 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v134, v115), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v134, v115), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v20 = v119 + v142;
            v147 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v136, v116), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v136, v116), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v22 = v121 + v143;
            v148 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v138, v117), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v138, v117), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v24 = v123 + v144;
            v149 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v140, v114), 12), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v140, v114), 20), _mm_srli_epi32(_mm_set1_epi32(-1), 20)));
            v26 = v125 + v145;
            v19 = _mm_add_epi32(v118, v146);
            v21 = _mm_add_epi32(v120, v147);
            v23 = _mm_add_epi32(v122, v148);
            v25 = _mm_add_epi32(v124, v149);
            v49 = ((unsigned int)v127 ^ (unsigned int)v20) * 0x100 | ((unsigned int)v127 ^ (unsigned int)v20) >> 24;
            v43 = ((unsigned int)v129 ^ (unsigned int)v22) * 0x100 | ((unsigned int)v129 ^ (unsigned int)v22) >> 24;
            v45 = ((unsigned int)v131 ^ (unsigned int)v24) * 0x100 | ((unsigned int)v131 ^ (unsigned int)v24) >> 24;
            v47 = ((unsigned int)v133 ^ (unsigned int)v26) * 0x100 | ((unsigned int)v133 ^ (unsigned int)v26) >> 24;
            v40 = _mm_and_si128(PermV(_mm_xor_si128(v19, v126), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v39 = v135 + v49;
            v42 = _mm_and_si128(PermV(_mm_xor_si128(v21, v128), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v41 = v137 + v43;
            v36 = _mm_and_si128(PermV(_mm_xor_si128(v23, v130), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v35 = v139 + v45;
            v38 = _mm_and_si128(PermV(_mm_xor_si128(v25, v132), _mm_and_si128(_mm_set_epi64x(1012478749960636427, 433757367256023043), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(14, 13, 12, 15, 10, 9, 8, 11, 6, 5, 4, 7, 2, 1, 0, 3)));
            v37 = v141 + v47;
            v48 = _mm_add_epi32(v134, v40);
            v50 = _mm_add_epi32(v136, v42);
            v44 = _mm_add_epi32(v138, v36);
            v46 = _mm_add_epi32(v140, v38);
            v30 = ((unsigned int)v142 ^ (unsigned int)v39) * 128 | ((unsigned int)v142 ^ (unsigned int)v39) >> 25;
            v32 = ((unsigned int)v143 ^ (unsigned int)v41) * 128 | ((unsigned int)v143 ^ (unsigned int)v41) >> 25;
            v34 = ((unsigned int)v144 ^ (unsigned int)v35) * 128 | ((unsigned int)v144 ^ (unsigned int)v35) >> 25;
            v28 = ((unsigned int)v145 ^ (unsigned int)v37) * 128 | ((unsigned int)v145 ^ (unsigned int)v37) >> 25;
            v29 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v48, v146), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v48, v146), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25)));
            v31 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v50, v147), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v50, v147), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25)));
            v33 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v44, v148), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v44, v148), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25)));
            v27 = _mm_or_si128(_mm_slli_epi32(_mm_xor_si128(v46, v149), 7), _mm_and_si128(_mm_srli_epi32(_mm_xor_si128(v46, v149), 25), _mm_srli_epi32(_mm_set1_epi32(-1), 25)));
        } while (j);
        v150 = _mm_add_epi32(v42, v18);
        v151 = _mm_unpacklo_epi32(v19, v21);
        v152 = _mm_unpacklo_epi32(v23, v25);
        v153 = _mm_unpackhi_epi32(v19, v21);
        v154 = _mm_unpackhi_epi32(v23, v25);
        v155 = _mm_unpacklo_epi64(v151, v152);
        v156 = _mm_unpackhi_epi64(v151, v152);
        v157 = _mm_unpacklo_epi64(v153, v154);
        v158 = _mm_unpackhi_epi64(v153, v154);
        v159 = _mm_unpacklo_epi32(v27, v29);
        v160 = _mm_unpacklo_epi32(v31, v33);
        v161 = _mm_unpackhi_epi32(v27, v29);
        v162 = _mm_unpackhi_epi32(v31, v33);
        v163 = _mm_unpacklo_epi64(v159, v160);
        v164 = _mm_unpackhi_epi64(v159, v160);
        v165 = _mm_unpacklo_epi64(v161, v162);
        v166 = _mm_unpackhi_epi64(v161, v162);
        v167 = _mm_unpacklo_epi32(v44, v46);
        v168 = v20 + 3684054920433006693;
        v169 = _mm_unpacklo_epi32(v48, v50);
        v170 = v22 + 857760878;
        v171 = _mm_unpackhi_epi32(v44, v46);
        v172 = v24 + 7719281312240119090;
        v173 = _mm_unpackhi_epi32(v48, v50);
        v174 = v26 + 1797285236;
        v175 = _mm_unpacklo_epi64(v167, v169);
        v176 = v28 + v10;
        v177 = _mm_unpackhi_epi64(v167, v169);
        v178 = v30 + (v10 >> 32);
        v179 = _mm_unpacklo_epi64(v171, v173);
        v180 = v32 + v11;
        v181 = _mm_unpackhi_epi64(v171, v173);
        v182 = v34 + (v11 >> 32);
        v183 = _mm_unpacklo_epi32(v150, v36);
        v184 = v35 + v12;
        v185 = _mm_unpacklo_epi32(v38, v40);
        v186 = v37 + (v12 >> 32);
        v187 = _mm_unpackhi_epi32(v150, v36);
        v188 = v39 + v13;
        v189 = _mm_unpackhi_epi32(v38, v40);
        v190 = v41 + (v13 >> 32);
        v191 = _mm_unpacklo_epi64(v183, v185);
        v192 = v43 + v16;
        v193 = _mm_unpackhi_epi64(v183, v185);
        v194 = v45 + (v16 >> 32);
        v195 = _mm_unpacklo_epi64(v187, v189);
        v196 = v47 + x30;
        v197 = _mm_unpackhi_epi64(v187, v189);
        v198 = v49 + ((unsigned int)(x30) >> 32);
        v199 = arm64g_calculate_condition(52, v53, 320, 0);
        if (v199 & 1)
            break;
        v200 = a1->field_8;
        v201 = a1->field_10;
        v202 = a1->field_18;
        v203 = a1->field_20;
        v204 = a1->field_28;
        v205 = a1->field_30;
        v206 = a1->field_38;
        v207 = &a1->field_40;
        v208 = v207[3];
        v209 = v207[2];
        v210 = v207[1];
        v211 = *v207;
        v212 = v207 + 4;
        v18 = _mm_add_epi32(v18, _mm_set1_epi32(5));
        v213 = v212[3];
        v214 = v212[2];
        v215 = v212[1];
        v216 = *v212;
        v217 = v212 + 4;
        a0->field_0 = v168 + v170 * 0x100000000 ^ a1->field_0;
        a0->field_8 = v172 + v174 * 0x100000000 ^ v200;
        v16 += 5;
        a0->field_10 = v176 + v178 * 0x100000000 ^ v201;
        a0->field_18 = v180 + v182 * 0x100000000 ^ v202;
        a0->field_20 = v184 + v186 * 0x100000000 ^ v203;
        a0->field_28 = v188 + v190 * 0x100000000 ^ v204;
        a0->field_30 = v192 + v194 * 0x100000000 ^ v205;
        a0->field_38 = v196 + v198 * 0x100000000 ^ v206;
        v218 = &a0->field_40;
        *(__m128i *)&v218->field_30 = _mm_xor_si128(v208, _mm_add_epi32(v191, v17));
        *(__m128i *)&v218->field_20 = _mm_xor_si128(v209, _mm_add_epi32(v175, v14));
        *(__m128i *)&v218->field_10 = _mm_xor_si128(v210, _mm_add_epi32(v163, v15));
        *(__m128i *)&v218->field_0 = _mm_xor_si128(v211, _mm_add_epi32(v155, _mm_set_epi32(1797285236, 2036477234, 857760878, 1634760805)));
        v219 = &v218->field_40;
        v220 = v217[3];
        v221 = v217[2];
        v222 = v217[1];
        v223 = *v217;
        v224 = v217 + 4;
        *(__m128i *)&v219->field_30 = _mm_xor_si128(v213, _mm_add_epi32(v193, v17));
        *(__m128i *)&v219->field_20 = _mm_xor_si128(v214, _mm_add_epi32(v177, v14));
        *(__m128i *)&v219->field_10 = _mm_xor_si128(v215, _mm_add_epi32(v164, v15));
        *(__m128i *)&v219->field_0 = _mm_xor_si128(v216, _mm_add_epi32(v156, _mm_set_epi32(1797285236, 2036477234, 857760878, 1634760805)));
        v225 = &v219->field_40;
        v226 = v224[3];
        v227 = v224[2];
        v228 = v224[1];
        v229 = *v224;
        a1 = v224 + 4;
        v225[3] = _mm_xor_si128(v220, _mm_add_epi32(v195, v17));
        v225[2] = _mm_xor_si128(v221, _mm_add_epi32(v179, v14));
        v225[1] = _mm_xor_si128(v222, _mm_add_epi32(v165, v15));
        *v225 = _mm_xor_si128(v223, _mm_add_epi32(v157, _mm_set_epi32(1797285236, 2036477234, 857760878, 1634760805)));
        v230 = v225 + 4;
        v230[3] = _mm_xor_si128(v226, _mm_add_epi32(v197, v17));
        v230[2] = _mm_xor_si128(v227, _mm_add_epi32(v181, v14));
        v230[1] = _mm_xor_si128(v228, _mm_add_epi32(v166, v15));
        *v230 = _mm_xor_si128(v229, _mm_add_epi32(v158, _mm_set_epi32(1797285236, 2036477234, 857760878, 1634760805)));
        a0 = v230 + 4;
        v231 = arm64g_calculate_condition(132, v53, 320, 0);
        a2 = v52;
        if (!(v231 & 1))
            return v230 + 4;
    }
    v232 = v52 + 320;
    if (v232 < 64)
        goto LABEL_0x9f0684;
    v233 = a1->field_8;
    v234 = a1->field_10;
    v235 = a1->field_20;
    v236 = a1->field_28;
    v237 = a1->field_30;
    v238 = a1->field_38;
    v239 = &a1->field_40;
    v240 = v180 + v182 * 0x100000000 ^ a1->field_18;
    a0->field_0 = v168 + v170 * 0x100000000 ^ a1->field_0;
    a0->field_8 = v172 + v174 * 0x100000000 ^ v233;
    v241 = _mm_add_epi32(v155, _mm_set_epi32(1797285236, 2036477234, 857760878, 1634760805));
    a0->field_10 = v176 + v178 * 0x100000000 ^ v234;
    a0->field_18 = v240;
    v242 = _mm_add_epi32(v163, v15);
    a0->field_20 = v184 + v186 * 0x100000000 ^ v235;
    a0->field_28 = v188 + v190 * 0x100000000 ^ v236;
    v243 = _mm_add_epi32(v175, v14);
    a0->field_30 = v192 + v194 * 0x100000000 ^ v237;
    a0->field_38 = v196 + v198 * 0x100000000 ^ v238;
    v244 = _mm_add_epi32(v191, v17);
    iter = &a0->field_40;
    v246 = arm64g_calculate_condition(4, v232, 64, 0);
    if (v246 & 1)
        return iter;
    node = v232 - 64;
    if (node >= 64)
    {
        v248 = v239[2];
        v249 = v239[1];
        v250 = *v239;
        v251 = v239 + 4;
        *(__m128i *)&iter->field_30 = _mm_xor_si128(v239[3], v244);
        *(__m128i *)&iter->field_20 = _mm_xor_si128(v248, v243);
        *(__m128i *)&iter->field_10 = _mm_xor_si128(v249, v242);
        *(__m128i *)&iter->field_0 = _mm_xor_si128(v250, v241);
        iter = &iter->field_40;
        v252 = arm64g_calculate_condition(4, node, 64, 0);
        if (v252 & 1)
            return iter;
        v241 = _mm_add_epi32(v156, _mm_set_epi32(1797285236, 2036477234, 857760878, 1634760805));
        v242 = _mm_add_epi32(v164, v15);
        node -= 64;
        v243 = _mm_add_epi32(v177, v14);
        v244 = _mm_add_epi32(v193, v17);
        v239 = v251;
        if (node >= 64)
        {
            v253 = v251[2];
            v254 = v251[1];
            v255 = *v251;
            v256 = v251 + 4;
            *(__m128i *)&iter->field_30 = _mm_xor_si128(v251[3], v244);
            *(__m128i *)&iter->field_20 = _mm_xor_si128(v253, v243);
            *(__m128i *)&iter->field_10 = _mm_xor_si128(v254, v242);
            *(__m128i *)&iter->field_0 = _mm_xor_si128(v255, v241);
            iter = &iter->field_40;
            v257 = arm64g_calculate_condition(4, node, 64, 0);
            if (v257 & 1)
                return iter;
            v241 = _mm_add_epi32(v157, _mm_set_epi32(1797285236, 2036477234, 857760878, 1634760805));
            v242 = _mm_add_epi32(v165, v15);
            node -= 64;
            v243 = _mm_add_epi32(v179, v14);
            v244 = _mm_add_epi32(v195, v17);
            v239 = v256;
            if (node >= 64)
            {
                v258 = v256[2];
                v259 = v256[1];
                v260 = *v256;
                v239 = v256 + 4;
                *(__m128i *)&iter->field_30 = _mm_xor_si128(v256[3], v244);
                *(__m128i *)&iter->field_20 = _mm_xor_si128(v258, v243);
                *(__m128i *)&iter->field_10 = _mm_xor_si128(v259, v242);
                *(__m128i *)&iter->field_0 = _mm_xor_si128(v260, v241);
                v261 = &iter->field_40;
                v262 = arm64g_calculate_condition(4, node, 64, 0);
                if (v262 & 1)
                    return &iter->field_40;
                v241 = _mm_add_epi32(v158, _mm_set_epi32(1797285236, 2036477234, 857760878, 1634760805));
                v242 = _mm_add_epi32(v166, v15);
                v243 = _mm_add_epi32(v181, v14);
                v244 = _mm_add_epi32(v197, v17);
                node -= 64;
                iter = v261;
            }
        }
    }
    v6 = v244;
    v4 = v243;
    v2 = v242;
    v0 = v241;
    i = -node;
    do
    {
        v264 = i + 1;
        *((char *)iter + node + v264 - 1) = *((char *)v239 + node + i) ^ *((char *)&v0 + node + i);
        i = v264;
    } while (i);
    v0 = (__m128i)0;
    v1 = 0;
    v2 = (__m128i)0;
    v3 = 0;
    v4 = 0;
    v5 = 0;
    v6 = 0;
    v7 = 0;
    return (char *)iter + node - 1;
}
