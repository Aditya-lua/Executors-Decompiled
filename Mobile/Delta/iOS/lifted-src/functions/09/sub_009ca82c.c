/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ca82c..0x9ca8cc (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9ca82c(long long *a0, unsigned long a1, unsigned long long a2, unsigned long a3, unsigned long a4, unsigned long long a5, long long a6)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(a2 >> 31 & 1))
    {
        if ((unsigned int)a2 > 1)
            return 0;
        v2 = sub_9c19dc(*a0, a2 & 0xffffffff);
        if (!(unsigned int)v2)
            return v2;
    }
    v3 = sub_9cf6d4(a0[1]);
    if (!(unsigned int)v3)
        return v3;
    if (!a5)
        return 1;
    sub_9c79a0(a0[2], a5, a6);
    return 1;
}
