/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad35e0..0xad3b40 (1376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char _NSHomeDirectory;

double sub_ad35e0(uint128_t *a0, void* iter, unsigned int a2, unsigned int *a3, uint128_t *a4)
{
    __m128i v11;  // q3
    unsigned int v12;  // w11
    __m128i v21;  // q0
    __m128i v107;  // 4189
    unsigned int v108;  // w7
    __m128i v109;  // q3
    __m128i v110;  // q0
    __m128i v111;  // q0
    __m128i v112;  // q2
    __m128i v113;  // 4352
    unsigned int v114;  // w7
    __m128i v115;  // q3
    __m128i v116;  // q0
    __m128i v22;  // q2
    __m128i v117;  // q0
    __m128i v118;  // q2
    __m128i v119;  // 4519
    unsigned int v120;  // w7
    __m128i v121;  // q0
    __m128i v122;  // q0
    __m128i v123;  // q2
    __m128i v124;  // 4682
    uint128_t v126;  // q3
    __m128i v23;  // 4189
    uint128_t v127;  // q3
    uint128_t v128;  // q3
    uint128_t v129;  // q3
    unsigned int *v130;  // x0
    unsigned int *v131;  // x0
    uint128_t v132;  // q15
    uint128_t v133;  // q15
    uint128_t v134;  // q14
    uint128_t v135;  // q14
    uint128_t v136;  // q13
    unsigned int v24;  // w7
    uint128_t v137;  // q13
    uint128_t v138;  // q12
    uint128_t v139;  // q12
    __m128i v140;  // q12
    unsigned long long v141;  // d1
    unsigned long long v142;  // d2
    unsigned long long v143;  // d3
    void* v144;  // x1
    unsigned int *v145;  // x0
    unsigned int *v146;  // x0
    __m128i v25;  // q3
    uint128_t v148;  // q15
    uint128_t v150;  // q14
    uint128_t v152;  // q13
    uint128_t v154;  // q12
    unsigned int *v155;  // x0
    uint128_t v156;  // q15
    __m128i v26;  // q0
    uint128_t v157;  // q14
    uint128_t v158;  // q13
    uint128_t v159;  // q12
    __m128i v160;  // q12
    uint96_t v161;  // q1
    uint96_t v162;  // q2
    uint96_t v163;  // q3
    void* v164;  // x1
    void* v165;  // x1
    __m128i v27;  // q0
    __m128i v28;  // q2
    __m128i v29;  // 4352
    unsigned int v30;  // w7
    unsigned int v13;  // w12
    __m128i v31;  // q3
    __m128i v32;  // q0
    __m128i v33;  // q0
    __m128i v34;  // q2
    __m128i v35;  // 4519
    unsigned int v36;  // w7
    __m128i v37;  // q0
    __m128i v38;  // q0
    __m128i v39;  // q2
    __m128i v40;  // 4682
    unsigned int v14;  // w13
    __m128i v41;  // q0
    unsigned int v42;  // w7
    uint128_t v44;  // q3
    uint128_t v45;  // q3
    uint128_t v46;  // q3
    uint128_t v47;  // q3
    unsigned long long v48;  // d8
    unsigned long long v49;  // d9
    unsigned long long v50;  // d10
    unsigned int v15;  // w14
    unsigned long long v51;  // d11
    unsigned long long v52;  // d12
    unsigned long long v53;  // d13
    unsigned long long v54;  // d14
    unsigned long long v55;  // d15
    unsigned long long v56;  // x30
    unsigned int v57;  // w12
    unsigned int v58;  // w13
    unsigned int v59;  // w14
    unsigned int v60;  // w5
    unsigned int v16;  // w15
    __m128i v61;  // q0
    __m128i v62;  // q1
    __m128i v63;  // q2
    __m128i v64;  // q7
    unsigned int v65;  // w2
    unsigned int v17;  // w11
    unsigned int v67;  // w5
    uint128_t v68;  // q7
    unsigned int v69;  // w5
    uint128_t v70;  // q7
    unsigned int v71;  // w5
    uint128_t *v72;  // x0
    __m128i v73;  // 4146
    __m128i v74;  // 4148
    __m128i v75;  // 4150
    __m128i v76;  // 4152
    unsigned int *v18;  // x10
    uint128_t *v77;  // x0
    __m128i v78;  // 4190
    __m128i v79;  // 4192
    __m128i v80;  // 4194
    __m128i v81;  // 4196
    uint128_t *v82;  // x0
    __m128i v83;  // 4198
    __m128i v84;  // 4200
    __m128i v85;  // 4202
    __m128i v86;  // 4204
    __m128i v19;  // q3
    __m128i v87;  // q4
    __m128i v88;  // q5
    __m128i v89;  // q6
    void* v90;  // x1
    unsigned long long v91;  // 4102
    uint128_t v93;  // q3
    uint128_t v94;  // q3
    __m128i v95;  // q3
    unsigned int v96;  // w11
    __m128i v20;  // q0
    unsigned int v97;  // w12
    unsigned int v98;  // w13
    unsigned int v99;  // w14
    unsigned int v100;  // w15
    unsigned int v101;  // w11
    unsigned int *v102;  // x10
    __m128i v103;  // q3
    __m128i v104;  // q0
    __m128i v105;  // q0
    __m128i v106;  // q2
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    v11 = __dirty_unsupported_Iop_Reverse8sIn32_x4(*a4);
    if (a2 == 1)
    {
        v12 = 8;
        v13 = _mm_cvtsi128_si32(v11);
        v14 = _mm_extract_epi32(v11, 1);
        v15 = _mm_extract_epi32(v11, 2);
        v16 = _mm_extract_epi32(v11, 3);
        do
        {
            v17 = v12;
            v18 = a3 + 2;
            v19 = (__m128i)_INSERT(v11, 0, __int_as_float(v15 ^ v16 ^ *a3 ^ v14));
            v20 = _mm_and_si128(PermV(v19, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
            v21 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v20, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v20, _mm_set1_epi32(0xf0f0f0f))));
            v22 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v20, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v20, 4)));
            v23 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v22, v21), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v22) ^ _mm_cvtsi128_si64(v21) ^ 0);
            v24 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v23, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v23, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v23, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v23, _mm_set1_epi32(0xf0f0f0f))))));
            v13 ^= v24 ^ (v24 * 4 | v24 >> 30) ^ (v24 * 0x400 | v24 >> 22) ^ (v24 * 0x40000 | v24 >> 14) ^ (v24 * &_NSHomeDirectory | v24 >> 8);
            v25 = (__m128i)_INSERT(v19, 0, __int_as_float(v15 ^ v16 ^ v13 ^ a3[1]));
            v26 = _mm_and_si128(PermV(v25, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
            v27 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v26, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v26, _mm_set1_epi32(0xf0f0f0f))));
            v28 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v26, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v26, 4)));
            v29 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v28, v27), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v28) ^ _mm_cvtsi128_si64(v27) ^ 0);
            v30 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v29, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v29, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v29, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v29, _mm_set1_epi32(0xf0f0f0f))))));
            a3 = v18 + 2;
            v14 ^= v30 ^ (v30 * 4 | v30 >> 30) ^ (v30 * 0x400 | v30 >> 22) ^ (v30 * 0x40000 | v30 >> 14) ^ (v30 * &_NSHomeDirectory | v30 >> 8);
            v31 = (__m128i)_INSERT(v25, 0, __int_as_float(v13 ^ v14 ^ *v18 ^ v16));
            v32 = _mm_and_si128(PermV(v31, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
            v33 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v32, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v32, _mm_set1_epi32(0xf0f0f0f))));
            v34 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v32, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v32, 4)));
            v35 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v34, v33), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v34) ^ _mm_cvtsi128_si64(v33) ^ 0);
            v36 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v35, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v35, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v35, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v35, _mm_set1_epi32(0xf0f0f0f))))));
            v15 ^= v36 ^ (v36 * 4 | v36 >> 30) ^ (v36 * 0x400 | v36 >> 22) ^ (v36 * 0x40000 | v36 >> 14) ^ (v36 * &_NSHomeDirectory | v36 >> 8);
            v11 = (__m128i)_INSERT(v31, 0, __int_as_float(v13 ^ v14 ^ v15 ^ v18[1]));
            v37 = _mm_and_si128(PermV(v11, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
            v38 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v37, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v37, _mm_set1_epi32(0xf0f0f0f))));
            v39 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v37, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v37, 4)));
            v40 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v39, v38), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v39) ^ _mm_cvtsi128_si64(v38) ^ 0);
            v41 = v40;
            v42 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v41, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v41, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v41, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v41, _mm_set1_epi32(0xf0f0f0f))))));
        } while ((v16 ^= v42 ^ (v42 * 4 | v42 >> 30) ^ (v42 * 0x400 | v42 >> 22) ^ (v42 * 0x40000 | v42 >> 14) ^ (v42 * &_NSHomeDirectory | v42 >> 8), v12 = v17 - 1, v17 != 1));
        v44 = _INSERT(_INSERT(v11, 0, __int_as_float(v16)), 4, v15);
        v45 = _INSERT(v44, 8, v14);
        v46 = _INSERT(v45, 12, v13);
        v47 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v46);
        *(uint128_t *)iter = v47 ^ *a0;
        return _mm_cvtsi128_si64(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v41, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v41, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v41, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v41, _mm_set1_epi32(0xf0f0f0f))))));
    }
    else
    {
        v0 = v48;
        v1 = v49;
        v2 = v50;
        v3 = v51;
        v4 = v52;
        v5 = v53;
        v6 = v54;
        v7 = v55;
        v8 = &v10;
        v9 = v56;
        v57 = _mm_cvtsi128_si32(v11);
        v58 = _mm_extract_epi32(v11, 1);
        v59 = _mm_extract_epi32(v11, 2);
        v60 = _mm_extract_epi32(v11, 3);
        while (1)
        {
            v65 = a2;
            if ((int)v65 >= 4)
            {
                v67 = v60 + 1;
                v68 = _INSERT(_INSERT(v64, 0, __int_as_float(v60)), 4, v67);
                v69 = v67 + 1;
                v70 = _INSERT(v68, 8, v69);
                v71 = v69 + 1;
                v64 = (__m128i)_INSERT(v70, 12, v71);
                v60 = v71 + 1;
                if (8 > (int)v65)
                {
                    v72 = sub_ad1c00();
                    v73 = v72[3];
                    v74 = v72[2];
                    v75 = v72[1];
                    v76 = *v72;
                    a0 = v72 + 4;
                    v61 = _mm_xor_si128(_mm_unpacklo_epi64(_mm_unpacklo_epi32(v76, v75), _mm_unpacklo_epi32(v74, v73)), v61);
                    v62 = _mm_xor_si128(_mm_unpackhi_epi64(_mm_unpacklo_epi32(v76, v75), _mm_unpacklo_epi32(v74, v73)), v62);
                    v63 = _mm_xor_si128(_mm_unpacklo_epi64(_mm_unpackhi_epi32(v76, v75), _mm_unpackhi_epi32(v74, v73)), v63);
                    v11 = _mm_xor_si128(_mm_unpackhi_epi64(_mm_unpackhi_epi32(v76, v75), _mm_unpackhi_epi32(v74, v73)), v11);
                    *(__m128i *)&iter[48] = CatOddLanesV(_mm_unpackhi_epi64(v63, v11), _mm_unpackhi_epi64(v61, v62));
                    *(__m128i *)&iter[32] = CatEvenLanesV(_mm_unpackhi_epi64(v63, v11), _mm_unpackhi_epi64(v61, v62));
                    *(__m128i *)&iter[16] = CatOddLanesV(_mm_unpacklo_epi64(v63, v11), _mm_unpacklo_epi64(v61, v62));
                    *(__m128i *)iter = CatEvenLanesV(_mm_unpacklo_epi64(v63, v11), _mm_unpacklo_epi64(v61, v62));
                    iter += 64;
                    a2 = v65 - 4;
                    if (v65 == 4)
                        break;
                }
                else
                {
                    v60 += 4;
                    v77 = sub_ad1e20();
                    v78 = v77[3];
                    v79 = v77[2];
                    v80 = v77[1];
                    v81 = *v77;
                    v82 = v77 + 4;
                    v83 = v82[3];
                    v84 = v82[2];
                    v85 = v82[1];
                    v86 = *v82;
                    a0 = v82 + 4;
                    v61 = _mm_xor_si128(_mm_unpacklo_epi64(_mm_unpacklo_epi32(v81, v80), _mm_unpacklo_epi32(v79, v78)), v61);
                    v62 = _mm_xor_si128(_mm_unpackhi_epi64(_mm_unpacklo_epi32(v81, v80), _mm_unpacklo_epi32(v79, v78)), v62);
                    v63 = _mm_xor_si128(_mm_unpacklo_epi64(_mm_unpackhi_epi32(v81, v80), _mm_unpackhi_epi32(v79, v78)), v63);
                    v11 = _mm_xor_si128(_mm_unpackhi_epi64(_mm_unpackhi_epi32(v81, v80), _mm_unpackhi_epi32(v79, v78)), v11);
                    v87 = _mm_xor_si128(_mm_unpacklo_epi64(_mm_unpacklo_epi32(v86, v85), _mm_unpacklo_epi32(v84, v83)), CONCAT(v57 | v57 * 0x100000000, v57 | v57 * 0x100000000));
                    v88 = _mm_xor_si128(_mm_unpackhi_epi64(_mm_unpacklo_epi32(v86, v85), _mm_unpacklo_epi32(v84, v83)), CONCAT(v58 | v58 * 0x100000000, v58 | v58 * 0x100000000));
                    v89 = _mm_xor_si128(_mm_unpacklo_epi64(_mm_unpackhi_epi32(v86, v85), _mm_unpackhi_epi32(v84, v83)), CONCAT(v59 | v59 * 0x100000000, v59 | v59 * 0x100000000));
                    v64 = _mm_xor_si128(_mm_unpackhi_epi64(_mm_unpackhi_epi32(v86, v85), _mm_unpackhi_epi32(v84, v83)), v64);
                    *(__m128i *)&iter[48] = CatOddLanesV(_mm_unpackhi_epi64(v63, v11), _mm_unpackhi_epi64(v61, v62));
                    *(__m128i *)&iter[32] = CatEvenLanesV(_mm_unpackhi_epi64(v63, v11), _mm_unpackhi_epi64(v61, v62));
                    *(__m128i *)&iter[16] = CatOddLanesV(_mm_unpacklo_epi64(v63, v11), _mm_unpacklo_epi64(v61, v62));
                    *(__m128i *)iter = CatEvenLanesV(_mm_unpacklo_epi64(v63, v11), _mm_unpacklo_epi64(v61, v62));
                    v90 = iter + 64;
                    *(__m128i *)&v90[48] = CatOddLanesV(_mm_unpackhi_epi64(v89, v64), _mm_unpackhi_epi64(v87, v88));
                    *(__m128i *)&v90[32] = CatEvenLanesV(_mm_unpackhi_epi64(v89, v64), _mm_unpackhi_epi64(v87, v88));
                    *(__m128i *)&v90[16] = CatOddLanesV(_mm_unpacklo_epi64(v89, v64), _mm_unpacklo_epi64(v87, v88));
                    *(__m128i *)v90 = CatEvenLanesV(_mm_unpacklo_epi64(v89, v64), _mm_unpacklo_epi64(v87, v88));
                    iter = v90 + 64;
                    a2 = v65 - 8;
                    if (v65 == 8)
                        break;
                }
            }
            else if ((int)v65 >= 1)
            {
                v91 = arm64g_calculate_condition(195, v65, 1, 0);
                if (!(v91 & 1))
                {
                    v93 = _INSERT(_INSERT(v11, 0, __int_as_float(v57)), 4, v58);
                    v94 = _INSERT(v93, 8, v59);
                    v95 = (__m128i)_INSERT(v94, 12, v60);
                    v96 = 8;
                    v97 = _mm_cvtsi128_si32(v95);
                    v98 = _mm_extract_epi32(v95, 1);
                    v99 = _mm_extract_epi32(v95, 2);
                    v100 = _mm_extract_epi32(v95, 3);
                    do
                    {
                        v101 = v96;
                        v102 = a3 + 2;
                        v103 = (__m128i)_INSERT(v95, 0, __int_as_float(v99 ^ v100 ^ *a3 ^ v98));
                        v104 = _mm_and_si128(PermV(v103, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
                        v105 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v104, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v104, _mm_set1_epi32(0xf0f0f0f))));
                        v106 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v104, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v104, 4)));
                        v107 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v106, v105), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v106) ^ _mm_cvtsi128_si64(v105) ^ 0);
                        v108 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v107, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v107, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v107, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v107, _mm_set1_epi32(0xf0f0f0f))))));
                        v97 ^= v108 ^ (v108 * 4 | v108 >> 30) ^ (v108 * 0x400 | v108 >> 22) ^ (v108 * 0x40000 | v108 >> 14) ^ (v108 * &_NSHomeDirectory | v108 >> 8);
                        v109 = (__m128i)_INSERT(v103, 0, __int_as_float(v99 ^ v100 ^ v97 ^ a3[1]));
                        v110 = _mm_and_si128(PermV(v109, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
                        v111 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v110, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v110, _mm_set1_epi32(0xf0f0f0f))));
                        v112 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v110, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v110, 4)));
                        v113 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v112, v111), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v112) ^ _mm_cvtsi128_si64(v111) ^ 0);
                        v114 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v113, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v113, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v113, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v113, _mm_set1_epi32(0xf0f0f0f))))));
                        a3 = v102 + 2;
                        v98 ^= v114 ^ (v114 * 4 | v114 >> 30) ^ (v114 * 0x400 | v114 >> 22) ^ (v114 * 0x40000 | v114 >> 14) ^ (v114 * &_NSHomeDirectory | v114 >> 8);
                        v115 = (__m128i)_INSERT(v109, 0, __int_as_float(v97 ^ v98 ^ *v102 ^ v100));
                        v116 = _mm_and_si128(PermV(v115, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
                        v117 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v116, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v116, _mm_set1_epi32(0xf0f0f0f))));
                        v118 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v116, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v116, 4)));
                        v119 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v118, v117), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v118) ^ _mm_cvtsi128_si64(v117) ^ 0);
                        v120 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v119, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v119, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v119, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v119, _mm_set1_epi32(0xf0f0f0f))))));
                        v99 ^= v120 ^ (v120 * 4 | v120 >> 30) ^ (v120 * 0x400 | v120 >> 22) ^ (v120 * 0x40000 | v120 >> 14) ^ (v120 * &_NSHomeDirectory | v120 >> 8);
                        v95 = (__m128i)_INSERT(v115, 0, __int_as_float(v97 ^ v98 ^ v99 ^ v102[1]));
                        v121 = _mm_and_si128(PermV(v95, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
                        v122 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v121, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v121, _mm_set1_epi32(0xf0f0f0f))));
                        v123 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v121, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v121, 4)));
                        v124 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v123, v122), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v123) ^ _mm_cvtsi128_si64(v122) ^ 0);
                        v61 = _mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v124, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v124, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v124, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v124, _mm_set1_epi32(0xf0f0f0f)))));
                    } while ((v100 ^= _mm_cvtsi128_si32(v61) ^ __ROL__(_mm_cvtsi128_si32(v61), 2) ^ __ROL__(_mm_cvtsi128_si32(v61), 10) ^ __ROL__(_mm_cvtsi128_si32(v61), 18) ^ __ROL__(_mm_cvtsi128_si32(v61), 24), v96 = v101 - 1, v101 != 1));
                    v126 = _INSERT(_INSERT(v95, 0, __int_as_float(v100)), 4, v99);
                    v127 = _INSERT(v126, 8, v98);
                    v128 = _INSERT(v127, 12, v97);
                    v129 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v128);
                    *(uint128_t *)iter = v129 ^ *a0;
                    break;
                }
                else if (v65 == 2)
                {
                    v130 = sub_ad1c00();
                    v131 = v130 + 4;
                    v133 = _INSERT(v132, 0, v130[3]);
                    v135 = _INSERT(v134, 0, v130[2]);
                    v137 = _INSERT(v136, 0, v130[1]);
                    v139 = _INSERT(v138, 0, *v130);
                    v140 = (__m128i)_INSERT(v139, 4, *v131);
                    v61 = _mm_xor_si128(v140, v61);
                    v141 = _INSERT(v137, 4, v131[1]) ^ _mm_cvtsi128_si64(v62);
                    v142 = _INSERT(v135, 4, v131[2]) ^ _mm_cvtsi128_si64(v63);
                    v143 = _INSERT(v133, 4, v131[3]) ^ _mm_cvtsi128_si64(v11);
                    v144 = iter + 16;
                    *(unsigned int *)&iter[12] = v143;
                    *(unsigned int *)&iter[8] = v142;
                    *(unsigned int *)&iter[4] = v141;
                    *(int *)iter = _mm_cvtsi128_si32(v61);
                    *(unsigned int *)&v144[12] = *(unsigned int *)((void*)&v143 + 4);
                    *(unsigned int *)&v144[8] = *(unsigned int *)((void*)&v142 + 4);
                    *(unsigned int *)&v144[4] = *(unsigned int *)((void*)&v141 + 4);
                    *(int *)v144 = _mm_extract_epi32(v61, 1);
                    break;
                }
                else
                {
                    v145 = sub_ad1c00();
                    v146 = v145 + 4;
                    v148 = _INSERT(v132, 0, v145[3]);
                    v150 = _INSERT(v134, 0, v145[2]);
                    v152 = _INSERT(v136, 0, v145[1]);
                    v154 = _INSERT(v138, 0, *v145);
                    v155 = v146 + 4;
                    v156 = _INSERT(v148, 4, v146[3]);
                    v157 = _INSERT(v150, 4, v146[2]);
                    v158 = _INSERT(v152, 4, v146[1]);
                    v159 = _INSERT(v154, 4, *v146);
                    v160 = (__m128i)_INSERT(v159, 8, *v155);
                    v61 = _mm_xor_si128(v160, v61);
                    v161 = (uint96_t)(_INSERT(v158, 8, v155[1]) & 0xffffffffffffffffffffffff & 0xffffffffffffffffffffffff ^ v62 & 0xffffffffffffffffffffffff);
                    v162 = (uint96_t)(_INSERT(v157, 8, v155[2]) & 0xffffffffffffffffffffffff & 0xffffffffffffffffffffffff ^ v63 & 0xffffffffffffffffffffffff);
                    v163 = (uint96_t)(_INSERT(v156, 8, v155[3]) & 0xffffffffffffffffffffffff & 0xffffffffffffffffffffffff ^ v11 & 0xffffffffffffffffffffffff);
                    v164 = iter + 16;
                    *(unsigned int *)&iter[12] = v163;
                    *(unsigned int *)&iter[8] = v162;
                    *(unsigned int *)&iter[4] = v161;
                    *(int *)iter = _mm_cvtsi128_si32(v61);
                    v165 = v164 + 16;
                    *(unsigned int *)&v164[12] = *(unsigned int *)((void*)&v163 + 4);
                    *(unsigned int *)&v164[8] = *(unsigned int *)((void*)&v162 + 4);
                    *(unsigned int *)&v164[4] = *(unsigned int *)((void*)&v161 + 4);
                    *(int *)v164 = _mm_extract_epi32(v61, 1);
                    *(unsigned int *)&v165[12] = *(unsigned int *)((void*)&v163 + 8);
                    *(unsigned int *)&v165[8] = *(unsigned int *)((void*)&v162 + 8);
                    *(unsigned int *)&v165[4] = *(unsigned int *)((void*)&v161 + 8);
                    *(int *)v165 = _mm_extract_epi32(v61, 2);
                    break;
                }
            }
        }
        return _mm_cvtsi128_si64(v61);
    }
}
