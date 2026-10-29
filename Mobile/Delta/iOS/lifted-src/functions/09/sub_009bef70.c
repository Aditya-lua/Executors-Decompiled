/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9bef70..0x9befa0 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_9bef70(double a0, double a1, double a2, double a3, double a4, double a5, double a6, double a7)
{
    return (unsigned long long)(_INSERT(CatOddLanesV(_mm_unpackhi_epi64(a7, a7), _mm_unpackhi_epi64(a7, a7)), 0, __int_as_float(_mm_extract_epi32(a7, 2))) & 0xffffffffffffffff ^ *(unsigned int *)((void*)&a6 + 8) * 0x1000000000000000000000000 ^ a6);
}
