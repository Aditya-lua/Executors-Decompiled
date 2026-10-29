/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x828cc..0x8290c (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_e6b3c8;
extern char g_e6b508;

long long sub_828cc(unsigned int a0, unsigned int a1, int a2)
{
    unsigned int v0;  // w8
    unsigned long v1;  // cc_op
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // cc_dep2
    unsigned long v8;  // cc_ndep
    unsigned long v9;  // 4112
    unsigned long long *v10;  // x8
    unsigned long long *v11;  // x9
    unsigned long long v12;  // 4142
    unsigned long v2;  // 4112
    unsigned long v3;  // cc_op
    unsigned long v4;  // cc_dep1
    unsigned long v5;  // cc_dep2

    v0 = a0 - 3;
    if (a1 == 1)
    {
        v2 = arm64g_calculate_condition(v1, v6, v7, v8);
        v3 = 3;
        v4 = (v2 & 1 ? v0 : 0x20000000);
        v5 = (v2 & 1 ? 2 : 0);
    }
    else
    {
        v9 = arm64g_calculate_condition(v1, v6, v7, v8);
        v3 = 0;
        v4 = (v9 & 1 ? v0 : 0x20000000);
        v5 = (v9 & 1 ? 2 : 0);
    }
    v10 = &(&g_e6b508)[a2 * 24 + 8 * v0];
    v11 = &(&g_e6b3c8)[a2 * 80 + 8 * a0];
    v12 = arm64g_calculate_condition(v3 | 128, v4, v5, 0);
    if (v12 & 1)
        v10 = v11;
    return *v10;
}
