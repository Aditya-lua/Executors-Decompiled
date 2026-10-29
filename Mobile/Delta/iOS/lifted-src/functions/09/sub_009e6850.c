/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e6850..0x9e6ae4 (660 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e6850_1 {
    void* field_0;
    unsigned int field_8;
    char padding_c[4];
    unsigned int field_10;
} st_9e6850_1;

typedef struct st_9e6850_0 {
    char padding_0[32];
    long long field_20;
    unsigned int field_28;
    char padding_2c[4];
    unsigned int field_30;
    char padding_34[28];
    long long field_50;
} st_9e6850_0;


long long sub_9e6850(st_9e6850_1 *a0, st_9e6850_1 *a1, st_9e6850_0 *a2)
{
    unsigned long idx;  // x19
    unsigned long v3;  // x25
    unsigned long long v12;  // x11
    __m128i v13;  // q4
    __m128i v14;  // q5
    __m128i v15;  // q7
    __m128i v16;  // q4
    __m128i v17;  // q5
    unsigned int v19;  // w8
    unsigned long long *iter;  // x10
    unsigned long v21;  // x9
    unsigned long v4;  // x0
    unsigned long v22;  // x9
    unsigned long v23;  // x11
    unsigned long v24;  // x26
    long long v25;  // x24
    unsigned int j;  // w25
    unsigned int v27;  // w25
    unsigned long long v28;  // x0
    unsigned long v29;  // x8
    unsigned long long v30;  // 4181
    unsigned long v31;  // x0
    long long v5;  // x22
    unsigned long v32;  // x23
    uint128_t *v33;  // x20
    void* v34;  // x24
    uint128_t *v35;  // x21
    unsigned long long v36;  // x0
    unsigned long long v37;  // x8
    unsigned long long v38;  // x9
    unsigned long v39;  // x10
    uint128_t v40;  // q0
    uint128_t v41;  // q1
    void* iter1;  // x23
    uint128_t *iter2;  // x11
    uint128_t *node;  // x12
    unsigned long long l;  // x13
    unsigned long long v45;  // x13
    uint128_t v46;  // q4
    uint128_t v47;  // q6
    unsigned long long v49;  // x12
    unsigned long long *v50;  // x11
    unsigned long long *v51;  // x12
    unsigned int v7;  // w8
    unsigned long k;  // x10
    unsigned long v53;  // x10
    unsigned long v8;  // x9
    __m128i v9;  // q1
    uint128_t *v10;  // x10
    unsigned long long i;  // x11
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    idx = a2->field_28;
    if ((unsigned int)idx)
    {
        v3 = (unsigned int)idx * 2;
        v4 = sub_9e4cdc(a1, v3);
        if (!v4)
            return v4;
        a1->field_10 = a1->field_10 ^ a2->field_30;
        v5 = a2->field_20;
        if ((int)idx > 0)
        {
            iter1 = a1->field_0;
            v7 = a1->field_8;
            if (4 > (unsigned int)v3)
            {
                v8 = 0;
            }
            else
            {
                v8 = v3 & 0x7ffffffc;
                v9 = _mm_set_epi64x(0, 0x100000000);
                v10 = iter1 + 16;
                i = v8;
                do
                {
                    v12 = i;
                    v13 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(v9, v7 | v7 * 0x100000000));
                    v14 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v13, _mm_set_epi32(0, 0, 2, 2)));
                    v15 = *v10;
                    v16 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi32(_mm_setzero_si128(), v13));
                    v17 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi32(_mm_setzero_si128(), v14));
                    *(uint128_t *)((char *)v10 - 16) = _mm_and_si128(*(int128_t *)((char *)v10 - 16), SarNV(_mm_unpacklo_epi32(_mm_setzero_si128(), v16), 32));
                    *v10 = _mm_and_si128(v15, SarNV(_mm_unpacklo_epi32(_mm_setzero_si128(), v17), 32));
                    v9 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v9, _mm_set_epi32(0, 0, 4, 4)));
                    v10 += 2;
                    i = v12 - 4;
                } while (i);
                if (v8 == v3)
                    goto LABEL_9e6960;
            }
            v19 = v8 - v7;
            iter = iter1 + v8 * 8;
            v21 = v3 - v8;
            do
            {
                v22 = v21;
                v23 = *iter;
                if ((int)v19 >= 0)
                    v23 = 0;
            } while ((*iter = v23, iter += 1, v19 += 1, v21 = v22 - 1, v22 != 1));
LABEL_9e6960:
            v24 = 0;
            a1->field_8 = v3;
            v25 = a2->field_50;
            j = idx;
            do
            {
                v27 = j;
                v28 = sub_9db6d0(iter1, v5, idx, v25 * *(long long *)iter1);
                v29 = v28 + v24 + *(long long *)((char *)iter1 + 8 * idx);
                v30 = arm64g_calculate_condition(2, v28, v24, 0);
                v24 = (unsigned long long)*(long long *)((char *)iter1 + 8 * idx) >= v29 & ((unsigned int)!(v30 & 1) | (unsigned int)v24);
                *(unsigned long *)((char *)iter1 + 8 * idx) = v29;
                iter1 += 8;
                j = v27 - 1;
            } while (j);
        }
        else
        {
            v24 = 0;
            a1->field_8 = v3;
        }
        v31 = sub_9e4cdc(a0, idx);
        if (!v31)
            return v31;
        v32 = (int)idx;
        a0->field_8 = idx;
        a0->field_10 = a1->field_10;
        v33 = a0->field_0;
        v34 = a1->field_0;
        v35 = v34 + v32 * 8;
        v36 = sub_9dbbc8(v33, v35, v5, idx);
        if ((int)idx >= 1)
        {
            v37 = v24 - v36;
            v38 = ~v37;
            if ((unsigned int)idx < 6 || v34 + (v32 + idx) * 8 > v33 && (char *)v33 + 8 * idx > v35)
            {
                v39 = 0;
            }
            else
            {
                v39 = idx & 0x7ffffffc;
                v40 = CONCAT(v37, v37);
                v41 = CONCAT(v38, v38);
                iter2 = v35 + 1;
                node = v33 + 1;
                l = v39;
                do
                {
                    v45 = l;
                    v46 = *iter2 & v40;
                    v47 = *node & v41;
                    *(uint128_t *)((char *)node - 16) = *(int128_t *)((char *)node - 16) & v41 | *(int128_t *)((char *)iter2 - 16) & v40;
                    *node = v47 | v46;
                    *(uint128_t *)((char *)iter2 - 16) = 0;
                    *iter2 = 0;
                    iter2 += 2;
                    node += 2;
                    l = v45 - 4;
                } while (l);
                if (v39 == idx)
                    return 1;
            }
            v49 = v39 * 8;
            v50 = (char *)v33 + v49;
            v51 = v34 + v49 + v32 * 8;
            k = idx - v39;
            do
            {
                v53 = k;
                *v50 = *v50 & v38 | *v51 & v37;
                v50 += 1;
                *v51 = 0;
                v51 += 1;
                k = v53 - 1;
            } while (k);
        }
    }
    else
    {
        a0->field_8 = 0;
    }
    return 1;
}
