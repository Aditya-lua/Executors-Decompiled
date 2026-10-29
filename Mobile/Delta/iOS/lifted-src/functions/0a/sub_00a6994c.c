/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6994c..0xa69974 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_a6994c(unsigned int a0, unsigned int a1)
{
    if (127 < a0)
        return 0;
    return (*(short *)(2 * a0 + 14611384) & a1) != 0;
}
