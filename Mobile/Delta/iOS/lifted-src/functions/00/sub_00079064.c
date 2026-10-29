/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x79064..0x79174 (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_79064(void* a0, unsigned int *a1, char *a2, unsigned int a3)
{
    char *v2;  // x21
    unsigned int j;  // w23
    unsigned int k;  // w11
    unsigned int v13;  // w11
    unsigned long long v15;  // d0
    unsigned long long v16;  // d0
    unsigned long long v17;  // d0
    char *i;  // x21
    unsigned long idx;  // x9
    unsigned int v6;  // w9
    unsigned int v7;  // w0
    unsigned int v8;  // w8
    uint128_t *iter;  // x10
    unsigned int v10;  // q0
    unsigned int v11;  // q1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2;
    j = *a1;
    _bzero();
    if (!a3)
    {
        *a1 = 0;
        return v17;
    }
    if (a3 >= 1)
    {
        i = v2;
        do
        {
            idx = *i;
            i += 1;
            *(int *)((char *)a0 + 4 * idx) = *(int *)((char *)a0 + 4 * idx) + 1;
        } while (i < &v2[a3]);
    }
    for (; !*(int *)((char *)a0 + 4 * j); j -= 1);
    *a1 = j;
    v6 = j + 1;
    if (8 > v6)
    {
        v7 = 0;
        v8 = 0;
    }
    else
    {
        v8 = v6 & 0xfffffff8;
        iter = a0 + 16;
        v10 = 0;
        v11 = 0;
        k = v8;
        do
        {
            v13 = k;
            v10 = (unsigned int)_mm_max_epu32(*(int128_t *)((char *)iter - 16), v10);
            v11 = (unsigned int)_mm_max_epu32(*iter, v11);
            iter += 2;
            k = v13 - 8;
        } while (k);
        v15 = __dirty_unsupported_Iop_ZeroHI96ofV128(_mm_max_epu32(_mm_max_epu32(CatOddLanesV(_mm_unpackhi_epi64(_mm_max_epu32(v10, v11), _mm_max_epu32(v10, v11)), _mm_unpackhi_epi64(_mm_max_epu32(v10, v11), _mm_max_epu32(v10, v11))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_max_epu32(v10, v11), _mm_max_epu32(v10, v11)), _mm_unpackhi_epi64(_mm_max_epu32(v10, v11), _mm_max_epu32(v10, v11)))), _mm_max_epu32(CatOddLanesV(_mm_unpacklo_epi64(_mm_max_epu32(v10, v11), _mm_max_epu32(v10, v11)), _mm_unpacklo_epi64(_mm_max_epu32(v10, v11), _mm_max_epu32(v10, v11))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_max_epu32(v10, v11), _mm_max_epu32(v10, v11)), _mm_unpacklo_epi64(_mm_max_epu32(v10, v11), _mm_max_epu32(v10, v11))))));
        v7 = (unsigned int)v15;
        if (v6 == v8)
            return v15;
    }
    do
    {
        if (v7 < (unsigned int)*(int *)((char *)a0 + 4 * v8))
            v7 = *(int *)((char *)a0 + 4 * v8);
    } while ((v8 += 1, v8 <= j));
    return v16;
}
