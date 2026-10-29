/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7f198..0x7f214 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7f198_0 {
    char padding_0[4];
    double field_4;
    char padding_c[8];
    double field_14;
} st_7f198_0;


uint128_t sub_7f198(st_7f198_0 *a0, uint128_t a1)
{
    uint128_t v0;  // x8
    __m128i v1;  // q0
    unsigned long long *v10;  // x9
    uint128_t j;  // x8
    uint128_t v12;  // x8
    __m128i v13;  // q1
    unsigned long long *v2;  // x9
    __m128i v3;  // q0
    __m128i v4;  // q1
    uint128_t i;  // x10
    uint128_t v6;  // x10
    __m128i v7;  // q2
    __m128i v8;  // q3

    if (!a1)
        return a1;
    if (a1 == 1)
    {
        v0 = 0;
        v1 = _mm_setzero_si128();
    }
    else
    {
        v0 = a1 & 0xfffffffffffffffe;
        v2 = &a0->padding_c[4];
        v3 = _mm_setzero_si128();
        v4 = _mm_setzero_si128();
        i = v0;
        do
        {
            v6 = i;
            v7 = *(unsigned long long *)&*(double *)((char *)v2 - 16);
            v8 = *(unsigned long long *)&*(double *)v2;
            v2 += 4;
            v4 = _mm_add_epi64(v4, _mm_srli_epi64(_mm_unpacklo_epi32(v7, v7), 32));
            v3 = _mm_add_epi64(v3, _mm_srli_epi64(_mm_unpacklo_epi32(v8, v8), 32));
            i = v6 - 2;
        } while (i);
        v1 = _mm_add_epi64(v3, v4);
        if (v0 == a1)
            return (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi64(v1, _mm_unpackhi_epi64(v1, v1)));
    }
    v10 = &(a0->padding_0)[4 * v0 + 4];
    j = a1 - v0;
    do
    {
        v12 = j;
        v13 = *(unsigned long long *)&*(double *)v10;
        v10 += 2;
        v1 = _mm_add_epi64(v1, _mm_srli_epi64(_mm_unpacklo_epi32(v13, v13), 32));
        j = v12 - 1;
    } while (j);
    return (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi64(v1, _mm_unpackhi_epi64(v1, v1)));
}
