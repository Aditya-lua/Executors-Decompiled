/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7f754..0x7f794 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_7f754(unsigned int a0, unsigned int a1, unsigned int a2, unsigned long long a3, char a4, unsigned long a5, unsigned long long a6)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9
    unsigned long v2;  // cc_dep1
    unsigned long long v3;  // x9
    unsigned long long v4;  // 4112
    unsigned long long v5;  // 4107
    unsigned long long v6;  // 4112
    unsigned long long v7;  // 4107
    unsigned long long v8;  // x10

    v0 = 1 << (a4 & 31);
    v1 = a5 + a3;
    v2 = v0;
    if (v0 >= a3)
        v0 = v1;
    v3 = 0xffffffffffffff95;
    if (!a6)
    {
        v4 = arm64g_calculate_condition(4, v2, a3, 0);
        v5 = arm64g_calculate_condition(3, (v4 & 1 ? a2 : 0x40000000), (v4 & 1 ? 3 : 0), 0);
        if (!(v5 & 1))
            goto LABEL_7f77e;
        v8 = 3;
LABEL_7f77d:
    }
    else
    {
        v6 = arm64g_calculate_condition(4, v2, a3, 0);
        v7 = arm64g_calculate_condition(0, (v6 & 1 ? a2 : 0x40000000), (v6 & 1 ? 3 : 0), 0);
        if (v7 & 1)
            goto LABEL_7f77d;
LABEL_7f77e:
        v8 = 4;
    }
    if (a1 >= v8)
        v3 = 0;
    if (v0 + 3 >= a0)
        return v3;
    return 0xffffffffffffff95;
}
