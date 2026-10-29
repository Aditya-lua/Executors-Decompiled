/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa12824..0xa12894 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a12824(long long *a0, long long a1, long long a2, long long a3)
{
    long long v2;  // x0
    long long v3;  // x0
    long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1)
    {
        v2 = sub_9e4c34(a1, a0[8]);
        if (!v2)
            return v2;
    }
    if (a2)
    {
        v3 = sub_9e4c34(a2, a0[12]);
        if (!v3)
            return v3;
    }
    if (a3)
    {
        v4 = sub_9e4c34(a3, a0[13]);
        if (!v4)
            return v4;
    }
    return 1;
}
