/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x731e8..0x732a0 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_731e8_2 {
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
} st_731e8_2;

typedef struct st_731e8_0 {
    unsigned int field_0;
    char field_4;
} st_731e8_0;

typedef struct st_731e8_1 {
    char padding_0[504];
    unsigned int field_1f8;
    char field_1fc;
    char field_1fd;
    char padding_1fe[50];
    char field_230;
    char padding_231[23];
    char field_248;
    char padding_249[23];
    char field_260;
    char padding_261[23];
    char field_278;
    char padding_279[23];
    unsigned short field_290;
    char padding_292[6];
    char field_298;
    char padding_299[23];
    char field_2b0;
    char padding_2b1[87];
    char field_308;
    char padding_309[3];
    unsigned int field_30c;
} st_731e8_1;


unsigned long long sub_731e8(st_731e8_1 *a0, st_731e8_0 *a1, st_731e8_2 *a2, long long a3, unsigned int a4)
{
    unsigned int v2;  // w8
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_0;
    a0->field_1fc = a1->field_4;
    a0->field_1f8 = v2;
    sub_60b20(&a0->field_1fd, sub_715d8(&a0->field_1f8), 5);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_230, a2);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_248, &a2->field_18);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_260, &a2->field_30);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_278, &a2->field_48);
    a0->field_290 = a2->field_60;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_298, &a2->field_68);
    a0->field_2b0 = a2->field_80;
    v4 = sub_60b20(&a0->field_308, a3, 5);
    a0->field_30c = a4;
    return v4;
}
