/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad1b10..0xad1c00 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_ad1a00;

uint128_t * sub_ad1b10(uint128_t *a0, unsigned int *iter, unsigned int a2)
{
    uint128_t v1;  // q5
    __m128i v9;  // q2
    __m128i v10;  // 4190
    unsigned int v11;  // w7
    unsigned int v12;  // w8
    uint128_t v13;  // q5
    unsigned long long v2;  // x6
    unsigned int *v3;  // x5
    __m128i v4;  // q4
    unsigned long long v5;  // x6
    unsigned int *v6;  // x5
    __m128i v7;  // q0
    __m128i v8;  // q0

    v1 = 0xb27022dc677d919756aa3350a3b1bac6 ^ __dirty_unsupported_Iop_Reverse8sIn32_x4(*a0);
    v2 = 32;
    v3 = &g_ad1a00;
    if (!a2)
        iter += 31;
    do
    {
        v5 = v2;
        v6 = v3 + 1;
        *(float *)&v4 = __int_as_float(*v3 ^ *(unsigned int *)((void*)&v1 + 4) ^ *(unsigned int *)((void*)&v1 + 8) ^ *(unsigned int *)((void*)&v1 + 12));
        v7 = _mm_and_si128(PermV(v4, _mm_and_si128(_mm_set_epi64x(217871579370095880, 0xb0e0104070a0d00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 6, 9, 12, 15, 2, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0)));
        v8 = _mm_and_si128(PermV(_mm_set_epi8(-63, 11, -74, 124, 74, -128, 61, -9, 21, -33, 98, -88, -98, 84, -23, 35), _mm_and_si128(_mm_and_si128(v7, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v7, _mm_set1_epi32(0xf0f0f0f))));
        v9 = _mm_and_si128(PermV(_mm_set_epi8(0x22, 88, 26, 96, 2, 120, 58, 64, 98, 24, 90, 32, 66, 56, 122, 0), _mm_and_si128(ShrNV(v7, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v7, 4)));
        v10 = __dirty_arm64g_dirtyhelper_AESE(/* unsupported instruction */, _mm_extract_epi64(_mm_xor_si128(_mm_xor_si128(v9, v8), _mm_setzero_si128()), 1), _mm_cvtsi128_si64(v9) ^ _mm_cvtsi128_si64(v8) ^ 0);
        v11 = _mm_cvtsi128_si32(_mm_xor_si128(_mm_and_si128(PermV(_mm_set_epi8(20, 7, -58, -43, 108, 127, -66, -83, -71, -86, 107, 120, -63, -46, 19, 0), _mm_and_si128(ShrNV(v10, 4), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), ShrNV(v10, 4))), _mm_and_si128(PermV(_mm_set_epi8(-29, -125, -63, -95, -2, -98, -36, -68, 100, 4, 70, 38, 121, 25, 91, 59), _mm_and_si128(_mm_and_si128(v10, _mm_set1_epi32(0xf0f0f0f)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_and_si128(v10, _mm_set1_epi32(0xf0f0f0f))))));
        v12 = v11 ^ (v11 * 0x2000 | v11 >> 19) ^ (v11 * 0x800000 | v11 >> 9) ^ (unsigned int)v1;
        v13 = _INSERT(v1, 0, __int_as_float(v12));
        if (a2)
        {
            *iter = v12;
            iter += 1;
        }
        else
        {
            *iter = v12;
            iter = (char *)iter - 4;
        }
    } while ((v1 = _mm_and_si128(PermV(v13, _mm_and_si128(_mm_set_epi64x(216736831831411980, 795458214266537220), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(3, 2, 1, 0, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4))), v2 = v5 - 1, v3 = v6, v5 != 1));
    return a0;
}
