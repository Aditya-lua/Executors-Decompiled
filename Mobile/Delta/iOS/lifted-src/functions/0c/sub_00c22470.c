/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc22470..0xc231f0 (3456 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c22470_0 {
    char padding_0[24];
    char field_18;
    char padding_19[7];
    long long field_20;
    long long field_28;
    char padding_30[8];
    unsigned long long field_38;
    char padding_40[60];
    unsigned int field_7c;
    char padding_80[16];
    struct st_c22470_1 *field_90;
    unsigned long long field_98;
} st_c22470_0;

typedef struct st_c22470_9 {
    unsigned long long field_0;
    char padding_8[16];
    unsigned int field_18;
} st_c22470_9;

typedef struct st_c22470_3 {
    char padding_0[24];
    unsigned long long field_18;
} st_c22470_3;

typedef struct st_c22470_7 {
    unsigned long long field_0;
    char padding_8[20];
    unsigned int field_1c;
} st_c22470_7;

typedef struct st_c22470_4 {
    unsigned long long field_0;
    struct st_c22470_3 *field_8;
    char padding_10[8];
    double field_18;
} st_c22470_4;

typedef struct st_c22470_6 {
    unsigned long long field_0;
    struct st_c22470_3 *field_8;
    char padding_10[12];
    unsigned int field_1c;
} st_c22470_6;

typedef struct st_c22470_5 {
    unsigned long long field_0;
    struct st_c22470_3 *field_8;
    unsigned long long field_10;
    double field_18;
    unsigned int field_1c;
} st_c22470_5;

typedef struct st_c22470_10 {
    unsigned long long field_0;
    char padding_8[28];
    unsigned int field_24;
} st_c22470_10;

typedef struct st_c22470_1 {
    unsigned long long field_0;
} st_c22470_1;

extern long long g_efbb78;
extern long long g_efbf80;
extern long long g_efbf98;
extern long long g_efbfb0;
extern long long g_efbfe0;
extern long long g_efbff8;
extern long long g_efc040;
extern long long g_efc058;
extern long long g_efc070;
extern long long g_efc118;
extern long long g_efc7d0;

double sub_c22470(st_c22470_0 *a0, unsigned long long a1, unsigned int a2, unsigned long long a3)
{
    unsigned long long v37;  // x25
    st_c22470_4 *v38;  // x8
    unsigned long long v47;  // x20
    unsigned long long v140;  // x22
    st_c22470_6 *v141;  // x8
    unsigned long long v142;  // x9
    unsigned long v143;  // cc_dep2
    st_c22470_3 *v144;  // x9
    unsigned int v145;  // x11
    st_c22470_3 *v146;  // x12
    __m128i v48;  // q0
    unsigned long long v147;  // 4112
    unsigned long long v148;  // 4102
    unsigned long long v149;  // 4112
    unsigned long long v150;  // 4102
    unsigned int v151;  // x11
    unsigned long long v152;  // x14
    unsigned long long *v153;  // x13
    unsigned long long v154;  // x12
    __m128i v155;  // q0
    unsigned long long v156;  // x14
    unsigned int v49;  // x22
    __m128i v157;  // q2
    unsigned long v159;  // x15
    unsigned long long v160;  // x15
    __m128i v161;  // q2
    unsigned long v164;  // x15
    unsigned long long v165;  // x15
    unsigned long long v166;  // 4128
    long long v50;  // x22
    unsigned long long v167;  // 4130
    unsigned int v168;  // x16
    unsigned long long v169;  // x16
    unsigned long long v170;  // x16
    unsigned long long v171;  // x9
    unsigned long v172;  // x10
    unsigned long v173;  // cc_dep1
    unsigned long v174;  // x9
    unsigned long long v175;  // 4110
    unsigned long long v176;  // 4102
    long long v51;  // x23
    unsigned long long v177;  // 4110
    unsigned long long v178;  // 4102
    unsigned int ptr;  // x21
    unsigned int i;  // x25
    unsigned long long v181;  // x8
    st_c22470_9 *v182;  // x8
    unsigned int v183;  // w8
    unsigned long long v184;  // x23
    st_c22470_7 *v185;  // x8
    unsigned int v186;  // w20
    st_c22470_5 *v52;  // x10
    unsigned long long v187;  // x8
    unsigned long v188;  // x22
    st_c22470_10 *v189;  // x8
    unsigned long long v190;  // x25
    unsigned int ptr1;  // x0
    long long v192;  // x26
    unsigned int idx;  // x21
    st_c22470_10 *v194;  // x8
    unsigned long v195;  // x27
    unsigned int v196;  // x21
    unsigned long long v53;  // x8
    long long l;  // x24
    unsigned int v198;  // x26
    long long v199;  // x24
    unsigned long v200;  // x26
    unsigned int v201;  // x22
    unsigned int v202;  // x23
    unsigned int v203;  // x23
    __m128i v204;  // q0
    unsigned long v54;  // cc_dep2
    unsigned int v55;  // w1
    st_c22470_3 *v56;  // x9
    unsigned long long v39;  // x9
    unsigned int v57;  // x8
    st_c22470_3 *v58;  // x9
    unsigned long long v59;  // 4112
    unsigned long long v60;  // 4102
    unsigned long long v61;  // 4112
    unsigned long long v62;  // 4102
    unsigned int v63;  // x8
    unsigned long long v64;  // x12
    unsigned long long *v65;  // x11
    unsigned long long v66;  // x9
    unsigned long v40;  // x10
    unsigned long long v67;  // x12
    __m128i v68;  // q2
    unsigned long v70;  // x13
    unsigned long long v71;  // x13
    __m128i v72;  // q2
    unsigned long v75;  // x13
    unsigned long long v76;  // x13
    unsigned long v41;  // cc_dep1
    unsigned long long v77;  // 4128
    unsigned long long v78;  // 4130
    unsigned int v79;  // x14
    unsigned long long v80;  // x14
    unsigned long long v81;  // x14
    unsigned int *v82;  // x22
    unsigned int v83;  // x25
    unsigned int *v84;  // x27
    unsigned long v85;  // x23
    unsigned int *v86;  // x27
    unsigned long v42;  // x9
    unsigned long long v87;  // x26
    st_c22470_7 *v88;  // x8
    unsigned long long v89;  // x11
    unsigned int iter;  // x12
    unsigned long v91;  // x8
    unsigned long long j;  // x9
    unsigned long long k;  // x13
    unsigned int *v94;  // x15
    unsigned long long v95;  // 4127
    unsigned long long v96;  // x12
    unsigned long long v43;  // 4110
    unsigned long long v44;  // 4102
    unsigned long long v45;  // 4110
    unsigned long long v46;  // 4102
    unsigned int v0;  // [bp-0x1d0]
    unsigned int v1;  // [bp-0x1c8]
    unsigned long v2;  // [bp-0x1c0]
    unsigned long long v3;  // [bp-0x1b8]
    unsigned int *v4;  // [bp-0x1b0]
    unsigned int v5;  // [bp-0x1a8]
    __m128i v6;  // [bp-0x1a0]
    uint128_t v7;  // [bp-0x190]
    unsigned long v18;  // [bp-0x100]
    unsigned long long v19;  // [bp-0xf8]
    unsigned int v20;  // [bp-0xf0]
    unsigned int v21;  // [bp-0xec]
    unsigned int v22;  // [bp-0xe8]
    unsigned long v23;  // [bp-0xe0]
    unsigned long long v24;  // [bp-0xd8]
    unsigned int v25;  // [bp-0xd0]
    unsigned int *v26;  // [bp-0xcc]
    uint128_t v27;  // [bp-0xc0], Other Possible Types: char
    unsigned long v28;  // [bp-0xb8]
    uint128_t v29;  // [bp-0xb0], Other Possible Types: unsigned int
    uint128_t v30;  // [bp-0x98]
    uint128_t v32;  // [bp-0x88], Other Possible Types: uint128_t
    unsigned int v34;  // [bp-0x78]
    char *v35;  // [bp-0x10]
    char v36;  // [bp+0x0]

    v35 = &v36;
    if (a2 == 1)
    {
        if ((unsigned int)a1 != (unsigned int)a3)
        {
            v37 = a1 & 0xffffffff;
            if ((unsigned long long)a0->field_28 <= v37 || (v38 = a0->field_20 + v37 * 32, v38->field_0 == 0x8000000000000000))
                goto LABEL_c2307c;
            if (v38->padding_10)
            {
                v39 = v38->field_8->field_18;
                v40 = v39 - 12;
                v41 = v39;
                v42 = 9;
                if (11 >= v39)
                    v40 = v42;
                if (v40 != 10)
                {
                    v43 = arm64g_calculate_condition(20, v41, 11, 0);
                    v44 = arm64g_calculate_condition(4, (v43 & 1 ? v40 : 0x40000000), (v43 & 1 ? 13 : 0), 0);
                    if (!(v44 & 1))
                        goto LABEL_c22500;
                }
                else
                {
                    v45 = arm64g_calculate_condition(20, v41, 11, 0);
                    v46 = arm64g_calculate_condition(0, (v45 & 1 ? 10 : 0x40000000), (v45 & 1 ? 13 : 0), 0);
                    if (!(v46 & 1))
                        goto LABEL_c22500;
                }
            }
            else
            {
LABEL_c22500:
                v47 = a1;
                v34 = a1;
                *(unsigned long long *)((char *)&v30 + 8) = a0->field_38;
                *(long long *)&v32 = *(long long *)&a0->padding_40[0];
                v48 = *(unsigned long long *)&v38->field_18;
                *(long long *)((char *)&v32 + 8) = _mm_cvtsi128_si64(v48);
                *(unsigned long long *)&v30 = 0;
                sub_b9b9f0(&v27, &v30);
                if (v29 == 1)
                {
                    v49 = !*(long long *)v28;
                    if (v27)
                        goto LABEL_c22750;
                }
                else
                {
                    v49 = 1;
                    if (v27)
                    {
LABEL_c22750:
                        _free(v28);
                    }
                }
                if (!(v49 & 1))
                {
                    v50 = a0->field_28;
                    if ((unsigned long long)v50 > v37 && !(v51 = a0->field_20, v52 = v51 + v37 * 32, v53 = v52->field_0, v54 = 0x8000000000000000, v52->field_0 == 0x8000000000000000))
                    {
                        v55 = v47;
                        v56 = v52->field_8;
                        v57 = v52->field_10 * 264;
                        while (1)
                        {
                            v58 = v56;
                            if (v57)
                            {
                                v53 = v58->field_18;
                                v56 = &v58[8].padding_0[8];
                                v57 -= 264;
                                v54 = 32;
                                if (v58->field_18 != 32)
                                    break;
                            }
                            else
                            {
                                if (*(int *)&a0->padding_40[56] == 1)
                                {
                                    v59 = arm64g_calculate_condition(4, v53, v54, 0);
                                    v60 = arm64g_calculate_condition(3, (v59 & 1 ? a0->field_7c : 0), (v59 & 1 ? v55 : 0), 0);
                                    if (v60 & 1)
                                        break;
                                }
                                else
                                {
                                    v61 = arm64g_calculate_condition(4, v53, v54, 0);
                                    v62 = arm64g_calculate_condition(0, (v61 & 1 ? a0->field_7c : 0), (v61 & 1 ? v55 : 0), 0);
                                    if (v62 & 1)
                                        break;
                                }
                                if (*(long long *)&a0[1].padding_0[8])
                                {
                                    v63 = 0;
                                    v64 = 5871781006564002453 * v37;
                                    v65 = a0->field_90;
                                    v66 = a0->field_98;
                                    v48 = v64 >> 57 & 0xff | (v64 >> 57 & 0xff) * 0x100 | (v64 >> 57 & 0xff | (v64 >> 57 & 0xff) * 0x100) * 0x10000 | (v64 >> 57 & 0xff | (v64 >> 57 & 0xff) * 0x100 | (v64 >> 57 & 0xff | (v64 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                                    v67 = v64 & v66;
                                    v68 = *(long long *)((char *)v65 + v67);
                                    v70 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v68, v48));
                                    v71 = v70 & 0x8080808080808080;
                                    if (!(v70 & 0x8080808080808080))
                                        goto LABEL_c22830;
                                    while (1)
                                    {
                                        do
                                        {
                                            v76 = v71;
                                            v77 = ((((((v76 & 0xaaaaaaaaaaaaaaaa) >> 1 | v76 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v76 & 0xaaaaaaaaaaaaaaaa) >> 1 | v76 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v76 & 0xaaaaaaaaaaaaaaaa) >> 1 | v76 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v76 & 0xaaaaaaaaaaaaaaaa) >> 1 | v76 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                            v78 = (((((((v76 & 0xaaaaaaaaaaaaaaaa) >> 1 | v76 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v76 & 0xaaaaaaaaaaaaaaaa) >> 1 | v76 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v76 & 0xaaaaaaaaaaaaaaaa) >> 1 | v76 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v76 & 0xaaaaaaaaaaaaaaaa) >> 1 | v76 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                            v79 = ((((v78 | v77) & 0xffff0000ffff0000) >> 16 | (v78 | v77) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v78 | v77) & 0xffff0000ffff0000) >> 16 | (v78 | v77) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                            if (!v79)
                                                v80 = 64;
                                            else
                                                v80 = Clz(v79);
                                            if (v55 == *(int *)((char *)v65 + -4 * (v67 + (v80 >> 3) & v66) - 4))
                                                goto LABEL_c22864;
                                        } while ((v81 = v76 - 1, v71 = v81 & v76, v81 & v76));
                                        do
                                        {
LABEL_c22830:
                                            v72 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v68, _mm_set1_epi8(-1)));
                                            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v72, v72), _mm_unpacklo_epi64(v72, v72)))))))))) & 1)
                                                goto LABEL_c22a0c;
                                            v63 += 8;
                                            v67 = v67 + v63 & v66;
                                            v68 = *(long long *)((char *)v65 + v67);
                                            v75 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v68, v48));
                                            v71 = v75 & 0x8080808080808080;
                                        } while (!(v75 & 0x8080808080808080));
                                    }
                                }
                                else
                                {
LABEL_c22a0c:
                                    v5 = v55;
                                    v2 = a0->field_38;
                                    v3 = *(long long *)&a0->padding_40[0];
                                    v48 = *(unsigned long long *)&v52->field_18;
                                    v4 = _mm_cvtsi128_si64(v48);
                                    v1 = 1;
                                    sub_c280ec(&v30, &v1);
                                    v82 = *(unsigned long long *)((void*)&v30 + 8);
                                    v83 = (unsigned long long)v32 * 8;
                                    v84 = v82;
                                }
                                while (1)
                                {
                                    if (v83)
                                    {
                                        v85 = *v84;
                                        v86 = v84 + 2;
                                        sub_bd9618(&v30, &a0->field_18, v84[1]);
                                        if (*(unsigned long long *)&v30 != 0x8000000000000000)
                                        {
                                            v48 = v30;
                                            v6 = v48;
                                            v7 = v32;
                                            sub_c2bc00(&a0->field_18, v85, a3, &v6);
                                            v83 -= 8;
                                            sub_c21dac(a0, v85);
                                            v84 = v86;
                                        }
                                        else
                                        {
                                            sub_c73c64(&g_efbf98);
                                            goto LABEL_c230cc;
                                        }
                                    }
                                    else
                                    {
                                        if (*(unsigned long long *)&v30)
                                            _free(v82);
                                        sub_bd8578(&v30, a0, v47);
                                        sub_c23fb0(&v30);
                                        break;
                                    }
                                }
                            }
                        }
