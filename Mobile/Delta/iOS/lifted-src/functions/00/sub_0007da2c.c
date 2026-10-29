/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7da2c..0x7dcf8 (716 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7da2c_0 {
    char field_0;
} st_7da2c_0;


unsigned long long sub_7da2c(unsigned long long a0, void* a1, unsigned long long a2, unsigned int a3, long long a4, unsigned long long a5, long long a6, long long a7, char a8, long long a9, long long a10)
{
    void* j;  // x19
    unsigned long long node;  // x0
    void* v14;  // x13
    unsigned long long i;  // x14
    unsigned int v16;  // x14
    unsigned long long v20;  // x10
    unsigned long long v21;  // q0
    __m128i v22;  // q1
    unsigned long long v23;  // q7
    unsigned long long v6;  // 4106
    unsigned long long v24;  // q6
    __m128i v25;  // q18
    unsigned long long v26;  // q16
    unsigned long long v27;  // q19
    unsigned long long v28;  // q17
    unsigned long long k;  // x11
    void* iter;  // x12
    unsigned long long v31;  // x11
    __m128i v32;  // q20
    __m128i v33;  // q21
    unsigned long long v7;  // 4106
    __m128i v34;  // q22
    __m128i v35;  // q23
    __m128i v36;  // q20
    unsigned long long v39;  // x12
    unsigned long long v41;  // q0
    __m128i v42;  // q1
    void* v43;  // x13
    void* v8;  // x8
    unsigned long long v44;  // x10
    __m128i v45;  // q2
    __m128i v47;  // q3
    unsigned long long v49;  // 4141
    unsigned long v50;  // d0
    void* v9;  // x9
    unsigned long long v10;  // x9
    unsigned long long v11;  // x12
    unsigned long long v12;  // x11
    st_7da2c_0 **v0;  // [bp-0x68], Other Possible Types: char
    st_7da2c_0 *v1;  // [bp-0x60]
    unsigned int v2;  // [bp-0x54]
    char *v3;  // [bp-0x10]

    v3 = &a8;
    j = a1;
    v1 = &v0;
    v0 = &v1;
    v2 = a3;
    sub_79174(a9, &v2, j, a2, a9, a10);
    if (a0 == 1)
    {
LABEL_7daf0:
        node = 0;
    }
    else if (!a0)
    {
        node = sub_83b18(a6, a7, a9, v2);
        v6 = arm64g_calculate_condition(130, node, 120, 0);
        if (v6 & 1)
            return a2 * 10;
    }
    else
    {
        if ((a0 & 0xfffffffe) != 2)
            goto LABEL_7daf0;
        node = sub_83bf8(a4, a9, v2);
        v7 = arm64g_calculate_condition(146, node, 120, 0);
        if (!(v7 & 1))
            return a2 * 10;
    }
    if ((long long)a2 >= 1)
    {
        v8 = j + a2;
        v9 = j + a2;
        if (j + 1 >= v9)
            v9 = j + 1;
        v10 = v9 - j;
        if (a5)
        {
            if (1 < v10)
            {
                v11 = 0;
                v12 = v10 & 0xfffffffffffffffe;
                v14 = j + 1;
                i = v12;
                do
                {
                    v16 = i;
                    node += *(char *)(a5 + *((char *)v14 - 1));
                    v11 += *(char *)(a5 + *(char *)v14);
                    v14 += 2;
                    i = v16 - 2;
                } while (i);
                node += v11;
                j += v12;
                if (v10 == v12)
                    return v11 + node >> 3;
            }
            do
            {
                node += *(char *)(a5 + *(char *)j);
                j += 1;
            } while (j < v8);
        }
        else
        {
            if (4 <= v10)
            {
                if (16 > v10)
                {
                    v20 = 0;
LABEL_7dc60:
                    v39 = v10 & 0xfffffffffffffffc;
                    v41 = 0;
                    v42 = __double_as_longlong(__longlong_as_double(node));
                    v43 = j + v20;
                    v44 = v20 - v39;
                    v45 = _mm_set1_epi64x(0xff);
                    do
                    {
                        v47 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *(int *)v43), 8)), 16);
                        v41 = (unsigned long long)_mm_add_epi64(v41, _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v47), 32), v45));
                        v42 = _mm_add_epi64(v42, _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v47), 32), v45));
                        v49 = arm64g_calculate_condition(18, v44, 4, 0);
                        v44 += 4;
                        v43 += 4;
                    } while (v49 & 1);
                    v50 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi64(_mm_add_epi64(v42, v41), _mm_unpackhi_epi64(_mm_add_epi64(v42, v41), _mm_add_epi64(v42, v41))));
                    node = __double_as_longlong(v50);
                    j += v39;
                    if (v10 == v39)
                        return __double_as_longlong(v50) >> 3;
                }
                else
                {
                    v20 = v10 & 0xfffffffffffffff0;
                    v21 = 0;
                    v22 = __double_as_longlong(__longlong_as_double(node));
                    v23 = 0;
                    v24 = 0;
                    v25 = _mm_setzero_si128();
                    v26 = 0;
                    v27 = 0;
                    v28 = 0;
                    k = v20;
                    iter = j;
                    do
                    {
                        v31 = k;
                        v32 = *(int128_t *)iter;
                        iter += 16;
                        v33 = _mm_and_si128(PermV(v32, _mm_and_si128(_mm_set_epi64x(0xffffff07ffffff06, 0xffffff05ffffff04), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 7, -1, -1, -1, 6, -1, -1, -1, 5, -1, -1, -1, 4)));
                        v34 = _mm_and_si128(PermV(v32, _mm_and_si128(_mm_set_epi64x(0xffffff03ffffff02, 0xffffff01ffffff00), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 3, -1, -1, -1, 2, -1, -1, -1, 1, -1, -1, -1, 0)));
                        v35 = _mm_and_si128(PermV(v32, _mm_and_si128(_mm_set_epi64x(0xffffff0bffffff0a, 0xffffff09ffffff08), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 11, -1, -1, -1, 10, -1, -1, -1, 9, -1, -1, -1, 8)));
                        v36 = _mm_and_si128(PermV(v32, _mm_and_si128(_mm_set_epi64x(0xffffff0fffffff0e, 0xffffff0dffffff0c), _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), _mm_set_epi8(-1, -1, -1, 15, -1, -1, -1, 14, -1, -1, -1, 13, -1, -1, -1, 12)));
                        v21 = (unsigned long long)_mm_add_epi64(v21, _mm_srli_epi64(_mm_unpackhi_epi32(v34, v34), 32));
                        v24 = (unsigned long long)_mm_add_epi64(v24, _mm_srli_epi64(_mm_unpackhi_epi32(v33, v33), 32));
                        v23 = (unsigned long long)_mm_add_epi64(v23, _mm_srli_epi64(_mm_unpacklo_epi32(v33, v33), 32));
                        v22 = _mm_add_epi64(v22, _mm_srli_epi64(_mm_unpacklo_epi32(v34, v34), 32));
                        v25 = _mm_add_epi64(v25, _mm_srli_epi64(_mm_unpacklo_epi32(v35, v35), 32));
                        v26 = (unsigned long long)_mm_add_epi64(v26, _mm_srli_epi64(_mm_unpackhi_epi32(v35, v35), 32));
                        v27 = (unsigned long long)_mm_add_epi64(v27, _mm_srli_epi64(_mm_unpacklo_epi32(v36, v36), 32));
                        v28 = (unsigned long long)_mm_add_epi64(v28, _mm_srli_epi64(_mm_unpackhi_epi32(v36, v36), 32));
                        k = v31 - 16;
                    } while (k);
                    node = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v22, v25), _mm_add_epi64(v23, v27)), _mm_add_epi64(_mm_add_epi64(v21, v26), _mm_add_epi64(v24, v28))), _mm_unpackhi_epi64(_mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v22, v25), _mm_add_epi64(v23, v27)), _mm_add_epi64(_mm_add_epi64(v21, v26), _mm_add_epi64(v24, v28))), _mm_add_epi64(_mm_add_epi64(_mm_add_epi64(v22, v25), _mm_add_epi64(v23, v27)), _mm_add_epi64(_mm_add_epi64(v21, v26), _mm_add_epi64(v24, v28))))));
                    if (v10 == v20)
                        return node >> 3;
                    if (v10 & 12)
                        goto LABEL_7dc60;
                    j += v20;
                }
            }
            do
            {
                node += *(char *)j;
                j += 1;
            } while (j < v8);
        }
    }
    return node >> 3;
}
