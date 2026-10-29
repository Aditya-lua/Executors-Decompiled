/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x968050..0x968084 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_968050(unsigned long long *a0, unsigned long long *a1, unsigned long long *a2)
{
    unsigned long long *v0;  // x8
    unsigned long long *v1;  // x9

    if (a0[338])
    {
        v0 = a0 + 344;
        v1 = a0 + 343;
    }
    else
    {
        v0 = a0[1] + 696;
        v1 = a0[1] + 688;
    }
    *a1 = *v0;
    *a2 = *v1;
    return a0;
}
