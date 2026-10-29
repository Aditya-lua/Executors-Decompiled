/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa8835c..0xa88840 (1252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern void g_defd00;
extern uint128_t g_defe00;

uint128_t * sub_a8835c(uint128_t *a0, uint128_t *a1, uint128_t *a2, unsigned int a3)
{
    uint128_t *v0;  // x11
    uint128_t *v1;  // x12
    unsigned long v6;  // cc_op
    unsigned long long v92;  // 4107
    unsigned long v93;  // 4110
    unsigned long long v94;  // 4107
    unsigned int v95;  // w9
    unsigned long long v96;  // 4110
    unsigned long long v97;  // 4107
    unsigned long long v98;  // 4110
    unsigned long long v99;  // 4107
    unsigned long v100;  // x9
    uint128_t v101;  // q0
    unsigned long v7;  // cc_dep1
    __m128i v102;  // q1
    __m128i v103;  // q2
    unsigned int v104;  // w3
    unsigned long long v105;  // x13
    void* v106;  // x12
    unsigned long long v107;  // x13
    unsigned short *v108;  // x14
    unsigned short *v109;  // x15
    unsigned short *v110;  // x16
    unsigned short *v111;  // x17
    unsigned long v8;  // cc_dep2
    unsigned int v112;  // w4
    unsigned int v113;  // w15
    unsigned int v114;  // w5
    unsigned int v115;  // w14
    unsigned short *v116;  // x16
    void* v117;  // x12
    unsigned short v118;  // x19
    unsigned long long v119;  // w6
    short v120;  // x6
    unsigned long long v121;  // w14
    unsigned long v9;  // cc_ndep
    short v122;  // x14
    unsigned long long k;  // x13
    void* v125;  // x12
    uint128_t *iter;  // x14
    uint128_t *v127;  // x15
    __m128i v128;  // q5
    __m128i v129;  // q4
    uint128_t *v130;  // x15
    __m128i v131;  // q7
    unsigned long v10;  // 4110
    __m128i v132;  // q6
    __m128i v133;  // q17
    __m128i v134;  // q16
    void* v135;  // x12
    uint128_t v136;  // q21
    uint128_t v137;  // q22
    __m128i v139;  // q22
    __m128i v141;  // q21
    __m128i v142;  // q21
    __m128i v143;  // q21
    __m128i v144;  // q20
    __m128i v145;  // q19
    __m128i v147;  // q23
    __m128i v149;  // q21
    __m128i v150;  // q18
    __m128i v151;  // q4
    __m128i v152;  // q5
    __m128i v154;  // q17
    __m128i v156;  // q7
    __m128i v157;  // q19
    unsigned long long v11;  // 4135
    void* v12;  // x8
    unsigned long v13;  // 4110
    unsigned long v14;  // cc_op
    unsigned long v15;  // cc_dep1
    unsigned long v16;  // cc_dep2
    unsigned long long v17;  // 4129
    unsigned long v18;  // x10
    unsigned long v19;  // 4110
    unsigned long long v20;  // 4129
    unsigned long long v21;  // 4110
    unsigned long long v22;  // 4102
    unsigned long long v23;  // 4110
    unsigned long long v24;  // 4102
    unsigned long long i;  // x9
    void* v26;  // x10
    uint128_t v27;  // q0
    __m128i v28;  // q1
    __m128i v29;  // q2
    uint128_t *v30;  // x11
    __m128i v31;  // q5
    __m128i v32;  // q4
    uint128_t *v33;  // x11
    __m128i v34;  // q7
    __m128i v35;  // q6
    void* v36;  // x10
    uint128_t v37;  // q17
    uint128_t v38;  // q18
    __m128i v40;  // q18
    __m128i v42;  // q17
    __m128i v43;  // q17
    __m128i v44;  // q17
    __m128i v45;  // q16
    __m128i v46;  // q18
    __m128i v49;  // q21
    __m128i v50;  // q19
    __m128i v51;  // q20
    unsigned long v2;  // 4110
    __m128i v52;  // q19
    __m128i v54;  // q17
    __m128i v56;  // q6
    __m128i v57;  // q5
    __m128i v58;  // q6
    uint128_t *v59;  // x11
    unsigned long long v60;  // x9
    void* v61;  // x12
    unsigned long v3;  // cc_op
    unsigned long long j;  // x9
    unsigned short *v63;  // x13
    unsigned short *v64;  // x14
    unsigned short *v65;  // x15
    unsigned int v66;  // w16
    unsigned int v67;  // w17
    unsigned int v68;  // w14
    void* v69;  // x12
    unsigned int v70;  // w13
    unsigned short v71;  // x6
    unsigned long v4;  // cc_dep1
    unsigned long long v72;  // w4
    short v73;  // x4
    short v74;  // x13
    unsigned long long v75;  // x14
    unsigned long v76;  // cc_dep1
    uint128_t *v77;  // x10
    unsigned long v78;  // x9
    uint128_t *v79;  // x9
    unsigned long v80;  // 4110
    unsigned long v81;  // cc_op
    unsigned long v5;  // cc_dep2
    unsigned long v82;  // cc_dep1
    unsigned long v83;  // cc_dep2
    unsigned long long v84;  // 4129
    unsigned int v85;  // w11
    unsigned long v86;  // 4110
    unsigned long long v87;  // 4129
    unsigned long v88;  // 4110
    unsigned long v89;  // cc_op
    unsigned long v90;  // cc_dep1
    unsigned long v91;  // cc_dep2

    v0 = a0 + 32;
    v1 = a1 + 32;
    if (a0 < a2 + 32)
    {
        v2 = arm64g_calculate_condition(v6 | 128, v7, v8, v9);
        v3 = 4;
        v4 = (v2 & 1 ? v0 : 0);
        v5 = (v2 & 1 ? a2 : 0);
    }
    else
    {
        v10 = arm64g_calculate_condition(v6 | 128, v7, v8, v9);
        v3 = 0;
        v4 = (v10 & 1 ? v0 : 0);
        v5 = (v10 & 1 ? a2 : 0);
    }
    v11 = arm64g_calculate_condition(v3 | 144, v4, v5, 0);
    v12 = &g_defd00;
    if (a0 < &g_defe00)
    {
        v13 = arm64g_calculate_condition(v3 | 48, v4, v5, 0);
        v14 = 4;
        v15 = (v13 & 1 ? v0 : 0);
        v16 = (v13 & 1 ? &g_defd00 : 0);
        v17 = arm64g_calculate_condition(148, v15, v16, 0);
        v18 = !(v17 & 1);
        if (a1 >= v0)
            goto LABEL_a8839a;
LABEL_a88399:
        v21 = arm64g_calculate_condition(v14 | 128, v15, v16, 0);
        v22 = arm64g_calculate_condition(132, (v21 & 1 ? v1 : 0), (v21 & 1 ? a0 : 0), 0);
        if (!(v22 & 1))
            goto LABEL_a883a0;
    }
    else
    {
        v19 = arm64g_calculate_condition(v3 | 48, v4, v5, 0);
        v14 = 0;
        v15 = (v19 & 1 ? v0 : 0);
        v16 = (v19 & 1 ? &g_defd00 : 0);
        v20 = arm64g_calculate_condition(144, v15, v16, 0);
        v18 = !(v20 & 1);
        if (a1 < v0)
            goto LABEL_a88399;
LABEL_a8839a:
        v23 = arm64g_calculate_condition(v14 | 128, v15, v16, 0);
        v24 = arm64g_calculate_condition(128, (v23 & 1 ? v1 : 0), (v23 & 1 ? a0 : 0), 0);
        if (!(v24 & 1))
        {
LABEL_a883a0:
            if (v11 & 1 && !(v18 & 1))
            {
                i = 0;
                v26 = &g_defd00;
                v27 = CONCAT(21642340209583, 21642340209583);
                v28 = _mm_set1_epi32(0xf2ff);
                v29 = _mm_set1_epi32(0xf2fff2ff);
                do
                {
                    v30 = (char *)a1 + i;
                    v31 = CatOddLanesV(v30[1], *v30);
                    v32 = CatEvenLanesV(v30[1], *v30);
                    v33 = (char *)a2 + i;
                    v34 = CatOddLanesV(v33[1], *v33);
                    v35 = CatEvenLanesV(v33[1], *v33);
                    v36 = v26 + 16;
                    v37 = MullV(_mm_cvtsi128_si64(v34), _mm_cvtsi128_si64(v31));
                    v38 = MullV(_mm_extract_epi64(v34, 1), _mm_extract_epi64(v31, 1));
                    v40 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)v38, (unsigned long long)v27), 24), _mm_srli_epi64(MullV((unsigned long long)v38, (unsigned long long)v27), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)(v38 >> 64), (unsigned long long)(v27 >> 64)), 24), _mm_srli_epi64(MullV((unsigned long long)(v38 >> 64), (unsigned long long)(v27 >> 64)), 24))));
                    v42 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)v37, (unsigned long long)v27), 24), _mm_srli_epi64(MullV((unsigned long long)v37, (unsigned long long)v27), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)(v37 >> 64), (unsigned long long)(v27 >> 64)), 24), _mm_srli_epi64(MullV((unsigned long long)(v37 >> 64), (unsigned long long)(v27 >> 64)), 24))));
                    v43 = CatEvenLanesV(_mm_add_epi32(_mm_mullo_epi32(v40, v28), MullV(_mm_extract_epi64(v34, 1), _mm_extract_epi64(v31, 1))), _mm_add_epi32(_mm_mullo_epi32(v42, v28), MullV(_mm_cvtsi128_si64(v34), _mm_cvtsi128_si64(v31))));
                    v44 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(v43, v29)), v43), _mm_max_epi16(_mm_add_epi16(v43, v29), _mm_setzero_si128()));
                    v45 = _mm_add_epi32(MullV(_mm_cvtsi128_si64(v44), (long long)*(int128_t *)v26), MullV(_mm_cvtsi128_si64(v35), _mm_cvtsi128_si64(v32)));
                    v46 = _mm_add_epi32(MullV(_mm_extract_epi64(v44, 1), (long long)((uint128_t)(*(int128_t *)v26) >> 64)), MullV(_mm_extract_epi64(v35, 1), _mm_extract_epi64(v32, 1)));
                    v49 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v46), (unsigned long long)v27), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v46), (unsigned long long)v27), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v46, 1), (unsigned long long)(v27 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v46, 1), (unsigned long long)(v27 >> 64)), 24))));
                    v50 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v45), (unsigned long long)v27), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v45), (unsigned long long)v27), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v45, 1), (unsigned long long)(v27 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v45, 1), (unsigned long long)(v27 >> 64)), 24))));
                    v51 = _mm_add_epi32(MullV(_mm_cvtsi128_si64(v34), _mm_cvtsi128_si64(v32)), MullV(_mm_cvtsi128_si64(v31), _mm_cvtsi128_si64(v35)));
                    v52 = _mm_add_epi32(MullV(_mm_extract_epi64(v34, 1), _mm_extract_epi64(v32, 1)), MullV(_mm_extract_epi64(v31, 1), _mm_extract_epi64(v35, 1)));
                    v54 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v52), (unsigned long long)v27), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v52), (unsigned long long)v27), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v52, 1), (unsigned long long)(v27 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v52, 1), (unsigned long long)(v27 >> 64)), 24))));
                    v56 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v51), (unsigned long long)v27), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v51), (unsigned long long)v27), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v51, 1), (unsigned long long)(v27 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v51, 1), (unsigned long long)(v27 >> 64)), 24))));
                    v57 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(CatEvenLanesV(_mm_add_epi32(v46, _mm_mullo_epi32(v49, v28)), _mm_add_epi32(v45, _mm_mullo_epi32(v50, v28))), v29)), CatEvenLanesV(_mm_add_epi32(v46, _mm_mullo_epi32(v49, v28)), _mm_add_epi32(v45, _mm_mullo_epi32(v50, v28)))), _mm_max_epi16(_mm_add_epi16(CatEvenLanesV(_mm_add_epi32(v46, _mm_mullo_epi32(v49, v28)), _mm_add_epi32(v45, _mm_mullo_epi32(v50, v28))), v29), _mm_setzero_si128()));
                    v58 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(CatEvenLanesV(_mm_add_epi32(v52, _mm_mullo_epi32(v54, v28)), _mm_add_epi32(v51, _mm_mullo_epi32(v56, v28))), v29)), CatEvenLanesV(_mm_add_epi32(v52, _mm_mullo_epi32(v54, v28)), _mm_add_epi32(v51, _mm_mullo_epi32(v56, v28)))), _mm_max_epi16(_mm_add_epi16(CatEvenLanesV(_mm_add_epi32(v52, _mm_mullo_epi32(v54, v28)), _mm_add_epi32(v51, _mm_mullo_epi32(v56, v28))), v29), _mm_setzero_si128()));
                    v59 = (char *)a0 + i;
                    v59[1] = _mm_unpackhi_epi16(v57, v58);
                    *v59 = _mm_unpacklo_epi16(v57, v58);
                    i += 32;
                    v26 = v36;
                } while (i != 0x200);
                goto LABEL_a885a8;
            }
        }
    }
    v60 = 0;
    v61 = &g_defd00;
    do
    {
        j = v60;
        v63 = (char *)a2 + j;
        v64 = (char *)a1 + j;
        v65 = (char *)a0 + j;
        v66 = *v64;
        v67 = *v63;
        v68 = v64[1];
        v69 = v61 + 2;
        v70 = v63[1];
        v71 = (unsigned short)v68 * (unsigned short)v70 + 0xf2ff * (unsigned short)((v68 * v70) * 5039 >> 24);
        v72 = v66 * v67 + *(short *)v61 * ((v71 & v71 - 3329 >> 15 | v71 - 3329 & ~((short)(v71 - 3329) >> 31)) & 0xffff);
        v73 = (unsigned short)v72 + 0xf2ff * (unsigned short)(v72 * 5039 >> 24);
        *v65 = v73 & (unsigned short)(v73 - 3329) >> 15 | v73 - 3329 & (short)~(v73 - 3329 >> 31);
        v74 = (unsigned short)v67 * (unsigned short)v68 + (unsigned short)v66 * (unsigned short)v70 + 0xf2ff * (unsigned short)((v67 * v68 + v66 * v70) * 5039 >> 24);
        v75 = j + 4;
        v65[1] = v74 & (unsigned short)(v74 - 3329) >> 15 | v74 - 3329 & (short)~(v74 - 3329 >> 31);
        v61 = v69;
        v60 = v75;
    } while (j < 508);
