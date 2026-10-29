/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6c81c..0x6c874 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_6c81c(long long a0)
{
    if (!a0)
        return a0;
    if (a0 >= 1)
    {
        if ((unsigned long long)a0 > 9223372036854775)
            return 0x7fffffffffffffff;
    }
    else
    {
        if (0xffdf3b645a1cac09 > (unsigned long long)a0)
            return -0x8000000000000000;
    }
    return 1000 * a0;
}
