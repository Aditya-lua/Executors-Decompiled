/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1acbe8..0x1accc0 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1acbe8_1 {
    char padding_0[8];
    uint128_t field_8;
    uint128_t field_18;
    uint128_t field_28;
} st_1acbe8_1;

typedef struct st_1acbe8_0 {
    uint128_t field_0;
    char field_8;
    char padding_9[7];
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
} st_1acbe8_0;


st_1acbe8_0 * sub_1acbe8(unsigned long a0, st_1acbe8_0 *a1, st_1acbe8_0 *a2, st_1acbe8_0 *a3)
{
    unsigned long long v0;  // x8
    unsigned long v1;  // cc_dep1
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep1
    unsigned long v12;  // cc_dep2
    unsigned long long v13;  // 4129
    unsigned long v14;  // x9
    unsigned long v15;  // 4110
    unsigned long long v16;  // 4129
    unsigned long long v17;  // 4110
    unsigned long long v18;  // 4102
    unsigned long long v19;  // 4110
    unsigned long long v2;  // x9
    unsigned long long v20;  // 4102
    st_1acbe8_0 *node;  // x9
    st_1acbe8_0 *i;  // x8
    unsigned long long v23;  // x10
    unsigned long long v24;  // x11
    unsigned long long v25;  // x8
    uint128_t *v26;  // x12
    uint128_t *iter;  // x13
    unsigned long long j;  // x14
    unsigned long long v29;  // x14
    unsigned long long v3;  // x10
    uint128_t v30;  // q0
    uint128_t v31;  // q3
    uint128_t v32;  // q2
    uint128_t *v33;  // x12
    st_1acbe8_0 *v35;  // x8
    st_1acbe8_0 *v4;  // x11
    st_1acbe8_0 *v5;  // x10
    unsigned long long v6;  // x9
    st_1acbe8_0 *v7;  // x13
    st_1acbe8_1 *v8;  // x14
    unsigned long v9;  // 4110

    if (a1 == a2)
        return a1;
    v0 = a2 - a1 - 16;
    v1 = v0;
    if (240 <= v0)
    {
        v2 = v0 & 0xfffffffffffffff0;
        v3 = v2 | 8;
        v4 = (char *)a3 + v3;
        v5 = (char *)a1 + v3;
        v6 = v2 + 16;
        v7 = (char *)a3 + v6;
        v8 = (char *)&a1->field_0 + 8;
        if ((char *)&a3->field_0 + 8 < (char *)a1 + v6)
        {
            v9 = arm64g_calculate_condition(52, v1, 240, 0);
            v10 = 4;
            v11 = (v9 & 1 ? v8 : 0x20000000);
            v12 = (v9 & 1 ? v7 : 0);
            v13 = arm64g_calculate_condition(36, v11, v12, 0);
            v14 = !(v13 & 1);
            if (a1 >= v4)
                goto LABEL_1acc62;
LABEL_1acc61:
            v17 = arm64g_calculate_condition(v10 | 128, v11, v12, 0);
            v18 = arm64g_calculate_condition(132, (v17 & 1 ? v5 : 0), (v17 & 1 ? a3 : 0), 0);
            if (!(v18 & 1))
                goto LABEL_1acc68;
        }
        else
        {
            v15 = arm64g_calculate_condition(52, v1, 240, 0);
            v10 = 0;
            v11 = (v15 & 1 ? v8 : 0x20000000);
            v12 = (v15 & 1 ? v7 : 0);
            v16 = arm64g_calculate_condition(32, v11, v12, 0);
            v14 = !(v16 & 1);
            if (a1 < v4)
                goto LABEL_1acc61;
LABEL_1acc62:
            v19 = arm64g_calculate_condition(v10 | 128, v11, v12, 0);
            v20 = arm64g_calculate_condition(128, (v19 & 1 ? v5 : 0), (v19 & 1 ? a3 : 0), 0);
            if (!(v20 & 1))
            {
LABEL_1acc68:
                if (!(v14 & 1))
                {
                    v23 = (v0 >> 4) + 1;
                    v24 = v23 & 0x1ffffffffffffffc;
                    v25 = v24 * 16;
                    node = (char *)a3 + v25;
                    i = (char *)a1 + v25;
                    v26 = &a1->field_10;
                    iter = &a3->field_10;
                    j = v24;
                    do
                    {
                        v29 = j;
                        v30 = *(int128_t *)((char *)v26 - 16);
                        v31 = *v26;
                        v32 = v26[1];
                        v33 = v26 + 4;
                        *(int128_t *)((char *)iter - 32) = *(int128_t *)((char *)v26 - 32);
                        *(uint128_t *)((char *)iter - 16) = v30;
                        *iter = v31;
                        iter[1] = v32;
                        iter += 4;
                        v26 = v33;
                        j = v29 - 4;
                    } while (j);
                    if (v23 == v24)
                        return a2;
LABEL_1acc0c:
                    do
                    {
                        v35 = &i->field_8;
                        node->field_0 = i->field_0;
                        node = &node->field_8;
                        i = v35;
                    } while (i != a2);
                    return a2;
                }
            }
        }
    }
    node = a3;
    i = a1;
    goto LABEL_1acc0c;
}
