/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xacf860..0xacfe20 (1472 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_1000000;

double sub_acf860(uint128_t *a0, void* iter, unsigned int a2, unsigned int *a3, uint128_t *a4)
{
    __m128i v11;  // q3
    unsigned int v12;  // w11
    __m128i v20;  // q0
    uint128_t v107;  // q3
    unsigned int *v108;  // x0
    unsigned int *v109;  // x0
    uint128_t v110;  // q15
    uint128_t v111;  // q15
    uint128_t v112;  // q14
    uint128_t v113;  // q14
    uint128_t v114;  // q13
    uint128_t v115;  // q13
    uint128_t v116;  // q12
    __m128i v21;  // q0
    uint128_t v117;  // q12
    __m128i v118;  // q12
    unsigned long long v119;  // d1
    unsigned long long v120;  // d2
    unsigned long long v121;  // d3
    void* v122;  // x1
    unsigned int *v123;  // x0
    unsigned int *v124;  // x0
    uint128_t v126;  // q15
    uint128_t v128;  // q14
    uint128_t v130;  // q13
    uint128_t v132;  // q12
    unsigned int *v133;  // x0
    uint128_t v134;  // q15
    uint128_t v135;  // q14
    uint128_t v136;  // q13
    unsigned int v23;  // w7
    uint128_t v137;  // q12
    __m128i v138;  // q12
    uint96_t v139;  // q1
    uint96_t v140;  // q2
    uint96_t v141;  // q3
    void* v142;  // x1
    void* v143;  // x1
    __m128i v24;  // q0
    __m128i v25;  // q0
    unsigned int v27;  // w7
    __m128i v28;  // q0
    __m128i v29;  // q0
    unsigned int v13;  // w12
    unsigned int v31;  // w7
    __m128i v32;  // q0
    unsigned int v33;  // s1
    __m128i v34;  // q3
    unsigned int v35;  // w7
    uint128_t v37;  // q3
    uint128_t v38;  // q3
    uint128_t v39;  // q3
    unsigned int v14;  // w13
    uint128_t v40;  // q3
    unsigned long long v41;  // d8
    unsigned long long v42;  // d9
    unsigned long long v43;  // d10
    unsigned long long v44;  // d11
    unsigned long long v45;  // d12
    unsigned long long v46;  // d13
    unsigned long long v47;  // d14
    unsigned long long v48;  // d15
    unsigned long long v49;  // x30
    unsigned int v15;  // w14
    unsigned int v50;  // w12
    unsigned int v51;  // w13
    unsigned int v52;  // w14
    unsigned int v53;  // w5
    __m128i v54;  // q1
    __m128i v55;  // q2
    __m128i v56;  // q7
    unsigned int v16;  // w15
    unsigned int v57;  // w2
    unsigned int v59;  // w5
    uint128_t v60;  // q7
    unsigned int v61;  // w5
    uint128_t v62;  // q7
    unsigned int v63;  // w5
    uint128_t *v64;  // x0
    __m128i v65;  // 4146
    __m128i v66;  // 4148
    __m128i v67;  // 4150
    __m128i v68;  // 4152
    uint128_t *v69;  // x0
    __m128i v70;  // 4190
    __m128i v71;  // 4192
    __m128i v72;  // 4194
    __m128i v73;  // 4196
    uint128_t *v74;  // x0
    __m128i v75;  // 4198
    __m128i v76;  // 4200
    __m128i v17;  // q0
    __m128i v77;  // 4202
    __m128i v78;  // 4204
    __m128i v79;  // q4
    __m128i v80;  // q5
    __m128i v81;  // q6
    void* v82;  // x1
    unsigned long long v83;  // 4102
    unsigned int v84;  // w11
    unsigned int v85;  // w11
    unsigned int *v86;  // x10
    unsigned int v18;  // w11
    __m128i v87;  // q0
    __m128i v88;  // q0
    unsigned int v90;  // w7
    __m128i v91;  // q0
    __m128i v92;  // q0
    unsigned int v94;  // w7
    __m128i v95;  // q0
    __m128i v96;  // q0
    unsigned int *v19;  // x10
    unsigned int v98;  // w7
    __m128i v99;  // q0
    unsigned int v100;  // s1
    __m128i v101;  // q3
    unsigned int v102;  // w7
    uint128_t v104;  // q3
    uint128_t v105;  // q3
    uint128_t v106;  // q3
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
            v18 = v12;
            v19 = a3 + 2;
            v20 = (__m128i)_INSERT(v17, 0, __int_as_float(v15 ^ v16 ^ *a3 ^ v14));
            v21 = _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-90, 63, -113, 117, -6, -108, -33, -128, -107, -24, 8, -55, -87, 28, -77, -28), _mm_and_si128(_mm_sub_epi8(v20, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v20, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(98, -84, -49, -19, 67, 11, 84, 0x33, 122, -104, -17, -111, -12, 80, 66, -100), _mm_and_si128(_mm_sub_epi8(v20, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v20, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-103, 6, -122, 73, 38, 19, 0x44, -86, -61, 4, -66, 42, 118, -102, 103, 43), _mm_and_si128(_mm_sub_epi8(v20, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v20, _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(5, 44, -5, 40, -62, 20, -74, 22, -73, 61, -31, -52, -2, -23, -112, -42), _mm_and_si128(v20, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v20)))));
            v23 = _mm_cvtsi128_si32(v21) + (_mm_cvtsi128_si32(PermV(_mm_set_epi8(-98, -56, -60, -96, -25, 2, 54, 76, 82, 39, -45, -97, 87, 70, 0, -44), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v20, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v20, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(-121, 120, 33, 1, 59, 124, 0x22, 37, -94, -47, 88, 99, 94, 14, 36, 30), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v20, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v20, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(53, -99, 86, 112, 75, 15, -21, -8, -117, -38, 100, 113, -78, -127, 107, 104), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v20, _mm_set1_epi8(64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v20, _mm_set1_epi8(64)), _mm_set1_epi8(16)))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(-88, 79, -123, -26, 25, 60, 89, -125, -70, 23, 115, -13, -4, -89, 7, 71), _mm_and_si128(_mm_sub_epi8(v20, _mm_set1_epi8(64)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v20, _mm_set1_epi8(64))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(81, 91, 108, 109, 114, 106, -1, 3, 47, -114, -3, -34, 69, 55, -37, -43), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v20, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v20, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(111, 78, 83, 13, -85, 35, 41, -64, 96, -54, 0x66, -126, 46, -30, -10, 29), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v20, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v20, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-29, -79, -116, -11, 48, 50, -109, -83, 0x55, 26, 52, -101, -92, 93, -82, -32), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v20, _mm_set1_epi8(-128)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v20, _mm_set1_epi8(-128)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(-95, 21, 97, -7, -50, -14, -9, -93, -75, 56, -57, 64, -46, -118, -65, -22), _mm_and_si128(_mm_sub_epi8(v20, _mm_set1_epi8(-128)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v20, _mm_set1_epi8(-128)))))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(72, 57, -53, -41, 62, 95, -18, 121, 32, 77, -36, 58, -20, 125, -16, 24), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v20, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v20, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-124, -58, 110, -59, 9, -15, -71, 101, 126, 0x77, -106, 12, 74, -105, 105, -119), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v20, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v20, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-80, -76, -27, -72, 18, -48, 116, 45, -67, 123, -51, -91, -120, 49, -63, 10), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v20, _mm_set1_epi8(-64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v20, _mm_set1_epi8(-64)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(-40, 90, 16, 31, 65, 92, -39, 0x11, 127, -68, -35, -69, -110, -81, 27, -115), _mm_and_si128(_mm_sub_epi8(v20, _mm_set1_epi8(-64)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v20, _mm_set1_epi8(-64))))))));
            v13 ^= v23 ^ (v23 * 4 | v23 >> 30) ^ (v23 * 0x400 | v23 >> 22) ^ (v23 * 0x40000 | v23 >> 14) ^ (v23 * &g_1000000 | v23 >> 8);
            v24 = (__m128i)_INSERT(v21, 0, __int_as_float(v15 ^ v16 ^ v13 ^ a3[1]));
            v25 = _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-90, 63, -113, 117, -6, -108, -33, -128, -107, -24, 8, -55, -87, 28, -77, -28), _mm_and_si128(_mm_sub_epi8(v24, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v24, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(98, -84, -49, -19, 67, 11, 84, 0x33, 122, -104, -17, -111, -12, 80, 66, -100), _mm_and_si128(_mm_sub_epi8(v24, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v24, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-103, 6, -122, 73, 38, 19, 0x44, -86, -61, 4, -66, 42, 118, -102, 103, 43), _mm_and_si128(_mm_sub_epi8(v24, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v24, _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(5, 44, -5, 40, -62, 20, -74, 22, -73, 61, -31, -52, -2, -23, -112, -42), _mm_and_si128(v24, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v24)))));
            v27 = _mm_cvtsi128_si32(v25) + (_mm_cvtsi128_si32(PermV(_mm_set_epi8(-98, -56, -60, -96, -25, 2, 54, 76, 82, 39, -45, -97, 87, 70, 0, -44), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v24, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v24, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(-121, 120, 33, 1, 59, 124, 0x22, 37, -94, -47, 88, 99, 94, 14, 36, 30), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v24, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v24, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(53, -99, 86, 112, 75, 15, -21, -8, -117, -38, 100, 113, -78, -127, 107, 104), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v24, _mm_set1_epi8(64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v24, _mm_set1_epi8(64)), _mm_set1_epi8(16)))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(-88, 79, -123, -26, 25, 60, 89, -125, -70, 23, 115, -13, -4, -89, 7, 71), _mm_and_si128(_mm_sub_epi8(v24, _mm_set1_epi8(64)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v24, _mm_set1_epi8(64))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(81, 91, 108, 109, 114, 106, -1, 3, 47, -114, -3, -34, 69, 55, -37, -43), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v24, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v24, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(111, 78, 83, 13, -85, 35, 41, -64, 96, -54, 0x66, -126, 46, -30, -10, 29), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v24, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v24, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-29, -79, -116, -11, 48, 50, -109, -83, 0x55, 26, 52, -101, -92, 93, -82, -32), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v24, _mm_set1_epi8(-128)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v24, _mm_set1_epi8(-128)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(-95, 21, 97, -7, -50, -14, -9, -93, -75, 56, -57, 64, -46, -118, -65, -22), _mm_and_si128(_mm_sub_epi8(v24, _mm_set1_epi8(-128)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v24, _mm_set1_epi8(-128)))))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(72, 57, -53, -41, 62, 95, -18, 121, 32, 77, -36, 58, -20, 125, -16, 24), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v24, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v24, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-124, -58, 110, -59, 9, -15, -71, 101, 126, 0x77, -106, 12, 74, -105, 105, -119), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v24, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v24, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-80, -76, -27, -72, 18, -48, 116, 45, -67, 123, -51, -91, -120, 49, -63, 10), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v24, _mm_set1_epi8(-64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v24, _mm_set1_epi8(-64)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(-40, 90, 16, 31, 65, 92, -39, 0x11, 127, -68, -35, -69, -110, -81, 27, -115), _mm_and_si128(_mm_sub_epi8(v24, _mm_set1_epi8(-64)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v24, _mm_set1_epi8(-64))))))));
            a3 = v19 + 2;
            v14 ^= v27 ^ (v27 * 4 | v27 >> 30) ^ (v27 * 0x400 | v27 >> 22) ^ (v27 * 0x40000 | v27 >> 14) ^ (v27 * &g_1000000 | v27 >> 8);
            v28 = (__m128i)_INSERT(v25, 0, __int_as_float(v13 ^ v14 ^ *v19 ^ v16));
            v29 = _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-90, 63, -113, 117, -6, -108, -33, -128, -107, -24, 8, -55, -87, 28, -77, -28), _mm_and_si128(_mm_sub_epi8(v28, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v28, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(98, -84, -49, -19, 67, 11, 84, 0x33, 122, -104, -17, -111, -12, 80, 66, -100), _mm_and_si128(_mm_sub_epi8(v28, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v28, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-103, 6, -122, 73, 38, 19, 0x44, -86, -61, 4, -66, 42, 118, -102, 103, 43), _mm_and_si128(_mm_sub_epi8(v28, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v28, _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(5, 44, -5, 40, -62, 20, -74, 22, -73, 61, -31, -52, -2, -23, -112, -42), _mm_and_si128(v28, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v28)))));
            v31 = _mm_cvtsi128_si32(v29) + (_mm_cvtsi128_si32(PermV(_mm_set_epi8(-98, -56, -60, -96, -25, 2, 54, 76, 82, 39, -45, -97, 87, 70, 0, -44), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v28, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v28, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(-121, 120, 33, 1, 59, 124, 0x22, 37, -94, -47, 88, 99, 94, 14, 36, 30), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v28, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v28, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(53, -99, 86, 112, 75, 15, -21, -8, -117, -38, 100, 113, -78, -127, 107, 104), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v28, _mm_set1_epi8(64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v28, _mm_set1_epi8(64)), _mm_set1_epi8(16)))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(-88, 79, -123, -26, 25, 60, 89, -125, -70, 23, 115, -13, -4, -89, 7, 71), _mm_and_si128(_mm_sub_epi8(v28, _mm_set1_epi8(64)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v28, _mm_set1_epi8(64))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(81, 91, 108, 109, 114, 106, -1, 3, 47, -114, -3, -34, 69, 55, -37, -43), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v28, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v28, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(111, 78, 83, 13, -85, 35, 41, -64, 96, -54, 0x66, -126, 46, -30, -10, 29), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v28, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v28, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-29, -79, -116, -11, 48, 50, -109, -83, 0x55, 26, 52, -101, -92, 93, -82, -32), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v28, _mm_set1_epi8(-128)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v28, _mm_set1_epi8(-128)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(-95, 21, 97, -7, -50, -14, -9, -93, -75, 56, -57, 64, -46, -118, -65, -22), _mm_and_si128(_mm_sub_epi8(v28, _mm_set1_epi8(-128)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v28, _mm_set1_epi8(-128)))))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(72, 57, -53, -41, 62, 95, -18, 121, 32, 77, -36, 58, -20, 125, -16, 24), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v28, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v28, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-124, -58, 110, -59, 9, -15, -71, 101, 126, 0x77, -106, 12, 74, -105, 105, -119), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v28, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v28, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-80, -76, -27, -72, 18, -48, 116, 45, -67, 123, -51, -91, -120, 49, -63, 10), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v28, _mm_set1_epi8(-64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v28, _mm_set1_epi8(-64)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(-40, 90, 16, 31, 65, 92, -39, 0x11, 127, -68, -35, -69, -110, -81, 27, -115), _mm_and_si128(_mm_sub_epi8(v28, _mm_set1_epi8(-64)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v28, _mm_set1_epi8(-64))))))));
            v15 ^= v31 ^ (v31 * 4 | v31 >> 30) ^ (v31 * 0x400 | v31 >> 22) ^ (v31 * 0x40000 | v31 >> 14) ^ (v31 * &g_1000000 | v31 >> 8);
            v32 = (__m128i)_INSERT(v29, 0, __int_as_float(v13 ^ v14 ^ v15 ^ v19[1]));
            v17 = _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-90, 63, -113, 117, -6, -108, -33, -128, -107, -24, 8, -55, -87, 28, -77, -28), _mm_and_si128(_mm_sub_epi8(v32, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v32, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(98, -84, -49, -19, 67, 11, 84, 0x33, 122, -104, -17, -111, -12, 80, 66, -100), _mm_and_si128(_mm_sub_epi8(v32, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v32, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-103, 6, -122, 73, 38, 19, 0x44, -86, -61, 4, -66, 42, 118, -102, 103, 43), _mm_and_si128(_mm_sub_epi8(v32, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v32, _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(5, 44, -5, 40, -62, 20, -74, 22, -73, 61, -31, -52, -2, -23, -112, -42), _mm_and_si128(v32, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v32)))));
            v33 = _mm_cvtsi128_si32(PermV(_mm_set_epi8(-98, -56, -60, -96, -25, 2, 54, 76, 82, 39, -45, -97, 87, 70, 0, -44), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v32, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v32, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(-121, 120, 33, 1, 59, 124, 0x22, 37, -94, -47, 88, 99, 94, 14, 36, 30), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v32, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v32, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(53, -99, 86, 112, 75, 15, -21, -8, -117, -38, 100, 113, -78, -127, 107, 104), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v32, _mm_set1_epi8(64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v32, _mm_set1_epi8(64)), _mm_set1_epi8(16)))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(-88, 79, -123, -26, 25, 60, 89, -125, -70, 23, 115, -13, -4, -89, 7, 71), _mm_and_si128(_mm_sub_epi8(v32, _mm_set1_epi8(64)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v32, _mm_set1_epi8(64))));
            v34 = _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(72, 57, -53, -41, 62, 95, -18, 121, 32, 77, -36, 58, -20, 125, -16, 24), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v32, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v32, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-124, -58, 110, -59, 9, -15, -71, 101, 126, 0x77, -106, 12, 74, -105, 105, -119), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v32, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v32, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-80, -76, -27, -72, 18, -48, 116, 45, -67, 123, -51, -91, -120, 49, -63, 10), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v32, _mm_set1_epi8(-64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v32, _mm_set1_epi8(-64)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(-40, 90, 16, 31, 65, 92, -39, 0x11, 127, -68, -35, -69, -110, -81, 27, -115), _mm_and_si128(_mm_sub_epi8(v32, _mm_set1_epi8(-64)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v32, _mm_set1_epi8(-64)))))));
        } while ((v35 = _mm_cvtsi128_si32(v17) + __float_as_int(v33) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(81, 91, 108, 109, 114, 106, -1, 3, 47, -114, -3, -34, 69, 55, -37, -43), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v32, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v32, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(111, 78, 83, 13, -85, 35, 41, -64, 96, -54, 0x66, -126, 46, -30, -10, 29), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v32, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v32, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-29, -79, -116, -11, 48, 50, -109, -83, 0x55, 26, 52, -101, -92, 93, -82, -32), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v32, _mm_set1_epi8(-128)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v32, _mm_set1_epi8(-128)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(-95, 21, 97, -7, -50, -14, -9, -93, -75, 56, -57, 64, -46, -118, -65, -22), _mm_and_si128(_mm_sub_epi8(v32, _mm_set1_epi8(-128)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v32, _mm_set1_epi8(-128)))))))) + _mm_cvtsi128_si32(v34), v16 ^= v35 ^ __ROL__(v35, 2) ^ __ROL__(v35, 10) ^ __ROL__(v35, 18) ^ __ROL__(v35, 24), v12 = v18 - 1, v18 != 1));
        v37 = _INSERT(_INSERT(v34, 0, __int_as_float(v16)), 4, v15);
        v38 = _INSERT(v37, 8, v14);
        v39 = _INSERT(v38, 12, v13);
        v40 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v39);
        *(uint128_t *)iter = v40 ^ *a0;
        return _mm_cvtsi128_si64(v17);
    }
    else
    {
        v0 = v41;
        v1 = v42;
        v2 = v43;
        v3 = v44;
        v4 = v45;
        v5 = v46;
        v6 = v47;
        v7 = v48;
        v8 = &v10;
        v9 = v49;
        v50 = _mm_cvtsi128_si32(v11);
        v51 = _mm_extract_epi32(v11, 1);
        v52 = _mm_extract_epi32(v11, 2);
        v53 = _mm_extract_epi32(v11, 3);
        while (1)
        {
            v57 = a2;
            if ((int)v57 >= 4)
            {
                v59 = v53 + 1;
                v60 = _INSERT(_INSERT(v56, 0, __int_as_float(v53)), 4, v59);
                v61 = v59 + 1;
                v62 = _INSERT(v60, 8, v61);
                v63 = v61 + 1;
                v56 = (__m128i)_INSERT(v62, 12, v63);
                v53 = v63 + 1;
                if (8 > (int)v57)
                {
                    v64 = sub_acdd30();
                    v65 = v64[3];
                    v66 = v64[2];
                    v67 = v64[1];
                    v68 = *v64;
                    a0 = v64 + 4;
                    v17 = _mm_xor_si128(_mm_unpacklo_epi64(_mm_unpacklo_epi32(v68, v67), _mm_unpacklo_epi32(v66, v65)), v17);
                    v54 = _mm_xor_si128(_mm_unpackhi_epi64(_mm_unpacklo_epi32(v68, v67), _mm_unpacklo_epi32(v66, v65)), v54);
                    v55 = _mm_xor_si128(_mm_unpacklo_epi64(_mm_unpackhi_epi32(v68, v67), _mm_unpackhi_epi32(v66, v65)), v55);
                    v11 = _mm_xor_si128(_mm_unpackhi_epi64(_mm_unpackhi_epi32(v68, v67), _mm_unpackhi_epi32(v66, v65)), v11);
                    *(__m128i *)&iter[48] = CatOddLanesV(_mm_unpackhi_epi64(v55, v11), _mm_unpackhi_epi64(v17, v54));
                    *(__m128i *)&iter[32] = CatEvenLanesV(_mm_unpackhi_epi64(v55, v11), _mm_unpackhi_epi64(v17, v54));
                    *(__m128i *)&iter[16] = CatOddLanesV(_mm_unpacklo_epi64(v55, v11), _mm_unpacklo_epi64(v17, v54));
                    *(__m128i *)iter = CatEvenLanesV(_mm_unpacklo_epi64(v55, v11), _mm_unpacklo_epi64(v17, v54));
                    iter += 64;
                    a2 = v57 - 4;
                    if (v57 == 4)
                        break;
                }
                else
                {
                    v53 += 4;
                    v69 = sub_acdf40();
                    v70 = v69[3];
                    v71 = v69[2];
                    v72 = v69[1];
                    v73 = *v69;
                    v74 = v69 + 4;
                    v75 = v74[3];
                    v76 = v74[2];
                    v77 = v74[1];
                    v78 = *v74;
                    a0 = v74 + 4;
                    v17 = _mm_xor_si128(_mm_unpacklo_epi64(_mm_unpacklo_epi32(v73, v72), _mm_unpacklo_epi32(v71, v70)), v17);
                    v54 = _mm_xor_si128(_mm_unpackhi_epi64(_mm_unpacklo_epi32(v73, v72), _mm_unpacklo_epi32(v71, v70)), v54);
                    v55 = _mm_xor_si128(_mm_unpacklo_epi64(_mm_unpackhi_epi32(v73, v72), _mm_unpackhi_epi32(v71, v70)), v55);
                    v11 = _mm_xor_si128(_mm_unpackhi_epi64(_mm_unpackhi_epi32(v73, v72), _mm_unpackhi_epi32(v71, v70)), v11);
                    v79 = _mm_xor_si128(_mm_unpacklo_epi64(_mm_unpacklo_epi32(v78, v77), _mm_unpacklo_epi32(v76, v75)), CONCAT(v50 | v50 * 0x100000000, v50 | v50 * 0x100000000));
                    v80 = _mm_xor_si128(_mm_unpackhi_epi64(_mm_unpacklo_epi32(v78, v77), _mm_unpacklo_epi32(v76, v75)), CONCAT(v51 | v51 * 0x100000000, v51 | v51 * 0x100000000));
                    v81 = _mm_xor_si128(_mm_unpacklo_epi64(_mm_unpackhi_epi32(v78, v77), _mm_unpackhi_epi32(v76, v75)), CONCAT(v52 | v52 * 0x100000000, v52 | v52 * 0x100000000));
                    v56 = _mm_xor_si128(_mm_unpackhi_epi64(_mm_unpackhi_epi32(v78, v77), _mm_unpackhi_epi32(v76, v75)), v56);
                    *(__m128i *)&iter[48] = CatOddLanesV(_mm_unpackhi_epi64(v55, v11), _mm_unpackhi_epi64(v17, v54));
                    *(__m128i *)&iter[32] = CatEvenLanesV(_mm_unpackhi_epi64(v55, v11), _mm_unpackhi_epi64(v17, v54));
                    *(__m128i *)&iter[16] = CatOddLanesV(_mm_unpacklo_epi64(v55, v11), _mm_unpacklo_epi64(v17, v54));
                    *(__m128i *)iter = CatEvenLanesV(_mm_unpacklo_epi64(v55, v11), _mm_unpacklo_epi64(v17, v54));
                    v82 = iter + 64;
                    *(__m128i *)&v82[48] = CatOddLanesV(_mm_unpackhi_epi64(v81, v56), _mm_unpackhi_epi64(v79, v80));
                    *(__m128i *)&v82[32] = CatEvenLanesV(_mm_unpackhi_epi64(v81, v56), _mm_unpackhi_epi64(v79, v80));
                    *(__m128i *)&v82[16] = CatOddLanesV(_mm_unpacklo_epi64(v81, v56), _mm_unpacklo_epi64(v79, v80));
                    *(__m128i *)v82 = CatEvenLanesV(_mm_unpacklo_epi64(v81, v56), _mm_unpacklo_epi64(v79, v80));
                    iter = v82 + 64;
                    a2 = v57 - 8;
                    if (v57 == 8)
                        break;
                }
            }
            else if ((int)v57 >= 1)
            {
                v83 = arm64g_calculate_condition(195, v57, 1, 0);
                if (!(v83 & 1))
                {
                    v84 = 8;
                    do
                    {
                        v85 = v84;
                        v86 = a3 + 2;
                        v87 = (__m128i)_INSERT(v17, 0, __int_as_float(v52 ^ v53 ^ *a3 ^ v51));
                        v88 = _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-90, 63, -113, 117, -6, -108, -33, -128, -107, -24, 8, -55, -87, 28, -77, -28), _mm_and_si128(_mm_sub_epi8(v87, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v87, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(98, -84, -49, -19, 67, 11, 84, 0x33, 122, -104, -17, -111, -12, 80, 66, -100), _mm_and_si128(_mm_sub_epi8(v87, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v87, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-103, 6, -122, 73, 38, 19, 0x44, -86, -61, 4, -66, 42, 118, -102, 103, 43), _mm_and_si128(_mm_sub_epi8(v87, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v87, _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(5, 44, -5, 40, -62, 20, -74, 22, -73, 61, -31, -52, -2, -23, -112, -42), _mm_and_si128(v87, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v87)))));
                        v90 = _mm_cvtsi128_si32(v88) + (_mm_cvtsi128_si32(PermV(_mm_set_epi8(-98, -56, -60, -96, -25, 2, 54, 76, 82, 39, -45, -97, 87, 70, 0, -44), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v87, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v87, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(-121, 120, 33, 1, 59, 124, 0x22, 37, -94, -47, 88, 99, 94, 14, 36, 30), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v87, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v87, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(53, -99, 86, 112, 75, 15, -21, -8, -117, -38, 100, 113, -78, -127, 107, 104), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v87, _mm_set1_epi8(64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v87, _mm_set1_epi8(64)), _mm_set1_epi8(16)))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(-88, 79, -123, -26, 25, 60, 89, -125, -70, 23, 115, -13, -4, -89, 7, 71), _mm_and_si128(_mm_sub_epi8(v87, _mm_set1_epi8(64)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v87, _mm_set1_epi8(64))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(81, 91, 108, 109, 114, 106, -1, 3, 47, -114, -3, -34, 69, 55, -37, -43), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v87, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v87, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(111, 78, 83, 13, -85, 35, 41, -64, 96, -54, 0x66, -126, 46, -30, -10, 29), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v87, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v87, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-29, -79, -116, -11, 48, 50, -109, -83, 0x55, 26, 52, -101, -92, 93, -82, -32), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v87, _mm_set1_epi8(-128)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v87, _mm_set1_epi8(-128)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(-95, 21, 97, -7, -50, -14, -9, -93, -75, 56, -57, 64, -46, -118, -65, -22), _mm_and_si128(_mm_sub_epi8(v87, _mm_set1_epi8(-128)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v87, _mm_set1_epi8(-128)))))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(72, 57, -53, -41, 62, 95, -18, 121, 32, 77, -36, 58, -20, 125, -16, 24), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v87, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v87, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-124, -58, 110, -59, 9, -15, -71, 101, 126, 0x77, -106, 12, 74, -105, 105, -119), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v87, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v87, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-80, -76, -27, -72, 18, -48, 116, 45, -67, 123, -51, -91, -120, 49, -63, 10), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v87, _mm_set1_epi8(-64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v87, _mm_set1_epi8(-64)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(-40, 90, 16, 31, 65, 92, -39, 0x11, 127, -68, -35, -69, -110, -81, 27, -115), _mm_and_si128(_mm_sub_epi8(v87, _mm_set1_epi8(-64)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v87, _mm_set1_epi8(-64))))))));
                        v50 ^= v90 ^ (v90 * 4 | v90 >> 30) ^ (v90 * 0x400 | v90 >> 22) ^ (v90 * 0x40000 | v90 >> 14) ^ (v90 * &g_1000000 | v90 >> 8);
                        v91 = (__m128i)_INSERT(v88, 0, __int_as_float(v52 ^ v53 ^ v50 ^ a3[1]));
                        v92 = _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-90, 63, -113, 117, -6, -108, -33, -128, -107, -24, 8, -55, -87, 28, -77, -28), _mm_and_si128(_mm_sub_epi8(v91, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v91, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(98, -84, -49, -19, 67, 11, 84, 0x33, 122, -104, -17, -111, -12, 80, 66, -100), _mm_and_si128(_mm_sub_epi8(v91, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v91, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-103, 6, -122, 73, 38, 19, 0x44, -86, -61, 4, -66, 42, 118, -102, 103, 43), _mm_and_si128(_mm_sub_epi8(v91, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v91, _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(5, 44, -5, 40, -62, 20, -74, 22, -73, 61, -31, -52, -2, -23, -112, -42), _mm_and_si128(v91, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v91)))));
                        v94 = _mm_cvtsi128_si32(v92) + (_mm_cvtsi128_si32(PermV(_mm_set_epi8(-98, -56, -60, -96, -25, 2, 54, 76, 82, 39, -45, -97, 87, 70, 0, -44), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v91, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v91, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(-121, 120, 33, 1, 59, 124, 0x22, 37, -94, -47, 88, 99, 94, 14, 36, 30), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v91, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v91, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(53, -99, 86, 112, 75, 15, -21, -8, -117, -38, 100, 113, -78, -127, 107, 104), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v91, _mm_set1_epi8(64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v91, _mm_set1_epi8(64)), _mm_set1_epi8(16)))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(-88, 79, -123, -26, 25, 60, 89, -125, -70, 23, 115, -13, -4, -89, 7, 71), _mm_and_si128(_mm_sub_epi8(v91, _mm_set1_epi8(64)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v91, _mm_set1_epi8(64))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(81, 91, 108, 109, 114, 106, -1, 3, 47, -114, -3, -34, 69, 55, -37, -43), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v91, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v91, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(111, 78, 83, 13, -85, 35, 41, -64, 96, -54, 0x66, -126, 46, -30, -10, 29), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v91, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v91, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-29, -79, -116, -11, 48, 50, -109, -83, 0x55, 26, 52, -101, -92, 93, -82, -32), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v91, _mm_set1_epi8(-128)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v91, _mm_set1_epi8(-128)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(-95, 21, 97, -7, -50, -14, -9, -93, -75, 56, -57, 64, -46, -118, -65, -22), _mm_and_si128(_mm_sub_epi8(v91, _mm_set1_epi8(-128)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v91, _mm_set1_epi8(-128)))))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(72, 57, -53, -41, 62, 95, -18, 121, 32, 77, -36, 58, -20, 125, -16, 24), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v91, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v91, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-124, -58, 110, -59, 9, -15, -71, 101, 126, 0x77, -106, 12, 74, -105, 105, -119), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v91, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v91, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-80, -76, -27, -72, 18, -48, 116, 45, -67, 123, -51, -91, -120, 49, -63, 10), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v91, _mm_set1_epi8(-64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v91, _mm_set1_epi8(-64)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(-40, 90, 16, 31, 65, 92, -39, 0x11, 127, -68, -35, -69, -110, -81, 27, -115), _mm_and_si128(_mm_sub_epi8(v91, _mm_set1_epi8(-64)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v91, _mm_set1_epi8(-64))))))));
                        a3 = v86 + 2;
                        v51 ^= v94 ^ (v94 * 4 | v94 >> 30) ^ (v94 * 0x400 | v94 >> 22) ^ (v94 * 0x40000 | v94 >> 14) ^ (v94 * &g_1000000 | v94 >> 8);
                        v95 = (__m128i)_INSERT(v92, 0, __int_as_float(v50 ^ v51 ^ *v86 ^ v53));
                        v96 = _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-90, 63, -113, 117, -6, -108, -33, -128, -107, -24, 8, -55, -87, 28, -77, -28), _mm_and_si128(_mm_sub_epi8(v95, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v95, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(98, -84, -49, -19, 67, 11, 84, 0x33, 122, -104, -17, -111, -12, 80, 66, -100), _mm_and_si128(_mm_sub_epi8(v95, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v95, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-103, 6, -122, 73, 38, 19, 0x44, -86, -61, 4, -66, 42, 118, -102, 103, 43), _mm_and_si128(_mm_sub_epi8(v95, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v95, _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(5, 44, -5, 40, -62, 20, -74, 22, -73, 61, -31, -52, -2, -23, -112, -42), _mm_and_si128(v95, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v95)))));
                        v98 = _mm_cvtsi128_si32(v96) + (_mm_cvtsi128_si32(PermV(_mm_set_epi8(-98, -56, -60, -96, -25, 2, 54, 76, 82, 39, -45, -97, 87, 70, 0, -44), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v95, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v95, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(-121, 120, 33, 1, 59, 124, 0x22, 37, -94, -47, 88, 99, 94, 14, 36, 30), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v95, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v95, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(53, -99, 86, 112, 75, 15, -21, -8, -117, -38, 100, 113, -78, -127, 107, 104), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v95, _mm_set1_epi8(64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v95, _mm_set1_epi8(64)), _mm_set1_epi8(16)))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(-88, 79, -123, -26, 25, 60, 89, -125, -70, 23, 115, -13, -4, -89, 7, 71), _mm_and_si128(_mm_sub_epi8(v95, _mm_set1_epi8(64)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v95, _mm_set1_epi8(64))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(81, 91, 108, 109, 114, 106, -1, 3, 47, -114, -3, -34, 69, 55, -37, -43), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v95, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v95, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(111, 78, 83, 13, -85, 35, 41, -64, 96, -54, 0x66, -126, 46, -30, -10, 29), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v95, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v95, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-29, -79, -116, -11, 48, 50, -109, -83, 0x55, 26, 52, -101, -92, 93, -82, -32), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v95, _mm_set1_epi8(-128)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v95, _mm_set1_epi8(-128)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(-95, 21, 97, -7, -50, -14, -9, -93, -75, 56, -57, 64, -46, -118, -65, -22), _mm_and_si128(_mm_sub_epi8(v95, _mm_set1_epi8(-128)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v95, _mm_set1_epi8(-128)))))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(72, 57, -53, -41, 62, 95, -18, 121, 32, 77, -36, 58, -20, 125, -16, 24), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v95, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v95, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-124, -58, 110, -59, 9, -15, -71, 101, 126, 0x77, -106, 12, 74, -105, 105, -119), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v95, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v95, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-80, -76, -27, -72, 18, -48, 116, 45, -67, 123, -51, -91, -120, 49, -63, 10), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v95, _mm_set1_epi8(-64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v95, _mm_set1_epi8(-64)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(-40, 90, 16, 31, 65, 92, -39, 0x11, 127, -68, -35, -69, -110, -81, 27, -115), _mm_and_si128(_mm_sub_epi8(v95, _mm_set1_epi8(-64)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v95, _mm_set1_epi8(-64))))))));
                        v52 ^= v98 ^ (v98 * 4 | v98 >> 30) ^ (v98 * 0x400 | v98 >> 22) ^ (v98 * 0x40000 | v98 >> 14) ^ (v98 * &g_1000000 | v98 >> 8);
                        v99 = (__m128i)_INSERT(v96, 0, __int_as_float(v50 ^ v51 ^ v52 ^ v86[1]));
                        v17 = _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-90, 63, -113, 117, -6, -108, -33, -128, -107, -24, 8, -55, -87, 28, -77, -28), _mm_and_si128(_mm_sub_epi8(v99, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v99, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(98, -84, -49, -19, 67, 11, 84, 0x33, 122, -104, -17, -111, -12, 80, 66, -100), _mm_and_si128(_mm_sub_epi8(v99, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v99, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-103, 6, -122, 73, 38, 19, 0x44, -86, -61, 4, -66, 42, 118, -102, 103, 43), _mm_and_si128(_mm_sub_epi8(v99, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v99, _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(5, 44, -5, 40, -62, 20, -74, 22, -73, 61, -31, -52, -2, -23, -112, -42), _mm_and_si128(v99, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v99)))));
                        v100 = _mm_cvtsi128_si32(PermV(_mm_set_epi8(-98, -56, -60, -96, -25, 2, 54, 76, 82, 39, -45, -97, 87, 70, 0, -44), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v99, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v99, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(-121, 120, 33, 1, 59, 124, 0x22, 37, -94, -47, 88, 99, 94, 14, 36, 30), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v99, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v99, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(53, -99, 86, 112, 75, 15, -21, -8, -117, -38, 100, 113, -78, -127, 107, 104), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v99, _mm_set1_epi8(64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v99, _mm_set1_epi8(64)), _mm_set1_epi8(16)))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(-88, 79, -123, -26, 25, 60, 89, -125, -70, 23, 115, -13, -4, -89, 7, 71), _mm_and_si128(_mm_sub_epi8(v99, _mm_set1_epi8(64)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v99, _mm_set1_epi8(64))));
                        v101 = _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(72, 57, -53, -41, 62, 95, -18, 121, 32, 77, -36, 58, -20, 125, -16, 24), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v99, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v99, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-124, -58, 110, -59, 9, -15, -71, 101, 126, 0x77, -106, 12, 74, -105, 105, -119), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v99, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v99, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-80, -76, -27, -72, 18, -48, 116, 45, -67, 123, -51, -91, -120, 49, -63, 10), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v99, _mm_set1_epi8(-64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v99, _mm_set1_epi8(-64)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(-40, 90, 16, 31, 65, 92, -39, 0x11, 127, -68, -35, -69, -110, -81, 27, -115), _mm_and_si128(_mm_sub_epi8(v99, _mm_set1_epi8(-64)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v99, _mm_set1_epi8(-64)))))));
                    } while ((v102 = _mm_cvtsi128_si32(v17) + __float_as_int(v100) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(81, 91, 108, 109, 114, 106, -1, 3, 47, -114, -3, -34, 69, 55, -37, -43), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v99, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v99, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(111, 78, 83, 13, -85, 35, 41, -64, 96, -54, 0x66, -126, 46, -30, -10, 29), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v99, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v99, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-29, -79, -116, -11, 48, 50, -109, -83, 0x55, 26, 52, -101, -92, 93, -82, -32), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v99, _mm_set1_epi8(-128)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v99, _mm_set1_epi8(-128)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(-95, 21, 97, -7, -50, -14, -9, -93, -75, 56, -57, 64, -46, -118, -65, -22), _mm_and_si128(_mm_sub_epi8(v99, _mm_set1_epi8(-128)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v99, _mm_set1_epi8(-128)))))))) + _mm_cvtsi128_si32(v101), v53 ^= v102 ^ __ROL__(v102, 2) ^ __ROL__(v102, 10) ^ __ROL__(v102, 18) ^ __ROL__(v102, 24), v84 = v85 - 1, v85 != 1));
                    v104 = _INSERT(_INSERT(v101, 0, __int_as_float(v53)), 4, v52);
                    v105 = _INSERT(v104, 8, v51);
                    v106 = _INSERT(v105, 12, v50);
                    v107 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v106);
                    *(uint128_t *)iter = v107 ^ *a0;
                    break;
                }
                else if (v57 == 2)
                {
                    v108 = sub_acdd30();
                    v109 = v108 + 4;
                    v111 = _INSERT(v110, 0, v108[3]);
                    v113 = _INSERT(v112, 0, v108[2]);
                    v115 = _INSERT(v114, 0, v108[1]);
                    v117 = _INSERT(v116, 0, *v108);
                    v118 = (__m128i)_INSERT(v117, 4, *v109);
                    v17 = _mm_xor_si128(v118, v17);
                    v119 = _INSERT(v115, 4, v109[1]) ^ _mm_cvtsi128_si64(v54);
                    v120 = _INSERT(v113, 4, v109[2]) ^ _mm_cvtsi128_si64(v55);
                    v121 = _INSERT(v111, 4, v109[3]) ^ _mm_cvtsi128_si64(v11);
                    v122 = iter + 16;
                    *(unsigned int *)&iter[12] = v121;
                    *(unsigned int *)&iter[8] = v120;
                    *(unsigned int *)&iter[4] = v119;
                    *(int *)iter = _mm_cvtsi128_si32(v17);
                    *(unsigned int *)&v122[12] = *(unsigned int *)((void*)&v121 + 4);
                    *(unsigned int *)&v122[8] = *(unsigned int *)((void*)&v120 + 4);
                    *(unsigned int *)&v122[4] = *(unsigned int *)((void*)&v119 + 4);
                    *(int *)v122 = _mm_extract_epi32(v17, 1);
                    break;
                }
                else
                {
                    v123 = sub_acdd30();
                    v124 = v123 + 4;
                    v126 = _INSERT(v110, 0, v123[3]);
                    v128 = _INSERT(v112, 0, v123[2]);
                    v130 = _INSERT(v114, 0, v123[1]);
                    v132 = _INSERT(v116, 0, *v123);
                    v133 = v124 + 4;
                    v134 = _INSERT(v126, 4, v124[3]);
                    v135 = _INSERT(v128, 4, v124[2]);
                    v136 = _INSERT(v130, 4, v124[1]);
                    v137 = _INSERT(v132, 4, *v124);
                    v138 = (__m128i)_INSERT(v137, 8, *v133);
                    v17 = _mm_xor_si128(v138, v17);
                    v139 = (uint96_t)(_INSERT(v136, 8, v133[1]) & 0xffffffffffffffffffffffff & 0xffffffffffffffffffffffff ^ v54 & 0xffffffffffffffffffffffff);
                    v140 = (uint96_t)(_INSERT(v135, 8, v133[2]) & 0xffffffffffffffffffffffff & 0xffffffffffffffffffffffff ^ v55 & 0xffffffffffffffffffffffff);
                    v141 = (uint96_t)(_INSERT(v134, 8, v133[3]) & 0xffffffffffffffffffffffff & 0xffffffffffffffffffffffff ^ v11 & 0xffffffffffffffffffffffff);
                    v142 = iter + 16;
                    *(unsigned int *)&iter[12] = v141;
                    *(unsigned int *)&iter[8] = v140;
                    *(unsigned int *)&iter[4] = v139;
                    *(int *)iter = _mm_cvtsi128_si32(v17);
                    v143 = v142 + 16;
                    *(unsigned int *)&v142[12] = *(unsigned int *)((void*)&v141 + 4);
                    *(unsigned int *)&v142[8] = *(unsigned int *)((void*)&v140 + 4);
                    *(unsigned int *)&v142[4] = *(unsigned int *)((void*)&v139 + 4);
                    *(int *)v142 = _mm_extract_epi32(v17, 1);
                    *(unsigned int *)&v143[12] = *(unsigned int *)((void*)&v141 + 8);
                    *(unsigned int *)&v143[8] = *(unsigned int *)((void*)&v140 + 8);
                    *(unsigned int *)&v143[4] = *(unsigned int *)((void*)&v139 + 8);
                    *(int *)v143 = _mm_extract_epi32(v17, 2);
                    break;
                }
            }
        }
        return _mm_cvtsi128_si64(v17);
    }
}
