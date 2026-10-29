/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb240c0..0xb240e0 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b240c0(unsigned long a0, unsigned int a1)
{
    unsigned int v0;  // w9

    if (!(a1 & 135))
        v0 = 0;
    else
        v0 = 1 & ~a1;
    if (a1)
        return v0;
    return 1;
}
