/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9882c4..0x98830c (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9882c4(unsigned long long *a0, unsigned long long *a1)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9

    v0 = __builtin_bswap64(a0[6]);
    v1 = __builtin_bswap64(a1[6]);
    if (v0 == v1)
    {
        v0 = __builtin_bswap64(a0[7]);
        v1 = __builtin_bswap64(a1[7]);
        if (v0 == v1)
            return 0;
    }
    if (v0 >= v1)
        return 0;
    return 0xffffffff;
}
