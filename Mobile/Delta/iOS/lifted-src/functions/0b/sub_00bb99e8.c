/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbb99e8..0xbbaca4 (4796 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bb99e8_3 {
    struct st_bb99e8_1 *field_0;
    unsigned long long field_8;
} st_bb99e8_3;

typedef struct st_bb99e8_5 {
    unsigned long long field_0;
    long long *field_8;
    unsigned long long field_10;
} st_bb99e8_5;

typedef struct st_bb99e8_4 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned int field_18;
} st_bb99e8_4;

typedef struct st_bb99e8_2 {
    unsigned long long field_0;
    char padding_8[24];
    unsigned int field_20;
} st_bb99e8_2;

typedef struct st_bb99e8_0 {
    char padding_0[8];
    struct st_bb99e8_1 *field_8;
    unsigned long long field_10;
    char padding_18[8];
    unsigned long long field_20;
    unsigned long long field_28;
    char padding_30[8];
    unsigned long long field_38;
    unsigned long long field_40;
} st_bb99e8_0;

typedef struct st_bb99e8_1 {
    long long field_0;
} st_bb99e8_1;

extern long long g_ef99a8;
extern long long g_ef99c0;
extern uint128_t g_efc958;
extern uint128_t g_efc968;

long long sub_bb99e8(st_bb99e8_0 *a0, st_bb99e8_3 *a1)
{
    unsigned long long v28;  // x8
    unsigned long v29;  // cc_op
    unsigned long v32;  // cc_ndep
    unsigned long long *v116;  // x26
    unsigned long long v117;  // x8
    unsigned long long v118;  // x10
    __m128i v119;  // q0
    unsigned long long v120;  // x10
    __m128i v121;  // q1
    unsigned long v123;  // x11
    unsigned long long v124;  // x11
    __m128i v125;  // q1
    unsigned long long v33;  // 4110
    unsigned long v128;  // x11
    unsigned long long v129;  // x11
    unsigned long long v130;  // 4128
    unsigned long long v131;  // 4130
    unsigned long long v132;  // x12
    unsigned long long v133;  // x12
    unsigned long long v134;  // x12
    unsigned long long v135;  // x12
    unsigned long long v34;  // 4102
    unsigned long long v136;  // x9
    unsigned long long v137;  // x8
    unsigned long v138;  // x24
    unsigned long long v139;  // x9
    unsigned long long v140;  // x9
    unsigned long long v141;  // x9
    __m128i v142;  // q1
    unsigned long v144;  // x10
    unsigned long long v145;  // x10
    unsigned long long v146;  // x10
    unsigned long long v147;  // 4128
    unsigned long long v148;  // 4130
    unsigned long long v149;  // x11
    unsigned long long v150;  // x11
    unsigned long long v151;  // x11
    unsigned long long v152;  // x11
    uint128_t v153;  // q1
    unsigned long long v155;  // 4102
    unsigned long v35;  // cc_dep1
    st_bb99e8_1 **v156;  // x19
    st_bb99e8_1 **v157;  // x24
    st_bb99e8_1 **iter;  // x22
    st_bb99e8_1 **node;  // x22
    long long *v160;  // x26
    unsigned long long v161;  // x8
    unsigned long long v162;  // x9
    __m128i v163;  // q0
    unsigned long long v164;  // x9
    __m128i v165;  // q1
    unsigned long v36;  // cc_dep2
    unsigned long v167;  // x10
    unsigned long long v168;  // x10
    __m128i v169;  // q1
    unsigned long v172;  // x10
    unsigned long long v173;  // x10
    unsigned long long v174;  // 4128
    unsigned long long v175;  // 4130
    unsigned long long v176;  // x11
    unsigned long long v177;  // x11
    long long *v178;  // x25
    unsigned long long v179;  // x11
    unsigned long long v180;  // 4102
    unsigned long long v181;  // 4102
    long long *v182;  // x26
    unsigned long long v183;  // x8
    unsigned long long v184;  // x9
    __m128i v185;  // q0
    long long *v37;  // x19
    unsigned long long v186;  // x9
    __m128i v187;  // q1
    unsigned long v189;  // x10
    unsigned long long v190;  // x10
    __m128i v191;  // q1
    unsigned long v194;  // x10
    unsigned long long v195;  // x10
    unsigned long long *v38;  // x24
    unsigned long long v196;  // 4128
    unsigned long long v197;  // 4130
    unsigned long long v198;  // x11
    unsigned long long v199;  // x11
    unsigned long long v200;  // x11
    unsigned long long v201;  // x11
    unsigned long long v202;  // x9
    unsigned long long v203;  // x8
    unsigned long long *v204;  // x25
    unsigned long long v205;  // x10
    unsigned long long v39;  // x22
    unsigned long long v206;  // x10
    unsigned long long v207;  // x10
    __m128i v208;  // q1
    unsigned long v210;  // x11
    unsigned long long v211;  // x11
    unsigned long long v212;  // x11
    unsigned long long v213;  // 4128
    unsigned long long v214;  // 4130
    unsigned long long v215;  // x12
    __m128i v40;  // q3
    unsigned long long v216;  // x12
    unsigned long long v217;  // x12
    unsigned long long v218;  // x12
    uint128_t v219;  // q1
    unsigned long long v221;  // 4102
    unsigned long long v222;  // 4102
    unsigned long long v223;  // x21
    st_bb99e8_2 *v224;  // x8
    unsigned long long v225;  // x19
    long long *i;  // x19
    unsigned long long ptr;  // x0
    unsigned long long idx;  // x22
    st_bb99e8_2 *v228;  // x8
    unsigned long v229;  // x21
    unsigned long long v230;  // x8
    unsigned long long v231;  // x11
    unsigned long long v232;  // x9
    unsigned long long v233;  // x8
    st_bb99e8_5 *v234;  // x8
    long long *v235;  // x19
    unsigned long long v42;  // x8
    unsigned long long v236;  // x8
    long long *v237;  // x10
    unsigned long long v238;  // x8
    unsigned long long v239;  // x10
    __m128i v240;  // q0
    unsigned long long v241;  // x10
    __m128i v242;  // q1
    unsigned long v244;  // x11
    unsigned long long v245;  // x11
    long long *v43;  // x25
    uint128_t v246;  // q1
    unsigned long v249;  // x11
    unsigned long long v250;  // x11
    unsigned long long v251;  // 4128
    unsigned long long v252;  // 4130
    unsigned long long v253;  // x12
    unsigned long long v254;  // x12
    long long *v255;  // x12
    unsigned long long v256;  // x12
    unsigned long v257;  // x8
    unsigned long long v258;  // x9
    unsigned long long v259;  // x11
    unsigned long long v260;  // x11
    unsigned long long v261;  // x11
    __m128i v262;  // q1
    unsigned long v264;  // x12
    unsigned long long v265;  // x12
    unsigned long long v45;  // x10
    unsigned long long v266;  // x12
    unsigned long long v267;  // 4128
    unsigned long long v268;  // 4130
    unsigned long long v269;  // x13
    unsigned long long v270;  // x13
    unsigned long long *v271;  // x13
    unsigned long long v272;  // x13
    uint128_t v273;  // q1
    unsigned long long v275;  // 4102
    __m128i v46;  // q0
    unsigned long long v47;  // x10
    __m128i v48;  // q1
    unsigned long v50;  // x11
    unsigned long long v51;  // x11
    __m128i v52;  // q1
    unsigned long v55;  // x11
    unsigned long long v56;  // x11
    unsigned long long v57;  // 4128
    unsigned long long v58;  // 4130
    unsigned long long v59;  // x12
    unsigned long long v60;  // x12
    unsigned long long v61;  // x12
    unsigned long long v62;  // x12
    unsigned long long v63;  // x9
    unsigned long long v64;  // x8
    unsigned long long *v65;  // x9
    unsigned long long v66;  // x11
    unsigned long long v67;  // x11
    unsigned long long v68;  // x11
    __m128i v69;  // q1
    unsigned long long v30;  // 4110
    unsigned long v71;  // x12
    unsigned long long v72;  // x12
    unsigned long long v73;  // x12
    unsigned long long v74;  // 4128
    unsigned long long v75;  // 4130
    unsigned long long v76;  // x13
    unsigned long long v77;  // x13
    unsigned long long v78;  // x13
    unsigned long long v79;  // x13
    unsigned long long v31;  // 4102
    uint128_t v80;  // q1
    unsigned long long v82;  // 4102
    unsigned long v83;  // x9
    unsigned long long v84;  // x9
    unsigned long long v85;  // x28
    unsigned long long *v86;  // x27
    unsigned long long v87;  // x20
    unsigned long long v88;  // x8
    st_bb99e8_4 *v89;  // x10
    unsigned long long j;  // x21
    unsigned long long v91;  // x22
    unsigned long long v92;  // x25
    unsigned long long iter1;  // x19
    unsigned long long iter2;  // x19
    unsigned long long *v95;  // x26
    unsigned long long v96;  // x8
    unsigned long long v97;  // x10
    __m128i v98;  // q0
    unsigned long long v99;  // x10
    __m128i v100;  // q1
    unsigned long v102;  // x11
    unsigned long long v103;  // x11
    __m128i v104;  // q1
    unsigned long v107;  // x11
    unsigned long long v108;  // x11
    unsigned long long v109;  // 4128
    unsigned long long v110;  // 4130
    unsigned long long v111;  // x12
    unsigned long long v112;  // x12
    long long *v113;  // x12
    unsigned long long v114;  // x12
    unsigned long long v115;  // 4102
    unsigned long long v0;  // [bp-0x1e0]
    unsigned long long v1;  // [bp-0x1d8]
    unsigned long long v2;  // [bp-0x1d0]
    unsigned long long v3;  // [bp-0x1c8]
    unsigned long long v4;  // [bp-0x1c8]
    unsigned long long v5;  // [bp-0x1c0]
    unsigned long long v6;  // [bp-0x1b8]
    unsigned long long v7;  // [bp-0x1b0]
    unsigned long long v8;  // [bp-0x1a8]
    unsigned long v9;  // [bp-0x1a0]
    unsigned long long v10;  // [bp-0x198]
    long long *v11;  // [bp-0x188], Other Possible Types: st_bb99e8_4 *
    unsigned long v12;  // [bp-0x180]
    unsigned long long v13;  // [bp-0x178]
    long long *v14;  // [bp-0x170], Other Possible Types: unsigned long long
    unsigned long long *v15;  // [bp-0x168]
    unsigned long long *v16;  // [bp-0x168]
    unsigned long v17;  // [bp-0x160], Other Possible Types: unsigned long long
    unsigned long v18;  // [bp-0x158]
    unsigned long long v19;  // [bp-0x150]
    unsigned long long v20;  // [bp-0x148]
    char v21;  // [bp-0x140], Other Possible Types: uint128_t
    st_bb99e8_1 **v22;  // [bp-0x138]
    uint128_t v23;  // [bp-0x130], Other Possible Types: unsigned long
    char v24;  // [bp-0x100], Other Possible Types: uint128_t
    uint128_t v25;  // [bp-0xf0]
    char *v26;  // [bp-0x10]
    char v27;  // [bp+0x0]

    v26 = &v27;
    v28 = a0->field_10;
    if (a0->field_10)
    {
        v30 = arm64g_calculate_condition(v29 | 16, v35, v36, v32);
        v31 = arm64g_calculate_condition(20, (v30 & 1 ? a1[1].field_8 : 0x40000000), 0, 0);
        if (v31 & 1)
            goto LABEL_bb9a88;
    }
    else
    {
        v33 = arm64g_calculate_condition(v29 | 16, v35, v36, v32);
        v34 = arm64g_calculate_condition(16, (v33 & 1 ? a1[1].field_8 : 0x40000000), 0, 0);
        if (v34 & 1)
        {
LABEL_bb9a88:
            v37 = a0->field_8;
            v38 = a1->field_0;
            v39 = a1->field_8;
            v40 = _mm_set1_epi32(-1);
            i = v37;
            do
            {
                v42 = 0;
                v43 = i;
                v45 = 5871781006564002453 * (*i + 8);
                v46 = v45 >> 57 & 0xff | (v45 >> 57 & 0xff) * 0x100 | (v45 >> 57 & 0xff | (v45 >> 57 & 0xff) * 0x100) * 0x10000 | (v45 >> 57 & 0xff | (v45 >> 57 & 0xff) * 0x100 | (v45 >> 57 & 0xff | (v45 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                v47 = v45 & v39;
                v48 = *(long long *)((char *)v38 + v47);
                v50 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v48, v46));
                v51 = v50 & 0x8080808080808080;
                if (!(v50 & 0x8080808080808080))
                {
                    do
                    {
LABEL_bb9b0c:
                        v52 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v48, v40));
                        if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)))))))))) & 1)
                            goto LABEL_bb9aa4;
                        v42 += 8;
                        v47 = v47 + v42 & v39;
                        v48 = *(long long *)((char *)v38 + v47);
                        v55 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v48, v46));
                        v51 = v55 & 0x8080808080808080;
                    } while (!(v55 & 0x8080808080808080));
                }
                while (1)
                {
                    v56 = v51;
                    v57 = ((((((v56 & 0xaaaaaaaaaaaaaaaa) >> 1 | v56 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v56 & 0xaaaaaaaaaaaaaaaa) >> 1 | v56 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v56 & 0xaaaaaaaaaaaaaaaa) >> 1 | v56 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v56 & 0xaaaaaaaaaaaaaaaa) >> 1 | v56 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v58 = (((((((v56 & 0xaaaaaaaaaaaaaaaa) >> 1 | v56 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v56 & 0xaaaaaaaaaaaaaaaa) >> 1 | v56 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v56 & 0xaaaaaaaaaaaaaaaa) >> 1 | v56 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v56 & 0xaaaaaaaaaaaaaaaa) >> 1 | v56 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v59 = ((((v58 | v57) & 0xffff0000ffff0000) >> 16 | (v58 | v57) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v58 | v57) & 0xffff0000ffff0000) >> 16 | (v58 | v57) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v59)
                        v60 = 64;
                    else
                        v60 = Clz(v59);
                    v61 = v47 + (v60 >> 3) & v39;
                    if (*i == *(long long *)((char *)&v38[-2 * v61] - 16))
                        break;
                    v62 = v56 - 1;
                    v51 = v62 & v56;
                    if (!(v62 & v56))
                        goto LABEL_bb9b0c;
                }
                v63 = -v61;
LABEL_bb9bac:
                v64 = 0;
                v65 = &v38[2 * v63];
                v66 = 5871781006564002453 * (*(long long *)((char *)v65 - 8) + 8);
                v67 = v66;
                while (1)
                {
                    v68 = v67 & v39;
                    v69 = *(long long *)((char *)v38 + v68);
                    v71 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v69, (uint128_t)(v66 >> 57 & 0xff | (v66 >> 57 & 0xff) * 0x100 | (v66 >> 57 & 0xff | (v66 >> 57 & 0xff) * 0x100) * 0x10000 | (v66 >> 57 & 0xff | (v66 >> 57 & 0xff) * 0x100 | (v66 >> 57 & 0xff | (v66 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000)));
                    v72 = v71 & 0x8080808080808080;
                    if (v71 & 0x8080808080808080)
                    {
                        do
                        {
                            v73 = v72;
                            v74 = ((((((v73 & 0xaaaaaaaaaaaaaaaa) >> 1 | v73 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v73 & 0xaaaaaaaaaaaaaaaa) >> 1 | v73 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v73 & 0xaaaaaaaaaaaaaaaa) >> 1 | v73 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v73 & 0xaaaaaaaaaaaaaaaa) >> 1 | v73 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                            v75 = (((((((v73 & 0xaaaaaaaaaaaaaaaa) >> 1 | v73 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v73 & 0xaaaaaaaaaaaaaaaa) >> 1 | v73 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v73 & 0xaaaaaaaaaaaaaaaa) >> 1 | v73 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v73 & 0xaaaaaaaaaaaaaaaa) >> 1 | v73 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                            v76 = ((((v75 | v74) & 0xffff0000ffff0000) >> 16 | (v75 | v74) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v75 | v74) & 0xffff0000ffff0000) >> 16 | (v75 | v74) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                            if (!v76)
                                v77 = 64;
                            else
                                v77 = Clz(v76);
                            v78 = v68 + (v77 >> 3) & v39;
                            if (*(long long *)((char *)v65 - 8) == *(long long *)((char *)&v38[-2 * v78] - 16))
                            {
                                v63 = -v78;
                                goto LABEL_bb9bac;
                            }
                        } while ((v79 = v73 - 1, v72 = v79 & v73, v79 & v73));
                    }
                    v80 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v69, v40));
                    if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v80, v80), _mm_unpacklo_epi64(v80, v80)))))))))) & 1)
                        break;
                    v64 += 8;
                    v67 = v68 + v64;
                }
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                if ((long long)/* unsupported instruction */ < 0)
                    goto LABEL_bbab50;
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v82 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                if (!(v82 & 1))
                {
                    /* unsupported instruction */;
                    sub_b86a90(*v43);
                    v40 = _mm_set1_epi32(-1);
                }
                *v43 = *(long long *)((char *)v65 - 8);
