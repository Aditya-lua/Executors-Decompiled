/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x978d04..0x978d84 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_978d04_0 {
    char padding_0[1568];
    unsigned long long field_620;
} st_978d04_0;


st_978d04_0 * sub_978d04(st_978d04_0 *a0, unsigned long long a1, uint128_t a2)
{
    unsigned long long v7;  // x8
    unsigned long v8;  // cc_op
    unsigned long v11;  // cc_ndep
    unsigned long long v12;  // 4110
    unsigned long long v13;  // 4102
    unsigned long v14;  // cc_dep1
    unsigned long v15;  // cc_dep2
    uint128_t len;  // x0
    unsigned long long v9;  // 4110
    unsigned long long v10;  // 4102
    unsigned long long v0;  // [bp-0x48]
    uint128_t v1;  // [bp-0x40]
    uint128_t v2;  // [bp-0x38]
    uint128_t v3;  // [bp-0x30]
    char v4;  // [bp-0x28]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = 0;
    v3 = 0;
    v7 = a0->field_620 & 7;
    if ((a0->field_620 & 6) != 2)
    {
        v9 = arm64g_calculate_condition(v8 | 16, v14, v15, v11);
        v10 = arm64g_calculate_condition(4, (v9 & 1 ? v7 : 0x40000000), (v9 & 1 ? 4 : 0), 0);
        if (v10 & 1)
            return a0;
    }
    else
    {
        v12 = arm64g_calculate_condition(v8 | 16, v14, v15, v11);
        v13 = arm64g_calculate_condition(0, (v12 & 1 ? v7 : 0x40000000), (v12 & 1 ? 4 : 0), 0);
        if (v13 & 1)
            return a0;
    }
    v4 = 1;
    v0 = a1;
    v2 = a2;
    if (a2)
        len = _strlen(a2);
    else
        len = 0;
    v3 = len;
    return sub_978d84();
}
