/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbf928..0xbfb14 (492 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_bf928(void* a0, unsigned int *a1, unsigned long long a2, unsigned long long a3, unsigned long long a4)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // 4106
    unsigned long long v12;  // x12
    void* iter;  // x11
    unsigned long long v14;  // x12
    __m128i v15;  // q1
    __m128i v17;  // q2
    unsigned long v18;  // d1
    unsigned long long v20;  // 4128
    void* iter1;  // x11
    unsigned long long v4;  // x9
    unsigned long long v22;  // x9
    unsigned long long v23;  // x9
    unsigned long long v24;  // w10
    unsigned long long v25;  // x12
    unsigned long long v26;  // x9
    unsigned long v27;  // x10
    unsigned long long v28;  // x12
    unsigned long long v29;  // x11
    unsigned long v30;  // x10
    unsigned long v31;  // x11
    unsigned long long v5;  // x10
    uint128_t *node;  // x12
    unsigned long long j;  // x13
    unsigned long long v34;  // x14
    void* v35;  // x15
    uint128_t v36;  // q0
    unsigned int v37;  // w10
    unsigned int *iter2;  // x11
    unsigned long long v39;  // x9
    uint128_t v6;  // q0
    uint128_t *v7;  // x11
    unsigned long long i;  // x12
    unsigned long long v9;  // x12
    __m128i v10;  // q2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a4 - a3;
    if ((unsigned int)a3 > (unsigned int)a4)
        return a3;
    v3 = arm64g_calculate_condition(147, a4 & 0xffffffff, a3 & 0xffffffff, 0);
    if (v3 & 1)
        return a4;
    if (a2)
    {
        v4 = a2;
        if (8 > a2)
        {
            v5 = 0;
        }
        else if (32 > a2)
        {
            v5 = 0;
LABEL_bf9cc:
            v12 = v5;
            v5 = v4 & 0xfffffff8;
            iter = a0 + v12;
            v14 = v12 - v5;
            do
            {
                v15 = *(unsigned long long *)&*(double *)iter;
                v17 = __dirty_unsupported_Iop_ZeroHI64ofV128((v2 & 0xff | (v2 & 0xff) * 0x100 | (v2 & 0xff | (v2 & 0xff) * 0x100) * 0x10000 | (v2 & 0xff | (v2 & 0xff) * 0x100 | (v2 & 0xff | (v2 & 0xff) * 0x100) * 0x10000) * 0x100000000) & ~__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v15, _mm_setzero_si128())));
                v18 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi8(v17, v15));
                *(unsigned long *)iter = v18;
                iter += 8;
                v20 = arm64g_calculate_condition(18, v14, 8, 0);
                v14 += 8;
            } while (v20 & 1);
            if (v5 == v4)
                goto LABEL_bfa28;
        }
        else
        {
            v5 = v4 & 0xffffffe0;
            v6 = CONCAT(v2 & 0xff | (v2 & 0xff) * 0x100 | (v2 & 0xff | (v2 & 0xff) * 0x100) * 0x10000 | (v2 & 0xff | (v2 & 0xff) * 0x100 | (v2 & 0xff | (v2 & 0xff) * 0x100) * 0x10000) * 0x100000000, v2 & 0xff | (v2 & 0xff) * 0x100 | (v2 & 0xff | (v2 & 0xff) * 0x100) * 0x10000 | (v2 & 0xff | (v2 & 0xff) * 0x100 | (v2 & 0xff | (v2 & 0xff) * 0x100) * 0x10000) * 0x100000000);
            v7 = a0 + 16;
            i = v5;
            do
            {
                v9 = i;
                v10 = *v7;
                *(uint128_t *)((char *)v7 - 16) = _mm_add_epi8(_mm_and_si128(v6, ~_mm_cmpeq_epi8(*(int128_t *)((char *)v7 - 16), _mm_setzero_si128())), *(int128_t *)((char *)v7 - 16));
                *v7 = _mm_add_epi8(_mm_and_si128(v6, ~_mm_cmpeq_epi8(v10, _mm_setzero_si128())), v10);
                v7 += 2;
                i = v9 - 32;
            } while (i);
            if (v5 == v4)
                goto LABEL_bfa28;
            if (v4 & 24)
                goto LABEL_bf9cc;
        }
        iter1 = a0 + v5;
        v22 = v4 - v5;
        do
        {
            v23 = v22;
            v24 = *(char *)iter1;
            if (!v24)
                v25 = 0;
            else
                v25 = (char)v2;
        } while ((*(char *)iter1 = v25 + (char)v24, iter1 += 1, v22 = v23 - 1, v23 != 1));
    }
LABEL_bfa28:
    if ((unsigned int)a4 <= (unsigned int)v2)
    {
        v39 = ~(unsigned int)a3 + a4;
        _bzero(&a1[v2 + -1 * v39], ((v39 * 4 | v39 >> 62) & 0x3fffffffc & 0x3ffffffff) + 4);
        return a4;
    }
    v26 = a4 & 0xffffffff;
    v27 = (unsigned int)a3 - 1;
    if (38 < (unsigned int)v27 && (unsigned int)a3)
    {
        v28 = v26 * 4;
        v29 = v27 * 4;
        if ((char *)a1 + v28 >= (char *)a1 + v28 - v29 && &a1[a3 & 0xffffffff] >= (char *)&a1[a3 & 0xffffffff] - v29 && (a3 & 0xffffffff) - v26 & 0x3ffffffffffffff8)
        {
            v30 = v27 + 1;
            v31 = v30 & 0x1fffffff8;
            v26 -= v31;
            node = v28 + (char *)a1 - 12;
            j = v31;
            v34 = a3;
            do
            {
                v35 = &a1[v34 & 0xffffffff];
                v36 = *(int128_t *)((char *)v35 - 12);
                *(int128_t *)((char *)node - 16) = *(int128_t *)((char *)v35 - 28);
                *node = v36;
                v34 = (unsigned int)v34 - 8;
                node = (char *)node - 32;
                j -= 8;
            } while (j);
            if (v30 == v31)
            {
                v39 = ~(unsigned int)a3 + a4;
                _bzero(&a1[v2 + -1 * v39], ((v39 * 4 | v39 >> 62) & 0x3fffffffc & 0x3ffffffff) + 4);
                return a4;
            }
        }
    }
    v37 = a3 + v26 - a4;
    iter2 = &a1[v26];
    do
    {
        *iter2 = a1[v37];
        iter2 = (char *)iter2 - 4;
        v37 -= 1;
        v26 = (unsigned int)v26 - 1;
    } while ((unsigned int)v2 < (unsigned int)v26);
    v39 = ~(unsigned int)a3 + a4;
    _bzero(&a1[v2 + -1 * v39], ((v39 * 4 | v39 >> 62) & 0x3fffffffc & 0x3ffffffff) + 4);
    return a4;
}
