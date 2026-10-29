/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9946c..0xa99520 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_f12f08;

long long sub_a9946c(unsigned int *a0, unsigned int *a1)
{
    unsigned long v2;  // x8
    unsigned long v3;  // x9
    unsigned int v4;  // w0
    unsigned long v5;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a0;
    v3 = *a1;
    if ((unsigned int)v2 != (unsigned int)v3)
    {
        return v2 - v3;
    }
    else if (g_f12f08)
    {
        v4 = sub_ad69e4(g_f12f08);
        v5 = *a0;
        if ((int)v4 > (int)v5)
            goto *((void *)(*(long long *)(sub_ad69f8(g_f12f08, v5) + 8)));
    }
}
