/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac3be8..0xac3c14 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_ac3be8(unsigned long a0, unsigned long long a1)
{
    if (!((unsigned int)a1 & 3))
    {
        return 0;
    }
    else if (!*(long long *)(a0 + 128))
    {
        return 0;
    }
    else if (!(a1 & 1))
    {
        return 1;
    }
    else if (*(int *)(a0 + 152))
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
