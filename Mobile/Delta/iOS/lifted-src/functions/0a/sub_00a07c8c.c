/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa07c8c..0xa07d54 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a07c8c(long long a0, long long a1, long long a2, long long a3, long long a4)
{
    long long v2;  // x0
    long long v3;  // x19
    long long v4;  // x20
    long long v5;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a3f728();
    if (!v2)
        return 0;
    v3 = v2;
    v4 = sub_a40ca8(a0, "SHAKE256", a4);
    if (v4 && sub_a3fe04(v3, v4, 0) && sub_a3fe10(v3, a3, 57))
    {
        if (!sub_a400f8(v3, a1, a2))
            v5 = 0;
        else
            v5 = 0xffffffff;
    }
    else
    {
        v5 = 0;
    }
    sub_a3f73c(v3);
    sub_a3f52c(v4);
    return v5;
}
