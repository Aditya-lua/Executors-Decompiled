/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa14530..0xa1458c (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a14530_0 {
    char padding_0[32];
    long long field_20;
} st_a14530_0;


unsigned long long sub_a14530(st_a14530_0 *a0, st_a14530_0 *a1)
{
    long long v2;  // x20
    long long v3;  // x0
    unsigned long v6;  // cc_dep2
    unsigned long v7;  // cc_ndep
    unsigned long long v8;  // 4110
    unsigned long long v9;  // 4102
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep1
    unsigned long long v4;  // 4110
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9ffdd0(a0->field_20);
    v3 = sub_9ffdd0(a1->field_20);
    if (v2)
    {
        v4 = arm64g_calculate_condition(v10 | 16, v11, v6, v7);
        v5 = arm64g_calculate_condition(20, (v4 & 1 ? v3 : 0x40000000), 0, 0);
        if (v5 & 1)
            return !sub_a1adc4(v2, v3, 0);
    }
    else
    {
        v8 = arm64g_calculate_condition(v10 | 16, v11, v6, v7);
        v9 = arm64g_calculate_condition(16, (v8 & 1 ? v3 : 0x40000000), 0, 0);
        if (v9 & 1)
            return !sub_a1adc4(v2, v3, 0);
    }
    return 0xfffffffe;
}
