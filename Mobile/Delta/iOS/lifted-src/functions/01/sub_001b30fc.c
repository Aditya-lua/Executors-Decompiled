/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b30fc..0x1b31a8 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b30fc_1 {
    char padding_0[8];
    struct st_1b30fc_0 *field_8;
    unsigned long long field_10;
    long long field_18;
} st_1b30fc_1;

typedef struct st_1b30fc_0 {
    char field_0;
} st_1b30fc_0;


st_1b30fc_1 * sub_1b30fc(st_1b30fc_1 *a0, unsigned long long a1)
{
    unsigned long v6;  // x8
    char *v7;  // x9
    st_1b30fc_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1b30fc_0 *v1;  // [bp-0x38]
    st_1b30fc_0 **v2;  // [bp-0x30], Other Possible Types: char
    st_1b30fc_0 *v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v6 = a0->field_18;
    if (a0->field_10 - 1 > v6)
    {
        v7 = a0->field_8;
        a0->field_18 = v6 + 1;
        v7[v6] = a1;
        *(char *)&a0->field_8[a0->field_18] = 0;
        return a0;
    }
    v3 = &v2;
    v2 = &v3;
    if (sub_6b08(a0 + 1))
        return std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(&a0->padding_0[1], a1);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(a0 + 1, a0->field_8, a0->field_18);
    return std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(&a0->padding_0[1], a1);
}
