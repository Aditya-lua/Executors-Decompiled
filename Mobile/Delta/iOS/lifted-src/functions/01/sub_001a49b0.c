/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a49b0..0x1a4aa0 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a49b0_1 {
    long long *field_0;
    long long field_8;
    long long field_10;
} st_1a49b0_1;

typedef struct st_1a49b0_0 {
    char field_0;
} st_1a49b0_0;


unsigned long long sub_1a49b0(long long a0, long long a1)
{
    st_1a49b0_1 *v4;  // x8
    long long *v5;  // x22
    long long v6;  // x0
    unsigned long long v7;  // x0
    st_1a49b0_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1a49b0_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4->field_0 = sub_159c04();
    v4->field_8 = a0;
    *(char *)&v4->field_10 = 0;
    sub_16f34((char *)&v4->field_10 + 1);
    v5 = v4->field_0;
    *v5 = 0;
    v5[1] = 0;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(v5 + 2, a1);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(v5 + 5, a1 + 24);
    *(char *)&v4->field_10 = 1;
    v6 = sub_a0c8(v4->field_0 + 2);
    v7 = sub_1a5cdc(a0, v6, sub_6b08(v4->field_0 + 2), 0);
    v4->field_0[1] = v7;
    return v7;
}
