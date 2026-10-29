/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa80000..0xa8002c (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a80000(unsigned long a0, unsigned long long a1)
{
    if (!((unsigned int)a1 & 3))
    {
        return 0;
    }
    else if (!*(long long *)(a0 + 160))
    {
        return 0;
    }
    else if (!(a1 & 1))
    {
        return 1;
    }
    else if (*(long long *)(a0 + 168))
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
