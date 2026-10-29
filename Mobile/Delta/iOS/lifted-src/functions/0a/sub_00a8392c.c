/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa8392c..0xa8425c (2352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a8392c_3 {
    unsigned short field_0;
} st_a8392c_3;

typedef struct st_a8392c_2 {
    uint128_t field_0;
    uint128_t field_10;
} st_a8392c_2;

typedef struct st_a8392c_0 {
    unsigned long long field_0;
    char padding_8[40];
    unsigned long long field_30;
    char padding_38[8];
    unsigned int field_40;
    char padding_44[4];
    unsigned int field_48;
} st_a8392c_0;

typedef struct st_a8392c_1 {
    struct st_a8392c_0 *field_0;
    char padding_8[24];
    long long field_20;
    char padding_28[8];
    struct st_a8392c_2 *field_30;
    long long field_38;
    struct st_a8392c_3 *field_40;
    unsigned long long field_48;
    struct st_a8392c_3 *field_50;
    uint128_t *field_58;
    char padding_60[8];
    char field_68;
} st_a8392c_1;

extern long long g_a85a88;
extern long long g_a85fdc;
extern void g_defd00;
extern unsigned short g_defe00;
extern char g_10002b0;

unsigned long long sub_a8392c(uint128_t *a0, long long a1, unsigned long long a2, st_a8392c_1 *a3)
{
    st_a8392c_0 *v19;  // x19
    long long v20;  // x24
    unsigned long long v29;  // x11
    unsigned long v119;  // 4110
    unsigned long v120;  // cc_op
    unsigned long v121;  // cc_dep1
    unsigned long v122;  // cc_dep2
    unsigned long v123;  // 4110
    unsigned long long v124;  // 4133
    unsigned long v125;  // 4110
    unsigned long v126;  // cc_op
    unsigned long v127;  // cc_dep1
    unsigned long v128;  // cc_dep2
    unsigned long long v30;  // x11
    unsigned long long v129;  // 4107
    unsigned long v130;  // 4110
    unsigned long long v131;  // 4107
    unsigned long long v132;  // w11
    unsigned long long v133;  // 4110
    unsigned long long v134;  // 4107
    unsigned long long v135;  // 4110
    unsigned long long v136;  // 4107
    unsigned long long v137;  // x4
    unsigned long long v138;  // x5
    unsigned long v31;  // x12
    unsigned int v139;  // w7
    unsigned short *v140;  // x6
    unsigned int v141;  // w7
    unsigned long long v142;  // x26
    void* v143;  // x27
    unsigned short *v144;  // x11
    unsigned long long l;  // x12
    unsigned short *v146;  // x20
    unsigned short *v147;  // x22
    unsigned short *v148;  // x25
    unsigned long long v32;  // x14
    unsigned int v149;  // w28
    unsigned int v150;  // w20
    unsigned int v151;  // w11
    unsigned short *v152;  // x22
    void* v153;  // x27
    unsigned short v154;  // x14
    unsigned long long v155;  // w10
    short v156;  // x10
    unsigned long long v157;  // w11
    short v158;  // x11
    unsigned short *v33;  // x16
    unsigned long long m;  // x26
    void* v160;  // x27
    uint128_t *v161;  // x11
    __m128i v162;  // q5
    __m128i v163;  // q4
    uint128_t *v164;  // x11
    __m128i v165;  // q7
    __m128i v166;  // q6
    uint128_t *v167;  // x28
    __m128i v168;  // q17
    unsigned long v34;  // 4110
    __m128i v169;  // q16
    void* v170;  // x27
    uint128_t v171;  // q21
    uint128_t v172;  // q22
    __m128i v174;  // q22
    __m128i v176;  // q21
    __m128i v177;  // q21
    __m128i v178;  // q21
    unsigned long v35;  // cc_op
    __m128i v179;  // q20
    __m128i v180;  // q19
    __m128i v182;  // q23
    __m128i v184;  // q21
    __m128i v185;  // q4
    __m128i v186;  // q5
    __m128i v188;  // q19
    unsigned long v36;  // cc_dep1
    __m128i v190;  // q16
    __m128i v191;  // q6
    __m128i v192;  // q7
    st_a8392c_1 *v193;  // x20
    uint128_t *v194;  // x8
    st_a8392c_0 *v195;  // x9
    unsigned int v196;  // w10
    unsigned long long *v197;  // x11
    unsigned int i;  // w10
    unsigned long v37;  // cc_dep2
    unsigned long long v199;  // x12
    unsigned long long v200;  // x15
    unsigned long long v201;  // w14
    unsigned long long *iter;  // x13
    unsigned long v203;  // x17
    unsigned long long v204;  // w16
    unsigned long v205;  // cc_dep1
    unsigned long long v206;  // 4106
    unsigned long long v207;  // 4106
    uint128_t *v208;  // x9
    unsigned long long v38;  // 4129
    uint128_t v209;  // q1
    long long v210;  // x22
    unsigned long v211;  // x23
    unsigned short *iter1;  // x24
    unsigned long long v213;  // x8
    unsigned long long v214;  // x11
    unsigned long long v215;  // w10
    unsigned long long *node;  // x9
    unsigned long v217;  // x13
    unsigned long long v218;  // w12
    unsigned long v21;  // x25
    unsigned long long v39;  // w13
    unsigned long v219;  // cc_dep1
    unsigned long long v220;  // 4106
    unsigned long long v221;  // 4106
    unsigned long long v222;  // x21
    unsigned long long v223;  // w22
    uint128_t *v224;  // x8
    uint128_t v225;  // q1
    uint128_t *v226;  // x0
    uint128_t v227;  // q1
    unsigned long v40;  // 4110
    unsigned long long v41;  // 4129
    unsigned long v42;  // 4110
    unsigned long v43;  // cc_op
    unsigned long v44;  // cc_dep1
    unsigned long v45;  // cc_dep2
    unsigned long long v46;  // 4107
    unsigned long v47;  // 4110
    unsigned long long v48;  // 4107
    uint128_t *v22;  // x8
    unsigned long long v49;  // w15
    void* v50;  // x13
    unsigned long long v51;  // 4110
    unsigned long long v52;  // 4107
    unsigned long long v53;  // 4110
    unsigned long long v54;  // 4107
    unsigned long long v55;  // w11
    unsigned long long v56;  // x15
    unsigned long long v57;  // x16
    uint128_t v58;  // q0
    unsigned short *v23;  // x24
    __m128i v59;  // q1
    __m128i v60;  // q2
    unsigned int v61;  // w3
    unsigned short *iter2;  // x2
    unsigned int v63;  // w3
    unsigned long long v64;  // x4
    void* v65;  // x5
    unsigned long long j;  // x4
    unsigned short *v67;  // x6
    unsigned short *v68;  // x7
    unsigned long long v24;  // x8
    unsigned short *v69;  // x26
    unsigned int v70;  // w27
    unsigned int v71;  // w28
    unsigned int v72;  // w7
    unsigned int v73;  // w6
    void* v74;  // x5
    unsigned short v75;  // x12
    unsigned long long v76;  // w11
    short v77;  // x11
    unsigned long long v78;  // w11
    unsigned long v25;  // x1
    short v79;  // x11
    unsigned long long k;  // x4
    void* v81;  // x5
    uint128_t *v82;  // x6
    __m128i v83;  // q5
    __m128i v84;  // q4
    uint128_t *v85;  // x6
    __m128i v86;  // q7
    __m128i v87;  // q6
    uint128_t *v88;  // x6
    unsigned short *v26;  // x9
    __m128i v89;  // q17
    __m128i v90;  // q16
    void* v91;  // x5
    uint128_t v92;  // q21
    uint128_t v93;  // q22
    __m128i v95;  // q22
    __m128i v97;  // q21
    __m128i v98;  // q21
    unsigned long v27;  // x10
    __m128i v99;  // q21
    __m128i v100;  // q20
    __m128i v101;  // q19
    __m128i v103;  // q23
    __m128i v105;  // q21
    __m128i v106;  // q4
    __m128i v107;  // q5
    unsigned long v28;  // cc_dep1
    __m128i v109;  // q19
    __m128i v111;  // q16
    __m128i v112;  // q6
    __m128i v113;  // q7
    unsigned long v114;  // cc_dep1
    unsigned long long v115;  // x11
    unsigned long long v116;  // x12
    unsigned long long v117;  // x4
    unsigned long long v118;  // x5
    unsigned long v0;  // [bp-0x2c0]
    st_a8392c_0 *v1;  // [bp-0x2a0]
    unsigned long v2;  // [bp-0x290]
    unsigned short *v3;  // [bp-0x288]
    unsigned long v4;  // [bp-0x280]
    unsigned long long v5;  // [bp-0x274]
    unsigned long v6;  // [bp-0x270]
    unsigned long long v7;  // [bp-0x265]
    char v8;  // [bp-0x264]
    uint128_t v9;  // [bp-0x260]
    uint128_t v10;  // [bp-0x250]
    char v11;  // [bp-0x240]
    uint128_t v12;  // [bp-0x230]
    uint128_t v13;  // [bp-0x220]
    char v14;  // [bp-0x210]
    unsigned long long v15;  // [bp-0x1f0]
    unsigned long v16;  // [bp-0x70]
    char *v17;  // [bp-0x10]
    char v18;  // [bp+0x0]

    v17 = &v18;
    v16 = *(long long *)&g_10002b0;
    v19 = a3->field_0;
    if (v19->field_40 == 1454)
        v20 = &g_a85a88;
    else
        v20 = &g_a85fdc;
    v21 = v19->field_48;
    v7 = 0;
    v9 = *a0;
    v10 = a0[1];
    v11 = v21;
    if (sub_a86280() && !(v22 = &a3->field_30->field_0, *v22 = v12, v22[1] = v13, !sub_a85900(a1, a3) || !sub_a86338(a3->field_50, v20, &v7, &v14, v21, a1, a3) || !sub_a86338(a3->field_40, v20, &v7, &v14, v21, a1, a3)))
    {
        v1 = v19;
        v23 = a3->field_40;
        v6 = v21;
        if ((int)v21 >= 1)
        {
            v24 = 0;
            v25 = a3->field_48;
            v26 = a3->field_50;
            v27 = v6;
            v28 = v27 & 0xffffffff;
            if ((int)v27 < 2)
                v29 = v27 & 0xffffffff;
            else
                v29 = 2;
            v30 = ((v27 - v29) * 0x200 | v27 - v29 >> 55) & 0x1fffffffe00 & 0x1ffffffffff;
            v3 = (char *)v26 + v30 + 0x400;
            v31 = ((((unsigned int)v21 - 1) * 0x200 | (unsigned int)v21 - 1 >> 55) & 0x1fffffffe00 & 0x1ffffffffff) + 0x200;
            v32 = (char *)v23 + v31;
            v33 = v26 + 0x100;
            v2 = v25 + v27 * (v30 + 0x200) + 0x200;
            if (v23 < v25 + v31)
            {
                v34 = arm64g_calculate_condition(0x33, v28, 2, 0);
                v35 = 4;
                v36 = (v34 & 1 ? v25 : 0x20000000);
                v37 = (v34 & 1 ? v32 : 0);
                v38 = arm64g_calculate_condition(36, v36, v37, 0);
                v39 = (unsigned int)!(v38 & 1);
                if (v23 >= v33)
                    goto LABEL_a83aa6;
LABEL_a83aa5:
                v42 = arm64g_calculate_condition(v35 | 48, v36, v37, 0);
                v43 = 4;
                v44 = (v42 & 1 ? v26 : 0x20000000);
                v45 = (v42 & 1 ? v32 : 0);
                v46 = arm64g_calculate_condition(36, v44, v45, 0);
                if (!(v46 & 1))
                    goto LABEL_a83aaa;
LABEL_a83aa9:
                v49 = v39;
            }
            else
            {
                v40 = arm64g_calculate_condition(0x33, v28, 2, 0);
                v35 = 0;
                v36 = (v40 & 1 ? v25 : 0x20000000);
                v37 = (v40 & 1 ? v32 : 0);
                v41 = arm64g_calculate_condition(32, v36, v37, 0);
                v39 = (unsigned int)!(v41 & 1);
                if (v23 < v33)
                    goto LABEL_a83aa5;
LABEL_a83aa6:
                v47 = arm64g_calculate_condition(v35 | 48, v36, v37, 0);
                v43 = 0;
                v44 = (v47 & 1 ? v26 : 0x20000000);
                v45 = (v47 & 1 ? v32 : 0);
                v48 = arm64g_calculate_condition(32, v44, v45, 0);
                if (v48 & 1)
                    goto LABEL_a83aa9;
LABEL_a83aaa:
                v49 = 1;
            }
            v50 = &g_defd00;
            if (v23 < &g_defe00)
            {
                v51 = arm64g_calculate_condition(v43 | 48, v44, v45, 0);
                v52 = arm64g_calculate_condition(148, (v51 & 1 ? v32 : 0), (v51 & 1 ? &g_defd00 : 0), 0);
                if (!(v52 & 1))
                    goto LABEL_a83ac2;
LABEL_a83ac1:
                v55 = v49;
            }
            else
            {
                v53 = arm64g_calculate_condition(v43 | 48, v44, v45, 0);
                v54 = arm64g_calculate_condition(144, (v53 & 1 ? v32 : 0), (v53 & 1 ? &g_defd00 : 0), 0);
                if (v54 & 1)
                    goto LABEL_a83ac1;
LABEL_a83ac2:
                v55 = 1;
            }
            v5 = v55;
            v56 = v27 * 0x200;
            v57 = v25 + v56;
            v58 = CONCAT(21642340209583, 21642340209583);
            v59 = _mm_set1_epi32(0xf2ff);
            v60 = _mm_set1_epi32(0xf2fff2ff);
            v61 = v27;
            v4 = v25;
            iter2 = v23;
            do
            {
                v63 = v61;
                if (v5 & 1)
                {
                    v64 = 0;
                    v65 = v50;
                    do
                    {
                        j = v64;
                        v67 = (char *)v26 + j;
                        v68 = v25 + j;
                        v69 = (char *)iter2 + j;
                        v70 = *v68;
                        v71 = *v67;
                        v72 = v68[1];
                        v73 = v67[1];
                        j += 4;
                        v74 = v65 + 2;
                        v75 = (unsigned short)v72 * (unsigned short)v73 + 0xf2ff * (unsigned short)((v72 * v73) * 5039 >> 24);
                        v76 = *v69 + v70 * v71 + *(short *)v65 * ((v75 & v75 - 3329 >> 15 | v75 - 3329 & ~((short)(v75 - 3329) >> 31)) & 0xffff);
                        v77 = (unsigned short)v76 + 0xf2ff * (unsigned short)(v76 * 5039 >> 24);
                        *v69 = v77 & (unsigned short)(v77 - 3329) >> 15 | v77 - 3329 & (short)~(v77 - 3329 >> 31);
                        v78 = v71 * v72 + v70 * v73 + v69[1];
                        v79 = (unsigned short)v78 + 0xf2ff * (unsigned short)(v78 * 5039 >> 24);
                        v69[1] = v79 & (unsigned short)(v79 - 3329) >> 15 | v79 - 3329 & (short)~(v79 - 3329 >> 31);
                        v64 = j;
                        v65 = v74;
                    } while (j < 508);
                }
                else
                {
                    k = 0;
                    v81 = v50;
                    do
                    {
                        v82 = v25 + k;
                        v83 = CatOddLanesV(v82[1], *v82);
                        v84 = CatEvenLanesV(v82[1], *v82);
                        v85 = (char *)v26 + k;
                        v86 = CatOddLanesV(v85[1], *v85);
                        v87 = CatEvenLanesV(v85[1], *v85);
                        v88 = (char *)iter2 + k;
                        v89 = CatOddLanesV(v88[1], *v88);
                        v90 = CatEvenLanesV(v88[1], *v88);
                        v91 = v81 + 16;
                        v92 = MullV(_mm_cvtsi128_si64(v86), _mm_cvtsi128_si64(v83));
                        v93 = MullV(_mm_extract_epi64(v86, 1), _mm_extract_epi64(v83, 1));
                        v95 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)v93, (unsigned long long)v58), 24), _mm_srli_epi64(MullV((unsigned long long)v93, (unsigned long long)v58), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)(v93 >> 64), (unsigned long long)(v58 >> 64)), 24), _mm_srli_epi64(MullV((unsigned long long)(v93 >> 64), (unsigned long long)(v58 >> 64)), 24))));
                        v97 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)v92, (unsigned long long)v58), 24), _mm_srli_epi64(MullV((unsigned long long)v92, (unsigned long long)v58), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)(v92 >> 64), (unsigned long long)(v58 >> 64)), 24), _mm_srli_epi64(MullV((unsigned long long)(v92 >> 64), (unsigned long long)(v58 >> 64)), 24))));
                        v98 = CatEvenLanesV(_mm_add_epi32(_mm_mullo_epi32(v95, v59), MullV(_mm_extract_epi64(v86, 1), _mm_extract_epi64(v83, 1))), _mm_add_epi32(_mm_mullo_epi32(v97, v59), MullV(_mm_cvtsi128_si64(v86), _mm_cvtsi128_si64(v83))));
                        v99 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(v98, v60)), v98), _mm_max_epi16(_mm_add_epi16(v98, v60), _mm_setzero_si128()));
                        v100 = _mm_add_epi32(_mm_add_epi32(MullV(_mm_cvtsi128_si64(v87), _mm_cvtsi128_si64(v84)), _mm_srli_epi32(_mm_unpacklo_epi16(v90, v90), 16)), MullV(_mm_cvtsi128_si64(v99), (long long)*(int128_t *)v81));
                        v101 = _mm_add_epi32(_mm_add_epi32(_mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v90), 16), MullV(_mm_extract_epi64(v87, 1), _mm_extract_epi64(v84, 1))), MullV(_mm_extract_epi64(v99, 1), (long long)((uint128_t)(*(int128_t *)v81) >> 64)));
                        v103 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v101), (unsigned long long)v58), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v101), (unsigned long long)v58), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v101, 1), (unsigned long long)(v58 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v101, 1), (unsigned long long)(v58 >> 64)), 24))));
                        v105 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v100), (unsigned long long)v58), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v100), (unsigned long long)v58), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v100, 1), (unsigned long long)(v58 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v100, 1), (unsigned long long)(v58 >> 64)), 24))));
                        v106 = _mm_add_epi32(_mm_add_epi32(MullV(_mm_cvtsi128_si64(v86), _mm_cvtsi128_si64(v84)), MullV(_mm_cvtsi128_si64(v83), _mm_cvtsi128_si64(v87))), _mm_srli_epi32(_mm_unpacklo_epi16(v89, v89), 16));
                        v107 = _mm_add_epi32(_mm_add_epi32(MullV(_mm_extract_epi64(v86, 1), _mm_extract_epi64(v84, 1)), MullV(_mm_extract_epi64(v83, 1), _mm_extract_epi64(v87, 1))), _mm_srli_epi32(_mm_unpackhi_epi16(v89, v89), 16));
                        v109 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v107), (unsigned long long)v58), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v107), (unsigned long long)v58), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v107, 1), (unsigned long long)(v58 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v107, 1), (unsigned long long)(v58 >> 64)), 24))));
                        v111 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v106), (unsigned long long)v58), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v106), (unsigned long long)v58), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v106, 1), (unsigned long long)(v58 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v106, 1), (unsigned long long)(v58 >> 64)), 24))));
                        v112 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(CatEvenLanesV(_mm_add_epi32(v101, _mm_mullo_epi32(v103, v59)), _mm_add_epi32(v100, _mm_mullo_epi32(v105, v59))), v60)), CatEvenLanesV(_mm_add_epi32(v101, _mm_mullo_epi32(v103, v59)), _mm_add_epi32(v100, _mm_mullo_epi32(v105, v59)))), _mm_max_epi16(_mm_add_epi16(CatEvenLanesV(_mm_add_epi32(v101, _mm_mullo_epi32(v103, v59)), _mm_add_epi32(v100, _mm_mullo_epi32(v105, v59))), v60), _mm_setzero_si128()));
                        v113 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(CatEvenLanesV(_mm_add_epi32(v107, _mm_mullo_epi32(v109, v59)), _mm_add_epi32(v106, _mm_mullo_epi32(v111, v59))), v60)), CatEvenLanesV(_mm_add_epi32(v107, _mm_mullo_epi32(v109, v59)), _mm_add_epi32(v106, _mm_mullo_epi32(v111, v59)))), _mm_max_epi16(_mm_add_epi16(CatEvenLanesV(_mm_add_epi32(v107, _mm_mullo_epi32(v109, v59)), _mm_add_epi32(v106, _mm_mullo_epi32(v111, v59))), v60), _mm_setzero_si128()));
                        v88[1] = _mm_unpackhi_epi16(v112, v113);
                        *v88 = _mm_unpacklo_epi16(v112, v113);
                        k += 32;
                        v81 = v91;
                    } while (k != 0x200);
                }
                v114 = v6 & 0xffffffff;
                if ((unsigned int)v6 == 1)
                    continue;
                v115 = v24 * 0x200;
                v116 = (char *)v23 + v115;
                v117 = v116 + 0x200;
                v118 = v4 + (v24 + v6) * 0x200;
                if (iter2 < v2 + v115)
                {
                    v119 = arm64g_calculate_condition(0x33, v114, 1, 0);
                    v120 = 4;
                    v121 = (v119 & 1 ? v118 : 0x20000000);
                    v122 = (v119 & 1 ? v117 : 0);
                }
                else
                {
                    v123 = arm64g_calculate_condition(0x33, v114, 1, 0);
                    v120 = 0;
                    v121 = (v123 & 1 ? v118 : 0x20000000);
                    v122 = (v123 & 1 ? v117 : 0);
                }
                v124 = arm64g_calculate_condition(v120 | 32, v121, v122, 0);
                if (iter2 < v3)
                {
                    v125 = arm64g_calculate_condition(v120 | 48, v121, v122, 0);
                    v126 = 4;
                    v127 = (v125 & 1 ? v26 : 0x20000000);
                    v128 = (v125 & 1 ? v116 : 0);
                    v129 = arm64g_calculate_condition(36, v127, v128, 0);
                    if (!(v129 & 1))
                        goto LABEL_a83d66;
                    goto LABEL_a83d65;
                }
                else
                {
                    v130 = arm64g_calculate_condition(v120 | 48, v121, v122, 0);
                    v126 = 0;
                    v127 = (v130 & 1 ? v26 : 0x20000000);
                    v128 = (v130 & 1 ? v116 : 0);
                    v131 = arm64g_calculate_condition(32, v127, v128, 0);
                    if (v131 & 1)
                    {
LABEL_a83d65:
                        v132 = (unsigned int)!(v124 & 1);
                        goto LABEL_a83d68;
                    }
                    else
                    {
LABEL_a83d66:
                        v132 = 1;
LABEL_a83d68:
                        if (iter2 < &g_defe00)
                        {
                            v133 = arm64g_calculate_condition(v126 | 48, v127, v128, 0);
                            v134 = arm64g_calculate_condition(148, (v133 & 1 ? v117 : 0), (v133 & 1 ? &g_defd00 : 0), 0);
                            if (!(v134 & 1))
                                goto LABEL_a83d76;
                            goto LABEL_a83d75;
                        }
                        else
                        {
                            v135 = arm64g_calculate_condition(v126 | 48, v127, v128, 0);
                            v136 = arm64g_calculate_condition(144, (v135 & 1 ? v117 : 0), (v135 & 1 ? &g_defd00 : 0), 0);
                            if (v136 & 1)
                            {
LABEL_a83d75:
                                v137 = v132;
                                goto LABEL_a83d78;
                            }
                            else
                            {
LABEL_a83d76:
                                v137 = 1;
LABEL_a83d78:
                                v138 = v57;
                                v139 = v6;
                                v140 = v26;
                                do
                                {
                                    v141 = v139;
                                    if (v137 & 1)
                                    {
                                        v142 = 0x200;
                                        v143 = v50;
                                        do
                                        {
                                            v144 = (char *)v140 + v142;
                                            l = v142 - 0x200;
                                            v146 = l + v138;
                                            v147 = (char *)iter2 + v142;
                                            v148 = (char *)v147 - 0x200;
                                            v149 = *v144;
                                            w30 = *v146;
                                            v150 = v146[1];
                                            v151 = v144[1];
                                            v152 = (char *)v147 - 0x1fe;
                                            v153 = v143 + 2;
                                            v154 = (unsigned short)v150 * (unsigned short)v151 + 0xf2ff * (unsigned short)((v150 * v151) * 5039 >> 24);
                                            v155 = *v148 + w30 * v149 + *(short *)v143 * ((v154 & v154 - 3329 >> 15 | v154 - 3329 & ~((short)(v154 - 3329) >> 31)) & 0xffff);
                                            v156 = (unsigned short)v155 + 0xf2ff * (unsigned short)(v155 * 5039 >> 24);
                                            v157 = v149 * v150 + w30 * v151 + *v152;
                                            v158 = (unsigned short)v157 + 0xf2ff * (unsigned short)(v157 * 5039 >> 24);
                                            *v148 = v156 & (unsigned short)(v156 - 3329) >> 15 | v156 - 3329 & (short)~(v156 - 3329 >> 31);
                                            *v152 = v158 & (unsigned short)(v158 - 3329) >> 15 | v158 - 3329 & (short)~(v158 - 3329 >> 31);
                                            v142 += 4;
                                            v143 = v153;
                                        } while (l < 508);
                                    }
                                    else
                                    {
                                        m = 0;
                                        v160 = v50;
                                        do
                                        {
                                            v161 = v138 + m;
                                            v162 = CatOddLanesV(v161[1], *v161);
                                            v163 = CatEvenLanesV(v161[1], *v161);
                                            v164 = (char *)v140 + m + 0x200;
                                            v165 = CatOddLanesV(v164[1], *v164);
                                            v166 = CatEvenLanesV(v164[1], *v164);
                                            v167 = (char *)iter2 + m;
                                            v168 = CatOddLanesV(v167[1], *v167);
                                            v169 = CatEvenLanesV(v167[1], *v167);
                                            v170 = v160 + 16;
                                            v171 = MullV(_mm_cvtsi128_si64(v165), _mm_cvtsi128_si64(v162));
                                            v172 = MullV(_mm_extract_epi64(v165, 1), _mm_extract_epi64(v162, 1));
                                            v174 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)v172, (unsigned long long)v58), 24), _mm_srli_epi64(MullV((unsigned long long)v172, (unsigned long long)v58), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)(v172 >> 64), (unsigned long long)(v58 >> 64)), 24), _mm_srli_epi64(MullV((unsigned long long)(v172 >> 64), (unsigned long long)(v58 >> 64)), 24))));
                                            v176 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)v171, (unsigned long long)v58), 24), _mm_srli_epi64(MullV((unsigned long long)v171, (unsigned long long)v58), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)(v171 >> 64), (unsigned long long)(v58 >> 64)), 24), _mm_srli_epi64(MullV((unsigned long long)(v171 >> 64), (unsigned long long)(v58 >> 64)), 24))));
                                            v177 = CatEvenLanesV(_mm_add_epi32(_mm_mullo_epi32(v174, v59), MullV(_mm_extract_epi64(v165, 1), _mm_extract_epi64(v162, 1))), _mm_add_epi32(_mm_mullo_epi32(v176, v59), MullV(_mm_cvtsi128_si64(v165), _mm_cvtsi128_si64(v162))));
                                            v178 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(v177, v60)), v177), _mm_max_epi16(_mm_add_epi16(v177, v60), _mm_setzero_si128()));
                                            v179 = _mm_add_epi32(_mm_add_epi32(MullV(_mm_cvtsi128_si64(v166), _mm_cvtsi128_si64(v163)), _mm_srli_epi32(_mm_unpacklo_epi16(v169, v169), 16)), MullV(_mm_cvtsi128_si64(v178), (long long)*(int128_t *)v160));
                                            v180 = _mm_add_epi32(_mm_add_epi32(_mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v169), 16), MullV(_mm_extract_epi64(v166, 1), _mm_extract_epi64(v163, 1))), MullV(_mm_extract_epi64(v178, 1), (long long)((uint128_t)(*(int128_t *)v160) >> 64)));
                                            v182 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v180), (unsigned long long)v58), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v180), (unsigned long long)v58), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v180, 1), (unsigned long long)(v58 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v180, 1), (unsigned long long)(v58 >> 64)), 24))));
                                            v184 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v179), (unsigned long long)v58), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v179), (unsigned long long)v58), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v179, 1), (unsigned long long)(v58 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v179, 1), (unsigned long long)(v58 >> 64)), 24))));
                                            v185 = _mm_add_epi32(_mm_add_epi32(MullV(_mm_cvtsi128_si64(v165), _mm_cvtsi128_si64(v163)), MullV(_mm_cvtsi128_si64(v162), _mm_cvtsi128_si64(v166))), _mm_srli_epi32(_mm_unpacklo_epi16(v168, v168), 16));
                                            v186 = _mm_add_epi32(_mm_add_epi32(MullV(_mm_extract_epi64(v165, 1), _mm_extract_epi64(v163, 1)), MullV(_mm_extract_epi64(v162, 1), _mm_extract_epi64(v166, 1))), _mm_srli_epi32(_mm_unpackhi_epi16(v168, v168), 16));
                                            v188 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v186), (unsigned long long)v58), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v186), (unsigned long long)v58), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v186, 1), (unsigned long long)(v58 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v186, 1), (unsigned long long)(v58 >> 64)), 24))));
                                            v190 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v185), (unsigned long long)v58), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v185), (unsigned long long)v58), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v185, 1), (unsigned long long)(v58 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v185, 1), (unsigned long long)(v58 >> 64)), 24))));
                                            v191 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(CatEvenLanesV(_mm_add_epi32(v180, _mm_mullo_epi32(v182, v59)), _mm_add_epi32(v179, _mm_mullo_epi32(v184, v59))), v60)), CatEvenLanesV(_mm_add_epi32(v180, _mm_mullo_epi32(v182, v59)), _mm_add_epi32(v179, _mm_mullo_epi32(v184, v59)))), _mm_max_epi16(_mm_add_epi16(CatEvenLanesV(_mm_add_epi32(v180, _mm_mullo_epi32(v182, v59)), _mm_add_epi32(v179, _mm_mullo_epi32(v184, v59))), v60), _mm_setzero_si128()));
                                            v192 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(CatEvenLanesV(_mm_add_epi32(v186, _mm_mullo_epi32(v188, v59)), _mm_add_epi32(v185, _mm_mullo_epi32(v190, v59))), v60)), CatEvenLanesV(_mm_add_epi32(v186, _mm_mullo_epi32(v188, v59)), _mm_add_epi32(v185, _mm_mullo_epi32(v190, v59)))), _mm_max_epi16(_mm_add_epi16(CatEvenLanesV(_mm_add_epi32(v186, _mm_mullo_epi32(v188, v59)), _mm_add_epi32(v185, _mm_mullo_epi32(v190, v59))), v60), _mm_setzero_si128()));
                                            v167[1] = _mm_unpackhi_epi16(v191, v192);
                                            *v167 = _mm_unpacklo_epi16(v191, v192);
                                            m += 32;
                                            v160 = v170;
                                        } while (m != 0x200);
                                    }
                                } while ((v140 += 0x100, v138 += v56, v139 = v141 - 1, (int)v141 > 2));
                            }
                        }
                    }
                }
            } while ((v25 += 0x200, iter2 += 0x100, v24 += 1, v57 += 0x200, v61 = v63 - 1, (int)v63 > 1));
        }
        if (a2)
        {
            v19 = v1;
            v193 = a3;
            v194 = &v193->field_30->field_0;
            v195 = v193->field_0;
            v196 = v195->field_48;
            if ((int)v196 >= 1)
            {
                v197 = a2;
                do
                {
                    i = v196;
                    v199 = 0;
                    v200 = 0;
                    v201 = 0;
                    iter = v197;
                    do
                    {
                        v203 = *(short *)((char *)v23 + v199);
                        v204 = v201 + 12;
                        if (0x33 < v201)
                        {
                            *iter = v203 << ((char)v201 & 63) | v200;
                            iter += 1;
                            v205 = v204;
                            if (v204 == 64)
                            {
                                v200 = 0;
                                v206 = arm64g_calculate_condition(3, v205, 64, 0);
                                if (!(v206 & 1))
                                    goto LABEL_a84022;
                            }
                            else
                            {
                                v200 = v203 >> ((char)-v201 & 63);
                                v207 = arm64g_calculate_condition(3, v205, 64, 0);
                                if (!(v207 & 1))
                                {
LABEL_a84022:
                                    v201 -= 52;
                                    continue;
                                }
                            }
                            v201 = 0;
                            continue;
                        }
                        else
                        {
                            v200 |= v203 << ((char)v201 & 63);
                            v201 = v204;
                        }
                    } while ((v199 += 2, 0x1fe > v199 - 2));
                    v23 += 0x100;
                    v197 += 48;
                    v196 = i - 1;
                } while ((int)i > 1);
            }
            v208 = a2 + v195->field_30;
            v209 = v194[1];
            *v208 = *v194;
            v208[1] = v209;
            if (sub_a85848(v193->field_38))
                goto LABEL_a84078;
        }
        else
        {
            v193 = a3;
            v210 = v193->field_38;
            v211 = v193->field_0->field_48;
            v19 = v1;
            if (sub_a3fe04(a1, v193->field_20, 0))
            {
                iter1 = v23;
                while (1)
                {
                    v213 = 0;
                    v214 = 0;
                    v215 = 0;
                    node = &v15;
                    do
                    {
                        v217 = *(short *)((char *)iter1 + v213);
                        v218 = v215 + 12;
                        if (0x33 < v215)
                        {
                            *node = v217 << ((char)v215 & 63) | v214;
                            node += 1;
                            v219 = v218;
                            if (v218 == 64)
                            {
                                v214 = 0;
                                v220 = arm64g_calculate_condition(3, v219, 64, 0);
                                if (!(v220 & 1))
                                    goto LABEL_a84116;
                            }
                            else
                            {
                                v214 = v217 >> ((char)-v215 & 63);
                                v221 = arm64g_calculate_condition(3, v219, 64, 0);
                                if (!(v221 & 1))
                                {
LABEL_a84116:
                                    v215 -= 52;
                                    continue;
                                }
                            }
                            v215 = 0;
                            continue;
                        }
                        else
                        {
                            v214 |= v217 << ((char)v215 & 63);
                            v215 = v218;
                        }
                    } while ((v213 += 2, 0x1fe > v213 - 2));
                    if (!sub_a3fe10(a1, &v15, 384))
                        break;
                    iter1 += 0x100;
                    if (iter1 >= &v23[0x100 * v211] && sub_a3fe10(a1, v193->field_30, 32))
                    {
                        v222 = 0;
                        v223 = 1;
                        if (sub_a3ff7c(a1, v210, &v8) && v8 == 32)
                        {
LABEL_a84078:
                            v224 = v193->field_58;
                            v225 = a0[3];
                            *v224 = a0[2];
                            v224[1] = v225;
                            v226 = v193->field_58 + 2;
                            *(uint128_t **)v193->padding_60 = v226;
                            if (!(v193->field_68 >> 3 & 1))
                            {
                                sub_a66ec0(v226, 32);
                                *(unsigned long long *)v193->padding_60 = 0;
                            }
                            else
                            {
                                v227 = a0[1];
                                *v226 = *a0;
                                v226[1] = v227;
                            }
                            v223 = 0;
                            v222 = 1;
                            goto LABEL_a841b0;
                        }
                    }
                }
            }
        }
    }
    v222 = 0;
    v223 = 1;
LABEL_a841b0:
    sub_a66ec0(&v9, 33);
    sub_a66ec0(&v12, 64);
    if (v223)
    {
        sub_a368c8();
        sub_a369bc("crypto/ml_kem/ml_kem.c", 1776, "genkey");
        v0 = v19->field_0;
        sub_a36abc(15, 0xc0103, "internal error while generating %s private key");
    }
    if (*(long long *)&g_10002b0 == v16)
        return v222;
    ___stack_chk_fail();
}
