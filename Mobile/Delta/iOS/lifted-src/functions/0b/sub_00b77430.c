/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb77430..0xb77760 (816 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b77430_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_b77430_0;

typedef struct st_b77430_1 {
    long long field_0;
    void* field_8;
    char padding_10[8];
    void* field_18;
    char padding_20[8];
    void* field_28;
    char padding_30[8];
    void* field_38;
} st_b77430_1;


double sub_b77430(st_b77430_0 *a0, st_b77430_1 *a1)
{
    long long v4;  // x23
    unsigned long long v5;  // x20
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep1
    unsigned long v12;  // cc_dep2
    unsigned long v13;  // cc_ndep
    unsigned long long v14;  // 4110
    unsigned long long v15;  // 4102
    unsigned long long v6;  // x25
    unsigned long long v16;  // 4110
    unsigned long long v17;  // 4102
    unsigned long long v18;  // 4110
    unsigned long long v19;  // 4102
    unsigned long long v7;  // x24
    unsigned long long v20;  // 4110
    unsigned long long v21;  // 4102
    unsigned long long ptr;  // x0
    unsigned long long v26;  // x22
    unsigned long long v27;  // x2
    unsigned long long iter;  // x24
    void* v29;  // x8
    void* j;  // x9
    unsigned long long v31;  // x10
    uint128_t *v32;  // x13
    unsigned long long v33;  // x10
    unsigned long long v34;  // x11
    uint128_t *node;  // x13
    uint128_t *iter1;  // x9
    unsigned long long i;  // x14
    unsigned long long v38;  // x14
    uint128_t v39;  // q1
    void* v42;  // x13
    unsigned long long v43;  // x8
    void* v44;  // x9
    unsigned long long v45;  // x10
    void* l;  // x10
    unsigned long long v47;  // x14
    unsigned long long v48;  // x11
    unsigned long long v49;  // x12
    uint128_t *iter2;  // x14
    uint128_t *v51;  // x13
    unsigned long long v8;  // 4110
    unsigned long long k;  // x15
    unsigned long long v53;  // x15
    uint128_t v54;  // q1
    unsigned long long v9;  // 4102
    uint128_t v0;  // [bp-0x68]
    unsigned long long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a1->field_0;
    v5 = (unsigned long long)a1->padding_20;
    if (v4)
    {
        v6 = a1->field_18 - a1->field_8 >> 3;
        if (!v5)
            goto LABEL_b774b4;
        v6 += a1->field_38 - a1->field_28 >> 3;
        v7 = v6 * 8;
        if (v6 <= 0x1fffffffffffffff)
        {
            v8 = arm64g_calculate_condition(v10, v11, v12, v13);
            v9 = arm64g_calculate_condition(132, (v8 & 1 ? v7 : 0x20000000), (v8 & 1 ? 0x7ffffffffffffff8 : 0), 0);
            if (!(v9 & 1))
                goto LABEL_b774f8;
        }
        else
        {
            v14 = arm64g_calculate_condition(v10, v11, v12, v13);
            v15 = arm64g_calculate_condition(128, (v14 & 1 ? v7 : 0x20000000), (v14 & 1 ? 0x7ffffffffffffff8 : 0), 0);
            if (!(v15 & 1))
                goto LABEL_b774f8;
        }
    }
    else if (v5)
    {
        v6 = a1->field_38 - a1->field_28 >> 3;
LABEL_b774b4:
        v7 = v6 * 8;
        if (v6 <= 0x1fffffffffffffff)
        {
            v16 = arm64g_calculate_condition(v10, v11, v12, v13);
            v17 = arm64g_calculate_condition(148, (v16 & 1 ? v7 : 0x20000000), (v16 & 1 ? 0x7ffffffffffffff8 : 0), 0);
            if (v17 & 1)
                goto LABEL_b774f8;
        }
        else
        {
            v18 = arm64g_calculate_condition(v10, v11, v12, v13);
            v19 = arm64g_calculate_condition(144, (v18 & 1 ? v7 : 0x20000000), (v18 & 1 ? 0x7ffffffffffffff8 : 0), 0);
            if (v19 & 1)
                goto LABEL_b774f8;
        }
    }
    else
    {
        v6 = 0;
        v7 = 0;
        v20 = arm64g_calculate_condition(v10, v11, v12, v13);
        v21 = arm64g_calculate_condition(132, (v20 & 1 ? 0 : 0x20000000), (v20 & 1 ? 0x7ffffffffffffff8 : 0), 0);
        if (!(v21 & 1))
        {
LABEL_b774f8:
            if (v7)
            {
                ptr = _malloc(v7);
                if (!ptr)
                {
                    sub_c6b970(8, v7);
                    __debugbreak();
                }
                v26 = ptr;
                v0 = CONCAT(ptr, v6);
                v1 = 0;
                if (!v4)
                    goto LABEL_b77628;
LABEL_b77518:
                v27 = a1->field_18 - a1->field_8 >> 3;
                if (v5)
                    v27 += a1->field_38 - a1->field_28 >> 3;
                if (v6 < v27)
                    goto LABEL_b77644;
LABEL_b77544:
                iter = 0;
                if (v4)
                    goto LABEL_b7754c;
            }
            else
            {
                v6 = 0;
                v26 = 8;
                v0 = CONCAT(8, 0);
                v1 = 0;
                if (v4)
                    goto LABEL_b77518;
LABEL_b77628:
                if (!v5)
                {
                    iter = 0;
LABEL_b77684:
                    v1 = iter;
LABEL_b776f4:
                    a0->field_0 = v0;
                    a0->field_10 = v1;
                    return (unsigned long long)v0;
                }
                if (a1->field_38 - a1->field_28 >> 3 <= v6)
                    goto LABEL_b77544;
LABEL_b77644:
                sub_c6c0cc(&v0, 0);
                v26 = *(unsigned long long *)((void*)&v0 + 8);
                iter = v1;
                if (v4)
                {
LABEL_b7754c:
                    v29 = a1->field_18;
                    j = a1->field_8;
                    if (j != v29)
                    {
                        v31 = v29 - j - 8;
                        if (v31 >= 56 && !(v32 = iter * 8 + v26, v32 - j < 32))
                        {
                            v33 = (v31 >> 3) + 1;
                            v34 = v33 & 0x3ffffffffffffffc;
                            iter += v34;
                            node = v32 + 1;
                            iter1 = j + 16;
                            i = v33 & 0x3ffffffffffffffc;
                            do
                            {
                                v38 = i;
                                v39 = *iter1;
                                *(int128_t *)((char *)node - 16) = *(int128_t *)((char *)iter1 - 16);
                                *node = v39;
                                node += 2;
                                iter1 += 2;
                                i = v38 - 4;
                            } while (i);
                            if (v33 == v34)
                                goto LABEL_b775d8;
                            j += v34 * 8;
                        }
                        do
                        {
                            *(long long *)(v26 + iter * 8) = *(long long *)j;
                            iter += 1;
                            j += 8;
                        } while (j != v29);
                    }
LABEL_b775d8:
                    if (a1->padding_10)
                        _free(v4);
                }
            }
            if (v5)
            {
                v42 = a1->field_28;
                v43 = (unsigned long long)a1->padding_30;
                v44 = a1->field_38;
                if (v42 != v44)
                {
                    v45 = v44 - v42 - 8;
                    if (56 > v45)
                    {
                        l = v42;
                    }
                    else
                    {
                        v47 = iter * 8;
                        if (32 > v47 + v26 - v42)
                        {
                            l = v42;
                        }
                        else
                        {
                            v48 = (v45 >> 3) + 1;
                            v49 = v48 & 0x3ffffffffffffffc;
                            iter += v49;
                            l = v42 + v49 * 8;
                            iter2 = v47 + v26 + 16;
                            v51 = v42 + 16;
                            k = v48 & 0x3ffffffffffffffc;
                            do
                            {
                                v53 = k;
                                v54 = *v51;
                                *(int128_t *)((char *)iter2 - 16) = *(int128_t *)((char *)v51 - 16);
                                *iter2 = v54;
                                iter2 += 2;
                                v51 += 2;
                                k = v53 - 4;
                            } while (k);
                            if (v48 == v49)
                                goto LABEL_b776e4;
                        }
                    }
                    do
                    {
                        *(long long *)(v26 + iter * 8) = *(long long *)l;
                        iter += 1;
                        l += 8;
                    } while (l != v44);
                }
LABEL_b776e4:
                v1 = iter;
                if (v43)
                    _free(v5);
                goto LABEL_b776f4;
            }
            goto LABEL_b77684;
        }
    }
    sub_c6b970(0, v7);
    __debugbreak();
}
