/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa857c..0xaa8634 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_aa857c(long long a0, long long a1)
{
    long long v2;  // x0
    long long v3;  // x0
    long long v4;  // x0
    long long v5;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a7bbe0(a1 + 48);
    if (v2)
        return v2;
    v3 = sub_aa8a3c(a0, a1);
    if (!v3)
        return v3;
    v4 = sub_a67ad8(a0);
    if (!v4)
        return v4;
    if (!sub_a7bbe0(a1 + 40) && !sub_a6bce8())
        return 0;
    v5 = sub_aa91f8(v4, v3, 0x10000, 420);
    if (sub_a7bbe8(a1 + 48, v5))
        return v5;
    sub_a51ef0(v5);
    return 0;
}
