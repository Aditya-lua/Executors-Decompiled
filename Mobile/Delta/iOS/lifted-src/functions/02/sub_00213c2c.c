/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x213c2c..0x213c60 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_213c2c(unsigned int *a0)
{
    __m128i v1;  // q0

    v1 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi16(__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_xor_si128(_mm_set_epi64x(0, 13792557332103250), _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *a0), 8))), _mm_set_epi16(0, 0, 0, 0, 133, 174, 215, 0)));
    return (unsigned int)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_unpacklo_epi64(v1, v1), _mm_unpacklo_epi64(v1, v1)));
}
