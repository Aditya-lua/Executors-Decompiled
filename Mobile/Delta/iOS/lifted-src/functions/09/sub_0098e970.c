/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98e970..0x98e9b8 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_98e970(long long a0, unsigned int a1, long long a2)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6ed9c();
    if (!(unsigned int)v2)
        return v2;
    return sub_a6ed9c(a0, a2) != 0;
}
