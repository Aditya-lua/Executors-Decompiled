/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95d9b8..0x95da14 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_95d9b8(unsigned long a0, long long a1)
{
    unsigned long long num;  // x0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    num = _atoi(a1);
    if (num >> 31 & 1)
        return 0;
    v3 = *(long long *)(a0 + 24);
    if (v3)
        v3 = sub_962d6c(v3, num & 0xffffffff);
    if (!*(long long *)(a0 + 32))
        return v3;
}
