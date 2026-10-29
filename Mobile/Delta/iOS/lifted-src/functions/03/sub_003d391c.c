/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d391c..0x3d397c (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_3d391c(long long a0, unsigned long a1, long long a2, long long a3)
{
    unsigned long long v2;  // x0
    long long v3;  // x21
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_3c9590();
    if (!(unsigned int)v2)
        return v2;
    v3 = a0 * a1;
    v4 = sub_3c9590(v3, a2);
    if (!(unsigned int)v4)
        return v4;
    return sub_3c9590(a2 * v3, a3) != 0;
}
