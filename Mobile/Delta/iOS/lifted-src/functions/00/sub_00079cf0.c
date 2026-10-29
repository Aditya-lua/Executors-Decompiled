/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x79cf0..0x79df8 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_79cf0_1 {
    uint128_t field_0;
    char field_4;
    char padding_5[11];
    uint128_t field_10;
} st_79cf0_1;

typedef struct st_79cf0_0 {
    char padding_0[1];
    char field_1;
    char padding_2[6];
    uint128_t field_8;
    uint128_t field_18;
    uint128_t field_28;
    uint128_t field_38;
} st_79cf0_0;


long long sub_79cf0(st_79cf0_0 *a0, st_79cf0_1 *a1, unsigned int a2)
{
    unsigned long v0;  // x8
    unsigned long v1;  // cc_op
    __m128i v10;  // q2
    __m128i v11;  // q3
    uint128_t i;  // x12
    uint128_t v13;  // x12
    __m128i v16;  // q0
    unsigned long v18;  // d0
    unsigned long long v19;  // x11
    unsigned long v2;  // cc_dep1
    st_79cf0_1 *v20;  // x12
    unsigned long long j;  // x8
    unsigned long long v22;  // x8
    unsigned long v25;  // 4112
    unsigned long v26;  // cc_op
    unsigned long v27;  // cc_dep1
    unsigned long v28;  // 4112
    unsigned long long v29;  // 4126
    unsigned long v3;  // cc_dep2
    uint128_t v4;  // x9
    uint128_t v5;  // w10
    uint128_t *iter;  // x10
    uint128_t *v7;  // x11
    __m128i v8;  // q0
    uint128_t v9;  // q1

    if (a2 > a0->field_1)
        return 0;
    v0 = a2 + 1;
    v1 = 3;
    v2 = a2;
    v3 = 7;
    if (7 > a2)
    {
        v4 = 0;
        v5 = 0;
    }
    else
    {
        v4 = v0 & 0x7ffffff8;
        iter = &a1->field_4;
        v7 = (char *)&a0->field_18 + 8;
        v8 = _mm_setzero_si128();
        v9 = CONCAT(0xff, 0xff);
        v10 = _mm_set1_epi32(1);
        v11 = _mm_setzero_si128();
        i = v4;
        do
        {
            v13 = i;
            v8 = _mm_or_si128(v8, _mm_and_si128(_mm_and_si128(CatEvenLanesV(_mm_cmpeq_epi64(_mm_and_si128(*(int128_t *)((char *)v7 - 16), v9), _mm_setzero_si128()), _mm_cmpeq_epi64(_mm_and_si128(*(int128_t *)((char *)v7 - 32), v9), _mm_setzero_si128())), ~_mm_cmpeq_epi32(*(int128_t *)((char *)iter - 16), _mm_setzero_si128())), v10));
            v11 = _mm_or_si128(v11, _mm_and_si128(_mm_and_si128(CatEvenLanesV(_mm_cmpeq_epi64(_mm_and_si128(v7[1], v9), _mm_setzero_si128()), _mm_cmpeq_epi64(_mm_and_si128(*v7, v9), _mm_setzero_si128())), ~_mm_cmpeq_epi32(*iter, _mm_setzero_si128())), v10));
            iter += 2;
            v7 += 4;
            i = v13 - 8;
        } while (i);
        v16 = _mm_or_si128(v11, v8);
        v18 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_or_si128(v16, __dirty_unsupported_Iop_SliceV128(v16, v16, 8)));
        v5 = (unsigned int)__double_as_longlong(v18) | (unsigned int)(__double_as_longlong(v18) >> 32);
        v1 = 4;
        v2 = v4;
        v3 = v0;
        if (v2 == v3)
            return !(unsigned int)__double_as_longlong(v18) && __double_as_longlong(v18) <= 0xffffffff;
    }
    v19 = &(a0->padding_0)[8 * v4 + 8];
    v20 = (char *)a1 + 4 * v4;
    j = v0 - v4;
    do
    {
        v22 = j;
        if ((int)v20->field_0)
        {
            v25 = arm64g_calculate_condition(v1 | 16, v2, v3, 0);
            v26 = 3;
            v27 = (v25 & 1 ? *(char *)v19 : 0);
        }
        else
        {
            v28 = arm64g_calculate_condition(v1 | 16, v2, v3, 0);
            v26 = 0;
            v27 = (v28 & 1 ? *(char *)v19 : 0);
        }
        v29 = arm64g_calculate_condition(v26 | 16, v27, 0, 0);
        v5 |= (unsigned int)!(v29 & 1);
        j = v22 - 1;
        v1 = 4;
        v3 = 1;
        v2 = v22;
        v19 += 8;
        v20 = (char *)&v20->field_0 + 4;
    } while (j);
    return !v5 && v29 & 1;
}
