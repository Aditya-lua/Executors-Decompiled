/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fd030..0x9fd0b0 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9fd030_0 {
    char padding_0[8];
    char field_8;
    char padding_9[95];
    unsigned int field_68;
    char padding_6c[92];
    unsigned long long field_c8;
} st_9fd030_0;

typedef struct st_9fd030_1 {
    char padding_0[32];
    struct st_9fd030_0 *field_20;
} st_9fd030_1;

typedef struct st_9fd030_3 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[16];
    struct st_9fd030_2 *field_20;
} st_9fd030_3;

typedef struct st_9fd030_2 {
    char padding_0[104];
    unsigned int field_68;
} st_9fd030_2;

extern char g_e8d220;

st_9fd030_0 * sub_9fd030(st_9fd030_1 *a0, st_9fd030_3 *a1)
{
    st_9fd030_0 *v2;  // x19
    st_9fd030_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_20;
    if (!v2)
    {
        v2 = sub_9ff998();
        a0->field_20 = v2;
        if (!v2)
            return v2;
    }
    v3 = sub_a60efc(&v2->field_8, &a1->field_20->padding_0[8]);
    if (!(unsigned int)v3)
        return v3;
    if (a1->field_8 != &g_e8d220)
        v2->field_68 = a1->field_20->field_68;
    v2->field_c8 = v2->field_c8 + 1;
    return 1;
}
