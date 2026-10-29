/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x979cd4..0x979cec (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_979cd4(unsigned int a0, unsigned long long *a1)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9

    v0 = 1376;
    v1 = 1368;
    if (!a0)
        v0 = v1;
    return *(long long *)((char *)a1 + v0);
}
