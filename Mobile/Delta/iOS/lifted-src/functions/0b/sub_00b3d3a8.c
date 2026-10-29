/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3d3a8..0xb3d448 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b3d3a8(unsigned long long a0, unsigned long a1, unsigned long long *a2, unsigned long a3)
{
    unsigned int v2;  // w0
    unsigned long long v3;  // x0
    unsigned long long v4;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(a1 & 1))
    {
        return 0;
    }
    else if (!a0)
    {
        return 0;
    }
    else if (v2)
    {
        v3 = sub_a6ee78();
        if (!v3)
            return v3;
        v4 = v3;
        if (sub_b3da04(a0, v4, 0) && sub_a6f570(v4))
            a2();
        sub_a6eed4(v4);
        return 0;
    }
    else
    {
        return 0;
    }
}
