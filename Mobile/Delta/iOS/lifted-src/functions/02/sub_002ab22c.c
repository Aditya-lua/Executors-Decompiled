/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ab22c..0x2ab324 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_2ab22c(long long *a0, long long ptr, long long a2, char *a3)
{
    unsigned long v2;  // x8
    unsigned long long len;  // x0
    unsigned long long len1;  // x0
    long long len2;  // x0
    long long v8;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    memset(v2, 0, 24);
    len = _strlen(*a0);
    len1 = _strlen(ptr);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::reserve(v2, len + len1 + sub_6b08(a2) + 1);
    len2 = _strlen(*a0);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v2, *a0, len2);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v2, ptr, _strlen(ptr));
    v8 = sub_a0c8(a2);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v2, v8, sub_6b08(a2));
    return std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(v2, *a3);
}
