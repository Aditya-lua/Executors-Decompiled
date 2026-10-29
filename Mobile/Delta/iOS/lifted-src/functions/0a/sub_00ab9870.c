/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab9870..0xab9940 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_ab9870(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6, long long a7)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9db58c(a5, a1, sub_9e4624());
    if (!(unsigned int)v2)
        return v2;
    v3 = sub_9db58c(a6, a2, sub_9e4624());
    if (!(unsigned int)v3)
        return v3;
    v4 = sub_9e7dc8(a7, a5, a6, a0);
    if (!(unsigned int)v4)
        return v4;
    v5 = sub_9e18c0(a4, a5, a6, a0);
    if (!(unsigned int)v5)
        return v5;
    return sub_9de520(a3, 0, a7, a4, a0) != 0;
}
