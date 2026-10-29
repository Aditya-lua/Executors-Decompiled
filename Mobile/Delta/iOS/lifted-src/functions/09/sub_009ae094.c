/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ae094..0x9ae0fc (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9ae094(unsigned long long *a0, long long a1, unsigned int a2)
{
    unsigned long long v3;  // x0
    char v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (a2 != 0x101)
    {
        v3 = sub_a6e970(a1);
        if (!(unsigned int)v3)
            return v3;
    }
    if (!sub_c68ecc(a1, &v0))
    {
        return 0;
    }
    else if (v0 <= 0x7fffffff)
    {
        a0[33] = v0;
        a0[0x22] = 0;
        return 1;
    }
    else
    {
        return 0;
    }
}
