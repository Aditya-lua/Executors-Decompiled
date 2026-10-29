/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a5714..0x9a575c (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int * sub_9a5714(unsigned int *a0)
{
    unsigned long v2;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return a0;
    v2 = *a0;
    if ((unsigned int)v2)
    {
        if (v2 >> 7 & 1)
        {
            a0 = sub_980dc8();
            if (!a0)
                return a0;
        }
        else
        {
            return 0;
        }
    }
    if (!a0[43])
        return !a0[38];
    return 0;
}
