/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x79590..0x795b0 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_79590(unsigned long long *a0, unsigned long a1)
{
    unsigned long long v0;  // x8

    v0 = *a0;
    if ((char)v0)
        *a0 = a1 << ((char)-(v0 & 0xff) & 63) | v0;
    return a0;
}
