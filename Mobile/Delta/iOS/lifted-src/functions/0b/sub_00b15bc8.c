/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb15bc8..0xb15c4c (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_b15bc8(unsigned long a0, long long a1)
{
    unsigned int v3;  // w0
    unsigned int v4;  // w0
    unsigned long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a0 + 40;
    if (sub_a6fbc4(a1, "properties"))
    {
        v3 = sub_a71220();
        if (!v3)
            return v3;
    }
    v0 = a0 + 8;
    if (sub_a6fbc4(a1, "data-structure"))
    {
        v4 = sub_a71220();
        if (!v4)
            return v4;
    }
    return 1;
}
