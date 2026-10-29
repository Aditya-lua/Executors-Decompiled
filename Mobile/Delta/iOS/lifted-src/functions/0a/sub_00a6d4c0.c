/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6d4c0..0xa6d598 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f12e88;
extern long long g_f12e90;
extern unsigned long long g_f12e98;
extern unsigned long long g_f12eb0;
extern unsigned long long g_f12eb8;

unsigned long long sub_a6d4c0(unsigned long long a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // 4110
    unsigned long long v4;  // 4102
    unsigned long long v5;  // 4110
    unsigned long long v6;  // 4102
    unsigned long long v7;  // x0
    long long v8;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return a0;
    if (g_f12e88 == 1)
    {
        v2 = g_f12eb0 + g_f12eb8;
        if (g_f12eb0 <= a0)
        {
            v3 = arm64g_calculate_condition(147, g_f12e88, 1, 0);
            v4 = arm64g_calculate_condition(132, (v3 & 1 ? v2 : 0), (v3 & 1 ? a0 : 0), 0);
            if (v4 & 1)
                goto LABEL_a6d52c;
        }
        else
        {
            v5 = arm64g_calculate_condition(147, g_f12e88, 1, 0);
            v6 = arm64g_calculate_condition(128, (v5 & 1 ? v2 : 0), (v5 & 1 ? a0 : 0), 0);
            if (v6 & 1)
            {
LABEL_a6d52c:
                v7 = sub_a7c198(g_f12e90);
                if (!(unsigned int)v7)
                    return v7;
                v8 = sub_a6cd14(a0);
                sub_a66ec0(a0, v8);
                g_f12e98 = g_f12e98 - v8;
                sub_a6cf8c(a0);
            }
        }
    }
    sub_a66ec0();
}
