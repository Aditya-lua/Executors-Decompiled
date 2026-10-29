/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98e540..0x98e5a0 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_98e540(long long a0, long long *a1)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6ed9c();
    if (!(unsigned int)v2)
        return v2;
    v3 = sub_a6ed9c(a0, *a1);
    if (!(unsigned int)v3)
        return v3;
    v4 = sub_a6ed9c(a0, a1[1]);
    if (!(unsigned int)v4)
        return v4;
    return sub_a6ed9c(a0, a1[2]) != 0;
}
