/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2349a8..0x234a74 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2349a8_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    char field_10;
} st_2349a8_1;

typedef struct st_2349a8_0 {
    char field_0;
} st_2349a8_0;


unsigned long long sub_2349a8(unsigned long a0, long long *a1, long long a2)
{
    st_2349a8_1 *v4;  // x8
    long long len;  // x0
    unsigned long long v6;  // x0
    st_2349a8_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_2349a8_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4->field_0 = sub_10574();
    v4->field_8 = a0;
    v4->field_10 = 0;
    sub_16f34(v4 + 1);
    len = _strlen(*a1);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(v4->field_0 + 32, *a1, len);
    v6 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(v4->field_0 + 56, a2);
    v4->field_10 = 1;
    return v6;
}
