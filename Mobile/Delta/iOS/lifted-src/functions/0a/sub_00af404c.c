/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf404c..0xaf4068 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_af404c(unsigned long long a0)
{
    unsigned long long v3;  // x30
    unsigned int v4;  // w0
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a0)
    {
        v0 = &v2;
        v1 = v3;
        v4 = sub_ad69e4();
        a0 = v4 & ~((int)(v4) >> 31);
    }
    return a0;
}
