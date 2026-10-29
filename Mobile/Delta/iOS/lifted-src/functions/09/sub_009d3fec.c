/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d3fec..0x9d402c (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9d3fec(unsigned long a0, unsigned long a1, int a2)
{
    unsigned long long v4;  // x30
    unsigned int v5;  // w0
    unsigned int v0;  // [bp-0x18]
    char *v1;  // [bp-0x10]
    unsigned long long v2;  // [bp-0x8]
    char v3;  // [bp+0x0]

    if (a2 < 1)
        return 0;
    v1 = &v3;
    v2 = v4;
    v5 = sub_9d402c();
    if (0 >= (int)v5)
        return v5;
    return v0;
}
