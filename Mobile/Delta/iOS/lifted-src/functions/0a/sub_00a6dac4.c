/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6dac4..0xa6db20 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a6dac4(unsigned long a0, long long a1, long long a2, long long a3)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        return 0;
    }
    else if (0x7ffffffe < (unsigned long long)a1)
    {
        return 0;
    }
    else if (!sub_a6bf4c(a1, a2, a3))
    {
        return 0;
    }
}
