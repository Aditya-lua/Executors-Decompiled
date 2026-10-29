/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7cd0c..0x7cd78 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_7cd0c(unsigned int a0, unsigned int *a1, unsigned long long a2)
{
    if (!(unsigned int)a2 && *a1 == a0)
        return 1;
    if (a1[1] == a0)
    {
        return 2 - a2;
    }
    else if (a1[2] == a0)
    {
        return 3 - a2;
    }
    else if (!(unsigned int)a2)
    {
        return a0 + 3;
    }
    else if (*a1 - 1 == a0)
    {
        return 3;
    }
    else
    {
        return a0 + 3;
    }
}
