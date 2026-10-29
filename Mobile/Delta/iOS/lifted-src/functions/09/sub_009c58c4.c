/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c58c4..0x9c5954 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9c58c4(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6, long long a7)
{
    long long v2;  // x0
    long long v3;  // x19
    unsigned long long v4;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a3f5c0(a5, a4, a6, a7);
    if (!v2)
        return 0xffffffff;
    v3 = v2;
    v4 = sub_9c5954(a0, a1, a2, a3, v3);
    sub_a5d6b0(sub_962b90(v3));
    sub_a3f73c(v3);
    return v4;
}
