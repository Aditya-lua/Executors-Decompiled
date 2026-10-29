/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7a930..0x7ac18 (744 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7a930_1 {
    char padding_0[480];
    char field_1e0;
    uint128_t field_1e1;
    char field_1ed;
    char field_1ee;
    char padding_1ef[2];
    uint128_t field_1f1;
} st_7a930_1;

typedef struct st_7a930_2 {
    char padding_0[8];
    char field_8;
} st_7a930_2;

typedef struct st_7a930_0 {
    char field_0;
} st_7a930_0;


unsigned long long sub_7a930(char *a0, unsigned long long a1, st_7a930_2 *a2, unsigned long long a3, unsigned int a4, long long a5, unsigned long a6)
{
    st_7a930_1 *v5;  // x0
    st_7a930_1 *v6;  // x4
    __m128i v15;  // q4
    uint128_t *iter;  // x12
    __m128i v17;  // q7
    unsigned long long i;  // x13
    unsigned long long v19;  // x13
    __m128i v20;  // q16
    __m128i v21;  // q17
    __m128i v22;  // q18
    __m128i v23;  // q19
    unsigned long v7;  // x8
    unsigned long long v25;  // x12
    unsigned long long v26;  // x10
    __m128i v27;  // q1
    unsigned int *v28;  // x13
    unsigned long long v29;  // x11
    __m128i v30;  // q3
    unsigned int *v32;  // x13
    unsigned long long v34;  // 4130
    unsigned long long v8;  // x10
    char *node;  // x9
    unsigned long long j;  // x8
    unsigned long long v37;  // x8
    char *v39;  // x8
    char *iter1;  // x10
    unsigned long long k;  // x11
    unsigned long long v42;  // x11
    char *v43;  // x8
    unsigned long long v9;  // x9
    char *v45;  // x22
    unsigned long long v46;  // x23
    unsigned long long v47;  // x0
    unsigned long long v48;  // 4106
    unsigned long long l;  // w8
    __m128i v10;  // q0
    unsigned long long v11;  // x11
    __m128i v12;  // q1
    __m128i v13;  // q2
    __m128i v14;  // q3
    st_7a930_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_7a930_0 *v1;  // [bp-0x50]
    unsigned long v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v2 = a6;
    v0 = &v1;
    v5 = sub_7ad24(a5, &v2, 4);
    if (748 > v2)
    {
        return 0xffffffffffffffff;
    }
    else if (a3 > 0xff)
    {
        return 0xffffffffffffffd2;
    }
    else
    {
        v6 = v5;
        v5->field_1e0 = 0;
        v7 = a4 + 1;
        if ((unsigned int)v7 >= 2)
        {
            if (5 > (unsigned int)v7)
            {
                v8 = 1;
            }
            else
            {
                v9 = v7 - 1;
                v10 = (__m128i)(CONCAT(v7 & 0xffffffff | (v7 & 0xffffffff) * 0x100000000, v7 & 0xffffffff | (v7 & 0xffffffff) * 0x100000000));
                if (33 > (unsigned int)v7)
                {
                    v11 = 0;
                    v8 = 1;
LABEL_7aa9c:
                    v25 = v9 & 0xfffffffffffffffc;
                    v26 = v25 | 1;
                    v27 = _mm_add_epi32(CONCAT(v8 & 0xffffffff | (v8 & 0xffffffff) * 0x100000000, v8 & 0xffffffff | (v8 & 0xffffffff) * 0x100000000), _mm_set_epi32(3, 2, 1, 0));
                    v28 = &v6->padding_0[v11 + 481];
                    v29 = v11 - v25;
                    do
                    {
                        v30 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn32to16x4(_mm_sub_epi32(v10, v27)));
                        v32 = v28 + 1;
                        *v28 = __dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_unpacklo_epi64(v30, v10), _mm_unpacklo_epi64(v30, v10)));
                        v27 = _mm_add_epi32(v27, _mm_set1_epi32(4));
                        v34 = arm64g_calculate_condition(18, v29, 4, 0);
                        v29 += 4;
                        v28 = v32;
                    } while (v34 & 1);
                    v8 = v26;
                    if (v9 == v25)
                        goto LABEL_7ab00;
                }
                else
                {
                    v11 = v9 & 0xffffffffffffffe0;
                    v8 = v11 | 1;
                    v12 = _mm_set_epi64x(68719476751, 60129542157);
                    v13 = _mm_set_epi64x(51539607563, 42949672969);
                    v14 = _mm_set_epi64x(34359738375, 25769803781);
                    v15 = _mm_set_epi64x(17179869187, 8589934593);
                    iter = &(&v6->field_1e0)[1];
                    v17 = _mm_set1_epi32(32);
                    i = v11;
                    do
                    {
                        v19 = i;
                        v20 = _mm_sub_epi32(v10, v15);
                        v21 = _mm_sub_epi32(v10, v14);
                        v22 = _mm_sub_epi32(v10, v13);
                        v23 = _mm_sub_epi32(v10, v12);
                        *iter = _mm_or_si128(_mm_and_si128(PermV(v23, _mm_and_si128(_mm_sub_epi8(_mm_set_epi8(60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_set_epi8(60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(v22, _mm_and_si128(_mm_sub_epi8(_mm_set_epi8(60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_set_epi8(60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(v21, _mm_and_si128(_mm_sub_epi8(_mm_set_epi8(60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_set_epi8(60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0), _mm_set1_epi8(16)))), _mm_and_si128(PermV(v20, _mm_and_si128(_mm_set_epi64x(4339275622475375648, 0x1c1814100c080400), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0))))));
                        iter[1] = _mm_or_si128(_mm_and_si128(PermV(_mm_sub_epi32(v23, _mm_set1_epi32(16)), _mm_and_si128(_mm_sub_epi8(_mm_set_epi8(60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_set_epi8(60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0), _mm_add_epi8(_mm_set1_epi8(16), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16)))))), _mm_or_si128(_mm_and_si128(PermV(_mm_sub_epi32(v22, _mm_set1_epi32(16)), _mm_and_si128(_mm_sub_epi8(_mm_set_epi8(60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_set_epi8(60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0), _mm_add_epi8(_mm_set1_epi8(16), _mm_set1_epi8(16))))), _mm_or_si128(_mm_and_si128(PermV(_mm_sub_epi32(v21, _mm_set1_epi32(16)), _mm_and_si128(_mm_sub_epi8(_mm_set_epi8(60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0), _mm_set1_epi8(16)), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_sub_epi8(_mm_set_epi8(60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0), _mm_set1_epi8(16)))), _mm_and_si128(PermV(_mm_sub_epi32(v20, _mm_set1_epi32(16)), _mm_and_si128(_mm_set_epi64x(4339275622475375648, 0x1c1814100c080400), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0))))));
                        iter += 2;
                        v15 = _mm_add_epi32(v15, v17);
                        v14 = _mm_add_epi32(v14, v17);
                        v13 = _mm_add_epi32(v13, v17);
                        v12 = _mm_add_epi32(v12, v17);
                        i = v19 - 32;
                    } while (i);
                    if (v9 == v11)
                        goto LABEL_7ab00;
                    if (v9 & 28)
                        goto LABEL_7aa9c;
                }
            }
            node = &(&v6->field_1e0)[v8];
            j = v7 - v8;
            do
            {
                v37 = j;
                *node = v37;
                node += 1;
                j = v37 - 1;
            } while (j);
        }
LABEL_7ab00:
        if (a3)
        {
            v39 = &a2->field_8;
            iter1 = &(&v6->field_1e0)[13];
            k = a3;
            do
            {
                v42 = k;
                v43 = v39 + 8;
                *iter1 = (&v6->field_1e0)[*v39];
                iter1 += 1;
                v39 = v43;
                k = v42 - 1;
            } while (k);
        }
        if (!a1)
            return 0xffffffffffffffba;
        v45 = &(&v6->field_1e0)[13];
        v46 = a3;
        v47 = sub_7c704(a0 + 1, a1 - 1, v45, v46);
        v48 = arm64g_calculate_condition(130, v47, 120, 0);
        if (v48 & 1)
            return v47;
        if (v47 >= 2 && a3 >> 1 > v47)
        {
            *a0 = v47;
            return v47 + 1;
        }
        if (a3 > 128)
        {
            return 0xffffffffffffffff;
        }
        else if ((a3 + 1 >> 1) + 1 > a1)
        {
            return 0xffffffffffffffba;
        }
        else
        {
            *a0 = (char)a3 + 127;
            v45[v46] = 0;
            if (!a3)
                return (a3 + 1 >> 1) + 1;
            l = 0;
            do
            {
                a0[1 + (l >> 1)] = v45[1 + l] + v45[l] * 16;
                l += 2;
            } while (l < a3);
            return (a3 + 1 >> 1) + 1;
        }
    }
}
