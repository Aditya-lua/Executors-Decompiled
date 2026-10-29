/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bc870..0x1bc900 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bc870_0 {
    char field_0;
} st_1bc870_0;


char * sub_1bc870(long long a0)
{
    long long v4;  // x8
    char *v5;  // x0
    st_1bc870_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1bc870_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (sub_6b08() >= 2 && !*(char *)sub_2fa10(a0, 0))
    {
        v5 = sub_9c78(std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(v4, a0), 0);
        *v5 = 64;
        return v5;
    }
    return std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(v4, a0);
}
