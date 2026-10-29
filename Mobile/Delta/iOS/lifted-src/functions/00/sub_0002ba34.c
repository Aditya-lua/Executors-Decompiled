/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ba34..0x2baa8 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_2ba34(long long a0)
{
    unsigned long v2;  // x8
    long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    memset(v2, 0, 24);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(v2, 0);
    v3 = sub_a0c8(a0);
    return std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v2, v3, sub_6b08(a0));
}
