/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6b83c..0xa6b874 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a6b874;
extern long long g_f08fe0;

long long sub_a6b83c(void)
{
    unsigned long long v3;  // x30
    unsigned long v8;  // cc_dep1
    unsigned long v9;  // cc_dep2
    unsigned long v10;  // cc_ndep
    unsigned long v11;  // 4112
    unsigned long v12;  // cc_op
    unsigned long long v13;  // 4109
    unsigned long v5;  // 4112
    unsigned long v6;  // cc_op
    unsigned long v7;  // cc_dep1
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    v0 = &v2;
    v1 = v3;
    if (sub_a7c208(&g_f08fe0, &g_a6b874))
    {
        v5 = arm64g_calculate_condition(v12 | 16, v8, v9, v10);
        v6 = 3;
        v7 = (v5 & 1 ? *(int *)15806064 : 0x40000000);
    }
    else
    {
        v11 = arm64g_calculate_condition(v12 | 16, v8, v9, v10);
        v6 = 0;
        v7 = (v11 & 1 ? *(int *)15806064 : 0x40000000);
    }
    v13 = arm64g_calculate_condition(v6, v7, 0, 0);
    return !(v13 & 1);
}
