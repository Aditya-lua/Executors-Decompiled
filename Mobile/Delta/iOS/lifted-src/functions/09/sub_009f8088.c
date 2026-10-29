/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f8088..0x9f80f8 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9f8088(long long *a0, long long a1)
{
    long long v2;  // x0
    long long v3;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_afb4c0(a1);
    if (!v2)
        return v2;
    v3 = v2;
    if (!sub_9f7f48(a0, a1, a0 + 1, a0 + 2))
    {
        sub_a5a4c8(v3);
        return 0;
    }
    sub_a5a4c8(*a0);
    *a0 = v3;
    return 1;
}
