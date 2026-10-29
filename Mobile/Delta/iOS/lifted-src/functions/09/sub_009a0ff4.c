/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a0ff4..0x9a1048 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9a0ff4(unsigned int a0)
{
    unsigned long long v0;  // w10

    if (0x33 >= a0 && 1 << ((char)a0 & 63) & 3023691486952483)
        return 1;
    if (a0 == 0xff01)
        v0 = 1;
    else
        v0 = 0;
    if (a0 != 13172)
        return v0;
    return 1;
}
