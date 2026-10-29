/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5184c..0x51934 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5184c_2 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[20];
    struct st_5184c_0 *field_20;
    char padding_28[16];
    struct st_5184c_3 *field_38;
    unsigned long long field_40;
    char field_48;
} st_5184c_2;

typedef struct st_5184c_3 {
    struct st_5184c_0 *field_0;
} st_5184c_3;

typedef struct st_5184c_1 {
    char field_0;
} st_5184c_1;

typedef struct st_5184c_0 {
    char padding_0[8];
    unsigned int field_8;
} st_5184c_0;

extern unsigned long long g_e686e8;
extern unsigned long long g_e68700;
extern unsigned int g_f00b50;
extern unsigned int g_f00b70;
extern unsigned int g_f00bb0;

void sub_5184c(st_5184c_2 *a0)
{
    unsigned long v4;  // cc_op
    unsigned long v5;  // cc_dep1
    unsigned long long v8;  // 4110
    unsigned long long v9;  // 4102
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // cc_ndep
    st_5184c_0 *v12;  // x8
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4102
    st_5184c_1 **v0;  // [bp-0x30], Other Possible Types: char
    st_5184c_1 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_8 == g_f00bb0)
    {
        v6 = arm64g_calculate_condition(v4, v5, v10, v11);
        v7 = arm64g_calculate_condition(20, (v6 & 1 ? a0 : 0x40000000), 0, 0);
        if (v7 & 1)
            return;
    }
    else
    {
        v8 = arm64g_calculate_condition(v4, v5, v10, v11);
        v9 = arm64g_calculate_condition(16, (v8 & 1 ? a0 : 0x40000000), 0, 0);
        if (v9 & 1)
            return;
    }
    if (a0->field_8 == g_f00b70 && !(a0->field_48 & 1) && a0->field_40 == 2)
    {
        v12 = a0->field_20;
        if (v12 && v12->field_8 == g_f00b50 && sub_1935c(&v12[2].field_8, "setmetatable") && *(long long *)a0->field_38 && *(int *)(*(long long *)a0->field_38 + 8) == g_f00bb0)
            goto *((void *)(g_e686e8));
    }
    goto *((void *)(g_e68700));
}
