/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9befb8..0x9bf020 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_9befb8(double a0, double a1, double a2, double a3, double a4, double a5, double a6, double a7)
{
    uint128_t v0;  // q1
    __m128i v10;  // q4
    __m128i v11;  // q3
    __m128i v12;  // q2
    unsigned long long v13;  // d16
    __m128i v14;  // q23
    __m128i v15;  // q22
    __m128i v2;  // q17
    __m128i v3;  // q1
    __m128i v4;  // q0
    __m128i v5;  // q19
    __m128i v6;  // q2
    __m128i v7;  // q1
    __m128i v8;  // q18
    __m128i v9;  // q3

    v0 = __dirty_unsupported_Iop_SliceV128(a7, a4, 12);
    v3 = _mm_and_si128(a0, v2);
    v4 = ShrNV(a0, 4);
    v6 = _mm_and_si128(PermV(v5, _mm_and_si128(v3, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v3));
    v7 = _mm_xor_si128(v4, v3);
    v9 = _mm_xor_si128(v6, _mm_and_si128(PermV(v8, _mm_and_si128(v4, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v4)));
    v10 = _mm_xor_si128(v6, _mm_and_si128(PermV(v8, _mm_and_si128(v7, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v7)));
    v11 = _mm_xor_si128(v7, _mm_and_si128(PermV(v8, _mm_and_si128(v9, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v9)));
    v12 = _mm_xor_si128(v4, _mm_and_si128(PermV(v8, _mm_and_si128(v10, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v10)));
    return _mm_cvtsi128_si64(_mm_xor_si128(_mm_xor_si128(v13, _mm_xor_si128(_mm_and_si128(__dirty_unsupported_Iop_SliceV128(v0 ^ a7, a4, 8), _mm_set_epi64x(0, -1)), _mm_xor_si128(v0, a7))), _mm_xor_si128(_mm_and_si128(PermV(v14, _mm_and_si128(v11, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v11)), _mm_and_si128(PermV(v15, _mm_and_si128(v12, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v12)))));
}
