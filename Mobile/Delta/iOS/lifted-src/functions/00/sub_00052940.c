/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x52940..0x52a10 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_52940_0 {
    char padding_0[88];
    char field_58;
    char padding_59[39];
    unsigned long long field_80;
    unsigned long long field_88;
} st_52940_0;

typedef struct st_52940_4 {
    char padding_0[8];
    struct st_52940_1 *field_8;
} st_52940_4;

typedef struct st_52940_1 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[20];
    unsigned long long field_20;
} st_52940_1;

typedef struct st_52940_2 {
    char padding_0[32];
    struct st_52940_3 *field_20;
    struct st_52940_1 *field_28;
} st_52940_2;

typedef struct st_52940_3 {
    struct st_52940_1 *field_0;
} st_52940_3;

extern unsigned int g_f00d10;

long long sub_52940(st_52940_0 *a0, st_52940_2 *a1)
{
    unsigned long long v4;  // x22
    unsigned long long v5;  // x23
    st_52940_1 *v14;  // x27
    unsigned long long v15;  // 4112
    unsigned long long v16;  // 4102
    unsigned long long v17;  // 4112
    unsigned long long v18;  // 4102
    st_52940_4 *v19;  // x0
    st_52940_1 **iter;  // x24
    unsigned int v7;  // w8
    unsigned long long i;  // x26
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep2
    unsigned long v12;  // cc_ndep
    unsigned long long v13;  // x26
    unsigned long v0;  // [bp-0x70]
    st_52940_1 *v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a0->field_80;
    v5 = a0->field_88;
    if (!a1->field_28)
        return (long long)(v5 - v4) >> 4;
    iter = a1->field_20;
    v7 = g_f00d10;
    i = a1->field_28 * 8;
    v9 = cc_dep1;
    do
    {
        v13 = i;
        v14 = *iter;
        if (v14)
        {
            v15 = arm64g_calculate_condition(v10 | 16, v9, v11, v12);
            v16 = arm64g_calculate_condition(19, (v15 & 1 ? v14->field_8 : 0), (v15 & 1 ? v7 : 0), 0);
            if (v16 & 1)
                continue;
        }
        else
        {
            v17 = arm64g_calculate_condition(v10 | 16, v9, v11, v12);
            v18 = arm64g_calculate_condition(16, (v17 & 1 ? v14->field_8 : 0), (v17 & 1 ? v7 : 0), 0);
            if (v18 & 1)
                continue;
        }
        sub_53ee8(&a0->field_58, &v14->field_20);
        v19 = sub_fb84(&a0->field_58, &v14->field_20);
        v0 = v14->field_20;
        v1 = v19->field_8;
        sub_15cac(&a0->field_80, &v0);
        v19->field_8 = v14;
        v7 = g_f00d10;
        iter += 1;
        i = v13 - 8;
        v10 = 4;
        v11 = 8;
        v12 = 0;
        v9 = v13;
    } while (i);
    return (long long)(v5 - v4) >> 4;
}
