/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x420e4..0x421f4 (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_420e4_1 {
    char padding_0[12];
    uint128_t field_c;
} st_420e4_1;

typedef struct st_420e4_0 {
    unsigned int field_0;
    char field_4;
    char padding_5[1];
    char field_6;
    char field_7;
    double field_8;
    unsigned long long field_10;
    uint128_t field_18;
} st_420e4_0;

typedef struct st_420e4_2 {
    char field_0;
} st_420e4_2;


double sub_420e4(long long a0, char a1, st_420e4_1 *a2, long long a3)
{
    double v7;  // d0
    unsigned long long v8;  // 4115
    uint128_t v14;  // q0
    unsigned long long v9;  // 4115
    unsigned long long v10;  // 4102
    unsigned long long v11;  // 4102
    st_420e4_0 *v12;  // x8
    int v13;  // w8
    st_420e4_2 **v0;  // [bp-0x78], Other Possible Types: char
    st_420e4_2 *v1;  // [bp-0x70]
    unsigned int v2;  // [bp-0x68]
    unsigned int v3;  // [bp-0x64]
    double v4;  // [bp-0x60]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    sub_46ce0();
    v7 = v4;
    if (v2 == 3)
    {
        v8 = arm64g_calculate_condition(160, (((((char)(CmpF(__double_as_longlong(v7), 1.0)) >> 5 & 3 | v7 < 1.0) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v7)) * 0x10000000, 0, 0);
        if (!(v8 & 1))
            goto LABEL_4214a;
LABEL_42149:
        v10 = arm64g_calculate_condition(144, (((((char)(CmpF(__double_as_longlong(v7), 256.0)) >> 5 & 3 | v7 < 256.0) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v7)) * 0x10000000, 0, 0);
        if (v10 & 1)
            goto LABEL_42174;
LABEL_42150:
        if (v2 != 7)
            goto LABEL_421a8;
        *(double *)&v12->field_0 = 1.5e-323;
        v12->field_8 = v7;
        v12->field_4 = a1;
        v12->field_10 = v3;
    }
    else
    {
        v9 = arm64g_calculate_condition(160, 0x80000000, 0, 0);
        if (v9 & 1)
            goto LABEL_42149;
LABEL_4214a:
        v11 = arm64g_calculate_condition(144, 0x20000000, 0, 0);
        if (!(v11 & 1))
            goto LABEL_42150;
LABEL_42174:
        v13 = (int)v7;
        if (v7 == (double)v13)
        {
            v12->field_0 = 4;
            memset(&v12->field_4, 0, 20);
            v12->field_4 = a1;
            v12->field_7 = v13 - 1;
        }
        else
        {
LABEL_421a8:
            v12->field_0 = 5;
            memset(&v12->field_4, 0, 20);
            v12->field_4 = a1;
            v12->field_6 = sub_385b8(a0, a2, a3);
        }
    }
    v14 = *(int128_t *)(a2->padding_0)[1];
    *(uint128_t *)&(&v12->field_10)[1] = v14;
    return (unsigned long long)v14;
}
