/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb53b8c..0xb53bc4 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b53b8c_0 {
    char padding_0[360];
    unsigned long long field_168;
} st_b53b8c_0;


int sub_b53b8c(st_b53b8c_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    unsigned long v0;  // cc_op
    unsigned long v1;  // cc_dep1
    unsigned long long v4;  // 4110
    unsigned long long v5;  // 4102
    unsigned long v6;  // cc_dep2
    unsigned long v7;  // cc_ndep
    unsigned long long v2;  // 4110
    unsigned long long v3;  // 4102

    if (a0->field_168)
    {
        v2 = arm64g_calculate_condition(v0 | 16, v1, v6, v7);
        v3 = arm64g_calculate_condition(20, (v2 & 1 ? a0->field_168 : 0x40000000), (v2 & 1 ? a4 : 0), 0);
        if (v3 & 1)
            return 0;
    }
    else
    {
        v4 = arm64g_calculate_condition(v0 | 16, v1, v6, v7);
        v5 = arm64g_calculate_condition(16, (v4 & 1 ? 0 : 0x40000000), (v4 & 1 ? a4 : 0), 0);
        if (v5 & 1)
            return 0;
    }
}
