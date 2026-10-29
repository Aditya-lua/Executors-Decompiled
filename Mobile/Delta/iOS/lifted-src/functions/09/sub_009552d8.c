/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9552d8..0x955364 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9552d8(long long *a0, long long a1, long long a2)
{
    unsigned long long *v2;  // x22
    long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0 + 6;
    sub_a6c2e4(a0[6], "ssl/s3_lib.c", 0x1364);
    *v2 = 0;
    v2[1] = 0;
    if (!a1)
    {
        return 1;
    }
    else if (!a2)
    {
        return 1;
    }
    else if ((unsigned long long)a2 > 0xff)
    {
        return 0;
    }
    else
    {
        v3 = sub_a6dac4(a1, a2, "ssl/s3_lib.c", 0x136b);
        *v2 = v3;
        if (!v3)
            return v3;
        a0[7] = a2;
        return 1;
    }
}
