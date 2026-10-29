/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x438e90..0x438ea4 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

unsigned long long * sub_438e90(unsigned long long *a0, unsigned long long *a1)
{
    unsigned long long v0;  // x8

    v0 = *a0;
    *a0 = *a1;
    *a1 = v0;
    return a0;
}
