/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c13d0..0x9c1674 (676 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char _NSHomeDirectory;

unsigned long long sub_9c13d0(unsigned long long a0, unsigned long long a1, void* a2, unsigned long a3)
{
    unsigned long long v2;  // w8
    unsigned long long v3;  // w9
    unsigned long long v12;  // q4
    unsigned long long v13;  // q5
    unsigned long long v14;  // q7
    unsigned long long v15;  // q16
    unsigned long long v16;  // q18
    unsigned long long v17;  // q17
    unsigned long long v18;  // q19
    unsigned long long v19;  // x13
    unsigned long long v20;  // x13
    __m128i v21;  // q20
    unsigned long long v4;  // x10
    __m128i v22;  // q21
    uint128_t v24;  // q0
    unsigned long v26;  // d0
    unsigned long long v27;  // x14
    __m128i v28;  // q0
    unsigned int *v29;  // x12
    unsigned long long v30;  // x11
    unsigned long long v5;  // w8
    unsigned long long v33;  // 4121
    unsigned long v35;  // d0
    unsigned long long v36;  // x10
    void* v37;  // x11
    unsigned long long v38;  // x10
    unsigned long long v41;  // x12
    unsigned long long v6;  // w11
    unsigned int v43;  // w11
    char *v44;  // x9
    unsigned long long i;  // x12
    unsigned long long v46;  // x12
    unsigned int v48;  // w11
    unsigned long long v7;  // w12
    unsigned long long v8;  // x13
    unsigned long long v9;  // x11
    uint128_t *iter;  // x12
    unsigned long long v11;  // q0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a3)
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/a_int.c", 160, "c2i_ibuf");
        sub_a36abc(13, 222, 0);
        return 0;
    }
    v2 = *(char *)a2;
    v3 = v2 & 128;
    if (a1)
        *(unsigned int *)a1 = v3;
    v4 = a3 - 1;
    if (a3 != 1)
    {
        switch (v6)
        {
        case 0:
LABEL_9c15d4:
            if (v3 == ((char)a2[1] & 128))
            {
                sub_a368c8();
                sub_a369bc("crypto/asn1/a_int.c", 193, "c2i_ibuf");
                sub_a36abc(13, 0xdd, 0);
                return 0;
            }
            v41 = 0xffffffffffffffff + a3;
            if (!a0)
                return 0xffffffffffffffff + a3;
        case 255:
            if (5 > a3)
            {
                v7 = 0;
                v8 = 1;
            }
            else
            {
                if (33 > a3)
                {
                    v7 = 0;
                    v9 = 0;
LABEL_9c1560:
                    v27 = v4 & 0xfffffffffffffffc;
                    v8 = v27 | 1;
                    v28 = __float_as_int(__int_as_float(v7));
                    v29 = v9 + a2 + 1;
                    v30 = v9 - v27;
                    do
                    {
                        v28 = _mm_or_si128(v28, _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *v29), 8)), 16));
                        v33 = arm64g_calculate_condition(18, v30, 4, 0);
                        v30 += 4;
                        v29 += 1;
                    } while (v33 & 1);
                    v35 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_or_si128(v28, __dirty_unsupported_Iop_SliceV128(v28, v28, 8)));
                    v7 = (unsigned int)__double_as_longlong(v35) | (unsigned int)(__double_as_longlong(v35) >> 32);
                    if (v4 == v27)
                        goto LABEL_9c15d0;
                }
                else
                {
                    v9 = v4 & 0xffffffffffffffe0;
                    iter = a2 + 0x11;
                    v11 = 0;
                    v12 = 0;
                    v13 = 0;
                    v14 = 0;
                    v15 = 0;
                    v16 = 0;
                    v17 = 0;
                    v18 = 0;
                    v19 = v9;
                    do
                    {
                        v20 = v19;
                        v21 = *(int128_t *)((char *)iter - 16);
                        v22 = *iter;
                        v13 = (unsigned long long)_mm_or_si128(v13, _mm_and_si128(PermV(v21, _mm_and_si128(_mm_set_epi64x(0xffffff0bffffff0a, 0xffffff09ffffff08), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 11, -1, -1, -1, 10, -1, -1, -1, 9, -1, -1, -1, 8))));
                        v12 = (unsigned long long)_mm_or_si128(v12, _mm_and_si128(PermV(v21, _mm_and_si128(_mm_set_epi64x(0xffffff07ffffff06, 0xffffff05ffffff04), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 7, -1, -1, -1, 6, -1, -1, -1, 5, -1, -1, -1, 4))));
                        v11 = (unsigned long long)_mm_or_si128(v11, _mm_and_si128(PermV(v21, _mm_and_si128(_mm_set_epi64x(0xffffff03ffffff02, 0xffffff01ffffff00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 3, -1, -1, -1, 2, -1, -1, -1, 1, -1, -1, -1, 0))));
                        v14 = (unsigned long long)_mm_or_si128(v14, _mm_and_si128(PermV(v21, _mm_and_si128(_mm_set_epi64x(0xffffff0fffffff0e, 0xffffff0dffffff0c), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 15, -1, -1, -1, 14, -1, -1, -1, 13, -1, -1, -1, 12))));
                        v17 = (unsigned long long)_mm_or_si128(v17, _mm_and_si128(PermV(v22, _mm_and_si128(_mm_set_epi64x(0xffffff0bffffff0a, 0xffffff09ffffff08), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 11, -1, -1, -1, 10, -1, -1, -1, 9, -1, -1, -1, 8))));
                        v16 = (unsigned long long)_mm_or_si128(v16, _mm_and_si128(PermV(v22, _mm_and_si128(_mm_set_epi64x(0xffffff07ffffff06, 0xffffff05ffffff04), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 7, -1, -1, -1, 6, -1, -1, -1, 5, -1, -1, -1, 4))));
                        v15 = (unsigned long long)_mm_or_si128(v15, _mm_and_si128(PermV(v22, _mm_and_si128(_mm_set_epi64x(0xffffff03ffffff02, 0xffffff01ffffff00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 3, -1, -1, -1, 2, -1, -1, -1, 1, -1, -1, -1, 0))));
                        v18 = (unsigned long long)_mm_or_si128(v18, _mm_and_si128(PermV(v22, _mm_and_si128(_mm_set_epi64x(0xffffff0fffffff0e, 0xffffff0dffffff0c), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 15, -1, -1, -1, 14, -1, -1, -1, 13, -1, -1, -1, 12))));
                        iter += 2;
                        v19 = v20 - 32;
                    } while (v19);
                    v24 = v15 | v11 | v17 | v13 | v16 | v12 | v18 | v14;
                    v26 = __dirty_unsupported_Iop_ZeroHI64ofV128(v24 | __dirty_unsupported_Iop_SliceV128(v24, v24, 8));
                    v7 = (unsigned int)__double_as_longlong(v26) | (unsigned int)(__double_as_longlong(v26) >> 32);
                    if (v4 == v9)
                        goto LABEL_9c15d0;
                    if (v4 & 28)
                        goto LABEL_9c1560;
                    v8 = v9 | 1;
                }
            }
            v36 = a3 - v8;
            v37 = a2 + v8;
            do
            {
                v38 = v36;
                v7 |= *(char *)v37;
                v36 = v38 - 1;
                v37 += 1;
            } while (v36);
LABEL_9c15d0:
            if (!v7)
                goto LABEL_9c160c;
            else
                goto LABEL_9c15d4;
        default:
LABEL_9c160c:
            v41 = 0 + a3;
            if (!a0)
                return 0 + a3;
        }
        if (!v41)
            return 0;
        v43 = v2 >> 7;
        v44 = a3 + a2 - 1;
        i = v41;
        do
        {
            v46 = i;
            v48 = v43 + (*v44 ^ ((long long)(v2 * &_NSHomeDirectory) >> 31 & 0xfffffffe | (v2 * 0x2000000 | v2 >> 7) & 4261412865 & 1) & 0xff);
            *(char *)(a0 - 1 + v46) = v48;
            v43 = v48 >> 8;
            v44 -= 1;
            i = v46 - 1;
        } while (i);
        return v41;
    }
    else if (a0)
    {
        v5 = *(char *)a2;
        if (v3)
            v5 = -v5;
        *(char *)a0 = v5;
        return 1;
    }
    else
    {
        return 1;
    }
}
