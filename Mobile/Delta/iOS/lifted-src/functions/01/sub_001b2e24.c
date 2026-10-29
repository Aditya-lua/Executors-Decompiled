/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b2e24..0x1b2e40 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_1b2e24(int a0)
{
    unsigned int v0;  // w8
    unsigned long v1;  // cc_op
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // cc_dep2
    unsigned long v8;  // cc_ndep
    unsigned long v9;  // 4112
    unsigned long long v10;  // 4105
    unsigned long v2;  // 4112
    unsigned long v3;  // cc_op
    unsigned long v4;  // cc_dep1
    unsigned long v5;  // cc_dep2

    v0 = (a0 & 0xff) - 33;
    if (0 <= a0)
    {
        v2 = arm64g_calculate_condition(v1 | 160, v6, v7, v8);
        v3 = 3;
        v4 = (v2 & 1 ? v0 : 0);
        v5 = (v2 & 1 ? 94 : 0);
    }
    else
    {
        v9 = arm64g_calculate_condition(v1 | 160, v6, v7, v8);
        v3 = 0;
        v4 = (v9 & 1 ? v0 : 0);
        v5 = (v9 & 1 ? 94 : 0);
    }
    v10 = arm64g_calculate_condition(v3 | 32, v4, v5, 0);
    return !(v10 & 1);
}
