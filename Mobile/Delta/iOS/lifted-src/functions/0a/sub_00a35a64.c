/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa35a64..0xa35af4 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a358cc;
extern long long g_f086e8;
extern long long g_f128d0;
extern long long g_f128d8;
extern unsigned int g_f128e0;

long long sub_a35a64(unsigned long a0, unsigned int *a1)
{
    unsigned int *v2;  // x19
    unsigned long v6;  // cc_dep2
    unsigned long v7;  // cc_ndep
    unsigned long long v8;  // 4112
    unsigned long long v9;  // 4102
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep1
    unsigned long v12;  // x0
    unsigned int *v13;  // x19
    unsigned long long v4;  // 4112
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1;
    if (sub_a7c208(&g_f086e8, &g_a358cc))
    {
        v4 = arm64g_calculate_condition(v10 | 16, v11, v6, v7);
        v5 = arm64g_calculate_condition(19, (v4 & 1 ? g_f128e0 : 0x40000000), 0, 0);
        if (v5 & 1)
            goto LABEL_a35aa8;
    }
    else
    {
        v8 = arm64g_calculate_condition(v10 | 16, v11, v6, v7);
        v9 = arm64g_calculate_condition(16, (v8 & 1 ? g_f128e0 : 0x40000000), 0, 0);
        if (v9 & 1)
        {
LABEL_a35aa8:
            v12 = sub_a7c198(g_f128d0);
            if (!(unsigned int)v12)
                return v12;
            if (*(long long *)v2)
            {
                do
                {
                    v13 = v2;
                    sub_a66994(g_f128d8, v13);
                    v2 = v13 + 4;
                } while (*(long long *)&v13[4]);
            }
            sub_a7c1b4(g_f128d0);
            return 1;
        }
    }
    return 0;
}
