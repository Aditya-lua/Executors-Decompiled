/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa847e4..0xa857ec (4104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a847e4_2 {
    uint128_t field_0;
    uint128_t field_10;
} st_a847e4_2;

typedef struct st_a847e4_3 {
    char padding_0[2];
    unsigned short field_2;
} st_a847e4_3;

typedef struct st_a847e4_0 {
    unsigned long long field_0;
    char padding_8[32];
    long long field_28;
    char padding_30[8];
    unsigned long long field_38;
    char padding_40[8];
    unsigned short field_48;
    char padding_4a[2];
    unsigned int field_4c;
    unsigned int field_50;
} st_a847e4_0;

typedef struct st_a847e4_1 {
    struct st_a847e4_0 *field_0;
    char padding_8[16];
    long long field_18;
    char padding_20[24];
    struct st_a847e4_2 *field_38;
    char padding_40[16];
    long long field_50;
    long long field_58;
} st_a847e4_1;

extern st_a847e4_3 g_defc00;
extern st_a847e4_3 g_defe00;
extern char g_10002b0;

unsigned long long sub_a847e4(uint128_t *a0, void* a1, long long a2, unsigned short *a3, long long a4, st_a847e4_1 *a5)
{
    st_a847e4_0 *v25;  // x20
    st_a847e4_0 *v26;  // x9
    unsigned short *v35;  // x1
    unsigned short v125;  // x0
    char v126;  // x1
    unsigned short k;  // x8
    uint128_t v128;  // q0
    uint128_t v129;  // q1
    __m128i v130;  // q2
    __m128i v131;  // q3
    uint128_t *v132;  // x10
    uint128_t v133;  // q6
    uint128_t v134;  // q4
    __m128i v36;  // q2
    uint128_t v135;  // q7
    uint128_t v136;  // q5
    __m128i v139;  // q7
    __m128i v140;  // q5
    __m128i v143;  // q19
    __m128i v144;  // q18
    __m128i v37;  // q3
    st_a847e4_3 *v145;  // x9
    char *v146;  // x10
    unsigned long long v147;  // x11
    __m128i v148;  // q0
    uint128_t v149;  // q1
    __m128i v150;  // q3
    unsigned short v151;  // x2
    unsigned long long v152;  // x14
    void* iter;  // x0
    unsigned long long v154;  // x3
    uint128_t v38;  // q4
    void* v155;  // x17
    unsigned int v156;  // w1
    unsigned long long v157;  // x5
    unsigned long long v158;  // x6
    unsigned long long v159;  // x4
    unsigned long long v160;  // x4
    unsigned long v161;  // cc_dep1
    unsigned long v162;  // cc_dep2
    unsigned long long v163;  // x2
    unsigned long long v164;  // x5
    __m128i v39;  // q6
    unsigned long long v165;  // 4110
    unsigned long long v166;  // 4102
    unsigned long long v167;  // 4110
    unsigned long long v168;  // 4102
    unsigned long long v169;  // x5
    unsigned long long v170;  // x4
    unsigned long long v171;  // x6
    __m128i v172;  // q5
    void* node;  // x0
    unsigned long long i3;  // x7
    unsigned short *v40;  // x2
    unsigned long long v175;  // x7
    __m128i v176;  // q6
    __m128i v177;  // q7
    __m128i v178;  // q17
    __m128i v179;  // q16
    __m128i v181;  // q21
    __m128i v183;  // q19
    __m128i v184;  // q16
    unsigned short *v41;  // x4
    unsigned int v186;  // w3
    unsigned int v187;  // w4
    short v188;  // x5
    unsigned short l;  // x8
    uint128_t v190;  // q0
    uint128_t v191;  // q1
    uint128_t v192;  // q5
    uint128_t v193;  // q6
    uint128_t v194;  // q7
    unsigned short v42;  // w8
    __m128i v196;  // q7
    __m128i v198;  // q6
    __m128i v199;  // q5
    unsigned short m;  // x8
    __m128i v201;  // q0
    uint128_t *v202;  // x11
    uint128_t *v203;  // x12
    __m128i v204;  // q2
    void* iter1;  // x3
    __m128i v205;  // q3
    unsigned short n;  // x8
    uint128_t v207;  // q0
    __m128i v208;  // q4
    __m128i v209;  // q7
    unsigned short i0;  // x8
    char *v212;  // x9
    uint128_t v213;  // q7
    uint128_t v214;  // q16
    unsigned short v44;  // x9
    uint128_t v215;  // q7
    uint128_t v216;  // q16
    uint128_t v217;  // q7
    uint128_t v218;  // q16
    uint128_t v219;  // q7
    uint128_t v220;  // q16
    uint128_t v221;  // q17
    uint128_t v222;  // q7
    uint128_t v223;  // q17
    uint128_t v224;  // q16
    unsigned short v27;  // x10
    unsigned short iter2;  // x16
    uint128_t v225;  // q17
    uint128_t v226;  // q7
    uint128_t v227;  // q17
    uint128_t v228;  // q16
    uint128_t v229;  // q17
    uint128_t v230;  // q7
    uint128_t v231;  // q17
    uint128_t v232;  // q16
    uint128_t v233;  // q18
    uint128_t v234;  // q17
    unsigned short v46;  // x19
    uint128_t v235;  // q18
    uint128_t v236;  // q7
    uint128_t v237;  // q18
    uint128_t v238;  // q16
    uint128_t v239;  // q18
    uint128_t v240;  // q17
    uint128_t v241;  // q18
    uint128_t v242;  // q7
    uint128_t v243;  // q18
    uint128_t v244;  // q16
    unsigned short v47;  // x12
    uint128_t v245;  // q18
    uint128_t v246;  // q17
    uint128_t v247;  // q18
    uint128_t v248;  // q7
    uint128_t v249;  // q18
    uint128_t v250;  // q16
    uint128_t v251;  // q19
    uint128_t v252;  // q17
    uint128_t v253;  // q19
    uint128_t v254;  // q18
    unsigned long long v48;  // x25
    uint128_t v255;  // q19
    uint128_t v256;  // q7
    uint128_t v257;  // q19
    uint128_t v258;  // q16
    uint128_t v259;  // q19
    uint128_t v260;  // q17
    uint128_t v261;  // q19
    uint128_t v262;  // q18
    uint128_t v263;  // q19
    uint128_t v264;  // q7
    unsigned long long v49;  // x26
    uint128_t v265;  // q19
    uint128_t v266;  // q16
    uint128_t v267;  // q19
    uint128_t v268;  // q17
    uint128_t v269;  // q19
    uint128_t v270;  // q18
    uint128_t v271;  // q19
    uint128_t v272;  // q7
    uint128_t v273;  // q19
    uint128_t v274;  // q16
    unsigned long long v50;  // x20
    uint128_t v275;  // q17
    uint128_t v276;  // q20
    uint128_t v277;  // q18
    uint128_t v278;  // q20
    uint128_t v279;  // q19
    uint128_t v280;  // q20
    uint128_t v281;  // q7
    uint128_t v282;  // q20
    uint128_t v283;  // q16
    uint128_t v284;  // q20
    unsigned long v51;  // x21
    uint128_t v285;  // q17
    uint128_t v286;  // q20
    uint128_t v287;  // q18
    uint128_t v288;  // q20
    uint128_t v289;  // q20
    uint128_t v290;  // q19
    uint128_t v291;  // q20
    uint128_t v292;  // q20
    uint128_t v293;  // q7
    uint128_t v294;  // q20
    unsigned short v52;  // x22
    uint128_t v295;  // q20
    __m128i v296;  // q16
    uint128_t v297;  // q20
    __m128i v298;  // q17
    uint128_t v299;  // q20
    __m128i v300;  // q18
    __m128i v301;  // q19
    uint128_t v302;  // q21
    __m128i v303;  // q20
    uint128_t v304;  // q21
    char v53;  // x10
    uint128_t v305;  // q21
    uint128_t v306;  // q21
    uint128_t v307;  // q21
    uint128_t v308;  // q21
    uint128_t v309;  // q21
    uint128_t v310;  // q21
    uint128_t v311;  // q21
    uint128_t v312;  // q21
    uint128_t v313;  // q21
    uint128_t v314;  // q21
    unsigned short i2;  // x8
    uint128_t v315;  // q21
    uint128_t v316;  // q21
    __m128i v317;  // q21
    uint128_t v318;  // q22
    uint128_t v319;  // q22
    uint128_t v320;  // q22
    uint128_t v321;  // q22
    uint128_t v322;  // q22
    uint128_t v323;  // q22
    uint128_t v324;  // q22
    unsigned long v28;  // x11
    uint128_t *v55;  // x9
    uint128_t v325;  // q22
    uint128_t v326;  // q22
    uint128_t v327;  // q22
    uint128_t v328;  // q22
    uint128_t v329;  // q22
    uint128_t v330;  // q22
    uint128_t v331;  // q22
    __m128i v332;  // q22
    unsigned short v333;  // w8
    uint128_t v334;  // q0
    uint128_t v56;  // q18
    uint128_t v335;  // q1
    uint128_t *v336;  // x8
    uint128_t *v337;  // x8
    unsigned short v338;  // x19
    uint128_t v57;  // q16
    uint128_t v58;  // q19
    uint128_t v59;  // q17
    __m128i v62;  // q19
    __m128i v63;  // q17
    unsigned int v29;  // w8
    __m128i v66;  // q23
    __m128i v67;  // q22
    unsigned long long v68;  // x19
    st_a847e4_3 *v69;  // x16
    unsigned long long v70;  // x19
    unsigned short v71;  // x10
    unsigned long long v72;  // x21
    unsigned short *i6;  // x23
    unsigned long long v74;  // x12
    unsigned int v30;  // w13
    unsigned short *v75;  // x24
    unsigned int v76;  // w22
    unsigned long long v77;  // x15
    unsigned long long v78;  // x6
    unsigned long long v79;  // x8
    unsigned long long v80;  // x28
    unsigned long long v81;  // x8
    unsigned long v82;  // cc_dep1
    unsigned long v83;  // cc_dep2
    unsigned long long v84;  // x15
    uint128_t v31;  // q0
    unsigned long long v85;  // x6
    unsigned long long v86;  // 4110
    unsigned long long v87;  // 4102
    unsigned long long v88;  // 4110
    unsigned long long v89;  // 4102
    unsigned long long v90;  // x8
    unsigned long long v91;  // x15
    unsigned long long v92;  // x6
    unsigned long long v93;  // x28
    uint128_t *v94;  // x6
    unsigned short *v32;  // x5
    unsigned long long v95;  // x7
    unsigned long long v96;  // x13
    unsigned long long i5;  // x10
    uint128_t v98;  // q16
    unsigned long long v99;  // x10
    __m128i v100;  // q17
    uint128_t v101;  // q18
    uint128_t v102;  // q19
    uint128_t v103;  // q20
    unsigned short *v33;  // x14
    __m128i v105;  // q20
    __m128i v107;  // q19
    __m128i v108;  // q18
    __m128i v109;  // q18
    unsigned short v111;  // x8
    unsigned short v112;  // x8
    unsigned int v113;  // w10
    short v114;  // x10
    __m128i v34;  // q1
    unsigned short v115;  // x10
    unsigned short v116;  // x9
    unsigned short j;  // x12
    unsigned short v118;  // x16
    unsigned short v119;  // x15
    void* v120;  // x11
    unsigned long v121;  // x3
    unsigned int v122;  // w10
    unsigned int v123;  // w13
    unsigned long v124;  // x17
    unsigned long v0;  // [bp-0x5b0]
    st_a847e4_0 *v1;  // [bp-0x5a8]
    unsigned long v2;  // [bp-0x5a0]
    st_a847e4_0 *v3;  // [bp-0x580]
    unsigned short v4;  // [bp-0x574]
    uint128_t *v5;  // [bp-0x568]
    unsigned short *v6;  // [bp-0x558]
    unsigned int v7;  // [bp-0x54c]
    unsigned long long v8;  // [bp-0x548]
    void* v9;  // [bp-0x538]
    unsigned short i;  // [bp-0x52c]
    unsigned long long v11;  // [bp-0x528]
    char v12;  // [bp-0x520], Other Possible Types: uint256_t
    unsigned short v13;  // [bp-0x320]
    char v14;  // [bp-0x120]
    uint128_t v15;  // [bp-0x110]
    char v16;  // [bp-0x100]
    uint128_t v17;  // [bp-0xe0]
    uint128_t v18;  // [bp-0xd0]
    uint128_t v19;  // [bp-0xb8]
    uint128_t v20;  // [bp-0x98]
    uint128_t v21;  // [bp-0x88]
    unsigned long v22;  // [bp-0x78]
    char *v23;  // [bp-0x10]
    char v24;  // [bp+0x0]

    v23 = &v24;
    v22 = *(long long *)&g_10002b0;
    v5 = &a5->field_38->field_0;
    v25 = a5->field_0;
    if (sub_a3fe04(a4, a5->field_18, 0) && sub_a3fe10(a4, a5->field_58, 32) && sub_a3fe10(a4, a1, v25->field_28) && sub_a400f8(a4, &v17, 32))
    {
        v26 = a5->field_0;
        v3 = v26;
        v1 = v25;
        v2 = v26->field_50;
        v4 = *(int *)&v26->field_48;
        if (*(int *)&v26->field_48 >= 1)
        {
            v27 = 0;
            v28 = v3->field_4c;
            v8 = (int)v28 * 32;
            v29 = 0xffffffff << ((char)v28 & 31);
            v30 = 0xffff & ~v29;
            v31 = CONCAT(~v29 | ~v29 * 0x100000000, ~v29 | ~v29 * 0x100000000);
            v32 = a3;
            v33 = ~v32;
            v34 = _mm_set1_epi32(218172673);
            v35 = v32 + 1;
            v36 = _mm_sub_epi32(_mm_setzero_si128(), CONCAT(v28 & 0xffffffff | (v28 & 0xffffffff) * 0x100000000, v28 & 0xffffffff | (v28 & 0xffffffff) * 0x100000000));
            v37 = _mm_sub_epi32(_mm_setzero_si128(), CONCAT((unsigned int)v28 - 1 | ((unsigned int)v28 - 1) * 0x100000000, (unsigned int)v28 - 1 | ((unsigned int)v28 - 1) * 0x100000000));
            v38 = CONCAT(21642340209583, 21642340209583);
            v39 = _mm_set1_epi32(0xf2fff2ff);
            v6 = v35;
            v40 = v32;
            v41 = v33;
            v42 = v4;
            iter1 = a1;
            v7 = v30;
            do
            {
                i = v42;
                v44 = 0;
                iter2 = 0;
                v46 = 0;
                v47 = 0;
                v11 = v27;
                v48 = v27 * 0x200;
                v49 = v48 + (char *)a3;
                v50 = v49 + 2;
                v51 = v28;
                v9 = iter1;
                v52 = v30;
                do
                {
                    if (v46)
                    {
                        v53 = v28 - v51;
                        if ((unsigned int)v28 != (unsigned int)v51)
                            goto LABEL_a84a00;
                    }
                    else
                    {
                        v44 = *(long long *)iter1;
                        iter1 += 8;
                        v46 = 64;
                        v53 = v28 - v51;
                        if ((unsigned int)v28 != (unsigned int)v51)
                            goto LABEL_a84a00;
                    }
                    if ((int)v28 <= v46)
                    {
                        *(unsigned short *)((char *)v32 + iter2) = v52 & v44;
                        iter2 += 2;
                        v44 >>= (char)v28 & 63;
                        v46 -= v28;
                        v51 = v28;
                        continue;
                    }
LABEL_a84a00:
                    if ((int)v51 > v46)
                    {
                        v47 = v44 & v52;
                        v51 -= v46;
                        v52 = v30 >> ((char)v46 & 31);
                        v46 = 0;
                    }
                    else
                    {
                        *(unsigned short *)((char *)v32 + iter2) = v47 | (unsigned short)((v44 & v52) << (v53 & 31));
                        iter2 += 2;
                        v44 >>= (char)v51 & 63;
                        v46 -= v51;
                        v51 = v28;
                        v52 = v30;
                        v47 = 0;
                    }
                } while (0x200 > iter2);
                i2 = 0;
                do
                {
                    v55 = (char *)v32 + i2;
                    v56 = MullV((unsigned long long)*v55, _mm_cvtsi128_si64(v34));
                    v57 = MullV((unsigned long long)(*v55 >> 64), _mm_extract_epi64(v34, 1));
                    v58 = MullV((unsigned long long)v55[1], _mm_cvtsi128_si64(v34));
                    v59 = MullV((unsigned long long)(v55[1] >> 64), _mm_extract_epi64(v34, 1));
                    v62 = __dirty_unsupported_Iop_Sh32Ux4(v58, v36);
                    v63 = __dirty_unsupported_Iop_Sh32Ux4(v59, v36);
                    v66 = __dirty_unsupported_Iop_Sh32Ux4(v58 & v31, v37);
                    v67 = __dirty_unsupported_Iop_Sh32Ux4(v59 & v31, v37);
                    *v55 = CatEvenLanesV(_mm_add_epi32(__dirty_unsupported_Iop_Sh32Ux4(v57 & v31, v37), __dirty_unsupported_Iop_Sh32Ux4(v57, v36)), _mm_add_epi32(__dirty_unsupported_Iop_Sh32Ux4(v56 & v31, v37), __dirty_unsupported_Iop_Sh32Ux4(v56, v36)));
                    v55[1] = CatEvenLanesV(_mm_add_epi32(v67, v63), _mm_add_epi32(v66, v62));
                    i2 += 32;
                } while (i2 != 0x200);
                v68 = 128;
                v69 = &g_defc00.padding_0[0];
                do
                {
                    v70 = v68;
                    v71 = 0;
                    v72 = (v70 * 2 | v70 >> 63) & 0x1fffffffe & 0x1ffffffff;
                    do
                    {
                        i6 = (char *)v32 + v71;
                        v74 = v71 + v72;
                        v75 = (char *)v32 + v74;
                        v76 = v69->field_2;
                        v69 = &v69->field_2;
                        v77 = v49 + v72 + v71;
                        v78 = (char *)v6 + v48 + v71;
                        if (v78 < v77)
                            v79 = v77;
                        else
                            v79 = v78;
                        v80 = v48 + v71;
                        v81 = v79 + (char *)v33 - v80;
                        if (v81 >= 14)
                        {
                            v82 = v77;
                            v83 = v78;
                            if (v78 >= v77)
                                v77 = v78;
                            v84 = v71 + (v77 + (char *)v33 - v80 & 0xfffffffffffffffe);
                            v85 = v50 + v72 + v84;
                            if (v75 < v50 + v84)
                            {
                                v86 = arm64g_calculate_condition(52, v82, v83, 0);
                                v87 = arm64g_calculate_condition(52, (v86 & 1 ? i6 : 0x20000000), (v86 & 1 ? v85 : 0), 0);
                                if (v87 & 1)
                                    goto LABEL_a84c54;
                            }
                            else
                            {
                                v88 = arm64g_calculate_condition(52, v82, v83, 0);
                                v89 = arm64g_calculate_condition(48, (v88 & 1 ? i6 : 0x20000000), (v88 & 1 ? v85 : 0), 0);
                                if (v89 & 1)
                                    goto LABEL_a84c54;
                            }
                            v90 = (v81 >> 1) + 1;
                            v91 = v90 & 0xfffffffffffffff8;
                            v92 = v91 * 2;
                            v93 = v74 + v92;
                            i6 = (char *)i6 + v92;
                            v94 = (char *)v32 + v71;
                            v95 = (char *)v40 + v72 + v71;
                            v96 = (char *)v35 + v71;
                            if (v96 < v95)
                                v96 = v95;
                            i5 = ((char *)v41 + v96 - v71 >> 1) + 1 & 0xfffffffffffffff8;
                            v98 = CONCAT(v76 & 0xffff | (v76 & 0xffff) * 0x10000 | (v76 & 0xffff | (v76 & 0xffff) * 0x10000) * 0x100000000, v76 & 0xffff | (v76 & 0xffff) * 0x10000 | (v76 & 0xffff | (v76 & 0xffff) * 0x10000) * 0x100000000);
                            do
                            {
                                v99 = i5;
                                v100 = *v94;
                                v101 = *(int128_t *)((char *)v94 + v72);
                                v102 = MullV((unsigned long long)v98, (unsigned long long)v101);
                                v103 = MullV((unsigned long long)(v98 >> 64), (unsigned long long)(v101 >> 64));
                                v105 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)v103, (unsigned long long)v38), 24), _mm_srli_epi64(MullV((unsigned long long)v103, (unsigned long long)v38), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)(v103 >> 64), (unsigned long long)(v38 >> 64)), 24), _mm_srli_epi64(MullV((unsigned long long)(v103 >> 64), (unsigned long long)(v38 >> 64)), 24))));
                                v107 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)v102, (unsigned long long)v38), 24), _mm_srli_epi64(MullV((unsigned long long)v102, (unsigned long long)v38), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)(v102 >> 64), (unsigned long long)(v38 >> 64)), 24), _mm_srli_epi64(MullV((unsigned long long)(v102 >> 64), (unsigned long long)(v38 >> 64)), 24))));
                                v108 = CatEvenLanesV(_mm_add_epi32(_mm_mullo_epi32(v105, _mm_set1_epi32(0xf2ff)), MullV((unsigned long long)(v98 >> 64), (unsigned long long)(v101 >> 64))), _mm_add_epi32(_mm_mullo_epi32(v107, _mm_set1_epi32(0xf2ff)), MullV((unsigned long long)v98, (unsigned long long)v101)));
                                v109 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(v108, v39)), v108), _mm_max_epi16(_mm_add_epi16(v108, v39), _mm_setzero_si128()));
                                *(uint128_t *)((char *)v94 + v72) = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_sub_epi16(v100, v109)), _mm_add_epi16(_mm_sub_epi16(v100, v109), v34)), _mm_max_epi16(_mm_sub_epi16(v100, v109), _mm_setzero_si128()));
                                *v94 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(_mm_add_epi16(v109, v100), v39)), _mm_add_epi16(v109, v100)), _mm_max_epi16(_mm_add_epi16(_mm_add_epi16(v109, v100), v39), _mm_setzero_si128()));
                                v94 += 1;
                                i5 = v99 - 8;
                            } while (i5);
                            if (v90 == v91)
                            {
                                v111 = v74 + v91 * 2 - 2;
                                continue;
                            }
                            else
                            {
                                v74 = v93;
                            }
                        }
