/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6ed9c..0xa6ee10 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a6ed9c(unsigned long a0, unsigned long long a1)
{
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x14]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = 0;
    if (a1 >= 64 && a1 >= 0x4000 && a1 > 0x3fffffff && a1 > 0x3fffffffffffffff)
        return 0;
    sub_c68f58();
    return v1;
}
