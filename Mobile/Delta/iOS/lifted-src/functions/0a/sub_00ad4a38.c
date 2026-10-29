/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad4a38..0xad5014 (1500 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char _NSHomeDirectory;

void sub_ad4a38(uint128_t *a0, uint128_t *iter, long long a2, unsigned int *a3, double a4, double a5, double a6, double a7, double a8, double a9, double a10, double a11)
{
    unsigned long v1;  // d16
    unsigned long v2;  // x12
    unsigned long long v11;  // x21
    __m128i v101;  // q0
    __m128i v102;  // q0
    __m128i v103;  // q2
    __m128i v104;  // 4682
    unsigned int v105;  // w7
    uint128_t v107;  // q4
    uint128_t v108;  // q4
    uint128_t v109;  // q4
    __m128i v110;  // q4
    unsigned long long v12;  // x20
    __m128i v111;  // q4
    __m128i v112;  // q5
    __m128i v113;  // q4
    __m128i v114;  // q6
    __m128i v115;  // q4
    __m128i v116;  // q5
    __m128i v117;  // q6
    __m128i v118;  // q0
    __m128i v119;  // q1
    __m128i v120;  // q2
    unsigned long long v13;  // x23
    __m128i v121;  // q3
    __m128i v122;  // q4
    __m128i v123;  // q6
    unsigned long long v14;  // x22
    unsigned long long v15;  // x25
    unsigned long long v16;  // x24
    unsigned long long v17;  // x27
    unsigned long long v18;  // x26
    long long i;  // x2
    __m128i v20;  // q16
    unsigned long long v3;  // 584
    __m128i v21;  // q17
    __m128i v22;  // q18
    __m128i v23;  // q19
    __m128i v24;  // q20
    __m128i v25;  // q21
    __m128i v26;  // q22
    __m128i v27;  // q23
    uint128_t *v28;  // x0
    __m128i v29;  // q4
    __m128i v30;  // q5
    unsigned long long v4;  // x13
    __m128i v31;  // q6
    __m128i v32;  // q7
    __m128i v33;  // q8
    __m128i v34;  // q9
    __m128i v35;  // q10
    __m128i v36;  // q11
    __m128i v37;  // q0
    __m128i v38;  // q1
    __m128i v39;  // q2
    __m128i v40;  // q3
    unsigned long long v5;  // x15
    __m128i v41;  // q4
    __m128i v42;  // q5
    __m128i v43;  // q6
    __m128i v44;  // q7
    __m128i v45;  // q0
    __m128i v46;  // q1
    __m128i v47;  // q2
    __m128i v48;  // q3
    __m128i v49;  // q8
    __m128i v50;  // q9
    unsigned long long v6;  // x14
    __m128i v51;  // q10
    __m128i v52;  // q11
    __m128i v53;  // q8
    __m128i v54;  // q9
    __m128i v55;  // q10
    __m128i v56;  // q11
    uint128_t *v57;  // x1
    __m128i v58;  // q4
    __m128i v59;  // q5
    __m128i v60;  // q6
    unsigned long long v7;  // x17
    __m128i v61;  // q7
    __m128i v62;  // q0
    __m128i v63;  // q1
    __m128i v64;  // q2
    __m128i v65;  // q3
    __m128i v66;  // q4
    __m128i v67;  // q5
    unsigned long long v68;  // 4102
    uint128_t v69;  // q4
    long long v70;  // w11
    unsigned long long v8;  // x16
    unsigned int v71;  // w12
    unsigned int v72;  // w13
    unsigned int v73;  // w14
    unsigned int v74;  // w15
    long long v75;  // w11
    unsigned int *v76;  // x10
    __m128i v77;  // q3
    __m128i v78;  // q26
    __m128i v79;  // q0
    __m128i v80;  // q28
    unsigned long long v9;  // x19
    __m128i v81;  // q31
    __m128i v82;  // q0
    __m128i v83;  // q27
    __m128i v84;  // q2
    __m128i v85;  // 4189
    __m128i v86;  // q29
    __m128i v87;  // q30
    unsigned int v88;  // w7
    __m128i v89;  // q3
    __m128i v90;  // q0
    unsigned long long v10;  // x18
    __m128i v91;  // q0
    __m128i v92;  // q2
    __m128i v93;  // 4352
    unsigned int v94;  // w7
    __m128i v95;  // q3
    __m128i v96;  // q0
    __m128i v97;  // q0
    __m128i v98;  // q2
    __m128i v99;  // 4519
    unsigned int v100;  // w7
    char v0;  // [bp+0x0]

    v2 = __double_as_longlong(v1);
    v4 = v3;
    v5 = v4 * 2 | v2 >> 63;
    v6 = 135 & (int)((unsigned int)(__ROL__(v4, 32))) >> 31 ^ v2 * 2;
    v7 = v5 * 2 | v6 >> 63;
    v8 = 135 & (int)((unsigned int)(__ROL__(v5, 32))) >> 31 ^ v6 * 2;
    v9 = v7 * 2 | v8 >> 63;
    v10 = 135 & (int)((unsigned int)(__ROL__(v7, 32))) >> 31 ^ v8 * 2;
    v11 = v9 * 2 | v10 >> 63;
    v12 = 135 & (int)((unsigned int)(__ROL__(v9, 32))) >> 31 ^ v10 * 2;
    v13 = v11 * 2 | v12 >> 63;
    v14 = 135 & (int)((unsigned int)(__ROL__(v11, 32))) >> 31 ^ v12 * 2;
    v15 = v13 * 2 | v14 >> 63;
    v16 = 135 & (int)((unsigned int)(__ROL__(v13, 32))) >> 31 ^ v14 * 2;
    v17 = v15 * 2 | v16 >> 63;
    v18 = 135 & (int)((unsigned int)(__ROL__(v15, 32))) >> 31 ^ v16 * 2;
    do
    {
        i = a2;
        v20 = (__m128i)(CONCAT(v4, v2));
        v4 = v17 * 2 | v18 >> 63;
        v2 = 135 & (int)((unsigned int)(__ROL__(v17, 32))) >> 31 ^ v18 * 2;
        v21 = (__m128i)(CONCAT(v5, v6));
        v5 = v4 * 2 | v2 >> 63;
        v6 = 135 & (int)((unsigned int)(__ROL__(v4, 32))) >> 31 ^ v2 * 2;
        v22 = (__m128i)(CONCAT(v7, v8));
        v7 = v5 * 2 | v6 >> 63;
        v8 = 135 & (int)((unsigned int)(__ROL__(v5, 32))) >> 31 ^ v6 * 2;
        v23 = (__m128i)(CONCAT(v9, v10));
        v9 = v7 * 2 | v8 >> 63;
        v10 = 135 & (int)((unsigned int)(__ROL__(v7, 32))) >> 31 ^ v8 * 2;
        v24 = (__m128i)(CONCAT(v11, v12));
        v11 = v9 * 2 | v10 >> 63;
        v12 = 135 & (int)((unsigned int)(__ROL__(v9, 32))) >> 31 ^ v10 * 2;
        v25 = (__m128i)(CONCAT(v13, v14));
        v13 = v11 * 2 | v12 >> 63;
        v14 = 135 & (int)((unsigned int)(__ROL__(v11, 32))) >> 31 ^ v12 * 2;
        v26 = (__m128i)(CONCAT(v15, v16));
        v15 = v13 * 2 | v14 >> 63;
        v16 = 135 & (int)((unsigned int)(__ROL__(v13, 32))) >> 31 ^ v14 * 2;
        v27 = (__m128i)(CONCAT(v17, v18));
        v17 = v15 * 2 | v16 >> 63;
        v18 = 135 & (int)((unsigned int)(__ROL__(v15, 32))) >> 31 ^ v16 * 2;
        if (i < 8)
        {
            if (i >= 4)
            {
                v58 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v20, *a0));
                v59 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v21, a0[1]));
                v60 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v22, a0[2]));
                v61 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v23, a0[3]));
                v62 = _mm_unpacklo_epi32(v58, v59);
                v63 = _mm_unpackhi_epi32(v58, v59);
                v64 = _mm_unpacklo_epi32(v60, v61);
                v65 = _mm_unpackhi_epi32(v60, v61);
                a0 = sub_ad1c00(a0 + 4);
                v66 = _mm_unpacklo_epi32(v62, v63);
                v67 = _mm_unpackhi_epi32(v62, v63);
                a10 = _mm_unpacklo_epi32(v64, v65);
                a11 = _mm_unpackhi_epi32(v64, v65);
                a7 = _mm_xor_si128(v23, _mm_unpackhi_epi64(v67, a11));
                iter[3] = a7;
                iter[2] = _mm_xor_si128(v22, _mm_unpacklo_epi64(v67, a11));
                iter[1] = _mm_xor_si128(v21, _mm_unpackhi_epi64(v66, a10));
                *iter = _mm_xor_si128(v20, _mm_unpacklo_epi64(v66, a10));
                iter += 4;
                i -= 4;
                v20 = v24;
                v21 = v25;
                v22 = v26;
            }
            if (i >= 1)
            {
                v68 = arm64g_calculate_condition(196, i, 1, 0);
                if (!(v68 & 1))
                {
                    v69 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v20, *a0));
                    v70 = 8;
                    v71 = *(unsigned int *)&*(unsigned int *)(void*)&v69;
                    v72 = *(unsigned int *)((void*)&v69 + 4);
                    v73 = *(unsigned int *)((void*)&v69 + 8);
                    v74 = *(unsigned int *)((void*)&v69 + 12);
                    do
                    {
                        v75 = v70;
                        v76 = a3 + 2;
                        v77 = (__m128i)_INSERT(a7, 0, __int_as_float(v73 ^ v74 ^ *a3 ^ v72));
                        v79 = _mm_and_si128(PermV(v77, _mm_and_si128(v78, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v78));
                        v82 = _mm_and_si128(PermV(v80, _mm_and_si128(_mm_and_si128(v79, v81), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v79, v81)));
                        v84 = _mm_and_si128(PermV(v83, _mm_and_si128(ShrNV(v79, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v79, 4)));
                        v85 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v84, v82), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v84) ^ _mm_cvtsi128_si64(v82) ^ 0);
                        v88 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(v86, _mm_and_si128(ShrNV(v85, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v85, 4))), _mm_and_si128(PermV(v87, _mm_and_si128(_mm_and_si128(v85, v81), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v85, v81)))));
                        v71 ^= v88 ^ (v88 * 4 | v88 >> 30) ^ (v88 * 0x400 | v88 >> 22) ^ (v88 * 0x40000 | v88 >> 14) ^ (v88 * &_NSHomeDirectory | v88 >> 8);
                        v89 = (__m128i)_INSERT(v77, 0, __int_as_float(v73 ^ v74 ^ v71 ^ a3[1]));
                        v90 = _mm_and_si128(PermV(v89, _mm_and_si128(v78, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v78));
                        v91 = _mm_and_si128(PermV(v80, _mm_and_si128(_mm_and_si128(v90, v81), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v90, v81)));
                        v92 = _mm_and_si128(PermV(v83, _mm_and_si128(ShrNV(v90, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v90, 4)));
                        v93 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v92, v91), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v92) ^ _mm_cvtsi128_si64(v91) ^ 0);
                        v94 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(v86, _mm_and_si128(ShrNV(v93, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v93, 4))), _mm_and_si128(PermV(v87, _mm_and_si128(_mm_and_si128(v93, v81), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v93, v81)))));
                        a3 = v76 + 2;
                        v72 ^= v94 ^ (v94 * 4 | v94 >> 30) ^ (v94 * 0x400 | v94 >> 22) ^ (v94 * 0x40000 | v94 >> 14) ^ (v94 * &_NSHomeDirectory | v94 >> 8);
                        v95 = (__m128i)_INSERT(v89, 0, __int_as_float(v71 ^ v72 ^ *v76 ^ v74));
                        v96 = _mm_and_si128(PermV(v95, _mm_and_si128(v78, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v78));
                        v97 = _mm_and_si128(PermV(v80, _mm_and_si128(_mm_and_si128(v96, v81), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v96, v81)));
                        v98 = _mm_and_si128(PermV(v83, _mm_and_si128(ShrNV(v96, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v96, 4)));
                        v99 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v98, v97), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v98) ^ _mm_cvtsi128_si64(v97) ^ 0);
                        v100 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(v86, _mm_and_si128(ShrNV(v99, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v99, 4))), _mm_and_si128(PermV(v87, _mm_and_si128(_mm_and_si128(v99, v81), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v99, v81)))));
                        v73 ^= v100 ^ (v100 * 4 | v100 >> 30) ^ (v100 * 0x400 | v100 >> 22) ^ (v100 * 0x40000 | v100 >> 14) ^ (v100 * &_NSHomeDirectory | v100 >> 8);
                        a7 = (__m128i)_INSERT(v95, 0, __int_as_float(v71 ^ v72 ^ v73 ^ v76[1]));
                        v101 = _mm_and_si128(PermV(a7, _mm_and_si128(v78, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v78));
                        v102 = _mm_and_si128(PermV(v80, _mm_and_si128(_mm_and_si128(v101, v81), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v101, v81)));
                        v103 = _mm_and_si128(PermV(v83, _mm_and_si128(ShrNV(v101, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v101, 4)));
                        v104 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v103, v102), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v103) ^ _mm_cvtsi128_si64(v102) ^ 0);
                        v105 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(v86, _mm_and_si128(ShrNV(v104, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v104, 4))), _mm_and_si128(PermV(v87, _mm_and_si128(_mm_and_si128(v104, v81), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v104, v81)))));
                    } while ((v74 ^= v105 ^ (v105 * 4 | v105 >> 30) ^ __ROL__(v105, 10) ^ __ROL__(v105, 18) ^ __ROL__(v105, 24), v70 = v75 - 1, v75 != 1));
                    v107 = _INSERT(_INSERT(v69, 0, __int_as_float(v74)), 4, v73);
                    v108 = _INSERT(v107, 8, v72);
                    v109 = _INSERT(v108, 12, v71);
                    v110 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v109);
                    *iter = _mm_xor_si128(v20, v110);
                    break;
                }
                else if (2 >= i)
                {
                    v111 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v20, *a0));
                    v112 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v21, a0[1]));
                    sub_ad1c00(a0 + 2);
                    v113 = _mm_unpacklo_epi32(_mm_unpacklo_epi32(v111, v112), _mm_unpackhi_epi32(v111, v112));
                    v114 = _mm_unpacklo_epi32(_mm_unpacklo_epi32(a10, a11), _mm_unpackhi_epi32(a10, a11));
                    iter[1] = _mm_xor_si128(v21, _mm_unpackhi_epi64(v113, v114));
                    *iter = _mm_xor_si128(v20, _mm_unpacklo_epi64(v113, v114));
                    break;
                }
                else
                {
                    v115 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v20, *a0));
                    v116 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v21, a0[1]));
                    v117 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v22, a0[2]));
                    v118 = _mm_unpacklo_epi32(v115, v116);
                    v119 = _mm_unpackhi_epi32(v115, v116);
                    v120 = _mm_unpacklo_epi32(v117, a11);
                    v121 = _mm_unpackhi_epi32(v117, a11);
                    sub_ad1c00(a0 + 3);
                    v122 = _mm_unpacklo_epi32(v118, v119);
                    v123 = _mm_unpacklo_epi32(v120, v121);
                    iter[2] = _mm_xor_si128(v22, _mm_unpacklo_epi64(_mm_unpackhi_epi32(v118, v119), _mm_unpackhi_epi32(v120, v121)));
                    iter[1] = _mm_xor_si128(v21, _mm_unpackhi_epi64(v122, v123));
                    *iter = _mm_xor_si128(v20, _mm_unpacklo_epi64(v122, v123));
                    break;
                }
            }
        }
        v28 = a0 + 4;
        v29 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v20, *a0));
        v30 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v21, a0[1]));
        v31 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v22, a0[2]));
        v32 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v23, a0[3]));
        v33 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v24, *v28));
        v34 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v25, v28[1]));
        v35 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v26, v28[2]));
        v36 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v27, v28[3]));
        v37 = _mm_unpacklo_epi32(v29, v30);
        v38 = _mm_unpackhi_epi32(v29, v30);
        v39 = _mm_unpacklo_epi32(v31, v32);
        v40 = _mm_unpackhi_epi32(v31, v32);
        v41 = _mm_unpacklo_epi64(v37, v39);
        v42 = _mm_unpackhi_epi64(v37, v39);
        v43 = _mm_unpacklo_epi64(v38, v40);
        v44 = _mm_unpackhi_epi64(v38, v40);
        v45 = _mm_unpacklo_epi32(v33, v34);
        v46 = _mm_unpackhi_epi32(v33, v34);
        v47 = _mm_unpacklo_epi32(v35, v36);
        v48 = _mm_unpackhi_epi32(v35, v36);
        a0 = sub_ad1e20(v28 + 4);
        v49 = _mm_unpacklo_epi32(v45, v46);
        v50 = _mm_unpackhi_epi32(v45, v46);
        v51 = _mm_unpacklo_epi32(v47, v48);
        v52 = _mm_unpackhi_epi32(v47, v48);
        v53 = _mm_unpacklo_epi32(v41, v42);
        v54 = _mm_unpackhi_epi32(v41, v42);
        v55 = _mm_unpacklo_epi32(v43, v44);
        v56 = _mm_unpackhi_epi32(v43, v44);
        a7 = _mm_xor_si128(v23, _mm_unpackhi_epi64(v50, v52));
        a10 = _mm_xor_si128(v26, _mm_unpacklo_epi64(v54, v56));
        a11 = _mm_xor_si128(v27, _mm_unpackhi_epi64(v54, v56));
        iter[3] = a7;
        iter[2] = _mm_xor_si128(v22, _mm_unpacklo_epi64(v50, v52));
        iter[1] = _mm_xor_si128(v21, _mm_unpackhi_epi64(v49, v51));
        *iter = _mm_xor_si128(v20, _mm_unpacklo_epi64(v49, v51));
        v57 = iter + 4;
        v57[3] = a11;
        v57[2] = a10;
        v57[1] = _mm_xor_si128(v25, _mm_unpackhi_epi64(v53, v55));
        *v57 = _mm_xor_si128(v24, _mm_unpacklo_epi64(v53, v55));
        iter = v57 + 4;
        a2 = i - 8;
    } while (8 < i);
    if (!&v0)
        goto LABEL_0xad5430;
    else
        goto LABEL_0xad5014;
}
