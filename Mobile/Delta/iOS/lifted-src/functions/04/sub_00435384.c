/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x435384..0x4353b0 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

long long sub_435384(unsigned long long *a0, unsigned long long *a1)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9
    unsigned long long v2;  // x10

    v0 = *a0;
    v1 = *a1;
    v2 = -v1;
    return v1 + v0 + (v0 - ((v2 | v0) + v1) + (v2 & ~v0)) * 2;
}
