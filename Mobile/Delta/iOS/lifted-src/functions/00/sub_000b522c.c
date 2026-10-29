/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb522c..0xb5264 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int * sub_b522c(unsigned int *a0, unsigned int a1)
{
    unsigned int v0;  // w8
    unsigned int v1;  // w9

    v0 = a1 - a0[2];
    if (v0 <= a0[11] + 0x400)
        return a0;
    v1 = v0 - a0[11] - 0x400;
    if (v1 >= 0x200)
        v1 = 0x200;
    a0[11] = v0 - v1;
    return a0;
}
