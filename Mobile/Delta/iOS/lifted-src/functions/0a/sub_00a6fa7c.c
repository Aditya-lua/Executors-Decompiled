/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6fa7c..0xa6fad0 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a6fa7c(int a0, long long a1, long long a2, unsigned long a3)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        if (!sub_a6fbc4(a1, a2))
            return 1;
        return (int)sub_a71030() > 0;
    }
}
