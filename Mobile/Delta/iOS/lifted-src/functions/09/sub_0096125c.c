/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96125c..0x9612bc (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_96125c(unsigned int *a0)
{
    unsigned long v2;  // x9
    unsigned long long v3;  // x8
    unsigned int *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        v2 = *a0;
        v3 = a0;
        if (!(unsigned int)v2 || v2 >> 7 & 1 && !(v3 = sub_980dc8(), !v3))
        {
            v4 = a0;
            if (*(long long *)(v3 + 1376))
            {
                return *(long long *)(v3 + 1376);
            }
            else if (*(long long *)&v4[2] && *(long long *)(*(long long *)&v4[2] + 16))
            {
                return *(long long *)(*(long long *)&v4[2] + 16);
            }
        }
    }
    return 0;
}
