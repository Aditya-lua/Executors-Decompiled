/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa58d6c..0xa58e30 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a58d6c(long long a0, long long a1)
{
    long long v3;  // x20
    unsigned long long v4;  // x0
    long long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!sub_a6afb8(8, 0))
        return 0;
    v0 = sub_a98e90(a1, 1);
    if (v0)
        return v0;
    v3 = sub_a68f38(a0);
    v4 = sub_a68e7c(v3, a1);
    if (!(unsigned int)v4)
    {
        sub_a36c8c();
        sub_a36cd4(sub_a3f52c(sub_a40ca8(a0, a1, 0), a1, 0));
        v4 = sub_a68e7c(v3, a1);
        if (!(unsigned int)v4)
            return 0;
    }
    if (!sub_a68da4(v3, v4, "(", &v0))
        v0 = 0;
    return v0;
}
