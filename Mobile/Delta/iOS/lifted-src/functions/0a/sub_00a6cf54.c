/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6cf54..0xa6cf8c (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f12e88;
extern unsigned long long g_f12eb0;
extern unsigned long long g_f12eb8;

long long sub_a6cf54(unsigned long a0)
{
    unsigned long long v0;  // x8
    unsigned long v1;  // 4110
    unsigned long v2;  // cc_op
    unsigned long v3;  // cc_dep1
    unsigned long v4;  // cc_dep2
    unsigned long v5;  // 4110
    unsigned long long v6;  // 4105

    if (g_f12e88 != 1)
        return 0;
    v0 = g_f12eb0 + g_f12eb8;
    if (g_f12eb0 <= a0)
    {
        v1 = arm64g_calculate_condition(147, g_f12e88, 1, 0);
        v2 = 4;
        v3 = (v1 & 1 ? v0 : 0);
        v4 = (v1 & 1 ? a0 : 0);
    }
    else
    {
        v5 = arm64g_calculate_condition(147, g_f12e88, 1, 0);
        v2 = 0;
        v3 = (v5 & 1 ? v0 : 0);
        v4 = (v5 & 1 ? a0 : 0);
    }
    v6 = arm64g_calculate_condition(v2 | 144, v3, v4, 0);
    return !(v6 & 1);
}
