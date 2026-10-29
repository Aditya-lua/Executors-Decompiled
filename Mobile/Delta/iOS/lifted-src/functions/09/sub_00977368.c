/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x977368..0x977384 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_977368_0 {
    char padding_0[1568];
    unsigned long long field_620;
} st_977368_0;


long long sub_977368(st_977368_0 *a0)
{
    unsigned long long v0;  // x8
    unsigned long v1;  // cc_op
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // cc_dep2
    unsigned long v8;  // cc_ndep
    unsigned long v9;  // 4110
    unsigned long long v10;  // 4105
    unsigned long v2;  // 4110
    unsigned long v3;  // cc_op
    unsigned long v4;  // cc_dep1
    unsigned long v5;  // cc_dep2

    v0 = a0->field_620 & 7;
    if ((a0->field_620 & 6) != 2)
    {
        v2 = arm64g_calculate_condition(v1 | 16, v6, v7, v8);
        v3 = 4;
        v4 = (v2 & 1 ? v0 : 0x40000000);
        v5 = (v2 & 1 ? 4 : 0);
    }
    else
    {
        v9 = arm64g_calculate_condition(v1 | 16, v6, v7, v8);
        v3 = 0;
        v4 = (v9 & 1 ? v0 : 0x40000000);
        v5 = (v9 & 1 ? 4 : 0);
    }
    v10 = arm64g_calculate_condition(v3 | 16, v4, v5, 0);
    return !(v10 & 1);
}
