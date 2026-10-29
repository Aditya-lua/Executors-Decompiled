/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf407c..0xaf40c8 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_af407c(unsigned long a0, unsigned long long a1)
{
    unsigned int v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return 0;
    v2 = sub_ad69e4();
    if (a1 >> 31 & 1)
    {
        return 0;
    }
    else if ((int)v2 <= (int)a1)
    {
        return 0;
    }
}
