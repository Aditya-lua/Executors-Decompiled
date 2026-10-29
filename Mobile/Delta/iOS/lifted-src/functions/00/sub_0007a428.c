/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7a428..0x7a764 (828 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7a428_0 {
    char field_0;
} st_7a428_0;

extern char g_10002b0;

unsigned long long sub_7a428(void* a0, unsigned int *a1, long long a2, long long a3, unsigned int *a4)
{
    unsigned long long v17;  // x0
    unsigned long long v18;  // 4106
    unsigned short v27;  // x10
    unsigned long long v28;  // x11
    uint128_t *v29;  // x12
    unsigned long long j;  // x13
    void* iter;  // x14
    unsigned long long v32;  // x13
    uint128_t *v33;  // x12
    __m128i v34;  // q1
    __m128i v35;  // q2
    __m128i v36;  // q3
    unsigned long long idx;  // x8
    __m128i v37;  // q2
    __m128i v38;  // q1
    __m128i v39;  // q6
    __m128i v40;  // q1
    unsigned long long v42;  // x14
    unsigned int *v43;  // x12
    uint128_t *node;  // x13
    unsigned long long v45;  // x14
    __m128i v46;  // q1
    unsigned long long l;  // x21
    __m128i v47;  // q2
    __m128i v49;  // q2
    __m128i v50;  // q2
    unsigned long long v52;  // 4158
    char *v53;  // x12
    unsigned long long *iter1;  // x13
    unsigned long long v55;  // x11
    unsigned long long v56;  // x11
    unsigned long long v21;  // x9
    unsigned long long v57;  // w14
    unsigned long long v58;  // x14
    unsigned long long v59;  // x19
    unsigned long long k;  // x10
    void* iter2;  // x11
    unsigned long long v62;  // x10
    unsigned long index;  // x12
    unsigned long long v65;  // w9
    unsigned long long v66;  // x11
    unsigned int v22;  // w10
    void* v67;  // x10
    void* v68;  // x11
    unsigned long long v69;  // x8
    unsigned int v70;  // w12
    unsigned long long v72;  // x21
    unsigned long idx1;  // x8
    void* v23;  // x0
    unsigned long long idx2;  // x10
    unsigned long long v25;  // x11
    unsigned int v26;  // w13
    st_7a428_0 **v0;  // [bp-0x1d0], Other Possible Types: char
    st_7a428_0 *v1;  // [bp-0x1c8]
    unsigned long long v2;  // [bp-0x1c0]
    unsigned long long v3;  // [bp-0x1b8]
    unsigned long long v4;  // [bp-0x1b0]
    unsigned long long v5;  // [bp-0x1a8]
    unsigned long long v6;  // [bp-0x1a0]
    unsigned long long v7;  // [bp-0x198]
    unsigned long long v8;  // [bp-0x190]
    unsigned long long v9;  // [bp-0x188]
    unsigned long long v10;  // [bp-0x180]
    char v11;  // [bp-0x17c]
    char v12;  // [bp-0x178]
    char v13;  // [bp-0x148]
    unsigned long v14;  // [bp-0x48]
    char *v15;  // [bp-0x10]
    char v16;  // [bp+0x0]

    v15 = &v16;
    v14 = *(long long *)&g_10002b0;
    v1 = &v0;
    v2 = 0;
    v0 = &v1;
    v17 = sub_767b8(&v13, 0x100, &v11, &v2, (char *)&v2 + 4, a2, a3);
    v18 = arm64g_calculate_condition(130, v17, 120, 0);
    if (!(v18 & 1))
    {
        *a4 = v11 != 0;
        idx = *(unsigned int *)((void*)&v2 + 4);
        if ((unsigned int)idx > 12)
        {
            v17 = 0xffffffffffffffd4;
        }
        else
        {
            l = (unsigned int)v2;
            if ((unsigned int)l > *a1 + 1)
            {
                v17 = 0xffffffffffffffd0;
            }
            else
            {
                v21 = v17;
                v22 = (unsigned int)l - 1;
                *a1 = v22;
                v23 = a0 + 8;
                *(char *)a0 = idx;
                *(char *)&a0[1] = v22;
                *(unsigned int *)&a0[2] = 0;
                *(unsigned short *)&a0[6] = 0;
                if ((unsigned int)idx)
                {
                    idx2 = 0;
                    v25 = 0;
                    do
                    {
                        v26 = *(int *)&(&v12)[4 * idx2];
                        *(unsigned int *)&(&v12)[4 * idx2] = v25;
                        v25 += v26 << ((char)idx2 & 31);
                        idx2 += 1;
                    } while (idx != idx2);
                }
                if ((unsigned int)l)
                {
                    v27 = (unsigned short)idx + 1;
                    if (4 > (unsigned int)l)
                    {
                        v28 = 0;
                    }
                    else if (16 > (unsigned int)l)
                    {
                        v28 = 0;
LABEL_7a5f0:
                        v42 = v28;
                        v28 = l & 0xfffffffc;
                        v43 = &(&v13)[v42];
                        node = a0 + v42 * 8 + 8;
                        v45 = v42 - v28;
                        v46 = _mm_set1_epi64x(0xff);
                        do
                        {
                            v47 = *v43;
                            v43 += 1;
                            v49 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_and_si128(_mm_sub_epi16(v27 | v27 * 0x10000 | (v27 | v27 * 0x10000) * 0x100000000, _mm_srli_epi16(_mm_unpacklo_epi8(v47, v47), 8)), ~__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi16(_mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), v47), 8), _mm_setzero_si128()))));
                            v50 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v49), 16);
                            *node = _mm_and_si128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v50), 32), v46);
                            node[1] = _mm_and_si128(_mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v50), 32), v46);
                            node += 2;
                            v52 = arm64g_calculate_condition(18, v45, 4, 0);
                            v45 += 4;
                        } while (v52 & 1);
                        if (v28 == l)
                            goto LABEL_7a684;
                    }
                    else
                    {
                        v28 = l & 0xfffffff0;
                        v29 = &v13;
                        j = v28;
                        iter = v23;
                        do
                        {
                            v32 = j;
                            v33 = v29 + 1;
                            v34 = _mm_and_si128(_mm_sub_epi8(CONCAT(v27 & 0xff | (v27 & 0xff) * 0x100 | (v27 & 0xff | (v27 & 0xff) * 0x100) * 0x10000 | (v27 & 0xff | (v27 & 0xff) * 0x100 | (v27 & 0xff | (v27 & 0xff) * 0x100) * 0x10000) * 0x100000000, v27 & 0xff | (v27 & 0xff) * 0x100 | (v27 & 0xff | (v27 & 0xff) * 0x100) * 0x10000 | (v27 & 0xff | (v27 & 0xff) * 0x100 | (v27 & 0xff | (v27 & 0xff) * 0x100) * 0x10000) * 0x100000000), *v29), ~_mm_cmpeq_epi8(*v29, _mm_setzero_si128()));
                            v35 = _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), v34), 8);
                            v36 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v35), 16);
                            v37 = _mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v35), 16);
                            v38 = _mm_srli_epi16(_mm_unpackhi_epi8(_mm_setzero_si128(), v34), 8);
                            v39 = _mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v38), 16);
                            *(__m128i *)&iter[96] = _mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v39), 32);
                            *(__m128i *)&iter[112] = _mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v39), 32);
                            v40 = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v38), 16);
                            *(__m128i *)&iter[64] = _mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v40), 32);
                            *(__m128i *)&iter[80] = _mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v40), 32);
                            *(__m128i *)&iter[32] = _mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v37), 32);
                            *(__m128i *)&iter[48] = _mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v37), 32);
                            *(__m128i *)iter = _mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v36), 32);
                            *(__m128i *)&iter[16] = _mm_srli_epi64(_mm_unpackhi_epi32(_mm_setzero_si128(), v36), 32);
                            iter += 128;
                            v29 = v33;
                            j = v32 - 16;
                        } while (j);
                        if (v28 == l)
                            goto LABEL_7a684;
                        if (l & 12)
                            goto LABEL_7a5f0;
                    }
                    v53 = &(&v13)[v28];
                    iter1 = a0 + v28 * 8 + 8;
                    v55 = l - v28;
                    do
                    {
                        v56 = v55;
                        v57 = *v53;
                        v53 += 1;
                        if (!v57)
                            v58 = 0;
                        else
                            v58 = (char)(v27 - v57);
                    } while ((*iter1 = v58, iter1 += 1, v55 = v56 - 1, v56 != 1));
