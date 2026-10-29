/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1adc88..0x1adcd8 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long * sub_1adc88(long long *a0)
{
    long long v4;  // x8
    unsigned long long v5;  // x30
    unsigned long long v6;  // x8
    unsigned long long v7;  // 4162
    unsigned long long v0;  // [bp-0x18]
    char *v1;  // [bp-0x10]
    unsigned long long v2;  // [bp-0x8]
    char v3;  // [bp+0x0]

    v4 = *a0;
    if (v4 < 1)
        return a0;
    v1 = &v3;
    v2 = v5;
    v6 = 1000 * v4;
    v7 = arm64g_calculate_condition(64, (((((char)(CmpF(__double_as_longlong((double)(unsigned long long)v4), 9223372036000000.0)) >> 5 & 3 | (double)(unsigned long long)v4 < 9223372036000000.0) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan((double)(unsigned long long)v4)) * 0x10000000, 0, 0);
    if (!(v7 & 1))
        v6 = 0x7fffffffffffffff;
    v0 = v6;
    return std::__1::this_thread::sleep_for();
}
