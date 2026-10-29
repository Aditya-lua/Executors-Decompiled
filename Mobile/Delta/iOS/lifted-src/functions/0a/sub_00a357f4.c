/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa357f4..0xa358cc (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a358cc;
extern long long g_f086e8;
extern unsigned long long g_f086f8[3];
extern unsigned long long g_f089b8[3];
extern long long g_f128d0;
extern long long g_f128d8;
extern unsigned int g_f128e0;

int sub_a357f4(void)
{
    unsigned long v3;  // cc_op
    unsigned long v6;  // cc_ndep
    unsigned long long v7;  // 4112
    unsigned long long v8;  // 4102
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long long *v11;  // x19
    unsigned long long *v12;  // x19
    unsigned long long *v13;  // x19
    unsigned long long *v14;  // x19
    unsigned long long v4;  // 4112
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a7c208(&g_f086e8, &g_a358cc))
    {
        v4 = arm64g_calculate_condition(v3 | 16, v9, v10, v6);
        v5 = arm64g_calculate_condition(19, (v4 & 1 ? g_f128e0 : 0x40000000), 0, 0);
        if (v5 & 1)
            goto LABEL_a35834;
    }
    else
    {
        v7 = arm64g_calculate_condition(v3 | 16, v9, v10, v6);
        v8 = arm64g_calculate_condition(16, (v7 & 1 ? g_f128e0 : 0x40000000), 0, 0);
        if (v8 & 1)
        {
LABEL_a35834:
            if (sub_a7c198(g_f128d0))
            {
                if (g_f086f8)
                {
                    v11 = &g_f086f8[0];
                    do
                    {
                        v12 = v11;
                        sub_a66794(g_f128d8, v12);
                        v11 = v12 + 2;
                    } while (v12[2]);
                }
                sub_a7c1b4(g_f128d0);
            }
            if (!sub_a7c198(g_f128d0))
                return 1;
            if (g_f089b8)
            {
                v13 = &g_f089b8[0];
                do
                {
                    v14 = v13;
                    sub_a66794(g_f128d8, v14);
                    v13 = v14 + 2;
                } while (v14[2]);
            }
            sub_a7c1b4(g_f128d0);
            return 1;
        }
    }
    return 0;
}
