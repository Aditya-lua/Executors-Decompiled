/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a9374..0x2a9488 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_2a9374(long long a0, long long a1, long long ptr, long long a3)
{
    unsigned long v2;  // x8
    unsigned long long len;  // x0
    unsigned long long v4;  // x0
    unsigned long long len1;  // x0
    long long v8;  // x0
    long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    memset(v2, 0, 24);
    len = _strlen();
    v4 = sub_6b08(a1);
    len1 = _strlen(ptr);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::reserve(v2, v4 + len + len1 + sub_6b08(a3));
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v2, a0, _strlen(a0));
    v8 = sub_a0c8(a1);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v2, v8, sub_6b08(a1));
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v2, ptr, _strlen(ptr));
    v11 = sub_a0c8(a3);
    return std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v2, v11, sub_6b08(a3));
}
