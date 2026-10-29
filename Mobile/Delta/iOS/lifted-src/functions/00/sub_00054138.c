/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x54138..0x5459c (1124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_54138_2 {
    char padding_0[32];
    struct st_54138_1 *field_20;
} st_54138_2;

typedef struct st_54138_3 {
    char padding_0[56];
    long long field_38;
} st_54138_3;

typedef struct st_54138_0 {
    char field_0;
} st_54138_0;

typedef struct st_54138_1 {
    char padding_0[8];
    unsigned int field_8;
} st_54138_1;

extern unsigned long long g_e68950;
extern unsigned long long g_e689c8;
extern unsigned int g_f00b40;

void sub_54138(st_54138_3 *a0, st_54138_2 *a1)
{
    unsigned long long v8;  // x20
    unsigned long long v9;  // x19
    unsigned long v15;  // cc_ndep
    unsigned long v60;  // 4112
    unsigned long v61;  // cc_op
    unsigned long v62;  // cc_dep1
    unsigned long v63;  // cc_dep2
    unsigned long v64;  // 4112
    unsigned long long v65;  // 4152
    unsigned int v66;  // w10
    unsigned long v67;  // 4112
    unsigned long v68;  // cc_op
    unsigned long v69;  // cc_dep1
    unsigned long v16;  // 4112
    unsigned long v70;  // cc_dep2
    unsigned long v71;  // 4112
    unsigned long long v72;  // 4283
    __m128i v73;  // q1
    __m128i v75;  // q2
    uint128_t v76;  // q3
    __m128i v77;  // q3
    __m128i v78;  // q4
    __m128i v79;  // q5
    unsigned long v17;  // cc_op
    __m128i v80;  // q6
    __m128i v81;  // q3
    __m128i v82;  // q3
    __m128i v83;  // q3
    __m128i v84;  // q4
    __m128i v85;  // q3
    unsigned int v86;  // s3
    unsigned long v87;  // 4112
    unsigned long v88;  // cc_op
    unsigned long v89;  // cc_dep1
    unsigned long v18;  // cc_dep1
    unsigned long v90;  // cc_dep2
    unsigned long v91;  // 4112
    unsigned long long v92;  // 4133
    unsigned long long v93;  // d3
    unsigned long long v94;  // x12
    unsigned long v95;  // cc_dep1
    unsigned long long v96;  // 4112
    unsigned long v97;  // 4112
    unsigned long v98;  // cc_op
    unsigned long v99;  // cc_dep1
    unsigned long v19;  // cc_dep2
    unsigned long v100;  // cc_dep2
    unsigned long long v101;  // 4106
    unsigned long v102;  // 4112
    unsigned long long v103;  // 4106
    unsigned int v104;  // w13
    unsigned long v105;  // 4112
    unsigned long v106;  // cc_op
    unsigned long v107;  // cc_dep1
    unsigned long v108;  // cc_dep2
    unsigned long v109;  // 4112
    unsigned long long v20;  // 4112
    unsigned long long v110;  // 4142
    unsigned long long v111;  // x10
    __m128i v112;  // q0
    __m128i v114;  // q1
    uint128_t v116;  // q1
    uint128_t v118;  // q0
    unsigned long v21;  // cc_op
    st_54138_1 *v120;  // x8
    unsigned long v121;  // cc_op
    unsigned long v122;  // cc_dep1
    unsigned long v123;  // cc_dep2
    unsigned long v124;  // cc_ndep
    unsigned long long v125;  // 4112
    unsigned long long v126;  // 4102
    unsigned long v22;  // cc_dep1
    unsigned long long v127;  // 4112
    unsigned long long v128;  // 4102
    unsigned long v23;  // cc_dep2
    unsigned int v129;  // x0
    unsigned long long v10;  // x30
    unsigned long v24;  // 4112
    unsigned long long v25;  // 4112
    unsigned long v26;  // 4112
    unsigned long v27;  // cc_op
    unsigned long v28;  // cc_dep1
    unsigned long v29;  // cc_dep2
    unsigned int v11;  // x0
    unsigned long long v30;  // 4113
    unsigned long v31;  // 4112
    unsigned long long v32;  // 4113
    unsigned int v12;  // w9
    unsigned long v33;  // 4112
    unsigned long v34;  // cc_op
    unsigned long v35;  // cc_dep1
    unsigned long v36;  // cc_dep2
    unsigned long long v37;  // 4112
    unsigned int v13;  // w10
    unsigned long v38;  // 4112
    unsigned long long v39;  // 4112
    unsigned long v40;  // 4112
    unsigned long v41;  // cc_op
    unsigned long v42;  // cc_dep1
    unsigned long v43;  // cc_dep2
    unsigned int v14;  // w11
    unsigned long long v44;  // 4113
    unsigned long v45;  // 4112
    unsigned long long v46;  // 4113
    unsigned long long v47;  // 4112
    unsigned long long v48;  // 4107
    unsigned long long v49;  // 4112
    unsigned long long v50;  // 4107
    unsigned long long v51;  // x8
    unsigned long long v52;  // x10
    __m128i v53;  // q0
    __m128i v54;  // q1
    unsigned int v56;  // w8
    unsigned long v57;  // cc_dep1
    unsigned long long v58;  // x8
    unsigned int v59;  // w15
    st_54138_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_54138_0 *v1;  // [bp-0x30]
    st_54138_2 *v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    v3 = v8;
    v4 = v9;
    v5 = &v7;
    v6 = v10;
    v1 = &v0;
    v2 = a1;
    v0 = &v1;
    v11 = sub_158b8(a0->field_38, &v2);
    if (v11)
    {
        v12 = *(int *)(v11 + 8);
        v13 = v12 - 115;
        v14 = v12 - 113;
        if (2 <= v12 - 0x77)
        {
            v16 = arm64g_calculate_condition(v21 | 32, v22, v23, v15);
            v17 = 3;
            v18 = (v16 & 1 ? v12 : 0x40000000);
            v19 = (v16 & 1 ? 127 : 0);
            v20 = arm64g_calculate_condition(19, v18, v19, 0);
            if (!(v20 & 1))
                goto LABEL_5418a;
LABEL_54189:
            v26 = arm64g_calculate_condition(v17 | 16, v18, v19, 0);
            v27 = 3;
            v28 = (v26 & 1 ? v13 : 0);
            v29 = (v26 & 1 ? 2 : 0);
            v30 = arm64g_calculate_condition(35, v28, v29, 0);
            if (!(v30 & 1))
                goto LABEL_54192;
LABEL_54191:
            v33 = arm64g_calculate_condition(v27 | 32, v28, v29, 0);
            v34 = 3;
            v35 = (v33 & 1 ? v12 : 0x40000000);
            v36 = (v33 & 1 ? 118 : 0);
            v37 = arm64g_calculate_condition(19, v35, v36, 0);
            if (!(v37 & 1))
                goto LABEL_54196;
LABEL_54195:
            v40 = arm64g_calculate_condition(v34 | 16, v35, v36, 0);
            v41 = 3;
            v42 = (v40 & 1 ? v14 : 0);
            v43 = (v40 & 1 ? 2 : 0);
            v44 = arm64g_calculate_condition(35, v42, v43, 0);
            if (!(v44 & 1))
                goto LABEL_5419e;
            goto LABEL_5419d;
        }
        else
        {
            v24 = arm64g_calculate_condition(v21 | 32, v22, v23, v15);
            v17 = 0;
            v18 = (v24 & 1 ? v12 : 0x40000000);
            v19 = (v24 & 1 ? 127 : 0);
            v25 = arm64g_calculate_condition(16, v18, v19, 0);
            if (v25 & 1)
                goto LABEL_54189;
LABEL_5418a:
            v31 = arm64g_calculate_condition(v17 | 16, v18, v19, 0);
            v27 = 0;
            v28 = (v31 & 1 ? v13 : 0);
            v29 = (v31 & 1 ? 2 : 0);
            v32 = arm64g_calculate_condition(32, v28, v29, 0);
            if (v32 & 1)
                goto LABEL_54191;
LABEL_54192:
            v38 = arm64g_calculate_condition(v27 | 32, v28, v29, 0);
            v34 = 0;
            v35 = (v38 & 1 ? v12 : 0x40000000);
            v36 = (v38 & 1 ? 118 : 0);
            v39 = arm64g_calculate_condition(16, v35, v36, 0);
            if (v39 & 1)
                goto LABEL_54195;
LABEL_54196:
            v45 = arm64g_calculate_condition(v34 | 16, v35, v36, 0);
            v41 = 0;
            v42 = (v45 & 1 ? v14 : 0);
            v43 = (v45 & 1 ? 2 : 0);
            v46 = arm64g_calculate_condition(32, v42, v43, 0);
            if (v46 & 1)
            {
LABEL_5419d:
                v47 = arm64g_calculate_condition(v41 | 32, v42, v43, 0);
                v48 = arm64g_calculate_condition(3, (v47 & 1 ? v12 : 0x40000000), (v47 & 1 ? 117 : 0), 0);
                if (!(v48 & 1))
                    goto LABEL_541aa;
                goto LABEL_541a9;
            }
            else
            {
LABEL_5419e:
                v49 = arm64g_calculate_condition(v41 | 32, v42, v43, 0);
                v50 = arm64g_calculate_condition(0, (v49 & 1 ? v12 : 0x40000000), (v49 & 1 ? 117 : 0), 0);
                if (v50 & 1)
                {
LABEL_541a9:
                    v51 = 16;
                }
                else
                {
                    v51 = 8;
LABEL_541aa:
                }
            }
        }
        v52 = 80;
        if (v12 == 95)
            v51 = v52;
        v53 = (__m128i)(CONCAT(v12 | v12 * 0x100000000, v12 | v12 * 0x100000000));
        v54 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn32to16x4(_mm_cmpeq_epi32(v53, _mm_set_epi32(131, 94, 108, 130))));
        v56 = (unsigned int)__dirty_unsupported_Iop_ZeroHI112ofV128(_mm_max_epu16(_mm_max_epu16(_mm_max_epu16(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54))))), _mm_max_epu16(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54)))))), _mm_max_epu16(_mm_max_epu16(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54))))), _mm_max_epu16(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v54, v54), _mm_unpacklo_epi64(v54, v54)))))))) | v12 == 96;
        v57 = v56 & 1;
        v58 = 0x88;
        if (v56 & 1)
            v51 = 0x88;
        v59 = v12 - 5;
        if (v12 != 63)
        {
            v60 = arm64g_calculate_condition(25, v57, 0, 0);
            v61 = 3;
            v62 = (v60 & 1 ? v12 : 0x40000000);
            v63 = (v60 & 1 ? 45 : 0);
        }
        else
        {
            v64 = arm64g_calculate_condition(25, v57, 0, 0);
            v61 = 0;
            v62 = (v64 & 1 ? v12 : 0x40000000);
            v63 = (v64 & 1 ? 45 : 0);
        }
        v65 = arm64g_calculate_condition(v61 | 16, v62, v63, 0);
        v66 = v12 - 79;
        if (v12 != 54)
        {
            v67 = arm64g_calculate_condition(v61 | 16, v62, v63, 0);
            v68 = 3;
            v69 = (v67 & 1 ? v66 : 0);
            v70 = (v67 & 1 ? 2 : 0);
        }
        else
        {
            v71 = arm64g_calculate_condition(v61 | 16, v62, v63, 0);
            v68 = 0;
            v69 = (v71 & 1 ? v66 : 0);
            v70 = (v71 & 1 ? 2 : 0);
        }
        v72 = arm64g_calculate_condition(v68 | 32, v69, v70, 0);
        v73 = __float_as_int(__int_as_float(v12));
        v75 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_and_si128(v53, _mm_set_epi64x(0, 0xfffffffdfffffffe)));
        v76 = _INSERT(_INSERT(v73, 4, v12 & 0xfffffff7), 8, _mm_extract_epi32(v75, 1));
        v77 = (__m128i)_INSERT(v76, 12, _mm_cvtsi128_si32(v75));
        v78 = __dirty_unsupported_Iop_SliceV128(v77, v77, 4);
        v79 = CatEvenLanesV(v77, _mm_unpacklo_epi32(v77, v53));
        v80 = (__m128i)_INSERT(CatEvenLanesV(_mm_unpacklo_epi64(v77, v77), _mm_unpacklo_epi64(v77, v77)), 4, _mm_cvtsi128_si32(v75));
        v81 = (__m128i)_INSERT(v77, 4, _mm_cvtsi128_si32(v77));
        v82 = CatOddLanesV(v81, v81);
        v83 = CatEvenLanesV(_mm_cmpeq_epi32(CatOddLanesV(v81, v81), _mm_set_epi32(64, 66, 0x44, 71)), _mm_cmpeq_epi32(CatEvenLanesV(v77, _mm_unpacklo_epi32(v77, v53)), _mm_set_epi32(72, 76, 81, 78)));
        v84 = CatEvenLanesV(_mm_cmpeq_epi32(_mm_unpackhi_epi32(v78, _mm_unpackhi_epi32(v78, v77)), _mm_set_epi32(2, 4, 41, 46)), _mm_cmpeq_epi32(v80, _mm_set_epi32(43, 48, 58, 62)));
        v85 = CatEvenLanesV(CatEvenLanesV(_mm_cmpeq_epi32(_mm_unpackhi_epi32(v78, _mm_unpackhi_epi32(v78, v77)), _mm_set_epi32(2, 4, 41, 46)), _mm_cmpeq_epi32(v80, _mm_set_epi32(43, 48, 58, 62))), CatEvenLanesV(_mm_cmpeq_epi32(CatOddLanesV(v81, v81), _mm_set_epi32(64, 66, 0x44, 71)), _mm_cmpeq_epi32(CatEvenLanesV(v77, _mm_unpacklo_epi32(v77, v53)), _mm_set_epi32(72, 76, 81, 78))));
        v86 = __dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83))), CatOddLanesV(_mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(CatEvenLanesV(v84, v83), v85), _mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, CatEvenLanesV(_mm_cmpeq_epi32(v82, _mm_set_epi32(64, 66, 0x44, 71)), _mm_cmpeq_epi32(v79, _mm_set_epi32(72, 76, 81, 78)))))), CatOddLanesV(_mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpackhi_epi64(CatEvenLanesV(v84, CatEvenLanesV(_mm_cmpeq_epi32(v82, _mm_set_epi32(64, 66, 0x44, 71)), _mm_cmpeq_epi32(v79, _mm_set_epi32(72, 76, 81, 78)))), v85)))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83))), CatOddLanesV(_mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpackhi_epi64(CatEvenLanesV(v84, CatEvenLanesV(_mm_cmpeq_epi32(v82, _mm_set_epi32(64, 66, 0x44, 71)), _mm_cmpeq_epi32(CatEvenLanesV(v77, _mm_unpacklo_epi32(v77, v53)), _mm_set_epi32(72, 76, 81, 78)))), CatEvenLanesV(v84, v83)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(CatEvenLanesV(v84, v83), v85), _mm_unpackhi_epi64(CatEvenLanesV(v84, CatEvenLanesV(_mm_cmpeq_epi32(v82, _mm_set_epi32(64, 66, 0x44, 71)), _mm_cmpeq_epi32(CatEvenLanesV(v77, _mm_unpacklo_epi32(v77, v53)), _mm_set_epi32(72, 76, 81, 78)))), CatEvenLanesV(v84, v83))), CatOddLanesV(_mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpackhi_epi64(CatEvenLanesV(v84, v83), v85))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83))), CatOddLanesV(_mm_unpackhi_epi64(v85, v85), _mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, CatEvenLanesV(_mm_cmpeq_epi32(v82, _mm_set_epi32(64, 66, 0x44, 71)), _mm_cmpeq_epi32(v79, _mm_set_epi32(72, 76, 81, 78))))))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpackhi_epi64(CatEvenLanesV(v84, v83), v85)), CatOddLanesV(_mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(CatEvenLanesV(v84, CatEvenLanesV(_mm_cmpeq_epi32(v82, _mm_set_epi32(64, 66, 0x44, 71)), _mm_cmpeq_epi32(v79, _mm_set_epi32(72, 76, 81, 78)))), CatEvenLanesV(v84, v83)), _mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83))), CatOddLanesV(_mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, CatEvenLanesV(_mm_cmpeq_epi32(v82, _mm_set_epi32(64, 66, 0x44, 71)), _mm_cmpeq_epi32(CatEvenLanesV(v77, _mm_unpacklo_epi32(v77, v53)), _mm_set_epi32(72, 76, 81, 78))))), _mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpackhi_epi64(v85, CatEvenLanesV(v84, v83))), CatOddLanesV(_mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, CatEvenLanesV(_mm_cmpeq_epi32(v82, _mm_set_epi32(64, 66, 0x44, 71)), _mm_cmpeq_epi32(v79, _mm_set_epi32(72, 76, 81, 78))))), _mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83))), CatEvenLanesV(_mm_unpackhi_epi64(v85, CatEvenLanesV(v84, v83)), _mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, CatEvenLanesV(_mm_cmpeq_epi32(v82, _mm_set_epi32(64, 66, 0x44, 71)), _mm_cmpeq_epi32(v79, _mm_set_epi32(72, 76, 81, 78))))))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(CatEvenLanesV(v84, CatEvenLanesV(_mm_cmpeq_epi32(v82, _mm_set_epi32(64, 66, 0x44, 71)), _mm_cmpeq_epi32(v79, _mm_set_epi32(72, 76, 81, 78)))), v85), _mm_unpackhi_epi64(CatEvenLanesV(v84, CatEvenLanesV(_mm_cmpeq_epi32(v82, _mm_set_epi32(64, 66, 0x44, 71)), _mm_cmpeq_epi32(v79, _mm_set_epi32(72, 76, 81, 78)))), CatEvenLanesV(v84, v83))), CatEvenLanesV(_mm_unpackhi_epi64(CatEvenLanesV(v84, v83), v85), _mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(v85, v85), _mm_unpackhi_epi64(v85, CatEvenLanesV(v84, v83))), CatEvenLanesV(_mm_unpackhi_epi64(CatEvenLanesV(v84, CatEvenLanesV(_mm_cmpeq_epi32(v82, _mm_set_epi32(64, 66, 0x44, 71)), _mm_cmpeq_epi32(CatEvenLanesV(v77, _mm_unpacklo_epi32(v77, v53)), _mm_set_epi32(72, 76, 81, 78)))), CatEvenLanesV(v84, v83)), _mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(CatEvenLanesV(v84, v83), v85), _mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83))), CatEvenLanesV(_mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpackhi_epi64(v85, CatEvenLanesV(v84, v83)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83))), CatEvenLanesV(_mm_unpackhi_epi64(CatEvenLanesV(v84, v83), v85), _mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(CatEvenLanesV(v84, v83), v85), _mm_unpackhi_epi64(CatEvenLanesV(v84, CatEvenLanesV(_mm_cmpeq_epi32(v82, _mm_set_epi32(64, 66, 0x44, 71)), _mm_cmpeq_epi32(v79, _mm_set_epi32(72, 76, 81, 78)))), v85)), CatEvenLanesV(_mm_unpackhi_epi64(v85, CatEvenLanesV(v84, v83)), _mm_unpackhi_epi64(CatEvenLanesV(v84, CatEvenLanesV(_mm_cmpeq_epi32(v82, _mm_set_epi32(64, 66, 0x44, 71)), _mm_cmpeq_epi32(CatEvenLanesV(v77, _mm_unpacklo_epi32(v77, v53)), _mm_set_epi32(72, 76, 81, 78)))), CatEvenLanesV(v84, v83))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83))), CatEvenLanesV(_mm_unpackhi_epi64(v85, CatEvenLanesV(v84, v83)), _mm_unpackhi_epi64(v85, v85))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpackhi_epi64(CatEvenLanesV(v84, CatEvenLanesV(_mm_cmpeq_epi32(v82, _mm_set_epi32(64, 66, 0x44, 71)), _mm_cmpeq_epi32(v79, _mm_set_epi32(72, 76, 81, 78)))), CatEvenLanesV(v84, v83))), CatEvenLanesV(_mm_unpackhi_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, CatEvenLanesV(_mm_cmpeq_epi32(v82, _mm_set_epi32(64, 66, 0x44, 71)), _mm_cmpeq_epi32(v79, _mm_set_epi32(72, 76, 81, 78))))), _mm_unpackhi_epi64(v85, CatEvenLanesV(v84, v83)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83))), CatOddLanesV(_mm_unpacklo_epi64(CatEvenLanesV(v84, v83), v85), _mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83))), CatOddLanesV(_mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpacklo_epi64(CatEvenLanesV(v84, CatEvenLanesV(_mm_cmpeq_epi32(v82, _mm_set_epi32(64, 66, 0x44, 71)), _mm_cmpeq_epi32(v79, _mm_set_epi32(72, 76, 81, 78)))), CatEvenLanesV(v84, v83))), CatOddLanesV(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(CatEvenLanesV(v84, v83), v85))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpacklo_epi64(v85, CatEvenLanesV(v84, v83))), CatOddLanesV(_mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, CatEvenLanesV(_mm_cmpeq_epi32(v82, _mm_set_epi32(64, 66, 0x44, 71)), _mm_cmpeq_epi32(v79, _mm_set_epi32(72, 76, 81, 78))))))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(CatEvenLanesV(v84, v83), v85), _mm_unpacklo_epi64(CatEvenLanesV(v84, v83), v85)), CatOddLanesV(_mm_unpacklo_epi64(CatEvenLanesV(v84, CatEvenLanesV(_mm_cmpeq_epi32(v82, _mm_set_epi32(64, 66, 0x44, 71)), _mm_cmpeq_epi32(v79, _mm_set_epi32(72, 76, 81, 78)))), CatEvenLanesV(v84, v83)), _mm_unpacklo_epi64(v85, CatEvenLanesV(v84, v83)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83))), CatOddLanesV(_mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83))), CatOddLanesV(_mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(v85, CatEvenLanesV(v84, v83)), _mm_unpacklo_epi64(v85, CatEvenLanesV(v84, v83))), CatOddLanesV(_mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpacklo_epi64(CatEvenLanesV(v84, v83), v85)))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpacklo_epi64(v85, CatEvenLanesV(v84, v83))), CatEvenLanesV(_mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, CatEvenLanesV(_mm_cmpeq_epi32(v82, _mm_set_epi32(64, 66, 0x44, 71)), _mm_cmpeq_epi32(v79, _mm_set_epi32(72, 76, 81, 78))))))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83))), CatEvenLanesV(_mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83))), CatEvenLanesV(_mm_unpacklo_epi64(v85, CatEvenLanesV(v84, v83)), _mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83))), CatEvenLanesV(_mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpacklo_epi64(CatEvenLanesV(v84, CatEvenLanesV(_mm_cmpeq_epi32(v82, _mm_set_epi32(64, 66, 0x44, 71)), _mm_cmpeq_epi32(v79, _mm_set_epi32(72, 76, 81, 78)))), CatEvenLanesV(v84, v83)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(CatEvenLanesV(v84, v83), v85), _mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83))), CatEvenLanesV(_mm_unpacklo_epi64(CatEvenLanesV(v84, CatEvenLanesV(_mm_cmpeq_epi32(v82, _mm_set_epi32(64, 66, 0x44, 71)), _mm_cmpeq_epi32(CatEvenLanesV(v77, _mm_unpacklo_epi32(v77, v53)), _mm_set_epi32(72, 76, 81, 78)))), CatEvenLanesV(v84, CatEvenLanesV(_mm_cmpeq_epi32(v82, _mm_set_epi32(64, 66, 0x44, 71)), _mm_cmpeq_epi32(v79, _mm_set_epi32(72, 76, 81, 78))))), _mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, CatEvenLanesV(_mm_cmpeq_epi32(v82, _mm_set_epi32(64, 66, 0x44, 71)), _mm_cmpeq_epi32(v79, _mm_set_epi32(72, 76, 81, 78))))), _mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, CatEvenLanesV(_mm_cmpeq_epi32(v82, _mm_set_epi32(64, 66, 0x44, 71)), _mm_cmpeq_epi32(v79, _mm_set_epi32(72, 76, 81, 78)))))), CatEvenLanesV(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)), _mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83))), CatEvenLanesV(_mm_unpacklo_epi64(CatEvenLanesV(v84, CatEvenLanesV(_mm_cmpeq_epi32(v82, _mm_set_epi32(64, 66, 0x44, 71)), _mm_cmpeq_epi32(v79, _mm_set_epi32(72, 76, 81, 78)))), CatEvenLanesV(v84, v83)), _mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(v85, CatEvenLanesV(v84, v83)), _mm_unpacklo_epi64(CatEvenLanesV(v84, v83), v85)), CatEvenLanesV(_mm_unpacklo_epi64(v85, CatEvenLanesV(v84, v83)), _mm_unpacklo_epi64(CatEvenLanesV(v84, v83), CatEvenLanesV(v84, v83))))))))));
        if (2 <= v12 - 55)
        {
            v87 = arm64g_calculate_condition(v68 | 32, v69, v70, 0);
            v88 = 3;
            v89 = (v87 & 1 ? v59 : 0);
            v90 = (v87 & 1 ? 35 : 0);
        }
        else
        {
            v91 = arm64g_calculate_condition(v68 | 32, v69, v70, 0);
            v88 = 0;
            v89 = (v91 & 1 ? v59 : 0);
            v90 = (v91 & 1 ? 35 : 0);
        }
        v92 = arm64g_calculate_condition(v88 | 32, v89, v90, 0);
        if (!(v92 & 1) || __float_as_int(v86) & 1)
            v51 = 72;
        v93 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi32(v75, _mm_set_epi32(0, 0, 40, 82)));
        v94 = 88;
        if (!(v65 & 1) || v12 == 44 || *(unsigned int *)((void*)&v93 + 4) & 1)
            v51 = v94;
        v95 = v12 - 91;
        v96 = arm64g_calculate_condition(35, v95, 3, 0);
        if (v96 & 1)
        {
            v97 = arm64g_calculate_condition(35, v95, 3, 0);
            v98 = 3;
            v99 = (v97 & 1 ? v12 : 0x40000000);
            v100 = (v97 & 1 ? 0x33 : 0);
            v101 = arm64g_calculate_condition(3, v99, v100, 0);
            if (!(v101 & 1))
                goto LABEL_54302;
            v51 = 128;
LABEL_54301:
        }
        else
        {
            v102 = arm64g_calculate_condition(35, v95, 3, 0);
            v98 = 0;
            v99 = (v102 & 1 ? v12 : 0x40000000);
            v100 = (v102 & 1 ? 0x33 : 0);
            v103 = arm64g_calculate_condition(0, v99, v100, 0);
            if (v103 & 1)
                goto LABEL_54301;
LABEL_54302:
        }
        v104 = v12 - 0x55;
        if (v12 != 90)
        {
            v105 = arm64g_calculate_condition(v98 | 16, v99, v100, 0);
            v106 = 3;
            v107 = (v105 & 1 ? v104 : 0);
            v108 = (v105 & 1 ? 4 : 0);
        }
        else
        {
            v109 = arm64g_calculate_condition(v98 | 16, v99, v100, 0);
            v106 = 0;
            v107 = (v109 & 1 ? v104 : 0);
            v108 = (v109 & 1 ? 4 : 0);
        }
        v110 = arm64g_calculate_condition(v106 | 32, v107, v108, 0);
        v111 = 64;
        if (!(v110 & 1) || !(v72 & 1) || v12 == 84 || (unsigned int)v93 & 1)
            v51 = v111;
        v112 = _mm_add_epi32(v53, _mm_set_epi32(-99, -105, -101, -121));
        v114 = _mm_unpacklo_epi32(v73, _INSERT(v75, 8, _mm_cvtsi128_si64(v112)));
        v116 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn16to8x8(CatEvenLanesV(_mm_cmpeq_epi32(CatEvenLanesV(_mm_unpacklo_epi64(v114, v114), _mm_unpacklo_epi64(v114, v114)), _mm_set_epi32(107, 104, 103, 109)), _mm_cmpeq_epi32(_INSERT(_mm_unpacklo_epi32(v114, v114), 8, _mm_cvtsi128_si32(v114)), _mm_set_epi32(110, 112, 128, 129)))));
        v118 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn32to16x4(CmpGTV(_mm_set_epi32(2, 2, 2, 6), v112)));
        if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v116, v116), _mm_unpacklo_epi64(v116, v116)))))))))) & 1 || (unsigned int)__dirty_unsupported_Iop_ZeroHI112ofV128(_mm_max_epu16(_mm_max_epu16(_mm_max_epu16(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118))))), _mm_max_epu16(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118)))))), _mm_max_epu16(_mm_max_epu16(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118))))), _mm_max_epu16(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v118, v118), _mm_unpacklo_epi64(v118, v118)))))))) & 1 || 2 > v12 - 97)
            v51 = v58;
        goto *((void *)(*(long long *)((char *)&g_e68950 + v51)));
    }
    else
    {
        v120 = v2->field_20;
        if (v120)
        {
            v125 = arm64g_calculate_condition(v121 | 16, v122, v123, v124);
            v126 = arm64g_calculate_condition(3, (v125 & 1 ? v120->field_8 : 0), (v125 & 1 ? g_f00b40 : 0), 0);
            if (v126 & 1)
                goto LABEL_5441c;
        }
        else
        {
            v127 = arm64g_calculate_condition(v121 | 16, v122, v123, v124);
            v128 = arm64g_calculate_condition(0, (v127 & 1 ? v120->field_8 : 0), (v127 & 1 ? g_f00b40 : 0), 0);
            if (v128 & 1)
            {
LABEL_5441c:
                v129 = sub_158b8(&a0[3].padding_0[40], &v120[2].field_8);
                if (v129)
                {
                    sub_531a4(a0, v2, *(long long *)(v129 + 8));
                    goto *((void *)(g_e689c8));
                }
                else
                {
                    goto *((void *)(g_e689c8));
                }
            }
        }
        goto *((void *)(g_e689c8));
    }
}
