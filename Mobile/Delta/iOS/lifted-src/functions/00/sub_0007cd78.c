/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7cd78..0x7cda0 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_7cd78(unsigned int a0, unsigned int a1, unsigned int a2)
{
    unsigned long long v0;  // 4129
    unsigned long v1;  // cc_op
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // cc_dep2
    unsigned long v8;  // cc_ndep
    unsigned long v9;  // 4112
    unsigned long long v10;  // 4127
    unsigned int v11;  // w9
    unsigned long v2;  // 4112
    unsigned long v3;  // cc_op
    unsigned long v4;  // cc_dep1
    unsigned long v5;  // cc_dep2

    v0 = arm64g_calculate_condition(33, a0 - 6, 3, 0);
    if (v0 & 1)
    {
        v2 = arm64g_calculate_condition(v1 | 32, v6, v7, v8);
        v3 = 3;
        v4 = (v2 & 1 ? /* unsupported instruction */ : 0);
        v5 = v2 & 1;
    }
    else
    {
        v9 = arm64g_calculate_condition(v1 | 32, v6, v7, v8);
        v3 = 0;
        v4 = (v9 & 1 ? /* unsupported instruction */ : 0);
        v5 = v9 & 1;
    }
    v10 = arm64g_calculate_condition(v3, v4, v5, 0);
    if (a0 == 1)
        v11 = 0;
    else
        v11 = !(v10 & 1);
    if (!a2)
        return v11;
    return 1;
}
