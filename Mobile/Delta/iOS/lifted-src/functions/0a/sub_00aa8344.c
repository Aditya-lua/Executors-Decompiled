/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa8344..0xaa8420 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_aa82c8;
extern long long g_f09060;
extern char g_f09070;
extern unsigned long long g_f12f58;
extern unsigned long long g_f12f70;
extern unsigned int g_f12f78;
extern unsigned long long g_f12f80;

long long sub_aa8344(void)
{
    unsigned long v3;  // cc_op
    unsigned long v6;  // cc_ndep
    unsigned long long v7;  // 4112
    unsigned long long v8;  // 4102
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // x0
    unsigned long v12;  // x19
    unsigned long long v4;  // 4112
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a7c208(&g_f09060, &g_aa82c8))
    {
        v4 = arm64g_calculate_condition(v3 | 16, v9, v10, v6);
        v5 = arm64g_calculate_condition(19, (v4 & 1 ? g_f12f78 : 0x40000000), 0, 0);
        if (v5 & 1)
            goto LABEL_aa8384;
    }
    else
    {
        v7 = arm64g_calculate_condition(v3 | 16, v9, v10, v6);
        v8 = arm64g_calculate_condition(16, (v7 & 1 ? g_f12f78 : 0x40000000), 0, 0);
        if (v8 & 1)
        {
LABEL_aa8384:
            if (!g_f12f70)
            {
                return g_f12f70;
            }
            else if (sub_a7c17c(g_f12f70))
            {
                sub_a7c1b4(g_f12f70);
                if (g_f12f58)
                {
                    return g_f12f58;
                }
                else if (sub_a7c198(g_f12f70))
                {
                    v11 = g_f12f58;
                    if (!v11)
                    {
                        v12 = sub_a35610(0);
                        if (v12 && !(v11 = sub_97725c(v12), !v11))
                        {
                            g_f12f80 = v12;
                        }
                        else
                        {
                            sub_a32e7c(v12);
                            v11 = &g_f09070;
                        }
                        g_f12f58 = v11;
                    }
                    sub_a7c1b4(g_f12f70);
                    return v11;
                }
            }
        }
    }
    return 0;
}
