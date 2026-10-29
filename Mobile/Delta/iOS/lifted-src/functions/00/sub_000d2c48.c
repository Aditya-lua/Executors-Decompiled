/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd2c48..0xd2cf8 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_d2c48_1 {
    char padding_0[8];
    unsigned long long field_8;
    struct st_d2c48_0 *field_10;
    unsigned long long field_18;
    unsigned long long field_20;
} st_d2c48_1;

typedef struct st_d2c48_0 {
    char field_0;
} st_d2c48_0;


unsigned long long sub_d2c48(unsigned long a0, st_d2c48_1 *a1)
{
    unsigned long v6;  // x20
    unsigned long long v7;  // x0
    unsigned long long v8;  // x8
    unsigned long long v9;  // 4107
    unsigned long v10;  // x21
    unsigned long long v11;  // x22
    st_d2c48_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_d2c48_0 *v1;  // [bp-0x48]
    st_d2c48_0 **v2;  // [bp-0x40], Other Possible Types: char
    st_d2c48_0 *v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    a1->field_18 = 0;
    v6 = a1->field_20 + 1;
    v3 = &v2;
    v2 = &v3;
    v7 = sub_e24b4(a1, v6);
    v8 = 0xff;
    if (v7 < 0xff)
        v8 = v7;
    v9 = arm64g_calculate_condition(2, v8, v6, 0);
    if (v9 & 1)
        return v7;
    v10 = 0;
    v11 = 8;
    do
    {
        if (*(char *)&a1->field_10[v10])
            v7 = sub_60b78(a1->field_8 + v11);
    } while ((v10 += 1, v11 += 24, v8 + v6 != v10));
    return v7;
}
