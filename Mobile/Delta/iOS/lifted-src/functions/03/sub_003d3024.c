/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d3024..0x3d305c (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_3d3024(unsigned int a0, unsigned int a1)
{
    unsigned long long v0;  // 4226
    unsigned int v1;  // w10

    v0 = arm64g_calculate_condition(169, a1 & a0, 0, 0);
    if (v0 & 1)
        v1 = (int)(a1 ^ 0x7fffffff) >= (int)a0;
    else
        v1 = (int)a0 >= (int)(0x80000000 - a1);
    if (!(a1 >> 31 & 1 ^ a0 >> 31 & 1))
        return v1;
    return 1;
}
