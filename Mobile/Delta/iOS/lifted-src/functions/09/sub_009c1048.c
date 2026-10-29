/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c1048..0x9c12b0 (616 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c1048_1 {
    unsigned int field_0;
    char padding_4[1];
    char field_5;
    char padding_6[2];
    struct st_9c1048_0 *field_8;
} st_9c1048_1;

typedef struct st_9c1048_0 {
    char field_0;
    uint128_t field_1;
    uint128_t field_11;
} st_9c1048_0;

extern unsigned int g_fffffffffffffffc;

char sub_9c1048(st_9c1048_1 *a0, char a1)
{
    st_9c1048_0 *v0;  // x9
    unsigned int v1;  // w8
    unsigned long v4;  // cc_dep2
    unsigned long v5;  // cc_ndep
    unsigned long long v6;  // 4112
    unsigned long long v7;  // 4102
    unsigned long v8;  // cc_op
    unsigned long v9;  // cc_dep1
    char k;  // x8
    char v11;  // x11
    char v12;  // w10
    char v13;  // x0
    char v14;  // w10
    char v15;  // w11
    unsigned int v16;  // w10
    char v17;  // w12
    char v18;  // x13
    char v19;  // x10
    char v20;  // x11
    uint128_t *iter;  // x12
    char v22;  // q0
    char v23;  // q4
    char v24;  // q5
    char v25;  // q7
    char v26;  // q16
    char v27;  // q18
    char v28;  // q17
    char v29;  // q19
    unsigned long long i;  // x13
    unsigned long long v31;  // x13
    __m128i v32;  // q20
    __m128i v33;  // q21
    uint128_t v35;  // q0
    unsigned long v37;  // d0
    char v38;  // x14
    __m128i v39;  // q0
    unsigned int *v40;  // x12
    unsigned long long v41;  // x11
    unsigned int *v42;  // x12
    unsigned long long v44;  // 4121
    unsigned long v46;  // d0
    unsigned long long j;  // x10
    unsigned long long v2;  // 4112
    char *v48;  // x11
    char v49;  // x10
    char *v50;  // x11
    char v52;  // x13
    unsigned int v53;  // w12
    unsigned long long v3;  // 4102
    char v54;  // x8
    unsigned int v55;  // w12

    v0 = a0->field_8;
    v1 = a0->field_0;
    if (v0)
    {
        v2 = arm64g_calculate_condition(v8 | 16, v9, v4, v5);
        v3 = arm64g_calculate_condition(19, (v2 & 1 ? v1 : 0x40000000), 0, 0);
        if (v3 & 1)
            goto LABEL_9c1074;
LABEL_9c105c:
        k = 0;
        v11 = 0;
        v12 = 0;
        v13 = 1;
        if (!a1)
            return 1;
    }
    else
    {
        v6 = arm64g_calculate_condition(v8 | 16, v9, v4, v5);
        v7 = arm64g_calculate_condition(16, (v6 & 1 ? v1 : 0x40000000), 0, 0);
        if (!(v7 & 1))
            goto LABEL_9c105c;
LABEL_9c1074:
        k = v1;
        v14 = v0->field_0;
        v15 = 0 > v14;
        if (!(a0->field_5 & 1))
        {
            v12 = 0;
        }
        else
        {
            v16 = v14 & 0xff;
            if (v16 > 128)
            {
                v12 = 0xff;
                v15 = 1;
            }
            else if (v16 == 128)
            {
                if (k >= 2)
                {
                    if (5 > k)
                    {
                        v17 = 0;
                        v18 = 1;
                    }
                    else
                    {
                        v19 = k - 1;
                        if (33 > k)
                        {
                            v17 = 0;
                            v20 = 0;
LABEL_9c11d8:
                            v38 = v19 & &g_fffffffffffffffc;
                            v18 = v38 | 1;
                            v39 = __float_as_int(__int_as_float(v17));
                            v40 = &(&v0->field_0)[v20 + 1];
                            v41 = v20 - v38;
                            do
                            {
                                v42 = v40 + 1;
                                v39 = _mm_or_si128(v39, _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *v40), 8)), 16));
                                v44 = arm64g_calculate_condition(18, v41, 4, 0);
                                v41 += 4;
                                v40 = v42;
                            } while (v44 & 1);
                            v46 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_or_si128(v39, __dirty_unsupported_Iop_SliceV128(v39, v39, 8)));
                            v17 = (unsigned int)__double_as_longlong(v46) | (unsigned int)(__double_as_longlong(v46) >> 32);
                            if (v19 == v38)
                                goto LABEL_9c1248;
                        }
                        else
                        {
                            v20 = v19 & 0xffffffffffffffe0;
                            iter = (char *)&v0->field_1 + 1;
                            v22 = 0;
                            v23 = 0;
                            v24 = 0;
                            v25 = 0;
                            v26 = 0;
                            v27 = 0;
                            v28 = 0;
                            v29 = 0;
                            i = v20;
                            do
                            {
                                v31 = i;
                                v32 = *(int128_t *)((char *)iter - 16);
                                v33 = *iter;
                                v24 = (char)_mm_or_si128(v24, _mm_and_si128(PermV(v32, _mm_and_si128(_mm_set_epi64x(0xffffff0bffffff0a, 0xffffff09ffffff08), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 11, -1, -1, -1, 10, -1, -1, -1, 9, -1, -1, -1, 8))));
                                v23 = (char)_mm_or_si128(v23, _mm_and_si128(PermV(v32, _mm_and_si128(_mm_set_epi64x(0xffffff07ffffff06, 0xffffff05ffffff04), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 7, -1, -1, -1, 6, -1, -1, -1, 5, -1, -1, -1, 4))));
                                v22 = (char)_mm_or_si128(v22, _mm_and_si128(PermV(v32, _mm_and_si128(_mm_set_epi64x(0xffffff03ffffff02, 0xffffff01ffffff00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 3, -1, -1, -1, 2, -1, -1, -1, 1, -1, -1, -1, 0))));
                                v25 = (char)_mm_or_si128(v25, _mm_and_si128(PermV(v32, _mm_and_si128(_mm_set_epi64x(0xffffff0fffffff0e, 0xffffff0dffffff0c), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 15, -1, -1, -1, 14, -1, -1, -1, 13, -1, -1, -1, 12))));
                                v28 = (char)_mm_or_si128(v28, _mm_and_si128(PermV(v33, _mm_and_si128(_mm_set_epi64x(0xffffff0bffffff0a, 0xffffff09ffffff08), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 11, -1, -1, -1, 10, -1, -1, -1, 9, -1, -1, -1, 8))));
                                v27 = (char)_mm_or_si128(v27, _mm_and_si128(PermV(v33, _mm_and_si128(_mm_set_epi64x(0xffffff07ffffff06, 0xffffff05ffffff04), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 7, -1, -1, -1, 6, -1, -1, -1, 5, -1, -1, -1, 4))));
                                v26 = (char)_mm_or_si128(v26, _mm_and_si128(PermV(v33, _mm_and_si128(_mm_set_epi64x(0xffffff03ffffff02, 0xffffff01ffffff00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 3, -1, -1, -1, 2, -1, -1, -1, 1, -1, -1, -1, 0))));
                                v29 = (char)_mm_or_si128(v29, _mm_and_si128(PermV(v33, _mm_and_si128(_mm_set_epi64x(0xffffff0fffffff0e, 0xffffff0dffffff0c), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 15, -1, -1, -1, 14, -1, -1, -1, 13, -1, -1, -1, 12))));
                                iter += 2;
                                i = v31 - 32;
                            } while (i);
                            v35 = v26 | v22 | v28 | v24 | v27 | v23 | v29 | v25;
                            v37 = __dirty_unsupported_Iop_ZeroHI64ofV128(v35 | __dirty_unsupported_Iop_SliceV128(v35, v35, 8));
                            v17 = (unsigned int)__double_as_longlong(v37) | (unsigned int)(__double_as_longlong(v37) >> 32);
                            if (v19 == v20)
                                goto LABEL_9c1248;
                            if (v19 & 28)
                                goto LABEL_9c11d8;
                            v18 = v20 | 1;
                        }
                    }
                    j = k - v18;
                    v48 = &(&v0->field_0)[v18];
                    do
                    {
                        v49 = j;
                        v50 = v48 + 1;
                        v17 |= *v48;
                        j = v49 - 1;
                        v48 = v50;
                    } while (j);
LABEL_9c1248:
                    v15 = v17 != 0;
                }
                else
                {
                    v15 = 0;
                }
                v12 = (int)(v15 * 0x80000000) >> 31 & 0xfffffffe | v15 & 1;
            }
            else
            {
                v15 = 0;
                v12 = 0xff;
            }
        }
        v11 = v15;
        v13 = v11 + k;
        if (!a1)
            return v11 + k;
    }
    v52 = *(long long *)a1;
    if (!v52)
        return v13;
    *(char *)v52 = v12;
    if (k)
    {
        v53 = v12 & 1;
        do
        {
            v54 = k;
            v55 = v53 + (*(&(&v0->field_0)[v54] - 1) ^ v12 & 0xff);
            *(char *)(v11 + v52 - 1 + v54) = v55;
            v53 = v55 >> 8;
            k = v54 - 1;
        } while (k);
    }
    *(long long *)a1 = *(long long *)a1 + v13;
    return v13;
}
