/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a81a4..0x2a8260 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_2a81a4(long long a0, long long a1, char *a2)
{
    unsigned long v2;  // x8
    unsigned long long len;  // x0
    long long v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    memset(v2, 0, 24);
    len = _strlen();
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::reserve(v2, len + sub_6b08(a1) + 1);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v2, a0, _strlen(a0));
    v6 = sub_a0c8(a1);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v2, v6, sub_6b08(a1));
    return std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(v2, *a2);
}
