/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9a8c0..0xa9ac3c (892 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a9a8c0_1 {
    uint128_t field_0;
} st_a9a8c0_1;

typedef struct st_a9a8c0_2 {
    int field_0;
    char padding_4[4];
    struct st_a9a8c0_0 *field_8;
} st_a9a8c0_2;

typedef struct st_a9a8c0_0 {
    long long field_0;
    long long field_8;
    unsigned int field_10;
    int field_14;
    struct st_a9a8c0_1 *field_18;
} st_a9a8c0_0;


unsigned long long sub_a9a8c0(st_a9a8c0_2 *a0)
{
    st_a9a8c0_0 *v2;  // x9
    int v3;  // w8
    __m128i v12;  // q3
    __m128i v13;  // q4
    __m128i v14;  // q6
    uint128_t v15;  // q7
    __m128i v16;  // q16
    __m128i v17;  // q17
    __m128i v18;  // q20
    unsigned long long v19;  // q21
    unsigned long long v20;  // q19
    unsigned long long v21;  // q23
    long long v4;  // x0
    unsigned long long v22;  // q22
    unsigned long long v23;  // q26
    unsigned long long v24;  // q24
    unsigned long long i;  // x15
    uint128_t *iter;  // x16
    unsigned long long v27;  // x15
    __m128i v28;  // q28
    __m128i v29;  // q28
    __m128i v30;  // q31
    __m128i v31;  // q30
    unsigned long long v5;  // x8
    __m128i v32;  // q29
    __m128i v34;  // q0
    unsigned long v36;  // d0
    unsigned long long v37;  // x15
    unsigned long long v38;  // q0
    __m128i v39;  // q1
    uint128_t v40;  // q3
    __m128i v41;  // q2
    unsigned long long v6;  // x0
    __m128i v42;  // q3
    double *v43;  // x13
    unsigned long long v44;  // x14
    __m128i v45;  // q6
    uint128_t v46;  // q7
    __m128i v47;  // q16
    __m128i v48;  // q17
    unsigned long long v49;  // q18
    unsigned long long v50;  // q19
    __m128i v51;  // q20
    uint128_t *v7;  // x9
    __m128i v52;  // q20
    __m128i v53;  // q21
    unsigned long long v55;  // 4271
    __m128i v56;  // q0
    unsigned long v58;  // d0
    char *v59;  // x9
    unsigned long long j;  // x8
    unsigned int v61;  // w10
    unsigned long long v8;  // x10
    unsigned long long v62;  // x8
    unsigned long v65;  // x8
    unsigned long long v9;  // q0
    __m128i v10;  // q1
    __m128i v11;  // q2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_8;
    v3 = a0->field_0;
    if (1 >= v3)
    {
        if (v3)
        {
            if (v3 == 1)
            {
                v4 = v2->field_0;
                goto LABEL_a9a944;
            }
            else
            {
                return 0;
            }
        }
        v5 = v2->field_14;
        v6 = v5 * 0x100000;
        if ((int)v5 >= 1)
        {
            v7 = v2->field_18;
            if (8 > (unsigned int)v5)
            {
                v8 = 0;
            }
            else
            {
                if (16 > (unsigned int)v5)
                {
                    v8 = 0;
LABEL_a9a984:
                    v37 = v8;
                    v8 = v5 & 0x7ffffff8;
                    v38 = 0;
                    v39 = __double_as_longlong(__longlong_as_double(v6));
                    v40 = CONCAT(v37 & 0xffffffff | (v37 & 0xffffffff) * 0x100000000, v37 & 0xffffffff | (v37 & 0xffffffff) * 0x100000000);
                    v41 = _mm_or_si128(v40, _mm_set_epi64x(30064771078, 21474836484));
                    v42 = _mm_or_si128(v40, _mm_set_epi64x(12884901890, 0x100000000));
                    v43 = (char *)v7 + v37;
                    v44 = v37 - v8;
                    v45 = _mm_set1_epi32(3);
                    v46 = CONCAT(12297829386768001707, 12297829386768001707);
                    v47 = _mm_set1_epi32(24);
                    v48 = _mm_set1_epi32(8);
                    v49 = 0;
                    v50 = 0;
                    do
                    {
                        v51 = *(unsigned long long *)&*v43;
                        v43 += 1;
                        v52 = __dirty_unsupported_Iop_Sh32Ux4(_mm_and_si128(PermV(v51, _mm_and_si128(_mm_set_epi64x(0xffffff03ffffff02, 0xffffff01ffffff00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 3, -1, -1, -1, 2, -1, -1, -1, 1, -1, -1, -1, 0))), _mm_sub_epi32(_mm_mullo_epi32(v42, v45), _mm_mullo_epi32(_mm_srli_epi32(CatOddLanesV(MullV(_mm_extract_epi64(_mm_mullo_epi32(v42, v45), 1), (unsigned long long)(v46 >> 64)), MullV(_mm_cvtsi128_si64(_mm_mullo_epi32(v42, v45)), (unsigned long long)v46)), 4), v47)));
                        v53 = __dirty_unsupported_Iop_Sh32Ux4(_mm_and_si128(PermV(v51, _mm_and_si128(_mm_set_epi64x(0xffffff07ffffff06, 0xffffff05ffffff04), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 7, -1, -1, -1, 6, -1, -1, -1, 5, -1, -1, -1, 4))), _mm_sub_epi32(_mm_mullo_epi32(v41, v45), _mm_mullo_epi32(_mm_srli_epi32(CatOddLanesV(MullV(_mm_extract_epi64(_mm_mullo_epi32(v41, v45), 1), (unsigned long long)(v46 >> 64)), MullV(_mm_cvtsi128_si64(_mm_mullo_epi32(v41, v45)), (unsigned long long)v46)), 4), v47)));
                        v38 = (unsigned long long)_mm_xor_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v52), 32), v38);
                        v50 = (unsigned long long)_mm_xor_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v53), 32), v50);
                        v39 = _mm_xor_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v52), 32), v39);
                        v49 = (unsigned long long)_mm_xor_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v53), 32), v49);
                        v42 = _mm_add_epi32(v42, v48);
                        v41 = _mm_add_epi32(v41, v48);
                        v55 = arm64g_calculate_condition(18, v44, 8, 0);
                        v44 += 8;
                    } while (v55 & 1);
                    v56 = _mm_xor_si128(_mm_xor_si128(v50, v38), _mm_xor_si128(v49, v39));
                    v58 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_xor_si128(__dirty_unsupported_Iop_SliceV128(v56, v56, 8), v56));
                    v6 = __double_as_longlong(v58);
                    if (v8 == v5)
                    {
                        v65 = a0->field_0;
                        return __double_as_longlong(v58) & 0x3fffffff | (v65 * 0x40000000 | v65 >> 0x22) & 0xffffffffc0000000;
                    }
                }
                else
                {
                    v8 = v5 & 0x7ffffff0;
                    v9 = 0;
                    v10 = __double_as_longlong(__longlong_as_double(v6));
                    v11 = _mm_set_epi64x(64424509454, 55834574860);
                    v12 = _mm_set_epi64x(47244640266, 38654705672);
                    v13 = _mm_set_epi64x(30064771078, 21474836484);
                    v14 = _mm_set1_epi32(3);
                    v15 = CONCAT(12297829386768001707, 12297829386768001707);
                    v16 = _mm_set1_epi32(24);
                    v17 = _mm_set1_epi32(16);
                    v18 = _mm_set_epi64x(12884901890, 0x100000000);
                    v19 = 0;
                    v20 = 0;
                    v21 = 0;
                    v22 = 0;
                    v23 = 0;
                    v24 = 0;
                    i = v8;
                    iter = v7;
                    do
                    {
                        v27 = i;
                        v28 = *iter;
                        iter += 1;
                        v29 = __dirty_unsupported_Iop_Sh32Ux4(_mm_and_si128(PermV(v28, _mm_and_si128(_mm_set_epi64x(0xffffff03ffffff02, 0xffffff01ffffff00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 3, -1, -1, -1, 2, -1, -1, -1, 1, -1, -1, -1, 0))), _mm_sub_epi32(_mm_mullo_epi32(v18, v14), _mm_mullo_epi32(_mm_srli_epi32(CatOddLanesV(MullV(_mm_extract_epi64(_mm_mullo_epi32(v18, v14), 1), (unsigned long long)(v15 >> 64)), MullV(_mm_cvtsi128_si64(_mm_mullo_epi32(v18, v14)), (unsigned long long)v15)), 4), v16)));
                        v30 = __dirty_unsupported_Iop_Sh32Ux4(_mm_and_si128(PermV(v28, _mm_and_si128(_mm_set_epi64x(0xffffff07ffffff06, 0xffffff05ffffff04), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 7, -1, -1, -1, 6, -1, -1, -1, 5, -1, -1, -1, 4))), _mm_sub_epi32(_mm_mullo_epi32(v13, v14), _mm_mullo_epi32(_mm_srli_epi32(CatOddLanesV(MullV(_mm_extract_epi64(_mm_mullo_epi32(v13, v14), 1), (unsigned long long)(v15 >> 64)), MullV(_mm_cvtsi128_si64(_mm_mullo_epi32(v13, v14)), (unsigned long long)v15)), 4), v16)));
                        v31 = __dirty_unsupported_Iop_Sh32Ux4(_mm_and_si128(PermV(v28, _mm_and_si128(_mm_set_epi64x(0xffffff0bffffff0a, 0xffffff09ffffff08), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 11, -1, -1, -1, 10, -1, -1, -1, 9, -1, -1, -1, 8))), _mm_sub_epi32(_mm_mullo_epi32(v12, v14), _mm_mullo_epi32(_mm_srli_epi32(CatOddLanesV(MullV(_mm_extract_epi64(_mm_mullo_epi32(v12, v14), 1), (unsigned long long)(v15 >> 64)), MullV(_mm_cvtsi128_si64(_mm_mullo_epi32(v12, v14)), (unsigned long long)v15)), 4), v16)));
                        v32 = __dirty_unsupported_Iop_Sh32Ux4(_mm_and_si128(PermV(v28, _mm_and_si128(_mm_set_epi64x(0xffffff0fffffff0e, 0xffffff0dffffff0c), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 15, -1, -1, -1, 14, -1, -1, -1, 13, -1, -1, -1, 12))), _mm_sub_epi32(_mm_mullo_epi32(v11, v14), _mm_mullo_epi32(_mm_srli_epi32(CatOddLanesV(MullV(_mm_extract_epi64(_mm_mullo_epi32(v11, v14), 1), (unsigned long long)(v15 >> 64)), MullV(_mm_cvtsi128_si64(_mm_mullo_epi32(v11, v14)), (unsigned long long)v15)), 4), v16)));
                        v9 = (unsigned long long)_mm_xor_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v29), 32), v9);
                        v20 = (unsigned long long)_mm_xor_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v30), 32), v20);
                        v10 = _mm_xor_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v29), 32), v10);
                        v22 = (unsigned long long)_mm_xor_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v31), 32), v22);
                        v19 = (unsigned long long)_mm_xor_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v30), 32), v19);
                        v24 = (unsigned long long)_mm_xor_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v32), 32), v24);
                        v21 = (unsigned long long)_mm_xor_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v31), 32), v21);
                        v23 = (unsigned long long)_mm_xor_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v32), 32), v23);
                        v18 = _mm_add_epi32(v18, v17);
                        v13 = _mm_add_epi32(v13, v17);
                        v12 = _mm_add_epi32(v12, v17);
                        v11 = _mm_add_epi32(v11, v17);
                        i = v27 - 16;
                    } while (i);
                    v34 = _mm_xor_si128(_mm_xor_si128(_mm_xor_si128(v24, v20), _mm_xor_si128(v22, v9)), _mm_xor_si128(_mm_xor_si128(v23, v19), _mm_xor_si128(v21, v10)));
                    v36 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_xor_si128(__dirty_unsupported_Iop_SliceV128(v34, v34, 8), v34));
                    v6 = __double_as_longlong(v36);
                    if (v8 == v5)
                    {
                        v65 = a0->field_0;
                        return v6 & 0x3fffffff | (v65 * 0x40000000 | v65 >> 0x22) & 0xffffffffc0000000;
                    }
                    if (v5 >> 3 & 1)
                        goto LABEL_a9a984;
                }
            }
            v59 = (char *)v7 + v8;
            j = v5 - v8;
            v61 = (unsigned int)v8 * 3;
            do
            {
                v62 = j;
                v6 ^= *v59 << ((char)(v61 - 24 * v61 / 24) & 31);
                v61 += 3;
                v59 += 1;
                j = v62 - 1;
            } while (j);
        }
    }
    else if (v3 == 2)
    {
        v4 = v2->field_8;
LABEL_a9a944:
        v6 = sub_a66604(v4);
    }
    else if (v3 == 3)
    {
        v6 = v2->field_10;
    }
    else
    {
        return 0;
    }
    v65 = a0->field_0;
    return v6 & 0x3fffffff | (v65 * 0x40000000 | v65 >> 0x22) & 0xffffffffc0000000;
}
