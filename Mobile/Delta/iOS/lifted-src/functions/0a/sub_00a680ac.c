/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa680ac..0xa680ec (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a680ec;
extern long long g_f08ef0;
extern char g_f12a98;
extern unsigned int g_f12be8;

long long sub_a680ac(void)
{
    unsigned long long v3;  // x30
    unsigned int v4;  // w0
    unsigned long v7;  // cc_dep2
    unsigned long v8;  // cc_ndep
    unsigned long long v9;  // 4112
    unsigned long long v10;  // 4107
    unsigned long v11;  // cc_op
    unsigned long v12;  // cc_dep1
    unsigned long long v5;  // 4112
    unsigned long long v6;  // 4107
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    v0 = &v2;
    v1 = v3;
    v4 = sub_a7c208(&g_f08ef0, &g_a680ec);
    if (g_f12be8)
    {
        v5 = arm64g_calculate_condition(v11 | 16, v12, v7, v8);
        v6 = arm64g_calculate_condition(19, (v5 & 1 ? v4 : 0x40000000), 0, 0);
        if (!(v6 & 1))
            return 0;
    }
    else
    {
        v9 = arm64g_calculate_condition(v11 | 16, v12, v7, v8);
        v10 = arm64g_calculate_condition(16, (v9 & 1 ? v4 : 0x40000000), 0, 0);
        if (!(v10 & 1))
            return 0;
    }
    return &g_f12a98;
}