LABEL_7a684:
                    v59 = v21;
                    v7 = 0;
                    v8 = 0;
                    v10 = 0;
                    v9 = 0;
                    v3 = 0;
                    v4 = 0;
                    v6 = 0;
                    v5 = 0;
                    k = l;
                    iter2 = v23;
                    do
                    {
                        v62 = k;
                        index = *(char *)iter2;
                        iter2 += 8;
                        *(short *)((char *)&v7 + 2 * index) = *(short *)((char *)&v7 + 2 * index) + 1;
                        k = v62 - 1;
                    } while (k);
                }
                else
                {
                    v59 = v21;
                    v7 = 0;
                    v8 = 0;
                    v10 = 0;
                    v9 = 0;
                    v3 = 0;
                    v4 = 0;
                    v6 = 0;
                    v5 = 0;
                }
                *(unsigned short *)((char *)&v3 + 2 * idx + 2) = 0;
                if ((unsigned int)idx)
                {
                    v65 = 0;
                    v66 = idx * 2;
                    v67 = (char *)&v3 + v66;
                    v68 = (char *)&v7 + v66;
                    do
                    {
                        v69 = idx;
                        *(unsigned short *)v67 = v65;
                        v67 -= 2;
                        v70 = *(short *)v68;
                        v68 -= 2;
                        v65 = ((v70 + v65) * 0x80000000 | v70 + v65 >> 1) & 0x80007fff & 0x7fff;
                        idx = (unsigned int)v69 - 1;
                    } while ((unsigned int)v69 != 1);
                }
                if ((unsigned int)l)
                {
                    do
                    {
                        v72 = l;
                        idx1 = *(char *)v23;
                        v23 += 8;
                        *(short *)((char *)&v3 + 2 * idx1) = *(short *)((char *)&v3 + 2 * idx1) + 1;
                        sub_79590();
                        l = v72 - 1;
                    } while (l);
                }
                v17 = v59;
            }
        }
    }
    if (*(long long *)&g_10002b0 == v14)
        return v17;
    ___stack_chk_fail();
}
