/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x50fb0..0x51088 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_50fb0_2 {
    char padding_0[32];
    char field_20;
    char padding_21[7];
    struct st_50fb0_1 *field_28;
    struct st_50fb0_1 *field_30;
    struct st_50fb0_1 *field_38;
} st_50fb0_2;

typedef struct st_50fb0_0 {
    char field_0;
} st_50fb0_0;

typedef struct st_50fb0_1 {
    char padding_0[8];
    unsigned int field_8;
} st_50fb0_1;

extern unsigned int g_f00b10;

int sub_50fb0(long long a0, st_50fb0_2 *a1)
{
    st_50fb0_1 *v4;  // x9
    unsigned long v5;  // cc_dep1
    unsigned long long v14;  // 4102
    st_50fb0_1 *v6;  // x8
    unsigned long long v7;  // 4110
    unsigned long long v8;  // 4102
    unsigned long long v9;  // 4110
    unsigned long long v10;  // 4102
    double v11;  // d0
    unsigned long long v12;  // 4141
    unsigned long long v13;  // 4102
    st_50fb0_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_50fb0_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1->field_28->field_8 == g_f00b10)
        v4 = a1->field_28;
    else
        v4 = 0;
    v5 = a1->field_30->field_8;
    if (a1->field_30->field_8 == g_f00b10)
        v6 = a1->field_30;
    else
        v6 = 0;
    if (v4)
    {
        v7 = arm64g_calculate_condition(19, v5, g_f00b10, 0);
        v8 = arm64g_calculate_condition(4, (v7 & 1 ? v6 : 0x40000000), 0, 0);
        if (v8 & 1)
            return 1;
    }
    else
    {
        v9 = arm64g_calculate_condition(19, v5, g_f00b10, 0);
        v10 = arm64g_calculate_condition(0, (v9 & 1 ? v6 : 0x40000000), 0, 0);
        if (v10 & 1)
            return 1;
    }
    if (*(double *)&v4[2].field_8 != 1.0)
        return 1;
    v11 = *(double *)&v6[2].field_8;
    v12 = arm64g_calculate_condition(160, (((((char)(CmpF(__double_as_longlong(v11), 1.0)) >> 5 & 3 | v11 < 1.0) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v11)) * 0x10000000, 0, 0);
    if (v12 & 1)
    {
        v13 = arm64g_calculate_condition(128, (((((char)(CmpF(__double_as_longlong(v11), 16.0)) >> 5 & 3 | v11 < 16.0) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v11)) * 0x10000000, 0, 0);
        if (v13 & 1)
            return 1;
    }
    else
    {
        v14 = arm64g_calculate_condition(128, 0x20000000, 0, 0);
        if (v14 & 1)
            return 1;
    }
    if (!a1->field_38)
    {
        sub_51594(a0 + 104, &a1->field_20);
        *(unsigned int *)(sub_12484(a0 + 104, &a1->field_20) + 8) = (unsigned int)v11;
        return 1;
    }
    return 1;
}
