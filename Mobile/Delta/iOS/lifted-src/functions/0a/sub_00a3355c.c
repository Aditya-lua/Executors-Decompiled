/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3355c..0xa33620 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a32f08;
extern long long g_f086d8;
extern unsigned int g_f0d558;
extern long long g_f0d560;
extern unsigned long long g_f12820;

long long sub_a3355c(void)
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
    if (sub_a7c208(&g_f086d8, &g_a32f08))
    {
        v4 = arm64g_calculate_condition(v3 | 16, v9, v10, v6);
        v5 = arm64g_calculate_condition(19, (v4 & 1 ? g_f0d558 : 0x40000000), 0, 0);
        if (v5 & 1)
            goto LABEL_a335c8;
LABEL_a33594:
        sub_a368c8();
        sub_a369bc("crypto/engine/eng_list.c", 235, "ENGINE_get_first");
        sub_a36abc(38, 0x8000f, 0);
    }
    else
    {
        v7 = arm64g_calculate_condition(v3 | 16, v9, v10, v6);
        v8 = arm64g_calculate_condition(16, (v7 & 1 ? g_f0d558 : 0x40000000), 0, 0);
        if (!(v8 & 1))
            goto LABEL_a33594;
LABEL_a335c8:
        if (sub_a7c198(g_f0d560))
        {
            if (g_f12820)
            {
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
            }
            sub_a7c1b4(g_f0d560);
            return g_f12820;
        }
    }
    return 0;
}
