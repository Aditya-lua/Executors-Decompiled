/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6aba4..0x6ac30 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6aba4_1 {
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
} st_6aba4_1;

typedef struct st_6aba4_0 {
    char padding_0[960];
    char field_3c0;
    char padding_3c1[23];
    char field_3d8;
    char padding_3d9[23];
    char field_3f0;
    char padding_3f1[23];
    char field_408;
    char padding_409[23];
    unsigned short field_420;
    char padding_422[6];
    char field_428;
    char padding_429[23];
    char field_440;
} st_6aba4_0;


void sub_6aba4(st_6aba4_0 *a0, st_6aba4_1 *a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    std::__1::mutex::lock(&a0[1].padding_0[7]);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_3c0, a1);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_3d8, &a1->field_18);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_3f0, &a1->field_30);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_408, &a1->field_48);
    a0->field_420 = a1->field_60;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_428, &a1->field_68);
    a0->field_440 = a1->field_80;
    std::__1::mutex::unlock();
    return;
}
