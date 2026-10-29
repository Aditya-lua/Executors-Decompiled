/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5aec8..0xa5af48 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a5aec8(long long a0, long long a1)
{
    long long v2;  // x21
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 28;
    if (!sub_9febfc(a1))
    {
        if (!sub_c4ba8(a1))
            v2 = 28;
        else
            v2 = 920;
    }
    v3 = sub_9ffbf8(a1);
    if (!(unsigned int)v3)
    {
        return v3;
    }
    else if (sub_a5ab14(a0, v2, a1))
    {
        return 1;
    }
    else
    {
        sub_9ffb3c(a1);
        return 0;
    }
}
