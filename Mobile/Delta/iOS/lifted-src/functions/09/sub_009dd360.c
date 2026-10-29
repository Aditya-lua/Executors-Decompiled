/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9dd360..0x9dd4bc (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9dd360_1 {
    uint128_t *field_0;
    struct st_9dd360_0 *field_8;
    struct st_9dd360_0 *field_c;
} st_9dd360_1;

typedef struct st_9dd360_0 {
    char padding_0[8];
    unsigned int field_8;
} st_9dd360_0;


st_9dd360_0 * sub_9dd360(st_9dd360_1 *a0, st_9dd360_0 *a1, st_9dd360_0 **a2, unsigned long a3)
{
    st_9dd360_0 *v2;  // x9
    unsigned long v3;  // x10
    unsigned long long j;  // x13
    unsigned long long *node;  // x11
    st_9dd360_0 *v15;  // x12
    unsigned long long v16;  // x13
    st_9dd360_0 *v18;  // w9
    st_9dd360_0 *v19;  // x20
    uint128_t *v4;  // x11
    st_9dd360_0 *v5;  // x12
    __m128i v6;  // q1
    uint128_t *iter;  // x13
    st_9dd360_0 *i;  // x14
    st_9dd360_0 *v9;  // x14
    __m128i v10;  // q4
    __m128i v11;  // q7
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
    {
        a1 = a2[1];
        if (!a2[1])
        {
            sub_a368c8();
            sub_a369bc("crypto/bn/bn_blind.c", 172, "BN_BLINDING_invert_ex");
            sub_a36abc(3, 107, 0);
            return 0;
        }
    }
    if (a2[7])
    {
        v2 = a1->field_8;
        if (*(int *)((char *)&a0->field_8 + 4) >= (int)(unsigned int)v2)
        {
            v3 = (int)a0->field_8;
            if ((unsigned int)v2)
            {
                v4 = a0->field_0;
                if (4 > (unsigned int)v2)
                {
                    v5 = 0;
                }
                else
                {
                    v5 = v2 & 0xfffffffc;
                    v6 = _mm_set_epi64x(1, 0);
                    iter = v4 + 1;
                    i = v5;
                    do
                    {
                        v9 = i;
                        v10 = _mm_sub_epi64(v6, CONCAT(v3, v3));
                        v11 = *iter;
                        *(uint128_t *)((char *)iter - 16) = _mm_and_si128(_mm_cmpgt_epi64(_mm_setzero_si128(), v10), *(int128_t *)((char *)iter - 16));
                        *iter = _mm_and_si128(_mm_cmpgt_epi64(_mm_setzero_si128(), _mm_add_epi64(v10, _mm_set1_epi64x(2))), v11);
                        v6 = _mm_add_epi64(v6, _mm_set1_epi64x(4));
                        iter += 2;
                        i = (char *)v9 - 4;
                    } while (i);
                    if (v5 == v2)
                        goto LABEL_9dd484;
                }
                j = v2 - v5;
                node = (char *)v4 + 0x8 * v5;
                v15 = &v5->padding_0[-1 * v3];
                do
                {
                    v16 = j;
                    *node = *node & v15 >> 63;
                    node += 1;
                    v15 = &v15->padding_0[1];
                    j = v16 - 1;
                } while (j);
            }
LABEL_9dd484:
            if ((int)v3 < (int)(unsigned int)v2)
                v18 = (st_9dd360_0 *)(unsigned int)v2;
            else
                v18 = (st_9dd360_0 *)(unsigned int)v3;
            *(unsigned int *)&a0->field_8 = (unsigned int)v18;
        }
        v19 = sub_9e671c();
        sub_9e5d34(a0);
        return v19;
    }
}
