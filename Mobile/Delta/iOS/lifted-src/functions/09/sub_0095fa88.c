/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95fa88..0x95fae0 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int * sub_95fa88(unsigned int *a0)
{
    unsigned long v2;  // x8
    unsigned long long v3;  // x19
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
    if (!*(long long *)&a0[576])
        return 0;
    v3 = *(long long *)(*(long long *)&a0[576] + 704);
    if (v3 && sub_af3b1c(v3))
        return v3;
    return 0;
}
