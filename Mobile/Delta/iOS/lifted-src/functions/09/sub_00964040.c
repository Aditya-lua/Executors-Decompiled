/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x964040..0x964098 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_964040(unsigned int *a0)
{
    unsigned long v2;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return 0;
    v2 = *a0;
    if ((unsigned int)v2)
    {
        if (v2 >> 7 & 1)
        {
            a0 = sub_980dc8();
            if (!a0)
                return 0;
        }
        else
        {
            return 0;
        }
    }
    goto *((void *)(*(long long *)&a0[1374]));
}
