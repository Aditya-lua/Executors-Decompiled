/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e9fc4..0x9ea080 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9e9fc4(long long a0, long long a1, long long a2, long long a3, long long a4)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x23
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9e4c34(a1, a0);
    if (!v2)
        return v2;
    sub_9e5d14(a1, 4);
    v3 = 1;
    while (1)
    {
        sub_9e804c(a4, 0, v3);
        v4 = sub_9e8920(a1, a3, a2, a4);
        if (0 < (int)v4)
        {
            sub_9e804c(a4, 2, v3);
            return 1;
        }
        else if (!(v4 >> 31 & 1))
        {
            v5 = sub_9eb9e0(a1, 2);
            v3 = (unsigned int)v3 + 1;
            if (!(unsigned int)v5)
                return v5;
        }
        else
        {
            return 0;
        }
    }
}
