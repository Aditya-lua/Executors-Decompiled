/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d3d84..0x9d3dc0 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9d3d84(unsigned long a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long v4;  // x30
    unsigned long long v5;  // w0
    unsigned int v0;  // [bp-0x18]
    char *v1;  // [bp-0x10]
    unsigned long long v2;  // [bp-0x8]
    char v3;  // [bp+0x0]

    if (a2 >> 31 & 1)
        return 0;
    v1 = &v3;
    v2 = v4;
    v5 = (unsigned int)sub_9d3dc0();
    if (0 >= v5)
        return v5;
    return v0;
}
