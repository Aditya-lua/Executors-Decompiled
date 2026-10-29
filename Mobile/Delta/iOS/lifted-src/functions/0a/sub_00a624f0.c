/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa624f0..0xa625ec (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a624f0(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6, long long *a7)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    long long v4;  // w27
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9e4d58(a3, 2);
    if (!(unsigned int)v2)
        return v2;
    v3 = sub_9defb0(a2, a3, a5, a4, a0, a1);
    if (!(unsigned int)v3)
        return v3;
    v4 = 2;
    while (0 >= (int)sub_9e5528(a2, sub_9e4624()))
    {
        v5 = sub_9eb9e0(a3, 1);
        if (!(unsigned int)v5)
        {
            return v5;
        }
        else if (sub_9e5528(a3, a6) >> 31 & 1)
        {
            v4 += 1;
            v6 = sub_9defb0(a2, a3, a5, a4, a0, a1);
            if (!(unsigned int)v6)
                return v6;
        }
        else
        {
            return 0;
        }
    }
    *(int *)a7 = v4;
    return 1;
}
