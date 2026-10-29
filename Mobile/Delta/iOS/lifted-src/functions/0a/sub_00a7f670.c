/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7f670..0xa7f6b0 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a7f670(unsigned long a0, unsigned long long a1, long long a2, unsigned int a3)
{
    unsigned long long v5;  // x30
    unsigned long long v0;  // [bp-0x20]
    long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a2 < 0)
        return 0;
    v2 = &v4;
    v3 = v5;
    v0 = a1;
    v1 = a2;
    if (a3 != 0x80000)
        return (unsigned int)sub_a7f58c();
    return (unsigned int)sub_a7f4b0();
}
