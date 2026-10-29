/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x76818..0x76b3c (804 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_76818_1 {
    char field_0;
    unsigned long long field_1;
} st_76818_1;

typedef struct st_76818_2 {
    unsigned int field_0;
    unsigned int field_4;
} st_76818_2;

typedef struct st_76818_0 {
    char field_0;
} st_76818_0;


unsigned long long sub_76818(void* a0, unsigned long long a1, st_76818_2 *ptr, unsigned int *a3, unsigned int *a4, st_76818_1 *a5, unsigned long long a6, long long a7)
{
    unsigned long v4;  // x9
    unsigned long long v5;  // x19
    unsigned long long v14;  // x13
    unsigned long long v15;  // 4110
    unsigned long long v16;  // 4102
    unsigned long long v17;  // 4110
    unsigned long long v18;  // 4102
    unsigned long long v19;  // x11
    unsigned long long j;  // x12
    unsigned long long v21;  // x13
    uint128_t *iter;  // x14
    __m128i v23;  // q0
    unsigned int *v6;  // x22
    uint128_t *v24;  // x15
    __m128i v25;  // q2
    __m128i v26;  // q3
    __m128i v27;  // q4
    void* v28;  // x15
    __m128i v29;  // q3
    __m128i v30;  // q4
    unsigned long long k;  // x14
    unsigned long long i;  // x13
    void* node;  // x15
    void* v7;  // x23
    __m128i v34;  // q1
    __m128i v35;  // q2
    __m128i v36;  // q3
    char *v37;  // x10
    void* v38;  // x12
    unsigned long long v40;  // x11
    unsigned long long v41;  // w8
    unsigned int v42;  // w12
    unsigned long idx;  // x13
    unsigned long long v8;  // x0
    unsigned long long v44;  // 4118
    unsigned int v45;  // w11
    unsigned int v46;  // w11
    unsigned int v47;  // w8
    unsigned int v48;  // w8
    unsigned long v49;  // x10
    unsigned long long v9;  // 4114
    unsigned long long v10;  // x12
    unsigned long v11;  // cc_dep1
    unsigned long long *v12;  // x10
    unsigned long long v13;  // x11
    st_76818_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_76818_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    long long v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a6)
        return 0xffffffffffffffb8;
    v4 = a5->field_0;
    v5 = v4 & 0xff;
    if (!(v4 >> 31 & 1))
    {
        if (a6 <= v5)
            return 0xffffffffffffffb8;
        v6 = a4;
        v7 = a0;
        v8 = sub_77038(a0, a1 - 1, &(&a5->field_0)[1], v5, 6, a7, v3, 0);
        v9 = arm64g_calculate_condition(130, v8, 120, 0);
        if (v9 & 1)
            return v8;
        memset(ptr, 0, 52);
        if (v8)
            goto LABEL_768b4;
    }
    else
    {
        if (a6 <= v5 - 126 >> 1)
            return 0xffffffffffffffb8;
        v8 = v5 - 127;
        if (a1 > v8)
        {
            if (v8)
            {
                v10 = v5 - 128;
                v11 = v10;
                if (v10 >= 14)
                {
                    v12 = &(&a5->field_0)[1];
                    v13 = v10 >> 1;
                    v14 = a0 + (v5 & 126) + 2;
                    if (a0 < &(&a5->field_0)[v13 + 2])
                    {
                        v15 = arm64g_calculate_condition(132, v11, 14, 0);
                        v16 = arm64g_calculate_condition(52, (v15 & 1 ? v12 : 0x20000000), (v15 & 1 ? v14 : 0), 0);
                        if (!(v16 & 1))
                            goto LABEL_769c4;
                        goto LABEL_769e0;
                    }
                    else
                    {
                        v17 = arm64g_calculate_condition(132, v11, 14, 0);
                        v18 = arm64g_calculate_condition(48, (v17 & 1 ? v12 : 0x20000000), (v17 & 1 ? v14 : 0), 0);
                        if (v18 & 1)
                            goto LABEL_769e0;
LABEL_769c4:
                        v19 = v13 + 1;
                        if (62 > v10)
                        {
                            j = 0;
                            goto LABEL_76ad4;
                        }
                        v21 = 0;
                        j = v19 & 96;
                        iter = a0 + 32;
                        v23 = _mm_set1_epi32(0xf0f0f0f);
                        do
                        {
                            v24 = (char *)v12 + (v21 & 0x7fffffffffffffe0);
                            v25 = v24[1];
                            v26 = ShrNV(*v24, 4);
                            v27 = _mm_and_si128(*v24, v23);
                            v28 = (char *)iter - 32;
                            *(__m128i *)&v28[16] = _mm_unpackhi_epi8(v26, v27);
                            *(__m128i *)v28 = _mm_unpacklo_epi8(v26, v27);
                            v29 = ShrNV(v25, 4);
                            v30 = _mm_and_si128(v25, v23);
                            iter[1] = _mm_unpackhi_epi8(v29, v30);
                            *iter = _mm_unpacklo_epi8(v29, v30);
                            v21 += 32;
                            iter += 4;
                        } while (j != v21);
                        if (v19 == j)
                            goto LABEL_76b14;
                        if (v19 & 24)
                        {
LABEL_76ad4:
                            k = v19 & 120;
                            i = k * 2;
                            node = a0 + j * 2;
                            do
                            {
                                v34 = *(long long *)((char *)v12 + (j & 0x7ffffffffffffff8));
                                v35 = __dirty_unsupported_Iop_ZeroHI64ofV128(ShrNV(v34, 4));
                                v36 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_and_si128(v34, _mm_set_epi64x(0, 0xf0f0f0f0f0f0f0f)));
                                *(long long *)&node[8] = _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpackhi_epi16(_mm_unpacklo_epi8(v35, v35), _mm_unpacklo_epi8(v36, v36)), _mm_unpackhi_epi16(_mm_unpacklo_epi8(v35, v35), _mm_unpacklo_epi8(v36, v36))));
                                *(long long *)node = _mm_cvtsi128_si64(CatEvenLanesV(_mm_unpacklo_epi16(_mm_unpacklo_epi8(v35, v35), _mm_unpacklo_epi8(v36, v36)), _mm_unpacklo_epi16(_mm_unpacklo_epi8(v35, v35), _mm_unpacklo_epi8(v36, v36))));
                                node += 16;
                                j += 8;
                            } while (k != j);
                            if (v19 != k)
                                goto LABEL_769ec;
LABEL_76b14:
                            v6 = a4;
                            v7 = a0;
                            memset(ptr, 0, 52);
                            if (v8)
                            {
LABEL_768b4:
                                v40 = 0;
                                v41 = 0;
                                v42 = 1;
                                while (1)
                                {
                                    idx = *((char *)v7 + v40);
                                    if (12 < idx)
                                        break;
                                    (&ptr->field_0)[idx] = (&ptr->field_0)[idx] + 1;
                                    v41 += (int)(1 << (*((char *)v7 + v40) & 31)) >> 1;
                                    v40 = v42;
                                    v42 += 1;
                                    if (v40 >= v8)
                                    {
                                        v44 = arm64g_calculate_condition(49, v41 - 0x1000, 0xfff, 0);
                                        if (!(v44 & 1))
                                        {
                                            if (!(v41 * 0x100000000))
                                                v45 = 32;
                                            else
                                                v45 = Clz(v41 * 0x100000000);
                                            *v6 = 32 - v45;
                                            v46 = (1 << ((char)-v45 & 31)) - v41;
                                            if (!(v46 * 0x100000000))
                                                v47 = 32;
                                            else
                                                v47 = Clz(v46 * 0x100000000);
                                            if (0x80000000 >> ((char)v47 & 31) == v46)
                                            {
                                                v48 = 32 - v47;
                                                *((char *)v7 + v8) = v48;
                                                (&ptr->field_0)[v48] = (&ptr->field_0)[v48] + 1;
                                                v49 = ptr->field_4;
                                                if ((unsigned int)v49 < 2 || v49 & 1)
                                                    return 0xffffffffffffffec;
                                                *a3 = (unsigned int)v8 + 1;
                                                return 0xffffffffffffffec;
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        else
                        {
                            i = j * 2;
LABEL_769ec:
                            v6 = a4;
                            v37 = &(&a5->field_0)[1 + (i >> 1)];
                            do
                            {
                                v38 = a0 + i;
                                *(char *)v38 = *v37 >> 4;
                                *(char *)&v38[1] = *v37 & 15;
                                i += 2;
                                v37 += 1;
                            } while (i < v8);
                            v7 = a0;
                            memset(ptr, 0, 52);
                            if (v8)
                                goto LABEL_768b4;
                        }
                    }
                }
                else
                {
LABEL_769e0:
                    i = 0;
                    goto LABEL_769ec;
                }
            }
            else
            {
                memset(ptr, 0, 52);
            }
        }
    }
    return 0xffffffffffffffec;
}
