/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3cbc38..0x3cbd78 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_3cbc38(void* a0, void* a1, void* a2, unsigned long long a3)
{
    unsigned long v0;  // x8
    unsigned long long v1;  // x9
    __m128i v10;  // q4
    __m128i v11;  // q5
    uint128_t v12;  // q2
    __m128i v13;  // q2
    uint128_t v14;  // q3
    __m128i v15;  // q3
    unsigned long long v17;  // x13
    void* v18;  // x10
    void* v19;  // x11
    uint128_t *v2;  // x10
    void* iter;  // x12
    unsigned long long v21;  // x13
    void* v22;  // x10
    void* v23;  // x11
    __m128i v24;  // q2
    unsigned long v25;  // d1
    unsigned long long v27;  // 4142
    void* iter1;  // x10
    void* v29;  // x11
    uint128_t *iter2;  // x11
    void* v30;  // x12
    unsigned long long i;  // x8
    unsigned long long v32;  // x8
    void* v33;  // x12
    void* v34;  // x11
    uint128_t *node;  // x12
    uint128_t v5;  // q1
    unsigned long long j;  // x13
    unsigned long long v7;  // x13
    __m128i v8;  // q6
    __m128i v9;  // q7

    if (a3 < 1)
        return a0;
    v0 = a3;
    if (8 > a3)
    {
        v1 = 0;
    }
    else
    {
        v1 = 0;
        if (a0 - a1 >= 32 && a0 - a2 >= 32)
        {
            if (32 > a3)
            {
                v1 = 0;
LABEL_3cbd30:
                v17 = v1;
                v1 = v0 & 0x7ffffff8;
                v18 = a1 + v17;
                v19 = a2 + v17;
                iter = a0 + v17;
                v21 = v17 - v1;
                do
                {
                    v22 = v18 + 8;
                    v23 = v19 + 8;
                    v24 = _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *(unsigned long long *)&*(double *)v19), 8);
                    v25 = __dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_add_epi16(_mm_add_epi16(v24, MullV(*(unsigned long long *)&*(double *)v18, 0x303030303030303)), _mm_set1_epi16(2)), 2), _mm_srli_epi16(_mm_add_epi16(_mm_add_epi16(v24, MullV(*(unsigned long long *)&*(double *)v18, 0x303030303030303)), _mm_set1_epi16(2)), 2)));
                    *(unsigned long *)iter = v25;
                    iter += 8;
                    v27 = arm64g_calculate_condition(18, v21, 8, 0);
                    v18 = v22;
                    v19 = v23;
                    v21 += 8;
                } while (v27 & 1);
                if (v1 == v0)
                    return a0;
            }
            else
            {
                v1 = v0 & 0x7fffffe0;
                v2 = a1 + 16;
                iter2 = a2 + 16;
                node = a0 + 16;
                v5 = CONCAT(0x303030303030303, 0x303030303030303);
                j = v1;
                do
                {
                    v7 = j;
                    v8 = _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *(int128_t *)((char *)iter2 - 16)), 8);
                    v9 = _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *iter2), 8);
                    v10 = _mm_add_epi16(_mm_srli_epi16(_mm_unpackhi_epi8(_mm_setzero_si128(), *(int128_t *)((char *)iter2 - 16)), 8), MullV((long long)((uint128_t)(*(int128_t *)((char *)v2 - 16)) >> 64), (unsigned long long)(v5 >> 64)));
                    v11 = _mm_add_epi16(_mm_srli_epi16(_mm_unpackhi_epi8(_mm_setzero_si128(), *iter2), 8), MullV((unsigned long long)(*v2 >> 64), (unsigned long long)(v5 >> 64)));
                    v12 = __dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_add_epi16(_mm_add_epi16(v8, MullV((long long)*(int128_t *)((char *)v2 - 16), 0x303030303030303)), _mm_set1_epi16(2)), 2), _mm_srli_epi16(_mm_add_epi16(_mm_add_epi16(v8, MullV((long long)*(int128_t *)((char *)v2 - 16), 0x303030303030303)), _mm_set1_epi16(2)), 2)));
                    v13 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(v12), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi16(_mm_add_epi16(v10, _mm_set1_epi16(2)), 2), _mm_srli_epi16(_mm_add_epi16(v10, _mm_set1_epi16(2)), 2))));
                    v14 = __dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_add_epi16(_mm_add_epi16(v9, MullV((unsigned long long)*v2, 0x303030303030303)), _mm_set1_epi16(2)), 2), _mm_srli_epi16(_mm_add_epi16(_mm_add_epi16(v9, MullV((unsigned long long)*v2, 0x303030303030303)), _mm_set1_epi16(2)), 2)));
                    v15 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(v14), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi16(_mm_add_epi16(v11, _mm_set1_epi16(2)), 2), _mm_srli_epi16(_mm_add_epi16(v11, _mm_set1_epi16(2)), 2))));
                    *(uint128_t *)((char *)node - 16) = v13;
                    *node = v15;
                    v2 += 2;
                    iter2 += 2;
                    node += 2;
                    j = v7 - 32;
                } while (j);
                if (v1 == v0)
                    return a0;
                if (v0 & 24)
                    goto LABEL_3cbd30;
            }
        }
    }
    iter1 = a0 + v1;
    v29 = a2 + v1;
    v30 = a1 + v1;
    i = v0 - v1;
    do
    {
        v32 = i;
        v33 = v30 + 1;
        v34 = v29 + 1;
        *(char *)iter1 = *(char *)v29 + *(char *)v30 * 3 + 2 >> 2;
        iter1 += 1;
        i = v32 - 1;
        v29 = v34;
        v30 = v33;
    } while (i);
    return a0;
}
