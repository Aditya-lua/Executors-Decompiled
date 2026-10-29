/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad3d78..0xad43a0 (1576 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char _NSHomeDirectory;

void sub_ad3d78(uint128_t *a0, uint128_t *iter, long long a2, unsigned int *a3, double a4, double a5, double a6, double a7, double a8, double a9, double a10, double a11)
{
    uint128_t v1;  // q16
    uint128_t v2;  // q16
    unsigned long long v11;  // x21
    __m128i v101;  // q30
    unsigned int v102;  // w7
    __m128i v103;  // q3
    __m128i v104;  // q0
    __m128i v105;  // q0
    __m128i v106;  // q2
    __m128i v107;  // 4352
    unsigned int v108;  // w7
    __m128i v109;  // q3
    __m128i v110;  // q0
    unsigned long long v12;  // x20
    __m128i v111;  // q0
    __m128i v112;  // q2
    __m128i v113;  // 4519
    unsigned int v114;  // w7
    __m128i v115;  // q0
    __m128i v116;  // q0
    __m128i v117;  // q2
    __m128i v118;  // 4682
    unsigned int v119;  // w7
    unsigned long long v13;  // x23
    uint128_t v121;  // q4
    uint128_t v122;  // q4
    uint128_t v123;  // q4
    uint128_t v124;  // q4
    __m128i v125;  // q16
    __m128i v126;  // q17
    __m128i v127;  // q4
    __m128i v128;  // q5
    __m128i v129;  // q4
    __m128i v130;  // q6
    unsigned long long v14;  // x22
    __m128i v131;  // q16
    __m128i v132;  // q17
    __m128i v133;  // q18
    __m128i v134;  // q4
    __m128i v135;  // q5
    __m128i v136;  // q6
    __m128i v137;  // q0
    __m128i v138;  // q1
    __m128i v139;  // q2
    __m128i v140;  // q3
    unsigned long long v15;  // x25
    __m128i v141;  // q4
    __m128i v142;  // q6
    unsigned long long v16;  // x24
    unsigned long long v17;  // x27
    unsigned long long v18;  // x26
    long long i;  // x2
    uint128_t v20;  // q16
    unsigned long v3;  // x12
    uint128_t v21;  // q17
    uint128_t v22;  // q18
    uint128_t v23;  // q19
    uint128_t v24;  // q20
    uint128_t v25;  // q21
    uint128_t v26;  // q22
    unsigned long long v27;  // x27
    unsigned long long v28;  // x26
    uint128_t *v29;  // x0
    __m128i v30;  // q16
    unsigned long v4;  // x13
    __m128i v31;  // q17
    __m128i v32;  // q18
    __m128i v33;  // q19
    __m128i v34;  // q20
    __m128i v35;  // q21
    __m128i v36;  // q22
    __m128i v37;  // q23
    __m128i v38;  // q4
    __m128i v39;  // q5
    __m128i v40;  // q6
    unsigned long long v5;  // x15
    __m128i v41;  // q7
    __m128i v42;  // q8
    __m128i v43;  // q9
    __m128i v44;  // q10
    __m128i v45;  // q11
    __m128i v46;  // q0
    __m128i v47;  // q1
    __m128i v48;  // q2
    __m128i v49;  // q3
    __m128i v50;  // q4
    unsigned long long v6;  // x14
    __m128i v51;  // q5
    __m128i v52;  // q6
    __m128i v53;  // q7
    __m128i v54;  // q0
    __m128i v55;  // q1
    __m128i v56;  // q2
    __m128i v57;  // q3
    __m128i v58;  // q8
    __m128i v59;  // q9
    __m128i v60;  // q10
    unsigned long long v7;  // x17
    __m128i v61;  // q11
    __m128i v62;  // q8
    __m128i v63;  // q9
    __m128i v64;  // q10
    __m128i v65;  // q11
    uint128_t *v66;  // x1
    __m128i v67;  // q16
    __m128i v68;  // q17
    __m128i v69;  // q18
    __m128i v70;  // q19
    unsigned long long v8;  // x16
    __m128i v71;  // q4
    __m128i v72;  // q5
    __m128i v73;  // q6
    __m128i v74;  // q7
    __m128i v75;  // q0
    __m128i v76;  // q1
    __m128i v77;  // q2
    __m128i v78;  // q3
    __m128i v79;  // q4
    __m128i v80;  // q5
    unsigned long long v9;  // x19
    unsigned long long v81;  // 4102
    uint128_t v82;  // q16
    uint128_t v83;  // q4
    long long v84;  // w11
    unsigned int v85;  // w12
    unsigned int v86;  // w13
    unsigned int v87;  // w14
    unsigned int v88;  // w15
    long long v89;  // w11
    unsigned int *v90;  // x10
    unsigned long long v10;  // x18
    __m128i v91;  // q3
    __m128i v92;  // q26
    __m128i v93;  // q0
    __m128i v94;  // q28
    __m128i v95;  // q31
    __m128i v96;  // q0
    __m128i v97;  // q27
    __m128i v98;  // q2
    __m128i v99;  // 4189
    __m128i v100;  // q29
    char v0;  // [bp+0x0]

    v2 = __dirty_unsupported_Iop_Reverse1sIn8_x16(v1);
    v3 = *(unsigned long long *)&*(unsigned long long *)(void*)&v2;
    v4 = *(unsigned long long *)((void*)&v2 + 8);
    v5 = v4 * 2 | v3 >> 63;
    v6 = 135 & (int)((unsigned int)(__ROL__(v4, 32))) >> 31 ^ v3 * 2;
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
        v20 = CONCAT(v4, v3);
        v4 = v17 * 2 | v18 >> 63;
        v3 = 135 & (int)((unsigned int)(__ROL__(v17, 32))) >> 31 ^ v18 * 2;
        v21 = CONCAT(v5, v6);
        v5 = v4 * 2 | v3 >> 63;
        v6 = 135 & (int)((unsigned int)(__ROL__(v4, 32))) >> 31 ^ v3 * 2;
        v22 = CONCAT(v7, v8);
        v7 = v5 * 2 | v6 >> 63;
        v8 = 135 & (int)((unsigned int)(__ROL__(v5, 32))) >> 31 ^ v6 * 2;
        v23 = CONCAT(v9, v10);
        v9 = v7 * 2 | v8 >> 63;
        v10 = 135 & (int)((unsigned int)(__ROL__(v7, 32))) >> 31 ^ v8 * 2;
        v24 = CONCAT(v11, v12);
        v11 = v9 * 2 | v10 >> 63;
        v12 = 135 & (int)((unsigned int)(__ROL__(v9, 32))) >> 31 ^ v10 * 2;
        v25 = CONCAT(v13, v14);
        v13 = v11 * 2 | v12 >> 63;
        v14 = 135 & (int)((unsigned int)(__ROL__(v11, 32))) >> 31 ^ v12 * 2;
        v26 = CONCAT(v15, v16);
        v15 = v13 * 2 | v14 >> 63;
        v16 = 135 & (int)((unsigned int)(__ROL__(v13, 32))) >> 31 ^ v14 * 2;
        v27 = v15 * 2 | v16 >> 63;
        v28 = 135 & (int)((unsigned int)(__ROL__(v15, 32))) >> 31 ^ v16 * 2;
        if (i < 8)
        {
            if (i >= 4)
            {
                v67 = __dirty_unsupported_Iop_Reverse1sIn8_x16(v20);
                v68 = __dirty_unsupported_Iop_Reverse1sIn8_x16(v21);
                v69 = __dirty_unsupported_Iop_Reverse1sIn8_x16(v22);
                v70 = __dirty_unsupported_Iop_Reverse1sIn8_x16(v23);
                v71 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v67, *a0));
                v72 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v68, a0[1]));
                v73 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v69, a0[2]));
                v74 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v70, a0[3]));
                v75 = _mm_unpacklo_epi32(v71, v72);
                v76 = _mm_unpackhi_epi32(v71, v72);
                v77 = _mm_unpacklo_epi32(v73, v74);
                v78 = _mm_unpackhi_epi32(v73, v74);
                a0 = sub_ad1c00(a0 + 4);
                v79 = _mm_unpacklo_epi32(v75, v76);
                v80 = _mm_unpackhi_epi32(v75, v76);
                a10 = _mm_unpacklo_epi32(v77, v78);
                a11 = _mm_unpackhi_epi32(v77, v78);
                a7 = _mm_xor_si128(v70, _mm_unpackhi_epi64(v80, a11));
                iter[3] = a7;
                iter[2] = _mm_xor_si128(v69, _mm_unpacklo_epi64(v80, a11));
                iter[1] = _mm_xor_si128(v68, _mm_unpackhi_epi64(v79, a10));
                *iter = _mm_xor_si128(v67, _mm_unpacklo_epi64(v79, a10));
                iter += 4;
                i -= 4;
                v20 = v24;
                v21 = v25;
                v22 = v26;
            }
            if (i >= 1)
            {
                v81 = arm64g_calculate_condition(196, i, 1, 0);
                if (!(v81 & 1))
                {
                    v82 = __dirty_unsupported_Iop_Reverse1sIn8_x16(v20);
                    v83 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v82 ^ *a0);
                    v84 = 8;
                    v85 = *(unsigned int *)&*(unsigned int *)(void*)&v83;
                    v86 = *(unsigned int *)((void*)&v83 + 4);
                    v87 = *(unsigned int *)((void*)&v83 + 8);
                    v88 = *(unsigned int *)((void*)&v83 + 12);
                    do
                    {
                        v89 = v84;
                        v90 = a3 + 2;
                        v91 = (__m128i)_INSERT(a7, 0, __int_as_float(v87 ^ v88 ^ *a3 ^ v86));
                        v93 = _mm_and_si128(PermV(v91, _mm_and_si128(v92, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v92));
                        v96 = _mm_and_si128(PermV(v94, _mm_and_si128(_mm_and_si128(v93, v95), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v93, v95)));
                        v98 = _mm_and_si128(PermV(v97, _mm_and_si128(ShrNV(v93, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v93, 4)));
                        v99 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v98, v96), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v98) ^ _mm_cvtsi128_si64(v96) ^ 0);
                        v102 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(v100, _mm_and_si128(ShrNV(v99, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v99, 4))), _mm_and_si128(PermV(v101, _mm_and_si128(_mm_and_si128(v99, v95), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v99, v95)))));
                        v85 ^= v102 ^ (v102 * 4 | v102 >> 30) ^ (v102 * 0x400 | v102 >> 22) ^ (v102 * 0x40000 | v102 >> 14) ^ (v102 * &_NSHomeDirectory | v102 >> 8);
                        v103 = (__m128i)_INSERT(v91, 0, __int_as_float(v87 ^ v88 ^ v85 ^ a3[1]));
                        v104 = _mm_and_si128(PermV(v103, _mm_and_si128(v92, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v92));
                        v105 = _mm_and_si128(PermV(v94, _mm_and_si128(_mm_and_si128(v104, v95), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v104, v95)));
                        v106 = _mm_and_si128(PermV(v97, _mm_and_si128(ShrNV(v104, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v104, 4)));
                        v107 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v106, v105), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v106) ^ _mm_cvtsi128_si64(v105) ^ 0);
                        v108 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(v100, _mm_and_si128(ShrNV(v107, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v107, 4))), _mm_and_si128(PermV(v101, _mm_and_si128(_mm_and_si128(v107, v95), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v107, v95)))));
                        a3 = v90 + 2;
                        v86 ^= v108 ^ (v108 * 4 | v108 >> 30) ^ (v108 * 0x400 | v108 >> 22) ^ (v108 * 0x40000 | v108 >> 14) ^ (v108 * &_NSHomeDirectory | v108 >> 8);
                        v109 = (__m128i)_INSERT(v103, 0, __int_as_float(v85 ^ v86 ^ *v90 ^ v88));
                        v110 = _mm_and_si128(PermV(v109, _mm_and_si128(v92, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v92));
                        v111 = _mm_and_si128(PermV(v94, _mm_and_si128(_mm_and_si128(v110, v95), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v110, v95)));
                        v112 = _mm_and_si128(PermV(v97, _mm_and_si128(ShrNV(v110, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v110, 4)));
                        v113 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v112, v111), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v112) ^ _mm_cvtsi128_si64(v111) ^ 0);
                        v114 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(v100, _mm_and_si128(ShrNV(v113, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v113, 4))), _mm_and_si128(PermV(v101, _mm_and_si128(_mm_and_si128(v113, v95), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v113, v95)))));
                        v87 ^= v114 ^ (v114 * 4 | v114 >> 30) ^ (v114 * 0x400 | v114 >> 22) ^ (v114 * 0x40000 | v114 >> 14) ^ (v114 * &_NSHomeDirectory | v114 >> 8);
                        a7 = (__m128i)_INSERT(v109, 0, __int_as_float(v85 ^ v86 ^ v87 ^ v90[1]));
                        v115 = _mm_and_si128(PermV(a7, _mm_and_si128(v92, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v92));
                        v116 = _mm_and_si128(PermV(v94, _mm_and_si128(_mm_and_si128(v115, v95), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v115, v95)));
                        v117 = _mm_and_si128(PermV(v97, _mm_and_si128(ShrNV(v115, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v115, 4)));
                        v118 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v117, v116), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v117) ^ _mm_cvtsi128_si64(v116) ^ 0);
                        v119 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(v100, _mm_and_si128(ShrNV(v118, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v118, 4))), _mm_and_si128(PermV(v101, _mm_and_si128(_mm_and_si128(v118, v95), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v118, v95)))));
                    } while ((v88 ^= v119 ^ __ROL__(v119, 2) ^ __ROL__(v119, 10) ^ __ROL__(v119, 18) ^ __ROL__(v119, 24), v84 = v89 - 1, v89 != 1));
                    v121 = _INSERT(_INSERT(v83, 0, __int_as_float(v88)), 4, v87);
                    v122 = _INSERT(v121, 8, v86);
                    v123 = _INSERT(v122, 12, v85);
                    v124 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v123);
                    *iter = v82 ^ v124;
                    break;
                }
                else if (2 >= i)
                {
                    v125 = __dirty_unsupported_Iop_Reverse1sIn8_x16(v20);
                    v126 = __dirty_unsupported_Iop_Reverse1sIn8_x16(v21);
                    v127 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v125, *a0));
                    v128 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v126, a0[1]));
                    sub_ad1c00(a0 + 2);
                    v129 = _mm_unpacklo_epi32(_mm_unpacklo_epi32(v127, v128), _mm_unpackhi_epi32(v127, v128));
                    v130 = _mm_unpacklo_epi32(_mm_unpacklo_epi32(a10, a11), _mm_unpackhi_epi32(a10, a11));
                    iter[1] = _mm_xor_si128(v126, _mm_unpackhi_epi64(v129, v130));
                    *iter = _mm_xor_si128(v125, _mm_unpacklo_epi64(v129, v130));
                    break;
                }
                else
                {
                    v131 = __dirty_unsupported_Iop_Reverse1sIn8_x16(v20);
                    v132 = __dirty_unsupported_Iop_Reverse1sIn8_x16(v21);
                    v133 = __dirty_unsupported_Iop_Reverse1sIn8_x16(v22);
                    v134 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v131, *a0));
                    v135 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v132, a0[1]));
                    v136 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v133, a0[2]));
                    v137 = _mm_unpacklo_epi32(v134, v135);
                    v138 = _mm_unpackhi_epi32(v134, v135);
                    v139 = _mm_unpacklo_epi32(v136, a11);
                    v140 = _mm_unpackhi_epi32(v136, a11);
                    sub_ad1c00(a0 + 3);
                    v141 = _mm_unpacklo_epi32(v137, v138);
                    v142 = _mm_unpacklo_epi32(v139, v140);
                    iter[2] = _mm_xor_si128(v133, _mm_unpacklo_epi64(_mm_unpackhi_epi32(v137, v138), _mm_unpackhi_epi32(v139, v140)));
                    iter[1] = _mm_xor_si128(v132, _mm_unpackhi_epi64(v141, v142));
                    *iter = _mm_xor_si128(v131, _mm_unpacklo_epi64(v141, v142));
                    break;
                }
            }
        }
        v29 = a0 + 4;
        v30 = __dirty_unsupported_Iop_Reverse1sIn8_x16(v20);
        v31 = __dirty_unsupported_Iop_Reverse1sIn8_x16(v21);
        v32 = __dirty_unsupported_Iop_Reverse1sIn8_x16(v22);
        v33 = __dirty_unsupported_Iop_Reverse1sIn8_x16(v23);
        v34 = __dirty_unsupported_Iop_Reverse1sIn8_x16(v24);
        v35 = __dirty_unsupported_Iop_Reverse1sIn8_x16(v25);
        v36 = __dirty_unsupported_Iop_Reverse1sIn8_x16(v26);
        v37 = __dirty_unsupported_Iop_Reverse1sIn8_x16(CONCAT(v17, v18));
        v38 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v30, *a0));
        v39 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v31, a0[1]));
        v40 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v32, a0[2]));
        v41 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v33, a0[3]));
        v42 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v34, *v29));
        v43 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v35, v29[1]));
        v44 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v36, v29[2]));
        v45 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v37, v29[3]));
        v46 = _mm_unpacklo_epi32(v38, v39);
        v47 = _mm_unpackhi_epi32(v38, v39);
        v48 = _mm_unpacklo_epi32(v40, v41);
        v49 = _mm_unpackhi_epi32(v40, v41);
        v50 = _mm_unpacklo_epi64(v46, v48);
        v51 = _mm_unpackhi_epi64(v46, v48);
        v52 = _mm_unpacklo_epi64(v47, v49);
        v53 = _mm_unpackhi_epi64(v47, v49);
        v54 = _mm_unpacklo_epi32(v42, v43);
        v55 = _mm_unpackhi_epi32(v42, v43);
        v56 = _mm_unpacklo_epi32(v44, v45);
        v57 = _mm_unpackhi_epi32(v44, v45);
        a0 = sub_ad1e20(v29 + 4);
        v58 = _mm_unpacklo_epi32(v54, v55);
        v59 = _mm_unpackhi_epi32(v54, v55);
        v60 = _mm_unpacklo_epi32(v56, v57);
        v61 = _mm_unpackhi_epi32(v56, v57);
        v62 = _mm_unpacklo_epi32(v50, v51);
        v63 = _mm_unpackhi_epi32(v50, v51);
        v64 = _mm_unpacklo_epi32(v52, v53);
        v65 = _mm_unpackhi_epi32(v52, v53);
        a7 = _mm_xor_si128(v33, _mm_unpackhi_epi64(v59, v61));
        a10 = _mm_xor_si128(v36, _mm_unpacklo_epi64(v63, v65));
        a11 = _mm_xor_si128(v37, _mm_unpackhi_epi64(v63, v65));
        iter[3] = a7;
        iter[2] = _mm_xor_si128(v32, _mm_unpacklo_epi64(v59, v61));
        iter[1] = _mm_xor_si128(v31, _mm_unpackhi_epi64(v58, v60));
        *iter = _mm_xor_si128(v30, _mm_unpacklo_epi64(v58, v60));
        v66 = iter + 4;
        v66[3] = a11;
        v66[2] = a10;
        v66[1] = _mm_xor_si128(v35, _mm_unpackhi_epi64(v62, v64));
        *v66 = _mm_xor_si128(v34, _mm_unpacklo_epi64(v62, v64));
        iter = v66 + 4;
        a2 = i - 8;
        v17 = v27;
        v18 = v28;
    } while (8 < i);
    if (!&v0)
        goto LABEL_0xad47c8;
    else
        goto LABEL_0xad43a0;
}
