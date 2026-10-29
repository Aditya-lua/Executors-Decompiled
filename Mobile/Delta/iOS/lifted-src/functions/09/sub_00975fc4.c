/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x975fc4..0x975fdc (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

unsigned long long sub_975fc4(unsigned long long *a0, unsigned long long *a1)
{
    if (*a1 > *a0)
        return 0xffffffff;
    return *a0 > *a1;
}
