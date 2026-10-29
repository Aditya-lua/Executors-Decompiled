/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a66a4..0x9a66ec (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_9a66a4(unsigned int *a0)
{
    unsigned int v0;  // w9
    unsigned long v1;  // cc_op
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // cc_dep2
    unsigned long v8;  // cc_ndep
    unsigned long v9;  // 4112
    unsigned long long v10;  // 4129
    unsigned long v2;  // 4112
    unsigned long v3;  // cc_op
    unsigned long v4;  // cc_dep1
    unsigned long v5;  // cc_dep2

    if (!a0[38])
    {
        return 0;
    }
    else if (!a0[118])
    {
        return 0;
    }
    else if (a0[116])
    {
        v0 = a0[43];
        if (v0)
        {
            v2 = arm64g_calculate_condition(v1 | 16, v6, v7, v8);
            v3 = 3;
            v4 = (v2 & 1 ? v0 : 0x40000000);
            v5 = (v2 & 1 ? 22 : 0);
        }
        else
        {
            v9 = arm64g_calculate_condition(v1 | 16, v6, v7, v8);
            v3 = 0;
            v4 = (v9 & 1 ? v0 : 0x40000000);
            v5 = (v9 & 1 ? 22 : 0);
        }
        v10 = arm64g_calculate_condition(v3 | 16, v4, v5, 0);
        if (a0[30])
            return !(v10 & 1);
        return v0 == 13;
    }
    else
    {
        return 0;
    }
}
