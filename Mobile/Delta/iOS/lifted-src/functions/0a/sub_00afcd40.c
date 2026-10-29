/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafcd40..0xafcdf8 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_afcd40(unsigned long a0, long long a1)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    long long v5;  // x0
    unsigned long long v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a6fbc4(a1, "name"))
    {
        v2 = sub_a71744();
        if (!(unsigned int)v2)
            return v2;
    }
    if (sub_a6fbc4(a1, "version"))
    {
        v3 = sub_a71744();
        if (!(unsigned int)v3)
            return v3;
    }
    if (sub_a6fbc4(a1, "buildinfo"))
    {
        v4 = sub_a71744();
        if (!(unsigned int)v4)
            return v4;
    }
    v5 = sub_a6fbc4(a1, "status");
    if (v5)
    {
        v6 = sub_a6fe3c(v5, sub_a2f9e0());
        if (!(unsigned int)v6)
            return v6;
    }
    return 1;
}
