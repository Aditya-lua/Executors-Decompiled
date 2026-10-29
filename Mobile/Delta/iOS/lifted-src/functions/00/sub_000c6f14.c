/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6f14..0xc6f44 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_c6f14(unsigned long idx, unsigned long long a1, unsigned long a2)
{
    unsigned long long v0;  // x8

    if (a2)
    {
        v0 = *(long long *)(idx + 29888);
        if (v0 != a1)
        {
            *(unsigned long long *)(idx + 29912) = v0;
            *(unsigned long long *)(idx + 29904) = a1 + *(long long *)(idx + 29896) - v0;
            *(unsigned long long *)(idx + 29896) = a1;
            *(unsigned long long *)(idx + 29888) = a1;
        }
    }
    return idx;
}
