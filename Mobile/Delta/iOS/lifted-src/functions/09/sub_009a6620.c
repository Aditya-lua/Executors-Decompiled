/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a6620..0x9a6654 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_9a6620(unsigned int *a0)
{
    unsigned long v3;  // x8
    unsigned long long v4;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0)
        return 0xffffffff;
    v3 = *a0;
    if ((unsigned int)v3)
    {
        if (v3 >> 7 & 1)
        {
            v0 = &v2;
            v1 = v4;
            if (!sub_980dc8())
                return 0xffffffff;
        }
        else
        {
            return 0xffffffff;
        }
    }
}
