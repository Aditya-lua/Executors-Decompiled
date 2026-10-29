/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a8984..0x1a8a90 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a8984_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned int field_18;
    char padding_1c[4];
    unsigned long long field_20;
    unsigned long long field_28;
} st_1a8984_0;

typedef struct st_1a8984_1 {
    char field_0;
} st_1a8984_1;


long long sub_1a8984(st_1a8984_0 *a0, st_1a8984_0 *a1)
{
    unsigned long long v6;  // x12
    unsigned long long v7;  // x13
    unsigned long v8;  // cc_dep1
    unsigned long v9;  // cc_dep2
    long long v10;  // x9
    unsigned long long v11;  // 4110
    unsigned long long v12;  // 4102
    unsigned long long v13;  // 4110
    unsigned long long v14;  // 4102
    long long v15;  // x0
    st_1a8984_1 **v0;  // [bp-0x40], Other Possible Types: char
    st_1a8984_1 *v1;  // [bp-0x38]
    st_1a8984_1 **v2;  // [bp-0x30], Other Possible Types: char
    st_1a8984_1 *v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = a1->field_20;
    v7 = a1->field_28;
    v8 = v7;
    v9 = v6;
    if (v7 != v6)
        v10 = 0;
    else
        v10 = a0->field_28 == a0->field_20;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_28 != a0->field_20)
    {
        v11 = arm64g_calculate_condition(20, v8, v9, 0);
        v12 = arm64g_calculate_condition(4, (v11 & 1 ? v7 : 0x40000000), (v11 & 1 ? v6 : 0), 0);
        if (v12 & 1)
            return v10;
    }
    else
    {
        v13 = arm64g_calculate_condition(20, v8, v9, 0);
        v14 = arm64g_calculate_condition(0, (v13 & 1 ? v7 : 0x40000000), (v13 & 1 ? v6 : 0), 0);
        if (v14 & 1)
            return v10;
    }
    if (a0->field_0 != a1->field_0)
    {
        return 0;
    }
    else if (a0->field_8 != a1->field_8)
    {
        return 0;
    }
    else if (a0->field_10 != a1->field_10)
    {
        return 0;
    }
    else if (a0->field_18 == a1->field_18)
    {
        v15 = sub_1bc4cc();
        v3 = &v2;
        v2 = &v3;
        return !sub_1b185c(v15, sub_1bc4cc(&a1->field_20, 0));
    }
    else
    {
        return 0;
    }
}
