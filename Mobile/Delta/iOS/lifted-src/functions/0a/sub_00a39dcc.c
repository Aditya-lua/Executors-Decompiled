/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa39dcc..0xa39e84 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a39dcc(long long a0, unsigned long long a1, unsigned long a2)
{
    unsigned long long v2;  // x22
    unsigned long long v3;  // x0
    unsigned long long v4;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
        return 0;
    v2 = sub_975ffc();
    v3 = sub_9d500c(a0);
    if (!v2)
    {
        return 0;
    }
    else if (v3)
    {
        v4 = sub_9d3d84();
        if (sub_9880e0(a0) && (int)v4 >= 1 && (int)sub_a3fe10(v2, a1, v4 & 0xffffffff) < 1)
            return 0xffffffff;
        sub_9d3d58(a0, 15);
        sub_9d5054(a0);
        return v4;
    }
    else
    {
        return 0;
    }
}
