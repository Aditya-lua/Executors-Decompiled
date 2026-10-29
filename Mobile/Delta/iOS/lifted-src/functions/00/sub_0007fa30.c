/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7fa30..0x7fa68 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_7fa30(unsigned long a0, unsigned long long a1, unsigned int a2)
{
    unsigned long long v0;  // 4106
    unsigned long long v1;  // 4110
    unsigned long long v2;  // 4105
    unsigned long long v3;  // 4110
    unsigned long long v4;  // 4105
    unsigned long long v5;  // x9

    if (a2 == 1)
        a1 = 0;
    v0 = arm64g_calculate_condition(18, a0, 1, 0);
    if (!(v0 & 1) && !a1)
        return 0xffffffffffffffff;
    if (a1)
    {
        v1 = arm64g_calculate_condition(18, a0, 1, 0);
        v2 = arm64g_calculate_condition(2, (v1 & 1 ? a0 : 0), v1 & 1, 0);
        if (!(v2 & 1))
            goto LABEL_7fa5a;
        v5 = 500;
LABEL_7fa59:
    }
    else
    {
        v3 = arm64g_calculate_condition(18, a0, 1, 0);
        v4 = arm64g_calculate_condition(0, (v3 & 1 ? a0 : 0), v3 & 1, 0);
        if (v4 & 1)
            goto LABEL_7fa59;
LABEL_7fa5a:
        v5 = 0;
    }
    return a1 + a0 + v5;
}
