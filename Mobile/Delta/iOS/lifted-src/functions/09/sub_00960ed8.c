/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x960ed8..0x960f58 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_960ed8(unsigned int a0, unsigned long long a1)
{
    unsigned int v0;  // w8
    unsigned long v1;  // cc_op
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // cc_dep2
    unsigned long v8;  // cc_ndep
    unsigned long v9;  // 4112
    unsigned long long v10;  // 4146
    unsigned long long v11;  // w8
    unsigned int v12;  // w10
    unsigned long long v13;  // 4112
    unsigned long long v14;  // 4105
    unsigned long long v15;  // w9
    unsigned long long v16;  // 4112
    unsigned long long v17;  // 4105
    unsigned long long v18;  // w10
    unsigned long long v19;  // w10
    unsigned long v20;  // cc_dep1
    unsigned long long v21;  // 4112
    unsigned long long v22;  // 4105
    unsigned long v23;  // x8
    unsigned long long v24;  // 4112
    unsigned long long v25;  // 4105
    unsigned long v2;  // 4112
    unsigned long v3;  // cc_op
    unsigned long v4;  // cc_dep1
    unsigned long v5;  // cc_dep2

    v0 = a0 >> 8;
    if (a0 != 0x100)
    {
        v2 = arm64g_calculate_condition(v1 | 16, v6, v7, v8);
        v3 = 3;
        v4 = (v2 & 1 ? v0 : 0x40000000);
        v5 = (v2 & 1 ? 254 : 0);
    }
    else
    {
        v9 = arm64g_calculate_condition(v1 | 16, v6, v7, v8);
        v3 = 0;
        v4 = (v9 & 1 ? v0 : 0x40000000);
        v5 = (v9 & 1 ? 254 : 0);
    }
    v10 = arm64g_calculate_condition(v3 | 16, v4, v5, 0);
    v11 = (unsigned int)!(v10 & 1);
    v12 = a1 >> 8;
    if (a1 != 0x100)
    {
        v13 = arm64g_calculate_condition(v3 | 16, v4, v5, 0);
        v14 = arm64g_calculate_condition(19, (v13 & 1 ? v12 : 0x40000000), (v13 & 1 ? 254 : 0), 0);
        v15 = (unsigned int)!(v14 & 1);
        if (a1)
            goto LABEL_960f00;
    }
    else
    {
        v16 = arm64g_calculate_condition(v3 | 16, v4, v5, 0);
        v17 = arm64g_calculate_condition(16, (v16 & 1 ? v12 : 0x40000000), (v16 & 1 ? 254 : 0), 0);
        v15 = (unsigned int)!(v17 & 1);
        if (a1)
        {
LABEL_960f00:
            if (v11 && !v15)
                return 0;
        }
    }
    if (a0)
        v18 = v15 ^ 1;
    else
        v18 = 1;
    v19 = v11 | v18;
    v20 = v19;
    if (v19 != 1)
    {
        return 0;
    }
    else if (v11 & 1 | v15 & 1)
    {
        return 1;
    }
    else
    {
        if (a1)
        {
            v21 = arm64g_calculate_condition(19, v20, 1, 0);
            v22 = arm64g_calculate_condition(211, (v21 & 1 ? a1 : 0), (v21 & 1 ? 0x2ff : 0), 0);
            v23 = !(v22 & 1);
            if (!a0)
                return 1;
        }
        else
        {
            v24 = arm64g_calculate_condition(19, v20, 1, 0);
            v25 = arm64g_calculate_condition(208, (v24 & 1 ? a1 : 0), (v24 & 1 ? 0x2ff : 0), 0);
            v23 = !(v25 & 1);
            if (!a0)
                return 1;
        }
        if (0x2ff < (int)a0)
        {
            return 1;
        }
        else if (!(v23 & 1))
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
