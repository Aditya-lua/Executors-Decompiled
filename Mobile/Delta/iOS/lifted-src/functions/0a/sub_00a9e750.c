/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9e750..0xa9e79c (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a9e750(unsigned int a0, unsigned int a1, unsigned int a2)
{
    unsigned int v0;  // w8
    unsigned int v1;  // w9
    unsigned int v2;  // w8

    v0 = a0 + 7 >> 3;
    if (!a2)
        v1 = (a0 + 15 >> 4) * 5 + v0 * 2 + 4;
    else
        v1 = v0 + 4;
    if (!a2)
        v2 = v0 * 2 + 64;
    else
        v2 = v0 * 3 + 44;
    if (a1)
        return v2;
    return v1;
}
