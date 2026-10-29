/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c1e88..0x9c214c (708 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_9c1e88(unsigned long long a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v1;  // x8
    unsigned long long i;  // x1
    unsigned long long v11;  // x11
    uint128_t *iter;  // x12
    unsigned long long v13;  // q0
    unsigned long long v14;  // q4
    unsigned long long v15;  // q5
    unsigned long long v16;  // q7
    unsigned long long v17;  // q16
    unsigned long long v18;  // q18
    unsigned long long v19;  // q17
    unsigned long long v20;  // q19
    unsigned long long j;  // x13
    unsigned long long v22;  // x13
    __m128i v23;  // q20
    __m128i v24;  // q21
    uint128_t v26;  // q0
    unsigned long v28;  // d0
    unsigned long long v29;  // x14
    __m128i v30;  // q0
    unsigned int v4;  // w10
    unsigned int *v31;  // x12
    unsigned long long v32;  // x11
    unsigned int *v33;  // x12
    unsigned long long v35;  // 4121
    unsigned long v37;  // d0
    char *v38;  // x10
    unsigned long long k;  // x11
    unsigned long v40;  // x12
    unsigned long long l;  // x9
    unsigned long long v41;  // x8
    unsigned int v42;  // w11
    char *v43;  // x13
    unsigned long long v44;  // x9
    char *v45;  // x13
    unsigned int v46;  // w11
    unsigned long long v6;  // w11
    unsigned long long v7;  // w10
    unsigned long long v8;  // x10
    unsigned long long v9;  // w12
    unsigned long long v10;  // x13
    char v0[2];  // [bp-0x1a]

    *(char *[2])&v0[10] = v0 + 13;
    v1 = 0;
    *(long long *)&v0[2] = *(long long *)&g_10002b0;
    do
    {
        i = a1;
        v0[1 + v1] = i;
        v1 -= 1;
        a1 = i >> 8;
    } while (0xff < i);
    if (v1)
    {
        v4 = (unsigned int)i & 0xff;
        l = -v1;
        v6 = 0 > (char)v4;
        if (!a2)
        {
            v7 = 0;
        }
        else if (v4 > 128)
        {
            v7 = 0xff;
            v6 = 1;
        }
        else if (v4 == 128)
        {
            if (l >= 2)
            {
                v8 = ~v1;
                if (4 > v8)
                {
                    v9 = 0;
                    v10 = 1;
                }
                else if (32 > v8)
                {
                    v9 = 0;
                    v11 = 0;
LABEL_9c2048:
                    v29 = v8 & 0xfffffffffffffffc;
                    v30 = __float_as_int(__int_as_float(v9));
                    v10 = v29 | 1;
                    v31 = &(v0)[1 + 1 + v11 + v1];
                    v32 = v11 - v29;
                    do
                    {
                        v33 = v31 + 1;
                        v30 = _mm_or_si128(v30, _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *v31), 8)), 16));
                        v35 = arm64g_calculate_condition(18, v32, 4, 0);
                        v32 += 4;
                        v31 = v33;
                    } while (v35 & 1);
                    v37 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_or_si128(v30, __dirty_unsupported_Iop_SliceV128(v30, v30, 8)));
                    v9 = (unsigned int)__double_as_longlong(v37) | (unsigned int)(__double_as_longlong(v37) >> 32);
                    if (v8 == v29)
                        goto LABEL_9c20d0;
                }
                else
                {
                    iter = &(v0)[9 + 1 + v1];
                    v11 = v8 & 0xffffffffffffffe0;
                    v13 = 0;
                    v14 = 0;
                    v15 = 0;
                    v16 = 0;
                    v17 = 0;
                    v18 = 0;
                    v19 = 0;
                    v20 = 0;
                    j = v11;
                    do
                    {
                        v22 = j;
                        v23 = *(int128_t *)((char *)iter - 16);
                        v24 = *iter;
                        v15 = (unsigned long long)_mm_or_si128(v15, _mm_and_si128(PermV(v23, _mm_and_si128(_mm_set_epi64x(0xffffff0bffffff0a, 0xffffff09ffffff08), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 11, -1, -1, -1, 10, -1, -1, -1, 9, -1, -1, -1, 8))));
                        v14 = (unsigned long long)_mm_or_si128(v14, _mm_and_si128(PermV(v23, _mm_and_si128(_mm_set_epi64x(0xffffff07ffffff06, 0xffffff05ffffff04), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 7, -1, -1, -1, 6, -1, -1, -1, 5, -1, -1, -1, 4))));
                        v13 = (unsigned long long)_mm_or_si128(v13, _mm_and_si128(PermV(v23, _mm_and_si128(_mm_set_epi64x(0xffffff03ffffff02, 0xffffff01ffffff00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 3, -1, -1, -1, 2, -1, -1, -1, 1, -1, -1, -1, 0))));
                        v16 = (unsigned long long)_mm_or_si128(v16, _mm_and_si128(PermV(v23, _mm_and_si128(_mm_set_epi64x(0xffffff0fffffff0e, 0xffffff0dffffff0c), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 15, -1, -1, -1, 14, -1, -1, -1, 13, -1, -1, -1, 12))));
                        v19 = (unsigned long long)_mm_or_si128(v19, _mm_and_si128(PermV(v24, _mm_and_si128(_mm_set_epi64x(0xffffff0bffffff0a, 0xffffff09ffffff08), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 11, -1, -1, -1, 10, -1, -1, -1, 9, -1, -1, -1, 8))));
                        v18 = (unsigned long long)_mm_or_si128(v18, _mm_and_si128(PermV(v24, _mm_and_si128(_mm_set_epi64x(0xffffff07ffffff06, 0xffffff05ffffff04), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 7, -1, -1, -1, 6, -1, -1, -1, 5, -1, -1, -1, 4))));
                        v17 = (unsigned long long)_mm_or_si128(v17, _mm_and_si128(PermV(v24, _mm_and_si128(_mm_set_epi64x(0xffffff03ffffff02, 0xffffff01ffffff00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 3, -1, -1, -1, 2, -1, -1, -1, 1, -1, -1, -1, 0))));
                        v20 = (unsigned long long)_mm_or_si128(v20, _mm_and_si128(PermV(v24, _mm_and_si128(_mm_set_epi64x(0xffffff0fffffff0e, 0xffffff0dffffff0c), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 15, -1, -1, -1, 14, -1, -1, -1, 13, -1, -1, -1, 12))));
                        iter += 2;
                        j = v22 - 32;
                    } while (j);
                    v26 = v17 | v13 | v19 | v15 | v18 | v14 | v20 | v16;
                    v28 = __dirty_unsupported_Iop_ZeroHI64ofV128(v26 | __dirty_unsupported_Iop_SliceV128(v26, v26, 8));
                    v9 = (unsigned int)__double_as_longlong(v28) | (unsigned int)(__double_as_longlong(v28) >> 32);
                    if (v8 == v11)
                        goto LABEL_9c20d0;
                    if (v8 & 28)
                        goto LABEL_9c2048;
                    v10 = v11 | 1;
                }
                v38 = v10 + v1;
                k = v38 + 1;
                do
                {
                    v9 |= *(char *)(v0 + 1 + v38);
                    k += 1;
                    v38 += 1;
                } while (k != 1);
LABEL_9c20d0:
                v6 = v9 != 0;
            }
            else
            {
                v6 = 0;
            }
            v7 = (long long)(v6 * 0x80000000) >> 31 & 0xfffffffe | v6 & 1;
        }
        else
        {
            v6 = 0;
            v7 = 0xff;
        }
        v40 = v6;
        v41 = v40 - v1;
        if (a0)
        {
            *(char *)a0 = v7;
            v42 = v7 & 1;
            v43 = &v0[1];
            do
            {
                v44 = l;
                v45 = v43 - 1;
                v46 = v42 + (*v43 ^ v7 & 0xff);
                *(char *)(v40 + a0 - 1 + v44) = v46;
                v42 = v46 >> 8;
                l = v44 - 1;
                v43 = v45;
            } while (l);
        }
    }
    else
    {
        if (a0)
            *(char *)a0 = 0;
        v41 = 1;
    }
    if (*(long long *)&g_10002b0 == *(unsigned long long *)((void*)v0 + 2))
        return v41;
    ___stack_chk_fail();
}
