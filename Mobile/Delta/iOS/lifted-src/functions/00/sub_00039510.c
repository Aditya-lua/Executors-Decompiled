/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x39510..0x395b0 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_39510_2 {
    char padding_0[8];
    uint128_t field_8;
    uint128_t field_18;
    uint128_t field_28;
} st_39510_2;

typedef struct st_39510_1 {
    double field_0;
    uint128_t field_8;
    uint128_t field_18;
    uint128_t field_28;
    uint128_t field_38;
} st_39510_1;

typedef struct st_39510_0 {
    uint128_t field_0;
    char field_8;
    char padding_9[7];
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
} st_39510_0;


st_39510_0 * sub_39510(st_39510_0 *a0, unsigned long long a1, st_39510_1 *a2)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9
    unsigned long v10;  // 4110
    unsigned long long v11;  // 4112
    unsigned long long v12;  // 4110
    unsigned long long v13;  // 4102
    unsigned long long v14;  // 4110
    unsigned long long v15;  // 4102
    unsigned long long v16;  // x8
    uint128_t *iter;  // x9
    unsigned long long j;  // x10
    unsigned long long v19;  // x10
    st_39510_2 *v2;  // x11
    uint128_t v20;  // q0
    unsigned long long *node;  // x9
    unsigned long long i;  // x8
    unsigned long long v24;  // x8
    unsigned long long v3;  // x9
    unsigned long v4;  // 4110
    unsigned long v5;  // cc_op
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // cc_dep2
    unsigned long long v8;  // x8
    unsigned long long v9;  // 4112

    if (!a1)
        return a0;
    if (a1 > 23)
    {
        v0 = a1 - 1;
        v1 = v0 * 16;
        v2 = (char *)&a0->field_0 + 8;
        v3 = &v2->padding_0[v1];
        if (a0 <= (char *)a0 + v1)
        {
            v4 = arm64g_calculate_condition(36, a1, 23, 0);
            v5 = 4;
            v6 = (v4 & 1 ? v3 : 0);
            v7 = (v4 & 1 ? v2 : 0);
            v8 = v0 >> 60;
            v9 = arm64g_calculate_condition(36, v6, v7, 0);
            if (!(v9 & 1))
                goto LABEL_3953e;
LABEL_3953d:
            v12 = arm64g_calculate_condition(v5 | 32, v6, v7, 0);
            v13 = arm64g_calculate_condition(20, (v12 & 1 ? v8 : 0), 0, 0);
            if (!(v13 & 1))
                goto LABEL_39544;
        }
        else
        {
            v10 = arm64g_calculate_condition(36, a1, 23, 0);
            v5 = 0;
            v6 = (v10 & 1 ? v3 : 0);
            v7 = (v10 & 1 ? v2 : 0);
            v8 = v0 >> 60;
            v11 = arm64g_calculate_condition(32, v6, v7, 0);
            if (v11 & 1)
                goto LABEL_3953d;
LABEL_3953e:
            v14 = arm64g_calculate_condition(v5 | 32, v6, v7, 0);
            v15 = arm64g_calculate_condition(16, (v14 & 1 ? v8 : 0), 0, 0);
            if (!(v15 & 1))
            {
LABEL_39544:
                if (&(&a2->field_0)[1] <= a0 || &(&a0->field_0)[a1] <= a2)
                {
                    v16 = a1 & 0x1ffffffffffffffc;
                    iter = &a0->field_10;
                    j = v16;
                    do
                    {
                        v19 = j;
                        v20 = *(unsigned long long *)&a2->field_0;
                        *(uint128_t *)((char *)iter - 32) = v20;
                        *(uint128_t *)((char *)iter - 16) = v20;
                        *iter = v20;
                        iter[1] = v20;
                        iter += 4;
                        j = v19 - 4;
                    } while (j);
                    if (v16 == a1)
                        return a0;
LABEL_39560:
                    node = (char *)&(&a0->field_0)[v16] + 8;
                    i = a1 - v16;
                    do
                    {
                        v24 = i;
                        *(double *)((char *)node - 8) = a2->field_0;
                        *node = 0;
                        node += 2;
                        i = v24 - 1;
                    } while (i);
                    return a0;
                }
            }
        }
    }
    v16 = 0;
    goto LABEL_39560;
}
