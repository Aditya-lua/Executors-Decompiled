/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c2af0..0x9c2b30 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9c2af0(long long a0, long long *a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9c5788(*a1, 0xff, a0);
    if (v2 >> 31 & 1)
        return v2;
    *a1 = *a1 + (v2 & 0xffffffff);
    return 1;
}
