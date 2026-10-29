/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa25440..0xa25480 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_a25440(unsigned long long *a0, unsigned long long *a1, unsigned long long *a2)
{
    unsigned long long v0;  // 4157
    unsigned long long v1;  // x8
    unsigned long long v2;  // 4165
    unsigned long long v3;  // x9
    unsigned long long v4;  // 4173
    unsigned long long v5;  // x10

    v0 = arm64g_calculate_flag_c(4, *a1, *a2, 0);
    v1 = a1[1] - a2[1] - (v0 ^ 1);
    v2 = arm64g_calculate_flag_c(8, a1[1], a2[1], v0);
    v3 = a1[2] - a2[2] - (v2 ^ 1);
    v4 = arm64g_calculate_flag_c(8, a1[2], a2[2], v2);
    v5 = a1[3] - a2[3] - (v4 ^ 1);
    *a0 = *a1 - *a2;
    a0[1] = v1;
    a0[2] = v3;
    a0[3] = v5;
    return a0;
}
