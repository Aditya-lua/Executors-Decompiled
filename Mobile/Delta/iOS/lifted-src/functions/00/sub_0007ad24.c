/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7ad24..0x7ad50 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_7ad24(unsigned long a0, unsigned long long *a1, unsigned long a2)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9
    unsigned long long v2;  // x10
    unsigned long v3;  // cc_dep1
    unsigned long v4;  // cc_dep2
    unsigned long long v5;  // x8
    unsigned long long v6;  // 4104
    unsigned long long v7;  // 4104

    v0 = a2 - (a2 - 1 & a0) & a2 - 1;
    v1 = *a1;
    v2 = a0 + v0;
    v3 = v1;
    v4 = v0;
    if (v1 < v0)
    {
        v5 = 0;
        v6 = arm64g_calculate_condition(52, v3, v4, 0);
        if (!(v6 & 1))
            goto LABEL_7ad46;
LABEL_7ad45:
        v2 = 0;
    }
    else
    {
        v5 = v1 - v0;
        v7 = arm64g_calculate_condition(52, v3, v4, 0);
        if (v7 & 1)
            goto LABEL_7ad45;
LABEL_7ad46:
    }
    *a1 = v5;
    return v2;
}
