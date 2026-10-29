/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xace760..0xacea80 (800 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char _NSHomeDirectory;

uint128_t * sub_ace760(uint128_t *a0, void* iter, unsigned long long a2, unsigned int *a3)
{
    unsigned int v2;  // w2
    unsigned int v3;  // w2
    __m128i v12;  // q3
    __m128i v13;  // q2
    __m128i v14;  // q1
    __m128i v15;  // q0
    void* v16;  // x1
    unsigned long long v17;  // 4102
    uint128_t v18;  // q4
    unsigned int v19;  // w11
    unsigned int v20;  // w12
    unsigned int v21;  // w13
    __m128i v4;  // 4132
    unsigned int v22;  // w14
    unsigned int v23;  // w15
    __m128i v24;  // q0
    unsigned int v25;  // w11
    unsigned int *v26;  // x10
    __m128i v27;  // q0
    __m128i v28;  // q0
    unsigned int v30;  // w7
    __m128i v31;  // q0
    __m128i v5;  // 4134
    __m128i v32;  // q0
    unsigned int v34;  // w7
    __m128i v35;  // q0
    __m128i v36;  // q0
    unsigned int v38;  // w7
    __m128i v39;  // q0
    unsigned int v40;  // s1
    unsigned int v41;  // w7
    __m128i v6;  // 4136
    uint128_t v43;  // q4
    uint128_t v44;  // q4
    uint128_t v45;  // q4
    uint128_t v46;  // q4
    uint128_t *v47;  // x0
    uint128_t *v48;  // x0
    void* v49;  // x1
    uint128_t *v50;  // x0
    void* v51;  // x1
    __m128i v7;  // 4138
    void* v52;  // x1
    __m128i v8;  // q4
    __m128i v9;  // q5
    __m128i v10;  // q6
    __m128i v11;  // q7
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v2 = a2 >> 4;
    v0 = &v1;
    while (1)
    {
        v3 = v2;
        if ((int)v3 < 8)
            break;
        v4 = a0[3];
        v5 = a0[2];
        v6 = a0[1];
        v7 = *a0;
        v8 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_unpacklo_epi64(_mm_unpacklo_epi32(v7, v6), _mm_unpacklo_epi32(v5, v4)));
        v9 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_unpackhi_epi64(_mm_unpacklo_epi32(v7, v6), _mm_unpacklo_epi32(v5, v4)));
        v10 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_unpacklo_epi64(_mm_unpackhi_epi32(v7, v6), _mm_unpackhi_epi32(v5, v4)));
        v11 = __dirty_unsupported_Iop_Reverse8sIn32_x4(_mm_unpackhi_epi64(_mm_unpackhi_epi32(v7, v6), _mm_unpackhi_epi32(v5, v4)));
        a0 = sub_acdf40(a0 + 8);
        *(__m128i *)&iter[48] = CatOddLanesV(_mm_unpackhi_epi64(v13, v12), _mm_unpackhi_epi64(v15, v14));
        *(__m128i *)&iter[32] = CatEvenLanesV(_mm_unpackhi_epi64(v13, v12), _mm_unpackhi_epi64(v15, v14));
        *(__m128i *)&iter[16] = CatOddLanesV(_mm_unpacklo_epi64(v13, v12), _mm_unpacklo_epi64(v15, v14));
        *(__m128i *)iter = CatEvenLanesV(_mm_unpacklo_epi64(v13, v12), _mm_unpacklo_epi64(v15, v14));
        v16 = iter + 64;
        *(__m128i *)&v16[48] = CatOddLanesV(_mm_unpackhi_epi64(v10, v11), _mm_unpackhi_epi64(v8, v9));
        *(__m128i *)&v16[32] = CatEvenLanesV(_mm_unpackhi_epi64(v10, v11), _mm_unpackhi_epi64(v8, v9));
        *(__m128i *)&v16[16] = CatOddLanesV(_mm_unpacklo_epi64(v10, v11), _mm_unpacklo_epi64(v8, v9));
        *(__m128i *)v16 = CatEvenLanesV(_mm_unpacklo_epi64(v10, v11), _mm_unpacklo_epi64(v8, v9));
        iter = v16 + 64;
        v2 = v3 - 8;
        if (8 >= (int)v3)
            return a0;
    }
    if ((int)v3 >= 4)
    {
        a0 = sub_acdd30(a0 + 4);
        *(__m128i *)&iter[48] = CatOddLanesV(_mm_unpackhi_epi64(v13, v12), _mm_unpackhi_epi64(v15, v14));
        *(__m128i *)&iter[32] = CatEvenLanesV(_mm_unpackhi_epi64(v13, v12), _mm_unpackhi_epi64(v15, v14));
        *(__m128i *)&iter[16] = CatOddLanesV(_mm_unpacklo_epi64(v13, v12), _mm_unpacklo_epi64(v15, v14));
        *(__m128i *)iter = CatEvenLanesV(_mm_unpacklo_epi64(v13, v12), _mm_unpacklo_epi64(v15, v14));
        iter += 64;
        v3 -= 4;
    }
    if ((int)v3 < 1)
        return a0;
    v17 = arm64g_calculate_condition(195, v3, 1, 0);
    if (!(v17 & 1))
    {
        v18 = __dirty_unsupported_Iop_Reverse8sIn32_x4(*a0);
        v19 = 8;
        v20 = *(unsigned int *)&*(unsigned int *)(void*)&v18;
        v21 = *(unsigned int *)((void*)&v18 + 4);
        v22 = *(unsigned int *)((void*)&v18 + 8);
        v23 = *(unsigned int *)((void*)&v18 + 12);
        do
        {
            v25 = v19;
            v26 = a3 + 2;
            v27 = (__m128i)_INSERT(v24, 0, __int_as_float(v22 ^ v23 ^ *a3 ^ v21));
            v28 = _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-90, 63, -113, 117, -6, -108, -33, -128, -107, -24, 8, -55, -87, 28, -77, -28), _mm_and_si128(_mm_sub_epi8(v27, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v27, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(98, -84, -49, -19, 67, 11, 84, 0x33, 122, -104, -17, -111, -12, 80, 66, -100), _mm_and_si128(_mm_sub_epi8(v27, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v27, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-103, 6, -122, 73, 38, 19, 0x44, -86, -61, 4, -66, 42, 118, -102, 103, 43), _mm_and_si128(_mm_sub_epi8(v27, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v27, _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(5, 44, -5, 40, -62, 20, -74, 22, -73, 61, -31, -52, -2, -23, -112, -42), _mm_and_si128(v27, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v27)))));
            v30 = _mm_cvtsi128_si32(v28) + (_mm_cvtsi128_si32(PermV(_mm_set_epi8(-98, -56, -60, -96, -25, 2, 54, 76, 82, 39, -45, -97, 87, 70, 0, -44), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v27, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v27, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(-121, 120, 33, 1, 59, 124, 0x22, 37, -94, -47, 88, 99, 94, 14, 36, 30), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v27, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v27, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(53, -99, 86, 112, 75, 15, -21, -8, -117, -38, 100, 113, -78, -127, 107, 104), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v27, _mm_set1_epi8(64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v27, _mm_set1_epi8(64)), _mm_set1_epi8(16)))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(-88, 79, -123, -26, 25, 60, 89, -125, -70, 23, 115, -13, -4, -89, 7, 71), _mm_and_si128(_mm_sub_epi8(v27, _mm_set1_epi8(64)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v27, _mm_set1_epi8(64))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(81, 91, 108, 109, 114, 106, -1, 3, 47, -114, -3, -34, 69, 55, -37, -43), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v27, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v27, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(111, 78, 83, 13, -85, 35, 41, -64, 96, -54, 0x66, -126, 46, -30, -10, 29), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v27, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v27, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-29, -79, -116, -11, 48, 50, -109, -83, 0x55, 26, 52, -101, -92, 93, -82, -32), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v27, _mm_set1_epi8(-128)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v27, _mm_set1_epi8(-128)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(-95, 21, 97, -7, -50, -14, -9, -93, -75, 56, -57, 64, -46, -118, -65, -22), _mm_and_si128(_mm_sub_epi8(v27, _mm_set1_epi8(-128)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v27, _mm_set1_epi8(-128)))))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(72, 57, -53, -41, 62, 95, -18, 121, 32, 77, -36, 58, -20, 125, -16, 24), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v27, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v27, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-124, -58, 110, -59, 9, -15, -71, 101, 126, 0x77, -106, 12, 74, -105, 105, -119), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v27, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v27, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-80, -76, -27, -72, 18, -48, 116, 45, -67, 123, -51, -91, -120, 49, -63, 10), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v27, _mm_set1_epi8(-64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v27, _mm_set1_epi8(-64)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(-40, 90, 16, 31, 65, 92, -39, 0x11, 127, -68, -35, -69, -110, -81, 27, -115), _mm_and_si128(_mm_sub_epi8(v27, _mm_set1_epi8(-64)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v27, _mm_set1_epi8(-64))))))));
            v20 ^= v30 ^ (v30 * 4 | v30 >> 30) ^ (v30 * 0x400 | v30 >> 22) ^ (v30 * 0x40000 | v30 >> 14) ^ (v30 * &_NSHomeDirectory | v30 >> 8);
            v31 = (__m128i)_INSERT(v28, 0, __int_as_float(v22 ^ v23 ^ v20 ^ a3[1]));
            v32 = _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-90, 63, -113, 117, -6, -108, -33, -128, -107, -24, 8, -55, -87, 28, -77, -28), _mm_and_si128(_mm_sub_epi8(v31, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v31, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(98, -84, -49, -19, 67, 11, 84, 0x33, 122, -104, -17, -111, -12, 80, 66, -100), _mm_and_si128(_mm_sub_epi8(v31, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v31, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-103, 6, -122, 73, 38, 19, 0x44, -86, -61, 4, -66, 42, 118, -102, 103, 43), _mm_and_si128(_mm_sub_epi8(v31, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v31, _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(5, 44, -5, 40, -62, 20, -74, 22, -73, 61, -31, -52, -2, -23, -112, -42), _mm_and_si128(v31, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v31)))));
            v34 = _mm_cvtsi128_si32(v32) + (_mm_cvtsi128_si32(PermV(_mm_set_epi8(-98, -56, -60, -96, -25, 2, 54, 76, 82, 39, -45, -97, 87, 70, 0, -44), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v31, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v31, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(-121, 120, 33, 1, 59, 124, 0x22, 37, -94, -47, 88, 99, 94, 14, 36, 30), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v31, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v31, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(53, -99, 86, 112, 75, 15, -21, -8, -117, -38, 100, 113, -78, -127, 107, 104), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v31, _mm_set1_epi8(64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v31, _mm_set1_epi8(64)), _mm_set1_epi8(16)))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(-88, 79, -123, -26, 25, 60, 89, -125, -70, 23, 115, -13, -4, -89, 7, 71), _mm_and_si128(_mm_sub_epi8(v31, _mm_set1_epi8(64)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v31, _mm_set1_epi8(64))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(81, 91, 108, 109, 114, 106, -1, 3, 47, -114, -3, -34, 69, 55, -37, -43), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v31, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v31, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(111, 78, 83, 13, -85, 35, 41, -64, 96, -54, 0x66, -126, 46, -30, -10, 29), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v31, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v31, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-29, -79, -116, -11, 48, 50, -109, -83, 0x55, 26, 52, -101, -92, 93, -82, -32), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v31, _mm_set1_epi8(-128)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v31, _mm_set1_epi8(-128)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(-95, 21, 97, -7, -50, -14, -9, -93, -75, 56, -57, 64, -46, -118, -65, -22), _mm_and_si128(_mm_sub_epi8(v31, _mm_set1_epi8(-128)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v31, _mm_set1_epi8(-128)))))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(72, 57, -53, -41, 62, 95, -18, 121, 32, 77, -36, 58, -20, 125, -16, 24), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v31, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v31, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-124, -58, 110, -59, 9, -15, -71, 101, 126, 0x77, -106, 12, 74, -105, 105, -119), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v31, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v31, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-80, -76, -27, -72, 18, -48, 116, 45, -67, 123, -51, -91, -120, 49, -63, 10), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v31, _mm_set1_epi8(-64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v31, _mm_set1_epi8(-64)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(-40, 90, 16, 31, 65, 92, -39, 0x11, 127, -68, -35, -69, -110, -81, 27, -115), _mm_and_si128(_mm_sub_epi8(v31, _mm_set1_epi8(-64)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v31, _mm_set1_epi8(-64))))))));
            a3 = v26 + 2;
            v21 ^= v34 ^ (v34 * 4 | v34 >> 30) ^ (v34 * 0x400 | v34 >> 22) ^ (v34 * 0x40000 | v34 >> 14) ^ (v34 * &_NSHomeDirectory | v34 >> 8);
            v35 = (__m128i)_INSERT(v32, 0, __int_as_float(v20 ^ v21 ^ *v26 ^ v23));
            v36 = _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-90, 63, -113, 117, -6, -108, -33, -128, -107, -24, 8, -55, -87, 28, -77, -28), _mm_and_si128(_mm_sub_epi8(v35, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v35, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(98, -84, -49, -19, 67, 11, 84, 0x33, 122, -104, -17, -111, -12, 80, 66, -100), _mm_and_si128(_mm_sub_epi8(v35, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v35, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-103, 6, -122, 73, 38, 19, 0x44, -86, -61, 4, -66, 42, 118, -102, 103, 43), _mm_and_si128(_mm_sub_epi8(v35, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v35, _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(5, 44, -5, 40, -62, 20, -74, 22, -73, 61, -31, -52, -2, -23, -112, -42), _mm_and_si128(v35, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v35)))));
            v38 = _mm_cvtsi128_si32(v36) + (_mm_cvtsi128_si32(PermV(_mm_set_epi8(-98, -56, -60, -96, -25, 2, 54, 76, 82, 39, -45, -97, 87, 70, 0, -44), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v35, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v35, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(-121, 120, 33, 1, 59, 124, 0x22, 37, -94, -47, 88, 99, 94, 14, 36, 30), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v35, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v35, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(53, -99, 86, 112, 75, 15, -21, -8, -117, -38, 100, 113, -78, -127, 107, 104), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v35, _mm_set1_epi8(64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v35, _mm_set1_epi8(64)), _mm_set1_epi8(16)))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(-88, 79, -123, -26, 25, 60, 89, -125, -70, 23, 115, -13, -4, -89, 7, 71), _mm_and_si128(_mm_sub_epi8(v35, _mm_set1_epi8(64)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v35, _mm_set1_epi8(64))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(81, 91, 108, 109, 114, 106, -1, 3, 47, -114, -3, -34, 69, 55, -37, -43), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v35, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v35, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(111, 78, 83, 13, -85, 35, 41, -64, 96, -54, 0x66, -126, 46, -30, -10, 29), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v35, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v35, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-29, -79, -116, -11, 48, 50, -109, -83, 0x55, 26, 52, -101, -92, 93, -82, -32), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v35, _mm_set1_epi8(-128)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v35, _mm_set1_epi8(-128)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(-95, 21, 97, -7, -50, -14, -9, -93, -75, 56, -57, 64, -46, -118, -65, -22), _mm_and_si128(_mm_sub_epi8(v35, _mm_set1_epi8(-128)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v35, _mm_set1_epi8(-128)))))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(72, 57, -53, -41, 62, 95, -18, 121, 32, 77, -36, 58, -20, 125, -16, 24), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v35, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v35, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-124, -58, 110, -59, 9, -15, -71, 101, 126, 0x77, -106, 12, 74, -105, 105, -119), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v35, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v35, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-80, -76, -27, -72, 18, -48, 116, 45, -67, 123, -51, -91, -120, 49, -63, 10), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v35, _mm_set1_epi8(-64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v35, _mm_set1_epi8(-64)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(-40, 90, 16, 31, 65, 92, -39, 0x11, 127, -68, -35, -69, -110, -81, 27, -115), _mm_and_si128(_mm_sub_epi8(v35, _mm_set1_epi8(-64)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v35, _mm_set1_epi8(-64))))))));
            v22 ^= v38 ^ (v38 * 4 | v38 >> 30) ^ (v38 * 0x400 | v38 >> 22) ^ (v38 * 0x40000 | v38 >> 14) ^ (v38 * &_NSHomeDirectory | v38 >> 8);
            v39 = (__m128i)_INSERT(v36, 0, __int_as_float(v20 ^ v21 ^ v22 ^ v26[1]));
            v24 = _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-90, 63, -113, 117, -6, -108, -33, -128, -107, -24, 8, -55, -87, 28, -77, -28), _mm_and_si128(_mm_sub_epi8(v39, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v39, _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(98, -84, -49, -19, 67, 11, 84, 0x33, 122, -104, -17, -111, -12, 80, 66, -100), _mm_and_si128(_mm_sub_epi8(v39, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v39, _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-103, 6, -122, 73, 38, 19, 0x44, -86, -61, 4, -66, 42, 118, -102, 103, 43), _mm_and_si128(_mm_sub_epi8(v39, _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v39, _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(5, 44, -5, 40, -62, 20, -74, 22, -73, 61, -31, -52, -2, -23, -112, -42), _mm_and_si128(v39, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v39)))));
            v40 = _mm_cvtsi128_si32(PermV(_mm_set_epi8(-98, -56, -60, -96, -25, 2, 54, 76, 82, 39, -45, -97, 87, 70, 0, -44), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v39, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v39, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(-121, 120, 33, 1, 59, 124, 0x22, 37, -94, -47, 88, 99, 94, 14, 36, 30), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v39, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v39, _mm_set1_epi8(64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(53, -99, 86, 112, 75, 15, -21, -8, -117, -38, 100, 113, -78, -127, 107, 104), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v39, _mm_set1_epi8(64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v39, _mm_set1_epi8(64)), _mm_set1_epi8(16)))) | _mm_cvtsi128_si32(PermV(_mm_set_epi8(-88, 79, -123, -26, 25, 60, 89, -125, -70, 23, 115, -13, -4, -89, 7, 71), _mm_and_si128(_mm_sub_epi8(v39, _mm_set1_epi8(64)), _mm_set1_epi32(0xf0f0f0f)))) & _mm_cvtsi128_si32(CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v39, _mm_set1_epi8(64))));
        } while ((v41 = _mm_cvtsi128_si32(v24) + __float_as_int(v40) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(81, 91, 108, 109, 114, 106, -1, 3, 47, -114, -3, -34, 69, 55, -37, -43), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v39, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v39, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(111, 78, 83, 13, -85, 35, 41, -64, 96, -54, 0x66, -126, 46, -30, -10, 29), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v39, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v39, _mm_set1_epi8(-128)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-29, -79, -116, -11, 48, 50, -109, -83, 0x55, 26, 52, -101, -92, 93, -82, -32), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v39, _mm_set1_epi8(-128)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v39, _mm_set1_epi8(-128)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(-95, 21, 97, -7, -50, -14, -9, -93, -75, 56, -57, 64, -46, -118, -65, -22), _mm_and_si128(_mm_sub_epi8(v39, _mm_set1_epi8(-128)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v39, _mm_set1_epi8(-128)))))))) + _mm_cvtsi128_si32(_mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(72, 57, -53, -41, 62, 95, -18, 121, 32, 77, -36, 58, -20, 125, -16, 24), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v39, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v39, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-124, -58, 110, -59, 9, -15, -71, 101, 126, 0x77, -106, 12, 74, -105, 105, -119), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v39, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v39, _mm_set1_epi8(-64)), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_set_epi8(-80, -76, -27, -72, 18, -48, 116, 45, -67, 123, -51, -91, -120, 49, -63, 10), _mm_and_si128(_mm_sub_epi8(_mm_sub_epi8(v39, _mm_set1_epi8(-64)), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_sub_epi8(v39, _mm_set1_epi8(-64)), _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_set_epi8(-40, 90, 16, 31, 65, 92, -39, 0x11, 127, -68, -35, -69, -110, -81, 27, -115), _mm_and_si128(_mm_sub_epi8(v39, _mm_set1_epi8(-64)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(v39, _mm_set1_epi8(-64)))))))), v23 ^= v41 ^ __ROL__(v41, 2) ^ __ROL__(v41, 10) ^ __ROL__(v41, 18) ^ __ROL__(v41, 24), v19 = v25 - 1, v25 != 1));
        v43 = _INSERT(_INSERT(v18, 0, __int_as_float(v23)), 4, v22);
        v44 = _INSERT(v43, 8, v21);
        v45 = _INSERT(v44, 12, v20);
        v46 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v45);
        *(uint128_t *)iter = v46;
        return a0;
    }
    else
    {
        v47 = a0 + 2;
        if (2 < (int)v3)
        {
            v50 = sub_acdd30(v47 + 1);
            v51 = iter + 16;
            *(int *)&iter[12] = _mm_cvtsi128_si32(v12);
            *(int *)&iter[8] = _mm_cvtsi128_si32(v13);
            *(int *)&iter[4] = _mm_cvtsi128_si32(v14);
            *(int *)iter = _mm_cvtsi128_si32(v24);
            v52 = v51 + 16;
            *(int *)&v51[12] = _mm_extract_epi32(v12, 1);
            *(int *)&v51[8] = _mm_extract_epi32(v13, 1);
            *(int *)&v51[4] = _mm_extract_epi32(v14, 1);
            *(int *)v51 = _mm_extract_epi32(v24, 1);
            *(int *)&v52[12] = _mm_extract_epi32(v12, 2);
            *(int *)&v52[8] = _mm_extract_epi32(v13, 2);
            *(int *)&v52[4] = _mm_extract_epi32(v14, 2);
            *(int *)v52 = _mm_extract_epi32(v24, 2);
            return v50;
        }
        v48 = sub_acdd30(v47);
        v49 = iter + 16;
        *(int *)&iter[12] = _mm_cvtsi128_si32(v12);
        *(int *)&iter[8] = _mm_cvtsi128_si32(v13);
        *(int *)&iter[4] = _mm_cvtsi128_si32(v14);
        *(int *)iter = _mm_cvtsi128_si32(v24);
        *(int *)&v49[12] = _mm_extract_epi32(v12, 1);
        *(int *)&v49[8] = _mm_extract_epi32(v13, 1);
        *(int *)&v49[4] = _mm_extract_epi32(v14, 1);
        *(int *)v49 = _mm_extract_epi32(v24, 1);
        return v48;
    }
}
