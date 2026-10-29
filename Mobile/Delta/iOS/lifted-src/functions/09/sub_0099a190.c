/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99a190..0x99a1b4 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99a190_0 {
    char padding_0[20];
    unsigned int field_14;
} st_99a190_0;


int sub_99a190(st_99a190_0 *a0, unsigned int a1)
{
    unsigned int v0;  // w8
    unsigned long v1;  // cc_op
    unsigned long v4;  // cc_ndep
    unsigned long long v5;  // 4112
    unsigned long long v6;  // 4102
    unsigned long v7;  // cc_dep1
    unsigned long v8;  // cc_dep2
    unsigned long long v2;  // 4112
    unsigned long long v3;  // 4102

    v0 = a0->field_14;
    if (v0 != 0x10000)
    {
        v2 = arm64g_calculate_condition(v1 | 16, v7, v8, v4);
        v3 = arm64g_calculate_condition(19, (v2 & 1 ? v0 : 0x40000000), (v2 & 1 ? a1 : 0), 0);
        if (v3 & 1)
            return 0;
    }
    else
    {
        v5 = arm64g_calculate_condition(v1 | 16, v7, v8, v4);
        v6 = arm64g_calculate_condition(16, (v5 & 1 ? v0 : 0x40000000), (v5 & 1 ? a1 : 0), 0);
        if (v6 & 1)
            return 0;
    }
    a0->field_14 = a1;
    return 1;
}
