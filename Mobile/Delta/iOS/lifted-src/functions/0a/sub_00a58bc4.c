/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa58bc4..0xa58c5c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a58bc4(unsigned int *a0)
{
    long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    unsigned long v5;  // x8
    unsigned long long v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a9976c(*a0);
    v3 = sub_a9908c(v2, 1, a0);
    if (!(unsigned int)v3)
        return v3;
    v4 = sub_a9908c(sub_a99788(*a0), 1, a0);
    if (!(unsigned int)v4)
        return v4;
    v5 = a0[1];
    if (!(unsigned int)v5)
    {
        return v4;
    }
    else if (*a0 != (unsigned int)v5)
    {
        v6 = sub_a9908c(sub_a9976c(v5), "x", v2);
        if (!(unsigned int)v6)
            return v6;
        sub_a99788(a0[1]);
        return sub_a9908c();
    }
    else
    {
        return v4;
    }
}
