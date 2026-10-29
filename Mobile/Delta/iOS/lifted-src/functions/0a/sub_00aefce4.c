/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaefce4..0xaefd3c (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_aefce4(char *a0, long long a1)
{
    unsigned long v2;  // x20
    unsigned long long v3;  // x0
    unsigned long v12;  // cc_dep1
    unsigned long v13;  // cc_dep2
    unsigned long v14;  // cc_ndep
    unsigned long long v15;  // 4112
    unsigned long long v16;  // 4105
    unsigned int v4;  // w8
    unsigned long v5;  // cc_op
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // cc_dep2
    unsigned long v8;  // cc_ndep
    unsigned long long v9;  // 4112
    unsigned long long v10;  // 4105
    unsigned long v11;  // cc_op
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = _strlen(a1);
    v3 = _strncmp(a0, a1, v2);
    if ((unsigned int)v3)
        return v3;
    v4 = a0[v2];
    if (v4 == 46)
    {
        v15 = arm64g_calculate_condition(v11 | 16, v12, v13, v14);
        v16 = arm64g_calculate_condition(0, (v15 & 1 ? v4 & 0xff : 0x40000000), 0, 0);
        return !(v16 & 1);
    }
    v9 = arm64g_calculate_condition(v5 | 16, v6, v7, v8);
    v10 = arm64g_calculate_condition(3, (v9 & 1 ? v4 & 0xff : 0x40000000), 0, 0);
    return !(v10 & 1);
}
