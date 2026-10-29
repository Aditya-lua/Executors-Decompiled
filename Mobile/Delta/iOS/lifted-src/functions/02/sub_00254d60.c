/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x254d60..0x254e2c (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_254d60_1 {
    char padding_0[4];
    long long field_4;
    char padding_c[20];
    long long field_20;
} st_254d60_1;

typedef struct st_254d60_0 {
    char field_0;
} st_254d60_0;

extern long long g_c7c2eb;

long long sub_254d60(st_254d60_1 *a0, long long a1)
{
    long long v4;  // x8
    unsigned long long v5;  // 4111
    long long len1;  // x0
    st_254d60_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_254d60_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(v4, &g_c7c2eb, 0);
    v5 = arm64g_calculate_condition(3, (unsigned long long)(a0->padding_0)[1], 0, 0);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append();
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v4, a1, _strlen(a1));
    len1 = _strlen(*(long long *)&a0->padding_c[16]);
    return std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v4, *(long long *)&a0->padding_c[16], len1);
}
