/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x62444..0x624a8 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_62444(long long *a0)
{
    long long v2;  // x20
    long long v3;  // x0
    long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0[1];
    if ((unsigned long long)a0[2] <= (unsigned long long)v2)
    {
        v4 = sub_61a54(a0);
        a0[1] = v4;
        return v4 - 24;
    }
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(v2);
    v3 = v2 + 24;
    a0[1] = v3;
    a0[1] = v3;
    return v3 - 24;
}
