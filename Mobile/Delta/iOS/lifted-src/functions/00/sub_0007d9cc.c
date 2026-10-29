/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7d9cc..0x7d9f4 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_7d9cc(unsigned long long *a0, unsigned long a1)
{
    if (!a1)
    {
        return 0;
    }
    else if (*a0 > a1)
    {
        return 0;
    }
    else
    {
        return a0[1] > a1;
    }
}