LABEL_c22864:
                        v87 = a3 & 0xffffffff;
                        if ((unsigned long long)v50 <= v87 || (v88 = v51 + v87 * 32, v88->field_0 == 0x8000000000000000))
                        {
                            v89 = 0xffffffff;
                            iter = 0;
                            v91 = a0->field_38;
                            j = *(long long *)&a0->padding_40[0];
                            k = 0xffffffff;
                            if (j > 0xffffffff)
                                goto LABEL_c22934;
                        }
                        else
                        {
                            v89 = v88->field_1c;
                            iter = 0;
                            v91 = a0->field_38;
                            j = *(long long *)&a0->padding_40[0];
                            k = 0xffffffff;
                            if (0xffffffff < j)
                                goto LABEL_c22934;
                        }
                        while (j > v89)
                        {
                            v94 = v91 + 48 * v89;
                            v89 = v94[9];
                            v95 = arm64g_calculate_condition(1, v94[10], 1, 0);
                            if (!(v95 & 1) && !(iter += 1, j <= k))
                            {
                                do
                                {
LABEL_c22934:
                                    k = *(int *)(v91 + 48 * k + 32);
                                    iter += 1;
                                } while (k < j);
                            }
                        }
                        if (iter != 1)
                            goto LABEL_c22bdc;
                        v96 = 0xffffffff | *(int *)((char *)&v52->field_18 + 4) * 0x100000000;
                    }
                    goto LABEL_c23088;
                }
                else
                {
                    sub_c73c80("assertion failed: self.function.unconditional_edge(node).is_some()assertion failed: body != headerassertion failed: then_edge.target() == headercapacity overflowassertion failed: <Ix as IndexType>::max().index() == !0 || EdgeIndex::end() != edge_idxprefixCommentAssignWhileBlockCloselocalsSetListobject_localindexNotNegateLengthMutexLabelGenericForInitGenericForNextres_localsgeneratorstateGenericForRcLocalNumForInitcounterlimitNumForNextNumericForinitialassertion failed: <Ix as IndexType>::max().index() == !0 || NodeIndex::end() != node_idxUnconditionalBreakVarArgRepeatconditionblockIfthen_blockelse_blockGlobalRefNilBooleanNumberIntegerStringVectorvalueargumentsAddSubMulDivModPowConcatEqualLessThanOrEqualGreaterThanOrEqualGreaterThanAndOrparametersis_variadicLocalMethodCallTableLiteralIndexUnaryBinaryClosureSelectFilterMapmethodrightoperationByAddressReturnvalues @ Because the root is initialized to dominate itself, and is the first node in every path, there must exist a predecessor to this node that also has a", 66, &g_efc040);
LABEL_c2303c:
                    sub_c73c64(&g_efc7d0);
                    sub_c73c64(&g_efbfe0);
                    sub_c73c64(&g_efbfb0);
                    goto LABEL_c230cc;
                }
                goto LABEL_c230cc;
            }
        }
