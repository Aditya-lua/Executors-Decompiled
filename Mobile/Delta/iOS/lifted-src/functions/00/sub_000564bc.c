/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x564bc..0x56620 (356 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_564bc_5 {
    char padding_0[8];
    unsigned long long field_8;
} st_564bc_5;

typedef struct st_564bc_6 {
    char padding_0[16];
    long long field_10;
} st_564bc_6;

typedef struct st_564bc_1 {
    char padding_0[49];
    char field_31;
} st_564bc_1;

typedef struct st_564bc_2 {
    char padding_0[32];
    struct st_564bc_3 *field_20;
    char padding_28[8];
    struct st_564bc_4 *field_30;
    unsigned long long field_38;
} st_564bc_2;

typedef struct st_564bc_4 {
    unsigned long long field_0;
} st_564bc_4;

typedef struct st_564bc_3 {
    struct st_564bc_1 *field_0;
} st_564bc_3;

typedef struct st_564bc_0 {
    char field_0;
} st_564bc_0;

extern char g_f0ce38;

int sub_564bc(st_564bc_6 *a0, st_564bc_2 *a1)
{
    char v5;  // x8
    char v6;  // x22
    unsigned long long v15;  // x23
    unsigned long long v16;  // 4110
    unsigned long long v17;  // 4102
    unsigned long long v18;  // 4110
    unsigned long long v19;  // 4102
    unsigned long long idx;  // x21
    unsigned long v7;  // x23
    char v8;  // x23
    st_564bc_5 *v9;  // x0
    unsigned long i;  // x22
    unsigned long v11;  // cc_op
    unsigned long v12;  // cc_dep1
    unsigned long v13;  // cc_dep2
    unsigned long v14;  // cc_ndep
    st_564bc_0 **v0;  // [bp-0x68], Other Possible Types: char
    st_564bc_0 *v1;  // [bp-0x60]
    st_564bc_1 *v2;  // [bp-0x58]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v5 = (char)a1->padding_28;
    if (v5)
    {
        if (a1->field_38)
        {
            v6 = 0;
            v7 = 1;
            do
            {
                v8 = v7;
                sub_56810(a0->field_10, (char *)a1->field_20 + v6);
                v9 = sub_3f3c0(a0->field_10, (char *)a1->field_20 + v6);
                v9->field_8 = *(long long *)((char *)a1->field_30 + v6);
                v5 = (char)a1->padding_28;
            } while (v5 > v8 && (v6 += 8, v7 = v8 + 1, v8 < a1->field_38));
        }
        i = a1->field_38;
        v11 = 4;
        v12 = i;
        v13 = v5;
        v14 = 0;
        if (v5 > i)
        {
            v15 = i * 8;
            do
            {
                sub_56810(a0->field_10, (char *)a1->field_20 + v15);
                *(unsigned long long *)(sub_3f3c0(a0->field_10, (char *)a1->field_20 + v15) + 8) = 0;
                i += 1;
                v5 = (char)a1->padding_28;
                v15 += 8;
                v11 = 4;
                v12 = i;
                v13 = v5;
                v14 = 0;
            } while (i < v5);
        }
    }
    if (!(g_f0ce38 & 1))
        return 1;
    if (a0[1].field_10)
    {
        v16 = arm64g_calculate_condition(v11 | 16, v12, v13, v14);
        v17 = arm64g_calculate_condition(20, (v16 & 1 ? v5 : 0x40000000), 0, 0);
        if (!(v17 & 1))
            return 1;
    }
    else
    {
        v18 = arm64g_calculate_condition(v11 | 16, v12, v13, v14);
        v19 = arm64g_calculate_condition(16, (v18 & 1 ? v5 : 0x40000000), 0, 0);
        if (!(v19 & 1))
            return 1;
    }
    idx = 0;
    do
    {
        v2 = *(long long *)&a1->field_20[idx];
        if (*(char *)(*(long long *)&a1->field_20[idx] + 49) == 1)
        {
            sub_103a8(a0[1].field_10, &v2);
            v5 = (char)a1->padding_28;
        }
    } while ((idx += 1, v5 > idx));
    return 1;
}
