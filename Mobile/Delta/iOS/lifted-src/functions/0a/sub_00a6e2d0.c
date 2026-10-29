/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6e2d0..0xa6e2fc (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a6e2d0(char *a0, unsigned int a1)
{
    unsigned long v0;  // x8

    v0 = a1;
    *a0 = *(char *)((v0 >> 4) + 13207245);
    a0[1] = *(char *)((v0 & 15) + 13207245);
    return 2;
}
