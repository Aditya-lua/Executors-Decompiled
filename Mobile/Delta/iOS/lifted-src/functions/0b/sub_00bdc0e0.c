/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbdc0e0..0xbdc148 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_bdc0e0(long long a0, long long a1)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_bdb7a8(a1, 0, a0) & 0xff;
    if ((unsigned int)v2 != 2)
        return v2;
    v3 = sub_bd3c48(a0, a1) & 0xff;
    if ((unsigned int)v3 != 2)
        return v3;
    return sub_bdb7a8(a1, 1, a0) & 0xff;
}