LABEL_bb9aa4:
                i += 1;
            } while (i != &v37[v28]);
        }
    }
    v83 = a0->field_20;
    v9 = v83;
    v10 = a0->field_28;
    v18 = v83;
    v19 = v83 + a0->field_28 * 32;
    v20 = 0;
    sub_b9c8e4(&v24, &v18);
    v6 = v24;
    v7 = *(unsigned long long *)((void*)&v24 + 8);
    if ((unsigned long long)v25)
    {
        v84 = v7;
        v5 = v84 + (unsigned long long)v25 * 4;
        v85 = a1[1].field_8;
        v86 = a1->field_0;
        v87 = a1->field_8;
        v12 = a0->field_38;
        v13 = a0->field_40;
        while (1)
        {
            v88 = *(int *)v84;
            v8 = v84 + 4;
            if (v10 <= v88 || !(v89 = v9 + v88 * 32, v89->field_0 != 0x8000000000000000))
            {
                sub_c73c64(&g_ef99a8);
                __debugbreak();
            }
            v11 = v89;
            if (v11->padding_10)
            {
                j = v11->field_8;
                v14 = (unsigned long long)(j + 264 * v11->padding_10);
                do
                {
                    sub_bbaca4(&v24, j);
                    v91 = *(unsigned long long *)((void*)&v24 + 8);
                    v17 = v24;
                    v92 = v91 + (unsigned long long)v25 * 8;
                    if (!v85)
                    {
                        for (iter2 = v91; iter2 != v92; *v95 = *(long long *)((char *)v113 - 8))
                        {
                            v95 = *(long long *)iter2;
                            iter2 += 8;
                            if (1)
                                continue;
                            v96 = 0;
                            v97 = 5871781006564002453 * (*v95 + 8);
                            v98 = v97 >> 57 & 0xff | (v97 >> 57 & 0xff) * 0x100 | (v97 >> 57 & 0xff | (v97 >> 57 & 0xff) * 0x100) * 0x10000 | (v97 >> 57 & 0xff | (v97 >> 57 & 0xff) * 0x100 | (v97 >> 57 & 0xff | (v97 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                            v99 = v97 & v87;
                            v100 = *(long long *)((char *)v86 + v99);
                            v102 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v100, v98));
                            v103 = v102 & 0x8080808080808080;
                            if (!(v102 & 0x8080808080808080))
                            {
                                do
                                {
LABEL_bb9e88:
                                    v104 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v100, _mm_set1_epi8(-1)));
                                    if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v104, v104), _mm_unpacklo_epi64(v104, v104)))))))))) & 1)
                                        goto LABEL_0xbb9e1c;
                                    v96 += 8;
                                    v99 = v99 + v96 & v87;
                                    v100 = *(long long *)((char *)v86 + v99);
                                    v107 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v100, v98));
                                    v103 = v107 & 0x8080808080808080;
                                } while (!(v107 & 0x8080808080808080));
                            }
                            while (1)
                            {
                                v108 = v103;
                                v109 = ((((((v108 & 0xaaaaaaaaaaaaaaaa) >> 1 | v108 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v108 & 0xaaaaaaaaaaaaaaaa) >> 1 | v108 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v108 & 0xaaaaaaaaaaaaaaaa) >> 1 | v108 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v108 & 0xaaaaaaaaaaaaaaaa) >> 1 | v108 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v110 = (((((((v108 & 0xaaaaaaaaaaaaaaaa) >> 1 | v108 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v108 & 0xaaaaaaaaaaaaaaaa) >> 1 | v108 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v108 & 0xaaaaaaaaaaaaaaaa) >> 1 | v108 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v108 & 0xaaaaaaaaaaaaaaaa) >> 1 | v108 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v111 = ((((v110 | v109) & 0xffff0000ffff0000) >> 16 | (v110 | v109) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v110 | v109) & 0xffff0000ffff0000) >> 16 | (v110 | v109) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                if (!v111)
                                    v112 = 64;
                                else
                                    v112 = Clz(v111);
                                v113 = &v86[-2 * (v99 + (v112 >> 3) & v87)];
                                if (*v95 == *(long long *)((char *)v113 - 16))
                                    break;
                                v114 = v108 - 1;
                                v103 = v114 & v108;
                                if (!(v114 & v108))
                                    goto LABEL_bb9e88;
                            }
                            do
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                            } while (/* unsupported instruction */ ^ 1);
                            if ((long long)/* unsupported instruction */ < 0)
                                goto LABEL_bbab50;
                            do
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                            } while (/* unsupported instruction */ ^ 1);
                            v115 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                            if (!(v115 & 1))
                            {
                                /* unsupported instruction */;
                                sub_b86a90(*v95);
                            }
                        }
                    }
                    else
                    {
                        for (iter1 = v91; iter1 != v92; *v116 = v138)
                        {
                            v116 = *(long long *)iter1;
                            iter1 += 8;
                            if (!v85)
                                continue;
                            v117 = 0;
                            v118 = 5871781006564002453 * (*v116 + 8);
                            v119 = v118 >> 57 & 0xff | (v118 >> 57 & 0xff) * 0x100 | (v118 >> 57 & 0xff | (v118 >> 57 & 0xff) * 0x100) * 0x10000 | (v118 >> 57 & 0xff | (v118 >> 57 & 0xff) * 0x100 | (v118 >> 57 & 0xff | (v118 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                            v120 = v118 & v87;
                            v121 = *(long long *)((char *)v86 + v120);
                            v123 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v121, v119));
                            v124 = v123 & 0x8080808080808080;
                            if (!(v123 & 0x8080808080808080))
                            {
                                do
                                {
LABEL_bb9d14:
                                    v125 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v121, _mm_set1_epi8(-1)));
                                    if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v125, v125), _mm_unpacklo_epi64(v125, v125)))))))))) & 1)
                                        goto LABEL_0xbb9ca8;
                                    v117 += 8;
                                    v120 = v120 + v117 & v87;
                                    v121 = *(long long *)((char *)v86 + v120);
                                    v128 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v121, v119));
                                    v124 = v128 & 0x8080808080808080;
                                } while (!(v128 & 0x8080808080808080));
                            }
                            while (1)
                            {
                                v129 = v124;
                                v130 = ((((((v129 & 0xaaaaaaaaaaaaaaaa) >> 1 | v129 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v129 & 0xaaaaaaaaaaaaaaaa) >> 1 | v129 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v129 & 0xaaaaaaaaaaaaaaaa) >> 1 | v129 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v129 & 0xaaaaaaaaaaaaaaaa) >> 1 | v129 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v131 = (((((((v129 & 0xaaaaaaaaaaaaaaaa) >> 1 | v129 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v129 & 0xaaaaaaaaaaaaaaaa) >> 1 | v129 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v129 & 0xaaaaaaaaaaaaaaaa) >> 1 | v129 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v129 & 0xaaaaaaaaaaaaaaaa) >> 1 | v129 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v132 = ((((v131 | v130) & 0xffff0000ffff0000) >> 16 | (v131 | v130) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v131 | v130) & 0xffff0000ffff0000) >> 16 | (v131 | v130) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                if (!v132)
                                    v133 = 64;
                                else
                                    v133 = Clz(v132);
                                v134 = v120 + (v133 >> 3) & v87;
                                if (*v116 == *(long long *)((char *)&v86[-2 * v134] - 16))
                                {
                                    v136 = -v134;
                                    break;
                                }
                                v135 = v129 - 1;
                                v124 = v135 & v129;
                                if (!(v135 & v129))
                                    goto LABEL_bb9d14;
                            }
LABEL_bb9dbc:
                            v137 = 0;
                            v138 = *(long long *)((char *)&v86[2 * v136] - 8);
                            v139 = 5871781006564002453 * (v138 + 8);
                            v140 = v139;
                            while (1)
                            {
                                v141 = v140 & v87;
                                v142 = *(long long *)((char *)v86 + v141);
                                v144 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v142, (uint128_t)(v139 >> 57 & 0xff | (v139 >> 57 & 0xff) * 0x100 | (v139 >> 57 & 0xff | (v139 >> 57 & 0xff) * 0x100) * 0x10000 | (v139 >> 57 & 0xff | (v139 >> 57 & 0xff) * 0x100 | (v139 >> 57 & 0xff | (v139 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000)));
                                v145 = v144 & 0x8080808080808080;
                                if (v144 & 0x8080808080808080)
                                {
                                    do
                                    {
                                        v146 = v145;
                                        v147 = ((((((v146 & 0xaaaaaaaaaaaaaaaa) >> 1 | v146 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v146 & 0xaaaaaaaaaaaaaaaa) >> 1 | v146 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v146 & 0xaaaaaaaaaaaaaaaa) >> 1 | v146 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v146 & 0xaaaaaaaaaaaaaaaa) >> 1 | v146 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                        v148 = (((((((v146 & 0xaaaaaaaaaaaaaaaa) >> 1 | v146 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v146 & 0xaaaaaaaaaaaaaaaa) >> 1 | v146 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v146 & 0xaaaaaaaaaaaaaaaa) >> 1 | v146 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v146 & 0xaaaaaaaaaaaaaaaa) >> 1 | v146 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                        v149 = ((((v148 | v147) & 0xffff0000ffff0000) >> 16 | (v148 | v147) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v148 | v147) & 0xffff0000ffff0000) >> 16 | (v148 | v147) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                        if (!v149)
                                            v150 = 64;
                                        else
                                            v150 = Clz(v149);
                                        v151 = v141 + (v150 >> 3) & v87;
                                        if (v138 == *(long long *)((char *)&v86[-2 * v151] - 16))
                                        {
                                            v136 = -v151;
                                            goto LABEL_bb9dbc;
                                        }
                                    } while ((v152 = v146 - 1, v145 = v152 & v146, v152 & v146));
                                }
                                v153 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v142, _mm_set1_epi8(-1)));
                                if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v153, v153), _mm_unpacklo_epi64(v153, v153)))))))))) & 1)
                                    break;
                                v137 += 8;
                                v140 = v141 + v137;
                            }
                            do
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                            } while (/* unsupported instruction */ ^ 1);
                            if ((long long)/* unsupported instruction */ < 0)
                                goto LABEL_bbab50;
                            do
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                            } while (/* unsupported instruction */ ^ 1);
                            v155 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                            if (!(v155 & 1))
                            {
                                /* unsupported instruction */;
                                sub_b86a90(*v116);
                            }
                        }
                    }
                    if (v17)
                        _free(v91);
                    v24 = g_efc958;
                    v25 = g_efc968;
                    sub_bbadb8(&v21, j);
                    v156 = v22;
                    v17 = v21;
                    v157 = &v156[v23];
                    if (!v85)
                    {
                        for (node = v156; node != v157; *v160 = *(long long *)((char *)v178 - 8))
                        {
                            v160 = *node;
                            node += 1;
                            if (1)
                                continue;
                            v161 = 0;
                            v162 = 5871781006564002453 * (*v160 + 8);
                            v163 = v162 >> 57 & 0xff | (v162 >> 57 & 0xff) * 0x100 | (v162 >> 57 & 0xff | (v162 >> 57 & 0xff) * 0x100) * 0x10000 | (v162 >> 57 & 0xff | (v162 >> 57 & 0xff) * 0x100 | (v162 >> 57 & 0xff | (v162 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                            v164 = v162 & v87;
                            v165 = *(long long *)((char *)v86 + v164);
                            v167 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v165, v163));
                            v168 = v167 & 0x8080808080808080;
                            if (!(v167 & 0x8080808080808080))
                            {
                                do
                                {
LABEL_bba188:
                                    v169 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v165, _mm_set1_epi8(-1)));
                                    if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v169, v169), _mm_unpacklo_epi64(v169, v169)))))))))) & 1)
                                        goto LABEL_0xbba11c;
                                    v161 += 8;
                                    v164 = v164 + v161 & v87;
                                    v165 = *(long long *)((char *)v86 + v164);
                                    v172 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v165, v163));
                                    v168 = v172 & 0x8080808080808080;
                                } while (!(v172 & 0x8080808080808080));
                            }
                            while (1)
                            {
                                v173 = v168;
                                v174 = ((((((v173 & 0xaaaaaaaaaaaaaaaa) >> 1 | v173 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v173 & 0xaaaaaaaaaaaaaaaa) >> 1 | v173 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v173 & 0xaaaaaaaaaaaaaaaa) >> 1 | v173 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v173 & 0xaaaaaaaaaaaaaaaa) >> 1 | v173 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v175 = (((((((v173 & 0xaaaaaaaaaaaaaaaa) >> 1 | v173 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v173 & 0xaaaaaaaaaaaaaaaa) >> 1 | v173 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v173 & 0xaaaaaaaaaaaaaaaa) >> 1 | v173 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v173 & 0xaaaaaaaaaaaaaaaa) >> 1 | v173 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v176 = ((((v175 | v174) & 0xffff0000ffff0000) >> 16 | (v175 | v174) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v175 | v174) & 0xffff0000ffff0000) >> 16 | (v175 | v174) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                if (!v176)
                                    v177 = 64;
                                else
                                    v177 = Clz(v176);
                                v178 = &v86[-2 * (v164 + (v177 >> 3) & v87)];
                                if (*v160 == *(long long *)((char *)v178 - 16))
                                    break;
                                v179 = v173 - 1;
                                v168 = v179 & v173;
                                if (!(v179 & v173))
                                    goto LABEL_bba188;
                            }
                            do
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                            } while (/* unsupported instruction */ ^ 1);
                            if ((long long)/* unsupported instruction */ < 0)
                                goto LABEL_bbab50;
                            do
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                            } while (/* unsupported instruction */ ^ 1);
                            if ((long long)/* unsupported instruction */ < 0)
                                goto LABEL_bbab50;
                            if (sub_bafae4(&v24))
                            {
                                do
                                {
                                    /* unsupported instruction */;
                                    /* unsupported instruction */;
                                    /* unsupported instruction */;
                                } while (/* unsupported instruction */ ^ 1);
                                v180 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                                if (!(v180 & 1))
                                {
                                    /* unsupported instruction */;
                                    sub_b86a90();
                                }
                            }
                            do
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                            } while (/* unsupported instruction */ ^ 1);
                            if ((long long)/* unsupported instruction */ < 0)
                                goto LABEL_bbab50;
                            do
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                            } while (/* unsupported instruction */ ^ 1);
                            v181 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                            if (!(v181 & 1))
                            {
                                /* unsupported instruction */;
                                sub_b86a90(*v160);
                            }
                        }
                    }
                    else
                    {
                        for (iter = v156; iter != v157; *v182 = *(long long *)((char *)v204 - 8))
                        {
                            v182 = *iter;
                            iter += 1;
                            if (!v85)
                                continue;
                            v183 = 0;
                            v184 = 5871781006564002453 * (*v182 + 8);
                            v185 = v184 >> 57 & 0xff | (v184 >> 57 & 0xff) * 0x100 | (v184 >> 57 & 0xff | (v184 >> 57 & 0xff) * 0x100) * 0x10000 | (v184 >> 57 & 0xff | (v184 >> 57 & 0xff) * 0x100 | (v184 >> 57 & 0xff | (v184 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                            v186 = v184 & v87;
                            v187 = *(long long *)((char *)v86 + v186);
                            v189 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v187, v185));
                            v190 = v189 & 0x8080808080808080;
                            if (!(v189 & 0x8080808080808080))
                            {
                                do
                                {
LABEL_bb9fbc:
                                    v191 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v187, _mm_set1_epi8(-1)));
                                    if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v191, v191), _mm_unpacklo_epi64(v191, v191)))))))))) & 1)
                                        goto LABEL_0xbb9f50;
                                    v183 += 8;
                                    v186 = v186 + v183 & v87;
                                    v187 = *(long long *)((char *)v86 + v186);
                                    v194 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v187, v185));
                                    v190 = v194 & 0x8080808080808080;
                                } while (!(v194 & 0x8080808080808080));
                            }
                            while (1)
                            {
                                v195 = v190;
                                v196 = ((((((v195 & 0xaaaaaaaaaaaaaaaa) >> 1 | v195 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v195 & 0xaaaaaaaaaaaaaaaa) >> 1 | v195 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v195 & 0xaaaaaaaaaaaaaaaa) >> 1 | v195 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v195 & 0xaaaaaaaaaaaaaaaa) >> 1 | v195 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v197 = (((((((v195 & 0xaaaaaaaaaaaaaaaa) >> 1 | v195 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v195 & 0xaaaaaaaaaaaaaaaa) >> 1 | v195 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v195 & 0xaaaaaaaaaaaaaaaa) >> 1 | v195 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v195 & 0xaaaaaaaaaaaaaaaa) >> 1 | v195 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v198 = ((((v197 | v196) & 0xffff0000ffff0000) >> 16 | (v197 | v196) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v197 | v196) & 0xffff0000ffff0000) >> 16 | (v197 | v196) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                if (!v198)
                                    v199 = 64;
                                else
                                    v199 = Clz(v198);
                                v200 = v186 + (v199 >> 3) & v87;
                                if (*v182 == *(long long *)((char *)&v86[-2 * v200] - 16))
                                {
                                    v202 = -v200;
                                    break;
                                }
                                v201 = v195 - 1;
                                v190 = v201 & v195;
                                if (!(v201 & v195))
                                    goto LABEL_bb9fbc;
                            }
LABEL_bba064:
                            v203 = 0;
                            v204 = &v86[2 * v202];
                            v205 = 5871781006564002453 * (*(long long *)((char *)v204 - 8) + 8);
                            v206 = v205;
                            while (1)
                            {
                                v207 = v206 & v87;
                                v208 = *(long long *)((char *)v86 + v207);
                                v210 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v208, (uint128_t)(v205 >> 57 & 0xff | (v205 >> 57 & 0xff) * 0x100 | (v205 >> 57 & 0xff | (v205 >> 57 & 0xff) * 0x100) * 0x10000 | (v205 >> 57 & 0xff | (v205 >> 57 & 0xff) * 0x100 | (v205 >> 57 & 0xff | (v205 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000)));
                                v211 = v210 & 0x8080808080808080;
                                if (v210 & 0x8080808080808080)
                                {
                                    do
                                    {
                                        v212 = v211;
                                        v213 = ((((((v212 & 0xaaaaaaaaaaaaaaaa) >> 1 | v212 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v212 & 0xaaaaaaaaaaaaaaaa) >> 1 | v212 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v212 & 0xaaaaaaaaaaaaaaaa) >> 1 | v212 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v212 & 0xaaaaaaaaaaaaaaaa) >> 1 | v212 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                        v214 = (((((((v212 & 0xaaaaaaaaaaaaaaaa) >> 1 | v212 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v212 & 0xaaaaaaaaaaaaaaaa) >> 1 | v212 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v212 & 0xaaaaaaaaaaaaaaaa) >> 1 | v212 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v212 & 0xaaaaaaaaaaaaaaaa) >> 1 | v212 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                        v215 = ((((v214 | v213) & 0xffff0000ffff0000) >> 16 | (v214 | v213) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v214 | v213) & 0xffff0000ffff0000) >> 16 | (v214 | v213) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                        if (!v215)
                                            v216 = 64;
                                        else
                                            v216 = Clz(v215);
                                        v217 = v207 + (v216 >> 3) & v87;
                                        if (*(long long *)((char *)v204 - 8) == *(long long *)((char *)&v86[-2 * v217] - 16))
                                        {
                                            v202 = -v217;
                                            goto LABEL_bba064;
                                        }
                                    } while ((v218 = v212 - 1, v211 = v218 & v212, v218 & v212));
                                }
                                v219 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v208, _mm_set1_epi8(-1)));
                                if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v219, v219), _mm_unpacklo_epi64(v219, v219)))))))))) & 1)
                                    break;
                                v203 += 8;
                                v206 = v207 + v203;
                            }
                            do
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                            } while (/* unsupported instruction */ ^ 1);
                            if ((long long)/* unsupported instruction */ < 0)
                                goto LABEL_bbab50;
                            do
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                            } while (/* unsupported instruction */ ^ 1);
                            if ((long long)/* unsupported instruction */ < 0)
                                goto LABEL_bbab50;
                            if (sub_bafae4(&v24))
                            {
                                do
                                {
                                    /* unsupported instruction */;
                                    /* unsupported instruction */;
                                    /* unsupported instruction */;
                                } while (/* unsupported instruction */ ^ 1);
                                v221 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                                if (!(v221 & 1))
                                {
                                    /* unsupported instruction */;
                                    sub_b86a90();
                                }
                            }
                            do
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                            } while (/* unsupported instruction */ ^ 1);
                            if ((long long)/* unsupported instruction */ < 0)
                                goto LABEL_bbab50;
                            do
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                            } while (/* unsupported instruction */ ^ 1);
                            v222 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                            if (!(v222 & 1))
                            {
                                /* unsupported instruction */;
                                sub_b86a90(*v182);
                            }
                        }
                    }
                    if (v17)
                        _free(v156);
                    sub_b98884(&v24);
                    j += 264;
                } while (j != v14);
            }
            if (v11->field_0 == 0x8000000000000000)
            {
                v223 = 0xffffffff;
                if (v13 <= 0xffffffff)
                    goto LABEL_bb9c1c;
            }
            else
            {
                v223 = v11->field_18;
                if (v13 <= v223)
                    goto LABEL_bb9c1c;
            }
            v224 = v12 + (unsigned int)v223 * 48;
            if (v224->field_0 != 0x8000000000000000)
                break;
