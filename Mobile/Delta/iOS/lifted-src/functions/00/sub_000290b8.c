/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x290b8..0x290e4 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_290b8(unsigned long long *a0, unsigned long long *a1)
{
    if (*a0 == *a1)
        return a0[1] != a1[1];
    return 1;
}
