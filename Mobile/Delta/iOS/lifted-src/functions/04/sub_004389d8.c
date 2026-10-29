/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4389d8..0x438a04 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

long long sub_4389d8(unsigned long long *a0, unsigned long long *a1)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x10

    v0 = *a0;
    v1 = -*a1;
    return (v0 ^ v1) + (v0 - (*a1 + (v0 | v1))) * 2;
}