LABEL_c22bdc:
        v48 = v204;
    }
    else
    {
        v140 = a1 & 0xffffffff;
        if ((unsigned long long)a0->field_28 > v140 && !(v141 = a0->field_20 + v140 * 32, v142 = v141->field_0, v143 = 0x8000000000000000, v141->field_0 == 0x8000000000000000))
        {
            v144 = v141->field_8;
            v145 = *(long long *)&v141->padding_10[0] * 264;
            while (1)
            {
                v146 = v144;
                if (!v145)
                    break;
                v142 = v146->field_18;
                v144 = &v146[8].padding_0[8];
                v145 -= 264;
                v143 = 32;
                if (v146->field_18 != 32)
                    goto LABEL_c22bdc;
            }
            if (*(int *)&a0->padding_40[56] == 1)
            {
                v147 = arm64g_calculate_condition(4, v142, v143, 0);
                v148 = arm64g_calculate_condition(3, (v147 & 1 ? a0->field_7c : 0), (v147 & 1 ? a1 & 0xffffffff : 0), 0);
                if (v148 & 1)
                    goto LABEL_c22bdc;
                else
                    goto LABEL_c225b4;
            }
            else
            {
                v149 = arm64g_calculate_condition(4, v142, v143, 0);
                v150 = arm64g_calculate_condition(0, (v149 & 1 ? a0->field_7c : 0), (v149 & 1 ? a1 & 0xffffffff : 0), 0);
                if (v150 & 1)
                    goto LABEL_c22bdc;
                else
                    goto LABEL_c225b4;
            }
LABEL_c225b4:
            if (*(long long *)&a0[1].padding_0[8])
            {
                v151 = 0;
                v152 = 5871781006564002453 * v140;
                v153 = a0->field_90;
                v154 = a0->field_98;
                v155 = v152 >> 57 & 0xff | (v152 >> 57 & 0xff) * 0x100 | (v152 >> 57 & 0xff | (v152 >> 57 & 0xff) * 0x100) * 0x10000 | (v152 >> 57 & 0xff | (v152 >> 57 & 0xff) * 0x100 | (v152 >> 57 & 0xff | (v152 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                v156 = v152 & v154;
                v157 = *(long long *)((char *)v153 + v156);
                v159 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v157, v155));
                v160 = v159 & 0x8080808080808080;
                if (!(v159 & 0x8080808080808080))
                    goto LABEL_c22628;
                while (1)
                {
                    do
                    {
                        v165 = v160;
                        v166 = ((((((v165 & 0xaaaaaaaaaaaaaaaa) >> 1 | v165 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v165 & 0xaaaaaaaaaaaaaaaa) >> 1 | v165 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v165 & 0xaaaaaaaaaaaaaaaa) >> 1 | v165 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v165 & 0xaaaaaaaaaaaaaaaa) >> 1 | v165 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v167 = (((((((v165 & 0xaaaaaaaaaaaaaaaa) >> 1 | v165 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v165 & 0xaaaaaaaaaaaaaaaa) >> 1 | v165 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v165 & 0xaaaaaaaaaaaaaaaa) >> 1 | v165 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v165 & 0xaaaaaaaaaaaaaaaa) >> 1 | v165 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v168 = ((((v167 | v166) & 0xffff0000ffff0000) >> 16 | (v167 | v166) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v167 | v166) & 0xffff0000ffff0000) >> 16 | (v167 | v166) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        if (!v168)
                            v169 = 64;
                        else
                            v169 = Clz(v168);
                        if ((unsigned int)a1 == *(int *)((char *)v153 + -4 * (v156 + (v169 >> 3) & v154) - 4))
                            goto LABEL_c22bdc;
                    } while ((v170 = v165 - 1, v160 = v170 & v165, v170 & v165));
                    do
                    {
LABEL_c22628:
                        v161 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v157, _mm_set1_epi8(-1)));
                        if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v161, v161), _mm_unpacklo_epi64(v161, v161)))))))))) & 1)
                            goto LABEL_c2265c;
                        v151 += 8;
                        v156 = v156 + v151 & v154;
                        v157 = *(long long *)((char *)v153 + v156);
                        v164 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v157, v155));
                        v160 = v164 & 0x8080808080808080;
                    } while (!(v164 & 0x8080808080808080));
                }
            }
