/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d6eb8..0x3d6ef0 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

unsigned int sub_3d6eb8(unsigned int a0)
{
    unsigned int v0;  // w8
    unsigned int v1;  // w8

    v0 = ((a0 >> 1 & 0x55555555) + (a0 & 0x55555555) >> 2 & 0x33333333) + ((a0 >> 1 & 0x55555555) + (a0 & 0x55555555) & 0x33333333) + (((a0 >> 1 & 0x55555555) + (a0 & 0x55555555) >> 2 & 0x33333333) + ((a0 >> 1 & 0x55555555) + (a0 & 0x55555555) & 0x33333333) >> 4);
    v1 = (v0 & 0xf0f0f0f) + ((v0 & 0xf0f0f0f) >> 8);
    return v1 + (v1 >> 16) & 63;
}
