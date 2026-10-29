/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9861dc..0x986278 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9861dc(long long *a0, unsigned long a1, unsigned long a2, long long *a3, unsigned long a4)
{
    long long v3;  // x21
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    char v0;  // [bp-0x60]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!a0[7])
    {
        v3 = 0;
    }
    else
    {
        sub_989228(a0[7], &v0);
        v3 = v0;
    }
    v4 = sub_c63164(a0);
    if (!(unsigned int)v4)
        return v4;
    if (!a0[6])
        return 1;
    v5 = sub_97bc6c(a0[6], *a3, v3);
    if (!(unsigned int)v5)
        return v5;
    return 1;
}
