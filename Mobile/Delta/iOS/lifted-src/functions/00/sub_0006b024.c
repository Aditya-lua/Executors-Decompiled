/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6b024..0x6b06c (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_6b024(double a0)
{
    double v0;  // d0
    unsigned long long v1;  // 4143
    unsigned long long v2;  // 4126

    v0 = a0 * 1000000.0;
    v1 = arm64g_calculate_condition(160, (((((char)(CmpF(__double_as_longlong(v0), 9.223372036854776e+18)) >> 5 & 3 | v0 < 9.223372036854776e+18) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v0)) * 0x10000000, 0, 0);
    if (v1 & 1)
        return 0x7fffffffffffffff;
    v2 = arm64g_calculate_condition(144, (((((char)(CmpF(__double_as_longlong(v0), -9.223372036854776e+18)) >> 5 & 3 | v0 < -9.223372036854776e+18) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v0)) * 0x10000000, 0, 0);
    if (v2 & 1)
        return -0x8000000000000000;
    return (long long)v0;
}
