/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96f5e4..0x96f630 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_96f5e4(long long a0)
{
    unsigned long long v3;  // x0
    char v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_9545a8();
    if (!(unsigned int)v3)
        return v3;
    return sub_962d78(a0, a0 + 1788, 64, &v0) != 0;
}
