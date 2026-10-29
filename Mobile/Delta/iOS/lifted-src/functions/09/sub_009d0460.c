/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d0460..0x9d047c (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_9d0460(unsigned long long *a0, unsigned long long *a1, unsigned long long *a2)
{
    if (a1)
        *a1 = *a0;
    if (a2)
        *a2 = a0[1];
    return a0;
}