LABEL_c2265c:
            if (*(long long *)&v141->padding_10[0])
            {
                v171 = v141->field_8->field_18;
                v172 = v171 - 12;
                v173 = v171;
                v174 = 9;
                if (11 >= v171)
                    v172 = v174;
                if (v172 != 10)
                {
                    v175 = arm64g_calculate_condition(20, v173, 11, 0);
                    v176 = arm64g_calculate_condition(4, (v175 & 1 ? v172 : 0x40000000), (v175 & 1 ? 13 : 0), 0);
                    if (v176 & 1)
                        goto LABEL_c22bdc;
                    else
                        goto LABEL_c22680;
                }
                else
                {
                    v177 = arm64g_calculate_condition(20, v173, 11, 0);
                    v178 = arm64g_calculate_condition(0, (v177 & 1 ? 10 : 0x40000000), (v177 & 1 ? 13 : 0), 0);
                    if (v178 & 1)
                        goto LABEL_c22bdc;
                    else
                        goto LABEL_c22680;
                }
            }
LABEL_c22680:
            v18 = a0->field_38;
            v19 = *(long long *)&a0->padding_40[0];
            v20 = 0xffffffff;
            v21 = v141->field_1c;
            v22 = 0xffffffff;
            sub_c27e78(&v30, &v18);
            ptr = *(unsigned long long *)((void*)&v30 + 8);
            v0 = *(unsigned long long *)&v30;
            if (*(unsigned long long *)&v32)
            {
                i = 0;
                do
                {
                    v181 = *(int *)(ptr + i);
                    if ((unsigned long long)a0->field_28 <= v181 || (v182 = a0->field_20 + v181 * 32, v182->field_0 == 0x8000000000000000))
                        v183 = 0xffffffff;
                    else
                        v183 = v182->field_18;
                    v23 = a0->field_38;
                    v24 = *(long long *)&a0->padding_40[0];
                    v25 = v183;
                    v48 = _mm_set1_epi32(-1);
                    v26 = _mm_cvtsi128_si64(v48);
                    sub_c27e78(&v30, &v23);
                    if (*(unsigned long long *)&v32 != 1)
                    {
                        if (*(unsigned long long *)&v30)
                            _free(*(unsigned long long *)((void*)&v30 + 8));
                        if (v0)
                        {
                            _free(ptr);
                            goto LABEL_c22bdc;
                        }
                    }
                    if (*(unsigned long long *)&v30)
                        _free(*(unsigned long long *)((void*)&v30 + 8));
                    i += 4;
                } while (*(unsigned long long *)&v32 * 4 != i);
            }
            if (v0)
                _free(ptr);
            v184 = *(long long *)&a0->padding_40[0];
            if ((unsigned long long)a0->field_28 <= v140 || !(v185 = a0->field_20 + v140 * 32, v185->field_0 != 0x8000000000000000))
            {
                v186 = 0xffffffff;
                v187 = 0xffffffff;
                if (0xffffffff < v184)
                    goto LABEL_c22c48;
            }
            else
            {
                v186 = v185->field_1c;
                v187 = v185->field_1c;
                if (v184 > v187)
                {
LABEL_c22c48:
                    v188 = a0->field_38;
                    v189 = v188 + (unsigned int)v187 * 48;
                    if (v189->field_0 == 0x8000000000000000)
                        goto LABEL_c2303c;
                    v190 = v189->field_24;
                    ptr1 = _malloc(16);
                    if (ptr1)
                    {
                        *(unsigned int *)ptr1 = v186;
                        v30 = CONCAT(ptr1, 4);
                        v192 = -0x4;
                        idx = 1;
                        while (1)
                        {
                            *(unsigned int *)&v32 = idx;
                            if (v184 > v190)
                            {
                                v194 = v188 + 48 * v190;
                                if (v194->field_0 != 0x8000000000000000)
                                {
                                    v195 = v194->field_24;
                                    if (idx == *(unsigned long long *)&v30)
                                    {
                                        sub_c736c8(&v30, idx, 1, 4, 4);
                                        ptr1 = *(unsigned long long *)((void*)&v30 + 8);
                                    }
                                    *(unsigned int *)(ptr1 + idx * 4) = v190;
                                    idx += 1;
                                    v192 -= 4;
                                    v190 = v195;
                                }
                                else
                                {
                                    sub_c73c64(&g_efc7d0);
                                    goto LABEL_c230cc;
                                }
                            }
                            else
                            {
                                v196 = *(unsigned long long *)((void*)&v30 + 8);
                                l = -v192;
                                v198 = v196;
                                do
                                {
                                    v199 = l;
                                    v200 = v198 + 4;
                                    sub_bd9618(&v30, &a0->field_18, *(int *)v198);
                                    if (*(unsigned long long *)&v30 != 0x8000000000000000)
                                    {
                                        v48 = v32;
                                        v27 = v30;
                                        v29 = v48;
                                        if (*(char *)((void*)&v29 + 8))
                                        {
                                            sub_c76834((char *)&v29 + 8);
                                            goto LABEL_c230cc;
                                        }
                                    }
                                    else
                                    {
                                        sub_c73c64(&g_efc070);
                                        goto LABEL_c230cc;
                                    }
                                    sub_c2aac0(*(unsigned long long *)((void*)&v27 + 8), *(unsigned long long *)&v29);
                                    if (*(unsigned long long *)&v27)
                                        _free(*(unsigned long long *)((void*)&v27 + 8));
                                    l = v199 - 4;
                                    v198 = v200;
                                } while (l);
                                if (*(unsigned long long *)&v30)
                                {
                                    _free(v196);
                                    break;
                                }
                            }
                        }
                    }
                    else
                    {
                        sub_c6b970(4, 16);
                    }
                }
            }
            sub_bd8578(&v30, a0, a1 & 0xffffffff);
            v201 = *(unsigned long long *)&v30;
            if (v201 != 0x8000000000000000)
            {
                v202 = *(unsigned long long *)&v32 + 1;
                while (1)
                {
                    v203 = v202 - 1;
                    if (v202 == 1)
                        break;
                    sub_c259a4();
                    v202 = v203;
                }
                if (v201)
                    _free(*(unsigned long long *)((void*)&v30 + 8));
            }
        }
        else
        {
            sub_c73c64(&g_efc058);
        }
        sub_c73c64(&g_efbb78);
LABEL_c2307c:
        sub_c73c64(&g_efc118);
LABEL_c23088:
        sub_c73c64(&g_efbf80);
        sub_c73c64(&g_efbff8);
LABEL_c230cc:
        __debugbreak();
    }
}
