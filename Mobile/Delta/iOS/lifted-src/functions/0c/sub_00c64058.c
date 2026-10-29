/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc64058..0xc641ac (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c64058_1 {
    struct st_c64058_0 *field_0;
    struct st_c64058_0 *field_8;
    unsigned long long field_10;
} st_c64058_1;

typedef struct st_c64058_0 {
    struct st_c64058_0 *field_0;
    struct st_c64058_0 *field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_c64058_0;


int sub_c64058(st_c64058_1 *a0, unsigned long long *a1)
{
    unsigned long long v2;  // x22
    unsigned long long v3;  // x24
    unsigned long v12;  // cc_op
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long long v15;  // 4102
    unsigned long v16;  // 4110
    unsigned long long v17;  // 4102
    unsigned long long v18;  // 4110
    unsigned long long v19;  // 4102
    unsigned long long v20;  // 4110
    unsigned long long v21;  // 4102
    st_c64058_0 *iter;  // x25
    st_c64058_0 *v22;  // x8
    st_c64058_0 *v23;  // x0
    st_c64058_0 *v24;  // x8
    unsigned long v5;  // x23
    unsigned long long v6;  // x26
    unsigned long v7;  // cc_dep1
    unsigned long v8;  // cc_dep2
    st_c64058_0 *v9;  // x20
    unsigned long long v10;  // x8
    unsigned long v11;  // 4110
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a1;
    v3 = a1[1];
    if (v3 < v2)
        return 0;
    iter = a0->field_8;
    if (!iter)
        return 1;
    v5 = v3 + 1;
    do
    {
        v6 = iter->field_18;
        v7 = v2;
        v8 = v6;
        if (v6 < v2)
            break;
        v9 = iter;
        iter = iter->field_8;
        v10 = v9->field_10;
        if (v6 <= v3)
        {
            v11 = arm64g_calculate_condition(36, v7, v8, 0);
            v12 = 4;
            v13 = (v11 & 1 ? v2 : 0x20000000);
            v14 = (v11 & 1 ? v10 : 0);
            v15 = arm64g_calculate_condition(148, v13, v14, 0);
            if (v15 & 1)
                goto LABEL_c640d8;
            goto LABEL_c640b8;
        }
        else
        {
            v16 = arm64g_calculate_condition(36, v7, v8, 0);
            v12 = 0;
            v13 = (v16 & 1 ? v2 : 0x20000000);
            v14 = (v16 & 1 ? v10 : 0);
            v17 = arm64g_calculate_condition(144, v13, v14, 0);
            if (!(v17 & 1))
            {
LABEL_c640b8:
                if (v2 <= v10)
                {
                    v18 = arm64g_calculate_condition(v12 | 144, v13, v14, 0);
                    v19 = arm64g_calculate_condition(36, (v18 & 1 ? v3 : 0), (v18 & 1 ? v10 : 0), 0);
                    if (v19 & 1)
                        goto LABEL_c6412c;
                }
                else
                {
                    v20 = arm64g_calculate_condition(v12 | 144, v13, v14, 0);
                    v21 = arm64g_calculate_condition(32, (v20 & 1 ? v3 : 0), (v20 & 1 ? v10 : 0), 0);
                    if (v21 & 1)
                    {
LABEL_c6412c:
                        v9->field_10 = v5;
                        continue;
                    }
                }
                if (v6 > v3)
                {
                    if (v2 <= v10)
                        continue;
                    v23 = sub_991b48();
                    if (!v23)
                        return (unsigned int)v23;
                    v23->field_0 = 0;
                    v23->field_8 = 0;
                    v23->field_10 = v5;
                    v23->field_18 = v6;
                    v24 = v9->field_0;
                    v23->field_0 = v24;
                    v23->field_8 = v9;
                    if (v24)
                        v24->field_8 = v23;
                    v9->field_0 = v23;
                    if (a0->field_8 == v9)
                        a0->field_8 = v23;
                    a0->field_10 = a0->field_10 + 1;
                }
                v9->field_18 = v2 - 1;
                break;
            }
            else
            {
LABEL_c640d8:
                if (a0->field_0 == v9)
                    a0->field_0 = v9->field_0;
                if (a0->field_8 == v9)
                    a0->field_8 = iter;
                v22 = v9->field_0;
                if (iter)
                    iter->field_0 = v22;
                if (v22)
                    v22->field_8 = iter;
                sub_991b54();
                v9->field_0 = 0;
                v9->field_8 = 0;
                sub_a6c2e4(v9, "ssl/quic/uint_set.c", 281);
            }
        }
    } while (iter);
    return 1;
}
