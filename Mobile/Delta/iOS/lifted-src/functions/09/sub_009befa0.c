/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9befa0..0x9befb8 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_9befa0(double a0, double a1, double a2, double a3, double a4, double a5, double a6, double a7)
{
    uint128_t v0;  // q8
    __m128i v10;  // q2
    __m128i v11;  // q1
    __m128i v12;  // q18
    __m128i v13;  // q3
    __m128i v14;  // q4
    __m128i v15;  // q3
    __m128i v16;  // q2
    unsigned long long v17;  // d16
    __m128i v18;  // q23
    __m128i v19;  // q22
    uint128_t v2;  // q7
    __m128i v3;  // q0
    uint128_t v4;  // q1
    __m128i v6;  // q17
    __m128i v7;  // q1
    __m128i v8;  // q0
    __m128i v9;  // q19

    v2 = __dirty_unsupported_Iop_SliceV128(0, v0, 15) ^ a7;
    v3 = __dirty_unsupported_Iop_SliceV128(CatOddLanesV(_mm_unpackhi_epi64(a0, a0), _mm_unpackhi_epi64(a0, a0)), CatOddLanesV(_mm_unpackhi_epi64(a0, a0), _mm_unpackhi_epi64(a0, a0)), 1);
    v4 = __dirty_unsupported_Iop_SliceV128(v2, 0, 12);
    v7 = _mm_and_si128(v3, v6);
    v8 = ShrNV(v3, 4);
    v10 = _mm_and_si128(PermV(v9, _mm_and_si128(v7, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v7));
    v11 = _mm_xor_si128(v8, v7);
    v13 = _mm_xor_si128(v10, _mm_and_si128(PermV(v12, _mm_and_si128(v8, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v8)));
    v14 = _mm_xor_si128(v10, _mm_and_si128(PermV(v12, _mm_and_si128(v11, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v11)));
    v15 = _mm_xor_si128(v11, _mm_and_si128(PermV(v12, _mm_and_si128(v13, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v13)));
    v16 = _mm_xor_si128(v8, _mm_and_si128(PermV(v12, _mm_and_si128(v14, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v14)));
    return _mm_cvtsi128_si64(_mm_xor_si128(_mm_xor_si128(v17, _mm_xor_si128(_mm_and_si128(__dirty_unsupported_Iop_SliceV128(v4 ^ v2, 0, 8), _mm_set_epi64x(0, -1)), _mm_xor_si128(v4, v2))), _mm_xor_si128(_mm_and_si128(PermV(v18, _mm_and_si128(v15, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v15)), _mm_and_si128(PermV(v19, _mm_and_si128(v16, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v16)))));
}
