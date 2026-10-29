/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4d3c8..0xa4d408 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a4d3c8(unsigned int a0)
{
    unsigned int v0;  // w8
    unsigned int v1;  // w9

    v0 = a0 >> 3;
    if (!(a0 & 7))
        v1 = v0;
    else
        v1 = v0 + 1;
    if (!a0)
        v1 = 0;
    if (a0 & 7)
        v0 += 1;
    if (0x7ffffff6 >= a0)
        v0 = a0 + 7 >> 3;
    if ((int)a0 >= 1)
        return v0;
    return v1;
}
