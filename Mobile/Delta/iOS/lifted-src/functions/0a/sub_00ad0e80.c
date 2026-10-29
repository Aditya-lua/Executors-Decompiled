/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad0e80..0xad14f8 (1656 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_1000000;

void sub_ad0e80(uint128_t *a0, uint128_t *iter, long long a2, unsigned int *a3, unsigned long a4, uint128_t *a5, double a6, double a7, double a8, double a9, double a10, double a11, double a12, double a13)
{
    unsigned long v1;  // d8
    unsigned long long v2;  // x12
    unsigned long long v11;  // x21
    __m128i v101;  // q25
    __m128i v102;  // q24
    __m128i v103;  // q31
    __m128i v104;  // q30
    __m128i v105;  // q29
    __m128i v106;  // q28
    unsigned int v107;  // w7
    __m128i v108;  // q0
    __m128i v109;  // q0
    unsigned long long v12;  // x20
    unsigned int v111;  // w7
    __m128i v112;  // q0
    __m128i v113;  // q0
    unsigned int v115;  // w7
    __m128i v116;  // q0
    unsigned int v117;  // s1
    unsigned int v118;  // w7
    uint128_t v120;  // q4
    unsigned long long v13;  // x23
    uint128_t v121;  // q4
    uint128_t v122;  // q4
    __m128i v123;  // q4
    __m128i v124;  // q4
    __m128i v125;  // q5
    __m128i v126;  // q4
    __m128i v127;  // q6
    __m128i v128;  // q4
    __m128i v129;  // q5
    __m128i v130;  // q6
    unsigned long long v14;  // x22
    __m128i v131;  // q0
    __m128i v132;  // q1
    __m128i v133;  // q2
    __m128i v134;  // q3
    __m128i v135;  // q4
    __m128i v136;  // q6
    unsigned long long v15;  // x25
    unsigned long long v16;  // x24
    unsigned long long v17;  // x27
    unsigned long long v18;  // x26
    long long i;  // x2
    uint128_t *v20;  // x0
    unsigned long long v3;  // 456
    __m128i v21;  // q4
    __m128i v22;  // q5
    __m128i v23;  // q6
    __m128i v24;  // q7
    __m128i v25;  // q8
    __m128i v26;  // q9
    __m128i v27;  // q10
    __m128i v28;  // q11
    __m128i v29;  // q0
    __m128i v30;  // q1
    unsigned long long v4;  // x13
    __m128i v31;  // q2
    __m128i v32;  // q3
    __m128i v33;  // q4
    __m128i v34;  // q5
    __m128i v35;  // q6
    __m128i v36;  // q7
    __m128i v37;  // q0
    __m128i v38;  // q1
    __m128i v39;  // q2
    __m128i v40;  // q3
    unsigned long long v5;  // x15
    __m128i v41;  // q8
    __m128i v42;  // q9
    __m128i v43;  // q10
    __m128i v44;  // q11
    __m128i v45;  // q8
    __m128i v46;  // q9
    __m128i v47;  // q10
    __m128i v48;  // q11
    unsigned long long v49;  // x13
    unsigned long long v50;  // x12
    unsigned long long v6;  // x14
    unsigned long long v51;  // x15
    unsigned long long v52;  // x14
    unsigned long long v53;  // x17
    unsigned long long v54;  // x16
    unsigned long long v55;  // x19
    unsigned long long v56;  // x18
    unsigned long long v57;  // x21
    unsigned long long v58;  // x20
    unsigned long long v59;  // x23
    unsigned long long v60;  // x22
    unsigned long long v7;  // x17
    unsigned long long v61;  // x25
    unsigned long long v62;  // x24
    __m128i v63;  // q11
    uint128_t *v64;  // x1
    __m128i v65;  // q8
    __m128i v66;  // q9
    __m128i v67;  // q10
    __m128i v68;  // q11
    __m128i v69;  // q4
    __m128i v70;  // q5
    unsigned long long v8;  // x16
    __m128i v71;  // q6
    __m128i v72;  // q7
    __m128i v73;  // q0
    __m128i v74;  // q1
    __m128i v75;  // q2
    __m128i v76;  // q3
    __m128i v77;  // q4
    __m128i v78;  // q5
    unsigned long long v79;  // 4102
    uint128_t v80;  // q4
    unsigned long long v9;  // x19
    long long v81;  // w11
    unsigned int v82;  // w12
    unsigned int v83;  // w13
    unsigned int v84;  // w14
    unsigned int v85;  // w15
    long long v86;  // w11
    unsigned int *v87;  // x10
    __m128i v88;  // q0
    __m128i v89;  // q19
    __m128i v90;  // q18
    unsigned long long v10;  // x18
    __m128i v91;  // q17
    __m128i v92;  // q16
    __m128i v93;  // q0
    __m128i v94;  // q23
    __m128i v95;  // q22
    __m128i v96;  // q21
    __m128i v97;  // q20
    __m128i v99;  // q27
    __m128i v100;  // q26
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
        if (i < 8)
        {
            v65 = (__m128i)(CONCAT(v4, v2));
            v66 = (__m128i)(CONCAT(v5, v6));
            v67 = (__m128i)(CONCAT(v7, v8));
            v68 = (__m128i)(CONCAT(v9, v10));
            if (i >= 4)
            {
                v69 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v65, *a0));
                v70 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v66, a0[1]));
                v71 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v67, a0[2]));
                v72 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v68, a0[3]));
                v73 = _mm_unpacklo_epi32(v69, v70);
                v74 = _mm_unpackhi_epi32(v69, v70);
                v75 = _mm_unpacklo_epi32(v71, v72);
                v76 = _mm_unpackhi_epi32(v71, v72);
                a0 = sub_acdd30(a0 + 4);
                v77 = _mm_unpacklo_epi32(v73, v74);
                v78 = _mm_unpackhi_epi32(v73, v74);
                a12 = _mm_unpacklo_epi32(v75, v76);
                a13 = _mm_unpackhi_epi32(v75, v76);
                a6 = _mm_xor_si128(v65, _mm_unpacklo_epi64(v77, a12));
                iter[3] = _mm_xor_si128(v68, _mm_unpackhi_epi64(v78, a13));
                iter[2] = _mm_xor_si128(v67, _mm_unpacklo_epi64(v78, a13));
                iter[1] = _mm_xor_si128(v66, _mm_unpackhi_epi64(v77, a12));
                *iter = a6;
                iter += 4;
                i -= 4;
                v65 = (__m128i)(CONCAT(v11, v12));
                v66 = (__m128i)(CONCAT(v13, v14));
                v67 = (__m128i)(CONCAT(v15, v16));
                *a5 = v68;
            }
            if (i >= 1)
            {
                v79 = arm64g_calculate_condition(196, i, 1, 0);
                if (!(v79 & 1))
                {
                    v80 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v65, *a0));
                    v81 = 8;
                    v82 = *(unsigned int *)&*(unsigned int *)(void*)&v80;
                    v83 = *(unsigned int *)((void*)&v80 + 4);
                    v84 = *(unsigned int *)((void*)&v80 + 8);
                    v85 = *(unsigned int *)((void*)&v80 + 12);
                    do
                    {
                        v86 = v81;
                        v87 = a3 + 2;
                        v88 = (__m128i)_INSERT(a6, 0, __int_as_float(v84 ^ v85 ^ *a3 ^ v83));
                        v93 = _mm_or_si128(_mm_and_si128(PermV(v89, _mm_and_si128(_mm_sub_epi8(v88, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v88, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(v90, _mm_and_si128(_mm_sub_epi8(v88, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v88, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(v91, _mm_and_si128(_mm_sub_epi8(v88, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v88, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v92, _mm_and_si128(v88, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v88)))));
                        v107 = _mm_cvtsi128_si32(v93) + (_mm_cvtsi128_si32(PermV(v94, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v88, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v88, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))) | _mm_cvtsi128_si32(PermV(v95, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v88, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v88, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))) | _mm_cvtsi128_si32(PermV(v96, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v88, _mm_set1_epi8(64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v88, _mm_set1_epi8(64)), _mm_set1_epi8(16)))) | _mm_cvtsi128_si32(PermV(v97, _mm_and_si128(_mm_sub_epi8(v88, _mm_set1_epi8(64)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v88, _mm_set1_epi8(64))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(v99, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v88, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v88, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(v100, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v88, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v88, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(v101, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v88, _mm_set1_epi8(-128)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v88, _mm_set1_epi8(-128)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(v102, _mm_and_si128(_mm_sub_epi8(v88, _mm_set1_epi8(-128)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v88, _mm_set1_epi8(-128)))))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(v103, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v88, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v88, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(v104, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v88, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v88, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(v105, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v88, _mm_set1_epi8(-64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v88, _mm_set1_epi8(-64)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(v106, _mm_and_si128(_mm_sub_epi8(v88, _mm_set1_epi8(-64)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v88, _mm_set1_epi8(-64))))))));
                        v82 ^= v107 ^ (v107 * 4 | v107 >> 30) ^ (v107 * 0x400 | v107 >> 22) ^ (v107 * 0x40000 | v107 >> 14) ^ (v107 * &g_1000000 | v107 >> 8);
                        v108 = (__m128i)_INSERT(v93, 0, __int_as_float(v84 ^ v85 ^ v82 ^ a3[1]));
                        v109 = _mm_or_si128(_mm_and_si128(PermV(v89, _mm_and_si128(_mm_sub_epi8(v108, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v108, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(v90, _mm_and_si128(_mm_sub_epi8(v108, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v108, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(v91, _mm_and_si128(_mm_sub_epi8(v108, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v108, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v92, _mm_and_si128(v108, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v108)))));
                        v111 = _mm_cvtsi128_si32(v109) + (_mm_cvtsi128_si32(PermV(v94, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v108, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v108, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))) | _mm_cvtsi128_si32(PermV(v95, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v108, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v108, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))) | _mm_cvtsi128_si32(PermV(v96, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v108, _mm_set1_epi8(64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v108, _mm_set1_epi8(64)), _mm_set1_epi8(16)))) | _mm_cvtsi128_si32(PermV(v97, _mm_and_si128(_mm_sub_epi8(v108, _mm_set1_epi8(64)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v108, _mm_set1_epi8(64))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(v99, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v108, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v108, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(v100, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v108, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v108, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(v101, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v108, _mm_set1_epi8(-128)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v108, _mm_set1_epi8(-128)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(v102, _mm_and_si128(_mm_sub_epi8(v108, _mm_set1_epi8(-128)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v108, _mm_set1_epi8(-128)))))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(v103, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v108, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v108, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(v104, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v108, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v108, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(v105, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v108, _mm_set1_epi8(-64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v108, _mm_set1_epi8(-64)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(v106, _mm_and_si128(_mm_sub_epi8(v108, _mm_set1_epi8(-64)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v108, _mm_set1_epi8(-64))))))));
                        a3 = v87 + 2;
                        v83 ^= v111 ^ (v111 * 4 | v111 >> 30) ^ (v111 * 0x400 | v111 >> 22) ^ (v111 * 0x40000 | v111 >> 14) ^ (v111 * &g_1000000 | v111 >> 8);
                        v112 = (__m128i)_INSERT(v109, 0, __int_as_float(v82 ^ v83 ^ *v87 ^ v85));
                        v113 = _mm_or_si128(_mm_and_si128(PermV(v89, _mm_and_si128(_mm_sub_epi8(v112, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v112, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(v90, _mm_and_si128(_mm_sub_epi8(v112, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v112, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(v91, _mm_and_si128(_mm_sub_epi8(v112, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v112, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v92, _mm_and_si128(v112, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v112)))));
                        v115 = _mm_cvtsi128_si32(v113) + (_mm_cvtsi128_si32(PermV(v94, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v112, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v112, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))) | _mm_cvtsi128_si32(PermV(v95, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v112, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v112, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))) | _mm_cvtsi128_si32(PermV(v96, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v112, _mm_set1_epi8(64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v112, _mm_set1_epi8(64)), _mm_set1_epi8(16)))) | _mm_cvtsi128_si32(PermV(v97, _mm_and_si128(_mm_sub_epi8(v112, _mm_set1_epi8(64)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v112, _mm_set1_epi8(64))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(v99, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v112, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v112, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(v100, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v112, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v112, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(v101, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v112, _mm_set1_epi8(-128)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v112, _mm_set1_epi8(-128)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(v102, _mm_and_si128(_mm_sub_epi8(v112, _mm_set1_epi8(-128)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v112, _mm_set1_epi8(-128)))))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(v103, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v112, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v112, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(v104, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v112, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v112, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(v105, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v112, _mm_set1_epi8(-64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v112, _mm_set1_epi8(-64)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(v106, _mm_and_si128(_mm_sub_epi8(v112, _mm_set1_epi8(-64)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v112, _mm_set1_epi8(-64))))))));
                        v84 ^= v115 ^ (v115 * 4 | v115 >> 30) ^ (v115 * 0x400 | v115 >> 22) ^ (v115 * 0x40000 | v115 >> 14) ^ (v115 * &g_1000000 | v115 >> 8);
                        v116 = (__m128i)_INSERT(v113, 0, __int_as_float(v82 ^ v83 ^ v84 ^ v87[1]));
                        a6 = _mm_or_si128(_mm_and_si128(PermV(v89, _mm_and_si128(_mm_sub_epi8(v116, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v116, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(v90, _mm_and_si128(_mm_sub_epi8(v116, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v116, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(v91, _mm_and_si128(_mm_sub_epi8(v116, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v116, _mm_set1_epi8(16)))), _mm_and_si128(PermV(v92, _mm_and_si128(v116, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v116)))));
                        v117 = _mm_cvtsi128_si32(PermV(v94, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v116, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v116, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))) | _mm_cvtsi128_si32(PermV(v95, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v116, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v116, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))) | _mm_cvtsi128_si32(PermV(v96, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v116, _mm_set1_epi8(64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v116, _mm_set1_epi8(64)), _mm_set1_epi8(16)))) | _mm_cvtsi128_si32(PermV(v97, _mm_and_si128(_mm_sub_epi8(v116, _mm_set1_epi8(64)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v116, _mm_set1_epi8(64))));
                    } while ((v118 = _mm_cvtsi128_si32(a6) + __float_as_int(v117) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(v99, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v116, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v116, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(v100, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v116, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v116, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(v101, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v116, _mm_set1_epi8(-128)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v116, _mm_set1_epi8(-128)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(v102, _mm_and_si128(_mm_sub_epi8(v116, _mm_set1_epi8(-128)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v116, _mm_set1_epi8(-128)))))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(v103, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v116, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v116, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(v104, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v116, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v116, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(v105, _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v116, _mm_set1_epi8(-64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v116, _mm_set1_epi8(-64)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(v106, _mm_and_si128(_mm_sub_epi8(v116, _mm_set1_epi8(-64)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v116, _mm_set1_epi8(-64)))))))), v85 ^= v118 ^ __ROL__(v118, 2) ^ __ROL__(v118, 10) ^ __ROL__(v118, 18) ^ __ROL__(v118, 24), v81 = v86 - 1, v86 != 1));
                    v120 = _INSERT(_INSERT(v80, 0, __int_as_float(v85)), 4, v84);
                    v121 = _INSERT(v120, 8, v83);
                    v122 = _INSERT(v121, 12, v82);
                    v123 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v122);
                    *iter = _mm_xor_si128(v65, v123);
                    *a5 = v65;
                    break;
                }
                else if (2 >= i)
                {
                    v124 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v65, *a0));
                    v125 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v66, a0[1]));
                    sub_acdd30(a0 + 2);
                    v126 = _mm_unpacklo_epi32(_mm_unpacklo_epi32(v124, v125), _mm_unpackhi_epi32(v124, v125));
                    v127 = _mm_unpacklo_epi32(_mm_unpacklo_epi32(a12, a13), _mm_unpackhi_epi32(a12, a13));
                    iter[1] = _mm_xor_si128(v66, _mm_unpackhi_epi64(v126, v127));
                    *iter = _mm_xor_si128(v65, _mm_unpacklo_epi64(v126, v127));
                    *a5 = v66;
                    break;
                }
                else
                {
                    v128 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v65, *a0));
                    v129 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v66, a0[1]));
                    v130 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_xor_si128(v67, a0[2]));
                    v131 = _mm_unpacklo_epi32(v128, v129);
                    v132 = _mm_unpackhi_epi32(v128, v129);
                    v133 = _mm_unpacklo_epi32(v130, a13);
                    v134 = _mm_unpackhi_epi32(v130, a13);
                    sub_acdd30(a0 + 3);
                    v135 = _mm_unpacklo_epi32(v131, v132);
                    v136 = _mm_unpacklo_epi32(v133, v134);
                    iter[2] = _mm_xor_si128(v67, _mm_unpacklo_epi64(_mm_unpackhi_epi32(v131, v132), _mm_unpackhi_epi32(v133, v134)));
                    iter[1] = _mm_xor_si128(v66, _mm_unpackhi_epi64(v135, v136));
                    *iter = _mm_xor_si128(v65, _mm_unpacklo_epi64(v135, v136));
                    *a5 = v67;
                    break;
                }
            }
        }
        v20 = a0 + 4;
        v21 = __dirty_unsupported_Iop_Reverse8sIn32_x4(CONCAT(v4, v2) ^ *a0);
        v22 = __dirty_unsupported_Iop_Reverse8sIn32_x4(CONCAT(v5, v6) ^ a0[1]);
        v23 = __dirty_unsupported_Iop_Reverse8sIn32_x4(CONCAT(v7, v8) ^ a0[2]);
        v24 = __dirty_unsupported_Iop_Reverse8sIn32_x4(CONCAT(v9, v10) ^ a0[3]);
        v25 = __dirty_unsupported_Iop_Reverse8sIn32_x4(CONCAT(v11, v12) ^ *v20);
        v26 = __dirty_unsupported_Iop_Reverse8sIn32_x4(CONCAT(v13, v14) ^ v20[1]);
        v27 = __dirty_unsupported_Iop_Reverse8sIn32_x4(CONCAT(v15, v16) ^ v20[2]);
        v28 = __dirty_unsupported_Iop_Reverse8sIn32_x4(CONCAT(v17, v18) ^ v20[3]);
        v29 = _mm_unpacklo_epi32(v21, v22);
        v30 = _mm_unpackhi_epi32(v21, v22);
        v31 = _mm_unpacklo_epi32(v23, v24);
        v32 = _mm_unpackhi_epi32(v23, v24);
        v33 = _mm_unpacklo_epi64(v29, v31);
        v34 = _mm_unpackhi_epi64(v29, v31);
        v35 = _mm_unpacklo_epi64(v30, v32);
        v36 = _mm_unpackhi_epi64(v30, v32);
        v37 = _mm_unpacklo_epi32(v25, v26);
        v38 = _mm_unpackhi_epi32(v25, v26);
        v39 = _mm_unpacklo_epi32(v27, v28);
        v40 = _mm_unpackhi_epi32(v27, v28);
        a0 = sub_acdf40(v20 + 4);
        v41 = _mm_unpacklo_epi32(v37, v38);
        v42 = _mm_unpackhi_epi32(v37, v38);
        v43 = _mm_unpacklo_epi32(v39, v40);
        v44 = _mm_unpackhi_epi32(v39, v40);
        v45 = _mm_unpacklo_epi32(v33, v34);
        v46 = _mm_unpackhi_epi32(v33, v34);
        v47 = _mm_unpacklo_epi32(v35, v36);
        v48 = _mm_unpackhi_epi32(v35, v36);
        v49 = v17 * 2 | v18 >> 63;
        v50 = 135 & (int)((unsigned int)(__ROL__(v17, 32))) >> 31 ^ v18 * 2;
        v51 = v49 * 2 | v50 >> 63;
        v52 = 135 & (int)((unsigned int)(__ROL__(v49, 32))) >> 31 ^ v50 * 2;
        v53 = v51 * 2 | v52 >> 63;
        v54 = 135 & (int)((unsigned int)(__ROL__(v51, 32))) >> 31 ^ v52 * 2;
        v55 = v53 * 2 | v54 >> 63;
        v56 = 135 & (int)((unsigned int)(__ROL__(v53, 32))) >> 31 ^ v54 * 2;
        v57 = v55 * 2 | v56 >> 63;
        v58 = 135 & (int)((unsigned int)(__ROL__(v55, 32))) >> 31 ^ v56 * 2;
        v59 = v57 * 2 | v58 >> 63;
        v60 = 135 & (int)((unsigned int)(__ROL__(v57, 32))) >> 31 ^ v58 * 2;
        v61 = v59 * 2 | v60 >> 63;
        v62 = 135 & (int)((unsigned int)(__ROL__(v59, 32))) >> 31 ^ v60 * 2;
        v63 = (__m128i)(CONCAT(v17, v18));
        v17 = v61 * 2 | v62 >> 63;
        v18 = 135 & (int)((unsigned int)(__ROL__(v61, 32))) >> 31 ^ v62 * 2;
        a6 = _mm_xor_si128(CONCAT(v4, v2), _mm_unpacklo_epi64(v41, v43));
        a12 = _mm_xor_si128(CONCAT(v15, v16), _mm_unpacklo_epi64(v46, v48));
        a13 = _mm_xor_si128(v63, _mm_unpackhi_epi64(v46, v48));
        *a5 = v63;
        iter[3] = _mm_xor_si128(CONCAT(v9, v10), _mm_unpackhi_epi64(v42, v44));
        iter[2] = _mm_xor_si128(CONCAT(v7, v8), _mm_unpacklo_epi64(v42, v44));
        iter[1] = _mm_xor_si128(CONCAT(v5, v6), _mm_unpackhi_epi64(v41, v43));
        *iter = a6;
        v64 = iter + 4;
        v64[3] = a13;
        v64[2] = a12;
        v64[1] = _mm_xor_si128(CONCAT(v13, v14), _mm_unpackhi_epi64(v45, v47));
        *v64 = _mm_xor_si128(CONCAT(v11, v12), _mm_unpacklo_epi64(v45, v47));
        iter = v64 + 4;
        a2 = i - 8;
        v2 = v50;
        v4 = v49;
        v5 = v51;
        v6 = v52;
        v7 = v53;
        v8 = v54;
        v9 = v55;
        v10 = v56;
        v11 = v57;
        v12 = v58;
        v13 = v59;
        v14 = v60;
        v15 = v61;
        v16 = v62;
    } while (8 < i);
    if (!&v0)
        goto LABEL_0xad1978;
    else
        goto LABEL_0xad14f8;
}
