/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x30188..0x30290 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_30188_1 {
    char padding_0[1];
    char field_1;
    char padding_2[70];
    void* field_48;
    void* field_50;
} st_30188_1;

typedef struct st_30188_0 {
    char field_0;
} st_30188_0;


st_30188_1 * sub_30188(st_30188_1 *a0, unsigned long long a1, unsigned int *a2)
{
    void* v2;  // x8
    st_30188_1 *v3;  // x9
    st_30188_1 *v12;  // x0
    unsigned int v13;  // w3
    unsigned long long v14;  // x4
    st_30188_1 *v15;  // x1
    unsigned long long j;  // x6
    unsigned long long v17;  // x5
    __m128i v18;  // q0
    uint128_t *iter;  // x3
    __m128i v20;  // q0
    unsigned long long v21;  // x6
    st_30188_1 *v4;  // x10
    st_30188_1 *v24;  // x5
    st_30188_1 *v5;  // x16
    st_30188_1 *i;  // x11
    st_30188_1 *v7;  // x12
    uint128_t *v8;  // x13
    st_30188_1 *v9;  // x15
    st_30188_1 *v10;  // x5
    st_30188_1 *v11;  // x17
    st_30188_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_30188_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a0->field_48;
    if (a0->field_50 == v2)
        return a0;
    v3 = 0;
    v4 = 0;
    v5 = 0;
    i = (long long)(a0->field_50 - v2) >> 2;
    v7 = (int)a1;
    v8 = v2 + 16;
    v9 = v7;
    do
    {
        if (i < v9)
            v10 = i;
        else
            v10 = v9;
        v11 = v5 + v7;
        if (i < v11)
            v12 = i;
        else
            v12 = v11;
        v13 = *(int *)((char *)v2 + 0x4 * v5);
        if (v12 <= v5)
            continue;
        v14 = &(v12->padding_0)[-1 * v7 * v4];
        v15 = v5;
        if (v14 >= 8)
        {
            j = v10 + v3 & 0xfffffffffffffff8;
            v17 = v14 & 0xfffffffffffffff8;
            v15 = &(v5->padding_0)[v17];
            v18 = (__m128i)(CONCAT(v13 | v13 * 0x100000000, v13 | v13 * 0x100000000));
            iter = v8;
            v20 = v18;
            do
            {
                v21 = j;
                v20 = _mm_min_epi32(*(int128_t *)((char *)iter - 16), v20);
                v18 = _mm_min_epi32(*iter, v18);
                iter += 2;
                j = v21 - 8;
            } while (j);
            v13 = (unsigned int)__dirty_unsupported_Iop_ZeroHI96ofV128(_mm_min_epi32(_mm_min_epi32(CatOddLanesV(_mm_unpackhi_epi64(_mm_min_epi32(v20, v18), _mm_min_epi32(v20, v18)), _mm_unpackhi_epi64(_mm_min_epi32(v20, v18), _mm_min_epi32(v20, v18))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_min_epi32(v20, v18), _mm_min_epi32(v20, v18)), _mm_unpackhi_epi64(_mm_min_epi32(v20, v18), _mm_min_epi32(v20, v18)))), _mm_min_epi32(CatOddLanesV(_mm_unpacklo_epi64(_mm_min_epi32(v20, v18), _mm_min_epi32(v20, v18)), _mm_unpacklo_epi64(_mm_min_epi32(v20, v18), _mm_min_epi32(v20, v18))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_min_epi32(v20, v18), _mm_min_epi32(v20, v18)), _mm_unpacklo_epi64(_mm_min_epi32(v20, v18), _mm_min_epi32(v20, v18))))));
            if (v14 == v17)
                continue;
        }
        do
        {
            v24 = &v15->field_1;
            if (*(int *)((char *)v2 + 0x4 * v15) < (int)v13)
                v13 = *(int *)((char *)v2 + 0x4 * v15);
        } while ((v15 = v24, v24 < v12));
        a2[v5 / v7] = v13;
        v4 = &v4->field_1;
        v8 = (char *)v8 + ((long long)(a1 * 0x100000000) >> 63 & 0xfffffffc00000000 | __ROL__(a1, 2) & 0x3fffffffc & 0x3ffffffff);
        v9 += v7;
        v3 -= v7;
        v5 = v11;
    } while (i > v5);
    return v12;
}
