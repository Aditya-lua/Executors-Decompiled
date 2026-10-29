/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x188c8c..0x188ccc (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_188c8c(unsigned long a0)
{
    double v0;  // d0
    unsigned long long v1;  // 4134
    unsigned long long v2;  // 4126

    v0 = *(double *)(a0 + 16);
    v1 = arm64g_calculate_condition(208, (((((char)(CmpF(__double_as_longlong(v0), 2147483647.0)) >> 5 & 3 | v0 < 2147483647.0) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v0)) * 0x10000000, 0, 0);
    if (!(v1 & 1))
        return -0x80000000;
    v2 = arm64g_calculate_condition(80, (((((char)(CmpF(__double_as_longlong(v0), -2147483648.0)) >> 5 & 3 | v0 < -2147483648.0) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v0)) * 0x10000000, 0, 0);
    if (v2 & 1)
        return (int)v0;
    return 0x7fffffff;
}
