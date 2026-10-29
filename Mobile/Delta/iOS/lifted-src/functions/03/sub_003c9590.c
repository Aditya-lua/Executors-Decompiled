/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c9590..0x3c95c0 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_3c9590(int a0, int a1)
{
    if ((a1 | a0) < 0)
    {
        return 0;
    }
    else if (a1)
    {
        return 0x7fffffff / a1 >= a0;
    }
    else
    {
        return 1;
    }
}
