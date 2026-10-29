/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf44..0xaf64 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_af44(unsigned int **a0)
{
    if (a0[12] == a0[13])
        return 0;
    return *(int *)((char *)a0[13] - 4) | 0x100000000;
}
