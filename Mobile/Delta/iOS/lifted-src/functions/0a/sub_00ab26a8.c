/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab26a8..0xab271c (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab26a8_0 {
    char padding_0[32];
    long long field_20;
} st_ab26a8_0;


long long sub_ab26a8(st_ab26a8_0 *a0, long long a1)
{
    long long v2;  // x19
    long long v3;  // x0
    unsigned long v6;  // cc_dep2
    unsigned long v7;  // cc_ndep
    unsigned long long v8;  // 4112
    unsigned long long v9;  // 4102
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep1
    unsigned long long v4;  // 4112
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1;
    if (!a0->field_20)
    {
        v2 = sub_9e4b00(v2);
        if (!v2)
            return v2;
    }
    v3 = sub_a5e1f4(a0, 6, 4, 0x1004, 0, v2);
    if (!a0->field_20)
    {
        v4 = arm64g_calculate_condition(v10, v11, v6, v7);
        v5 = arm64g_calculate_condition(195, (v4 & 1 ? v3 & 0xffffffff : 0), 0, 0);
        if (v5 & 1)
            return v3;
    }
    else
    {
        v8 = arm64g_calculate_condition(v10, v11, v6, v7);
        v9 = arm64g_calculate_condition(192, (v8 & 1 ? v3 & 0xffffffff : 0), 0, 0);
        if (v9 & 1)
            return v3;
    }
    sub_9e48d4(v2);
    return v3;
}
