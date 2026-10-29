/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb44b74..0xb44bec (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b44b74(long long a0, long long a1)
{
    unsigned long long v2;  // x0
    long long v3;  // x0
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a6fbc4(a1, "size"))
    {
        v2 = sub_a70efc();
        if (!(unsigned int)v2)
            return v2;
    }
    v3 = sub_a6fbc4(a1, "block-size");
    if (v3)
    {
        v4 = sub_a6fe3c(v3, sub_a50a7c(sub_954340(a0 + 16)));
        if (!(unsigned int)v4)
            return v4;
    }
    return 1;
}
