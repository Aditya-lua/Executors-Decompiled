/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f7f48..0x1f8288 (832 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f7f48_1 {
    struct st_1f7f48_2 *field_0;
    void* field_8;
} st_1f7f48_1;

typedef struct st_1f7f48_3 {
    struct st_1f7f48_2 *field_0;
    void* field_8;
    char padding_10[8];
    struct st_1f7f48_2 *field_18;
} st_1f7f48_3;

typedef struct st_1f7f48_2 {
    unsigned int field_0;
} st_1f7f48_2;

typedef struct st_1f7f48_0 {
    char field_0;
} st_1f7f48_0;

extern unsigned int g_fffffffffffffff8;

long long sub_1f7f48(st_1f7f48_1 *a0, st_1f7f48_3 *a1)
{
    unsigned int v16;  // w21
    void* v17;  // x23
    unsigned int *v26;  // x8
    void* v27;  // x9
    void* v28;  // x10
    unsigned long long v29;  // 4115
    uint128_t *node;  // x10
    unsigned long v31;  // x11
    void* i;  // x12
    void* v33;  // x12
    uint128_t *v34;  // x13
    uint128_t v35;  // q1
    unsigned long long v18;  // x26
    void* iter;  // x9
    unsigned int v38;  // w11
    void* v39;  // x10
    unsigned long long v41;  // 4127
    void* v42;  // x8
    void* v43;  // x9
    uint128_t *iter1;  // x9
    void* j;  // x10
    void* k;  // x21
    void* v46;  // x10
    __m128i v47;  // q1
    void* v20;  // x27
    unsigned int v21;  // w28
    unsigned long v22;  // x22
    unsigned int v23;  // w24
    unsigned long long v24;  // x25
    unsigned int v25;  // w0
    void* v0;  // [bp-0x118]
    __m128i v1;  // [bp-0x110]
    void* v2;  // [bp-0xf8]
    void* v3;  // [bp-0xf0]
    st_1f7f48_0 **v4;  // [bp-0xe8], Other Possible Types: char
    st_1f7f48_0 *v5;  // [bp-0xe0]
    void* v6;  // [bp-0xd8]
    void* v7;  // [bp-0xd0]
    void* v8;  // [bp-0xc8]
    void* v9;  // [bp-0xc0]
    void* v10;  // [bp-0xb0]
    void* v11;  // [bp-0xa0]
    void* v12;  // [bp-0x90]
    void* v13;  // [bp-0x80]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    v5 = &v4;
    v6 = 0;
    v4 = &v5;
    if (a0->field_8 < a1->field_8)
        v16 = (unsigned int)a0->field_8;
    else
        v16 = (unsigned int)a1->field_8;
    v13 = 0;
    v11 = (void*)0;
    v12 = (void*)0;
    v9 = (void*)0;
    v10 = (void*)0;
    v7 = 0;
    v8 = 0;
    sub_1f10ac();
    sub_1f7d40(a0 + 3, &v12);
    if (sub_1eca80(a0) && sub_1eca80(a1))
    {
        sub_1ebcb0(&v9);
    }
    else if (a0->field_8 || a1->field_8)
    {
        sub_1f7538(a0, 1);
    }
    if (v16 >= 3)
    {
        v17 = 0;
        v0 = v16;
        v18 = 0xfffffffffffffffe;
        k = 2;
        do
        {
            v17 += 1;
            v20 = k - 1;
            v21 = *(int *)((char *)a1->field_0 + 0x4 * v20);
            v22 = *(int *)((char *)a1->field_0 + 0x4 * k);
            if ((unsigned int)v22 != v21)
            {
                v23 = *(int *)((char *)a0->field_0 + 0x4 * v20);
                sub_1fb614(&v6, k);
                if (v21 > (unsigned int)v22)
                {
                    v2 = k & 0x7ffffffffffffff8;
                    v3 = k & &g_fffffffffffffff8;
                    v1 = (__m128i)(CONCAT(k & 0xffffffff | (k & 0xffffffff) * 0x100000000, k & 0xffffffff | (k & 0xffffffff) * 0x100000000));
                    do
                    {
                        v24 = (v22 * 4 | v22 >> 62) & 0x3fffffffc & 0x3ffffffff;
                        if (v23 <= sub_1f3f34(a0, (char *)a1->field_18 + v24, k))
                            continue;
                        sub_1f7538(&v9, k);
                        v25 = sub_1f3f34(&v9, &a1->field_18[v22 & 0xffffffff], k);
                        if (v25 != *(int *)((unsigned long long)v9 + v20 * 4))
                            continue;
                        v26 = a1->field_18;
                        v27 = v6;
                        if (7 >= k)
                        {
LABEL_1f80f8:
                            v28 = 0;
                            goto LABEL_1f80fc;
                        }
                        else
                        {
                            v28 = 0;
                            v29 = arm64g_calculate_condition(33, v22 & 0xffffffff, v17 & 0xffffffff, 0);
                            if (v29 & 1 || v17 > 0xffffffff)
                            {
LABEL_1f80fc:
                                iter = v27 + v28 * 4;
                                v38 = (unsigned int)v22 + (unsigned int)v28;
                                v39 = v18 + v28;
                                do
                                {
                                    *(unsigned int *)iter = v26[v38];
                                    iter += 4;
                                    v38 += 1;
                                    v41 = arm64g_calculate_condition(50, v39, 1, 0);
                                    v39 += 1;
                                } while (v41 & 1);
LABEL_1f811c:
                                sub_1ee86c(&v10 + 1, v25, &v6);
                                v42 = v9;
                                if (8 > k)
                                {
                                    v43 = 0;
                                }
                                else
                                {
                                    iter1 = v42 + 16;
                                    j = v3;
                                    do
                                    {
                                        v46 = j;
                                        v47 = *iter1;
                                        *(uint128_t *)((char *)iter1 - 16) = _mm_add_epi32(*(int128_t *)((char *)iter1 - 16), v1);
                                        *iter1 = _mm_add_epi32(v47, v1);
                                        iter1 += 2;
                                        j = v46 - 8;
                                    } while (j);
                                    v43 = v2;
                                    if (k == v2)
                                        continue;
                                }
                                do
                                {
                                    *(unsigned int *)((char *)v42 + 0x4 * v43) = *(int *)((char *)v42 + 0x4 * v43) + (unsigned int)k;
                                    v43 += 1;
                                } while (k != v43);
                            }
                            else
                            {
                                if (v27 - (v24 + (char *)v26) >= 32)
                                {
                                    node = v27 + 16;
                                    v31 = v22;
                                    i = v3;
                                    do
                                    {
                                        v33 = i;
                                        v34 = &v26[v31 & 0xffffffff];
                                        v35 = v34[1];
                                        *(uint128_t *)((char *)node - 16) = *v34;
                                        *node = v35;
                                        node += 2;
                                        v31 = (unsigned int)v31 + 8;
                                        i = v33 - 8;
                                    } while (i);
                                    v28 = v2;
                                    if (k == v2)
                                        goto LABEL_1f811c;
                                    goto LABEL_1f80fc;
                                }
                                goto LABEL_1f80f8;
                            }
                        }
                    } while ((v22 += k, v21 > (unsigned int)v22));
                }
            }
        } while ((k += 1, v18 -= 1, k != v0));
    }
    sub_1f7d40(a0, &v9);
    sub_1f7d40(&a0[1].field_8, &v10 + 1);
    sub_1f2420(a0);
    sub_1eccac(&v6);
    sub_1eccac(&v12);
    sub_1eccac(&v10 + 1);
    return sub_1eccac(&v9);
}
