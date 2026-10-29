/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1184c..0x11880 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_1184c(unsigned long a0, unsigned int *a1)
{
    unsigned int v0;  // w8
    unsigned int v1;  // w9
    unsigned long long v6;  // 4112
    unsigned long v7;  // cc_op
    unsigned long v8;  // cc_dep1
    unsigned long v9;  // cc_dep2
    unsigned long v10;  // cc_ndep
    unsigned long v11;  // 4112
    unsigned long long v12;  // 4112
    unsigned int v2;  // w9
    unsigned long long v13;  // 4112
    unsigned long long v14;  // 4102
    unsigned long long v15;  // 4112
    unsigned long long v16;  // 4102
    unsigned long v3;  // 4112
    unsigned long v4;  // cc_op
    unsigned long v5;  // cc_dep1

    v0 = *a1;
    v1 = v0 - 294;
    v2 = 1 << ((char)v1 & 31) & 0x1ffff & 0xffff0007;
    if (v1 <= 16)
    {
        v3 = arm64g_calculate_condition(v7 | 144, v8, v9, v10);
        v4 = 3;
        v5 = (v3 & 1 ? v2 : 0x40000000);
        v6 = arm64g_calculate_condition(3, v5, 0, 0);
        if (!(v6 & 1))
        {
            v15 = arm64g_calculate_condition(3, v5, 0, 0);
            v16 = arm64g_calculate_condition(16, (v15 & 1 ? v0 : 0x40000000), 0, 0);
            if (v16 & 1)
                return 0;
            return 1;
        }
    }
    else
    {
        v11 = arm64g_calculate_condition(v7 | 144, v8, v9, v10);
        v4 = 0;
        v5 = (v11 & 1 ? v2 : 0x40000000);
        v12 = arm64g_calculate_condition(0, v5, 0, 0);
        if (!(v12 & 1))
        {
            v15 = arm64g_calculate_condition(0, v5, 0, 0);
            v16 = arm64g_calculate_condition(16, (v15 & 1 ? v0 : 0x40000000), 0, 0);
            if (v16 & 1)
                return 0;
            return 1;
        }
    }
    v13 = arm64g_calculate_condition(v4, v5, 0, 0);
    v14 = arm64g_calculate_condition(19, (v13 & 1 ? v0 : 0x40000000), 0, 0);
    if (v14 & 1)
        return 0;
    return 1;
}
