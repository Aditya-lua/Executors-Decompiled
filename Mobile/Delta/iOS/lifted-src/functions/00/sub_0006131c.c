/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6131c..0x61370 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long * sub_6131c(long long *a0)
{
    unsigned long v4;  // x8
    unsigned long long v5;  // x30
    unsigned long long v6;  // x9
    unsigned long long v7;  // x8
    unsigned long long v0;  // [bp-0x18]
    char *v1;  // [bp-0x10]
    unsigned long long v2;  // [bp-0x8]
    char v3;  // [bp+0x0]

    v4 = *a0;
    if ((long long)v4 < 1)
        return a0;
    v1 = &v3;
    v2 = v5;
    v6 = 1000000 * v4;
    v7 = 0x7fffffffffffffff;
    if (v4 >= 9223372036000)
        v6 = v7;
    v0 = v6;
    return std::__1::this_thread::sleep_for();
}