LABEL_a84c54:
                        do
                        {
                            v112 = *i6;
                            v113 = v76 * *(short *)((char *)v32 + v74);
                            v114 = (unsigned short)v113 + 0xf2ff * (unsigned short)(v113 * 5039 >> 24);
                            v115 = v114 & v114 - 3329 >> 15 | v114 - 3329 & (short)~(v114 - 3329 >> 31);
                            *(unsigned short *)((char *)v32 + v74) = v112 - v115 + 3329 & v112 - v115 >> 15 | v112 - v115 & (short)~((short)(v112 - v115) >> 31);
                            v93 = v74 + 2;
                            *i6 = v115 + v112 & (unsigned short)(v115 + v112 - 3329) >> 15 | (unsigned short)(v115 + v112 - 3329) & (short)~((short)(v115 + v112 - 3329) >> 31);
                            i6 += 1;
                            v74 = v93;
                        } while (i6 < v75);
                        v111 = v93 - 2;
                    } while ((v71 = v93, 0x1fe > v111));
                    v68 = (unsigned int)v70 >> 1;
                } while ((unsigned int)v70 > 3);
                v41 = (char *)v41 - 0x200;
                iter1 = v9 + v8;
                v32 += 0x100;
                v27 = v11 + 1;
                v40 += 0x100;
                v35 += 0x100;
                v42 = i - 1;
                v30 = v7;
            } while (i > 1);
        }
        v116 = 0;
        j = 0;
        v118 = 0;
        v119 = 0;
        v120 = a1 + v3->field_38;
        v121 = v2;
        v122 = 0xffffffff << ((char)v121 & 31);
        v123 = 0xffff & ~v122;
        v124 = v121;
        v125 = v123;
        do
        {
            if (v118)
            {
                v126 = v121 - v124;
                if ((unsigned int)v121 != (unsigned int)v124)
                    goto LABEL_a84df0;
            }
            else
            {
                v116 = *(long long *)v120;
                v120 += 8;
                v118 = 64;
                v126 = v121 - v124;
                if ((unsigned int)v121 != (unsigned int)v124)
                    goto LABEL_a84df0;
            }
            if ((int)v121 <= v118)
            {
                *(unsigned short *)((char *)&v13 + j) = v125 & v116;
                j += 2;
                v116 >>= (char)v121 & 63;
                v118 -= v121;
                v124 = v121;
                continue;
            }
LABEL_a84df0:
            if ((int)v124 > v118)
            {
                v119 = v116 & v125;
                v124 -= v118;
                v125 = v123 >> ((char)v118 & 31);
                v118 = 0;
            }
            else
            {
                *(unsigned short *)((char *)&v13 + j) = v119 | (unsigned short)((v116 & v125) << (v126 & 31));
                j += 2;
                v116 >>= (char)v124 & 63;
                v118 -= v124;
                v124 = v121;
                v125 = v123;
                v119 = 0;
            }
        } while (0x200 > j);
        k = 0;
        v128 = CONCAT(~v122 | ~v122 * 0x100000000, ~v122 | ~v122 * 0x100000000);
        v129 = CONCAT(937044495634074881, 937044495634074881);
        v130 = _mm_sub_epi32(_mm_setzero_si128(), CONCAT(v121 & 0xffffffff | (v121 & 0xffffffff) * 0x100000000, v121 & 0xffffffff | (v121 & 0xffffffff) * 0x100000000));
        v131 = _mm_sub_epi32(_mm_setzero_si128(), CONCAT((unsigned int)v121 - 1 | ((unsigned int)v121 - 1) * 0x100000000, (unsigned int)v121 - 1 | ((unsigned int)v121 - 1) * 0x100000000));
        do
        {
            v132 = (char *)&v13 + k;
            v133 = MullV((unsigned long long)*v132, (unsigned long long)v129);
            v134 = MullV((unsigned long long)(*v132 >> 64), (unsigned long long)(v129 >> 64));
            v135 = MullV((unsigned long long)v132[1], (unsigned long long)v129);
            v136 = MullV((unsigned long long)(v132[1] >> 64), (unsigned long long)(v129 >> 64));
            v139 = __dirty_unsupported_Iop_Sh32Ux4(v135, v130);
            v140 = __dirty_unsupported_Iop_Sh32Ux4(v136, v130);
            v143 = __dirty_unsupported_Iop_Sh32Ux4(v135 & v128, v131);
            v144 = __dirty_unsupported_Iop_Sh32Ux4(v136 & v128, v131);
            *v132 = CatEvenLanesV(_mm_add_epi32(__dirty_unsupported_Iop_Sh32Ux4(v134 & v128, v131), __dirty_unsupported_Iop_Sh32Ux4(v134, v130)), _mm_add_epi32(__dirty_unsupported_Iop_Sh32Ux4(v133 & v128, v131), __dirty_unsupported_Iop_Sh32Ux4(v133, v130)));
            v132[1] = CatEvenLanesV(_mm_add_epi32(v144, v140), _mm_add_epi32(v143, v139));
            k += 32;
        } while (k != 0x200);
        sub_a8835c(&v12, a5->field_50, a3, v4);
        v145 = &g_defe00.padding_0[0];
        v146 = ~&v12;
        v147 = 2;
        v148 = _mm_set1_epi32(3329);
        v149 = CONCAT(21642340209583, 21642340209583);
        v150 = _mm_set1_epi32(0xf2fff2ff);
        do
        {
            v151 = 0;
            v152 = (long long)(v147 * 0x100000000) >> 63 & 0xfffffffe00000000 | __ROL__(v147, 1) & 0x1fffffffe & 0x1ffffffff;
            while (1)
            {
                iter = (char *)&v12 + v151;
                v154 = v151 + v152;
                v155 = (char *)&v12 + v154;
                v156 = v145->field_2;
                v145 = &v145->field_2;
                v157 = v152 + (char *)&v12 + v151;
                v158 = (char *)&v12 + v151 + 2;
                if (v158 < v157)
                    v159 = v157;
                else
                    v159 = v158;
                v160 = &v146[v159 + -1 * v151];
                if (v160 >= 14)
                {
                    v161 = v157;
                    v162 = v158;
                    if (v158 >= v157)
                        v157 = v158;
                    v163 = v151 + (&v146[v157 + -1 * v151] & 0xfffffffffffffffe);
                    v164 = (char *)&v12 + v152 + v163 + 2;
                    if (v155 < (char *)&v12 + v163 + 2)
                    {
                        v165 = arm64g_calculate_condition(52, v161, v162, 0);
                        v166 = arm64g_calculate_condition(52, (v165 & 1 ? iter : 0x20000000), (v165 & 1 ? v164 : 0), 0);
                        if (!(v166 & 1))
                            goto LABEL_a84fb4;
                    }
                    else
                    {
                        v167 = arm64g_calculate_condition(52, v161, v162, 0);
                        v168 = arm64g_calculate_condition(48, (v167 & 1 ? iter : 0x20000000), (v167 & 1 ? v164 : 0), 0);
                        if (!(v168 & 1))
                        {
LABEL_a84fb4:
                            v169 = (v160 >> 1) + 1;
                            v170 = v169 & 0xfffffffffffffff8;
                            v171 = v170 * 2;
                            v151 = v154 + v171;
                            v172 = (__m128i)(CONCAT(v156 & 0xffff | (v156 & 0xffff) * 0x100000000, v156 & 0xffff | (v156 & 0xffff) * 0x100000000));
                            node = iter;
                            i3 = v170;
                            do
                            {
                                v175 = i3;
                                v176 = *(int128_t *)node;
                                v177 = *(int128_t *)((char *)node + v152);
                                v178 = _mm_mullo_epi32(_mm_add_epi32(_mm_sub_epi32(_mm_srli_epi32(_mm_unpacklo_epi16(v176, v176), 16), _mm_srli_epi32(_mm_unpacklo_epi16(v177, v177), 16)), v148), v172);
                                v179 = _mm_mullo_epi32(_mm_add_epi32(_mm_sub_epi32(_mm_srli_epi32(_mm_unpackhi_epi16(v176, v176), 16), _mm_srli_epi32(_mm_unpackhi_epi16(v177, v177), 16)), v148), v172);
                                v181 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v179), (unsigned long long)v149), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v179), (unsigned long long)v149), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v179, 1), (unsigned long long)(v149 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v179, 1), (unsigned long long)(v149 >> 64)), 24))));
                                v183 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v178), (unsigned long long)v149), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v178), (unsigned long long)v149), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v178, 1), (unsigned long long)(v149 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v178, 1), (unsigned long long)(v149 >> 64)), 24))));
                                v184 = CatEvenLanesV(_mm_add_epi32(v179, _mm_mullo_epi32(v181, _mm_set1_epi32(0xf2ff))), _mm_add_epi32(v178, _mm_mullo_epi32(v183, _mm_set1_epi32(0xf2ff))));
                                *(__m128i *)((char *)node + v152) = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(v184, v150)), v184), _mm_max_epi16(_mm_add_epi16(v184, v150), _mm_setzero_si128()));
                                *(__m128i *)node = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(_mm_add_epi16(v177, v176), v150)), _mm_add_epi16(v177, v176)), _mm_max_epi16(_mm_add_epi16(_mm_add_epi16(v177, v176), v150), _mm_setzero_si128()));
                                node += 16;
                                i3 = v175 - 8;
                            } while (i3);
                            if (v169 != v170)
                            {
                                v154 = v151;
                                iter += v171;
                            }
                            else if (0x1fe <= (long long)(v154 + v170 * 2 - 2))
                            {
                                break;
                            }
                            else
                            {
                                continue;
                            }
                        }
                    }
                }
                do
                {
                    v186 = *(short *)((char *)&v12 + v154);
                    v187 = *(short *)iter;
                    v188 = (unsigned short)v156 * ((unsigned short)(v187 - v186) + 3329) + 0xf2ff * (unsigned short)((v156 * (v187 - v186 + 3329)) * 5039 >> 24);
                    *(short *)((char *)&v12 + v154) = v188 & (unsigned short)(v188 - 3329) >> 15 | v188 - 3329 & (short)~(v188 - 3329 >> 31);
                    v151 = v154 + 2;
                    *(unsigned short *)iter = (unsigned short)v186 + (unsigned short)v187 & (unsigned short)(v186 + v187 - 3329) >> 15 | (unsigned short)(v186 + v187 - 3329) & (short)~((short)(v186 + v187 - 3329) >> 31);
                    iter += 2;
                    v154 = v151;
                } while (iter < v155);
                v12 = v12;
                if ((long long)(v151 - 2) >= 0x1fe)
                    break;
            }
            v147 = (unsigned int)v147 * 2;
        } while (0x100 > (int)v147);
        l = 0;
        v190 = CONCAT(929726034568744167, 929726034568744167);
        v191 = CONCAT(21642340209583, 21642340209583);
        do
        {
            v192 = *(int128_t *)((char *)&v12 + l);
            v193 = MullV((unsigned long long)v192, (unsigned long long)v190);
            v194 = MullV((unsigned long long)(v192 >> 64), (unsigned long long)(v190 >> 64));
            v196 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)v194, (unsigned long long)v191), 24), _mm_srli_epi64(MullV((unsigned long long)v194, (unsigned long long)v191), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)(v194 >> 64), (unsigned long long)(v191 >> 64)), 24), _mm_srli_epi64(MullV((unsigned long long)(v194 >> 64), (unsigned long long)(v191 >> 64)), 24))));
            v198 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)v193, (unsigned long long)v191), 24), _mm_srli_epi64(MullV((unsigned long long)v193, (unsigned long long)v191), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)(v193 >> 64), (unsigned long long)(v191 >> 64)), 24), _mm_srli_epi64(MullV((unsigned long long)(v193 >> 64), (unsigned long long)(v191 >> 64)), 24))));
            v199 = CatEvenLanesV(_mm_add_epi32(_mm_mullo_epi32(v196, _mm_set1_epi32(0xf2ff)), MullV((unsigned long long)(v192 >> 64), (unsigned long long)(v190 >> 64))), _mm_add_epi32(_mm_mullo_epi32(v198, _mm_set1_epi32(0xf2ff)), MullV((unsigned long long)v192, (unsigned long long)v190)));
            *(__m128i *)((char *)&v12 + l) = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(v199, _mm_set1_epi16(-0xd01))), v199), _mm_max_epi16(_mm_add_epi16(v199, _mm_set1_epi16(-0xd01)), _mm_setzero_si128()));
            l += 16;
        } while (l != 0x200);
        m = 0;
        v201 = _mm_set1_epi32(218172673);
        do
        {
            v202 = (char *)&v13 + m;
            v203 = (char *)&v12 + m;
            v204 = _mm_sub_epi16(*v202, *v203);
            v205 = _mm_sub_epi16(v202[1], v203[1]);
            *v202 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), v204), _mm_add_epi16(v204, v201)), _mm_max_epi16(v204, _mm_setzero_si128()));
            v202[1] = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), v205), _mm_add_epi16(v205, v201)), _mm_max_epi16(v205, _mm_setzero_si128()));
            m += 32;
        } while (m != 0x200);
        n = 0;
        v207 = CONCAT(2836748100630882142, 2836748100630882142);
        do
        {
            v208 = *(int128_t *)((char *)&v13 + n);
            v209 = (__m128i)(MullV(_mm_extract_epi64(v208, 1), (unsigned long long)(v207 >> 64)));
            *(__m128i *)((char *)&v13 + n) = _mm_and_si128(CatEvenLanesV(_mm_add_epi32(_mm_add_epi32(_mm_srli_epi32(_mm_or_si128(_mm_sub_epi32(_mm_set1_epi32(1664), _mm_add_epi32(_mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v208), 15), _mm_mullo_epi32(_mm_srli_epi32(v209, 24), _mm_set1_epi32(-0xd01)))), _mm_add_epi32(_mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v208), 15), _mm_mullo_epi32(_mm_srli_epi32(v209, 24), _mm_set1_epi32(-0xd01)))), 31), _mm_srli_epi32(MullV(_mm_extract_epi64(v208, 1), (unsigned long long)(v207 >> 64)), 24)), _mm_srli_epi32(_mm_or_si128(_mm_sub_epi32(_mm_set1_epi32(4993), _mm_add_epi32(_mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v208), 15), _mm_mullo_epi32(_mm_srli_epi32(v209, 24), _mm_set1_epi32(-0xd01)))), _mm_add_epi32(_mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v208), 15), _mm_mullo_epi32(_mm_srli_epi32(MullV(_mm_extract_epi64(v208, 1), (unsigned long long)(v207 >> 64)), 24), _mm_set1_epi32(-0xd01)))), 31)), _mm_add_epi32(_mm_add_epi32(_mm_srli_epi32(_mm_or_si128(_mm_sub_epi32(_mm_set1_epi32(1664), _mm_add_epi32(_mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v208), 15), _mm_mullo_epi32(_mm_srli_epi32(MullV(_mm_cvtsi128_si64(v208), (unsigned long long)v207), 24), _mm_set1_epi32(-0xd01)))), _mm_add_epi32(_mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v208), 15), _mm_mullo_epi32(_mm_srli_epi32(MullV(_mm_cvtsi128_si64(v208), (unsigned long long)v207), 24), _mm_set1_epi32(-0xd01)))), 31), _mm_srli_epi32(MullV(_mm_cvtsi128_si64(v208), (unsigned long long)v207), 24)), _mm_srli_epi32(_mm_or_si128(_mm_sub_epi32(_mm_set1_epi32(4993), _mm_add_epi32(_mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v208), 15), _mm_mullo_epi32(_mm_srli_epi32(MullV(_mm_cvtsi128_si64(v208), (unsigned long long)v207), 24), _mm_set1_epi32(-0xd01)))), _mm_add_epi32(_mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v208), 15), _mm_mullo_epi32(_mm_srli_epi32(MullV(_mm_cvtsi128_si64(v208), (unsigned long long)v207), 24), _mm_set1_epi32(-0xd01)))), 31))), _mm_set1_epi32(0xff01ff01));
            n += 16;
        } while (n != 0x200);
        i0 = 0;
        v212 = &v13 + 64;
        do
        {
            v213 = _INSERT(__float_as_int(__int_as_float((unsigned int)(char)*(char *)((char *)v212 - 128))), 1, *(v212 - 112));
            v214 = _INSERT(__float_as_int(__int_as_float((unsigned int)(char)*(char *)((char *)v212 - 126))), 1, *(v212 - 110));
            v215 = _INSERT(v213, 2, *(v212 - 96));
            v216 = _INSERT(v214, 2, *(v212 - 94));
            v217 = _INSERT(v215, 3, *(v212 - 80));
            v218 = _INSERT(v216, 3, *(v212 - 78));
            v219 = _INSERT(v217, 4, *(v212 - 64));
            v220 = _INSERT(v218, 4, *(v212 - 62));
            v221 = _INSERT(__float_as_int(__int_as_float((unsigned int)(char)*(char *)((char *)v212 - 124))), 1, *(v212 - 108));
            v222 = _INSERT(v219, 5, *(v212 - 48));
            v223 = _INSERT(v221, 2, *(v212 - 92));
            v224 = _INSERT(v220, 5, *(v212 - 46));
            v225 = _INSERT(v223, 3, *(v212 - 76));
            v226 = _INSERT(v222, 6, *(v212 - 32));
            v227 = _INSERT(v225, 4, *(v212 - 60));
            v228 = _INSERT(v224, 6, *(v212 - 30));
            v229 = _INSERT(v227, 5, *(v212 - 44));
            v230 = _INSERT(v226, 7, *(v212 - 16));
            v231 = _INSERT(v229, 6, *(v212 - 28));
            v232 = _INSERT(v228, 7, *(v212 - 14));
            v233 = _INSERT(__float_as_int(__int_as_float((unsigned int)(char)*(char *)((char *)v212 - 122))), 1, *(v212 - 106));
            v234 = _INSERT(v231, 7, *(v212 - 12));
            v235 = _INSERT(v233, 2, *(v212 - 90));
            v236 = _INSERT(v230, 8, *v212);
            v237 = _INSERT(v235, 3, *(v212 - 74));
            v238 = _INSERT(v232, 8, v212[2]);
            v239 = _INSERT(v237, 4, *(v212 - 58));
            v240 = _INSERT(v234, 8, v212[4]);
            v241 = _INSERT(v239, 5, *(v212 - 42));
            v242 = _INSERT(v236, 9, v212[16]);
            v243 = _INSERT(v241, 6, *(v212 - 26));
            v244 = _INSERT(v238, 9, v212[18]);
            v245 = _INSERT(v243, 7, *(v212 - 10));
            v246 = _INSERT(v240, 9, v212[20]);
            v247 = _INSERT(v245, 8, v212[6]);
            v248 = _INSERT(v242, 10, v212[32]);
            v249 = _INSERT(v247, 9, v212[22]);
            v250 = _INSERT(v244, 10, v212[0x22]);
            v251 = _INSERT(__float_as_int(__int_as_float((unsigned int)(char)*(char *)((char *)v212 - 120))), 1, *(v212 - 104));
            v252 = _INSERT(v246, 10, v212[36]);
            v253 = _INSERT(v251, 2, *(v212 - 88));
            v254 = _INSERT(v249, 10, v212[38]);
            v255 = _INSERT(v253, 3, *(v212 - 72));
            v256 = _INSERT(v248, 11, v212[48]);
            v257 = _INSERT(v255, 4, *(v212 - 56));
            v258 = _INSERT(v250, 11, v212[50]);
            v259 = _INSERT(v257, 5, *(v212 - 40));
            v260 = _INSERT(v252, 11, v212[52]);
            v261 = _INSERT(v259, 6, *(v212 - 24));
            v262 = _INSERT(v254, 11, v212[54]);
            v263 = _INSERT(v261, 7, *(v212 - 8));
            v264 = _INSERT(v256, 12, v212[64]);
            v265 = _INSERT(v263, 8, v212[8]);
            v266 = _INSERT(v258, 12, v212[66]);
            v267 = _INSERT(v265, 9, v212[24]);
            v268 = _INSERT(v260, 12, v212[0x44]);
            v269 = _INSERT(v267, 10, v212[40]);
            v270 = _INSERT(v262, 12, v212[70]);
            v271 = _INSERT(v269, 11, v212[56]);
            v272 = _INSERT(v264, 13, v212[80]);
            v273 = _INSERT(v271, 12, v212[72]);
            v274 = _INSERT(v266, 13, v212[82]);
            v275 = _INSERT(v268, 13, v212[84]);
            v276 = _INSERT(__float_as_int(__int_as_float((unsigned int)(char)*(char *)((char *)v212 - 118))), 1, *(v212 - 0x66));
            v277 = _INSERT(v270, 13, v212[86]);
            v278 = _INSERT(v276, 2, *(v212 - 86));
            v279 = _INSERT(v273, 13, v212[88]);
            v280 = _INSERT(v278, 3, *(v212 - 70));
            v281 = _INSERT(v272, 14, v212[96]);
            v282 = _INSERT(v280, 4, *(v212 - 54));
            v283 = _INSERT(v274, 14, v212[98]);
            v284 = _INSERT(v282, 5, *(v212 - 38));
            v285 = _INSERT(v275, 14, v212[100]);
            v286 = _INSERT(v284, 6, *(v212 - 22));
            v287 = _INSERT(v277, 14, v212[0x66]);
            v288 = _INSERT(v286, 7, *(v212 - 6));
            v289 = _INSERT(v288, 8, v212[10]);
            v290 = _INSERT(v279, 14, v212[104]);
            v291 = _INSERT(v289, 9, v212[26]);
            v292 = _INSERT(v291, 10, v212[42]);
            v293 = _INSERT(v281, 15, v212[112]);
            v294 = _INSERT(v292, 11, v212[58]);
            v295 = _INSERT(v294, 12, v212[74]);
            v296 = (__m128i)_INSERT(v283, 15, v212[114]);
            v297 = _INSERT(v295, 13, v212[90]);
            v298 = (__m128i)_INSERT(v285, 15, v212[116]);
            v299 = _INSERT(v297, 14, v212[106]);
            v300 = (__m128i)_INSERT(v287, 15, v212[118]);
            v301 = (__m128i)_INSERT(v290, 15, v212[120]);
            v302 = _INSERT(__float_as_int(__int_as_float((unsigned int)(char)*(char *)((char *)v212 - 116))), 1, *(v212 - 100));
            v303 = (__m128i)_INSERT(v299, 15, v212[122]);
            v304 = _INSERT(v302, 2, *(v212 - 84));
            v305 = _INSERT(v304, 3, *(v212 - 0x44));
            v306 = _INSERT(v305, 4, *(v212 - 52));
            v307 = _INSERT(v306, 5, *(v212 - 36));
            v308 = _INSERT(v307, 6, *(v212 - 20));
            v309 = _INSERT(v308, 7, *(v212 - 4));
            v310 = _INSERT(v309, 8, v212[12]);
            v311 = _INSERT(v310, 9, v212[28]);
            v312 = _INSERT(v311, 10, v212[44]);
            v313 = _INSERT(v312, 11, v212[60]);
            v314 = _INSERT(v313, 12, v212[76]);
            v315 = _INSERT(v314, 13, v212[92]);
            v316 = _INSERT(v315, 14, v212[108]);
            v317 = (__m128i)_INSERT(v316, 15, v212[124]);
            v318 = _INSERT(__float_as_int(__int_as_float((unsigned int)(char)*(char *)((char *)v212 - 114))), 1, *(v212 - 98));
            v319 = _INSERT(v318, 2, *(v212 - 82));
            v320 = _INSERT(v319, 3, *(v212 - 66));
            v321 = _INSERT(v320, 4, *(v212 - 50));
            v322 = _INSERT(v321, 5, *(v212 - 0x22));
            v323 = _INSERT(v322, 6, *(v212 - 18));
            v324 = _INSERT(v323, 7, *(v212 - 2));
            v325 = _INSERT(v324, 8, v212[14]);
            v326 = _INSERT(v325, 9, v212[30]);
            v327 = _INSERT(v326, 10, v212[46]);
            v328 = _INSERT(v327, 11, v212[62]);
            v329 = _INSERT(v328, 12, v212[78]);
            v330 = _INSERT(v329, 13, v212[94]);
            v331 = _INSERT(v330, 14, v212[110]);
            v332 = (__m128i)_INSERT(v331, 15, v212[126]);
            *(uint128_t *)((char *)&v19 + i0) = _mm_or_si128(_mm_or_si128(_mm_or_si128(_mm_or_si128(_mm_and_si128(_mm_add_epi8(v296, v296), _mm_set1_epi32(0x2020202)), _mm_and_si128(v293, _mm_set1_epi32(0x1010101))), _mm_or_si128(_mm_and_si128(ShlNV(v298, 2), _mm_set1_epi32(0x4040404)), _mm_and_si128(ShlNV(v300, 3), _mm_set1_epi32(0x8080808)))), _mm_or_si128(_mm_or_si128(_mm_and_si128(ShlNV(v301, 4), _mm_set1_epi32(0x10101010)), _mm_and_si128(ShlNV(v303, 5), _mm_set1_epi32(0x20202020))), _mm_and_si128(ShlNV(v317, 6), _mm_set1_epi32(0x40404040)))), ShlNV(v332, 7));
            i0 += 16;
            v212 += 0x100;
        } while (i0 != 32);
        sub_a66ec0(&v13, 0x200);
        sub_a66ec0(&v12, 0x200);
        v20 = *v5;
        v21 = v5[1];
        if (sub_a86280(&v14, &v19, 64, a4, a5) && sub_a8673c(a2, &v19, &v16, a3, a4, a5))
        {
            if (!sub_a66f20(a1, a2, v1->field_28))
                v333 = 0xff;
            else
                v333 = 0;
            v334 = CONCAT(v333 & 0xff | (v333 & 0xff) * 0x100 | (v333 & 0xff | (v333 & 0xff) * 0x100) * 0x10000 | (v333 & 0xff | (v333 & 0xff) * 0x100 | (v333 & 0xff | (v333 & 0xff) * 0x100) * 0x10000) * 0x100000000, v333 & 0xff | (v333 & 0xff) * 0x100 | (v333 & 0xff | (v333 & 0xff) * 0x100) * 0x10000 | (v333 & 0xff | (v333 & 0xff) * 0x100 | (v333 & 0xff | (v333 & 0xff) * 0x100) * 0x10000) * 0x100000000);
            v335 = CONCAT(~v333 & 0xff | (~v333 & 0xff) * 0x100 | (~v333 & 0xff | (~v333 & 0xff) * 0x100) * 0x10000 | (~v333 & 0xff | (~v333 & 0xff) * 0x100 | (~v333 & 0xff | (~v333 & 0xff) * 0x100) * 0x10000) * 0x100000000, ~v333 & 0xff | (~v333 & 0xff) * 0x100 | (~v333 & 0xff | (~v333 & 0xff) * 0x100) * 0x10000 | (~v333 & 0xff | (~v333 & 0xff) * 0x100 | (~v333 & 0xff | (~v333 & 0xff) * 0x100) * 0x10000) * 0x100000000);
            v336 = a0;
            *v336 = v335 & v17 | v334 & v14;
            v336[1] = v335 & v18 | v334 & v15;
        }
        else
        {
            v337 = a0;
            *v337 = v17;
            v337[1] = v18;
        }
        sub_a66ec0(&v19, 32);
        sub_a66ec0(&v14, 64);
        v338 = 1;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ml_kem/ml_kem.c", 1856, "decap");
        v0 = v25->field_0;
        sub_a36abc(15, 0xc0103, "internal error while performing %s decapsulation");
        v338 = 0;
    }
    sub_a66ec0(&v17, 32);
    if (*(long long *)&g_10002b0 == v22)
        return v338;
    ___stack_chk_fail();
}
