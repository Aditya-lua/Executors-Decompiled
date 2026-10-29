/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d10fc..0x3d12cc (464 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d10fc_0 {
    char field_0;
    char field_1;
    uint128_t field_2;
    uint128_t field_12;
} st_3d10fc_0;


st_3d10fc_0 * sub_3d10fc(st_3d10fc_0 *a0, void* a1, unsigned long a2, unsigned long long a3)
{
    unsigned int v0;  // w9
    unsigned long v1;  // x8
    __m128i v10;  // q2
    __m128i v12;  // q6
    __m128i v13;  // q2
    __m128i v15;  // q7
    unsigned long long v17;  // x12
    unsigned long long v18;  // x11
    unsigned long long *iter;  // x13
    unsigned long v2;  // x9
    uint128_t *iter1;  // x14
    unsigned long long v21;  // x10
    __m128i v22;  // q2
    __m128i v23;  // q1
    __m128i v24;  // q1
    __m128i v25;  // q3
    __m128i v26;  // q2
    unsigned long long v28;  // 4160
    unsigned long long i;  // x9
    unsigned long long v3;  // x10
    void* v30;  // x10
    char *iter2;  // x11
    unsigned long long v32;  // x9
    unsigned int v33;  // w12
    void* v34;  // x10
    unsigned int v36;  // w9
    st_3d10fc_0 *v37;  // x9
    uint128_t *node;  // x11
    uint128_t *v5;  // x12
    unsigned long long j;  // x13
    unsigned long long v7;  // x13
    __m128i v8;  // q3
    __m128i v9;  // q4

    v0 = *(char *)a1;
    v1 = a3 - 1;
    if (a3 == 1)
    {
        a0->field_1 = v0;
        a0->field_0 = v0;
        return a0;
    }
    a0->field_0 = v0;
    a0->field_1 = (char)a1[1] + v0 * 3 + 2 >> 2;
    if (a3 >= 3)
    {
        v2 = v1 - 1;
        if (v2 < 8 || a1 + a3 > &(&a0->field_1)[1] && &(&a0->field_0)[2 * v1] > a1)
        {
            v18 = 1;
        }
        else if (16 > v2)
        {
            v3 = 0;
LABEL_3d11f0:
            v17 = v2 & 0xfffffffffffffff8;
            v18 = v17 | 1;
            iter = v3 + a1 + 2;
            iter1 = &(&a0->field_0)[2 * v3 + 2];
            v21 = v3 - v17;
            do
            {
                v22 = _mm_add_epi16(_mm_set1_epi16(2), MullV(*(unsigned long long *)&*(double *)((char *)iter - 1), 0x303030303030303));
                v23 = *(unsigned long long *)&*(double *)((char *)iter - 2);
                v24 = _mm_srli_epi16(_mm_add_epi16(v22, _mm_srli_epi16(_mm_unpacklo_epi8(v23, v23), 8)), 2);
                v25 = *(unsigned long long *)&*(double *)iter;
                iter += 1;
                v26 = _mm_srli_epi16(_mm_add_epi16(v22, _mm_srli_epi16(_mm_unpacklo_epi8(v25, v25), 8)), 2);
                *iter1 = CatEvenLanesV(_mm_unpackhi_epi16(v24, v26), _mm_unpacklo_epi16(v24, v26));
                iter1 += 1;
                v28 = arm64g_calculate_condition(18, v21, 8, 0);
                v21 += 8;
            } while (v28 & 1);
            if (v2 == v17)
                goto LABEL_3d11a8;
        }
        else
        {
            v3 = v2 & 0xfffffffffffffff0;
            node = a1 + 2;
            v5 = &(&a0->field_1)[1];
            j = v3;
            do
            {
                v7 = j;
                v8 = _mm_add_epi16(_mm_set1_epi16(2), MullV((long long)*(int128_t *)((char *)node - 1), 0x303030303030303));
                v9 = _mm_add_epi16(_mm_set1_epi16(2), MullV((long long)((uint128_t)(*(int128_t *)((char *)node - 1)) >> 64), 0x303030303030303));
                v10 = *(int128_t *)((char *)node - 2);
                v12 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_add_epi16(v8, _mm_srli_epi16(_mm_unpacklo_epi8(v10, v10), 8)), 2), _mm_srli_epi16(_mm_add_epi16(v8, _mm_srli_epi16(_mm_unpacklo_epi8(v10, v10), 8)), 2)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi16(_mm_add_epi16(v9, _mm_srli_epi16(_mm_unpackhi_epi8(v10, v10), 8)), 2), _mm_srli_epi16(_mm_add_epi16(v9, _mm_srli_epi16(_mm_unpackhi_epi8(v10, v10), 8)), 2))));
                v13 = *node;
                node += 1;
                v15 = _mm_or_si128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_add_epi16(v8, _mm_srli_epi16(_mm_unpacklo_epi8(v13, v13), 8)), 2), _mm_srli_epi16(_mm_add_epi16(v8, _mm_srli_epi16(_mm_unpacklo_epi8(v13, v13), 8)), 2)))), _mm_unpacklo_epi64(_mm_setzero_si128(), CatEvenLanesV(_mm_srli_epi16(_mm_add_epi16(v9, _mm_srli_epi16(_mm_unpackhi_epi8(v13, v13), 8)), 2), _mm_srli_epi16(_mm_add_epi16(v9, _mm_srli_epi16(_mm_unpackhi_epi8(v13, v13), 8)), 2))));
                v5[1] = _mm_unpackhi_epi8(v12, v15);
                *v5 = _mm_unpacklo_epi8(v12, v15);
                v5 += 2;
                j = v7 - 16;
            } while (j);
            if (v2 == v3)
                goto LABEL_3d11a8;
            if (v2 >> 3 & 1)
                goto LABEL_3d11f0;
            v18 = v3 | 1;
        }
        i = v1 - v18;
        v30 = a1 + v18;
        iter2 = &(&a0->field_1)[2 * v18];
        do
        {
            v32 = i;
            v33 = *(char *)v30 * 3 + 2;
            *(iter2 - 1) = v33 + *((char *)v30 - 1) >> 2;
            v34 = v30 + 1;
            *iter2 = v33 + (char)v30[1] >> 2;
            iter2 += 2;
            i = v32 - 1;
            v30 = v34;
        } while (i);
LABEL_3d11a8:
        v36 = (unsigned int)v1 * 2;
    }
    else
    {
        v36 = 2;
    }
    v37 = &(&a0->field_0)[v36];
    v37->field_0 = *((char *)a1 + v1) + *((char *)a1 + a3 - 2) * 3 + 2 >> 2;
    v37->field_1 = *((char *)a1 + v1);
    return a0;
}
