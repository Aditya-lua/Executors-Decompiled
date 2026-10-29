/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95a97c..0x95aa30 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int * sub_95a97c(unsigned int *a0, unsigned long a1)
{
    unsigned long v2;  // x8
    unsigned long long v3;  // x20
    unsigned long long v4;  // w0
    unsigned long v5;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return a0;
    v2 = *a0;
    v3 = a0;
    if ((unsigned int)v2)
    {
        if (v2 >> 7 & 1)
        {
            v3 = sub_980dc8(a0);
            if (!v3)
                return v3;
        }
        else
        {
            return 0;
        }
    }
    v4 = (unsigned int)sub_95a770(v3 + 1392);
    v5 = v3 + 1376;
    if (!*(long long *)(v3 + 1376) && sub_96125c(a0))
        *(unsigned long long *)v5 = sub_ad5f4c();
    if (!v4)
    {
        return 0;
    }
    else if (!*(long long *)v5)
    {
        return 1;
    }
}
