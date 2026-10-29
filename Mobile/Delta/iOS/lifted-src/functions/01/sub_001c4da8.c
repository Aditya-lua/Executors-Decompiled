/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c4da8..0x1c4e68 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c4da8_1 {
    unsigned long long *field_0;
    unsigned long long field_8;
    char field_10;
} st_1c4da8_1;

typedef struct st_1c4da8_0 {
    char field_0;
} st_1c4da8_0;


unsigned long long sub_1c4da8(unsigned long a0, unsigned long a1, long long a2)
{
    st_1c4da8_1 *v4;  // x8
    unsigned long long *v5;  // x22
    unsigned long long v6;  // x0
    st_1c4da8_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1c4da8_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4->field_0 = sub_159c04();
    v4->field_8 = a0;
    v4->field_10 = 0;
    sub_16f34(v4 + 1);
    v5 = v4->field_0;
    *v5 = 0;
    v5[1] = a1;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(v5 + 2, a2);
    v6 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(v5 + 5, a2 + 24);
    v4->field_10 = 1;
    return v6;
}
