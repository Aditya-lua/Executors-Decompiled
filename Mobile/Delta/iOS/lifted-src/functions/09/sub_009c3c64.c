/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c3c64..0x9c3c98 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9c3c64(unsigned long a0, unsigned long a1, unsigned int a2)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return 1;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    return sub_9d3fec() == a2;
}
