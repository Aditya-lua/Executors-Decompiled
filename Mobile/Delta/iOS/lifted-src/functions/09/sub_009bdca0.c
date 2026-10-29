/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9bdca0..0x9be260 (1472 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9bdca0_0 {
    char padding_0[240];
    unsigned int field_f0;
} st_9bdca0_0;


void sub_9bdca0(void* a0, void* a1, unsigned long long a2, st_9bdca0_0 *a3, long long a4, long long a5, unsigned long a6, unsigned long a7, char a8, unsigned long a9, unsigned long a10, unsigned long a11)
{
    unsigned long long v19;  // x30
    unsigned long long v20;  // x19
    unsigned long long v29;  // d13
    __m128i v119;  // q6
    uint128_t *v120;  // x0
    __m128i v121;  // q16
    uint128_t *v122;  // x0
    __m128i v123;  // q17
    void* v124;  // x21
    void* v125;  // x21
    void* v126;  // x21
    void* v127;  // x21
    void* v128;  // x21
    unsigned long long v30;  // d14
    void* v129;  // x21
    uint128_t *v130;  // x0
    __m128i v131;  // q16
    void* v132;  // x21
    void* v133;  // x21
    void* v134;  // x21
    void* v135;  // x21
    void* v136;  // x21
    void* v137;  // x21
    void* v138;  // x21
    uint128_t v31;  // q15
    void* v139;  // x21
    void* v140;  // x21
    void* v141;  // x21
    void* v142;  // x21
    void* v143;  // x21
    void* v144;  // x21
    void* v145;  // x21
    void* v146;  // x21
    __m128i v147;  // q13
    uint128_t v148;  // q14
    void* v32;  // x20
    __m128i v149;  // q14
    unsigned long long v150;  // x22
    unsigned long long v151;  // 4106
    void* v152;  // x6
    unsigned long long i;  // x22
    void* v154;  // x20
    char v155;  // x1
    __m128i v157;  // q13
    void* iter;  // x21
    long long v34;  // x0
    __m128i v35;  // q11
    unsigned long v36;  // x1
    uint128_t v37;  // q7
    unsigned long long v38;  // x22
    unsigned long long v21;  // x20
    void* node;  // x20
    unsigned long long v40;  // x22
    void* v41;  // x20
    void* v43;  // x20
    __m128i v44;  // q12
    __m128i v45;  // q1
    __m128i v47;  // q13
    uint128_t *v48;  // x20
    unsigned long long v22;  // x22
    __m128i v49;  // q4
    __m128i v50;  // q2
    uint128_t *v51;  // x20
    uint128_t *v52;  // x20
    __m128i v53;  // q7
    uint128_t *v54;  // x20
    __m128i v55;  // q14
    __m128i v56;  // q16
    uint128_t *v57;  // x20
    __m128i v58;  // q3
    unsigned long long v23;  // x23
    __m128i v59;  // q15
    __m128i v60;  // q7
    __m128i v61;  // q4
    __m128i v63;  // q9
    __m128i v64;  // q5
    __m128i v66;  // q10
    unsigned long long v24;  // d8
    uint128_t *v69;  // x0
    __m128i v70;  // q8
    uint128_t *v71;  // x0
    __m128i v72;  // q9
    uint128_t *v73;  // x0
    __m128i v74;  // q10
    void* v75;  // x21
    void* v76;  // x21
    void* v77;  // x21
    void* v78;  // x21
    unsigned long long v25;  // d9
    void* v79;  // x21
    void* v80;  // x21
    void* v81;  // x21
    unsigned long long v82;  // 4175
    unsigned long long v83;  // x22
    unsigned long long v84;  // 4106
    __m128i v85;  // q11
    unsigned long long v86;  // x22
    __m128i v87;  // q0
    unsigned long long v26;  // d10
    __m128i v89;  // q12
    __m128i v91;  // q13
    unsigned long long v92;  // 4163
    __m128i v93;  // q2
    __m128i v94;  // q1
    void* v95;  // x20
    __m128i v96;  // q14
    unsigned long long v97;  // 4131
    unsigned long long v27;  // d11
    __m128i v99;  // q4
    __m128i v100;  // q0
    unsigned long long v101;  // x22
    __m128i v102;  // q15
    unsigned long long v103;  // 4135
    __m128i v104;  // q4
    __m128i v105;  // q3
    __m128i v106;  // q6
    __m128i v107;  // q1
    __m128i v108;  // q16
    unsigned long long v28;  // d12
    unsigned long long v109;  // 4135
    __m128i v110;  // q5
    __m128i v111;  // q6
    __m128i v112;  // q4
    __m128i v113;  // q2
    unsigned long long v114;  // x22
    unsigned long long v115;  // 4141
    __m128i v116;  // q7
    __m128i v117;  // q3
    unsigned long long v118;  // 4128
    uint128_t v0;  // [bp-0xd0]
    char *v1;  // [bp-0xc0]
    unsigned long long v2;  // [bp-0xb8]
    __m128i v3;  // [bp-0xb0]
    __m128i v4;  // [bp-0xa0]
    __m128i v5;  // [bp-0x90]
    __m128i v6;  // [bp-0x80]
    unsigned long long v7;  // [bp-0x70]
    unsigned long long v8;  // [bp-0x68]
    unsigned long long v9;  // [bp-0x58]
    unsigned long long v10;  // [bp-0x50]
    unsigned long long v11;  // [bp-0x40]
    unsigned long long v12;  // [bp-0x38]
    unsigned long long v13;  // [bp-0x30]
    unsigned long long v14;  // [bp-0x28]
    unsigned long long v15;  // [bp-0x20]
    unsigned long long v16;  // [bp-0x18]
    unsigned long long v17;  // [bp-0x10]
    unsigned long v18;  // [bp-0x8]

    v1 = &a8;
    v2 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = v27;
    v15 = v28;
    v16 = v29;
    v17 = v30;
    v18 = v31;
    v32 = a0;
    iter = a1;
    v34 = sub_9b8de4(a5, &v0, a4);
    v35 = v0;
    v36 = a3->field_f0;
    xsp = (int)&(&x21)[-32 * v36];
    sub_9bd640(v34, v36, a4);
    *(uint128_t *)xsp = v37 ^ v31;
    v38 = a2 - 128;
    node = v32;
    v40 = v38;
    if (a2 >= 128)
    {
        do
        {
            v41 = v32 + 16;
            v43 = v41 + 16;
            v44 = _mm_xor_si128(__dirty_unsupported_Iop_SliceV128(_mm_and_si128(SarNV(v35, 63), _mm_set_epi64x(135, 1)), _mm_and_si128(SarNV(v35, 63), _mm_set_epi64x(135, 1)), 8), _mm_add_epi64(v35, v35));
            v45 = _mm_xor_si128(v44, *(int128_t *)v41);
            v47 = _mm_xor_si128(__dirty_unsupported_Iop_SliceV128(~_mm_cmpeq_epi64(_mm_and_si128(v35, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, ~_mm_cmpeq_epi64(_mm_and_si128(v35, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, 8), _mm_add_epi64(v44, v44));
            v48 = v43 + 16;
            v49 = __dirty_unsupported_Iop_SliceV128(~_mm_cmpeq_epi64(_mm_and_si128(v44, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, ~_mm_cmpeq_epi64(_mm_and_si128(v44, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, 8);
            v50 = _mm_xor_si128(v47, *(int128_t *)v43);
            v51 = v48 + 1;
            v52 = v51 + 1;
            v53 = __dirty_unsupported_Iop_SliceV128(~_mm_cmpeq_epi64(_mm_and_si128(v47, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, ~_mm_cmpeq_epi64(_mm_and_si128(v47, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, 8);
            v54 = v52 + 1;
            v55 = _mm_xor_si128(v49, _mm_add_epi64(v47, v47));
            v56 = *v54;
            v57 = v54 + 1;
            v58 = _mm_xor_si128(v55, *v48);
            v59 = _mm_xor_si128(v53, _mm_add_epi64(v55, v55));
            v60 = *v57;
            node = v57 + 1;
            v61 = _mm_xor_si128(v59, *v51);
            v63 = _mm_xor_si128(__dirty_unsupported_Iop_SliceV128(~_mm_cmpeq_epi64(_mm_and_si128(v55, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, ~_mm_cmpeq_epi64(_mm_and_si128(v55, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, 8), _mm_add_epi64(v59, v59));
            v64 = _mm_xor_si128(v63, *v52);
            v3 = v63;
            v66 = _mm_xor_si128(__dirty_unsupported_Iop_SliceV128(~_mm_cmpeq_epi64(_mm_and_si128(v59, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, ~_mm_cmpeq_epi64(_mm_and_si128(v59, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, 8), _mm_add_epi64(v63, v63));
            v4 = v66;
            v5 = _mm_xor_si128(__dirty_unsupported_Iop_SliceV128(~_mm_cmpeq_epi64(_mm_and_si128(v63, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, ~_mm_cmpeq_epi64(_mm_and_si128(v63, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, 8), _mm_add_epi64(v66, v66));
            v6 = _mm_xor_si128(__dirty_unsupported_Iop_SliceV128(~_mm_cmpeq_epi64(_mm_and_si128(v66, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, ~_mm_cmpeq_epi64(_mm_and_si128(v66, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, 8), _mm_add_epi64(v5, v5));
            v69 = sub_9bd030(&v3);
            v70 = *v69;
            v71 = v69 + 1;
            v72 = *v71;
            v73 = v71 + 1;
            v74 = *v73;
            v40 = v38 - 128;
            *(__m128i *)iter = _mm_xor_si128(v35, _mm_xor_si128(v35, *(int128_t *)v32));
            v75 = iter + 16;
            v35 = v73[1];
            *(__m128i *)v75 = _mm_xor_si128(v44, v45);
            v76 = v75 + 16;
            *(__m128i *)v76 = _mm_xor_si128(v47, v61);
            v77 = v76 + 16;
            *(__m128i *)v77 = _mm_xor_si128(v55, _mm_xor_si128(v66, v56));
            v78 = v77 + 16;
            *(__m128i *)v78 = _mm_xor_si128(v59, v58);
            v79 = v78 + 16;
            *(__m128i *)v79 = _mm_xor_si128(v70, _mm_xor_si128(v5, v60));
            v80 = v79 + 16;
            *(__m128i *)v80 = _mm_xor_si128(v72, v50);
            v81 = v80 + 16;
            *(__m128i *)v81 = _mm_xor_si128(v74, v64);
            iter = v81 + 16;
            v82 = arm64g_calculate_condition(84, v38, 128, 0);
            v32 = node;
            v38 = v40;
        } while (v82 & 1);
    }
    v83 = v40 + 112;
    v84 = arm64g_calculate_condition(66, v40, 112, 0);
    v85 = v35;
    if (!(v84 & 1))
    {
        v86 = v83 - 16;
        v87 = *(int128_t *)node;
        node += 16;
        v89 = _mm_xor_si128(__dirty_unsupported_Iop_SliceV128(_mm_and_si128(SarNV(v35, 63), _mm_set_epi64x(135, 1)), _mm_and_si128(SarNV(v35, 63), _mm_set_epi64x(135, 1)), 8), _mm_add_epi64(v35, v35));
        v91 = _mm_xor_si128(__dirty_unsupported_Iop_SliceV128(~_mm_cmpeq_epi64(_mm_and_si128(v35, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, ~_mm_cmpeq_epi64(_mm_and_si128(v35, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, 8), _mm_add_epi64(v89, v89));
        v92 = arm64g_calculate_condition(0x44, v83, 16, 0);
        if (!(v92 & 1))
        {
            v93 = __dirty_unsupported_Iop_SliceV128(~_mm_cmpeq_epi64(_mm_and_si128(v89, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, ~_mm_cmpeq_epi64(_mm_and_si128(v89, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, 8);
            v94 = *(int128_t *)node;
            v95 = node + 16;
            v83 = v86 - 16;
            v96 = _mm_xor_si128(v93, _mm_add_epi64(v91, v91));
            v97 = arm64g_calculate_condition(0x44, v86, 16, 0);
            if (!(v97 & 1))
            {
                v99 = _mm_add_epi64(v96, v96);
                node = v95 + 16;
                v100 = _mm_xor_si128(v35, v87);
                v101 = v83 - 16;
                v102 = _mm_xor_si128(__dirty_unsupported_Iop_SliceV128(~_mm_cmpeq_epi64(_mm_and_si128(v91, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, ~_mm_cmpeq_epi64(_mm_and_si128(v91, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, 8), v99);
                v103 = arm64g_calculate_condition(0x44, v83, 16, 0);
                if (!(v103 & 1))
                {
                    v104 = __dirty_unsupported_Iop_SliceV128(~_mm_cmpeq_epi64(_mm_and_si128(v96, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, ~_mm_cmpeq_epi64(_mm_and_si128(v96, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, 8);
                    v105 = *(int128_t *)node;
                    node += 16;
                    v106 = ~_mm_cmpeq_epi64(_mm_and_si128(v102, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128());
                    v107 = _mm_xor_si128(v89, v94);
                    v83 = v101 - 16;
                    v108 = _mm_xor_si128(v104, _mm_add_epi64(v102, v102));
                    v109 = arm64g_calculate_condition(0x44, v101, 16, 0);
                    if (!(v109 & 1))
                    {
                        v110 = __dirty_unsupported_Iop_SliceV128(_mm_and_si128(v106, _mm_set_epi64x(135, 1)), _mm_and_si128(v106, _mm_set_epi64x(135, 1)), 8);
                        v111 = _mm_add_epi64(v108, v108);
                        v112 = *(int128_t *)node;
                        node += 16;
                        v113 = _mm_xor_si128(v91, *(int128_t *)v95);
                        v3 = v108;
                        v114 = v83 - 16;
                        v115 = arm64g_calculate_condition(0x44, v83, 16, 0);
                        if (!(v115 & 1))
                        {
                            v116 = __dirty_unsupported_Iop_SliceV128(~_mm_cmpeq_epi64(_mm_and_si128(v108, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, ~_mm_cmpeq_epi64(_mm_and_si128(v108, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, 8);
                            node += 16;
                            v117 = _mm_xor_si128(v96, v105);
                            v4 = _mm_xor_si128(v110, v111);
                            v83 = v114 - 16;
                            v118 = arm64g_calculate_condition(0x44, v114, 16, 0);
                            if (!(v118 & 1))
                            {
                                v119 = *(int128_t *)node;
                                node += 16;
                                v5 = _mm_xor_si128(v116, _mm_add_epi64(v4, v4));
                                v83 -= 16;
                                v120 = sub_9bd030(&v3);
                                v121 = *v120;
                                v122 = v120 + 1;
                                v123 = *v122;
                                v85 = v122[1];
                                *(__m128i *)iter = _mm_xor_si128(v35, v100);
                                v124 = iter + 16;
                                *(__m128i *)v124 = _mm_xor_si128(v89, v107);
                                v125 = v124 + 16;
                                *(__m128i *)v125 = _mm_xor_si128(v91, _mm_xor_si128(v102, v112));
                                v126 = v125 + 16;
                                *(__m128i *)v126 = _mm_xor_si128(v96, _mm_xor_si128(v4, v119));
                                v127 = v126 + 16;
                                *(__m128i *)v127 = _mm_xor_si128(v102, v117);
                                v128 = v127 + 16;
                                *(__m128i *)v128 = _mm_xor_si128(v121, v116);
                                v129 = v128 + 16;
                                *(__m128i *)v129 = _mm_xor_si128(v123, v113);
                                iter = v129 + 16;
                            }
                            else
                            {
                                v130 = sub_9bd030(&v3);
                                v131 = *v130;
                                v85 = v130[1];
                                *(__m128i *)iter = _mm_xor_si128(v35, v100);
                                v132 = iter + 16;
                                *(__m128i *)v132 = _mm_xor_si128(v89, v107);
                                v133 = v132 + 16;
                                *(__m128i *)v133 = _mm_xor_si128(v91, _mm_xor_si128(v102, v112));
                                v134 = v133 + 16;
                                *(__m128i *)v134 = _mm_xor_si128(v96, v111);
                                v135 = v134 + 16;
                                *(__m128i *)v135 = _mm_xor_si128(v102, v117);
                                v136 = v135 + 16;
                                *(__m128i *)v136 = _mm_xor_si128(v131, v116);
                                iter = v136 + 16;
                            }
                        }
                        else
                        {
                            v85 = *(int128_t *)sub_9bd030(&v3);
                            *(__m128i *)iter = _mm_xor_si128(v35, v100);
                            v137 = iter + 16;
                            *(__m128i *)v137 = _mm_xor_si128(v89, v107);
                            v138 = v137 + 16;
                            *(__m128i *)v138 = _mm_xor_si128(v91, _mm_xor_si128(v102, v112));
                            v139 = v138 + 16;
                            *(__m128i *)v139 = _mm_xor_si128(v96, v111);
                            v140 = v139 + 16;
                            *(__m128i *)v140 = _mm_xor_si128(v102, _mm_xor_si128(v96, v105));
                            iter = v140 + 16;
                            v83 = v114;
                        }
                    }
                    else
                    {
                        sub_9bd030(&v3);
                        v85 = v102;
                        *(__m128i *)iter = _mm_xor_si128(v35, v100);
                        v141 = iter + 16;
                        *(__m128i *)v141 = _mm_xor_si128(v89, v107);
                        v142 = v141 + 16;
                        *(__m128i *)v142 = _mm_xor_si128(v91, v104);
                        v143 = v142 + 16;
                        *(__m128i *)v143 = _mm_xor_si128(v96, v106);
                        iter = v143 + 16;
                    }
                }
                else
                {
                    sub_9bd030(&v3);
                    v85 = v96;
                    *(__m128i *)iter = _mm_xor_si128(v35, v100);
                    v144 = iter + 16;
                    *(__m128i *)v144 = _mm_xor_si128(v89, _mm_xor_si128(v89, v94));
                    v145 = v144 + 16;
                    *(__m128i *)v145 = _mm_xor_si128(v91, v99);
                    iter = v145 + 16;
                    v83 = v101;
                }
            }
            else
            {
                sub_9bd030(&v3);
                v85 = v91;
                *(__m128i *)iter = _mm_xor_si128(v35, _mm_xor_si128(v35, v87));
                v146 = iter + 16;
                *(__m128i *)v146 = _mm_xor_si128(v89, _mm_xor_si128(v89, v94));
                iter = v146 + 16;
                node = v95;
            }
        }
        else
        {
            v147 = (__m128i)_INSERT(v91, 0, __longlong_as_double(_mm_extract_epi64(v35, 1)));
            v149 = (__m128i)_INSERT(v148, 0, __longlong_as_double(_mm_extract_epi64(v89, 1)));
            xsp = xsp - 16;
            *(__m128i *)(xsp - 16) = _mm_xor_si128(v35, v87);
            sub_9b8de4(xsp - 16, xsp - 16, a3);
            xsp = xsp + 16;
            v91 = _mm_unpackhi_epi64(_mm_unpacklo_epi64(v35, v35), _mm_unpacklo_epi64(v147, v147));
            v85 = _mm_unpackhi_epi64(_mm_unpacklo_epi64(v89, v89), _mm_unpacklo_epi64(v149, v149));
            *(__m128i *)iter = _mm_xor_si128(v91, *(int128_t *)xsp);
            iter += 16;
            v83 = v86;
        }
    }
    v150 = v83 + 16;
    v151 = arm64g_calculate_condition(2, v83, 16, 0);
    if (!(v151 & 1))
    {
        v152 = iter - 16;
        do
        {
            i = v150;
            v154 = node + 1;
            v155 = *((char *)iter - 16);
            *((char *)iter - 16) = *(char *)node;
            *(char *)iter = v155;
            iter += 1;
            node = v154;
            v150 = i - 1;
        } while (1 < i);
        xsp = xsp - 16;
        *(__m128i *)(xsp - 16) = _mm_xor_si128(v85, *(int128_t *)v152);
        v157 = (__m128i)_INSERT(v91, 0, __longlong_as_double(_mm_extract_epi64(v85, 1)));
        sub_9b8de4(xsp, xsp, a3);
        xsp = xsp + 16;
        *(__m128i *)v152 = _mm_xor_si128(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v85, v85), _mm_unpacklo_epi64(v157, v157)), *(int128_t *)xsp);
    }
    do
    {
        *(uint128_t *)xsp = 0;
        *(uint128_t *)(xsp + 16) = 0;
        xsp = xsp + 32;
    } while (xsp != &v1);
    return;
}
