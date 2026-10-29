/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa39cfc..0xa39dcc (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a39cfc(long long a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v2;  // x23
    unsigned long long v3;  // x22
    unsigned long long v4;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
    {
        return 0;
    }
    else if ((int)a2 >= 1)
    {
        v2 = sub_975ffc();
        v3 = sub_9d500c(a0);
        v4 = 0;
        if (v2 && v3)
            v4 = sub_9d3fec(v3, a1, a2);
        if (sub_9880e0(a0) && (int)v4 >= 1 && !sub_a3fe10(v2, a1, v4 & 0xffffffff))
        {
            sub_9d3d58(a0, 15);
            return 0;
        }
        if (!v3)
            return v4;
        sub_9d3d58(a0, 15);
        sub_9d5054(a0);
        return v4;
    }
    else
    {
        return 0;
    }
}
