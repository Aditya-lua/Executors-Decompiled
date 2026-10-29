/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb07ef8..0xb08218 (800 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b07ef8_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[48];
    unsigned int field_40;
} st_b07ef8_0;


unsigned long long sub_b07ef8(void* a0, void* a1, void* a2, unsigned long long a3)
{
    unsigned long long iter;  // x22
    void* v3;  // x21
    unsigned long long v12;  // x14
    uint128_t v13;  // q1
    uint128_t *v14;  // x8
    uint128_t v15;  // q3
    unsigned long long v16;  // x9
    unsigned long long v17;  // x9
    unsigned long long v18;  // x12
    unsigned int v19;  // w8
    unsigned long long v20;  // 4128
    unsigned long long v21;  // w24
    void* v4;  // x20
    unsigned long long i;  // x25
    unsigned long long v23;  // x27
    unsigned long long v24;  // x8
    unsigned long long v25;  // x9
    unsigned long v26;  // cc_dep1
    unsigned long v27;  // cc_dep2
    unsigned long long v28;  // 4104
    unsigned long long v29;  // 4104
    unsigned long long v30;  // x23
    st_b07ef8_0 *v31;  // x0
    unsigned long v5;  // x8
    unsigned long long v32;  // x8
    unsigned long long v33;  // x9
    unsigned long long v34;  // x9
    unsigned long long v35;  // x10
    unsigned long long *v36;  // x11
    unsigned long long *iter1;  // x12
    unsigned long long *v38;  // x13
    unsigned long long k;  // x14
    unsigned long long v40;  // x14
    unsigned long v41;  // d0
    void* node;  // x21
    unsigned long v42;  // d1
    unsigned long long v44;  // x10
    void* v45;  // x11
    void* v46;  // x12
    unsigned int *v47;  // x13
    unsigned long long v48;  // x14
    __m128i v51;  // q0
    void* iter2;  // x20
    unsigned long long v55;  // 4136
    void* v56;  // x10
    char *v57;  // x11
    void* v58;  // x12
    unsigned long long j;  // x8
    unsigned long long v60;  // x8
    unsigned long v8;  // x8
    unsigned long long v9;  // x9
    unsigned long long v10;  // x10
    unsigned long long v11;  // x13
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    iter = a3;
    v3 = a2;
    v4 = a1;
    v5 = (int)a0[304];
    node = v3;
    iter2 = v4;
    if ((unsigned int)v5)
    {
        node = v3;
        iter2 = v4;
        v8 = v5;
        if (iter)
        {
            node = v3;
            iter2 = v4;
            v8 = v5;
            if (63 >= (unsigned int)v8)
            {
                v9 = iter - 1;
                v10 = 63 - v5;
                if (v9 >= v10)
                    v9 = v10;
                if (31 <= v9 && v4 - v3 >= 32 && v4 - (a0 + v5) - 240 >= 32)
                {
                    v11 = v9 + 1;
                    v12 = v11 & 96;
                    node = v3 + v12;
                    iter -= v12;
                    iter2 = v4 + v12;
                    v8 = v12 + v5;
                    v13 = (int128_t)v3[16];
                    v14 = a0 + 240 + v5;
                    v15 = v14[1];
                    *(uint128_t *)v4 = *(int128_t *)v3 ^ *v14;
                    *(uint128_t *)&v4[16] = v13 ^ v15;
                    v3 = node;
                    v4 = iter2;
                    v5 = v8;
                    if (v11 == v12)
                        goto LABEL_b07fa0;
                }
                v16 = 0;
                do
                {
                    v17 = v16;
                    *((char *)v4 + v17) = *(v5 + (char *)a0 + v17 + 240) ^ *((char *)v3 + v17);
                    v18 = v17 + 1;
                } while (iter - 1 != v17 && (v16 = v18, v5 + v17 < 63));
                v8 = v5 + v18;
                iter2 = v4 + v18;
                iter -= v18;
                node = v3 + v18;
LABEL_b07fa0:
            }
        }
        *(unsigned int *)&a0[304] = v8;
        if (!iter)
        {
            return 1;
        }
        else if ((unsigned int)v8 == 64)
        {
            *(unsigned int *)&a0[304] = 0;
            v19 = (int)a0[224];
            *(unsigned int *)&a0[224] = v19 + 1;
            v20 = arm64g_calculate_condition(49, v19, 1, 0);
            if (!(v20 & 1))
                *(int *)&a0[228] = (int)a0[228] + 1;
        }
    }
    v21 = (unsigned int)iter & 63;
    i = iter & 0xffffffffffffffc0;
    if (iter & 0xffffffffffffffc0)
    {
        v23 = (int)a0[224];
        do
        {
            v24 = i >> 6;
            if (v24 >= 0x10000000)
                v24 = 0x10000000;
            v25 = v23 + v24;
            v26 = v24;
            v27 = v25;
            if (v25 < v24)
            {
                v23 = 0;
                v28 = arm64g_calculate_condition(132, v26, v27, 0);
                if (!(v28 & 1))
                    goto LABEL_b0801e;
                goto LABEL_b0801d;
            }
            else
            {
                v23 = v25 & 0xffffffff;
                v29 = arm64g_calculate_condition(132, v26, v27, 0);
                if (v29 & 1)
                {
LABEL_b0801d:
                    continue;
                }
                else
                {
LABEL_b0801e:
                    v25 = 0;
                }
            }
            v30 = (v24 - v25) * 64;
            sub_9f0720();
            *(unsigned int *)&a0[224] = v23;
            if (!(unsigned int)v23)
                *(int *)&a0[228] = (int)a0[228] + 1;
            node += v30;
            iter2 += v30;
            i -= v30;
        } while (i);
    }
    if (!v21)
        return 1;
    *(uint128_t *)&a0[240] = 0;
    v31 = a0 + 240;
    memset(v31->padding_10, 0, 48);
    sub_9f0720(v31, v31, 64, (char *)v31 - 48, a0 + 224);
    v32 = iter & 63;
    if (4 > v32)
    {
        v33 = 0;
    }
    else
    {
        v33 = 0;
        if (iter2 - node >= 16 && iter2 - a0 - 240 >= 16)
        {
            if (16 > v32)
            {
                v34 = 0;
LABEL_b081cc:
                v44 = iter & 3;
                v45 = node + v34;
                v46 = iter2 + v34;
                v33 = v32 - v44;
                v47 = v34 + a0 + 240;
                v48 = v34 + v44 - v32;
                do
                {
                    v51 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_xor_si128(_mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *(int *)v45), 8), _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *v47), 8)));
                    *(unsigned int *)v46 = __dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_unpacklo_epi64(v51, v51), _mm_unpacklo_epi64(v51, v51)));
                    v55 = arm64g_calculate_condition(18, v48, 4, 0);
                    v46 += 4;
                    v47 += 1;
                    v48 += 4;
                    v45 += 4;
                } while (v55 & 1);
                if (!v44)
                {
                    *(unsigned int *)&a0[304] = v21;
                    return 1;
                }
            }
            else
            {
                v35 = iter & 15;
                v33 = v32 - v35;
                v36 = node + 8;
                iter1 = iter2 + 8;
                v38 = a0 + 248;
                k = v33;
                do
                {
                    v40 = k;
                    v41 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(unsigned long long *)&*(double *)((char *)v36 - 8) ^ *(unsigned long long *)&*(double *)((char *)v38 - 8));
                    v42 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(unsigned long long *)&*(double *)v36 ^ *(unsigned long long *)&*(double *)v38);
                    *(unsigned long *)((char *)iter1 - 8) = v41;
                    *iter1 = v42;
                    v36 += 2;
                    iter1 += 2;
                    v38 += 2;
                    k = v40 - 16;
                } while (k);
                if (!v35)
                {
                    *(unsigned int *)&a0[304] = v21;
                    return 1;
                }
                v34 = v33;
                if (v35 >= 4)
                    goto LABEL_b081cc;
            }
        }
    }
    v56 = node + v33;
    v57 = v33 + a0 + 240;
    v58 = iter2 + v33;
    j = v32 - v33;
    do
    {
        v60 = j;
        *(char *)v58 = *v57 ^ *(char *)v56;
        v58 += 1;
        j = v60 - 1;
        v56 += 1;
        v57 += 1;
    } while (j);
    *(unsigned int *)&a0[304] = v21;
    return 1;
}
