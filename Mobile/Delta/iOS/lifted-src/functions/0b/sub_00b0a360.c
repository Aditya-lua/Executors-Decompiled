/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0a360..0xb0a474 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f0d568;
extern unsigned int g_f0d56c;

int sub_b0a360(char *a0, long long a1)
{
    unsigned int v2;  // w10
    unsigned long v3;  // cc_op
    unsigned long v4;  // cc_dep1
    unsigned long v5;  // cc_dep2
    unsigned long v6;  // cc_ndep
    unsigned long long v7;  // 4112
    unsigned long long v8;  // 4102
    unsigned long long v9;  // 4112
    unsigned long long v10;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(g_f0d568 >> 10 & 1))
    {
        v2 = g_f0d56c & 0xfffffff0 & 0xff0fffff;
        if (g_f0d568 >> 7 & 1 && !(v3 = 3, v4 = v2, v5 = 1208995856, v6 = 0, v2 != 1208995856))
        {
            sub_ad2220(a1, a0 + 152);
        }
        else
        {
            if (g_f0d568 >> 7 & 1)
            {
                if (v2 != 0x410fd400)
                {
                    v7 = arm64g_calculate_condition(v3 | 16, v4, v5, v6);
                    v8 = arm64g_calculate_condition(19, (v7 & 1 ? v2 : 0x40000000), (v7 & 1 ? 1091555520 : 0), 0);
                    if (!(v8 & 1))
                    {
                        sub_ace2e0(a1, a0 + 152);
                        sub_a93220(a0 + 80);
                        *(unsigned long long *)&a0[0x88] = 0;
                        *a0 = *a0 | 2;
                        return 1;
                    }
                }
                else
                {
                    v9 = arm64g_calculate_condition(v3 | 16, v4, v5, v6);
                    v10 = arm64g_calculate_condition(16, (v9 & 1 ? v2 : 0x40000000), (v9 & 1 ? 1091555520 : 0), 0);
                    if (!(v10 & 1))
                    {
                        sub_ace2e0(a1, a0 + 152);
                        sub_a93220(a0 + 80);
                        *(unsigned long long *)&a0[0x88] = 0;
                        *a0 = *a0 | 2;
                        return 1;
                    }
                }
            }
            sub_acc878(a1, a0 + 152);
        }
    }
    else
    {
        sub_acbc00(a1, a0 + 152);
    }
    sub_a93220(a0 + 80);
    *(unsigned long long *)&a0[0x88] = 0;
    *a0 = *a0 | 2;
    return 1;
}
