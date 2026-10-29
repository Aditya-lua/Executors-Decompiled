/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb20a58..0xb20a68 (16 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b20a58(unsigned long a0, unsigned int a1)
{
    unsigned long v0;  // cc_op
    unsigned long v1;  // cc_dep1
    unsigned long v5;  // cc_ndep
    unsigned long v6;  // 4112
    unsigned long v7;  // cc_dep2
    unsigned long long v8;  // 4105
    unsigned long v2;  // 4112
    unsigned long v3;  // cc_op
    unsigned long v4;  // cc_dep1

    if (!(a1 & 3))
    {
        v2 = arm64g_calculate_condition(v0, v1, v7, v5);
        v3 = 3;
        v4 = (v2 & 1 ? a1 : 0x40000000);
    }
    else
    {
        v6 = arm64g_calculate_condition(v0, v1, v7, v5);
        v3 = 0;
        v4 = (v6 & 1 ? a1 : 0x40000000);
    }
    v8 = arm64g_calculate_condition(v3 | 16, v4, 0, 0);
    return !(v8 & 1);
}
