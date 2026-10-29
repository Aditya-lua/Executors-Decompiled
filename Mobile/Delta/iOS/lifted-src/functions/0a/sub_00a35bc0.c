/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa35bc0..0xa35cc4 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a362f8;
extern long long g_a3632c;
extern long long g_f08c38;
extern long long g_f128c8;
extern long long g_f129e4;

long long sub_a35bc0(void)
{
    unsigned int *v2;  // x0
    long long v3;  // x0
    unsigned long long v4;  // 4106
    long long v5;  // x0
    unsigned int *v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = ___error();
    if (!sub_a6afb8(0x40000, 0))
        return 0;
    if (!sub_a7c208(&g_f08c38, &g_a362f8))
    {
        return 0;
    }
    else if ((int)g_f129e4)
    {
        v3 = sub_a7bbe0(&g_f128c8);
        v4 = arm64g_calculate_condition(2, v3, 1, 0);
        if (!(v4 & 1))
        {
            if (v3)
            {
                v6 = ___error();
                *v6 = *v2;
                return v3;
            }
            else if (sub_a7bbe8(&g_f128c8, -0x1))
            {
                v5 = sub_a3708c();
                if (v5)
                {
                    v3 = v5;
                    if (sub_a6bce8(0, 0, &g_a3632c) && sub_a7bbe8(&g_f128c8, v3))
                    {
                        sub_a6afb8(2, 0);
                        v6 = ___error();
                        *v6 = *v2;
                        return v3;
                    }
                    sub_a356d0(v3);
                }
                sub_a7bbe8(&g_f128c8, 0);
            }
        }
    }
    else
    {
        return 0;
    }
    return 0;
}
