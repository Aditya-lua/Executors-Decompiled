/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x79960..0x799f4 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_79960_0 {
    uint128_t field_0;
    char field_4;
    char padding_5[11];
    uint128_t field_10;
} st_79960_0;


unsigned long long sub_79960(st_79960_0 *a0, unsigned int a1)
{
    unsigned long v0;  // x9
    unsigned long long v1;  // 4113
    unsigned int v10;  // s0
    st_79960_0 *v11;  // x11
    unsigned long long v12;  // x9
    unsigned long long v13;  // x9
    st_79960_0 *v14;  // x11
    unsigned long long v2;  // x10
    unsigned long long v3;  // x8
    uint128_t *iter;  // x8
    unsigned long long v5;  // q0
    unsigned long long v6;  // q1
    unsigned long long i;  // x11
    unsigned long long v8;  // x11

    v0 = a1 + 1;
    v1 = arm64g_calculate_condition(49, a1, 1, 0);
    if (!(v1 & 1))
        return 0;
    if (8 > (unsigned int)v0)
    {
        v2 = 0;
        v3 = 0;
    }
    else
    {
        v2 = v0 & 0xfffffff8;
        iter = &a0->field_4;
        v5 = 0;
        v6 = 0;
        i = v2;
        do
        {
            v8 = i;
            v5 = (unsigned long long)_mm_sub_epi32(v5, ~_mm_cmpeq_epi32(*(int128_t *)((char *)iter - 16), _mm_setzero_si128()));
            v6 = (unsigned long long)_mm_sub_epi32(v6, ~_mm_cmpeq_epi32(*iter, _mm_setzero_si128()));
            iter += 2;
            i = v8 - 8;
        } while (i);
        v10 = __dirty_unsupported_Iop_ZeroHI96ofV128(_mm_add_epi32(_mm_add_epi32(CatOddLanesV(_mm_unpackhi_epi64(_mm_add_epi32(v6, v5), _mm_add_epi32(v6, v5)), _mm_unpackhi_epi64(_mm_add_epi32(v6, v5), _mm_add_epi32(v6, v5))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_add_epi32(v6, v5), _mm_add_epi32(v6, v5)), _mm_unpackhi_epi64(_mm_add_epi32(v6, v5), _mm_add_epi32(v6, v5)))), _mm_add_epi32(CatOddLanesV(_mm_unpacklo_epi64(_mm_add_epi32(v6, v5), _mm_add_epi32(v6, v5)), _mm_unpacklo_epi64(_mm_add_epi32(v6, v5), _mm_add_epi32(v6, v5))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_add_epi32(v6, v5), _mm_add_epi32(v6, v5)), _mm_unpacklo_epi64(_mm_add_epi32(v6, v5), _mm_add_epi32(v6, v5))))));
        v3 = __float_as_int(v10);
        if (v2 == v0)
            return __float_as_int(v10);
    }
    v11 = (char *)a0 + 4 * v2;
    v12 = v0 - v2;
    do
    {
        v13 = v12;
        v14 = (char *)&v11->field_0 + 4;
        if (!(int)v11->field_0)
            v3 &= 0xffffffff;
        else
            v3 = (unsigned int)v3 + 1;
    } while ((v12 = v13 - 1, v11 = v14, v13 != 1));
    return v3;
}