LABEL_a885a8:
    v76 = a3;
    if ((int)a3 < 2)
        return a0;
    v77 = a0 + 32;
    v78 = (((a3 - 2) * 0x200 | a3 - 2 >> 55) & 0x1fffffffe00 & 0x1ffffffffff) + 0x400;
    v79 = (char *)a2 + v78;
    if (a0 < (char *)a1 + v78)
    {
        v80 = arm64g_calculate_condition(131, v76, 2, 0);
        v81 = 4;
        v82 = (v80 & 1 ? a1 : 0x20000000);
        v83 = (v80 & 1 ? a0 : 0);
        v84 = arm64g_calculate_condition(36, v82, v83, 0);
        v85 = !(v84 & 1);
        if (a0 >= v79)
            goto LABEL_a885d6;
LABEL_a885d5:
        v88 = arm64g_calculate_condition(v81 | 128, v82, v83, 0);
        v89 = 4;
        v90 = (v88 & 1 ? a2 : 0x20000000);
        v91 = (v88 & 1 ? a0 : 0);
        v92 = arm64g_calculate_condition(36, v90, v91, 0);
        if (!(v92 & 1))
            goto LABEL_a885da;
LABEL_a885d9:
        v95 = v85;
    }
    else
    {
        v86 = arm64g_calculate_condition(131, v76, 2, 0);
        v81 = 0;
        v82 = (v86 & 1 ? a1 : 0x20000000);
        v83 = (v86 & 1 ? a0 : 0);
        v87 = arm64g_calculate_condition(32, v82, v83, 0);
        v85 = !(v87 & 1);
        if (a0 < v79)
            goto LABEL_a885d5;
LABEL_a885d6:
        v93 = arm64g_calculate_condition(v81 | 128, v82, v83, 0);
        v89 = 0;
        v90 = (v93 & 1 ? a2 : 0x20000000);
        v91 = (v93 & 1 ? a0 : 0);
        v94 = arm64g_calculate_condition(32, v90, v91, 0);
        if (v94 & 1)
            goto LABEL_a885d9;
LABEL_a885da:
        v95 = 1;
    }
    if (a0 < &g_defe00)
    {
        v96 = arm64g_calculate_condition(v89 | 48, v90, v91, 0);
        v97 = arm64g_calculate_condition(148, (v96 & 1 ? v77 : 0), (v96 & 1 ? &g_defd00 : 0), 0);
        if (!(v97 & 1))
            goto LABEL_a885ea;
LABEL_a885e9:
        v100 = v95;
    }
    else
    {
        v98 = arm64g_calculate_condition(v89 | 48, v90, v91, 0);
        v99 = arm64g_calculate_condition(144, (v98 & 1 ? v77 : 0), (v98 & 1 ? &g_defd00 : 0), 0);
        if (v99 & 1)
            goto LABEL_a885e9;
LABEL_a885ea:
        v100 = 1;
    }
    v101 = CONCAT(21642340209583, 21642340209583);
    v102 = _mm_set1_epi32(0xf2ff);
    v103 = _mm_set1_epi32(0xf2fff2ff);
    do
    {
        v104 = a3;
        if (v100 & 1)
        {
            v105 = 0x200;
            v106 = v12;
            do
            {
                v107 = v105;
                v108 = (char *)a2 + v107;
                v109 = (char *)a1 + v107;
                v110 = (char *)a0 + v107;
                v111 = (char *)v110 - 0x200;
                v112 = *v109;
                v113 = v109[1];
                v114 = v108[1];
                v115 = *v108;
                v116 = (char *)v110 - 0x1fe;
                v117 = v106 + 2;
                v118 = (unsigned short)v113 * (unsigned short)v114 + 0xf2ff * (unsigned short)((v113 * v114) * 5039 >> 24);
                v119 = *v111 + v112 * v115 + *(short *)v106 * ((v118 & v118 - 3329 >> 15 | v118 - 3329 & ~((short)(v118 - 3329) >> 31)) & 0xffff);
                v120 = (unsigned short)v119 + 0xf2ff * (unsigned short)(v119 * 5039 >> 24);
                v121 = v115 * v113 + v112 * v114 + *v116;
                v122 = (unsigned short)v121 + 0xf2ff * (unsigned short)(v121 * 5039 >> 24);
                *v111 = v120 & (unsigned short)(v120 - 3329) >> 15 | v120 - 3329 & (short)~(v120 - 3329 >> 31);
                *v116 = v122 & (unsigned short)(v122 - 3329) >> 15 | v122 - 3329 & (short)~(v122 - 3329 >> 31);
                v106 = v117;
                v105 = v107 + 4;
            } while (v107 - 0x200 < 508);
        }
        else
        {
            k = 0x200;
            v125 = v12;
            iter = a0;
            do
            {
                v127 = (char *)a1 + k;
                v128 = CatOddLanesV(v127[1], *v127);
                v129 = CatEvenLanesV(v127[1], *v127);
                v130 = (char *)a2 + k;
                v131 = CatOddLanesV(v130[1], *v130);
                v132 = CatEvenLanesV(v130[1], *v130);
                v133 = CatOddLanesV(iter[1], *iter);
                v134 = CatEvenLanesV(iter[1], *iter);
                v135 = v125 + 16;
                v136 = MullV(_mm_cvtsi128_si64(v131), _mm_cvtsi128_si64(v128));
                v137 = MullV(_mm_extract_epi64(v131, 1), _mm_extract_epi64(v128, 1));
                v139 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)v137, (unsigned long long)v101), 24), _mm_srli_epi64(MullV((unsigned long long)v137, (unsigned long long)v101), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)(v137 >> 64), (unsigned long long)(v101 >> 64)), 24), _mm_srli_epi64(MullV((unsigned long long)(v137 >> 64), (unsigned long long)(v101 >> 64)), 24))));
                v141 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)v136, (unsigned long long)v101), 24), _mm_srli_epi64(MullV((unsigned long long)v136, (unsigned long long)v101), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV((unsigned long long)(v136 >> 64), (unsigned long long)(v101 >> 64)), 24), _mm_srli_epi64(MullV((unsigned long long)(v136 >> 64), (unsigned long long)(v101 >> 64)), 24))));
                v142 = CatEvenLanesV(_mm_add_epi32(_mm_mullo_epi32(v139, v102), MullV(_mm_extract_epi64(v131, 1), _mm_extract_epi64(v128, 1))), _mm_add_epi32(_mm_mullo_epi32(v141, v102), MullV(_mm_cvtsi128_si64(v131), _mm_cvtsi128_si64(v128))));
                v143 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(v142, v103)), v142), _mm_max_epi16(_mm_add_epi16(v142, v103), _mm_setzero_si128()));
                v144 = _mm_add_epi32(_mm_add_epi32(MullV(_mm_cvtsi128_si64(v132), _mm_cvtsi128_si64(v129)), _mm_srli_epi32(_mm_unpacklo_epi16(v134, v134), 16)), MullV(_mm_cvtsi128_si64(v143), (long long)*(int128_t *)v125));
                v145 = _mm_add_epi32(_mm_add_epi32(_mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v134), 16), MullV(_mm_extract_epi64(v132, 1), _mm_extract_epi64(v129, 1))), MullV(_mm_extract_epi64(v143, 1), (long long)((uint128_t)(*(int128_t *)v125) >> 64)));
                v147 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v145), (unsigned long long)v101), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v145), (unsigned long long)v101), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v145, 1), (unsigned long long)(v101 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v145, 1), (unsigned long long)(v101 >> 64)), 24))));
                v149 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v144), (unsigned long long)v101), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v144), (unsigned long long)v101), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v144, 1), (unsigned long long)(v101 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v144, 1), (unsigned long long)(v101 >> 64)), 24))));
                v150 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(CatEvenLanesV(_mm_add_epi32(v145, _mm_mullo_epi32(v147, v102)), _mm_add_epi32(v144, _mm_mullo_epi32(v149, v102))), v103)), CatEvenLanesV(_mm_add_epi32(v145, _mm_mullo_epi32(v147, v102)), _mm_add_epi32(v144, _mm_mullo_epi32(v149, v102)))), _mm_max_epi16(_mm_add_epi16(CatEvenLanesV(_mm_add_epi32(v145, _mm_mullo_epi32(v147, v102)), _mm_add_epi32(v144, _mm_mullo_epi32(v149, v102))), v103), _mm_setzero_si128()));
                v151 = _mm_add_epi32(_mm_add_epi32(MullV(_mm_cvtsi128_si64(v131), _mm_cvtsi128_si64(v129)), MullV(_mm_cvtsi128_si64(v128), _mm_cvtsi128_si64(v132))), _mm_srli_epi32(_mm_unpacklo_epi16(v133, v133), 16));
                v152 = _mm_add_epi32(_mm_add_epi32(MullV(_mm_extract_epi64(v131, 1), _mm_extract_epi64(v129, 1)), MullV(_mm_extract_epi64(v128, 1), _mm_extract_epi64(v132, 1))), _mm_srli_epi32(_mm_unpackhi_epi16(v133, v133), 16));
                v154 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v152), (unsigned long long)v101), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v152), (unsigned long long)v101), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v152, 1), (unsigned long long)(v101 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v152, 1), (unsigned long long)(v101 >> 64)), 24))));
                v156 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi64(MullV(_mm_cvtsi128_si64(v151), (unsigned long long)v101), 24), _mm_srli_epi64(MullV(_mm_cvtsi128_si64(v151), (unsigned long long)v101), 24)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi64(MullV(_mm_extract_epi64(v151, 1), (unsigned long long)(v101 >> 64)), 24), _mm_srli_epi64(MullV(_mm_extract_epi64(v151, 1), (unsigned long long)(v101 >> 64)), 24))));
                v157 = _mm_or_si128(_mm_and_si128(_mm_cmpgt_epi16(_mm_setzero_si128(), _mm_add_epi16(CatEvenLanesV(_mm_add_epi32(v152, _mm_mullo_epi32(v154, v102)), _mm_add_epi32(v151, _mm_mullo_epi32(v156, v102))), v103)), CatEvenLanesV(_mm_add_epi32(v152, _mm_mullo_epi32(v154, v102)), _mm_add_epi32(v151, _mm_mullo_epi32(v156, v102)))), _mm_max_epi16(_mm_add_epi16(CatEvenLanesV(_mm_add_epi32(v152, _mm_mullo_epi32(v154, v102)), _mm_add_epi32(v151, _mm_mullo_epi32(v156, v102))), v103), _mm_setzero_si128()));
                iter[1] = _mm_unpackhi_epi16(v150, v157);
                *iter = _mm_unpacklo_epi16(v150, v157);
                iter += 2;
                k += 32;
                v125 = v135;
            } while (k != 0x400);
        }
    } while ((a1 += 32, a2 += 32, a3 = v104 - 1, (int)v104 > 2));
    return a0;
}
