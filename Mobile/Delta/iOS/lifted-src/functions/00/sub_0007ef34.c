/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7ef34..0x7f08c (344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7ef34_1 {
    char padding_0[48];
    unsigned int field_30;
    char padding_34[60];
    long long field_70;
    long long field_78;
    uint128_t *field_80;
    char padding_88[4];
    unsigned int field_8c;
} st_7ef34_1;

typedef struct st_7ef34_0 {
    char field_0;
} st_7ef34_0;


uint128_t * sub_7ef34(st_7ef34_1 *a0, unsigned int *a1, unsigned long long a2)
{
    unsigned long v4;  // x22
    uint128_t *v5;  // x0
    __m128i v14;  // q3
    __m128i v15;  // q4
    __m128i v16;  // q3
    __m128i v17;  // q4
    unsigned long long v6;  // x1
    unsigned int v7;  // w8
    int i;  // w8
    __m128i v9;  // q0
    __m128i v10;  // q1
    uint128_t *iter;  // x9
    __m128i v12;  // q2
    int v13;  // w8
    st_7ef34_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_7ef34_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    sub_7dcf8(a0->field_70, 1 << ((char)a1[3] & 31));
    v4 = a1[7];
    v5 = sub_7cd78(v4, a1[40], a0->field_8c);
    if ((unsigned int)v5)
    {
        v6 = 1 << ((char)a1[2] & 31);
        v5 = a0->field_80;
        if ((unsigned int)v4 == 6)
        {
            if ((int)v6 < 0)
                v7 = (unsigned int)v6 + 15;
            else
                v7 = v6;
            if ((int)v6 >= 16)
            {
                i = (int)(v7) >> 4;
                v9 = (__m128i)(CONCAT((unsigned int)a2 + 2 | ((unsigned int)a2 + 2) * 0x100000000, (unsigned int)a2 + 2 | ((unsigned int)a2 + 2) * 0x100000000));
                v10 = (__m128i)(CONCAT(a2 & 0xffffffff | (a2 & 0xffffffff) * 0x100000000, a2 & 0xffffffff | (a2 & 0xffffffff) * 0x100000000));
                iter = v5 + 2;
                v12 = _mm_set1_epi32(1);
                do
                {
                    v13 = i;
                    v14 = *(int128_t *)((char *)iter - 32);
                    v15 = *(int128_t *)((char *)iter - 16);
                    *(uint128_t *)((char *)iter - 32) = _mm_sub_epi32(_mm_and_si128(_mm_and_si128(_mm_sub_epi32(v14, v10), ~CmpGTV(v9, v14)), ~_mm_cmpeq_epi32(v14, v12)), _mm_cmpeq_epi32(v14, v12));
                    *(uint128_t *)((char *)iter - 16) = _mm_sub_epi32(_mm_and_si128(_mm_and_si128(_mm_sub_epi32(v15, v10), ~CmpGTV(v9, v15)), ~_mm_cmpeq_epi32(v15, v12)), _mm_cmpeq_epi32(v15, v12));
                    v16 = *iter;
                    v17 = iter[1];
                    *iter = _mm_sub_epi32(_mm_and_si128(_mm_and_si128(_mm_sub_epi32(v16, v10), ~CmpGTV(v9, v16)), ~_mm_cmpeq_epi32(v16, v12)), _mm_cmpeq_epi32(v16, v12));
                    iter[1] = _mm_sub_epi32(_mm_and_si128(_mm_and_si128(_mm_sub_epi32(v17, v10), ~CmpGTV(v9, v17)), ~_mm_cmpeq_epi32(v17, v12)), _mm_cmpeq_epi32(v17, v12));
                    iter += 4;
                    i = v13 - 1;
                } while (i);
            }
        }
        else
        {
            v5 = sub_7dcf8(v5, v6, a2);
        }
    }
    if (a0->field_30)
        v5 = sub_7dcf8(a0->field_78, 1 << ((char)a0->field_30 & 31), a2);
    return v5;
}
