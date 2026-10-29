/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x408144..0x408170 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_408144(unsigned long long *a0)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x10

    v0 = a0[1];
    v1 = -*a0;
    return (long long)(*a0 + v0 + (v1 & ~v0) * 2 + (v0 + (v1 | ~v0)) * 2 + 2) >> 3;
}
