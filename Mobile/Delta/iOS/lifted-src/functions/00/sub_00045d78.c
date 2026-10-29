/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x45d78..0x45e80 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_45d78_2 {
    char padding_0[168];
    unsigned int field_a8;
    char field_ac;
} st_45d78_2;

typedef struct st_45d78_1 {
    long long field_0;
    char padding_8[136];
    char field_90;
    char padding_91[1583];
    char field_6c0;
    char padding_6c1[167];
    unsigned int field_768;
    long long field_76c;
} st_45d78_1;

typedef struct st_45d78_0 {
    char field_0;
} st_45d78_0;

extern long long g_f0ce38;

long long sub_45d78(st_45d78_1 *a0, long long a1)
{
    long long v5;  // x0
    long long v6;  // x21
    unsigned int v7;  // w8
    unsigned long long v8;  // 4118
    long long v9;  // x0
    st_45d78_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_45d78_0 *v1;  // [bp-0x40]
    st_45d78_2 *v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    *(char *)&(&a0->field_768)[1] = 1;
    v2 = &a0->field_6c0;
    v5 = sub_34930(&a0->field_90, &v2);
    if (v5)
        return v5;
    v6 = sub_3b87c(a0, a1, 1);
    if ((char)g_f0ce38 == 1 && !(v7 = a0->field_768, v8 = arm64g_calculate_condition(1, v7, 1, 0), v8 & 1 || 0x8000 <= (int)v7))
    {
        sub_2fdb0(a0->field_0, 54, v6, (short)v7);
    }
    else
    {
        v9 = sub_3f220(0);
        sub_2ad10(a0->field_0, 53, v6, v9, 0);
        sub_31514(a0->field_0, 0);
    }
    return sub_3f5c4(a0, v2, v6, 0xffffffff);
}
