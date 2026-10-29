/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbeed0..0xbef14 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_beed0(unsigned int *a0, unsigned int *a1, char a2)
{
    unsigned long long v0;  // x0
    unsigned long long v1;  // x9
    unsigned long long v2;  // x0
    long long v3;  // x13
    unsigned long long v4;  // 4133

    v0 = 0;
    v1 = 0;
    do
    {
        v2 = v0;
        v3 = a0[v1] * *(long long *)&a1[0x400] - a1[v1] * *(long long *)&a0[0x400];
        v4 = arm64g_calculate_condition(84, v3, 0, 0);
        if (!(v4 & 1))
            v3 = -v3;
    } while ((v0 = v3 + v2, v1 += 1, !(v1 >> (a2 & 63))));
    return v3 + v2;
}
