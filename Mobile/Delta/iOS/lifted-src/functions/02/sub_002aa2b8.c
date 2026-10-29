/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2aa2b8..0x2aa400 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2aa2b8_0 {
    char field_0;
} st_2aa2b8_0;


long long sub_2aa2b8(long long a0, long long a1, char *a2, long long a3, long long a4)
{
    unsigned long v4;  // x8
    unsigned long long len;  // x0
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    long long v10;  // x0
    long long v12;  // x0
    st_2aa2b8_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_2aa2b8_0 *v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    memset(v4, 0, 24);
    len = _strlen();
    v6 = sub_6b08(a1);
    v1 = &v0;
    v0 = &v1;
    v7 = sub_6b08(a3);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::reserve(v4, len + v6 + v7 + _strlen(a4) + 1);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v4, a0, _strlen(a0));
    v10 = sub_a0c8(a1);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v4, v10, sub_6b08(a1));
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(v4, *a2);
    v12 = sub_a0c8(a3);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v4, v12, sub_6b08(a3));
    return std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v4, a4, _strlen(a4));
}
