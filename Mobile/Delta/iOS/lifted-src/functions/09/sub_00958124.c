/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x958124..0x958170 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_958170;
extern long long g_f08368;
extern unsigned int g_f08378;
extern unsigned int g_f1278c;

unsigned int sub_958124(void)
{
    unsigned long v3;  // cc_op
    unsigned long v6;  // cc_ndep
    unsigned long long v7;  // 4112
    unsigned long long v8;  // 4102
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long long v4;  // 4112
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a7c208(&g_f08368, &g_958170))
    {
        v4 = arm64g_calculate_condition(v3 | 16, v9, v10, v6);
        v5 = arm64g_calculate_condition(19, (v4 & 1 ? g_f1278c : 0x40000000), 0, 0);
        if (!(v5 & 1))
            return 0xffffffff;
    }
    else
    {
        v7 = arm64g_calculate_condition(v3 | 16, v9, v10, v6);
        v8 = arm64g_calculate_condition(16, (v7 & 1 ? g_f1278c : 0x40000000), 0, 0);
        if (!(v8 & 1))
            return 0xffffffff;
    }
    return g_f08378;
}
