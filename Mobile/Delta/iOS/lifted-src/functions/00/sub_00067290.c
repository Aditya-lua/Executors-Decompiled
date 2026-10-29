/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x67290..0x672f4 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_67290(long long *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    std::__1::mutex::lock(a0 + 31);
    if (a0[11])
    {
        sub_95eea4(a0[11]);
        a0[11] = 0;
    }
    if (a0[12])
    {
        sub_95e3b8(a0[12]);
        a0[12] = 0;
    }
    sub_66504(a0);
    std::__1::mutex::unlock();
    return;
}
