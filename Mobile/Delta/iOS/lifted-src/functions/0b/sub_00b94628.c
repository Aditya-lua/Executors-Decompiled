/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb94628..0xb9475c (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b94628_0 {
    char padding_0[8];
    void* field_8;
    unsigned long long field_10;
} st_b94628_0;

typedef struct st_b94628_1 {
    unsigned long long field_0;
    void* field_8;
    unsigned long long field_10;
} st_b94628_1;


st_b94628_1 * sub_b94628(st_b94628_1 *a0, st_b94628_0 **a1)
{
    st_b94628_0 *v2;  // x8
    unsigned long v3;  // cc_dep1
    unsigned long long ptr;  // x0
    void* v13;  // x8
    unsigned long long v14;  // x9
    unsigned long long v15;  // x11
    unsigned long long v16;  // x9
    void* v17;  // x10
    unsigned long long v18;  // x9
    unsigned long long v19;  // x10
    uint128_t *node;  // x12
    uint128_t *iter;  // x13
    unsigned long v4;  // cc_dep2
    unsigned long long i;  // x14
    unsigned long long v23;  // x14
    uint128_t v24;  // q1
    void* iter1;  // x11
    unsigned long long v27;  // x9
    void* v28;  // x10
    unsigned long long v29;  // x9
    unsigned long long v5;  // x19
    unsigned long long v6;  // x1
    unsigned long long v7;  // 4110
    unsigned long long v8;  // 4102
    unsigned long long v9;  // 4110
    unsigned long long v10;  // 4102
    void* v11;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a1;
    v3 = v2;
    v4 = a1[1];
    if (v2 != a1[1])
    {
        *a1 = v2 + 1;
        v5 = v2->field_10;
        v6 = v5 * 4;
        if (v5 <= 0x3fffffffffffffff)
        {
            v7 = arm64g_calculate_condition(4, v3, v4, 0);
            v8 = arm64g_calculate_condition(148, (v7 & 1 ? v6 : 0x20000000), (v7 & 1 ? 0x7ffffffffffffffc : 0), 0);
            if (v8 & 1)
                goto LABEL_b9467c;
        }
        else
        {
            v9 = arm64g_calculate_condition(4, v3, v4, 0);
            v10 = arm64g_calculate_condition(144, (v9 & 1 ? v6 : 0x20000000), (v9 & 1 ? 0x7ffffffffffffffc : 0), 0);
            if (v10 & 1)
            {
LABEL_b9467c:
                if (v6)
                {
                    v11 = v2->field_8;
                    ptr = _malloc(v6);
                    if (!ptr)
                        sub_c6b970(4, v6);
                    v13 = ptr;
                    if (v5)
                    {
                        v14 = v5 - 1;
                        if (v5 < v14)
                            v14 = v5;
                        if (8 > v14)
                        {
                            v15 = 0;
                            v16 = v5;
                            v17 = v11;
                        }
                        else
                        {
                            v18 = v14 + 1;
                            v19 = v18 & 7;
                            if (!(v18 & 7))
                                v19 = 8;
                            v15 = v18 - v19;
                            v16 = v5 - v15;
                            v17 = v11 + v15 * 4;
                            node = v11 + 16;
                            iter = v13 + 16;
                            i = v15;
                            do
                            {
                                v23 = i;
                                v24 = *node;
                                *(int128_t *)((char *)iter - 16) = *(int128_t *)((char *)node - 16);
                                *iter = v24;
                                node += 2;
                                iter += 2;
                                i = v23 - 8;
                            } while (i);
                        }
                        iter1 = v13 + v15 * 4;
                        do
                        {
                            v27 = v16;
                            if (v17 == v11 + v5 * 4)
                                break;
                        } while ((v28 = v17 + 4, *(int *)iter1 = *(int *)v17, iter1 += 4, v16 = v27 - 1, v17 += 4, v27 != 1));
                    }
                    v29 = v5;
                }
                else
                {
                    v29 = 0;
                    v13 = 4;
                }
                a0->field_0 = v29;
                a0->field_8 = v13;
                a0->field_10 = v5;
                return a0;
            }
        }
        a0 = sub_c6b970(0);
    }
    a0->field_0 = 0x8000000000000000;
    return a0;
}
