/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b0df0..0x9b0e10 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_9b0df0(unsigned int a0)
{
    unsigned int *v0;  // x8
    unsigned long v1;  // cc_op
    unsigned long v10;  // 4112
    unsigned long long v11;  // 4102
    unsigned long v2;  // cc_dep1
    unsigned long v3;  // cc_dep2
    unsigned long v4;  // cc_ndep
    unsigned int *v5;  // x8
    unsigned int v6;  // w9
    unsigned int *v7;  // x8
    unsigned long v8;  // 4112
    unsigned long long v9;  // 4102

    v0 = "2";
    while (1)
    {
        v5 = v0;
        v6 = *v5;
        v7 = v5 + 2;
        if (v6)
        {
            v8 = arm64g_calculate_condition(v1 | 16, v2, v3, v4);
            v1 = 3;
            v2 = (v8 & 1 ? v6 : 0x40000000);
            v3 = (v8 & 1 ? /* unsupported instruction */ : 0);
            v4 = 0;
            v9 = arm64g_calculate_condition(19, v2, v3, 0);
            v0 = v7;
            if (!(v9 & 1))
                break;
        }
        else
        {
            v10 = arm64g_calculate_condition(v1 | 16, v2, v3, v4);
            v1 = 0;
            v2 = (v10 & 1 ? v6 : 0x40000000);
            v3 = (v10 & 1 ? /* unsupported instruction */ : 0);
            v4 = 0;
            v11 = arm64g_calculate_condition(16, v2, v3, 0);
            v0 = v7;
            if (!(v11 & 1))
                break;
        }
    }
    return v5[1];
}
