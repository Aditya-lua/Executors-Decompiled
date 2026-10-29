/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4ed4c..0x4ed94 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_4ed4c(unsigned long long *a0, unsigned long long *a1)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x1
    unsigned long long v2;  // x9
    unsigned long long v3;  // 4152
    unsigned long long v4;  // x8

    v0 = *a1 + *a0;
    v1 = a1[1] & a0[1];
    v2 = v1 & 0x101010101010101 | 1;
    v3 = arm64g_calculate_condition(2, v1, 1, 0);
    if (v3 & 1)
        v2 = 0;
    v4 = v2 + ((v0 & 0x8080808080808080) - ((v0 & 0x8080808080808080) >> 7) | v0 & 0x7f7f7f7f7f7f7f7f);
    return (v4 & 0x8080808080808080) - ((v4 & 0x8080808080808080) >> 7) | v4 & 0x7f7f7f7f7f7f7f7f;
}
