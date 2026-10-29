/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b32fc..0x1b3340 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_cc33d4;

long long sub_1b32fc(char *a0, char *a1, char *a2)
{
    unsigned long v0;  // cc_op
    unsigned long iter;  // x8
    unsigned long v2;  // cc_dep2
    char *v3;  // x2
    unsigned int v4;  // w10
    unsigned int v5;  // w11
    unsigned long v6;  // 4110
    unsigned long long v7;  // 4105
    unsigned long v8;  // 4110
    unsigned long long v9;  // 4105

    v0 = 4;
    if (a0 == a1)
        return 1;
    iter = a0 + 1;
    v2 = a1;
    while (1)
    {
        v3 = a2 + 1;
        v4 = (&g_cc33d4)[*(char *)(iter - 1)];
        v5 = (&g_cc33d4)[*a2];
        if (v4 == v5)
        {
            v6 = arm64g_calculate_condition(v0, a0, v2, 0);
            v0 = 4;
            a0 = (v6 & 1 ? iter : 0x40000000);
            v2 = (v6 & 1 ? a1 : 0);
            iter += 1;
            v7 = arm64g_calculate_condition(20, a0, v2, 0);
            a2 = v3;
            if (!(v7 & 1))
                break;
        }
        else
        {
            v8 = arm64g_calculate_condition(v0, a0, v2, 0);
            v0 = 0;
            a0 = (v8 & 1 ? iter : 0x40000000);
            v2 = (v8 & 1 ? a1 : 0);
            iter += 1;
            v9 = arm64g_calculate_condition(16, a0, v2, 0);
            a2 = v3;
            if (!(v9 & 1))
                break;
        }
    }
    return v4 == v5;
}
