/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x70dc8..0x70f04 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_70dc8_0 {
    char field_0;
    char padding_1[3];
    unsigned int field_4;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    uint128_t field_38;
    uint128_t field_48;
    char field_50;
    char padding_51[7];
    uint128_t field_58;
} st_70dc8_0;

extern long long g_cbed28;

st_70dc8_0 * sub_70dc8(st_70dc8_0 *a0, char a1, unsigned int a2, long long a3, long long a4, long long a5)
{
    char v0;  // [bp-0x78]
    char v1;  // [bp-0x59]
    char *v2;  // [bp-0x58]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    a0->field_8 = 0;
    a0->field_10 = 0;
    a0->field_18 = 0;
    a0->field_28 = 0;
    a0->field_20 = &a0->field_28;
    a0->field_30 = 0;
    *(uint128_t *)&(&a0->field_30)[1] = 0;
    *(uint128_t *)((char *)&a0->field_38 + 8) = 0;
    *(uint128_t *)((char *)&a0->field_48 + 8) = 0;
    a0->field_0 = a1;
    a0->field_4 = a2;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_8, a3);
    sub_63e3c(&a0->field_20, a4);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&(&a0->field_30)[1], a5);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v0, "Sec-WebSocket-Protocol", 22);
    v2 = &v0;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_48, sub_62be4(a4, &v0, &g_cbed28, &v2, &v1) + 56);
    return a0;
}
