/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbed64..0xbede8 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


uint128_t sub_bed64(void* a0, uint128_t a1)
{
    uint128_t v0;  // x9
    uint128_t v1;  // x8
    unsigned long long j;  // x9
    unsigned long long v11;  // x9
    void* v12;  // x10
    uint128_t *iter;  // x8
    __m128i v3;  // q0
    __m128i v4;  // q1
    uint128_t i;  // x10
    uint128_t v6;  // x10
    unsigned int v8;  // s0
    void* v9;  // x10

    if (!a1)
        return 0;
    if (8 > a1)
    {
        v0 = 0;
        v1 = 0;
    }
    else
    {
        v0 = a1 & 0xfffffffffffffff8;
        iter = a0 + 16;
        v3 = _mm_setzero_si128();
        v4 = _mm_setzero_si128();
        i = v0;
        do
        {
            v6 = i;
            v3 = _mm_add_epi32(*(int128_t *)((char *)iter - 16), v3);
            v4 = _mm_add_epi32(*iter, v4);
            iter += 2;
            i = v6 - 8;
        } while (i);
        v8 = __dirty_unsupported_Iop_ZeroHI96ofV128(_mm_add_epi32(_mm_add_epi32(CatOddLanesV(_mm_unpackhi_epi64(_mm_add_epi32(v4, v3), _mm_add_epi32(v4, v3)), _mm_unpackhi_epi64(_mm_add_epi32(v4, v3), _mm_add_epi32(v4, v3))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_add_epi32(v4, v3), _mm_add_epi32(v4, v3)), _mm_unpackhi_epi64(_mm_add_epi32(v4, v3), _mm_add_epi32(v4, v3)))), _mm_add_epi32(CatOddLanesV(_mm_unpacklo_epi64(_mm_add_epi32(v4, v3), _mm_add_epi32(v4, v3)), _mm_unpacklo_epi64(_mm_add_epi32(v4, v3), _mm_add_epi32(v4, v3))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_add_epi32(v4, v3), _mm_add_epi32(v4, v3)), _mm_unpacklo_epi64(_mm_add_epi32(v4, v3), _mm_add_epi32(v4, v3))))));
        v1 = __float_as_int(v8);
        if (v0 == a1)
            return __float_as_int(v8);
    }
    v9 = a0 + v0 * 4;
    j = a1 - v0;
    do
    {
        v11 = j;
        v12 = v9 + 4;
        v1 += *(int *)v9;
        j = v11 - 1;
        v9 = v12;
    } while (j);
    return v1;
}
