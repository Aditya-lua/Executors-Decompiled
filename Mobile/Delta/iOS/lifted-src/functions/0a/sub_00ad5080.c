/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad5080..0xad5094 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_1000000;

long long sub_ad5080(uint128_t *a0, unsigned long a1, unsigned long a2, unsigned int *a3)
{
    unsigned int v0;  // w28
    uint128_t v1;  // q18
    __m128i v10;  // q28
    __m128i v11;  // q31
    __m128i v12;  // q0
    __m128i v13;  // q27
    __m128i v14;  // q2
    __m128i v15;  // 4205
    __m128i v16;  // q29
    __m128i v17;  // q30
    unsigned int v18;  // w7
    unsigned int v19;  // w12
    uint128_t v2;  // q4
    __m128i v20;  // q3
    __m128i v21;  // q0
    __m128i v22;  // q0
    __m128i v23;  // q2
    __m128i v24;  // 4368
    unsigned int v25;  // w7
    unsigned int v26;  // w13
    __m128i v27;  // q3
    __m128i v28;  // q0
    __m128i v29;  // q0
    unsigned int v3;  // w13
    __m128i v30;  // q2
    __m128i v31;  // 4535
    unsigned int v32;  // w7
    __m128i v34;  // q0
    __m128i v35;  // q0
    __m128i v36;  // q2
    unsigned int v4;  // w14
    unsigned int v5;  // w15
    unsigned int *v6;  // x10
    __m128i v7;  // q3
    __m128i v8;  // q26
    __m128i v9;  // q0

    if (v0 == 1)
        goto LABEL_0xad5094;
    v2 = __dirty_unsupported_Iop_Reverse8sIn32_x4(v1 ^ *a0);
    v3 = *(unsigned int *)((void*)&v2 + 4);
    v4 = *(unsigned int *)((void*)&v2 + 8);
    v5 = *(unsigned int *)((void*)&v2 + 12);
    v6 = a3 + 2;
    *(float *)&v7 = __int_as_float(v4 ^ v5 ^ *a3 ^ v3);
    v9 = _mm_and_si128(PermV(v7, _mm_and_si128(v8, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v8));
    v12 = _mm_and_si128(PermV(v10, _mm_and_si128(_mm_and_si128(v9, v11), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v9, v11)));
    v14 = _mm_and_si128(PermV(v13, _mm_and_si128(ShrNV(v9, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v9, 4)));
    v15 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v14, v12), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v14) ^ _mm_cvtsi128_si64(v12) ^ 0);
    v18 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(v16, _mm_and_si128(ShrNV(v15, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v15, 4))), _mm_and_si128(PermV(v17, _mm_and_si128(_mm_and_si128(v15, v11), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v15, v11)))));
    v19 = *(unsigned int *)&*(unsigned int *)(void*)&v2 ^ v18 ^ (v18 * 4 | v18 >> 30) ^ (v18 * 0x400 | v18 >> 22) ^ (v18 * 0x40000 | v18 >> 14) ^ (v18 * &g_1000000 | v18 >> 8);
    v20 = (__m128i)_INSERT(v7, 0, __int_as_float(v4 ^ v5 ^ v19 ^ a3[1]));
    v21 = _mm_and_si128(PermV(v20, _mm_and_si128(v8, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v8));
    v22 = _mm_and_si128(PermV(v10, _mm_and_si128(_mm_and_si128(v21, v11), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v21, v11)));
    v23 = _mm_and_si128(PermV(v13, _mm_and_si128(ShrNV(v21, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v21, 4)));
    v24 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v23, v22), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v23) ^ _mm_cvtsi128_si64(v22) ^ 0);
    v25 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(v16, _mm_and_si128(ShrNV(v24, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v24, 4))), _mm_and_si128(PermV(v17, _mm_and_si128(_mm_and_si128(v24, v11), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v24, v11)))));
    v26 = v3 ^ v25 ^ (v25 * 4 | v25 >> 30) ^ (v25 * 0x400 | v25 >> 22) ^ (v25 * 0x40000 | v25 >> 14) ^ (v25 * &g_1000000 | v25 >> 8);
    v27 = (__m128i)_INSERT(v20, 0, __int_as_float(v19 ^ v26 ^ *v6 ^ v5));
    v28 = _mm_and_si128(PermV(v27, _mm_and_si128(v8, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v8));
    v29 = _mm_and_si128(PermV(v10, _mm_and_si128(_mm_and_si128(v28, v11), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v28, v11)));
    v30 = _mm_and_si128(PermV(v13, _mm_and_si128(ShrNV(v28, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v28, 4)));
    v31 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v30, v29), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v30) ^ _mm_cvtsi128_si64(v29) ^ 0);
    v32 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(v16, _mm_and_si128(ShrNV(v31, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v31, 4))), _mm_and_si128(PermV(v17, _mm_and_si128(_mm_and_si128(v31, v11), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v31, v11)))));
    v34 = _mm_and_si128(PermV(_INSERT(v27, 0, __int_as_float(v19 ^ v26 ^ v4 ^ v32 ^ (v32 * 4 | v32 >> 30) ^ (v32 * 0x400 | v32 >> 22) ^ (v32 * 0x40000 | v32 >> 14) ^ (v32 * &g_1000000 | v32 >> 8) ^ v6[1])), _mm_and_si128(v8, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v8));
    v35 = _mm_and_si128(PermV(v10, _mm_and_si128(_mm_and_si128(v34, v11), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v34, v11)));
    v36 = _mm_and_si128(PermV(v13, _mm_and_si128(ShrNV(v34, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v34, 4)));
    __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v36, v35), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v36) ^ _mm_cvtsi128_si64(v35) ^ 0);
}
