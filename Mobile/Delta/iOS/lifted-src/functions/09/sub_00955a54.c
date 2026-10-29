/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x955a54..0x955a98 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_955a54(unsigned int *a0)
{
    unsigned long v2;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return 0;
    v2 = *a0;
    if ((unsigned int)v2)
    {
        if (!(v2 >> 7 & 1))
        {
            return 0;
        }
        else if (!sub_980dc8())
        {
            return 0;
        }
    }
}
