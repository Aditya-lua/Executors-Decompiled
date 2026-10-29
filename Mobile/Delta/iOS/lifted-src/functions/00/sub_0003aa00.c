/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3aa00..0x3aaac (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3aa00_0 {
    char field_0;
} st_3aa00_0;


long long sub_3aa00(long long a0, char *a1, long long a2)
{
    long long v4;  // x19
    long long ptr;  // x0
    long long v6;  // x19
    unsigned long v7;  // x22
    long long v8;  // x0
    st_3aa00_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_3aa00_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a2;
    v1 = &v0;
    v0 = &v1;
    ptr = _memchr(a1, 37);
    if (!ptr)
    {
        return std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a0, a1, v4);
    }
    else if (!v4)
    {
        return ptr;
    }
    else
    {
        do
        {
            v6 = v4;
            v7 = *a1;
            a1 += 1;
            v8 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(a0, v7);
            if ((unsigned int)v7 == 37)
                v8 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(a0, 37);
        } while ((v4 = v6 - 1, v6 != 1));
        return v8;
    }
}
