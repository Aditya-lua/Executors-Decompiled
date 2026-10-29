/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb19af8..0xb19b14 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b19af8(unsigned long a0, unsigned int a1)
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
