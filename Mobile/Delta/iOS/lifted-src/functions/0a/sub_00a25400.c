/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa25400..0xa25440 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_a25400(unsigned long long *a0)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9
    unsigned long long v2;  // x10

    v0 = a0[1];
    v1 = a0[2];
    v2 = a0[3];
    *a0 = v0 * 0x8000000000000000 | *a0 >> 1;
    a0[1] = v1 * 0x8000000000000000 | v0 >> 1;
    a0[2] = v2 * 0x8000000000000000 | v1 >> 1;
    a0[3] = v2 >> 1;
    return a0;
}
