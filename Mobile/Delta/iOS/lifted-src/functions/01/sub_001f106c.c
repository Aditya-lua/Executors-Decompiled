/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f106c..0x1f10ac (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_1f106c(unsigned int *a0)
{
    unsigned int v0;  // w8
    unsigned long v1;  // cc_dep1
    unsigned long v10;  // 4112
    unsigned long v11;  // cc_op
    unsigned long v12;  // cc_dep1
    unsigned long v13;  // cc_dep2
    unsigned long v14;  // 4112
    unsigned long long v15;  // 4105
    unsigned int v2;  // w9
    unsigned long v3;  // cc_op
    unsigned long v4;  // cc_dep1
    unsigned long v5;  // cc_dep2
    unsigned long v6;  // 4112
    unsigned long long v7;  // 4102
    unsigned long v8;  // 4112
    unsigned long long v9;  // 4102

    v0 = *a0;
    v1 = v0;
    if (1 >= v0)
    {
        v2 = a0[1];
        v3 = 3;
        v4 = v2;
        v5 = 4;
        if (4 > v2)
            return 1;
    }
    else
    {
        v2 = a0[1];
        if (v0 == 2)
        {
            v6 = arm64g_calculate_condition(3, v1, 1, 0);
            v3 = 3;
            v4 = (v6 & 1 ? v2 : 0x20000000);
            v5 = (v6 & 1 ? 5 : 0);
            v7 = arm64g_calculate_condition(0x33, v4, v5, 0);
            if (v7 & 1)
                return 1;
        }
        else
        {
            v8 = arm64g_calculate_condition(3, v1, 1, 0);
            v3 = 0;
            v4 = (v8 & 1 ? v2 : 0x20000000);
            v5 = (v8 & 1 ? 5 : 0);
            v9 = arm64g_calculate_condition(48, v4, v5, 0);
            if (v9 & 1)
                return 1;
        }
    }
    if (v0 == v2)
    {
        v10 = arm64g_calculate_condition(v3, v4, v5, 0);
        v11 = 3;
        v12 = (v10 & 1 ? v2 : 0x20000000);
        v13 = (v10 & 1 ? 7 : 0);
    }
    else
    {
        v14 = arm64g_calculate_condition(v3, v4, v5, 0);
        v11 = 0;
        v12 = (v14 & 1 ? v2 : 0x20000000);
        v13 = (v14 & 1 ? 7 : 0);
    }
    v15 = arm64g_calculate_condition(v11 | 32, v12, v13, 0);
    return !(v15 & 1);
}
