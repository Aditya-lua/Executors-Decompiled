/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa62ed0..0xa62f90 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a62ed0(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5, unsigned int *a6)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((int)sub_9e5528(a4, sub_9e4624()) >= 1 && sub_9e5528(a4, a2) >> 31 & 1)
    {
        v2 = sub_9defb0(a5, a4, a3, a2, a0, a1);
        if (!(unsigned int)v2)
        {
            return v2;
        }
        else if (!sub_9e5528(a5, sub_9e4624()))
        {
            return 1;
        }
    }
    *a6 = *a6 | 8;
    return 0;
}
