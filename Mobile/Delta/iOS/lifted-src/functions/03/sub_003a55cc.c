/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3a55cc..0x3a55ec (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double * sub_3a55cc(double *a0, double *a1, double *a2)
{
    double v0;  // d0
    double v1;  // d1
    double v2;  // d2
    unsigned long long v3;  // 4140
    unsigned long long v4;  // 4128

    v0 = *a0;
    v1 = *a1;
    v2 = *a2;
    v3 = arm64g_calculate_condition(64, (((((char)(CmpF(__double_as_longlong(v2), __double_as_longlong(v0))) >> 5 & 3 | v2 < v0) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isunordered(v2, v0)) * 0x10000000, 0, 0);
    if (v3 & 1)
        a0 = a2;
    v4 = arm64g_calculate_condition(64, (((((char)(CmpF(__double_as_longlong(v0), __double_as_longlong(v1))) >> 5 & 3 | v0 < v1) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isunordered(v0, v1)) * 0x10000000, 0, 0);
    if (!(v4 & 1))
        return a0;
    return a1;
}
