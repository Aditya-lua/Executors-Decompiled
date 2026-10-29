/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x19044..0x19088 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_19044(unsigned int *a0)
{
    unsigned int v0;  // w8
    unsigned long long v1;  // x11
    unsigned long long v10;  // 4104
    unsigned long v11;  // cc_dep1
    unsigned long long v12;  // x8
    unsigned long long v13;  // 4105
    unsigned long long v14;  // 4105
    unsigned long v2;  // cc_dep1
    unsigned long long v3;  // x13
    unsigned long long v4;  // x12
    unsigned long long v5;  // 4104
    unsigned long long v6;  // 4104
    unsigned long v7;  // cc_dep1
    unsigned long long v8;  // x9
    unsigned long long v9;  // 4104

    v0 = *a0;
    v1 = 2;
    v2 = v0;
    v3 = 1;
    if (v0 != 45)
    {
        v4 = 0;
        v5 = arm64g_calculate_condition(19, v2, 45, 0);
        if (!(v5 & 1))
            goto LABEL_19066;
LABEL_19065:
        v3 = 0;
    }
    else
    {
        v4 = 0x100000000;
        v6 = arm64g_calculate_condition(19, v2, 45, 0);
        if (v6 & 1)
            goto LABEL_19065;
LABEL_19066:
    }
    v7 = v0;
    if (v0 == 304)
    {
        v8 = 0x100000000;
        v9 = arm64g_calculate_condition(3, v7, 304, 0);
        if (!(v9 & 1))
            goto LABEL_19072;
LABEL_19071:
        v3 = 0;
    }
    else
    {
        v8 = v4;
        v10 = arm64g_calculate_condition(3, v7, 304, 0);
        if (v10 & 1)
            goto LABEL_19071;
LABEL_19072:
    }
    v11 = v0;
    if (v0 == 35)
    {
        v12 = 0x100000000;
        v13 = arm64g_calculate_condition(3, v11, 35, 0);
        if (!(v13 & 1))
            goto LABEL_1907e;
LABEL_1907d:
        v3 = v1;
    }
    else
    {
        v12 = v8;
        v14 = arm64g_calculate_condition(3, v11, 35, 0);
        if (v14 & 1)
            goto LABEL_1907d;
LABEL_1907e:
    }
    return v3 | v12;
}
