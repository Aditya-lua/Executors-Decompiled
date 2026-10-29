/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d9880..0x9da2c0 (2624 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int * sub_9d9880(unsigned int *a0, uint128_t *a1, unsigned int *a2, uint128_t *a3, unsigned int *a4, unsigned long a5, unsigned long a6, unsigned long a7, char a8, unsigned long a9, unsigned long a10, unsigned long a11, unsigned long a12, unsigned long a13, unsigned long a14, unsigned long a15, unsigned long a16, unsigned long a17, unsigned long a18, unsigned long a19, unsigned long a20, unsigned long a21, unsigned long a22, unsigned long a23, unsigned long a24, unsigned long a25, unsigned long a26, unsigned long a27, unsigned long a28, unsigned long a29, unsigned int a30, unsigned int a31, unsigned int a32, unsigned int a33, unsigned int a34, unsigned int a35, unsigned int a36, unsigned int a37)
{
    unsigned long long v11;  // x30
    unsigned long long v12;  // d8
    __m128i v21;  // q6
    __m128i v111;  // q6
    __m128i v112;  // q29
    unsigned long long *v113;  // x10
    unsigned long v114;  // d29
    unsigned int *v115;  // x2
    __m128i v116;  // q10
    __m128i v117;  // q11
    unsigned long v118;  // d28
    __m128i v120;  // q11
    __m128i v22;  // q7
    unsigned long long *v121;  // x10
    __m128i v122;  // q11
    __m128i v123;  // q10
    uint128_t *v124;  // x6
    __m128i v126;  // q29
    unsigned long long *v127;  // x10
    unsigned long v128;  // d29
    unsigned int *v129;  // x2
    __m128i v130;  // q11
    __m128i v23;  // q8
    __m128i v131;  // q12
    unsigned long v132;  // d28
    __m128i v134;  // q12
    unsigned long long *v135;  // x10
    __m128i v136;  // q12
    __m128i v137;  // q11
    uint128_t *v138;  // x6
    __m128i v140;  // q29
    __m128i v24;  // q9
    unsigned long long *v141;  // x10
    unsigned long v142;  // d29
    __m128i v143;  // q12
    __m128i v144;  // q13
    unsigned long v145;  // d28
    __m128i v147;  // q13
    unsigned long long *v148;  // x10
    __m128i v149;  // q13
    __m128i v150;  // q12
    __m128i v25;  // q10
    unsigned long node;  // x6
    __m128i v153;  // q29
    unsigned long v154;  // d29
    unsigned long long v155;  // d28
    __m128i v156;  // q13
    __m128i v157;  // q1
    __m128i v158;  // q0
    __m128i v159;  // q7
    uint128_t *v26;  // x7
    __m128i v161;  // q8
    __m128i v162;  // q9
    __m128i v163;  // q10
    __m128i v164;  // q13
    __m128i v165;  // q11
    __m128i v166;  // q12
    __m128i v167;  // q6
    unsigned long long v168;  // x8
    unsigned long long v169;  // x8
    unsigned long v170;  // cc_dep1
    __m128i v27;  // q11
    unsigned long v171;  // d29
    unsigned long long *v172;  // x10
    __m128i v173;  // q3
    __m128i v174;  // q2
    __m128i v175;  // q9
    unsigned long v176;  // x6
    unsigned long v177;  // x6
    __m128i v178;  // q13
    unsigned long v179;  // d28
    unsigned long long *v180;  // x10
    unsigned long long v28;  // x8
    uint128_t *v181;  // x7
    unsigned long v182;  // d29
    unsigned long long *v183;  // x10
    unsigned long long v184;  // 4278
    unsigned long v185;  // x6
    unsigned long iter;  // x6
    __m128i v187;  // q10
    unsigned long v188;  // d28
    unsigned long long *v189;  // x10
    __m128i v190;  // q6
    __m128i v29;  // q12
    uint128_t *v191;  // x7
    __m128i v192;  // q7
    unsigned long v193;  // d29
    unsigned long long *v194;  // x10
    unsigned long long v195;  // 4288
    __m128i v196;  // q11
    unsigned long v197;  // d28
    unsigned long long *v198;  // x10
    uint128_t *v199;  // x7
    unsigned long v200;  // d29
    __m128i v30;  // q13
    unsigned long long *v201;  // x10
    unsigned long long v202;  // 4288
    unsigned long v203;  // x6
    unsigned long iter1;  // x6
    __m128i v205;  // q12
    unsigned long v206;  // d28
    unsigned long long *v207;  // x10
    __m128i v208;  // q6
    __m128i v209;  // q7
    __m128i v210;  // q8
    unsigned long long v13;  // d9
    unsigned long long i;  // x8
    uint128_t *v211;  // x7
    __m128i v212;  // q9
    unsigned long v213;  // d29
    unsigned long long *v214;  // x10
    unsigned long long v215;  // 4288
    __m128i v216;  // q13
    unsigned long v217;  // d28
    unsigned long long *v218;  // x10
    uint128_t *v219;  // x7
    unsigned long v220;  // d29
    uint128_t *v32;  // x7
    unsigned long long *v221;  // x10
    unsigned long long v222;  // 4288
    unsigned long v223;  // x6
    unsigned long v224;  // d28
    unsigned long long *v225;  // x10
    __m128i v226;  // q10
    uint128_t *v227;  // x7
    __m128i v228;  // q11
    unsigned long v229;  // d29
    unsigned long long *v230;  // x10
    unsigned long long v33;  // x8
    unsigned long long v231;  // 4288
    unsigned long v232;  // d28
    uint128_t *v233;  // x7
    __m128i v234;  // q12
    unsigned long v235;  // d29
    unsigned long long v236;  // 4288
    unsigned long long v237;  // 4152
    unsigned long long v238;  // 4205
    uint128_t *v239;  // x6
    uint128_t *v240;  // x7
    uint128_t *v34;  // x7
    uint128_t *v241;  // x7
    unsigned long long v242;  // x9
    uint128_t *v243;  // x6
    uint128_t *v244;  // x6
    uint128_t *v245;  // x6
    unsigned int *v246;  // x7
    __m128i v247;  // q6
    __m128i v248;  // q6
    unsigned int v249;  // s6
    __m128i v250;  // q15
    uint128_t *v35;  // x7
    unsigned long long v251;  // x8
    __m128i v252;  // q7
    unsigned int *v253;  // x7
    __m128i v255;  // q7
    __m128i v258;  // q8
    unsigned int *v259;  // x7
    unsigned long v36;  // x6
    __m128i v261;  // q8
    __m128i v264;  // q9
    unsigned int *v265;  // x7
    __m128i v267;  // q9
    __m128i v270;  // q10
    __m128i v37;  // q1
    unsigned int *v271;  // x7
    __m128i v273;  // q10
    __m128i v276;  // q11
    unsigned int *v277;  // x7
    __m128i v279;  // q11
    __m128i v38;  // q0
    __m128i v282;  // q12
    unsigned int *v283;  // x7
    __m128i v285;  // q12
    __m128i v288;  // q13
    unsigned int *v289;  // x7
    uint128_t *iter2;  // x1
    __m128i v291;  // q13
    unsigned int v292;  // s13
    __m128i v293;  // q15
    __m128i v294;  // q6
    uint128_t *v295;  // x6
    unsigned long long v296;  // x8
    __m128i v297;  // q6
    __m128i v298;  // q6
    uint128_t *v299;  // x6
    __m128i v300;  // q6
    unsigned long long *v40;  // x10
    uint128_t *v301;  // x6
    unsigned int *v302;  // x3
    unsigned long v303;  // cc_op
    unsigned long v304;  // cc_dep2
    unsigned long v305;  // cc_ndep
    uint128_t *v306;  // x2
    unsigned long v307;  // cc_dep1
    unsigned int *v308;  // x1
    unsigned int v309;  // w5
    unsigned int *v310;  // x1
    unsigned long long v14;  // d10
    __m128i v41;  // q30
    unsigned int v311;  // w6
    unsigned int v312;  // w7
    unsigned int *v313;  // x1
    unsigned int v314;  // w9
    unsigned int *v315;  // x3
    unsigned int v316;  // w10
    unsigned int v317;  // w11
    unsigned int *v318;  // x3
    unsigned long long v319;  // 4181
    unsigned long long v320;  // 4198
    unsigned long long v42;  // x9
    unsigned long long v321;  // 4215
    unsigned long long v322;  // 4232
    unsigned int *v323;  // x0
    void* v324;  // x1
    unsigned int *v325;  // x0
    uint128_t *v326;  // x3
    unsigned long v327;  // 4140
    unsigned long v328;  // cc_dep1
    unsigned long v329;  // cc_ndep
    void* v330;  // x1
    unsigned int *v43;  // x2
    void* v331;  // x1
    unsigned int v332;  // w8
    unsigned int v333;  // w9
    unsigned int *v334;  // x0
    unsigned int v335;  // w10
    unsigned int v336;  // w11
    unsigned int *v337;  // x0
    unsigned long long v338;  // 4145
    uint128_t *v339;  // x3
    uint128_t *v340;  // x3
    unsigned long v44;  // d28
    unsigned int v341;  // w4
    unsigned int v342;  // w5
    unsigned int *v343;  // x1
    unsigned int v344;  // w6
    unsigned int v345;  // w7
    unsigned int *v346;  // x0
    unsigned int *v347;  // x0
    void* v348;  // x1
    unsigned int v349;  // w8
    unsigned int v350;  // w9
    uint128_t *v45;  // x7
    unsigned int *v351;  // x0
    unsigned int v352;  // w10
    unsigned int v353;  // w11
    unsigned int *v354;  // x0
    unsigned long long v355;  // 4180
    unsigned int *v356;  // x0
    __m128i v46;  // q3
    __m128i v47;  // q2
    uint128_t *v48;  // x3
    __m128i v49;  // q6
    unsigned long long v15;  // d11
    __m128i v51;  // q29
    unsigned long v52;  // d29
    unsigned int *v53;  // x2
    __m128i v54;  // q6
    __m128i v55;  // q7
    unsigned long v56;  // d28
    __m128i v58;  // q11
    __m128i v59;  // q7
    unsigned long long *v60;  // x10
    unsigned long long v16;  // d12
    __m128i v61;  // q7
    __m128i v62;  // q6
    uint128_t *v63;  // x6
    __m128i v65;  // q29
    unsigned long long *v66;  // x10
    unsigned long v67;  // d29
    unsigned int *v68;  // x2
    __m128i v69;  // q7
    __m128i v70;  // q8
    unsigned long long v17;  // d13
    unsigned long v71;  // d28
    __m128i v73;  // q12
    __m128i v74;  // q8
    unsigned long long *v75;  // x10
    __m128i v76;  // q8
    __m128i v77;  // q7
    uint128_t *v78;  // x6
    __m128i v80;  // q29
    unsigned long long v18;  // d14
    unsigned long long *v81;  // x10
    unsigned long v82;  // d29
    unsigned int *v83;  // x2
    __m128i v84;  // q8
    __m128i v85;  // q9
    unsigned long v86;  // d28
    __m128i v88;  // q13
    __m128i v89;  // q9
    unsigned long long *v90;  // x10
    unsigned long long v19;  // d15
    __m128i v91;  // q9
    __m128i v92;  // q8
    uint128_t *v93;  // x6
    __m128i v95;  // q29
    unsigned long long *v96;  // x10
    unsigned long v97;  // d29
    unsigned int *v98;  // x2
    __m128i v99;  // q9
    __m128i v100;  // q10
    unsigned long long v20;  // x5
    unsigned long v101;  // d28
    __m128i v103;  // q7
    __m128i v104;  // q8
    __m128i v105;  // q10
    unsigned long long *v106;  // x10
    __m128i v107;  // q10
    __m128i v108;  // q9
    uint128_t *v109;  // x6
    char v0;  // [bp-0xd0]
    char *v1;  // [bp-0x50]
    unsigned long long v2;  // [bp-0x48]
    unsigned long long v3;  // [bp-0x40]
    unsigned long long v4;  // [bp-0x38]
    unsigned long long v5;  // [bp-0x30]
    unsigned long long v6;  // [bp-0x28]
    unsigned long long v7;  // [bp-0x20]
    unsigned long long v8;  // [bp-0x18]
    unsigned long long v9;  // [bp-0x10]
    unsigned long long v10;  // [bp-0x8]

    v1 = &a8;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = v16;
    v8 = v17;
    v9 = v18;
    v10 = v19;
    v20 = a5 * 2;
    v21 = _mm_setzero_si128();
    v22 = _mm_setzero_si128();
    v23 = _mm_setzero_si128();
    v24 = _mm_setzero_si128();
    xsp = &(&v0)[-16 * v20] & 0xffffffffffffffc0;
    v25 = _mm_setzero_si128();
    v26 = xsp + 0x100;
    v27 = _mm_setzero_si128();
    v28 = v20 - 8;
    v29 = _mm_setzero_si128();
    v30 = _mm_setzero_si128();
    do
    {
        i = v28;
        v26[1] = 0;
        *v26 = 0;
        v32 = v26 + 2;
        v33 = i - 8;
        v32[1] = 0;
        *v32 = 0;
        v34 = v32 + 2;
        v34[1] = 0;
        *v34 = 0;
        v35 = v34 + 2;
        v35[1] = 0;
        *v35 = 0;
        v26 = v35 + 2;
        v28 = v33;
    } while (i != 8);
    v36 = xsp + 0x100;
    v37 = a1[1];
    v38 = *a1;
    iter2 = a1 + 2;
    v40 = xsp + 8;
    v41 = *a4;
    v42 = v20;
    while (1)
    {
        v43 = a2 + 1;
        v44 = _mm_cvtsi128_si64(_mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), *a2), 16));
        v45 = xsp + 128;
        v46 = a3[1];
        v47 = *a3;
        v48 = a3 + 2;
        v49 = _mm_add_epi64(v21, MullV(v44, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v38, v38), _mm_unpacklo_epi64(v38, v38)))));
        v51 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_mullo_epi32(_mm_add_epi64(__dirty_unsupported_Iop_SliceV128(_mm_slli_epi64(v49, 16), _mm_slli_epi64(v49, 16), 8), v49), v41));
        *(unsigned long *)xsp = v44;
        v52 = _mm_cvtsi128_si64(_mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v51), 16));
        v53 = v43 + 1;
        v54 = _mm_add_epi64(v49, MullV(v52, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))));
        v55 = _mm_add_epi64(_mm_add_epi64(v22, MullV(v44, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v38, v38), _mm_unpacklo_epi64(v38, v38))))), MullV(v52, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))));
        v56 = _mm_cvtsi128_si64(_mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), *v43), 16));
        v58 = _mm_add_epi64(_mm_add_epi64(v27, MullV(v44, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v37, v37), _mm_unpacklo_epi64(v37, v37))))), MullV(v52, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v46, v46), _mm_unpacklo_epi64(v46, v46)))));
        v59 = (__m128i)_INSERT(v55, 0, _mm_cvtsi128_si64(v55) + ((unsigned long long)__dirty_unsupported_Iop_SliceV128(v54, v54, 8) + ((unsigned long long)(_mm_cvtsi128_si64(v54)) >> 16) >> 16));
        *v40 = v52;
        v60 = v40 + 1;
        v61 = _mm_add_epi64(v59, MullV(v56, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v38, v38), _mm_unpacklo_epi64(v38, v38)))));
        v62 = *(int128_t *)v36;
        v63 = v36 + 16;
        v65 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_mullo_epi32(_mm_add_epi64(__dirty_unsupported_Iop_SliceV128(_mm_slli_epi64(v61, 16), _mm_slli_epi64(v61, 16), 8), v61), v41));
        *v60 = v56;
        v66 = v60 + 1;
        v67 = _mm_cvtsi128_si64(_mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v65), 16));
        v68 = v53 + 1;
        v69 = _mm_add_epi64(v61, MullV(v67, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))));
        v70 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v23, MullV(v44, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v38, v38), _mm_unpackhi_epi64(v38, v38))))), MullV(v52, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v47, v47), _mm_unpackhi_epi64(v47, v47))))), MullV(v56, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v38, v38), _mm_unpacklo_epi64(v38, v38))))), MullV(v67, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))));
        v71 = _mm_cvtsi128_si64(_mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), *v53), 16));
        v73 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v29, MullV(v44, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v37, v37), _mm_unpackhi_epi64(v37, v37))))), MullV(v52, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v46, v46), _mm_unpackhi_epi64(v46, v46))))), MullV(v56, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v37, v37), _mm_unpacklo_epi64(v37, v37))))), MullV(v67, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v46, v46), _mm_unpacklo_epi64(v46, v46)))));
        v74 = (__m128i)_INSERT(v70, 0, _mm_cvtsi128_si64(v70) + ((unsigned long long)__dirty_unsupported_Iop_SliceV128(v69, v69, 8) + ((unsigned long long)(_mm_cvtsi128_si64(v69)) >> 16) >> 16));
        *v66 = v67;
        v75 = v66 + 1;
        v76 = _mm_add_epi64(v74, MullV(v71, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v38, v38), _mm_unpacklo_epi64(v38, v38)))));
        v77 = *v63;
        v78 = v63 + 1;
        v80 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_mullo_epi32(_mm_add_epi64(__dirty_unsupported_Iop_SliceV128(_mm_slli_epi64(v76, 16), _mm_slli_epi64(v76, 16), 8), v76), v41));
        *v75 = v71;
        v81 = v75 + 1;
        v82 = _mm_cvtsi128_si64(_mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v80), 16));
        v83 = v68 + 1;
        v84 = _mm_add_epi64(v76, MullV(v82, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))));
        v85 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v24, MullV(v44, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v38, v38), _mm_unpackhi_epi64(v38, v38))))), MullV(v52, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v47, v47), _mm_unpackhi_epi64(v47, v47))))), MullV(v56, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v38, v38), _mm_unpackhi_epi64(v38, v38))))), MullV(v67, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v47, v47), _mm_unpackhi_epi64(v47, v47))))), MullV(v71, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v38, v38), _mm_unpacklo_epi64(v38, v38))))), MullV(v82, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))));
        v86 = _mm_cvtsi128_si64(_mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), *v68), 16));
        v88 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v30, MullV(v44, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v37, v37), _mm_unpackhi_epi64(v37, v37))))), MullV(v52, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v46, v46), _mm_unpackhi_epi64(v46, v46))))), MullV(v56, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v37, v37), _mm_unpackhi_epi64(v37, v37))))), MullV(v67, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v46, v46), _mm_unpackhi_epi64(v46, v46))))), MullV(v71, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v37, v37), _mm_unpacklo_epi64(v37, v37))))), MullV(v82, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v46, v46), _mm_unpacklo_epi64(v46, v46)))));
        v89 = (__m128i)_INSERT(v85, 0, _mm_cvtsi128_si64(v85) + ((unsigned long long)__dirty_unsupported_Iop_SliceV128(v84, v84, 8) + ((unsigned long long)(_mm_cvtsi128_si64(v84)) >> 16) >> 16));
        *v81 = v82;
        v90 = v81 + 1;
        v91 = _mm_add_epi64(v89, MullV(v86, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v38, v38), _mm_unpacklo_epi64(v38, v38)))));
        v92 = *v78;
        v93 = v78 + 1;
        v95 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_mullo_epi32(_mm_add_epi64(__dirty_unsupported_Iop_SliceV128(_mm_slli_epi64(v91, 16), _mm_slli_epi64(v91, 16), 8), v91), v41));
        *v90 = v86;
        v96 = v90 + 1;
        v97 = _mm_cvtsi128_si64(_mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v95), 16));
        v98 = v83 + 1;
        v99 = _mm_add_epi64(v91, MullV(v97, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))));
        v100 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v25, MullV(v44, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v37, v37), _mm_unpacklo_epi64(v37, v37))))), MullV(v52, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v46, v46), _mm_unpacklo_epi64(v46, v46))))), MullV(v56, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v38, v38), _mm_unpackhi_epi64(v38, v38))))), MullV(v67, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v47, v47), _mm_unpackhi_epi64(v47, v47))))), MullV(v71, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v38, v38), _mm_unpackhi_epi64(v38, v38))))), MullV(v82, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v47, v47), _mm_unpackhi_epi64(v47, v47))))), MullV(v86, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v38, v38), _mm_unpacklo_epi64(v38, v38))))), MullV(v97, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))));
        v101 = _mm_cvtsi128_si64(_mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), *v83), 16));
        v103 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v77, MullV(v71, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v37, v37), _mm_unpackhi_epi64(v37, v37))))), MullV(v82, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v46, v46), _mm_unpackhi_epi64(v46, v46))))), MullV(v86, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v37, v37), _mm_unpackhi_epi64(v37, v37))))), MullV(v97, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v46, v46), _mm_unpackhi_epi64(v46, v46)))));
        v104 = _mm_add_epi64(_mm_add_epi64(v92, MullV(v86, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v37, v37), _mm_unpackhi_epi64(v37, v37))))), MullV(v97, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v46, v46), _mm_unpackhi_epi64(v46, v46)))));
        v105 = (__m128i)_INSERT(v100, 0, _mm_cvtsi128_si64(v100) + ((unsigned long long)__dirty_unsupported_Iop_SliceV128(v99, v99, 8) + ((unsigned long long)(_mm_cvtsi128_si64(v99)) >> 16) >> 16));
        *v96 = v97;
        v106 = v96 + 1;
        v107 = _mm_add_epi64(v105, MullV(v101, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v38, v38), _mm_unpacklo_epi64(v38, v38)))));
        v108 = *v93;
        v109 = v93 + 1;
        v111 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v62, MullV(v56, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v37, v37), _mm_unpackhi_epi64(v37, v37))))), MullV(v67, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v46, v46), _mm_unpackhi_epi64(v46, v46))))), MullV(v71, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v37, v37), _mm_unpackhi_epi64(v37, v37))))), MullV(v82, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v46, v46), _mm_unpackhi_epi64(v46, v46))))), MullV(v86, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v37, v37), _mm_unpacklo_epi64(v37, v37))))), MullV(v97, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v46, v46), _mm_unpacklo_epi64(v46, v46))))), MullV(v101, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v37, v37), _mm_unpacklo_epi64(v37, v37)))));
        v112 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_mullo_epi32(_mm_add_epi64(__dirty_unsupported_Iop_SliceV128(_mm_slli_epi64(v107, 16), _mm_slli_epi64(v107, 16), 8), v107), v41));
        *v106 = v101;
        v113 = v106 + 1;
        v114 = _mm_cvtsi128_si64(_mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v112), 16));
        v115 = v98 + 1;
        v116 = _mm_add_epi64(v107, MullV(v114, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))));
        v117 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v58, MullV(v56, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v37, v37), _mm_unpacklo_epi64(v37, v37))))), MullV(v67, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v46, v46), _mm_unpacklo_epi64(v46, v46))))), MullV(v71, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v38, v38), _mm_unpackhi_epi64(v38, v38))))), MullV(v82, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v47, v47), _mm_unpackhi_epi64(v47, v47))))), MullV(v86, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v38, v38), _mm_unpackhi_epi64(v38, v38))))), MullV(v97, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v47, v47), _mm_unpackhi_epi64(v47, v47))))), MullV(v101, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v38, v38), _mm_unpacklo_epi64(v38, v38))))), MullV(v114, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))));
        v118 = _mm_cvtsi128_si64(_mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), *v98), 16));
        v120 = (__m128i)_INSERT(v117, 0, _mm_cvtsi128_si64(v117) + ((unsigned long long)__dirty_unsupported_Iop_SliceV128(v116, v116, 8) + ((unsigned long long)(_mm_cvtsi128_si64(v116)) >> 16) >> 16));
        *v113 = v114;
        v121 = v113 + 1;
        v122 = _mm_add_epi64(v120, MullV(v118, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v38, v38), _mm_unpacklo_epi64(v38, v38)))));
        v123 = *v109;
        v124 = v109 + 1;
        v126 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_mullo_epi32(_mm_add_epi64(__dirty_unsupported_Iop_SliceV128(_mm_slli_epi64(v122, 16), _mm_slli_epi64(v122, 16), 8), v122), v41));
        *v121 = v118;
        v127 = v121 + 1;
        v128 = _mm_cvtsi128_si64(_mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v126), 16));
        v129 = v115 + 1;
        v130 = _mm_add_epi64(v122, MullV(v128, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))));
        v131 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v73, MullV(v71, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v37, v37), _mm_unpacklo_epi64(v37, v37))))), MullV(v82, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v46, v46), _mm_unpacklo_epi64(v46, v46))))), MullV(v86, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v38, v38), _mm_unpackhi_epi64(v38, v38))))), MullV(v97, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v47, v47), _mm_unpackhi_epi64(v47, v47))))), MullV(v101, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v38, v38), _mm_unpackhi_epi64(v38, v38))))), MullV(v114, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v47, v47), _mm_unpackhi_epi64(v47, v47))))), MullV(v118, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v38, v38), _mm_unpacklo_epi64(v38, v38))))), MullV(v128, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))));
        v132 = _mm_cvtsi128_si64(_mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), *v115), 16));
        v134 = (__m128i)_INSERT(v131, 0, _mm_cvtsi128_si64(v131) + ((unsigned long long)__dirty_unsupported_Iop_SliceV128(v130, v130, 8) + ((unsigned long long)(_mm_cvtsi128_si64(v130)) >> 16) >> 16));
        *v127 = v128;
        v135 = v127 + 1;
        v136 = _mm_add_epi64(v134, MullV(v132, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v38, v38), _mm_unpacklo_epi64(v38, v38)))));
        v137 = *v124;
        v138 = v124 + 1;
        v140 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_mullo_epi32(_mm_add_epi64(__dirty_unsupported_Iop_SliceV128(_mm_slli_epi64(v136, 16), _mm_slli_epi64(v136, 16), 8), v136), v41));
        *v135 = v132;
        v141 = v135 + 1;
        v142 = _mm_cvtsi128_si64(_mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v140), 16));
        a2 = v129 + 1;
        v143 = _mm_add_epi64(v136, MullV(v142, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))));
        v144 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v88, MullV(v86, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v37, v37), _mm_unpacklo_epi64(v37, v37))))), MullV(v97, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v46, v46), _mm_unpacklo_epi64(v46, v46))))), MullV(v101, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v38, v38), _mm_unpackhi_epi64(v38, v38))))), MullV(v114, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v47, v47), _mm_unpackhi_epi64(v47, v47))))), MullV(v118, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v38, v38), _mm_unpackhi_epi64(v38, v38))))), MullV(v128, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v47, v47), _mm_unpackhi_epi64(v47, v47))))), MullV(v132, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v38, v38), _mm_unpacklo_epi64(v38, v38))))), MullV(v142, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))));
        v145 = _mm_cvtsi128_si64(_mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), *v129), 16));
        v147 = (__m128i)_INSERT(v144, 0, _mm_cvtsi128_si64(v144) + ((unsigned long long)__dirty_unsupported_Iop_SliceV128(v143, v143, 8) + ((unsigned long long)(_mm_cvtsi128_si64(v143)) >> 16) >> 16));
        *v141 = v142;
        v148 = v141 + 1;
        v149 = _mm_add_epi64(v147, MullV(v145, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v38, v38), _mm_unpacklo_epi64(v38, v38)))));
        v150 = *v138;
        node = v138 + 1;
        v153 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_mullo_epi32(_mm_add_epi64(__dirty_unsupported_Iop_SliceV128(_mm_slli_epi64(v149, 16), _mm_slli_epi64(v149, 16), 8), v149), v41));
        *v148 = v145;
        v154 = _mm_cvtsi128_si64(_mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v153), 16));
        v155 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(long long *)xsp);
        v156 = _mm_add_epi64(v149, MullV(v154, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))));
        v157 = iter2[1];
        v158 = *iter2;
        iter2 += 2;
        v159 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v103, MullV(v101, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v37, v37), _mm_unpacklo_epi64(v37, v37))))), MullV(v114, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v46, v46), _mm_unpacklo_epi64(v46, v46))))), MullV(v118, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v37, v37), _mm_unpacklo_epi64(v37, v37))))), MullV(v128, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v46, v46), _mm_unpacklo_epi64(v46, v46))))), MullV(v132, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v38, v38), _mm_unpackhi_epi64(v38, v38))))), MullV(v142, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v47, v47), _mm_unpackhi_epi64(v47, v47))))), MullV(v145, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v38, v38), _mm_unpackhi_epi64(v38, v38))))), MullV(v154, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v47, v47), _mm_unpackhi_epi64(v47, v47)))));
        v161 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v104, MullV(v101, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v37, v37), _mm_unpackhi_epi64(v37, v37))))), MullV(v114, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v46, v46), _mm_unpackhi_epi64(v46, v46))))), MullV(v118, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v37, v37), _mm_unpacklo_epi64(v37, v37))))), MullV(v128, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v46, v46), _mm_unpacklo_epi64(v46, v46))))), MullV(v132, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v37, v37), _mm_unpacklo_epi64(v37, v37))))), MullV(v142, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v46, v46), _mm_unpacklo_epi64(v46, v46))))), MullV(v145, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v38, v38), _mm_unpackhi_epi64(v38, v38))))), MullV(v154, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v47, v47), _mm_unpackhi_epi64(v47, v47)))));
        v162 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v108, MullV(v101, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v37, v37), _mm_unpackhi_epi64(v37, v37))))), MullV(v114, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v46, v46), _mm_unpackhi_epi64(v46, v46))))), MullV(v118, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v37, v37), _mm_unpackhi_epi64(v37, v37))))), MullV(v128, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v46, v46), _mm_unpackhi_epi64(v46, v46))))), MullV(v132, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v37, v37), _mm_unpacklo_epi64(v37, v37))))), MullV(v142, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v46, v46), _mm_unpacklo_epi64(v46, v46))))), MullV(v145, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v37, v37), _mm_unpacklo_epi64(v37, v37))))), MullV(v154, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v46, v46), _mm_unpacklo_epi64(v46, v46)))));
        v163 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v123, MullV(v118, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v37, v37), _mm_unpackhi_epi64(v37, v37))))), MullV(v128, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v46, v46), _mm_unpackhi_epi64(v46, v46))))), MullV(v132, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v37, v37), _mm_unpackhi_epi64(v37, v37))))), MullV(v142, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v46, v46), _mm_unpackhi_epi64(v46, v46))))), MullV(v145, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v37, v37), _mm_unpacklo_epi64(v37, v37))))), MullV(v154, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v46, v46), _mm_unpacklo_epi64(v46, v46)))));
        v164 = (__m128i)_INSERT(_mm_srli_epi64(_mm_add_epi64(__dirty_unsupported_Iop_SliceV128(v156, v156, 8), _mm_srli_epi64(v156, 16)), 16), 8, __double_as_longlong(0));
        v165 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v137, MullV(v132, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v37, v37), _mm_unpackhi_epi64(v37, v37))))), MullV(v142, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v46, v46), _mm_unpackhi_epi64(v46, v46))))), MullV(v145, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v37, v37), _mm_unpackhi_epi64(v37, v37))))), MullV(v154, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v46, v46), _mm_unpackhi_epi64(v46, v46)))));
        v166 = _mm_add_epi64(_mm_add_epi64(v150, MullV(v145, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v37, v37), _mm_unpackhi_epi64(v37, v37))))), MullV(v154, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v46, v46), _mm_unpackhi_epi64(v46, v46)))));
        v167 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v111, MullV(v114, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v46, v46), _mm_unpacklo_epi64(v46, v46))))), MullV(v118, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v38, v38), _mm_unpackhi_epi64(v38, v38))))), MullV(v128, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v47, v47), _mm_unpackhi_epi64(v47, v47))))), MullV(v132, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v38, v38), _mm_unpackhi_epi64(v38, v38))))), MullV(v142, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v47, v47), _mm_unpackhi_epi64(v47, v47))))), MullV(v145, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v38, v38), _mm_unpacklo_epi64(v38, v38))))), MullV(v154, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))))), v164);
        v148[1] = v154;
        v40 = xsp + 8;
        v168 = v20 - 8;
        do
        {
            v169 = v168 - 8;
            v170 = v168;
            v171 = __dirty_unsupported_Iop_ZeroHI64ofV128(*v40);
            v172 = v40 + 1;
            v173 = v48[1];
            v174 = *v48;
            v48 += 2;
            v175 = _mm_add_epi64(v162, MullV(v155, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v158, v158), _mm_unpackhi_epi64(v158, v158)))));
            v176 = node;
            if (v168 != 8)
                v176 = node + 16;
            v177 = v176;
            v178 = _mm_add_epi64(*(int128_t *)node, MullV(v155, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v157, v157), _mm_unpackhi_epi64(v157, v157)))));
            v179 = __dirty_unsupported_Iop_ZeroHI64ofV128(*v172);
            v180 = v172 + 1;
            *v45 = _mm_add_epi64(_mm_add_epi64(v167, MullV(v155, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v158, v158), _mm_unpacklo_epi64(v158, v158))))), MullV(v171, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))));
            v181 = v45 + 1;
            v182 = __dirty_unsupported_Iop_ZeroHI64ofV128(*v180);
            v183 = v180 + 1;
            v184 = arm64g_calculate_condition(4, v170, 8, 0);
            v185 = v177;
            if (!(v184 & 1))
                v185 = v177 + 16;
            iter = v185;
            v187 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v163, MullV(v155, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v157, v157), _mm_unpacklo_epi64(v157, v157))))), MullV(v171, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v173, v173), _mm_unpacklo_epi64(v173, v173))))), MullV(v179, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v158, v158), _mm_unpackhi_epi64(v158, v158)))));
            v188 = __dirty_unsupported_Iop_ZeroHI64ofV128(*v183);
            v189 = v183 + 1;
            v190 = _mm_add_epi64(_mm_add_epi64(*(int128_t *)v177, MullV(v179, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v157, v157), _mm_unpackhi_epi64(v157, v157))))), MullV(v182, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v173, v173), _mm_unpackhi_epi64(v173, v173)))));
            *v181 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v159, MullV(v155, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v158, v158), _mm_unpacklo_epi64(v158, v158))))), MullV(v171, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))))), MullV(v179, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v158, v158), _mm_unpacklo_epi64(v158, v158))))), MullV(v182, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))));
            v191 = v181 + 1;
            v192 = *(int128_t *)iter;
            v193 = __dirty_unsupported_Iop_ZeroHI64ofV128(*v189);
            v194 = v189 + 1;
            v195 = arm64g_calculate_condition(4, v170, 8, 0);
            if (!(v195 & 1))
                iter += 16;
            v196 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v165, MullV(v155, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v157, v157), _mm_unpacklo_epi64(v157, v157))))), MullV(v171, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v173, v173), _mm_unpacklo_epi64(v173, v173))))), MullV(v179, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v157, v157), _mm_unpacklo_epi64(v157, v157))))), MullV(v182, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v173, v173), _mm_unpacklo_epi64(v173, v173))))), MullV(v188, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v158, v158), _mm_unpackhi_epi64(v158, v158)))));
            v197 = __dirty_unsupported_Iop_ZeroHI64ofV128(*v194);
            v198 = v194 + 1;
            *v191 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v161, MullV(v155, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v158, v158), _mm_unpackhi_epi64(v158, v158))))), MullV(v171, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v174, v174), _mm_unpackhi_epi64(v174, v174))))), MullV(v179, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v158, v158), _mm_unpacklo_epi64(v158, v158))))), MullV(v182, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))))), MullV(v188, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v158, v158), _mm_unpacklo_epi64(v158, v158))))), MullV(v193, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))));
            v199 = v191 + 1;
            v200 = __dirty_unsupported_Iop_ZeroHI64ofV128(*v198);
            v201 = v198 + 1;
            v202 = arm64g_calculate_condition(4, v170, 8, 0);
            v203 = iter;
            if (!(v202 & 1))
                v203 = iter + 16;
            iter1 = v203;
            v205 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v166, MullV(v155, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v157, v157), _mm_unpackhi_epi64(v157, v157))))), MullV(v171, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v173, v173), _mm_unpackhi_epi64(v173, v173))))), MullV(v179, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v157, v157), _mm_unpacklo_epi64(v157, v157))))), MullV(v182, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v173, v173), _mm_unpacklo_epi64(v173, v173))))), MullV(v188, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v157, v157), _mm_unpacklo_epi64(v157, v157))))), MullV(v193, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v173, v173), _mm_unpacklo_epi64(v173, v173))))), MullV(v197, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v158, v158), _mm_unpackhi_epi64(v158, v158)))));
            v206 = __dirty_unsupported_Iop_ZeroHI64ofV128(*v201);
            v207 = v201 + 1;
            v208 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v190, MullV(v188, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v157, v157), _mm_unpackhi_epi64(v157, v157))))), MullV(v193, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v173, v173), _mm_unpackhi_epi64(v173, v173))))), MullV(v197, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v157, v157), _mm_unpacklo_epi64(v157, v157))))), MullV(v200, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v173, v173), _mm_unpacklo_epi64(v173, v173)))));
            v209 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v192, MullV(v188, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v157, v157), _mm_unpackhi_epi64(v157, v157))))), MullV(v193, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v173, v173), _mm_unpackhi_epi64(v173, v173))))), MullV(v197, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v157, v157), _mm_unpackhi_epi64(v157, v157))))), MullV(v200, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v173, v173), _mm_unpackhi_epi64(v173, v173)))));
            v210 = _mm_add_epi64(_mm_add_epi64(*(int128_t *)iter, MullV(v197, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v157, v157), _mm_unpackhi_epi64(v157, v157))))), MullV(v200, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v173, v173), _mm_unpackhi_epi64(v173, v173)))));
            *v199 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v175, MullV(v171, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v174, v174), _mm_unpackhi_epi64(v174, v174))))), MullV(v179, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v158, v158), _mm_unpackhi_epi64(v158, v158))))), MullV(v182, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v174, v174), _mm_unpackhi_epi64(v174, v174))))), MullV(v188, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v158, v158), _mm_unpacklo_epi64(v158, v158))))), MullV(v193, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))))), MullV(v197, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v158, v158), _mm_unpacklo_epi64(v158, v158))))), MullV(v200, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))));
            v211 = v199 + 1;
            v212 = *(int128_t *)iter1;
            v213 = __dirty_unsupported_Iop_ZeroHI64ofV128(*v207);
            v214 = v207 + 1;
            v215 = arm64g_calculate_condition(4, v170, 8, 0);
            if (!(v215 & 1))
                iter1 += 16;
            v216 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v178, MullV(v171, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v173, v173), _mm_unpackhi_epi64(v173, v173))))), MullV(v179, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v157, v157), _mm_unpackhi_epi64(v157, v157))))), MullV(v182, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v173, v173), _mm_unpackhi_epi64(v173, v173))))), MullV(v188, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v157, v157), _mm_unpacklo_epi64(v157, v157))))), MullV(v193, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v173, v173), _mm_unpacklo_epi64(v173, v173))))), MullV(v197, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v157, v157), _mm_unpacklo_epi64(v157, v157))))), MullV(v200, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v173, v173), _mm_unpacklo_epi64(v173, v173))))), MullV(v206, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v158, v158), _mm_unpackhi_epi64(v158, v158)))));
            v217 = __dirty_unsupported_Iop_ZeroHI64ofV128(*v214);
            v218 = v214 + 1;
            *v211 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v187, MullV(v182, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v174, v174), _mm_unpackhi_epi64(v174, v174))))), MullV(v188, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v158, v158), _mm_unpackhi_epi64(v158, v158))))), MullV(v193, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v174, v174), _mm_unpackhi_epi64(v174, v174))))), MullV(v197, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v158, v158), _mm_unpacklo_epi64(v158, v158))))), MullV(v200, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))))), MullV(v206, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v158, v158), _mm_unpacklo_epi64(v158, v158))))), MullV(v213, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))));
            v219 = v211 + 1;
            v220 = __dirty_unsupported_Iop_ZeroHI64ofV128(*v218);
            v221 = v218 + 1;
            v222 = arm64g_calculate_condition(4, v170, 8, 0);
            v223 = iter1;
            if (!(v222 & 1))
                v223 = iter1 + 16;
            node = v223;
            v224 = __dirty_unsupported_Iop_ZeroHI64ofV128(*v221);
            v225 = v221 + 1;
            v226 = _mm_add_epi64(_mm_add_epi64(*(int128_t *)iter1, MullV(v217, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v157, v157), _mm_unpackhi_epi64(v157, v157))))), MullV(v220, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v173, v173), _mm_unpackhi_epi64(v173, v173)))));
            *v219 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v196, MullV(v193, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v174, v174), _mm_unpackhi_epi64(v174, v174))))), MullV(v197, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v158, v158), _mm_unpackhi_epi64(v158, v158))))), MullV(v200, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v174, v174), _mm_unpackhi_epi64(v174, v174))))), MullV(v206, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v158, v158), _mm_unpacklo_epi64(v158, v158))))), MullV(v213, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))))), MullV(v217, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v158, v158), _mm_unpacklo_epi64(v158, v158))))), MullV(v220, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))));
            v227 = v219 + 1;
            v228 = *(int128_t *)node;
            v229 = __dirty_unsupported_Iop_ZeroHI64ofV128(*v225);
            v230 = v225 + 1;
            v231 = arm64g_calculate_condition(4, v170, 8, 0);
            if (!(v231 & 1))
                node += 16;
            v232 = __dirty_unsupported_Iop_ZeroHI64ofV128(*v230);
            *v227 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v205, MullV(v200, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v174, v174), _mm_unpackhi_epi64(v174, v174))))), MullV(v206, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v158, v158), _mm_unpackhi_epi64(v158, v158))))), MullV(v213, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v174, v174), _mm_unpackhi_epi64(v174, v174))))), MullV(v217, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v158, v158), _mm_unpacklo_epi64(v158, v158))))), MullV(v220, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))))), MullV(v224, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v158, v158), _mm_unpacklo_epi64(v158, v158))))), MullV(v229, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))));
            v233 = v227 + 1;
            v234 = *(int128_t *)node;
            v235 = __dirty_unsupported_Iop_ZeroHI64ofV128(v230[1]);
            v236 = arm64g_calculate_condition(4, v170, 8, 0);
            if (!(v236 & 1))
                node += 16;
            v237 = arm64g_calculate_condition(20, v170, 8, 0);
            if (!(v237 & 1))
                iter2 = (char *)iter2 + -4 * v20;
            v155 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(long long *)xsp);
            v167 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v208, MullV(v206, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v157, v157), _mm_unpacklo_epi64(v157, v157))))), MullV(v213, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v173, v173), _mm_unpacklo_epi64(v173, v173))))), MullV(v217, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v158, v158), _mm_unpackhi_epi64(v158, v158))))), MullV(v220, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v174, v174), _mm_unpackhi_epi64(v174, v174))))), MullV(v224, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v158, v158), _mm_unpackhi_epi64(v158, v158))))), MullV(v229, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v174, v174), _mm_unpackhi_epi64(v174, v174))))), MullV(v232, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v158, v158), _mm_unpacklo_epi64(v158, v158))))), MullV(v235, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))));
            v37 = iter2[1];
            v38 = *iter2;
            iter2 += 2;
            v159 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v209, MullV(v206, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v157, v157), _mm_unpacklo_epi64(v157, v157))))), MullV(v213, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v173, v173), _mm_unpacklo_epi64(v173, v173))))), MullV(v217, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v157, v157), _mm_unpacklo_epi64(v157, v157))))), MullV(v220, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v173, v173), _mm_unpacklo_epi64(v173, v173))))), MullV(v224, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v158, v158), _mm_unpackhi_epi64(v158, v158))))), MullV(v229, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v174, v174), _mm_unpackhi_epi64(v174, v174))))), MullV(v232, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v158, v158), _mm_unpackhi_epi64(v158, v158))))), MullV(v235, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v174, v174), _mm_unpackhi_epi64(v174, v174)))));
            v40 = xsp + 8;
            v161 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v210, MullV(v206, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v157, v157), _mm_unpackhi_epi64(v157, v157))))), MullV(v213, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v173, v173), _mm_unpackhi_epi64(v173, v173))))), MullV(v217, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v157, v157), _mm_unpacklo_epi64(v157, v157))))), MullV(v220, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v173, v173), _mm_unpacklo_epi64(v173, v173))))), MullV(v224, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v157, v157), _mm_unpacklo_epi64(v157, v157))))), MullV(v229, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v173, v173), _mm_unpacklo_epi64(v173, v173))))), MullV(v232, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v158, v158), _mm_unpackhi_epi64(v158, v158))))), MullV(v235, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v174, v174), _mm_unpackhi_epi64(v174, v174)))));
            v162 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v212, MullV(v206, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v157, v157), _mm_unpackhi_epi64(v157, v157))))), MullV(v213, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v173, v173), _mm_unpackhi_epi64(v173, v173))))), MullV(v217, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v157, v157), _mm_unpackhi_epi64(v157, v157))))), MullV(v220, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v173, v173), _mm_unpackhi_epi64(v173, v173))))), MullV(v224, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v157, v157), _mm_unpacklo_epi64(v157, v157))))), MullV(v229, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v173, v173), _mm_unpacklo_epi64(v173, v173))))), MullV(v232, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v157, v157), _mm_unpacklo_epi64(v157, v157))))), MullV(v235, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v173, v173), _mm_unpacklo_epi64(v173, v173)))));
            v163 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v226, MullV(v224, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v157, v157), _mm_unpackhi_epi64(v157, v157))))), MullV(v229, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v173, v173), _mm_unpackhi_epi64(v173, v173))))), MullV(v232, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v157, v157), _mm_unpacklo_epi64(v157, v157))))), MullV(v235, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v173, v173), _mm_unpacklo_epi64(v173, v173)))));
            v165 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v228, MullV(v224, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v157, v157), _mm_unpackhi_epi64(v157, v157))))), MullV(v229, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v173, v173), _mm_unpackhi_epi64(v173, v173))))), MullV(v232, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v157, v157), _mm_unpackhi_epi64(v157, v157))))), MullV(v235, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v173, v173), _mm_unpackhi_epi64(v173, v173)))));
            *v233 = _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v216, MullV(v213, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v174, v174), _mm_unpackhi_epi64(v174, v174))))), MullV(v217, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v158, v158), _mm_unpackhi_epi64(v158, v158))))), MullV(v220, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi64(v174, v174), _mm_unpackhi_epi64(v174, v174))))), MullV(v224, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v158, v158), _mm_unpacklo_epi64(v158, v158))))), MullV(v229, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174))))), MullV(v232, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v158, v158), _mm_unpacklo_epi64(v158, v158))))), MullV(v235, _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi64(v174, v174), _mm_unpacklo_epi64(v174, v174)))));
            v45 = v233 + 1;
            v166 = _mm_add_epi64(_mm_add_epi64(v234, MullV(v232, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v157, v157), _mm_unpackhi_epi64(v157, v157))))), MullV(v235, _mm_cvtsi128_si64(CatOddLanesV(_mm_unpackhi_epi64(v173, v173), _mm_unpackhi_epi64(v173, v173)))));
            v238 = arm64g_calculate_condition(20, v170, 8, 0);
            v168 = v169;
            v157 = v37;
            v158 = v38;
        } while (v238 & 1);
        v239 = xsp + 128;
        v45[1] = v159;
        *v45 = v167;
        v240 = v45 + 2;
        v240[1] = v162;
        *v240 = v161;
        v241 = v240 + 2;
        v241[1] = v165;
        *v241 = v163;
        v241[2] = v166;
        v242 = v42 - 8;
        v22 = v239[1];
        v21 = *v239;
        v243 = v239 + 2;
        v24 = v243[1];
        v23 = *v243;
        v244 = v243 + 2;
        v27 = v244[1];
        v25 = *v244;
        v245 = v244 + 2;
        v30 = v245[1];
        v29 = *v245;
        v36 = v245 + 2;
        if (v42 == 8)
            break;
        a3 = (char *)v48 + -4 * v20;
        v42 = v242;
    }
    v246 = xsp + 128;
    *(uint128_t *)(xsp + 16) = 0;
    *(uint128_t *)xsp = 0;
    xsp = xsp + 32;
    v247 = __dirty_unsupported_Iop_SliceV128(v21, v21, 8);
    *(uint128_t *)(xsp + 16) = 0;
    *(uint128_t *)xsp = 0;
    xsp = xsp + 32;
    v248 = _mm_add_epi64(v247, _mm_srli_epi64(v21, 16));
    *(uint128_t *)(xsp + 16) = 0;
    *(uint128_t *)xsp = 0;
    xsp = xsp + 32;
    *(uint128_t *)(xsp + 16) = 0;
    *(uint128_t *)xsp = 0;
    xsp = xsp + 32;
    v249 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_unpacklo_epi16(v21, v248));
    v250 = (__m128i)_INSERT(_mm_srli_epi64(v248, 16), 8, __double_as_longlong(0));
    v251 = v20;
    while (1)
    {
        v252 = _mm_add_epi64(v22, v250);
        v253 = v246 + 1;
        *v246 = v249;
        v255 = _mm_add_epi64(__dirty_unsupported_Iop_SliceV128(v252, v252, 8), _mm_srli_epi64(v252, 16));
        v258 = _mm_add_epi64(v23, _INSERT(_mm_srli_epi64(v255, 16), 8, __double_as_longlong(0)));
        v259 = v253 + 1;
        *v253 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_unpacklo_epi16(v252, v255));
        v261 = _mm_add_epi64(__dirty_unsupported_Iop_SliceV128(v258, v258, 8), _mm_srli_epi64(v258, 16));
        v264 = _mm_add_epi64(v24, _INSERT(_mm_srli_epi64(v261, 16), 8, __double_as_longlong(0)));
        v265 = v259 + 1;
        *v259 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_unpacklo_epi16(v258, v261));
        v267 = _mm_add_epi64(__dirty_unsupported_Iop_SliceV128(v264, v264, 8), _mm_srli_epi64(v264, 16));
        v270 = _mm_add_epi64(v25, _INSERT(_mm_srli_epi64(v267, 16), 8, __double_as_longlong(0)));
        v271 = v265 + 1;
        *v265 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_unpacklo_epi16(v264, v267));
        v273 = _mm_add_epi64(__dirty_unsupported_Iop_SliceV128(v270, v270, 8), _mm_srli_epi64(v270, 16));
        v276 = _mm_add_epi64(v27, _INSERT(_mm_srli_epi64(v273, 16), 8, __double_as_longlong(0)));
        v277 = v271 + 1;
        *v271 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_unpacklo_epi16(v270, v273));
        v279 = _mm_add_epi64(__dirty_unsupported_Iop_SliceV128(v276, v276, 8), _mm_srli_epi64(v276, 16));
        v282 = _mm_add_epi64(v29, _INSERT(_mm_srli_epi64(v279, 16), 8, __double_as_longlong(0)));
        v283 = v277 + 1;
        *v277 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_unpacklo_epi16(v276, v279));
        v285 = _mm_add_epi64(__dirty_unsupported_Iop_SliceV128(v282, v282, 8), _mm_srli_epi64(v282, 16));
        v288 = _mm_add_epi64(v30, _INSERT(_mm_srli_epi64(v285, 16), 8, __double_as_longlong(0)));
        v289 = v283 + 1;
        *v283 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_unpacklo_epi16(v282, v285));
        v291 = _mm_add_epi64(__dirty_unsupported_Iop_SliceV128(v288, v288, 8), _mm_srli_epi64(v288, 16));
        v292 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_unpacklo_epi16(v288, v291));
        v293 = (__m128i)_INSERT(_mm_srli_epi64(v291, 16), 8, __double_as_longlong(0));
        v22 = *(int128_t *)(v36 + 16);
        v294 = *(int128_t *)v36;
        v295 = v36 + 32;
        v296 = v251 - 8;
        v246 = v289 + 1;
        *v289 = v292;
        if (v251 == 8)
            break;
        v297 = _mm_add_epi64(v294, v293);
        v298 = __dirty_unsupported_Iop_SliceV128(v297, v297, 8);
        v24 = v295[1];
        v23 = *v295;
        v299 = v295 + 2;
        v300 = _mm_add_epi64(v298, _mm_srli_epi64(v297, 16));
        v27 = v299[1];
        v25 = *v299;
        v301 = v299 + 2;
        v30 = v301[1];
        v29 = *v301;
        v36 = v301 + 2;
        v249 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_unpacklo_epi16(v297, v300));
        v250 = (__m128i)_INSERT(_mm_srli_epi64(v300, 16), 8, __double_as_longlong(0));
        v251 = v296;
    }
    *v246 = _mm_cvtsi128_si32(v293);
    v302 = (char *)v48 + -4 * v20;
    v303 = 4;
    v304 = 0;
    v305 = 0;
    v306 = xsp + v20 * 4;
    v307 = xsp;
    v308 = (unsigned int *)xsp;
    do
    {
        v309 = v308[1];
        v310 = v308 + 2;
        v311 = *v310;
        v312 = v310[1];
        v313 = v310 + 2;
        v314 = v302[1];
        v315 = v302 + 2;
        v316 = *v315;
        v317 = v315[1];
        v318 = v315 + 2;
        v319 = arm64g_calculate_flag_c(v303, v307, v304, v305);
        v320 = arm64g_calculate_flag_c(7, *v308, *v302, v319 & 0xffffffff);
        v321 = arm64g_calculate_flag_c(7, v309, v314, v320 & 0xffffffff);
        v322 = arm64g_calculate_flag_c(7, v311, v316, v321 & 0xffffffff);
        v303 = 7;
        v307 = v312;
        v304 = v317;
        v305 = v322 & 0xffffffff;
        *a0 = *v308 - *v302 - ((unsigned int)v319 ^ 1);
        a0[1] = v309 - v314 - ((unsigned int)v320 ^ 1);
        v323 = a0 + 2;
        *v323 = v311 - v316 - ((unsigned int)v321 ^ 1);
        v323[1] = v312 - v317 - ((unsigned int)v322 ^ 1);
        a0 = v323 + 2;
        v308 = v313;
        v302 = v318;
    } while (v306 - v308);
    v324 = (void*)xsp;
    v325 = a0 - ((char *)v306 - xsp);
    v326 = v306;
    v327 = arm64g_calculate_flag_c(7, v307, v304, v305);
    v328 = *v313;
    v329 = v327 & 0xffffffff;
    do
    {
        v330 = v324 + 8;
        v331 = v330 + 8;
        v332 = *v325;
        v333 = v325[1];
        v334 = v325 + 2;
        v335 = *v334;
        v336 = v334[1];
        v337 = (char *)v334 - 8;
        v338 = arm64g_calculate_condition(39, v328, 0, v329);
        if (!(v338 & 1))
        {
            v332 = *(int *)v324;
            v333 = (int)v324[4];
            v335 = *(int *)v330;
            v336 = (int)v330[4];
        }
        v326[1] = 0;
        *v326 = 0;
        v339 = v326 + 2;
        v339[1] = 0;
        *v339 = 0;
        v340 = v339 + 2;
        v341 = *(int *)v331;
        v342 = (int)v331[4];
        v343 = v331 + 8;
        v344 = *v343;
        v345 = v343[1];
        *v337 = v332;
        v337[1] = v333;
        v346 = v337 + 2;
        *v346 = v335;
        v346[1] = v336;
        v347 = v346 + 2;
        v348 = (char *)v343 - 24;
        v349 = *v347;
        v350 = v347[1];
        v351 = v347 + 2;
        v352 = *v351;
        v353 = v351[1];
        v354 = (char *)v351 - 8;
        v355 = arm64g_calculate_condition(39, v328, 0, v329);
        if (!(v355 & 1))
        {
            v349 = v341;
            v350 = v342;
            v352 = v344;
            v353 = v345;
        }
        *(uint128_t *)&v348[16] = 0;
        *(uint128_t *)v348 = 0;
        v324 = v348 + 32;
        v340[1] = 0;
        *v340 = 0;
        v326 = v340 + 2;
        *v354 = v349;
        v354[1] = v350;
        v356 = v354 + 2;
        *v356 = v352;
        v356[1] = v353;
        v325 = v356 + 2;
    } while (v306 - v324);
    return v356 + 2;
}
