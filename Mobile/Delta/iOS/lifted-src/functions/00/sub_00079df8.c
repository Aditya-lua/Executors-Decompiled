/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x79df8..0x79ec8 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_79df8_0 {
    char padding_0[8];
    uint128_t field_8;
    uint128_t field_18;
    uint128_t field_28;
    uint128_t field_38;
} st_79df8_0;


unsigned long long sub_79df8(st_79df8_0 *a0, void* a1, unsigned long long a2)
{
    unsigned long v0;  // x8
    unsigned long long v1;  // x9
    unsigned long long i;  // x12
    unsigned long long v11;  // x12
    __m128i v13;  // q5
    __m128i v14;  // q6
    unsigned long v16;  // d0
    void* v17;  // x11
    char *v18;  // x12
    unsigned long long j;  // x8
    unsigned long long v2;  // x10
    unsigned long long v20;  // x8
    uint128_t *v3;  // x10
    uint128_t *v4;  // x11
    unsigned long long v5;  // q0
    uint128_t v6;  // q1
    unsigned long long v7;  // q2
    unsigned long long v8;  // q3
    unsigned long long v9;  // q4

    if (a2 >> 31 & 1)
        return 0;
    v0 = (unsigned int)a2 + 1;
    if (7 > (unsigned int)a2)
    {
        v1 = 0;
        v2 = 0;
    }
    else
    {
        v1 = v0 & 0xfffffff8;
        v3 = (char *)&a0->field_18 + 8;
        v4 = a1 + 16;
        v5 = 0;
        v6 = CONCAT(0xff, 0xff);
        v7 = 0;
        v8 = 0;
        v9 = 0;
        i = v1;
        do
        {
            v11 = i;
            v13 = CatEvenLanesV(_mm_and_si128(*(int128_t *)((char *)v3 - 16), v6), _mm_and_si128(*(int128_t *)((char *)v3 - 32), v6));
            v14 = CatEvenLanesV(_mm_and_si128(v3[1], v6), _mm_and_si128(*v3, v6));
            v7 = (unsigned long long)_mm_add_epi64(v7, MullV(_mm_extract_epi64(v13, 1), (long long)((uint128_t)(*(int128_t *)((char *)v4 - 16)) >> 64)));
            v5 = (unsigned long long)_mm_add_epi64(v5, MullV(_mm_cvtsi128_si64(v13), (long long)*(int128_t *)((char *)v4 - 16)));
            v9 = (unsigned long long)_mm_add_epi64(v9, MullV(_mm_extract_epi64(v14, 1), (unsigned long long)(*v4 >> 64)));
            v8 = (unsigned long long)_mm_add_epi64(v8, MullV(_mm_cvtsi128_si64(v14), (unsigned long long)*v4));
            v4 += 2;
            v3 += 4;
            i = v11 - 8;
        } while (i);
        v16 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v8, v5), _mm_add_epi64(v9, v7)), _mm_unpackhi_epi64(_mm_add_epi64(_mm_add_epi64(v8, v5), _mm_add_epi64(v9, v7)), _mm_add_epi64(_mm_add_epi64(v8, v5), _mm_add_epi64(v9, v7)))));
        v2 = __double_as_longlong(v16);
        if (v1 == v0)
            return __double_as_longlong(v16) >> 3;
    }
    v17 = a1 + v1 * 4;
    v18 = &(a0->padding_0)[1 + v1];
    j = v0 - v1;
    do
    {
        v20 = j;
        v2 += *v18 * *(int *)v17;
        j = v20 - 1;
        v17 += 4;
        v18 += 8;
    } while (j);
    return v2 >> 3;
}
