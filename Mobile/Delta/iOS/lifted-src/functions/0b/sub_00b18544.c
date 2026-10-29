/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb18544..0xb18560 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b18544(unsigned long a0, unsigned int a1)
{
    unsigned int v0;  // w8

    if (!(a1 & 135))
        v0 = 0;
    else
        v0 = a1 & 1;
    if (!a1)
        return 1;
    return v0;
}
