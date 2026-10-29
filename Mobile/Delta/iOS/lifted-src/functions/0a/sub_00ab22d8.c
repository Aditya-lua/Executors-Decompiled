/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab22d8..0xab2314 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab22d8_0 {
    unsigned int field_0;
    char padding_4[116];
    struct st_ab22d8_0 *field_78;
} st_ab22d8_0;


unsigned int sub_ab22d8(st_ab22d8_0 *a0, unsigned long a1)
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

    if (a0 && a0->field_78)
    {
        v0 = a0->field_78->field_0;
        if (v0 != 912)
        {
            v2 = arm64g_calculate_condition(v1 | 16, v7, v8, v4);
            v3 = arm64g_calculate_condition(19, (v2 & 1 ? v0 : 0x40000000), (v2 & 1 ? 6 : 0), 0);
            if (v3 & 1)
                return 0xffffffff;
        }
        else
        {
            v5 = arm64g_calculate_condition(v1 | 16, v7, v8, v4);
            v6 = arm64g_calculate_condition(16, (v5 & 1 ? v0 : 0x40000000), (v5 & 1 ? 6 : 0), 0);
            if (v6 & 1)
                return 0xffffffff;
        }
    }
}
