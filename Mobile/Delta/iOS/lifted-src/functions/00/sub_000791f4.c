/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x791f4..0x794c0 (716 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_791f4_0 {
    char field_0;
} st_791f4_0;

extern char g_1000000;

uint128_t sub_791f4(unsigned long a0, uint128_t *a1, void* a2, uint128_t a3, uint128_t a4, void* a5)
{
    void* v4;  // x24
    void* v5;  // x26
    unsigned int v14;  // w16
    unsigned long v15;  // x14
    unsigned long long index;  // x16
    unsigned long long idx;  // x16
    unsigned long v18;  // x15
    unsigned long long idx1;  // x16
    unsigned long long idx2;  // x16
    unsigned long long v21;  // x16
    unsigned long long v22;  // x16
    unsigned long long i;  // x9
    void* node;  // x9
    unsigned long long v24;  // x9
    unsigned long v25;  // x10
    uint128_t j;  // x8
    __m128i v28;  // q0
    __m128i v29;  // q1
    void* v30;  // x9
    __m128i v31;  // q2
    __m128i v32;  // q3
    uint128_t v33;  // w8
    void* iter;  // x8
    unsigned int v34;  // s0
    unsigned int *v8;  // x10
    unsigned int *v9;  // x11
    unsigned int *v10;  // x12
    unsigned int v11;  // w14
    unsigned long v12;  // x15
    unsigned int v13;  // w16
    st_791f4_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_791f4_0 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a3)
    {
        _bzero();
        *(unsigned int *)a1 = 0;
        return 0;
    }
    v4 = a2;
    v5 = a2 + a3;
    _bzero(a5, 0x1000);
    node = v4;
    iter = v4;
    if (a3 >= 20)
    {
        v8 = a5 + 0x400;
        v9 = a5 + 0x800;
        v10 = a5 + 0xc00;
        v11 = *(int *)v4;
        iter = v4;
        node = v4;
        do
        {
            v12 = (int)iter[4];
            *(int *)((char *)a5 + 4 * (v11 & 0xff)) = *(int *)((char *)a5 + 4 * (v11 & 0xff)) + 1;
            v13 = (v11 * &g_1000000 | v11 >> 8) & 0xff0000ff & 0xff;
            v8[v13] = v8[v13] + 1;
            v14 = (v11 * 0x10000 | v11 >> 16) & 0xffff00ff & 0xff;
            v9[v14] = v9[v14] + 1;
            v10[v11 >> 24] = v10[v11 >> 24] + 1;
            v15 = (int)iter[8];
            *(int *)((char *)a5 + 4 * (v12 & 0xff)) = *(int *)((char *)a5 + 4 * (v12 & 0xff)) + 1;
            index = (v12 * 0x100000000000000 | v12 >> 8) & 0xff000000000000ff & 0xff;
            v8[index] = v8[index] + 1;
            idx = (v12 * 0x1000000000000 | v12 >> 16) & 0xffff0000000000ff & 0xff;
            v9[idx] = v9[idx] + 1;
            *(int *)((char *)v10 + (v12 >> 22 & 0x3fc)) = *(int *)((char *)v10 + (v12 >> 22 & 0x3fc)) + 1;
            v18 = (int)iter[12];
            *(int *)((char *)a5 + 4 * (v15 & 0xff)) = *(int *)((char *)a5 + 4 * (v15 & 0xff)) + 1;
            idx1 = (v15 * 0x100000000000000 | v15 >> 8) & 0xff000000000000ff & 0xff;
            v8[idx1] = v8[idx1] + 1;
            idx2 = (v15 * 0x1000000000000 | v15 >> 16) & 0xffff0000000000ff & 0xff;
            v9[idx2] = v9[idx2] + 1;
            *(int *)((char *)v10 + (v15 >> 22 & 0x3fc)) = *(int *)((char *)v10 + (v15 >> 22 & 0x3fc)) + 1;
            v11 = (int)iter[16];
            iter += 16;
            *(int *)((char *)a5 + 4 * (v18 & 0xff)) = *(int *)((char *)a5 + 4 * (v18 & 0xff)) + 1;
            v21 = (v18 * 0x100000000000000 | v18 >> 8) & 0xff000000000000ff & 0xff;
            v8[v21] = v8[v21] + 1;
            v22 = (v18 * 0x1000000000000 | v18 >> 16) & 0xffff0000000000ff & 0xff;
            v9[v22] = v9[v22] + 1;
            *(int *)((char *)v10 + (v18 >> 22 & 0x3fc)) = *(int *)((char *)v10 + (v18 >> 22 & 0x3fc)) + 1;
            node += 16;
        } while (iter + 4 < v5 - 15);
    }
    if (v5 > iter)
    {
        i = v4 + a3 - node;
        do
        {
            v24 = i;
            v25 = *(char *)iter;
            iter += 1;
            *(int *)((char *)a5 + 4 * v25) = *(int *)((char *)a5 + 4 * v25) + 1;
            i = v24 - 1;
        } while (i);
    }
    j = 0;
    v28 = _mm_setzero_si128();
    v29 = _mm_setzero_si128();
    do
    {
        v30 = a5 + j;
        v31 = _mm_add_epi32(_mm_add_epi32((int128_t)v30[0x800], (int128_t)v30[0x400]), _mm_add_epi32((int128_t)v30[0xc00], *(int128_t *)v30));
        v32 = _mm_add_epi32(_mm_add_epi32((int128_t)v30[2064], (int128_t)v30[1040]), _mm_add_epi32((int128_t)v30[3088], (int128_t)v30[16]));
        *(__m128i *)v30 = v31;
        *(__m128i *)&v30[16] = v32;
        v28 = _mm_max_epu32(v31, v28);
        v29 = _mm_max_epu32(v32, v29);
        j += 32;
    } while (j != 0x400);
    if ((int)a5[0x3fc])
    {
        v33 = 0xff;
    }
    else
    {
        v33 = 0xff;
        do
        {
            v33 -= 1;
        } while (!*(int *)((char *)a5 + 4 * v33));
    }
    if (a4 && v33 > (unsigned int)*(int *)a1)
        return 0xffffffffffffffd0;
    v34 = __dirty_unsupported_Iop_ZeroHI96ofV128(_mm_max_epu32(_mm_max_epu32(CatOddLanesV(_mm_unpackhi_epi64(_mm_max_epu32(v28, v29), _mm_max_epu32(v28, v29)), _mm_unpackhi_epi64(_mm_max_epu32(v28, v29), _mm_max_epu32(v28, v29))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_max_epu32(v28, v29), _mm_max_epu32(v28, v29)), _mm_unpackhi_epi64(_mm_max_epu32(v28, v29), _mm_max_epu32(v28, v29)))), _mm_max_epu32(CatOddLanesV(_mm_unpacklo_epi64(_mm_max_epu32(v28, v29), _mm_max_epu32(v28, v29)), _mm_unpacklo_epi64(_mm_max_epu32(v28, v29), _mm_max_epu32(v28, v29))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_max_epu32(v28, v29), _mm_max_epu32(v28, v29)), _mm_unpacklo_epi64(_mm_max_epu32(v28, v29), _mm_max_epu32(v28, v29))))));
    *(unsigned int *)a1 = v33;
    _memmove();
    return __float_as_int(v34);
}
