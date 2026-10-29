/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3bf74..0x3c098 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3bf74_2 {
    char padding_0[17];
    char field_11;
} st_3bf74_2;

typedef struct st_3bf74_5 {
    char padding_0[1896];
    unsigned int field_768;
} st_3bf74_5;

typedef struct st_3bf74_1 {
    char padding_0[49];
    char field_31;
} st_3bf74_1;

typedef struct st_3bf74_3 {
    char padding_0[32];
    struct st_3bf74_4 *field_20;
    struct st_3bf74_2 *field_28;
    char padding_30[8];
    struct st_3bf74_2 *field_38;
} st_3bf74_3;

typedef struct st_3bf74_4 {
    struct st_3bf74_1 *field_0;
} st_3bf74_4;

typedef struct st_3bf74_0 {
    char field_0;
} st_3bf74_0;

extern unsigned long long g_e67438;
extern unsigned long long g_e674a0;
extern char g_f0ca10;
extern char g_f0ce38;

st_3bf74_2 * sub_3bf74(st_3bf74_5 *a0, st_3bf74_3 *a1)
{
    st_3bf74_2 *v5;  // x8
    st_3bf74_1 **iter;  // x21
    unsigned long long v7;  // x22
    unsigned long long v8;  // x22
    st_3bf74_2 *v9;  // x0
    unsigned long long v10;  // 4118
    st_3bf74_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_3bf74_0 *v1;  // [bp-0x50]
    st_3bf74_1 *v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v5 = a1->field_28;
    if (v5 < a1->field_38)
    {
        return 0;
    }
    else if (v5)
    {
        iter = a1->field_20;
        v7 = v5 * 8;
        while (1)
        {
            v8 = v7;
            v2 = *iter;
            v9 = sub_34930(&a0->padding_0[224], &v2);
            if (!v9 || v9->field_11 != 1 || g_f0ca10 == 1 && v2->field_31 == 1 && (g_f0ce38 != 1 || !(v10 = arm64g_calculate_condition(1, a0->field_768, 1, 0), !(v10 & 1))))
                break;
            iter += 1;
            v7 = v8 - 8;
            if (v8 == 8)
                goto *((void *)(g_e674a0));
        }
        goto *((void *)(g_e67438));
    }
    else
    {
        goto *((void *)(g_e674a0));
    }
}
