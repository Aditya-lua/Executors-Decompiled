/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad1c00..0xad1e20 (544 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_ad1c00(unsigned long a0, unsigned long a1, unsigned long a2, unsigned int *a3, double a4, double a5, double a6, double a7, double a8, double a9, double a10, double a11)
{
    unsigned int i;  // w11
    unsigned int v1;  // w11
    __m128i v10;  // q0
    __m128i v11;  // q27
    __m128i v12;  // q24
    __m128i v13;  // 4193
    __m128i v14;  // q29
    __m128i v15;  // q30
    __m128i v16;  // q12
    __m128i v17;  // q0
    __m128i v18;  // q0
    __m128i v19;  // q24
    unsigned int v2;  // w7
    __m128i v20;  // 4365
    __m128i v21;  // q13
    unsigned int v22;  // w7
    unsigned int v23;  // w8
    __m128i v24;  // q14
    __m128i v25;  // q0
    __m128i v26;  // q0
    __m128i v27;  // q24
    __m128i v28;  // 4549
    __m128i v29;  // q12
    unsigned int v3;  // w8
    __m128i v30;  // q0
    __m128i v31;  // q0
    __m128i v32;  // q24
    __m128i v33;  // 4150
    __m128i v34;  // q13
    unsigned int *v4;  // x10
    __m128i v5;  // q14
    __m128i v6;  // q26
    __m128i v7;  // q0
    __m128i v8;  // q28
    __m128i v9;  // q31

    i = 8;
    do
    {
        v1 = i;
        v2 = *a3;
        v3 = a3[1];
        v4 = a3 + 2;
        v5 = _mm_xor_si128(a11, a10);
        v7 = _mm_and_si128(PermV(_mm_xor_si128(_mm_xor_si128(CONCAT(v2 | v2 * 0x100000000, v2 | v2 * 0x100000000), a9), v5), _mm_and_si128(v6, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v6));
        v10 = _mm_and_si128(PermV(v8, _mm_and_si128(_mm_and_si128(v7, v9), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v7, v9)));
        v12 = _mm_and_si128(PermV(v11, _mm_and_si128(ShrNV(v7, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v7, 4)));
        v13 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v12, v10), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v12) ^ _mm_cvtsi128_si64(v10) ^ 0);
        v16 = _mm_xor_si128(_mm_and_si128(PermV(v14, _mm_and_si128(ShrNV(v13, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v13, 4))), _mm_and_si128(PermV(v15, _mm_and_si128(_mm_and_si128(v13, v9), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v13, v9))));
        a8 = _mm_xor_si128(_mm_xor_si128(_mm_xor_si128(_mm_or_si128(_mm_slli_epi32(v16, 10), _mm_and_si128(_mm_srli_epi32(v16, 22), _mm_srli_epi32(_mm_set1_epi32(-1), 22))), _mm_xor_si128(v16, _mm_or_si128(_mm_slli_epi32(v16, 2), _mm_and_si128(_mm_srli_epi32(v16, 30), _mm_srli_epi32(_mm_set1_epi32(-1), 30))))), _mm_xor_si128(_mm_or_si128(_mm_slli_epi32(v16, 24), _mm_and_si128(_mm_srli_epi32(v16, 8), _mm_srli_epi32(_mm_set1_epi32(-1), 8))), _mm_or_si128(_mm_slli_epi32(v16, 18), _mm_and_si128(_mm_srli_epi32(v16, 14), _mm_srli_epi32(_mm_set1_epi32(-1), 14))))), a8);
        v17 = _mm_and_si128(PermV(_mm_xor_si128(CONCAT(v3 | v3 * 0x100000000, v3 | v3 * 0x100000000), _mm_xor_si128(a8, v5)), _mm_and_si128(v6, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v6));
        v18 = _mm_and_si128(PermV(v8, _mm_and_si128(_mm_and_si128(v17, v9), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v17, v9)));
        v19 = _mm_and_si128(PermV(v11, _mm_and_si128(ShrNV(v17, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v17, 4)));
        v20 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v19, v18), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v19) ^ _mm_cvtsi128_si64(v18) ^ 0);
        v21 = _mm_xor_si128(_mm_and_si128(PermV(v14, _mm_and_si128(ShrNV(v20, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v20, 4))), _mm_and_si128(PermV(v15, _mm_and_si128(_mm_and_si128(v20, v9), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v20, v9))));
        v22 = *v4;
        v23 = v4[1];
        a3 = v4 + 2;
        a9 = _mm_xor_si128(_mm_xor_si128(_mm_xor_si128(_mm_or_si128(_mm_slli_epi32(v21, 10), _mm_and_si128(_mm_srli_epi32(v21, 22), _mm_srli_epi32(_mm_set1_epi32(-1), 22))), _mm_xor_si128(v21, _mm_or_si128(_mm_slli_epi32(v21, 2), _mm_and_si128(_mm_srli_epi32(v21, 30), _mm_srli_epi32(_mm_set1_epi32(-1), 30))))), _mm_xor_si128(_mm_or_si128(_mm_slli_epi32(v21, 24), _mm_and_si128(_mm_srli_epi32(v21, 8), _mm_srli_epi32(_mm_set1_epi32(-1), 8))), _mm_or_si128(_mm_slli_epi32(v21, 18), _mm_and_si128(_mm_srli_epi32(v21, 14), _mm_srli_epi32(_mm_set1_epi32(-1), 14))))), a9);
        v24 = _mm_xor_si128(a9, a8);
        v25 = _mm_and_si128(PermV(_mm_xor_si128(_mm_xor_si128(CONCAT(v22 | v22 * 0x100000000, v22 | v22 * 0x100000000), a11), v24), _mm_and_si128(v6, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v6));
        v26 = _mm_and_si128(PermV(v8, _mm_and_si128(_mm_and_si128(v25, v9), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v25, v9)));
        v27 = _mm_and_si128(PermV(v11, _mm_and_si128(ShrNV(v25, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v25, 4)));
        v28 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v27, v26), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v27) ^ _mm_cvtsi128_si64(v26) ^ 0);
        v29 = _mm_xor_si128(_mm_and_si128(PermV(v14, _mm_and_si128(ShrNV(v28, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v28, 4))), _mm_and_si128(PermV(v15, _mm_and_si128(_mm_and_si128(v28, v9), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v28, v9))));
        a10 = _mm_xor_si128(_mm_xor_si128(_mm_xor_si128(_mm_or_si128(_mm_slli_epi32(v29, 10), _mm_and_si128(_mm_srli_epi32(v29, 22), _mm_srli_epi32(_mm_set1_epi32(-1), 22))), _mm_xor_si128(v29, _mm_or_si128(_mm_slli_epi32(v29, 2), _mm_and_si128(_mm_srli_epi32(v29, 30), _mm_srli_epi32(_mm_set1_epi32(-1), 30))))), _mm_xor_si128(_mm_or_si128(_mm_slli_epi32(v29, 24), _mm_and_si128(_mm_srli_epi32(v29, 8), _mm_srli_epi32(_mm_set1_epi32(-1), 8))), _mm_or_si128(_mm_slli_epi32(v29, 18), _mm_and_si128(_mm_srli_epi32(v29, 14), _mm_srli_epi32(_mm_set1_epi32(-1), 14))))), a10);
        v30 = _mm_and_si128(PermV(_mm_xor_si128(CONCAT(v23 | v23 * 0x100000000, v23 | v23 * 0x100000000), _mm_xor_si128(a10, v24)), _mm_and_si128(v6, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v6));
        v31 = _mm_and_si128(PermV(v8, _mm_and_si128(_mm_and_si128(v30, v9), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v30, v9)));
        v32 = _mm_and_si128(PermV(v11, _mm_and_si128(ShrNV(v30, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v30, 4)));
        v33 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v32, v31), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v32) ^ _mm_cvtsi128_si64(v31) ^ 0);
        v34 = _mm_xor_si128(_mm_and_si128(PermV(v14, _mm_and_si128(ShrNV(v33, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v33, 4))), _mm_and_si128(PermV(v15, _mm_and_si128(_mm_and_si128(v33, v9), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v33, v9))));
        a11 = _mm_xor_si128(_mm_xor_si128(_mm_xor_si128(_mm_or_si128(_mm_slli_epi32(v34, 10), _mm_and_si128(_mm_srli_epi32(v34, 22), _mm_srli_epi32(_mm_set1_epi32(-1), 22))), _mm_xor_si128(v34, _mm_or_si128(_mm_slli_epi32(v34, 2), _mm_and_si128(_mm_srli_epi32(v34, 30), _mm_srli_epi32(_mm_set1_epi32(-1), 30))))), _mm_xor_si128(_mm_or_si128(_mm_slli_epi32(v34, 24), _mm_and_si128(_mm_srli_epi32(v34, 8), _mm_srli_epi32(_mm_set1_epi32(-1), 8))), _mm_or_si128(_mm_slli_epi32(v34, 18), _mm_and_si128(_mm_srli_epi32(v34, 14), _mm_srli_epi32(_mm_set1_epi32(-1), 14))))), a11);
        i = v1 - 1;
    } while (i);
    return (unsigned long long)__dirty_unsupported_Iop_Reverse8sIn32_x4(a11);
}
