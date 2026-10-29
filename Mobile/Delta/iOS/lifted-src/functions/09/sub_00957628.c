/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x957628..0x95772c (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_957628_2 {
    int field_0;
    char padding_4[140];
    unsigned long long field_90;
    char padding_98[64];
    struct st_957628_0 *field_d8;
} st_957628_2;

typedef struct st_957628_3 {
    char padding_0[24];
    struct st_957628_2 *field_18;
    char padding_20[100];
    unsigned int field_84;
    char padding_88[104];
    unsigned int field_f0;
    char padding_f4[208];
    unsigned int field_1c4;
    char field_1c8;
    char field_1c9;
    char padding_1ca[1798];
    unsigned int field_8d0;
    char padding_8d4[44];
    unsigned long long field_900;
    char padding_908[640];
    long long field_b88;
} st_957628_3;

typedef struct st_957628_0 {
    char padding_0[64];
    struct st_957628_1 *field_40;
    char padding_48[8];
    char field_50;
} st_957628_0;

typedef struct st_957628_1 {
    unsigned long long field_0;
} st_957628_1;


unsigned int sub_957628(st_957628_3 *a0, unsigned int a1, long long a2)
{
    unsigned int v2;  // w0
    unsigned long v3;  // cc_op
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // cc_ndep
    unsigned long v12;  // 4112
    unsigned long long v13;  // 4109
    unsigned long long v14;  // x21
    unsigned int v15;  // w8
    unsigned long long v16;  // 4112
    unsigned long long v17;  // 4102
    unsigned long long v18;  // 4112
    unsigned long long v19;  // 4102
    unsigned long v4;  // 4112
    unsigned long v5;  // cc_op
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // cc_dep2
    unsigned long long v8;  // 4109
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((a0->field_18->field_d8->field_50 >> 3 & 1 || a0->field_18->field_0 < 772 || a0->field_18->field_0 == 0x10000) && a0->field_f0 - 1 >= 4 && a0->field_8d0 != 1)
        a0->field_18->field_d8->field_40();
    v2 = sub_9703a8(a2);
    if (v2 == 70)
    {
        v4 = arm64g_calculate_condition(v3, v9, v10, v11);
        v5 = 3;
        v6 = (v4 & 1 ? *(int *)&a0->padding_20[40] : 0);
        v7 = (v4 & 1 ? 0x300 : 0);
        v8 = arm64g_calculate_condition(3, v6, v7, 0);
        if (!(v8 & 1))
            goto LABEL_95769e;
LABEL_95769d:
        v14 = 40;
    }
    else
    {
        v12 = arm64g_calculate_condition(v3, v9, v10, v11);
        v5 = 0;
        v6 = (v12 & 1 ? *(int *)&a0->padding_20[40] : 0);
        v7 = (v12 & 1 ? 0x300 : 0);
        v13 = arm64g_calculate_condition(0, v6, v7, 0);
        if (v13 & 1)
            goto LABEL_95769d;
LABEL_95769e:
        v14 = v2;
    }
    if (v14 >> 31 & 1)
        return 0xffffffff;
    v15 = a0->field_84 & 1;
    if ((unsigned int)v14)
    {
        v16 = arm64g_calculate_condition(v5 | 16, v6, v7, 0);
        v17 = arm64g_calculate_condition(19, (v16 & 1 ? v15 : 0x40000000), 0, 0);
        if (v17 & 1)
            return 0xffffffff;
    }
    else
    {
        v18 = arm64g_calculate_condition(v5 | 16, v6, v7, 0);
        v19 = arm64g_calculate_condition(16, (v18 & 1 ? v15 : 0x40000000), 0, 0);
        if (v19 & 1)
            return 0xffffffff;
    }
    if (a1 == 2 && a0->field_900)
        sub_966abc(a0->field_b88);
    a0->field_1c4 = 1;
    a0->field_1c8 = a1;
    a0->field_1c9 = v14;
    if (sub_992a48(&a0[1].padding_88[64]))
        return 0xffffffff;
    goto *((void *)(a0->field_18->field_90));
}
