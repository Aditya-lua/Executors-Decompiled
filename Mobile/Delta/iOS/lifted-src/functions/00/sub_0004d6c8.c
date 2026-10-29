/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4d6c8..0x4d86c (420 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4d6c8_4 {
    char padding_0[120];
    long long field_78;
} st_4d6c8_4;

typedef struct st_4d6c8_0 {
    char padding_0[8];
    struct st_4d6c8_0 *field_8;
} st_4d6c8_0;

typedef struct st_4d6c8_1 {
    char padding_0[32];
    struct st_4d6c8_2 *field_20;
    struct st_4d6c8_0 *field_28;
    struct st_4d6c8_2 *field_30;
    struct st_4d6c8_0 *field_38;
} st_4d6c8_1;

typedef struct st_4d6c8_2 {
    long long field_0;
} st_4d6c8_2;

typedef struct st_4d6c8_3 {
    char field_0;
} st_4d6c8_3;

extern unsigned int g_f00b60;
extern st_4d6c8_0 *g_f00b70;

st_4d6c8_0 * sub_4d6c8(st_4d6c8_4 *a0, st_4d6c8_1 *a1)
{
    st_4d6c8_0 *j;  // x23
    st_4d6c8_0 *i;  // x21
    unsigned long v16;  // cc_op
    unsigned long v17;  // cc_dep1
    unsigned long v18;  // cc_dep2
    unsigned long v19;  // cc_ndep
    unsigned long long v20;  // 4110
    unsigned long long v21;  // 4102
    st_4d6c8_0 *v12;  // x22
    unsigned long v22;  // cc_dep1
    unsigned long v23;  // cc_dep2
    void* v24;  // x8
    st_4d6c8_0 *v25;  // w8
    unsigned long long v26;  // 4112
    unsigned long long v27;  // 4102
    st_4d6c8_0 *v13;  // x0
    unsigned long long v28;  // 4112
    unsigned long long v29;  // 4102
    unsigned long long v14;  // 4110
    unsigned long long v15;  // 4102
    st_4d6c8_3 **v0;  // [bp-0xb0], Other Possible Types: char
    st_4d6c8_3 *v1;  // [bp-0xa8]
    st_4d6c8_0 *v2;  // [bp-0xa0]
    st_4d6c8_0 *v3;  // [bp-0x90]
    st_4d6c8_0 *v4;  // [bp-0x80]
    unsigned long v5;  // [bp-0x70]
    unsigned int v6;  // [bp-0x68]
    unsigned int v7;  // [bp-0x68]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v1 = &v0;
    v0 = &v1;
    j = a1->field_28;
    if (j)
    {
        i = a1->field_38;
        if (a1->field_38)
        {
            v12 = 0;
            while (1)
            {
                sub_4cc90(a0, *(long long *)((char *)a1->field_30 + 0x8 * v12));
                if (v7 == 8)
                {
                    v5 = *(long long *)((char *)a1->field_20 + 0x8 * v12);
                    v13 = sub_158b8(a0->field_78, &v5);
                    if (!v13 || (int)v13->field_8)
                    {
                        v4 = 0;
                        v2 = (st_4d6c8_0 *)0;
                        v3 = (st_4d6c8_0 *)0;
                        goto LABEL_4d724;
                    }
                }
LABEL_4d724:
                sub_4a564(a0);
                v12 = &v12->padding_0[1];
                j = a1->field_28;
                i = a1->field_38;
                if (v12 < j)
                {
                    v14 = arm64g_calculate_condition(v16 | 48, v17, v18, v19);
                    v15 = arm64g_calculate_condition(36, (v14 & 1 ? v12 : 0x20000000), (v14 & 1 ? i : 0), 0);
                    if (v15 & 1)
                        break;
                }
                else
                {
                    v20 = arm64g_calculate_condition(v16 | 48, v17, v18, v19);
                    v21 = arm64g_calculate_condition(32, (v20 & 1 ? v12 : 0x20000000), (v20 & 1 ? i : 0), 0);
                    if (v21 & 1)
                        break;
                }
            }
        }
        v22 = j;
        v23 = i;
        if (j > i)
        {
            if (i)
            {
                v24 = (char *)a1->field_30 + 0x8 * i;
                if (*(long long *)((char *)v24 - 8))
                {
                    v25 = (st_4d6c8_0 *)*(int *)(*(long long *)((char *)v24 - 8) + 8);
                    if (v25 != (int)g_f00b70)
                    {
                        v26 = arm64g_calculate_condition(20, v22, v23, 0);
                        v27 = arm64g_calculate_condition(3, (v26 & 1 ? (unsigned long long)v25 : 0x40000000), (v26 & 1 ? g_f00b60 : 0), 0);
                        if (v27 & 1)
                            return 0;
                    }
                    else
                    {
                        v28 = arm64g_calculate_condition(20, v22, v23, 0);
                        v29 = arm64g_calculate_condition(0, (v28 & 1 ? (unsigned long long)v25 : 0x40000000), (v28 & 1 ? g_f00b60 : 0), 0);
                        if (v29 & 1)
                            return 0;
                    }
                }
            }
            do
            {
                v6 = 1;
                memset(&v6 | 4, 0, 36);
                sub_4a564(a0, *(long long *)((char *)a1->field_20 + 0x8 * i), &v6);
                i = &i->padding_0[1];
            } while (i < a1->field_28);
            return 0;
        }
    }
    else
    {
        i = a1->field_38;
    }
    if (i <= j)
        return 0;
    do
    {
        sub_4cc90(a0, *(long long *)((char *)a1->field_30 + 0x8 * j));
        j = &j->padding_0[1];
    } while (j < a1->field_38);
    return 0;
}
