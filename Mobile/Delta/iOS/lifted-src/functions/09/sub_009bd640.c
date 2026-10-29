/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9bd640..0x9bd6e0 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_9bd640(void)
{
    uint128_t *v0;  // x9
    uint128_t *v1;  // x9
    __m128i v10;  // q0
    uint128_t *v11;  // x17
    __m128i v2;  // q15
    uint128_t *iter;  // x9
    uint128_t v4;  // q0
    unsigned long long v5;  // x10
    unsigned long long i;  // x10
    uint128_t *v7;  // x17
    uint128_t *v8;  // x17
    __m128i v9;  // q15

    v1 = v0 + 1;
    v2 = *v1;
    iter = v1 + 1;
    v4 = __dirty_unsupported_Iop_Reverse8sIn32_x4(*v0);
    i = v5 - 1;
    *v7 = v4;
    v8 = v7 + 1;
    do
    {
        v9 = *iter;
        iter += 1;
        v10 = _mm_xor_si128(_mm_set1_epi32(0x63636363), _mm_and_si128(PermV(v2, _mm_and_si128(_mm_set_epi64x(218155266037123598, 73474920360970252), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12))));
        i -= 1;
        v8[3] = ~_mm_cmpeq_epi8(_mm_and_si128(v10, _mm_set1_epi32(0x8080808)), _mm_setzero_si128());
        v8[2] = ~_mm_cmpeq_epi8(_mm_and_si128(v10, _mm_set1_epi32(0x4040404)), _mm_setzero_si128());
        v8[1] = ~_mm_cmpeq_epi8(_mm_and_si128(v10, _mm_set1_epi32(0x2020202)), _mm_setzero_si128());
        *v8 = ~_mm_cmpeq_epi8(_mm_and_si128(v10, _mm_set1_epi32(0x1010101)), _mm_setzero_si128());
        v11 = v8 + 4;
        v11[3] = ~_mm_cmpeq_epi8(_mm_and_si128(v10, _mm_set1_epi32(0x80808080)), _mm_setzero_si128());
        v11[2] = ~_mm_cmpeq_epi8(_mm_and_si128(v10, _mm_set1_epi32(0x40404040)), _mm_setzero_si128());
        v11[1] = ~_mm_cmpeq_epi8(_mm_and_si128(v10, _mm_set1_epi32(0x20202020)), _mm_setzero_si128());
        *v11 = ~_mm_cmpeq_epi8(_mm_and_si128(v10, _mm_set1_epi32(0x10101010)), _mm_setzero_si128());
        v8 = v11 + 4;
        v2 = v9;
    } while (i);
    return _mm_cvtsi128_si64(v10);
}
