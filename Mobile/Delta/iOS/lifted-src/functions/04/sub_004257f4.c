/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4257f4..0x42581c (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_4257f4(unsigned long long a0, unsigned long a1)
{
    unsigned long long v0;  // x8

    v0 = -a0;
    return a0 + a1 + a0 + (v0 & ~a1) * 2 + (a1 + (v0 | ~a1)) * 2 + 2;
}
