/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3f684..0x3f8c4 (576 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3f684_1 {
    char padding_0[88];
    struct st_3f684_2 *field_58;
    unsigned long long field_60;
    char padding_68[40];
    long long field_90;
} st_3f684_1;

typedef struct st_3f684_4 {
    char padding_0[48];
    unsigned int field_30;
    char padding_34[36];
    long long field_58;
    char padding_60[128];
    char field_e0;
    char padding_e1[39];
    char field_108;
    char padding_109[39];
    char field_130;
    char padding_131[39];
    char field_158;
    char padding_159[79];
    char field_1a8;
    char padding_1a9[319];
    long long field_2e8;
    char padding_2f0[16];
    long long field_300;
    char padding_308[736];
    long long field_5e8;
    long long field_5f0;
    char field_5f8;
} st_3f684_4;

typedef struct st_3f684_6 {
    char padding_0[8];
    uint128_t field_8;
    uint128_t field_18;
    unsigned long long field_28;
} st_3f684_6;

typedef struct st_3f684_3 {
    char padding_0[56];
    struct st_3f684_0 *field_38;
} st_3f684_3;

typedef struct st_3f684_8 {
    unsigned long long field_0;
    char padding_8[736];
    unsigned long long field_2e8;
    unsigned long long field_2f0;
    char field_2f8;
} st_3f684_8;

typedef struct st_3f684_7 {
    unsigned long long field_0;
    char padding_8[16];
    unsigned long long field_18;
    char padding_20[736];
    unsigned long long field_300;
    unsigned long long field_308;
    char field_310;
} st_3f684_7;

typedef struct st_3f684_2 {
    unsigned long long field_0;
} st_3f684_2;

typedef struct st_3f684_0 {
    char field_0;
} st_3f684_0;

typedef struct st_3f684_5 {
    char padding_0[8];
    unsigned int field_8;
} st_3f684_5;


unsigned long long sub_3f684(st_3f684_4 *a0, st_3f684_3 *a1, st_3f684_1 *a2)
{
    unsigned long v6;  // x8
    char iter;  // x23
    unsigned long long v16;  // 4102
    unsigned long long v17;  // 4110
    unsigned long long v18;  // 4102
    char v19;  // x0
    st_3f684_5 *v20;  // x0
    char v21;  // x0
    st_3f684_6 *v22;  // x22
    st_3f684_6 *v23;  // x0
    unsigned long v24;  // x8
    uint128_t v25;  // q0
    char v8;  // x9
    st_3f684_7 *v26;  // x21
    st_3f684_8 *v27;  // x22
    unsigned long long v28;  // x0
    char v29;  // x24
    char v30;  // x25
    char v31;  // x0
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long long v11;  // 4110
    unsigned long long v12;  // 4102
    unsigned long long v13;  // 4110
    unsigned long long v14;  // 4102
    unsigned long long v15;  // 4110
    st_3f684_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_3f684_0 *v1;  // [bp-0x68]
    unsigned long v2;  // [bp-0x60]
    unsigned long v3;  // [bp-0x58]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v6 = a2->field_60;
    if (v6)
    {
        iter = 0;
        do
        {
            v3 = *(long long *)&a2->field_58[iter];
            v8 = *(long long *)&a1[1].padding_0[0];
            v9 = iter;
            v10 = v8;
            if (v8 > iter)
            {
                v2 = *(long long *)&a1->field_38[8 * iter];
                iter += 1;
                if (iter == v8)
                {
                    v11 = arm64g_calculate_condition(4, v9, v10, 0);
                    v12 = arm64g_calculate_condition(132, (v11 & 1 ? v6 : 0), (v11 & 1 ? v8 : 0), 0);
                    if (!(v12 & 1))
                        continue;
                }
                else
                {
                    v13 = arm64g_calculate_condition(4, v9, v10, 0);
                    v14 = arm64g_calculate_condition(128, (v13 & 1 ? v6 : 0), (v13 & 1 ? v8 : 0), 0);
                    if (!(v14 & 1))
                        continue;
                }
            }
            else
            {
                v2 = 0;
                iter += 1;
                if (iter == v8)
                {
                    v15 = arm64g_calculate_condition(4, v9, v10, 0);
                    v16 = arm64g_calculate_condition(148, (v15 & 1 ? v6 : 0), (v15 & 1 ? v8 : 0), 0);
                    if (v16 & 1)
                        continue;
                }
                else
                {
                    v17 = arm64g_calculate_condition(4, v9, v10, 0);
                    v18 = arm64g_calculate_condition(144, (v17 & 1 ? v6 : 0), (v17 & 1 ? v8 : 0), 0);
                    if (v18 & 1)
                        continue;
                }
            }
            if (sub_4489c(a0))
                break;
            v19 = sub_34930(&a0->field_e0, &v3);
            if (!v19 || !(*(char *)(v19 + 16) & 1))
            {
                if (!v2)
                {
                    sub_460d4(&a0->field_130, &v3);
                    v20 = sub_436f8(&a0->field_130, &v3);
                    v20->field_8 = 1;
                    memset(v20 + 1, 0, 36);
                }
                else
                {
                    v21 = sub_3a7e0(&a0->field_108, &v2);
                    if (v21)
                    {
                        v22 = (st_3f684_6 *)v21;
                        if (*(int *)(v21 + 8))
                        {
                            sub_460d4(&a0->field_130, &v3);
                            v23 = sub_436f8(&a0->field_130, &v3);
                            v24 = *(long long *)((char *)&v22->field_18 + 8);
                            v25 = *(int128_t *)((char *)&v22->field_8 + 8);
                            *(int128_t *)(v23->padding_0)[1] = *(int128_t *)(v22->padding_0)[1];
                            *(uint128_t *)((char *)&v23->field_8 + 8) = v25;
                            *(unsigned long *)((char *)&v23->field_18 + 8) = v24;
                        }
                    }
                }
            }
            v6 = a2->field_60;
        } while (a2->field_60 > iter);
    }
    v26 = &a0->field_2e8;
    sub_c84c(v26, a0->field_2e8);
    v27 = &a0->field_300;
    sub_c84c(v27, a0->field_300);
    sub_4c624(&a0->field_108, &a0->field_e0, &a0->field_130, a0->field_5f0, a0->field_5f8, a0->field_30 == 1, a0->field_58, a2->field_90, a0->field_5e8, &a0->field_158, v26, v27);
    v28 = sub_4eb3c(a2->field_90, a2->field_58, a2->field_60, &a0->field_1a8, &a0->field_108);
    if (a2->field_60)
    {
        v29 = 0;
        v30 = 0;
        do
        {
            v31 = sub_3a7e0(&a0->field_130, (char *)a2->field_58 + v29);
            if (v31)
                *(unsigned int *)(v31 + 8) = 0;
        } while ((v30 += 1, v29 += 8, a2->field_60 > v30));
    }
    sub_4db50(&a0->field_108, v26);
    sub_4dc7c(&a0->field_130, v27);
    return v28;
}
