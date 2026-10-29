/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa46fec..0xa4730c (800 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a46fec_0 {
    char padding_0[120];
    void* field_78;
} st_a46fec_0;


unsigned long long sub_a46fec(st_a46fec_0 *a0, void* a1, void* a2, unsigned long long a3)
{
    unsigned long long iter;  // x22
    void* v3;  // x21
    unsigned long long v12;  // x13
    unsigned long long v13;  // x14
    uint128_t v14;  // q1
    uint128_t *v15;  // x8
    uint128_t v16;  // q3
    unsigned long long v17;  // x9
    unsigned long long v18;  // x9
    unsigned long long v19;  // x12
    unsigned int v20;  // w8
    unsigned long long v21;  // 4128
    void* v4;  // x20
    unsigned long long v22;  // w24
    unsigned long long i;  // x25
    unsigned long long v24;  // x27
    unsigned long long v25;  // x8
    unsigned long long v26;  // x9
    unsigned long v27;  // cc_dep1
    unsigned long v28;  // cc_dep2
    unsigned long long v29;  // 4104
    unsigned long long v30;  // 4104
    unsigned long long v31;  // x23
    void* v5;  // x19
    void* v32;  // x0
    unsigned long long v33;  // x8
    unsigned long long v34;  // x9
    unsigned long long v35;  // x9
    unsigned long long v36;  // x10
    unsigned long long *v37;  // x11
    unsigned long long *iter1;  // x12
    unsigned long long *v39;  // x13
    unsigned long long k;  // x14
    unsigned long long v41;  // x14
    unsigned long v6;  // x8
    unsigned long v42;  // d0
    unsigned long v43;  // d1
    unsigned long long v45;  // x10
    void* v46;  // x11
    void* v47;  // x12
    unsigned int *v48;  // x13
    unsigned long long v49;  // x14
    void* node;  // x21
    __m128i v52;  // q0
    unsigned long long v56;  // 4136
    void* v57;  // x10
    char *v58;  // x11
    void* iter2;  // x12
    unsigned long long j;  // x8
    unsigned long long v61;  // x8
    void* v8;  // x20
    unsigned long v9;  // x8
    unsigned long long v10;  // x9
    unsigned long long v11;  // x10
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    iter = a3;
    v3 = a2;
    v4 = a1;
    v5 = a0->field_78;
    v6 = (int)v5[112];
    node = v3;
    v8 = v4;
    if ((unsigned int)v6)
    {
        node = v3;
        v8 = v4;
        v9 = v6;
        if (iter)
        {
            node = v3;
            v8 = v4;
            v9 = v6;
            if (63 >= (unsigned int)v9)
            {
                v10 = iter - 1;
                v11 = 63 - v6;
                if (v10 >= v11)
                    v10 = v11;
                if (31 <= v10 && v4 - v3 >= 32 && v4 - (v5 + v6) - 48 >= 32)
                {
                    v12 = v10 + 1;
                    v13 = v12 & 96;
                    node = v3 + v13;
                    iter -= v13;
                    v8 = v4 + v13;
                    v9 = v13 + v6;
                    v14 = (int128_t)v3[16];
                    v15 = v5 + 48 + v6;
                    v16 = v15[1];
                    *(uint128_t *)v4 = *(int128_t *)v3 ^ *v15;
                    *(uint128_t *)&v4[16] = v14 ^ v16;
                    v3 = node;
                    v4 = v8;
                    v6 = v9;
                    if (v12 == v13)
                        goto LABEL_a47094;
                }
                v17 = 0;
                do
                {
                    v18 = v17;
                    *((char *)v4 + v18) = *(v6 + (char *)v5 + v18 + 48) ^ *((char *)v3 + v18);
                    v19 = v18 + 1;
                } while (iter - 1 != v18 && (v17 = v19, v6 + v18 < 63));
                v9 = v6 + v19;
                v8 = v4 + v19;
                iter -= v19;
                node = v3 + v19;
LABEL_a47094:
            }
        }
        *(unsigned int *)&v5[112] = v9;
        if (!iter)
        {
            return 1;
        }
        else if ((unsigned int)v9 == 64)
        {
            *(unsigned int *)&v5[112] = 0;
            v20 = (int)v5[32];
            *(unsigned int *)&v5[32] = v20 + 1;
            v21 = arm64g_calculate_condition(49, v20, 1, 0);
            if (!(v21 & 1))
                *(int *)&v5[36] = (int)v5[36] + 1;
        }
    }
    v22 = (unsigned int)iter & 63;
    i = iter & 0xffffffffffffffc0;
    if (iter & 0xffffffffffffffc0)
    {
        v24 = (int)v5[32];
        do
        {
            v25 = i >> 6;
            if (v25 >= 0x10000000)
                v25 = 0x10000000;
            v26 = v24 + v25;
            v27 = v25;
            v28 = v26;
            if (v26 < v25)
            {
                v24 = 0;
                v29 = arm64g_calculate_condition(132, v27, v28, 0);
                if (!(v29 & 1))
                    goto LABEL_a47112;
                goto LABEL_a47111;
            }
            else
            {
                v24 = v26 & 0xffffffff;
                v30 = arm64g_calculate_condition(132, v27, v28, 0);
                if (v30 & 1)
                {
LABEL_a47111:
                    continue;
                }
                else
                {
LABEL_a47112:
                    v26 = 0;
                }
            }
            v31 = (v25 - v26) * 64;
            sub_9f0720();
            *(unsigned int *)&v5[32] = v24;
            if (!(unsigned int)v24)
                *(int *)&v5[36] = (int)v5[36] + 1;
            node += v31;
            v8 += v31;
            i -= v31;
        } while (i);
    }
    if (!v22)
        return 1;
    memset(v5 + 64, 0, 48);
    v32 = v5;
    *(uint128_t *)&v32[48] = 0;
    sub_9f0720(v32 + 48, v32 + 48, 64, v5, v5 + 32);
    v33 = iter & 63;
    if (4 > v33)
    {
        v34 = 0;
    }
    else
    {
        v34 = 0;
        if (v8 - node >= 16 && v8 - v5 - 48 >= 16)
        {
            if (16 > v33)
            {
                v35 = 0;
LABEL_a472c0:
                v45 = iter & 3;
                v46 = node + v35;
                v47 = v8 + v35;
                v34 = v33 - v45;
                v48 = v35 + v5 + 48;
                v49 = v35 + v45 - v33;
                do
                {
                    v52 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_xor_si128(_mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *(int *)v46), 8), _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *v48), 8)));
                    *(unsigned int *)v47 = __dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_unpacklo_epi64(v52, v52), _mm_unpacklo_epi64(v52, v52)));
                    v56 = arm64g_calculate_condition(18, v49, 4, 0);
                    v47 += 4;
                    v48 += 1;
                    v49 += 4;
                    v46 += 4;
                } while (v56 & 1);
                if (!v45)
                {
                    *(unsigned int *)&v5[112] = v22;
                    return 1;
                }
            }
            else
            {
                v36 = iter & 15;
                v34 = v33 - v36;
                v37 = node + 8;
                iter1 = v8 + 8;
                v39 = v5 + 56;
                k = v34;
                do
                {
                    v41 = k;
                    v42 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(unsigned long long *)&*(double *)((char *)v37 - 8) ^ *(unsigned long long *)&*(double *)((char *)v39 - 8));
                    v43 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(unsigned long long *)&*(double *)v37 ^ *(unsigned long long *)&*(double *)v39);
                    *(unsigned long *)((char *)iter1 - 8) = v42;
                    *iter1 = v43;
                    v37 += 2;
                    iter1 += 2;
                    v39 += 2;
                    k = v41 - 16;
                } while (k);
                if (!v36)
                {
                    *(unsigned int *)&v5[112] = v22;
                    return 1;
                }
                v35 = v34;
                if (v36 >= 4)
                    goto LABEL_a472c0;
            }
        }
    }
    v57 = node + v34;
    v58 = v34 + v5 + 48;
    iter2 = v8 + v34;
    j = v33 - v34;
    do
    {
        v61 = j;
        *(char *)iter2 = *v58 ^ *(char *)v57;
        iter2 += 1;
        j = v61 - 1;
        v57 += 1;
        v58 += 1;
    } while (j);
    *(unsigned int *)&v5[112] = v22;
    return 1;
}
