/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bd928..0x1bda10 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_c7c2eb;

long long sub_1bd928(long long a0)
{
    long long v5;  // x0
    char v0;  // [bp-0x68]
    char v1;  // [bp-0x50]
    char v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v1, "Transfer-Encoding", 0x11);
    v5 = sub_1bc900(a0, &v1, &g_c7c2eb, 0);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v2, v5, _strlen(v5, &v1, &g_c7c2eb, 0));
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v0, "chunked", 7);
    return sub_1b01e8(&v2, &v0);
}
