/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97b928..0x97b978 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97b928_1 {
    char padding_0[152];
    unsigned long long field_98;
} st_97b928_1;

typedef struct st_97b928_0 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_97b928_0;


long long sub_97b928(st_97b928_1 *a0, st_97b928_0 *a1)
{
    unsigned long v5;  // cc_op
    unsigned long v6;  // cc_dep1
    unsigned long long v9;  // 4110
    unsigned long long v10;  // 4102
    unsigned long v11;  // cc_dep2
    unsigned long v12;  // cc_ndep
    unsigned long long v7;  // 4110
    unsigned long long v8;  // 4102
    st_97b928_1 *v0;  // [bp-0x40], Other Possible Types: uint128_t
    uint128_t v1;  // [bp-0x30]
    unsigned long v2;  // [bp-0x20]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v0 = a1->field_0;
    v1 = a1->field_10;
    v2 = a1->field_20;
    if (!a0->field_98)
    {
        v7 = arm64g_calculate_condition(v5, v6, v11, v12);
        v8 = arm64g_calculate_condition(4, (v7 & 1 ? *(unsigned long long *)&v0 : 0), 0, 0);
        if (v8 & 1)
        {
            v0 = a0;
            return sub_980ea4(&v0);
        }
    }
    else
    {
        v9 = arm64g_calculate_condition(v5, v6, v11, v12);
        v10 = arm64g_calculate_condition(0, (v9 & 1 ? *(unsigned long long *)&v0 : 0), 0, 0);
        if (v10 & 1)
        {
            v0 = a0;
            return sub_980ea4(&v0);
        }
    }
    return 0;
}
