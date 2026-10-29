/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7ccdc..0x7cd0c (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_7ccdc(unsigned int *a0, unsigned int a1, unsigned int a2)
{
    unsigned int v0;  // w8

    if (a2 > a1)
        return 1;
    v0 = 0;
    while (*(short *)((char *)a0 + 2 * v0))
    {
        v0 += 1;
        if (v0 > a2)
            return 2;
    }
    return 1;
}
