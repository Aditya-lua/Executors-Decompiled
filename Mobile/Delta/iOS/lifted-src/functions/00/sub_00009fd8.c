/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fd8..0xa070 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9fd8_0 {
    char field_0;
} st_9fd8_0;


long long sub_9fd8(long long a0, long long a1)
{
    long long len;  // x21
    st_9fd8_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_9fd8_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    len = _strlen(a1);
    if (len != sub_6b08(a0))
        return 0;
    return !std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::compare(a0, 0, -0x1, a1, len);
}
