/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa85fdc..0xa86280 (676 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_a85fdc(uint128_t *a0, long long a1, long long a2, long long a3)
{
    uint128_t *iter;  // x19
    long long i;  // x8
    __m128i v16;  // q5
    __m128i v17;  // q6
    __m128i v18;  // q5
    __m128i v19;  // q17
    __m128i v20;  // q1
    __m128i v21;  // q6
    __m128i v22;  // q0
    __m128i v23;  // q7
    __m128i v24;  // q17
    __m128i v25;  // q1
    __m128i v8;  // q4
    uint128_t *v26;  // x19
    long long v27;  // x19
    __m128i v9;  // q5
    __m128i v10;  // q7
    __m128i v11;  // q16
    __m128i v12;  // q23
    __m128i v13;  // q6
    __m128i v14;  // q0
    __m128i v15;  // q7
    __m128i v0;  // [bp-0x120]
    __m128i v1;  // [bp-0x110]
    uint128_t v2;  // [bp-0xf8]
    unsigned long v3;  // [bp-0x78]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    iter = a0;
    v3 = *(long long *)&g_10002b0;
    if (sub_a8668c(&v2, 128, a1, a2, a3))
    {
        i = 0;
        v1 = _mm_set_epi64x(0xffffff07ffffff06, 0xffffff05ffffff04);
        v0 = _mm_set_epi64x(0xffffff03ffffff02, 0xffffff01ffffff00);
        v8 = _mm_set1_epi32(3329);
        do
        {
            v9 = *(int128_t *)((char *)&v2 + i);
            v10 = _mm_and_si128(PermV(v9, _mm_and_si128(v1, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v1));
            v11 = _mm_and_si128(PermV(v9, _mm_and_si128(v0, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), v0));
            v12 = _mm_and_si128(PermV(v9, _mm_and_si128(_mm_set_epi64x(0xffffff0fffffff0e, 0xffffff0dffffff0c), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 15, -1, -1, -1, 14, -1, -1, -1, 13, -1, -1, -1, 12)));
            v13 = _mm_and_si128(PermV(v9, _mm_and_si128(_mm_set_epi64x(0xffffff0bffffff0a, 0xffffff09ffffff08), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 11, -1, -1, -1, 10, -1, -1, -1, 9, -1, -1, -1, 8)));
            v14 = _mm_add_epi32(_mm_add_epi32(_mm_add_epi32(_mm_and_si128(v10, _mm_set1_epi32(-255)), _mm_srai_epi32(_mm_slli_epi32(v10, 28), 31)), _mm_srai_epi32(_mm_slli_epi32(v10, 29), 31)), _mm_and_si128(_mm_srli_epi32(v10, 1), _mm_set1_epi32(-127)));
            v15 = _mm_add_epi32(_mm_add_epi32(_mm_add_epi32(_mm_and_si128(v11, _mm_set1_epi32(-255)), _mm_srai_epi32(_mm_slli_epi32(v11, 28), 31)), _mm_srai_epi32(_mm_slli_epi32(v11, 29), 31)), _mm_and_si128(_mm_srli_epi32(v11, 1), _mm_set1_epi32(-127)));
            v16 = _mm_add_epi32(_mm_add_epi32(_mm_add_epi32(_mm_and_si128(v12, _mm_set1_epi32(-255)), _mm_srai_epi32(_mm_slli_epi32(v12, 28), 31)), _mm_srai_epi32(_mm_slli_epi32(v12, 29), 31)), _mm_and_si128(_mm_srli_epi32(v12, 1), _mm_set1_epi32(-127)));
            v17 = _mm_add_epi32(_mm_add_epi32(_mm_add_epi32(_mm_and_si128(v13, _mm_set1_epi32(-255)), _mm_srai_epi32(_mm_slli_epi32(v13, 28), 31)), _mm_srai_epi32(_mm_slli_epi32(v13, 29), 31)), _mm_and_si128(_mm_srli_epi32(v13, 1), _mm_set1_epi32(-127)));
            v18 = CatEvenLanesV(_mm_add_epi32(_mm_and_si128(_mm_cmpgt_epi32(_mm_setzero_si128(), v16), v8), v16), _mm_add_epi32(_mm_and_si128(_mm_cmpgt_epi32(_mm_setzero_si128(), v17), v8), v17));
            v19 = _mm_add_epi32(_mm_add_epi32(_mm_sub_epi32(_mm_and_si128(_mm_srli_epi32(v12, 5), _mm_set1_epi32(-7)), _mm_srli_epi32(v12, 7)), _mm_and_si128(_mm_srli_epi32(v12, 4), _mm_set1_epi32(-15))), _mm_srai_epi32(_mm_slli_epi32(v12, 25), 31));
            v20 = _mm_add_epi32(_mm_add_epi32(_mm_sub_epi32(_mm_and_si128(_mm_srli_epi32(v13, 5), _mm_set1_epi32(-7)), _mm_srli_epi32(v13, 7)), _mm_and_si128(_mm_srli_epi32(v13, 4), _mm_set1_epi32(-15))), _mm_srai_epi32(_mm_slli_epi32(v13, 25), 31));
            v21 = CatEvenLanesV(_mm_add_epi32(_mm_and_si128(_mm_cmpgt_epi32(_mm_setzero_si128(), v19), v8), v19), _mm_add_epi32(_mm_and_si128(_mm_cmpgt_epi32(_mm_setzero_si128(), v20), v8), v20));
            v22 = CatEvenLanesV(_mm_add_epi32(_mm_and_si128(_mm_cmpgt_epi32(_mm_setzero_si128(), v14), v8), v14), _mm_add_epi32(_mm_and_si128(_mm_cmpgt_epi32(_mm_setzero_si128(), v15), v8), v15));
            v23 = _mm_add_epi32(_mm_add_epi32(_mm_sub_epi32(_mm_and_si128(_mm_srli_epi32(v10, 5), _mm_set1_epi32(-7)), _mm_srli_epi32(v10, 7)), _mm_and_si128(_mm_srli_epi32(v10, 4), _mm_set1_epi32(-15))), _mm_srai_epi32(_mm_slli_epi32(v10, 25), 31));
            v24 = _mm_add_epi32(_mm_add_epi32(_mm_sub_epi32(_mm_and_si128(_mm_srli_epi32(v11, 5), _mm_set1_epi32(-7)), _mm_srli_epi32(v11, 7)), _mm_and_si128(_mm_srli_epi32(v11, 4), _mm_set1_epi32(-15))), _mm_srai_epi32(_mm_slli_epi32(v11, 25), 31));
            i += 16;
            v25 = CatEvenLanesV(_mm_add_epi32(_mm_and_si128(_mm_cmpgt_epi32(_mm_setzero_si128(), v23), v8), v23), _mm_add_epi32(_mm_and_si128(_mm_cmpgt_epi32(_mm_setzero_si128(), v24), v8), v24));
            iter[1] = _mm_unpackhi_epi16(v22, v25);
            *iter = _mm_unpacklo_epi16(v22, v25);
            v26 = iter + 2;
            v26[1] = _mm_unpackhi_epi16(v18, v21);
            *v26 = _mm_unpacklo_epi16(v18, v21);
            iter += 4;
        } while (i != 128);
        v27 = 1;
    }
    else
    {
        v27 = 0;
    }
    sub_a66ec0(&v2, 128);
    if (*(long long *)&g_10002b0 == v3)
        return v27;
    ___stack_chk_fail();
}
