/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad0080..0xad0744 (1732 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_1000000;

void sub_ad0080(uint128_t *a0, uint128_t *iter, long long a2, unsigned int *a3, unsigned long a4, uint128_t *a5, double a6, double a7, double a8, double a9, double a10, double a11, double a12, double a13)
{
    uint128_t v1;  // q8
    uint128_t v2;  // q8
    unsigned long long v11;  // x21
    __m128i v101;  // q19
    __m128i v102;  // q18
    __m128i v103;  // q17
    __m128i v104;  // q16
    __m128i v105;  // q0
    __m128i v106;  // q23
    __m128i v107;  // q22
    __m128i v108;  // q21
    __m128i v109;  // q20
    unsigned long long v12;  // x20
    __m128i v111;  // q27
    __m128i v112;  // q26
    __m128i v113;  // q25
    __m128i v114;  // q24
    __m128i v115;  // q31
    __m128i v116;  // q30
    __m128i v117;  // q29
    __m128i v118;  // q28
    unsigned int v119;  // w7
    __m128i v120;  // q0
    unsigned long long v13;  // x23
    __m128i v121;  // q0
    unsigned int v123;  // w7
    __m128i v124;  // q0
    __m128i v125;  // q0
    unsigned int v127;  // w7
    __m128i v128;  // q0
    unsigned int v129;  // s1
    unsigned int v130;  // w7
    unsigned long long v14;  // x22
    uint128_t v132;  // q4
    uint128_t v133;  // q4
    uint128_t v134;  // q4
    uint128_t v135;  // q4
    __m128i v136;  // q8
    __m128i v137;  // q9
    __m128i v138;  // q4
    __m128i v139;  // q5
    __m128i v140;  // q4
    unsigned long long v15;  // x25
    __m128i v141;  // q6
    __m128i v142;  // q8
    __m128i v143;  // q9
    __m128i v144;  // q10
    __m128i v145;  // q4
    __m128i v146;  // q5
    __m128i v147;  // q6
    __m128i v148;  // q0
    __m128i v149;  // q1
    __m128i v150;  // q2
    unsigned long long v16;  // x24
    __m128i v151;  // q3
    __m128i v152;  // q4
    __m128i v153;  // q6
    unsigned long long v17;  // x27
    unsigned long long v18;  // x26
    long long i;  // x2
    uint128_t *v20;  // x0
    unsigned long long v3;  // x12
    uint128_t v21;  // q0
    uint128_t v22;  // q1
    uint128_t v23;  // q2
    uint128_t v24;  // q3
    uint128_t v25;  // q12
    uint128_t v26;  // q13
    uint128_t v27;  // q14
    uint128_t v28;  // q15
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
    unsigned long long v57;  // x13
    unsigned long long v58;  // x12
    unsigned long long v59;  // x15
    unsigned long long v60;  // x14
    unsigned long long v7;  // x17
    unsigned long long v61;  // x17
    unsigned long long v62;  // x16
    unsigned long long v63;  // x19
    unsigned long long v64;  // x18
    unsigned long long v65;  // x21
    unsigned long long v66;  // x20
    unsigned long long v67;  // x23
    unsigned long long v68;  // x22
    unsigned long long v69;  // x25
    unsigned long long v70;  // x24
    unsigned long long v8;  // x16
    __m128i v71;  // q11
    uint128_t *v72;  // x1
    uint128_t v73;  // q8
    uint128_t v74;  // q9
    uint128_t v75;  // q10
    __m128i v76;  // q8
    __m128i v77;  // q9
    __m128i v78;  // q10
    __m128i v79;  // q11
    __m128i v80;  // q4
    unsigned long long v9;  // x19
    __m128i v81;  // q5
    __m128i v82;  // q6
    __m128i v83;  // q7
    __m128i v84;  // q0
    __m128i v85;  // q1
    __m128i v86;  // q2
    __m128i v87;  // q3
    __m128i v88;  // q4
    __m128i v89;  // q5
    unsigned long long v90;  // 4102
    unsigned long long v10;  // x18
    uint128_t v91;  // q8
    uint128_t v92;  // q4
    long long v93;  // w11
    unsigned int v94;  // w12
    unsigned int v95;  // w13
    unsigned int v96;  // w14
    unsigned int v97;  // w15
    long long v98;  // w11
    unsigned int *v99;  // x10
    __m128i v100;  // q0
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
        if (i < 8)
        {
            v73 = CONCAT(v4, v3);
            v74 = CONCAT(v5, v6);
            v75 = CONCAT(v7, v8);
            if (i >= 4)
            {
                v76 = __dirty_unsupported_Iop_Reverse1sIn8_x16(v73);
                v77 = __dirty_unsupported_Iop_Reverse1sIn8_x16(v74);
                v78 = __dirty_unsupported_Iop_Reverse1sIn8_x16(v75);
                v79 = __dirty_unsupported_Iop_Reverse1sIn8_x16(CONCAT(v9, v10));
                v80 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v76, *a0));
                v81 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v77, a0[1]));
                v82 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v78, a0[2]));
                v83 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v79, a0[3]));
                v84 = _mm_unpacklo_epi32(v80, v81);
                v85 = _mm_unpackhi_epi32(v80, v81);
                v86 = _mm_unpacklo_epi32(v82, v83);
                v87 = _mm_unpackhi_epi32(v82, v83);
                a0 = sub_acdd30(a0 + 4);
                v88 = _mm_unpacklo_epi32(v84, v85);
                v89 = _mm_unpackhi_epi32(v84, v85);
                a12 = _mm_unpacklo_epi32(v86, v87);
                a13 = _mm_unpackhi_epi32(v86, v87);
                a6 = _mm_xor_si128(v76, _mm_unpacklo_epi64(v88, a12));
                iter[3] = _mm_xor_si128(v79, _mm_unpackhi_epi64(v89, a13));
                iter[2] = _mm_xor_si128(v78, _mm_unpacklo_epi64(v89, a13));
                iter[1] = _mm_xor_si128(v77, _mm_unpackhi_epi64(v88, a12));
                *iter = a6;
                iter += 4;
                i -= 4;
                v73 = CONCAT(v11, v12);
                v74 = CONCAT(v13, v14);
                v75 = CONCAT(v15, v16);
                *a5 = v79;
            }
            if (i >= 1)
            {
                v90 = arm64g_calculate_condition(196, i, 1, 0);
                if (!(v90 & 1))
                {
                    v91 = __dirty_unsupported_Iop_Reverse1sIn8_x16(v73);
                    v92 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v91 ^ *a0);
                    v93 = 8;
                    v94 = *(unsigned int *)&*(unsigned int *)(void*)&v92;
                    v95 = *(unsigned int *)((void*)&v92 + 4);
                    v96 = *(unsigned int *)((void*)&v92 + 8);
                    v97 = *(unsigned int *)((void*)&v92 + 12);
                    do
                    {
                        v98 = v93;
                        v99 = a3 + 2;
                        v100 = (__m128i)_INSERT(a6, 0, __int_as_float(v96 ^ v97 ^ *a3 ^ v95));
                        v105 = _mm_or_si128(_mm_and_si128(PermV(v101, _mm_and_si128(_mm_sub_epi8(v100, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v100, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(v102, _mm_and_si128(_mm_sub_epi8(v100, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v100, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(v103, _mm_and_si128(_mm_sub_epi8(v100, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v100, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v104, _mm_and_si128(v100, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v100)))));
                        v119 = _mm_cvtsi128_si32(v105) + (_mm_cvtsi128_si32(PermV(v106, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v100, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v100, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))) | _mm_cvtsi128_si32(PermV(v107, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v100, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v100, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))) | _mm_cvtsi128_si32(PermV(v108, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v100, _mm_set1_epi8(64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v100, _mm_set1_epi8(64)), _mm_set1_epi8(16)))) | _mm_cvtsi128_si32(PermV(v109, _mm_and_si128(_mm_sub_epi8(v100, _mm_set1_epi8(64)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v100, _mm_set1_epi8(64))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(v111, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v100, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v100, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(v112, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v100, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v100, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(v113, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v100, _mm_set1_epi8(-128)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v100, _mm_set1_epi8(-128)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(v114, _mm_and_si128(_mm_sub_epi8(v100, _mm_set1_epi8(-128)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v100, _mm_set1_epi8(-128)))))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(v115, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v100, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v100, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(v116, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v100, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v100, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(v117, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v100, _mm_set1_epi8(-64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v100, _mm_set1_epi8(-64)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(v118, _mm_and_si128(_mm_sub_epi8(v100, _mm_set1_epi8(-64)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v100, _mm_set1_epi8(-64))))))));
                        v94 ^= v119 ^ (v119 * 4 | v119 >> 30) ^ (v119 * 0x400 | v119 >> 22) ^ (v119 * 0x40000 | v119 >> 14) ^ (v119 * &g_1000000 | v119 >> 8);
                        v120 = (__m128i)_INSERT(v105, 0, __int_as_float(v96 ^ v97 ^ v94 ^ a3[1]));
                        v121 = _mm_or_si128(_mm_and_si128(PermV(v101, _mm_and_si128(_mm_sub_epi8(v120, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v120, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(v102, _mm_and_si128(_mm_sub_epi8(v120, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v120, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(v103, _mm_and_si128(_mm_sub_epi8(v120, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v120, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v104, _mm_and_si128(v120, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v120)))));
                        v123 = _mm_cvtsi128_si32(v121) + (_mm_cvtsi128_si32(PermV(v106, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v120, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v120, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))) | _mm_cvtsi128_si32(PermV(v107, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v120, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v120, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))) | _mm_cvtsi128_si32(PermV(v108, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v120, _mm_set1_epi8(64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v120, _mm_set1_epi8(64)), _mm_set1_epi8(16)))) | _mm_cvtsi128_si32(PermV(v109, _mm_and_si128(_mm_sub_epi8(v120, _mm_set1_epi8(64)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v120, _mm_set1_epi8(64))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(v111, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v120, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v120, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(v112, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v120, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v120, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(v113, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v120, _mm_set1_epi8(-128)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v120, _mm_set1_epi8(-128)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(v114, _mm_and_si128(_mm_sub_epi8(v120, _mm_set1_epi8(-128)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v120, _mm_set1_epi8(-128)))))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(v115, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v120, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v120, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(v116, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v120, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v120, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(v117, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v120, _mm_set1_epi8(-64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v120, _mm_set1_epi8(-64)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(v118, _mm_and_si128(_mm_sub_epi8(v120, _mm_set1_epi8(-64)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v120, _mm_set1_epi8(-64))))))));
                        a3 = v99 + 2;
                        v95 ^= v123 ^ (v123 * 4 | v123 >> 30) ^ (v123 * 0x400 | v123 >> 22) ^ (v123 * 0x40000 | v123 >> 14) ^ (v123 * &g_1000000 | v123 >> 8);
                        v124 = (__m128i)_INSERT(v121, 0, __int_as_float(v94 ^ v95 ^ *v99 ^ v97));
                        v125 = _mm_or_si128(_mm_and_si128(PermV(v101, _mm_and_si128(_mm_sub_epi8(v124, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v124, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(v102, _mm_and_si128(_mm_sub_epi8(v124, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v124, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(v103, _mm_and_si128(_mm_sub_epi8(v124, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v124, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v104, _mm_and_si128(v124, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v124)))));
                        v127 = _mm_cvtsi128_si32(v125) + (_mm_cvtsi128_si32(PermV(v106, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v124, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v124, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))) | _mm_cvtsi128_si32(PermV(v107, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v124, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v124, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))) | _mm_cvtsi128_si32(PermV(v108, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v124, _mm_set1_epi8(64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v124, _mm_set1_epi8(64)), _mm_set1_epi8(16)))) | _mm_cvtsi128_si32(PermV(v109, _mm_and_si128(_mm_sub_epi8(v124, _mm_set1_epi8(64)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v124, _mm_set1_epi8(64))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(v111, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v124, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v124, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(v112, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v124, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v124, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(v113, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v124, _mm_set1_epi8(-128)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v124, _mm_set1_epi8(-128)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(v114, _mm_and_si128(_mm_sub_epi8(v124, _mm_set1_epi8(-128)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v124, _mm_set1_epi8(-128)))))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(v115, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v124, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v124, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(v116, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v124, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v124, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(v117, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v124, _mm_set1_epi8(-64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v124, _mm_set1_epi8(-64)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(v118, _mm_and_si128(_mm_sub_epi8(v124, _mm_set1_epi8(-64)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v124, _mm_set1_epi8(-64))))))));
                        v96 ^= v127 ^ (v127 * 4 | v127 >> 30) ^ (v127 * 0x400 | v127 >> 22) ^ (v127 * 0x40000 | v127 >> 14) ^ (v127 * &g_1000000 | v127 >> 8);
                        v128 = (__m128i)_INSERT(v125, 0, __int_as_float(v94 ^ v95 ^ v96 ^ v99[1]));
                        a6 = _mm_or_si128(_mm_and_si128(PermV(v101, _mm_and_si128(_mm_sub_epi8(v128, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v128, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(v102, _mm_and_si128(_mm_sub_epi8(v128, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v128, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(v103, _mm_and_si128(_mm_sub_epi8(v128, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v128, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v104, _mm_and_si128(v128, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v128)))));
                        v129 = _mm_cvtsi128_si32(PermV(v106, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v128, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v128, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))) | _mm_cvtsi128_si32(PermV(v107, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v128, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v128, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))) | _mm_cvtsi128_si32(PermV(v108, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v128, _mm_set1_epi8(64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v128, _mm_set1_epi8(64)), _mm_set1_epi8(16)))) | _mm_cvtsi128_si32(PermV(v109, _mm_and_si128(_mm_sub_epi8(v128, _mm_set1_epi8(64)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v128, _mm_set1_epi8(64))));
                    } while ((v130 = _mm_cvtsi128_si32(a6) + __float_as_int(v129) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(v111, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v128, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v128, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(v112, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v128, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v128, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(v113, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v128, _mm_set1_epi8(-128)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v128, _mm_set1_epi8(-128)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(v114, _mm_and_si128(_mm_sub_epi8(v128, _mm_set1_epi8(-128)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v128, _mm_set1_epi8(-128)))))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(v115, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v128, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v128, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(v116, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v128, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v128, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(v117, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v128, _mm_set1_epi8(-64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v128, _mm_set1_epi8(-64)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(v118, _mm_and_si128(_mm_sub_epi8(v128, _mm_set1_epi8(-64)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v128, _mm_set1_epi8(-64)))))))), v97 ^= v130 ^ __ROL__(v130, 2) ^ __ROL__(v130, 10) ^ __ROL__(v130, 18) ^ __ROL__(v130, 24), v93 = v98 - 1, v98 != 1));
                    v132 = _INSERT(_INSERT(v92, 0, __int_as_float(v97)), 4, v96);
                    v133 = _INSERT(v132, 8, v95);
                    v134 = _INSERT(v133, 12, v94);
                    v135 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v134);
                    *iter = v91 ^ v135;
                    *a5 = v91;
                    break;
                }
                else if (2 >= i)
                {
                    v136 = __dirty_unsupported_Iop_Reverse1sIn8_x16(v73);
                    v137 = __dirty_unsupported_Iop_Reverse1sIn8_x16(v74);
                    v138 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v136, *a0));
                    v139 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v137, a0[1]));
                    sub_acdd30(a0 + 2);
                    v140 = _mm_unpacklo_epi32(_mm_unpacklo_epi32(v138, v139), _mm_unpackhi_epi32(v138, v139));
                    v141 = _mm_unpacklo_epi32(_mm_unpacklo_epi32(a12, a13), _mm_unpackhi_epi32(a12, a13));
                    iter[1] = _mm_xor_si128(v137, _mm_unpackhi_epi64(v140, v141));
                    *iter = _mm_xor_si128(v136, _mm_unpacklo_epi64(v140, v141));
                    *a5 = v137;
                    break;
                }
                else
                {
                    v142 = __dirty_unsupported_Iop_Reverse1sIn8_x16(v73);
                    v143 = __dirty_unsupported_Iop_Reverse1sIn8_x16(v74);
                    v144 = __dirty_unsupported_Iop_Reverse1sIn8_x16(v75);
                    v145 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v142, *a0));
                    v146 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v143, a0[1]));
                    v147 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v144, a0[2]));
                    v148 = _mm_unpacklo_epi32(v145, v146);
                    v149 = _mm_unpackhi_epi32(v145, v146);
                    v150 = _mm_unpacklo_epi32(v147, a13);
                    v151 = _mm_unpackhi_epi32(v147, a13);
                    sub_acdd30(a0 + 3);
                    v152 = _mm_unpacklo_epi32(v148, v149);
                    v153 = _mm_unpacklo_epi32(v150, v151);
                    iter[2] = _mm_xor_si128(v144, _mm_unpacklo_epi64(_mm_unpackhi_epi32(v148, v149), _mm_unpackhi_epi32(v150, v151)));
                    iter[1] = _mm_xor_si128(v143, _mm_unpackhi_epi64(v152, v153));
                    *iter = _mm_xor_si128(v142, _mm_unpacklo_epi64(v152, v153));
                    *a5 = v144;
                    break;
                }
            }
        }
        v20 = a0 + 4;
        v21 = __dirty_unsupported_Iop_Reverse1sIn8_x16(CONCAT(v4, v3));
        v22 = __dirty_unsupported_Iop_Reverse1sIn8_x16(CONCAT(v5, v6));
        v23 = __dirty_unsupported_Iop_Reverse1sIn8_x16(CONCAT(v7, v8));
        v24 = __dirty_unsupported_Iop_Reverse1sIn8_x16(CONCAT(v9, v10));
        v25 = __dirty_unsupported_Iop_Reverse1sIn8_x16(CONCAT(v11, v12));
        v26 = __dirty_unsupported_Iop_Reverse1sIn8_x16(CONCAT(v13, v14));
        v27 = __dirty_unsupported_Iop_Reverse1sIn8_x16(CONCAT(v15, v16));
        v28 = __dirty_unsupported_Iop_Reverse1sIn8_x16(CONCAT(v17, v18));
        v29 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v21 ^ *a0);
        v30 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v22 ^ a0[1]);
        v31 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v23 ^ a0[2]);
        v32 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v24 ^ a0[3]);
        v33 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v25 ^ *v20);
        v34 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v26 ^ v20[1]);
        v35 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v27 ^ v20[2]);
        v36 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v28 ^ v20[3]);
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
        a0 = sub_acdf40(v20 + 4);
        v49 = _mm_unpacklo_epi32(v45, v46);
        v50 = _mm_unpackhi_epi32(v45, v46);
        v51 = _mm_unpacklo_epi32(v47, v48);
        v52 = _mm_unpackhi_epi32(v47, v48);
        v53 = _mm_unpacklo_epi32(v41, v42);
        v54 = _mm_unpackhi_epi32(v41, v42);
        v55 = _mm_unpacklo_epi32(v43, v44);
        v56 = _mm_unpackhi_epi32(v43, v44);
        v57 = v17 * 2 | v18 >> 63;
        v58 = 135 & (int)((unsigned int)(__ROL__(v17, 32))) >> 31 ^ v18 * 2;
        v59 = v57 * 2 | v58 >> 63;
        v60 = 135 & (int)((unsigned int)(__ROL__(v57, 32))) >> 31 ^ v58 * 2;
        v61 = v59 * 2 | v60 >> 63;
        v62 = 135 & (int)((unsigned int)(__ROL__(v59, 32))) >> 31 ^ v60 * 2;
        v63 = v61 * 2 | v62 >> 63;
        v64 = 135 & (int)((unsigned int)(__ROL__(v61, 32))) >> 31 ^ v62 * 2;
        v65 = v63 * 2 | v64 >> 63;
        v66 = 135 & (int)((unsigned int)(__ROL__(v63, 32))) >> 31 ^ v64 * 2;
        v67 = v65 * 2 | v66 >> 63;
        v68 = 135 & (int)((unsigned int)(__ROL__(v65, 32))) >> 31 ^ v66 * 2;
        v69 = v67 * 2 | v68 >> 63;
        v70 = 135 & (int)((unsigned int)(__ROL__(v67, 32))) >> 31 ^ v68 * 2;
        v71 = (__m128i)(CONCAT(v17, v18));
        v17 = v69 * 2 | v70 >> 63;
        v18 = 135 & (int)((unsigned int)(__ROL__(v69, 32))) >> 31 ^ v70 * 2;
        a6 = _mm_xor_si128(CONCAT(v4, v3), _mm_unpacklo_epi64(v49, v51));
        a12 = _mm_xor_si128(CONCAT(v15, v16), _mm_unpacklo_epi64(v54, v56));
        a13 = _mm_xor_si128(v71, _mm_unpackhi_epi64(v54, v56));
        *a5 = v71;
        iter[3] = _mm_xor_si128(CONCAT(v9, v10), _mm_unpackhi_epi64(v50, v52));
        iter[2] = _mm_xor_si128(CONCAT(v7, v8), _mm_unpacklo_epi64(v50, v52));
        iter[1] = _mm_xor_si128(CONCAT(v5, v6), _mm_unpackhi_epi64(v49, v51));
        *iter = a6;
        v72 = iter + 4;
        v72[3] = a13;
        v72[2] = a12;
        v72[1] = _mm_xor_si128(CONCAT(v13, v14), _mm_unpackhi_epi64(v53, v55));
        *v72 = _mm_xor_si128(CONCAT(v11, v12), _mm_unpacklo_epi64(v53, v55));
        iter = v72 + 4;
        a2 = i - 8;
        v3 = v58;
        v4 = v57;
        v5 = v59;
        v6 = v60;
        v7 = v61;
        v8 = v62;
        v9 = v63;
        v10 = v64;
        v11 = v65;
        v12 = v66;
        v13 = v67;
        v14 = v68;
        v15 = v69;
        v16 = v70;
    } while (8 < i);
    if (!&v0)
        goto LABEL_0xad0bd0;
    else
        goto LABEL_0xad0744;
}
