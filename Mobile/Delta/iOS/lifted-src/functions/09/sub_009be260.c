/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9be260..0x9be840 (1504 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9be260_0 {
    char padding_0[240];
    unsigned int field_f0;
} st_9be260_0;


void sub_9be260(void* a0, void* a1, unsigned long long a2, st_9be260_0 *a3, long long a4, long long a5, unsigned long a6, unsigned long a7, char a8, unsigned long a9, unsigned long a10, unsigned long a11)
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
    unsigned long long v148;  // x22
    void* v32;  // x20
    unsigned long long v149;  // 4106
    __m128i v151;  // q12
    void* iter;  // x20
    __m128i v153;  // q13
    __m128i v154;  // q14
    __m128i v155;  // q11
    void* v156;  // x6
    unsigned long long i;  // x22
    char v158;  // x0
    void* iter1;  // x21
    unsigned long long v34;  // x22
    long long v35;  // x0
    __m128i v36;  // q11
    unsigned long v37;  // x1
    uint128_t v38;  // q6
    unsigned long long v21;  // x20
    uint128_t v39;  // q7
    __m128i v40;  // q6
    unsigned long long v41;  // x22
    void* node;  // x20
    unsigned long long v43;  // x22
    void* v44;  // x20
    void* v46;  // x20
    __m128i v47;  // q12
    __m128i v48;  // q1
    unsigned long long v22;  // x22
    __m128i v50;  // q13
    uint128_t *v51;  // x20
    __m128i v52;  // q4
    __m128i v53;  // q2
    uint128_t *v54;  // x20
    uint128_t *v55;  // x20
    __m128i v56;  // q7
    uint128_t *v57;  // x20
    __m128i v58;  // q14
    unsigned long long v23;  // x23
    uint128_t *v59;  // x20
    __m128i v60;  // q3
    __m128i v61;  // q15
    __m128i v62;  // q7
    __m128i v63;  // q4
    __m128i v65;  // q9
    __m128i v66;  // q5
    __m128i v68;  // q10
    unsigned long long v24;  // d8
    uint128_t *v71;  // x0
    __m128i v72;  // q8
    uint128_t *v73;  // x0
    void* v74;  // x21
    __m128i v75;  // q1
    uint128_t *v76;  // x0
    __m128i v77;  // q4
    void* v78;  // x21
    unsigned long long v25;  // d9
    void* v79;  // x21
    void* v80;  // x21
    void* v81;  // x21
    void* v82;  // x21
    void* v83;  // x21
    unsigned long long v84;  // 4175
    unsigned long long v85;  // x22
    unsigned long long v86;  // 4106
    __m128i v87;  // q11
    unsigned long long v88;  // x22
    unsigned long long v26;  // d10
    __m128i v89;  // q0
    __m128i v91;  // q12
    __m128i v93;  // q13
    unsigned long long v94;  // 4163
    __m128i v95;  // q2
    __m128i v96;  // q1
    void* v97;  // x20
    __m128i v98;  // q14
    unsigned long long v27;  // d11
    unsigned long long v99;  // 4131
    __m128i v101;  // q0
    unsigned long long v102;  // x22
    __m128i v103;  // q15
    unsigned long long v104;  // 4135
    __m128i v105;  // q4
    __m128i v106;  // q3
    __m128i v107;  // q6
    __m128i v108;  // q1
    unsigned long long v28;  // d12
    __m128i v109;  // q16
    unsigned long long v110;  // 4135
    __m128i v111;  // q5
    __m128i v112;  // q6
    __m128i v113;  // q4
    __m128i v114;  // q2
    unsigned long long v115;  // x22
    unsigned long long v116;  // 4141
    __m128i v117;  // q7
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
    v18 = *(unsigned long long *)&v31;
    v32 = a0;
    iter1 = a1;
    v34 = a2;
    v35 = sub_9b8de4(a5, &v0, a4);
    v36 = v0;
    v37 = a3->field_f0;
    xsp = (int)&(&x21)[-32 * v37];
    sub_9bd640(v35, v37, a4);
    v38 = *(int128_t *)xsp;
    *(uint128_t *)xsp = v31;
    v40 = _mm_xor_si128(v39, v38);
    *(__m128i *)xsp = v40;
    if (v34 & 15)
        v34 -= 16;
    v41 = v34 - 128;
    node = v32;
    v43 = v41;
    if (v34 >= 128)
    {
        do
        {
            v44 = v32 + 16;
            v46 = v44 + 16;
            v47 = _mm_xor_si128(__dirty_unsupported_Iop_SliceV128(_mm_and_si128(SarNV(v36, 63), _mm_set_epi64x(135, 1)), _mm_and_si128(SarNV(v36, 63), _mm_set_epi64x(135, 1)), 8), _mm_add_epi64(v36, v36));
            v48 = _mm_xor_si128(v47, *(int128_t *)v44);
            v50 = _mm_xor_si128(__dirty_unsupported_Iop_SliceV128(~_mm_cmpeq_epi64(_mm_and_si128(v36, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, ~_mm_cmpeq_epi64(_mm_and_si128(v36, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, 8), _mm_add_epi64(v47, v47));
            v51 = v46 + 16;
            v52 = __dirty_unsupported_Iop_SliceV128(~_mm_cmpeq_epi64(_mm_and_si128(v47, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, ~_mm_cmpeq_epi64(_mm_and_si128(v47, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, 8);
            v53 = _mm_xor_si128(v50, *(int128_t *)v46);
            v54 = v51 + 1;
            v55 = v54 + 1;
            v56 = __dirty_unsupported_Iop_SliceV128(~_mm_cmpeq_epi64(_mm_and_si128(v50, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, ~_mm_cmpeq_epi64(_mm_and_si128(v50, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, 8);
            v57 = v55 + 1;
            v58 = _mm_xor_si128(v52, _mm_add_epi64(v50, v50));
            v59 = v57 + 1;
            v60 = _mm_xor_si128(v58, *v51);
            v61 = _mm_xor_si128(v56, _mm_add_epi64(v58, v58));
            v62 = *v59;
            node = v59 + 1;
            v63 = _mm_xor_si128(v61, *v54);
            v65 = _mm_xor_si128(__dirty_unsupported_Iop_SliceV128(~_mm_cmpeq_epi64(_mm_and_si128(v58, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, ~_mm_cmpeq_epi64(_mm_and_si128(v58, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, 8), _mm_add_epi64(v61, v61));
            v66 = _mm_xor_si128(v65, *v55);
            v3 = v65;
            v68 = _mm_xor_si128(__dirty_unsupported_Iop_SliceV128(~_mm_cmpeq_epi64(_mm_and_si128(v61, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, ~_mm_cmpeq_epi64(_mm_and_si128(v61, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, 8), _mm_add_epi64(v65, v65));
            v4 = v68;
            v5 = _mm_xor_si128(__dirty_unsupported_Iop_SliceV128(~_mm_cmpeq_epi64(_mm_and_si128(v65, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, ~_mm_cmpeq_epi64(_mm_and_si128(v65, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, 8), _mm_add_epi64(v68, v68));
            v6 = _mm_xor_si128(__dirty_unsupported_Iop_SliceV128(~_mm_cmpeq_epi64(_mm_and_si128(v68, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, ~_mm_cmpeq_epi64(_mm_and_si128(v68, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, 8), _mm_add_epi64(v5, v5));
            v71 = sub_9bc9a0(&v3);
            v40 = _mm_xor_si128(v50, _mm_xor_si128(v68, *v57));
            v72 = *v71;
            v73 = v71 + 1;
            *(__m128i *)iter1 = _mm_xor_si128(v36, _mm_xor_si128(v36, *(int128_t *)v32));
            v74 = iter1 + 16;
            v75 = *v73;
            v76 = v73 + 1;
            v43 = v41 - 128;
            v77 = *v76;
            *(__m128i *)v74 = _mm_xor_si128(v47, v48);
            v78 = v74 + 16;
            v36 = v76[1];
            *(__m128i *)v78 = v40;
            v79 = v78 + 16;
            *(__m128i *)v79 = _mm_xor_si128(v58, v63);
            v80 = v79 + 16;
            *(__m128i *)v80 = _mm_xor_si128(v61, v53);
            v81 = v80 + 16;
            *(__m128i *)v81 = _mm_xor_si128(v72, _mm_xor_si128(v5, v62));
            v82 = v81 + 16;
            *(__m128i *)v82 = _mm_xor_si128(v75, v60);
            v83 = v82 + 16;
            *(__m128i *)v83 = _mm_xor_si128(v77, v66);
            iter1 = v83 + 16;
            v84 = arm64g_calculate_condition(84, v41, 128, 0);
            v32 = node;
            v41 = v43;
        } while (v84 & 1);
    }
    v85 = v43 + 112;
    v86 = arm64g_calculate_condition(66, v43, 112, 0);
    v87 = v36;
    if (!(v86 & 1))
    {
        v88 = v85 - 16;
        v89 = *(int128_t *)node;
        node += 16;
        v91 = _mm_xor_si128(__dirty_unsupported_Iop_SliceV128(_mm_and_si128(SarNV(v36, 63), _mm_set_epi64x(135, 1)), _mm_and_si128(SarNV(v36, 63), _mm_set_epi64x(135, 1)), 8), _mm_add_epi64(v36, v36));
        v93 = _mm_xor_si128(__dirty_unsupported_Iop_SliceV128(~_mm_cmpeq_epi64(_mm_and_si128(v36, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, ~_mm_cmpeq_epi64(_mm_and_si128(v36, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, 8), _mm_add_epi64(v91, v91));
        v94 = arm64g_calculate_condition(0x44, v85, 16, 0);
        if (!(v94 & 1))
        {
            v95 = __dirty_unsupported_Iop_SliceV128(~_mm_cmpeq_epi64(_mm_and_si128(v91, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, ~_mm_cmpeq_epi64(_mm_and_si128(v91, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, 8);
            v96 = *(int128_t *)node;
            v97 = node + 16;
            v85 = v88 - 16;
            v98 = _mm_xor_si128(v95, _mm_add_epi64(v93, v93));
            v99 = arm64g_calculate_condition(0x44, v88, 16, 0);
            if (!(v99 & 1))
            {
                node = v97 + 16;
                v101 = _mm_xor_si128(v36, v89);
                v102 = v85 - 16;
                v103 = _mm_xor_si128(__dirty_unsupported_Iop_SliceV128(~_mm_cmpeq_epi64(_mm_and_si128(v93, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, ~_mm_cmpeq_epi64(_mm_and_si128(v93, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, 8), _mm_add_epi64(v98, v98));
                v104 = arm64g_calculate_condition(0x44, v85, 16, 0);
                if (!(v104 & 1))
                {
                    v105 = __dirty_unsupported_Iop_SliceV128(~_mm_cmpeq_epi64(_mm_and_si128(v98, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, ~_mm_cmpeq_epi64(_mm_and_si128(v98, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, 8);
                    v106 = *(int128_t *)node;
                    node += 16;
                    v107 = ~_mm_cmpeq_epi64(_mm_and_si128(v103, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128());
                    v108 = _mm_xor_si128(v91, v96);
                    v85 = v102 - 16;
                    v109 = _mm_xor_si128(v105, _mm_add_epi64(v103, v103));
                    v110 = arm64g_calculate_condition(0x44, v102, 16, 0);
                    if (!(v110 & 1))
                    {
                        v111 = __dirty_unsupported_Iop_SliceV128(_mm_and_si128(v107, _mm_set_epi64x(135, 1)), _mm_and_si128(v107, _mm_set_epi64x(135, 1)), 8);
                        v112 = _mm_add_epi64(v109, v109);
                        v113 = *(int128_t *)node;
                        node += 16;
                        v114 = _mm_xor_si128(v93, *(int128_t *)v97);
                        v3 = v109;
                        v115 = v85 - 16;
                        v116 = arm64g_calculate_condition(0x44, v85, 16, 0);
                        if (!(v116 & 1))
                        {
                            v117 = __dirty_unsupported_Iop_SliceV128(~_mm_cmpeq_epi64(_mm_and_si128(v109, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, ~_mm_cmpeq_epi64(_mm_and_si128(v109, _mm_set1_epi64x(0x4000000000000000)), _mm_setzero_si128()) & 0x870000000000000001, 8);
                            node += 16;
                            v4 = _mm_xor_si128(v111, v112);
                            v85 = v115 - 16;
                            v118 = arm64g_calculate_condition(0x44, v115, 16, 0);
                            if (!(v118 & 1))
                            {
                                v119 = *(int128_t *)node;
                                node += 16;
                                v5 = _mm_xor_si128(v117, _mm_add_epi64(v4, v4));
                                v85 -= 16;
                                v120 = sub_9bc9a0(&v3);
                                v121 = *v120;
                                v122 = v120 + 1;
                                v123 = *v122;
                                v87 = v122[1];
                                *(__m128i *)iter1 = _mm_xor_si128(v36, v101);
                                v124 = iter1 + 16;
                                *(__m128i *)v124 = _mm_xor_si128(v91, v108);
                                v125 = v124 + 16;
                                *(__m128i *)v125 = _mm_xor_si128(v93, _mm_xor_si128(v4, v119));
                                v126 = v125 + 16;
                                *(__m128i *)v126 = _mm_xor_si128(v98, _mm_xor_si128(v103, v113));
                                v127 = v126 + 16;
                                *(__m128i *)v127 = _mm_xor_si128(v103, v114);
                                v128 = v127 + 16;
                                *(__m128i *)v128 = _mm_xor_si128(v121, v117);
                                v129 = v128 + 16;
                                *(__m128i *)v129 = _mm_xor_si128(v123, _mm_xor_si128(v98, v106));
                                iter1 = v129 + 16;
                            }
                            else
                            {
                                v130 = sub_9bc9a0(&v3);
                                v131 = *v130;
                                v87 = v130[1];
                                *(__m128i *)iter1 = _mm_xor_si128(v36, v101);
                                v132 = iter1 + 16;
                                *(__m128i *)v132 = _mm_xor_si128(v91, v108);
                                v133 = v132 + 16;
                                *(__m128i *)v133 = _mm_xor_si128(v93, v112);
                                v134 = v133 + 16;
                                *(__m128i *)v134 = _mm_xor_si128(v98, _mm_xor_si128(v103, v113));
                                v135 = v134 + 16;
                                *(__m128i *)v135 = _mm_xor_si128(v103, v114);
                                v136 = v135 + 16;
                                *(__m128i *)v136 = _mm_xor_si128(v131, v117);
                                iter1 = v136 + 16;
                            }
                        }
                        else
                        {
                            v87 = *(int128_t *)sub_9bc9a0(&v3);
                            *(__m128i *)iter1 = _mm_xor_si128(v36, v101);
                            v137 = iter1 + 16;
                            *(__m128i *)v137 = _mm_xor_si128(v91, v108);
                            v138 = v137 + 16;
                            *(__m128i *)v138 = _mm_xor_si128(v93, v112);
                            v139 = v138 + 16;
                            *(__m128i *)v139 = _mm_xor_si128(v98, _mm_xor_si128(v103, v113));
                            v140 = v139 + 16;
                            *(__m128i *)v140 = _mm_xor_si128(v103, v114);
                            iter1 = v140 + 16;
                            v85 = v115;
                        }
                    }
                    else
                    {
                        sub_9bc9a0(&v3);
                        v87 = v103;
                        *(__m128i *)iter1 = _mm_xor_si128(v36, v101);
                        v141 = iter1 + 16;
                        *(__m128i *)v141 = _mm_xor_si128(v91, v108);
                        v142 = v141 + 16;
                        *(__m128i *)v142 = _mm_xor_si128(v93, v107);
                        v143 = v142 + 16;
                        *(__m128i *)v143 = _mm_xor_si128(v98, v105);
                        iter1 = v143 + 16;
                    }
                }
                else
                {
                    sub_9bc9a0(&v3);
                    v87 = v98;
                    *(__m128i *)iter1 = _mm_xor_si128(v36, v101);
                    v144 = iter1 + 16;
                    *(__m128i *)v144 = _mm_xor_si128(v91, _mm_xor_si128(v91, v96));
                    v145 = v144 + 16;
                    *(__m128i *)v145 = _mm_xor_si128(v93, v40);
                    iter1 = v145 + 16;
                    v85 = v102;
                }
            }
            else
            {
                sub_9bc9a0(&v3);
                v87 = v93;
                *(__m128i *)iter1 = _mm_xor_si128(v36, _mm_xor_si128(v36, v89));
                v146 = iter1 + 16;
                *(__m128i *)v146 = _mm_xor_si128(v91, _mm_xor_si128(v91, v96));
                iter1 = v146 + 16;
                node = v97;
            }
        }
        else
        {
            v147 = (__m128i)_INSERT(v93, 0, __longlong_as_double(_mm_extract_epi64(v36, 1)));
            *(double *)&v98 = __longlong_as_double(_mm_extract_epi64(v91, 1));
            xsp = xsp - 16;
            *(__m128i *)(xsp - 16) = _mm_xor_si128(v36, v89);
            sub_9b9120(xsp - 16, xsp - 16, a3);
            xsp = xsp + 16;
            v93 = _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v147, v147));
            v87 = _mm_unpackhi_epi64(_mm_unpacklo_epi64(v91, v91), _mm_unpacklo_epi64(v98, v98));
            *(__m128i *)iter1 = _mm_xor_si128(v93, *(int128_t *)xsp);
            iter1 += 16;
            v85 = v88;
        }
    }
    v148 = v85 + 16;
    v149 = arm64g_calculate_condition(2, v85, 16, 0);
    if (!(v149 & 1))
    {
        v151 = _mm_xor_si128(__dirty_unsupported_Iop_SliceV128(_mm_and_si128(SarNV(v87, 63), _mm_set_epi64x(135, 1)), _mm_and_si128(SarNV(v87, 63), _mm_set_epi64x(135, 1)), 8), _mm_add_epi64(v87, v87));
        iter = node + 16;
        xsp = xsp - 16;
        *(__m128i *)(xsp - 16) = _mm_xor_si128(v151, *(int128_t *)node);
        v153 = (__m128i)_INSERT(v93, 0, __longlong_as_double(_mm_extract_epi64(v87, 1)));
        v154 = (__m128i)_INSERT(v98, 0, __longlong_as_double(_mm_extract_epi64(v151, 1)));
        sub_9b9120(xsp, xsp, a3);
        v155 = _mm_unpackhi_epi64(_mm_unpacklo_epi64(v87, v87), _mm_unpacklo_epi64(v153, v153));
        xsp = xsp + 16;
        *(__m128i *)iter1 = _mm_xor_si128(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v151, v151), _mm_unpacklo_epi64(v154, v154)), *(int128_t *)xsp);
        v156 = iter1;
        do
        {
            i = v148;
            v158 = *(char *)iter;
            iter += 1;
            *(char *)&iter1[16] = *(char *)iter1;
            *(char *)iter1 = v158;
            iter1 += 1;
            v148 = i - 1;
        } while (1 < i);
        xsp = xsp - 16;
        *(__m128i *)(xsp - 16) = _mm_xor_si128(v155, *(int128_t *)v156);
        sub_9b9120(xsp, xsp, a3);
        xsp = xsp + 16;
        *(__m128i *)v156 = _mm_xor_si128(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v155, v155), _mm_unpacklo_epi64(v153, v153)), *(int128_t *)xsp);
    }
    do
    {
        *(uint128_t *)xsp = 0;
        *(uint128_t *)(xsp + 16) = 0;
        xsp = xsp + 32;
    } while (xsp != &v1);
    return;
}
