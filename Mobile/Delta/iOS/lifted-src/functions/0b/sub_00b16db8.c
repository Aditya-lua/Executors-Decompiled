/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb16db8..0xb16de0 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_b16db8(unsigned long a0, unsigned long long a1)
{
    if (!(unsigned int)a1)
    {
        return 1;
    }
    else if (a1 & 1)
    {
        return 1;
    }
    else if (a1 >> 1 & 1)
    {
        return 0;
    }
    else if ((unsigned int)a1 & 132)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
