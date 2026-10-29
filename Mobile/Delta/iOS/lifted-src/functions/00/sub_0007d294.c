/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7d294..0x7d444 (432 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7d294_1 {
    long long field_0;
    char padding_8[232];
    char field_f0;
    char padding_f1[95];
    long long field_150;
    char padding_158[344];
    unsigned int field_2b0;
    char padding_2b4[12];
    char field_2c0;
    char padding_2c1[79];
    unsigned long long field_310;
    unsigned long long field_318;
    unsigned long long field_320;
    char padding_328[248];
    char field_420;
    char padding_421[2183];
    char field_ca8;
    char padding_ca9[23];
    unsigned int field_cc0;
    char padding_cc4[16];
    unsigned int field_cd4;
    char padding_cd8[88];
    long long field_d30;
} st_7d294_1;

typedef struct st_7d294_0 {
    char field_0;
} st_7d294_0;


unsigned long long sub_7d294(st_7d294_1 *a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6)
{
    long long v4;  // x22
    long long v5;  // x23
    unsigned long long v14;  // 4110
    unsigned long long v15;  // 4105
    unsigned long long v16;  // 4110
    unsigned long long v17;  // 4105
    long long v6;  // x0
    unsigned long long v7;  // 4106
    unsigned long long v8;  // x0
    unsigned long v9;  // cc_dep1
    unsigned long long v10;  // 4106
    unsigned long long v11;  // 4106
    unsigned long long v12;  // x8
    unsigned long long v13;  // x10
    st_7d294_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_7d294_0 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!(int)a0->field_0)
        return 0xffffffffffffffc4;
    v4 = a2;
    v5 = a1;
    v6 = 0;
    if (a5 && (int)a0->field_0 == 1)
    {
        v6 = sub_82490(v5, v4, &a0->field_f0, a0->field_310 - 1, a0->field_2b0);
        v7 = arm64g_calculate_condition(130, v6, 120, 0);
        if (v7 & 1)
            return v6;
        v4 -= v6;
        v5 += v6;
        *(unsigned int *)&a0->field_0 = 2;
    }
    if (!a4)
        return v6;
    if (sub_8144c(&a0->field_ca8, a3, a4, (unsigned int)a0->field_d30))
    {
        if ((int)a0->field_150 == 1)
            goto LABEL_7d3a0;
LABEL_7d354:
        if (!a5)
            goto LABEL_7d3b8;
LABEL_7d358:
        v8 = sub_7e780(a0, v5, v4, a3, a4, a6);
        v9 = v8;
        v10 = arm64g_calculate_condition(146, v8, 120, 0);
        if (!(v10 & 1))
            return v8;
    }
    else
    {
        *(unsigned int *)&a0->field_d30 = 0;
        a0->field_cd4 = a0->field_cc0;
        if ((int)a0->field_150 != 1)
            goto LABEL_7d354;
LABEL_7d3a0:
        sub_8144c(&a0->field_420, a3, a4, 0);
        if (a5)
            goto LABEL_7d358;
LABEL_7d3b8:
        sub_81e80(&a0->field_ca8, &a0->field_2c0, &a0->field_f0, a3, a3 + a4);
        v8 = sub_7f214(a0, v5, v4, a3, a4, 0);
        v9 = v8;
        v11 = arm64g_calculate_condition(130, v8, 120, 0);
        if (v11 & 1)
            return v8;
    }
    v12 = a0->field_318 + a4;
    a0->field_318 = v12;
    a0->field_320 = a0->field_320 + v8 + v6;
    v13 = a0->field_310;
    if (v13 < v12 + 1)
    {
        v14 = arm64g_calculate_condition(130, v9, 120, 0);
        v15 = arm64g_calculate_condition(20, (v14 & 1 ? v13 : 0x40000000), 0, 0);
        if (!(v15 & 1))
            return v8 + v6;
    }
    else
    {
        v16 = arm64g_calculate_condition(130, v9, 120, 0);
        v17 = arm64g_calculate_condition(16, (v16 & 1 ? v13 : 0x40000000), 0, 0);
        if (!(v17 & 1))
            return v8 + v6;
    }
    return 0xffffffffffffffb8;
}
