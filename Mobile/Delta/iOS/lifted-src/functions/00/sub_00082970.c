/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x82970..0x82ad0 (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_82970_2 {
    unsigned long long field_0;
    struct st_82970_2 *field_8;
    unsigned int field_10;
} st_82970_2;

typedef struct st_82970_3 {
    char padding_0[240];
    char field_f0;
    char padding_f1[447];
    unsigned int field_2b0;
    char padding_2b4[4];
    struct st_82970_2 *field_2b8;
    char field_2c0;
    char padding_2c1[351];
    char field_420;
    char padding_421[2167];
    long long field_c98;
    char padding_ca0[8];
    char field_ca8;
    char padding_ca9[303];
    long long field_dd8;
} st_82970_3;

typedef struct st_82970_1 {
    char padding_0[68];
    unsigned int field_44;
} st_82970_1;

typedef struct st_82970_0 {
    char field_0;
} st_82970_0;


st_82970_2 * sub_82970(st_82970_3 *a0, long long a1, st_82970_2 *a2, long long a3, unsigned int a4, st_82970_2 *a5, st_82970_1 *a6, unsigned long long a7)
{
    st_82970_2 *v4;  // x20
    unsigned long long v5;  // 4106
    st_82970_2 *v6;  // x0
    unsigned long long v7;  // 4106
    st_82970_2 *v8;  // x0
    unsigned long long v9;  // 4106
    unsigned long long v10;  // 4106
    st_82970_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_82970_0 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0], Other Possible Types: unsigned int

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a2;
    if (a5)
    {
        v4 = a5->field_8;
        if (v4 && (0x20000 > a7 || (v5 = arm64g_calculate_condition(2, a7, 1, 0), v5 & 1 || a7 < v4 * 6 || !(int)a5[303].field_8)) && a6->field_44 != 3)
            return sub_82370(a0, a5, a6, a7, v3);
    }
    v6 = sub_80ae4(a0, a6, a7, v4, 0);
    v7 = arm64g_calculate_condition(130, v6, 120, 0);
    if (v7 & 1)
        return v6;
    if (a5)
    {
        v8 = sub_7cf40(a0->field_c98, &a0->field_ca8, &a0->field_420, &a0->field_2c0, &a0->field_f0, a5->field_0, a5->field_8, a5->field_10, a4, a0->field_dd8);
        v9 = arm64g_calculate_condition(130, v8, 120, 0);
        if (v9 & 1)
            return v8;
    }
    else
    {
        v8 = sub_7cf40(a0->field_c98, &a0->field_ca8, &a0->field_420, &a0->field_2c0, &a0->field_f0, a1, a2, a3, a4, a0->field_dd8);
        v10 = arm64g_calculate_condition(146, v8, 120, 0);
        if (!(v10 & 1))
            return v8;
    }
    a0->field_2b0 = (unsigned int)v8;
    a0->field_2b8 = v4;
    return 0;
}
