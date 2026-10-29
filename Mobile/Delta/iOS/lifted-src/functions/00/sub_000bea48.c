/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbea48..0xbeb8c (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_bea48(void* a0, unsigned int a1, unsigned int a2, unsigned int a3)
{
    unsigned int v0;  // w9
    unsigned int v1;  // x8
    __m128i v10;  // q4
    __m128i v11;  // q5
    __m128i v12;  // q4
    __m128i v13;  // q5
    unsigned int v15;  // s0
    unsigned long long v16;  // x8
    unsigned long v17;  // x9
    unsigned int v19;  // x8
    unsigned int j;  // w10
    unsigned int v20;  // w10
    uint128_t *iter;  // x8
    unsigned int v22;  // q0
    __m128i v23;  // q1
    unsigned int v24;  // q2
    unsigned int k;  // w11
    unsigned int v26;  // w11
    __m128i v27;  // q3
    __m128i v28;  // q4
    __m128i v29;  // q3
    uint128_t *node;  // x8
    __m128i v30;  // q4
    unsigned int v32;  // s0
    unsigned long long v33;  // x8
    unsigned int v34;  // w9
    unsigned long v35;  // x9
    unsigned int v4;  // q0
    __m128i v5;  // q1
    __m128i v6;  // q2
    unsigned int v7;  // q3
    unsigned int i;  // w11
    unsigned int v9;  // w11

    v0 = a1 + 1;
    if (a3)
    {
        if (7 >= v0)
        {
            v1 = 0;
            j = 0;
        }
        else
        {
            j = v0 & 0xfffffff8;
            node = a0 + 16;
            v4 = 0;
            v5 = _mm_sub_epi32(_mm_setzero_si128(), CONCAT(a2 | a2 * 0x100000000, a2 | a2 * 0x100000000));
            v6 = _mm_set1_epi32(1);
            v7 = 0;
            i = j;
            do
            {
                v9 = i;
                v10 = __dirty_unsupported_Iop_Sh32Ux4(*(int128_t *)((char *)node - 16), v5);
                v11 = __dirty_unsupported_Iop_Sh32Ux4(*node, v5);
                v12 = _mm_add_epi32(v10, v6);
                v13 = _mm_add_epi32(v11, v6);
                *(uint128_t *)((char *)node - 16) = v12;
                *node = v13;
                v4 = (unsigned int)_mm_add_epi32(v12, v4);
                v7 = (unsigned int)_mm_add_epi32(v13, v7);
                node += 2;
                i = v9 - 8;
            } while (i);
            v15 = __dirty_unsupported_Iop_ZeroHI96ofV128(_mm_add_epi32(_mm_add_epi32(CatOddLanesV(_mm_unpackhi_epi64(_mm_add_epi32(v7, v4), _mm_add_epi32(v7, v4)), _mm_unpackhi_epi64(_mm_add_epi32(v7, v4), _mm_add_epi32(v7, v4))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_add_epi32(v7, v4), _mm_add_epi32(v7, v4)), _mm_unpackhi_epi64(_mm_add_epi32(v7, v4), _mm_add_epi32(v7, v4)))), _mm_add_epi32(CatOddLanesV(_mm_unpacklo_epi64(_mm_add_epi32(v7, v4), _mm_add_epi32(v7, v4)), _mm_unpacklo_epi64(_mm_add_epi32(v7, v4), _mm_add_epi32(v7, v4))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_add_epi32(v7, v4), _mm_add_epi32(v7, v4)), _mm_unpacklo_epi64(_mm_add_epi32(v7, v4), _mm_add_epi32(v7, v4))))));
            v1 = __float_as_int(v15);
            if (v0 == j)
                return __float_as_int(v15);
        }
        do
        {
            v16 = v1;
            v17 = ((unsigned int)(*(int *)((char *)a0 + 4 * j)) >> ((char)a2 & 31)) + 1;
            *(unsigned int *)((char *)a0 + 4 * j) = v17;
            j += 1;
            v1 = v17 + v16;
        } while (j <= a1);
        return v17 + v16;
    }
    else
    {
        if (8 > v0)
        {
            v19 = 0;
            v20 = 0;
        }
        else
        {
            v20 = v0 & 0xfffffff8;
            iter = a0 + 16;
            v22 = 0;
            v23 = _mm_sub_epi32(_mm_setzero_si128(), CONCAT(a2 | a2 * 0x100000000, a2 | a2 * 0x100000000));
            v24 = 0;
            k = v20;
            do
            {
                v26 = k;
                v27 = __dirty_unsupported_Iop_Sh32Ux4(*(int128_t *)((char *)iter - 16), v23);
                v28 = __dirty_unsupported_Iop_Sh32Ux4(*iter, v23);
                v29 = _mm_sub_epi32(v27, ~_mm_cmpeq_epi32(*(int128_t *)((char *)iter - 16), _mm_setzero_si128()));
                v30 = _mm_sub_epi32(v28, ~_mm_cmpeq_epi32(*iter, _mm_setzero_si128()));
                v22 = (unsigned int)_mm_add_epi32(v29, v22);
                v24 = (unsigned int)_mm_add_epi32(v30, v24);
                *(uint128_t *)((char *)iter - 16) = v29;
                *iter = v30;
                iter += 2;
                k = v26 - 8;
            } while (k);
            v32 = __dirty_unsupported_Iop_ZeroHI96ofV128(_mm_add_epi32(_mm_add_epi32(CatOddLanesV(_mm_unpackhi_epi64(_mm_add_epi32(v24, v22), _mm_add_epi32(v24, v22)), _mm_unpackhi_epi64(_mm_add_epi32(v24, v22), _mm_add_epi32(v24, v22))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_add_epi32(v24, v22), _mm_add_epi32(v24, v22)), _mm_unpackhi_epi64(_mm_add_epi32(v24, v22), _mm_add_epi32(v24, v22)))), _mm_add_epi32(CatOddLanesV(_mm_unpacklo_epi64(_mm_add_epi32(v24, v22), _mm_add_epi32(v24, v22)), _mm_unpacklo_epi64(_mm_add_epi32(v24, v22), _mm_add_epi32(v24, v22))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_add_epi32(v24, v22), _mm_add_epi32(v24, v22)), _mm_unpacklo_epi64(_mm_add_epi32(v24, v22), _mm_add_epi32(v24, v22))))));
            v19 = __float_as_int(v32);
            if (v0 == v20)
                return __float_as_int(v32);
        }
        do
        {
            v33 = v19;
            v34 = (unsigned int)(*(int *)((char *)a0 + 4 * v20)) >> ((char)a2 & 31);
            if (!*(int *)((char *)a0 + 4 * v20))
                v35 = v34;
            else
                v35 = v34 + 1;
        } while ((v19 = v35 + v33, *(unsigned int *)((char *)a0 + 4 * v20) = v35, v20 += 1, v20 <= a1));
        return v35 + v33;
    }
}
