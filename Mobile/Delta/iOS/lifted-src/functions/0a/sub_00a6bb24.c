/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6bb24..0xa6bc24 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6bb24_0 {
    struct st_a6bb24_0 *field_0;
    struct st_a6bb24_0 *field_8;
    struct st_a6bb24_1 *field_10;
    struct st_a6bb24_0 *field_18;
} st_a6bb24_0;

typedef struct st_a6bb24_1 {
    unsigned long long field_0;
} st_a6bb24_1;

typedef struct st_a6bb24_2 {
    char padding_0[8];
    long long field_8;
} st_a6bb24_2;

extern long long g_a6be70;
extern long long g_f08ff8;
extern st_a6bb24_0 *g_f12e74;
extern st_a6bb24_2 *g_f12e78;

st_a6bb24_0 * sub_a6bb24(st_a6bb24_0 *a0, st_a6bb24_0 *a1)
{
    st_a6bb24_0 *v2;  // x0
    unsigned long v3;  // cc_op
    unsigned long v6;  // cc_ndep
    unsigned long long v7;  // 4110
    unsigned long long v8;  // 4102
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    st_a6bb24_0 *v11;  // x0
    st_a6bb24_0 *v12;  // x8
    st_a6bb24_0 *v13;  // x22
    unsigned long long v4;  // 4110
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
        return a0;
    v2 = sub_a7c208(&g_f08ff8, &g_a6be70);
    if (!(unsigned int)v2)
        return v2;
    if ((int)g_f12e74)
    {
        v4 = arm64g_calculate_condition(v3 | 16, v9, v10, v6);
        v5 = arm64g_calculate_condition(4, (v4 & 1 ? g_f12e78 : 0x40000000), 0, 0);
        if (v5 & 1)
            return v2;
    }
    else
    {
        v7 = arm64g_calculate_condition(v3 | 16, v9, v10, v6);
        v8 = arm64g_calculate_condition(0, (v7 & 1 ? g_f12e78 : 0x40000000), 0, 0);
        if (v8 & 1)
            return v2;
    }
    v11 = sub_a7c198(g_f12e78->field_8);
    if (!(unsigned int)v11)
        return v11;
    v12 = a1->field_0;
    if (a1->field_0)
    {
        v13 = 0;
        do
        {
            v13 = v12;
            if (!a0 || v13->field_8 == a0)
                v13->field_10();
            v12 = v13->field_18;
        } while (v13->field_18);
    }
}
