/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x29034..0x290b8 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_29034_0 {
    char field_0;
} st_29034_0;


long long sub_29034(unsigned long long *a0)
{
    st_29034_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_29034_0 *v1;  // [bp-0x48]
    unsigned long v2;  // [bp-0x40]
    unsigned long v3;  // [bp-0x38]
    unsigned long v4;  // [bp-0x30]
    unsigned long v5;  // [bp-0x2b]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v2 = 0;
    v0 = &v1;
    v5 = 0;
    v3 = 0;
    v4 = 0;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(&v2);
    sub_2b48c(a0 + 94, &v2);
    return (unsigned int)(a0[95] - a0[94] >> 5) - 1;
}
