/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x10c04..0x10c2c (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_10c04(unsigned long long a0, unsigned long long a1)
{
    if (!(a1 & a1 - 1))
        return a1 - 1 & a0;
    if (a0 >= a1)
        a0 -= a1 * a0 / a1;
    return a0;
}
