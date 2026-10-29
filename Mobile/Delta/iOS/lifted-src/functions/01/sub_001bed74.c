/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bed74..0x1bee74 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bed74_1 {
    unsigned long long *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_1bed74_1;

typedef struct st_1bed74_0 {
    char field_0;
} st_1bed74_0;


unsigned long long sub_1bed74(unsigned long a0, long long a1)
{
    st_1bed74_1 *v5;  // x8
    unsigned long long *v6;  // x21
    unsigned long long *v7;  // x22
    long long v8;  // x0
    unsigned long long v9;  // x0
    unsigned long long v10;  // x0
    st_1bed74_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_1bed74_0 *v1;  // [bp-0x40]
    char v2;  // [bp-0x31]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v5->field_0 = sub_159c04();
    v5->field_8 = a0;
    *(char *)&v5->field_10 = 0;
    sub_16f34((char *)&v5->field_10 + 1);
    v6 = v5->field_0;
    *v6 = 0;
    v6[1] = 0;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(v6 + 2, a1);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(v6 + 5, a1 + 24);
    *(char *)&v5->field_10 = 1;
    v7 = v5->field_0;
    v8 = sub_a0c8(v7 + 2);
    v9 = sub_a0c8(v7 + 2);
    v10 = sub_1a1bc(&v2, v8, v9 + sub_6b08(v7 + 2) - v8);
    v5->field_0[1] = v10;
    return v10;
}
