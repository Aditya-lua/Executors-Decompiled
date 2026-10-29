/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x685a4..0x6865c (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_685a4_1 {
    char padding_0[48];
    char field_30;
    char padding_31[23];
    char field_48;
    char padding_49[23];
    unsigned short field_60;
    char padding_62[6];
    char field_68;
    char padding_69[23];
    char field_80;
} st_685a4_1;

typedef struct st_685a4_0 {
    char padding_0[24];
    char field_18;
    char padding_19[23];
    char field_30;
    char padding_31[23];
    char field_48;
    char padding_49[23];
    unsigned short field_60;
    char padding_62[6];
    char field_68;
    char padding_69[23];
    char field_80;
} st_685a4_0;


st_685a4_1 * sub_685a4(st_685a4_1 *a0, st_685a4_0 *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string() + 24, &a1->field_18);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&a0->field_30, &a1->field_30);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&a0->field_48, &a1->field_48);
    a0->field_60 = a1->field_60;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&a0->field_68, &a1->field_68);
    a0->field_80 = a1->field_80;
    return a0;
}
