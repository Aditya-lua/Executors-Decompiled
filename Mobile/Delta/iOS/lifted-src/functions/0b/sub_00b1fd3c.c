/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb1fd3c..0xb1fd64 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_b1fd3c(unsigned long a0, unsigned int a1)
{
    if (!a1)
    {
        return 1;
    }
    else if (a1 & 3)
    {
        return 0;
    }
    else if (!(a1 & 132))
    {
        return 0;
    }
    else
    {
        return 1;
    }
}
