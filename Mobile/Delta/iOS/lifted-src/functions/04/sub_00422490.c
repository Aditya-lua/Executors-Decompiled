/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x422490..0x4224b4 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_422490(unsigned long long *a0)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x10

    v0 = a0[3];
    v1 = -*a0;
    return (v1 ^ v0) + (v0 - ((v1 | v0) + *a0)) * 2;
}