LABEL_bb9c1c:
            v84 = v8;
            if (v84 == v5)
                goto LABEL_bbab54;
        }
        v225 = v224->field_20;
        ptr = _malloc(16);
        if (!ptr)
        {
            sub_c6b970(4, 16);
            __debugbreak();
        }
        *(unsigned int *)ptr = v223;
        idx = 1;
        v24 = CONCAT(ptr, 4);
        while (1)
        {
            *(unsigned long long *)&v25 = idx;
            if (v13 <= v225 || !(v228 = v12 + 48 * v225, v228->field_0 != 0x8000000000000000))
                break;
            v229 = v228->field_20;
            if (idx == (unsigned long long)v24)
            {
                sub_c736c8(&v24, idx, 1, 4, 4);
                ptr = *(unsigned long long *)((void*)&v24 + 8);
            }
            *(unsigned int *)(ptr + idx * 4) = v225;
            idx += 1;
            v225 = v229;
        }
        v230 = *(unsigned long long *)((void*)&v24 + 8);
        v0 = v230;
        v1 = v24;
        v2 = v230 + idx * 4;
        v231 = v3;
        v16 = v15;
        while (1)
        {
            v232 = v230;
            v233 = *(int *)v232;
            v4 = v232 + 4;
            if (v13 <= v233 || !(v234 = v12 + (unsigned int)v233 * 48, v234->field_0 != 0x8000000000000000))
            {
                sub_c73c64(&g_ef99c0);
                __debugbreak();
            }
            v235 = v234->field_8;
            v11 = &v235[9 * v234->field_10];
            v236 = 1;
            while (1)
            {
LABEL_bba3b8:
                v14 = v235;
                v17 = v16 + 1;
                if (!(v236 & 1) && v231 != 2)
                {
                    v21 = g_efc958;
                    v23 = g_efc968;
                    goto *((void *)(sub_bba408 + *(char *)(*v16 + 14705924) * 4));
                }
                v237 = v14;
                if (v237 == v11)
                    break;
                v236 = 0;
                v235 = v237 + 9;
                v16 = v237 + 1;
                v231 = 1;
                if (v85)
                {
                    v238 = 0;
                    v239 = 5871781006564002453 * (*v237 + 8);
                    v240 = v239 >> 57 & 0xff | (v239 >> 57 & 0xff) * 0x100 | (v239 >> 57 & 0xff | (v239 >> 57 & 0xff) * 0x100) * 0x10000 | (v239 >> 57 & 0xff | (v239 >> 57 & 0xff) * 0x100 | (v239 >> 57 & 0xff | (v239 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                    v241 = v239 & v87;
                    v242 = *(long long *)((char *)v86 + v241);
                    v244 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v242, v240));
                    v245 = v244 & 0x8080808080808080;
                    if (!(v244 & 0x8080808080808080))
                    {
                        do
                        {
LABEL_bbaa08:
                            v246 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v242, _mm_set1_epi8(-1)));
                            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v246, v246), _mm_unpacklo_epi64(v246, v246)))))))))) & 1)
                            {
                                v236 = 0;
                                v231 = 1;
                                goto LABEL_bba3b8;
                            }
                            v238 += 8;
                            v241 = v241 + v238 & v87;
                            v242 = *(long long *)((char *)v86 + v241);
                            v249 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v242, v240));
                            v245 = v249 & 0x8080808080808080;
                        } while (!(v249 & 0x8080808080808080));
                    }
                    while (1)
                    {
                        v250 = v245;
                        v251 = ((((((v250 & 0xaaaaaaaaaaaaaaaa) >> 1 | v250 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v250 & 0xaaaaaaaaaaaaaaaa) >> 1 | v250 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v250 & 0xaaaaaaaaaaaaaaaa) >> 1 | v250 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v250 & 0xaaaaaaaaaaaaaaaa) >> 1 | v250 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v252 = (((((((v250 & 0xaaaaaaaaaaaaaaaa) >> 1 | v250 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v250 & 0xaaaaaaaaaaaaaaaa) >> 1 | v250 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v250 & 0xaaaaaaaaaaaaaaaa) >> 1 | v250 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v250 & 0xaaaaaaaaaaaaaaaa) >> 1 | v250 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v253 = ((((v252 | v251) & 0xffff0000ffff0000) >> 16 | (v252 | v251) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v252 | v251) & 0xffff0000ffff0000) >> 16 | (v252 | v251) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        if (!v253)
                            v254 = 64;
                        else
                            v254 = Clz(v253);
                        v255 = &v86[-2 * (v241 + (v254 >> 3) & v87)];
                        if (*v237 == *(long long *)((char *)v255 - 16))
                            break;
                        v256 = v250 - 1;
                        v245 = v256 & v250;
                        if (!(v256 & v250))
                            goto LABEL_bbaa08;
                    }
                    v257 = (char *)v255 - 8;
                    if (v85)
                    {
LABEL_bbab08:
                        v258 = 0;
                        v259 = 5871781006564002453 * (*(long long *)v257 + 8);
                        v260 = v259;
                        while (1)
                        {
                            v261 = v260 & v87;
                            v262 = *(long long *)((char *)v86 + v261);
                            v264 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v262, (uint128_t)(v259 >> 57 & 0xff | (v259 >> 57 & 0xff) * 0x100 | (v259 >> 57 & 0xff | (v259 >> 57 & 0xff) * 0x100) * 0x10000 | (v259 >> 57 & 0xff | (v259 >> 57 & 0xff) * 0x100 | (v259 >> 57 & 0xff | (v259 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000)));
                            v265 = v264 & 0x8080808080808080;
                            if (v264 & 0x8080808080808080)
                            {
                                do
                                {
                                    v266 = v265;
                                    v267 = ((((((v266 & 0xaaaaaaaaaaaaaaaa) >> 1 | v266 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v266 & 0xaaaaaaaaaaaaaaaa) >> 1 | v266 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v266 & 0xaaaaaaaaaaaaaaaa) >> 1 | v266 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v266 & 0xaaaaaaaaaaaaaaaa) >> 1 | v266 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                    v268 = (((((((v266 & 0xaaaaaaaaaaaaaaaa) >> 1 | v266 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v266 & 0xaaaaaaaaaaaaaaaa) >> 1 | v266 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v266 & 0xaaaaaaaaaaaaaaaa) >> 1 | v266 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v266 & 0xaaaaaaaaaaaaaaaa) >> 1 | v266 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                    v269 = ((((v268 | v267) & 0xffff0000ffff0000) >> 16 | (v268 | v267) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v268 | v267) & 0xffff0000ffff0000) >> 16 | (v268 | v267) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                    if (!v269)
                                        v270 = 64;
                                    else
                                        v270 = Clz(v269);
                                    v271 = &v86[-2 * (v261 + (v270 >> 3) & v87)];
                                    if (*(long long *)v257 == *(long long *)((char *)v271 - 16))
                                    {
                                        v257 = (char *)v271 - 8;
                                        goto LABEL_bbab08;
                                    }
                                } while ((v272 = v266 - 1, v265 = v272 & v266, v272 & v266));
                            }
                            v273 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v262, _mm_set1_epi8(-1)));
                            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v273, v273), _mm_unpacklo_epi64(v273, v273)))))))))) & 1)
                                break;
                            v258 += 8;
                            v260 = v261 + v258;
                        }
                    }
                    do
                    {
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    if ((long long)/* unsupported instruction */ >= 0)
                    {
                        do
                        {
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                        } while (/* unsupported instruction */ ^ 1);
                        v275 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                        if (!(v275 & 1))
                        {
                            /* unsupported instruction */;
                            sub_b86a90(*v14);
                        }
                        v236 = 0;
                        *v14 = *(long long *)v257;
                        v231 = 1;
                    }
                    else
                    {
LABEL_bbab50:
                        sub_c769bc();
                        goto LABEL_bbab54;
                    }
                }
            }
            v230 = v4;
            if (v4 == v2)
            {
                if (v1)
                {
                    v4 = v231;
                    _free(v0);
                    goto LABEL_bb9c1c;
                }
                else
                {
                    v4 = v231;
                    goto LABEL_bb9c1c;
                }
            }
        }
    }
LABEL_bbab54:
    if (v6)
        _free(v7);
    return sub_b98884(a1);
}
