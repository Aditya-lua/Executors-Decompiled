/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9bf020..0x9bf040 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_9bf020(double a0)
{
    __m128i v0;  // q20
    __m128i v1;  // q17
    __m128i v2;  // q21

    return _mm_cvtsi128_si64(_mm_xor_si128(_mm_and_si128(PermV(v0, _mm_and_si128(_mm_and_si128(a0, v1), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(a0, v1))), _mm_and_si128(PermV(v2, _mm_and_si128(ShrNV(a0, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(a0, 4)))));
}
