/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a9c4..0x2ad10 (844 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a9c4_0 {
    char field_0;
} st_2a9c4_0;

extern char g_f0cc78;
extern char g_1000000;

long long sub_2a9c4(void* *a0, long long a1)
{
    void* v10;  // x21
    unsigned int v11;  // w0
    unsigned int v20;  // w13
    char v21;  // x8
    char v22;  // x23
    char v23;  // x21
    char v24;  // x22
    void* v25;  // x8
    char v26;  // x9
    char v27;  // x10
    char index;  // x15
    char j;  // x11
    void* v12;  // x22
    uint128_t *v30;  // x12
    char v31;  // x14
    unsigned long long v32;  // x3
    char v33;  // x16
    char v34;  // x17
    unsigned int v35;  // w1
    unsigned long long v36;  // x2
    char idx;  // x0
    unsigned long long m;  // x4
    unsigned long long v39;  // x3
    char idx1;  // x23
    __m128i v40;  // q0
    uint128_t *iter;  // x1
    __m128i v42;  // q0
    unsigned long long v43;  // x4
    char v46;  // x3
    void* v47;  // x8
    char v48;  // x9
    char k;  // x24
    char i;  // x26
    char v50;  // x25
    char v51;  // w8
    char idx2;  // x20
    unsigned int v15;  // w8
    char v16;  // x9
    char v17;  // x10
    unsigned int v18;  // w8
    char v19;  // x11
    st_2a9c4_0 **v0;  // [bp-0x98], Other Possible Types: char
    st_2a9c4_0 *v1;  // [bp-0x90]
    char v2;  // [bp-0x88]
    char v3;  // [bp-0x80]
    char v4;  // [bp-0x78]
    char v5;  // [bp-0x70]
    unsigned int v6;  // [bp-0x6c], Other Possible Types: char
    char *v7;  // [bp-0x68]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v1 = &v0;
    v0 = &v1;
    v10 = a0[10];
    if (g_f0cc78 & 1)
    {
        v11 = sub_31240(a0);
        v12 = a0[9];
    }
    else
    {
        v12 = a0[9];
        if (v10 != v12)
        {
            idx1 = 0;
            i = (long long)(v10 - v12) >> 2;
            v11 = (unsigned int)&g_1000000;
            do
            {
                v15 = *(int *)((char *)v12 + 4 * idx1);
                v16 = v11;
                v17 = idx1 + v16;
                if (v17 < idx1)
                    v17 = idx1;
                v18 = v15;
                v19 = idx1;
                do
                {
                    if (v17 != v19)
                    {
                        v20 = *(int *)((char *)v12 + 4 * v19);
                        if ((int)v20 < (int)v15)
                            v15 = v20;
                        if ((int)v20 >= (int)v18)
                            v18 = v20;
                        if (0x100 <= (int)(v18 - v15))
                        {
                            v17 = v19;
                            goto LABEL_2aaa0;
                        }
                    }
                    else
                    {
LABEL_2aaa0:
                        v21 = v17 - idx1;
                        if (v16 > v21)
                        {
                            v11 = 1 << ((char)sub_30814(v21) & 31);
                            break;
                        }
                    }
                } while ((v19 += 1, v19 < i));
                idx1 += v11;
            } while (i > idx1);
        }
        else
        {
            v11 = (unsigned int)&g_1000000;
            v12 = v10;
        }
    }
    v5 = 0;
    v2 = 0;
    v3 = 0;
    v4 = 0;
    v22 = v11;
    v23 = (((long long)(v10 - v12) >> 2) - 1) / v22 + 1;
    if (v23 >= 2)
    {
        sub_29808(&v2, v23);
        v24 = v2;
        if (g_f0cc78 & 1)
            goto LABEL_2abf8;
LABEL_2ab08:
        v25 = a0[9];
        if (a0[10] != v25)
        {
            v26 = 0;
            v27 = 0;
            index = 0;
            j = (long long)(a0[10] - v25) >> 2;
            v30 = v25 + 16;
            v31 = v22;
            do
            {
                if (j < v31)
                    v32 = j;
                else
                    v32 = v31;
                v33 = index + v22;
                if (j < v33)
                    v34 = j;
                else
                    v34 = v33;
                v35 = *(int *)((char *)v25 + 4 * index);
                if (v34 <= index)
                    continue;
                v36 = v34 - v22 * v27;
                idx = index;
                if (v36 >= 8)
                {
                    m = v32 + v26 & 0xfffffffffffffff8;
                    v39 = v36 & 0xfffffffffffffff8;
                    idx = index + v39;
                    v40 = (__m128i)(CONCAT(v35 | v35 * 0x100000000, v35 | v35 * 0x100000000));
                    iter = v30;
                    v42 = v40;
                    do
                    {
                        v43 = m;
                        v42 = _mm_min_epi32(*(int128_t *)((char *)iter - 16), v42);
                        v40 = _mm_min_epi32(*iter, v40);
                        iter += 2;
                        m = v43 - 8;
                    } while (m);
                    v35 = (unsigned int)__dirty_unsupported_Iop_ZeroHI96ofV128(_mm_min_epi32(_mm_min_epi32(CatOddLanesV(_mm_unpackhi_epi64(_mm_min_epi32(v42, v40), _mm_min_epi32(v42, v40)), _mm_unpackhi_epi64(_mm_min_epi32(v42, v40), _mm_min_epi32(v42, v40))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_min_epi32(v42, v40), _mm_min_epi32(v42, v40)), _mm_unpackhi_epi64(_mm_min_epi32(v42, v40), _mm_min_epi32(v42, v40)))), _mm_min_epi32(CatOddLanesV(_mm_unpacklo_epi64(_mm_min_epi32(v42, v40), _mm_min_epi32(v42, v40)), _mm_unpacklo_epi64(_mm_min_epi32(v42, v40), _mm_min_epi32(v42, v40))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_min_epi32(v42, v40), _mm_min_epi32(v42, v40)), _mm_unpacklo_epi64(_mm_min_epi32(v42, v40), _mm_min_epi32(v42, v40))))));
                    if (v36 == v39)
                        continue;
                }
                do
                {
                    v46 = idx + 1;
                    if (*(int *)((char *)v25 + 4 * idx) < (int)v35)
                        v35 = *(int *)((char *)v25 + 4 * idx);
                } while ((idx = v46, v46 < v34));
                *(unsigned int *)(v24 + index / v22 * 4) = v35;
                v27 += 1;
                v30 = (char *)v30 + 4 * v22;
                v31 += v22;
                v26 -= v22;
                index = v33;
            } while (j > index);
        }
    }
    else
    {
        v24 = (char)&v5;
        if (!(g_f0cc78 & 1))
            goto LABEL_2ab08;
LABEL_2abf8:
        sub_30188(a0, v22, v24);
    }
    v6 = sub_30814(v22);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a1, &v6, 1);
    v47 = a0[9];
    if (a0[10] != a0[9])
    {
        v48 = 0;
        k = 0;
        do
        {
            v50 = *(int *)((char *)v47 + 4 * k) - *(int *)(v24 + (k >> (v6 & 63)) * 4);
            v6 = v50 - v48;
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a1, &v6, 1);
            k += 1;
            v47 = a0[9];
            v48 = v50;
        } while (k < (long long)(a0[10] - v47) >> 2);
    }
    if (v23)
    {
        v51 = 0;
        idx2 = 0;
        do
        {
            v6 = *(int *)(v24 + idx2 * 4) - v51;
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a1, &v6, 4);
            v51 = *(int *)(v24 + idx2 * 4);
            idx2 += 1;
        } while (idx2 < v23);
    }
    v7 = &v2;
    return sub_1aedc(&v7);
}
