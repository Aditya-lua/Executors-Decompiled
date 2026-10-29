/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7fd6c..0x7fe58 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7fd6c_3 {
    char padding_0[136];
    unsigned long long field_88;
    char field_90;
    char padding_91[151];
    unsigned long long field_128;
} st_7fd6c_3;

typedef struct st_7fd6c_1 {
    char padding_0[28];
    unsigned int field_1c;
} st_7fd6c_1;

typedef struct st_7fd6c_2 {
    char padding_0[16];
    long long field_10;
    unsigned long long field_18;
} st_7fd6c_2;

typedef struct st_7fd6c_0 {
    char field_0;
} st_7fd6c_0;


unsigned long long sub_7fd6c(st_7fd6c_2 *a0, long long a1, long long a2, st_7fd6c_1 *a3, st_7fd6c_3 *a4, long long a5, long long a6)
{
    long long v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v7;  // 4110
    unsigned long long v8;  // x0
    unsigned long long v9;  // 4112
    long long v0;  // [bp-0x80]
    st_7fd6c_0 **v1;  // [bp-0x70], Other Possible Types: char
    st_7fd6c_0 *v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = &v1;
    v1 = &v2;
    v5 = sub_82758(a3);
    *(unsigned int *)&v0 = (a3->field_1c > 7) * 2;
    v6 = sub_7ec48(a0->field_10, a0->field_18 - a0->field_10, a1, a2, a4, v5, a5, a6, v0);
    a4->field_88 = v6;
    v7 = arm64g_calculate_condition(130, v6, 120, 0);
    if (v7 & 1)
        return v6;
    v8 = sub_827e0(a0, a1 + 2064, a2 + 2064, a3, &a4->field_90, a5, a6);
    a4->field_128 = v8;
    v9 = arm64g_calculate_condition(50, v8, 0x77, 0);
    if (!(v9 & 1))
        return v8;
    return 0;
}
