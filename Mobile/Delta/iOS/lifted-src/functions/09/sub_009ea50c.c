/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ea50c..0x9ea668 (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ea50c_0 {
    struct st_9ea50c_1 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_9ea50c_0;

typedef struct st_9ea50c_1 {
    unsigned long long field_0;
} st_9ea50c_1;


unsigned long long sub_9ea50c(st_9ea50c_0 *a0, st_9ea50c_0 *a1)
{
    unsigned long v2;  // x20
    unsigned long long *v3;  // x22
    unsigned long long v12;  // x10
    unsigned long long v13;  // x14
    uint128_t *node;  // x12
    uint128_t *iter;  // x14
    unsigned long long i;  // x15
    uint128_t v17;  // q0
    __m128i v18;  // q2
    __m128i v19;  // q1
    __m128i v20;  // q4
    uint128_t v21;  // q1
    unsigned long long v4;  // x0
    unsigned long long v23;  // x10
    unsigned long long idx;  // x10
    unsigned long v25;  // x11
    unsigned long long *v5;  // x8
    unsigned long v6;  // x14
    unsigned long long v7;  // x12
    unsigned long long v8;  // w9
    unsigned long long v9;  // x11
    unsigned long long v10;  // x13
    __m128i v11;  // q1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_9e4828(a1))
    {
        sub_9e5b4c(a0);
    }
    else
    {
        v2 = (unsigned int)a1->field_8;
        v3 = a1->field_0;
        if (a1 != a0)
        {
            v4 = sub_9e4cdc(a0, v2);
            if (!v4)
                return v4;
            *(int *)&a0->field_10 = a1->field_10;
        }
        v5 = a0->field_0;
        v6 = (unsigned int)v2 - 1;
        v7 = v3[(unsigned int)v6];
        v5[(unsigned int)v6] = v7 >> 1;
        v8 = (unsigned int)(v2 - (v7 == 1));
        *(unsigned int *)&a0->field_8 = v8;
        if ((int)v2 >= 2)
        {
            v9 = v2 - ((unsigned int)v6 != 0);
            if (v9 >= 4 && v3 - v5 >= 32)
            {
                v10 = v9 & 0xfffffffffffffffc;
                v11 = (__m128i)(CONCAT(v7, v7));
                v12 = v6 - v10;
                v13 = v6 * 8 - 16;
                node = (char *)v3 + v13;
                iter = (char *)v5 + v13;
                i = v10;
                do
                {
                    v17 = *(int128_t *)((char *)node - 16);
                    v18 = __dirty_unsupported_Iop_SliceV128(*node, *node, 8);
                    v19 = __dirty_unsupported_Iop_SliceV128(v18, v11, 8);
                    v11 = __dirty_unsupported_Iop_SliceV128(v17, v17, 8);
                    v20 = __dirty_unsupported_Iop_SliceV128(v11, v18, 8);
                    v21 = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(_mm_slli_epi64(v19, 63), _mm_srli_epi64(v18, 1)), _mm_add_epi64(_mm_slli_epi64(v19, 63), _mm_srli_epi64(v18, 1)), 8);
                    *(uint128_t *)((char *)iter - 16) = __dirty_unsupported_Iop_SliceV128(_mm_add_epi64(_mm_slli_epi64(v20, 63), _mm_srli_epi64(v11, 1)), _mm_add_epi64(_mm_slli_epi64(v20, 63), _mm_srli_epi64(v11, 1)), 8);
                    *iter = v21;
                    node = (char *)node - 32;
                    iter = (char *)iter - 32;
                    i -= 4;
                } while (i);
                v7 = *(unsigned long long *)&*(unsigned long long *)(void*)&v17;
                if (v9 == v10)
                    goto LABEL_9ea64c;
            }
            else
            {
                v12 = v6;
            }
            v23 = v12 - 1;
            do
            {
                idx = v23;
                v25 = v3[idx];
                v5[idx] = v7 * 0x8000000000000000 | v3[idx] >> 1;
                v7 = v25;
                v23 = idx - 1;
            } while (1 < idx + 1);
        }
LABEL_9ea64c:
        if (!v8)
            *(unsigned int *)&a0->field_10 = 0;
    }
    return 1;
}
