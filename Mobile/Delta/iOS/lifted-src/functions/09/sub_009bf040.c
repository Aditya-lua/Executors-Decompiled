/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9bf040..0x9bf0e0 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9bf040_0 {
    char padding_0[16];
    uint128_t field_10;
} st_9bf040_0;


long long sub_9bf040(unsigned long a0, unsigned long a1, st_9bf040_0 *a2, unsigned int a3, double a4)
{
    uint128_t *v0;  // x2
    __m128i v1;  // q16
    __m128i v8;  // q4
    __m128i v9;  // q24
    __m128i v10;  // q25
    __m128i v11;  // q9
    __m128i v12;  // q3
    __m128i v13;  // q26
    __m128i v14;  // q2
    uint128_t *v15;  // x8
    __m128i v16;  // q27
    __m128i v17;  // q28
    __m128i v18;  // q29
    __m128i v19;  // q30
    __m128i v20;  // q31
    __m128i v2;  // q4
    __m128i v3;  // q1
    __m128i v4;  // q1
    __m128i v5;  // q3
    __m128i v6;  // q1
    __m128i v7;  // q17

    if (!a3)
    {
        v0 = &a2->field_10;
        v2 = _mm_and_si128(PermV(_mm_xor_si128(v1, a4), _mm_and_si128(v11, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v11));
        v3 = _mm_and_si128(PermV(v2, _mm_and_si128(v11, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v11));
        v4 = *v15;
        v5 = _mm_xor_si128(_mm_xor_si128(v3, v2), _mm_and_si128(PermV(v3, _mm_and_si128(v11, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v11)));
    }
    else
    {
        v6 = ShrNV(a4, 4);
        v8 = _mm_and_si128(a4, v7);
        v12 = _mm_and_si128(PermV(_mm_xor_si128(_mm_and_si128(PermV(v9, _mm_and_si128(v8, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v8)), _mm_and_si128(PermV(v10, _mm_and_si128(v6, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v6))), _mm_and_si128(v11, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v11));
        v14 = _mm_and_si128(PermV(v13, _mm_and_si128(v8, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v8));
        v4 = *v15;
        v5 = _mm_xor_si128(_mm_xor_si128(_mm_and_si128(PermV(_mm_xor_si128(_mm_xor_si128(_mm_and_si128(PermV(_mm_xor_si128(_mm_xor_si128(v12, v14), _mm_and_si128(PermV(v16, _mm_and_si128(v6, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v6))), _mm_and_si128(v11, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v11)), _mm_and_si128(PermV(v17, _mm_and_si128(v8, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v8))), _mm_and_si128(PermV(v18, _mm_and_si128(v6, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v6))), _mm_and_si128(v11, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v11)), _mm_and_si128(PermV(v19, _mm_and_si128(v8, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v8))), _mm_and_si128(PermV(v20, _mm_and_si128(v6, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v6)));
        v0 = (char *)a2 - 16;
    }
    *v0 = _mm_and_si128(PermV(v5, _mm_and_si128(v4, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v4));
    return a0;
}
