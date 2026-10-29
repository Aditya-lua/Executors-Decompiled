/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad2260..0xad2440 (480 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char _NSHomeDirectory;

double sub_ad2260(uint128_t *a0, uint128_t *a1, unsigned int *a2)
{
    uint128_t v0;  // q4
    unsigned int v1;  // w11
    __m128i v9;  // q3
    __m128i v10;  // q0
    __m128i v11;  // q0
    __m128i v12;  // q2
    __m128i v13;  // 4189
    unsigned int v14;  // w7
    __m128i v15;  // q3
    __m128i v16;  // q0
    __m128i v17;  // q0
    __m128i v18;  // q2
    unsigned int v2;  // w12
    __m128i v19;  // 4352
    unsigned int v20;  // w7
    __m128i v21;  // q3
    __m128i v22;  // q0
    __m128i v23;  // q0
    __m128i v24;  // q2
    __m128i v25;  // 4519
    unsigned int v26;  // w7
    __m128i v27;  // q0
    __m128i v28;  // q0
    unsigned int v3;  // w13
    __m128i v29;  // q2
    uint128_t v30;  // 4099
    __m128i v31;  // q0
    unsigned int v32;  // w7
    uint128_t v34;  // q4
    uint128_t v35;  // q4
    uint128_t v36;  // q4
    uint128_t v37;  // q4
    unsigned int v4;  // w14
    unsigned int v5;  // w15
    __m128i v6;  // q3
    unsigned int v7;  // w11
    unsigned int *v8;  // x10

    v0 = __dirty_unsupported_Iop_Reverse8sIn32_x4(*a0);
    v1 = 8;
    v2 = *(unsigned int *)&*(unsigned int *)(void*)&v0;
    v3 = *(unsigned int *)((void*)&v0 + 4);
    v4 = *(unsigned int *)((void*)&v0 + 8);
    v5 = *(unsigned int *)((void*)&v0 + 12);
    do
    {
        v7 = v1;
        v8 = a2 + 2;
        v9 = (__m128i)_INSERT(v6, 0, __int_as_float(v4 ^ v5 ^ *a2 ^ v3));
        v10 = _mm_and_si128(PermV(v9, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
        v11 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v10, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v10, _mm_set1_epi32(0xf0f0f0f))));
        v12 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v10, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v10, 4)));
        v13 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v12, v11), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v12) ^ _mm_cvtsi128_si64(v11) ^ 0);
        v14 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v13, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v13, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v13, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v13, _mm_set1_epi32(0xf0f0f0f))))));
        v2 ^= v14 ^ (v14 * 4 | v14 >> 30) ^ (v14 * 0x400 | v14 >> 22) ^ (v14 * 0x40000 | v14 >> 14) ^ (v14 * &_NSHomeDirectory | v14 >> 8);
        v15 = (__m128i)_INSERT(v9, 0, __int_as_float(v4 ^ v5 ^ v2 ^ a2[1]));
        v16 = _mm_and_si128(PermV(v15, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
        v17 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v16, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v16, _mm_set1_epi32(0xf0f0f0f))));
        v18 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v16, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v16, 4)));
        v19 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v18, v17), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v18) ^ _mm_cvtsi128_si64(v17) ^ 0);
        v20 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v19, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v19, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v19, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v19, _mm_set1_epi32(0xf0f0f0f))))));
        a2 = v8 + 2;
        v3 ^= v20 ^ (v20 * 4 | v20 >> 30) ^ (v20 * 0x400 | v20 >> 22) ^ (v20 * 0x40000 | v20 >> 14) ^ (v20 * &_NSHomeDirectory | v20 >> 8);
        v21 = (__m128i)_INSERT(v15, 0, __int_as_float(v2 ^ v3 ^ *v8 ^ v5));
        v22 = _mm_and_si128(PermV(v21, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
        v23 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v22, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v22, _mm_set1_epi32(0xf0f0f0f))));
        v24 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v22, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v22, 4)));
        v25 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v24, v23), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v24) ^ _mm_cvtsi128_si64(v23) ^ 0);
        v26 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v25, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v25, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v25, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v25, _mm_set1_epi32(0xf0f0f0f))))));
        v4 ^= v26 ^ (v26 * 4 | v26 >> 30) ^ (v26 * 0x400 | v26 >> 22) ^ (v26 * 0x40000 | v26 >> 14) ^ (v26 * &_NSHomeDirectory | v26 >> 8);
        v6 = (__m128i)_INSERT(v21, 0, __int_as_float(v2 ^ v3 ^ v4 ^ v8[1]));
        v27 = _mm_and_si128(PermV(v6, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
        v28 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v27, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v27, _mm_set1_epi32(0xf0f0f0f))));
        v29 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v27, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v27, 4)));
    } while ((v30 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v29, v28), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v29) ^ _mm_cvtsi128_si64(v28) ^ 0), v31 = v30, v32 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v31, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v31, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v31, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v31, _mm_set1_epi32(0xf0f0f0f)))))), v5 ^= v32 ^ __ROL__(v32, 2) ^ __ROL__(v32, 10) ^ __ROL__(v32, 18) ^ __ROL__(v32, 24), v1 = v7 - 1, v7 != 1));
    v34 = _INSERT(_INSERT(v0, 0, __int_as_float(v5)), 4, v4);
    v35 = _INSERT(v34, 8, v3);
    v36 = _INSERT(v35, 12, v2);
    v37 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v36);
    *a1 = v37;
    return _mm_cvtsi128_si64(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v31, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v31, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v31, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v31, _mm_set1_epi32(0xf0f0f0f))))));
}
