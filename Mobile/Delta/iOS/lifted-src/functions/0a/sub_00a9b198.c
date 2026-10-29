/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9b198..0xa9b1c8 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a9b198_0 {
    char padding_0[4];
    unsigned int field_4;
    unsigned int field_8;
} st_a9b198_0;


unsigned long long sub_a9b198(st_a9b198_0 **a0, st_a9b198_0 **a1)
{
    unsigned long v0;  // x11
    unsigned long long v1;  // x0
    unsigned long v4;  // cc_dep2
    unsigned long v5;  // cc_ndep
    unsigned long long v6;  // 4112
    unsigned long long v7;  // 4102
    unsigned long v8;  // cc_op
    unsigned long v9;  // cc_dep1
    unsigned long long v2;  // 4112
    unsigned long long v3;  // 4102

    v0 = *a1->field_4;
    v1 = *a0->field_4 - v0;
    if ((unsigned int)v0)
    {
        v2 = arm64g_calculate_condition(v8 | 16, v9, v4, v5);
        v3 = arm64g_calculate_condition(19, (v2 & 1 ? v1 & 0xffffffff : 0x40000000), 0, 0);
        if (v3 & 1)
            return v1;
    }
    else
    {
        v6 = arm64g_calculate_condition(v8 | 16, v9, v4, v5);
        v7 = arm64g_calculate_condition(16, (v6 & 1 ? v1 & 0xffffffff : 0x40000000), 0, 0);
        if (v7 & 1)
            return v1;
    }
    return *a0->field_8 - *a1->field_8;
}
