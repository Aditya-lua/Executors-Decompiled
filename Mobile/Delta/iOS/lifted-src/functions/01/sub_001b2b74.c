/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b2b74..0x1b2d90 (540 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b2b74_0 {
    char padding_0[24];
    char field_18;
    char padding_19[23];
    char field_30;
    char padding_31[23];
    char field_48;
    char padding_49[39];
    char field_70;
    char padding_71[23];
    char field_88;
    char padding_89[23];
    unsigned int field_a0;
    char padding_a4[4];
    char field_a8;
    char padding_a9[23];
    unsigned int field_c0;
    char padding_c4[4];
    char field_c8;
    char padding_c9[23];
    char field_e0;
    char padding_e1[23];
    char field_f8;
    char padding_f9[23];
    char field_110;
    char padding_111[23];
    char field_128;
    char padding_129[23];
    unsigned long long field_140;
    unsigned long long field_148;
    char field_150;
    char padding_151[7];
    unsigned long long field_158;
    unsigned long long field_160;
    char field_168;
    char padding_169[7];
    unsigned long long field_170;
    unsigned long long field_178;
    char field_180;
    char padding_181[7];
    uint128_t field_188;
    char field_198;
    char padding_199[39];
    char field_1c0;
    char padding_1c1[31];
    char field_1e0;
    char padding_1e1[31];
    char field_200;
    char padding_201[31];
    char field_220;
    char padding_221[31];
    uint128_t field_240;
    unsigned long long field_250;
    char field_258;
    char padding_259[31];
    uint128_t field_278;
    unsigned long long field_288;
} st_1b2b74_0;

extern char g_10002b0;

st_1b2b74_0 * sub_1b2b74(st_1b2b74_0 *a0, st_1b2b74_0 *a1)
{
    uint128_t v4;  // q0
    uint128_t v5;  // q0
    char v0;  // [bp-0x48]
    unsigned long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=();
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_18, &a1->field_18);
    sub_1c35ec(&a0->field_30, &a1->field_30);
    sub_1a9e04(&a0->field_48, &a1->field_48);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_70, &a1->field_70);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_88, &a1->field_88);
    a0->field_a0 = a1->field_a0;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_a8, &a1->field_a8);
    a0->field_c0 = a1->field_c0;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_c8, &a1->field_c8);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_e0, &a1->field_e0);
    sub_1c5300(&a0->field_f8, &a1->field_f8);
    sub_1c18c8(&a0->field_110, &a1->field_110);
    sub_1c7bd0(&a0->field_128, &a1->field_128);
    a0->field_140 = a1->field_140;
    a0->field_148 = a1->field_148;
    a0->field_150 = a1->field_150;
    a0->field_158 = a1->field_158;
    a0->field_160 = a1->field_160;
    a0->field_168 = a1->field_168;
    a0->field_170 = a1->field_170;
    a0->field_178 = a1->field_178;
    a0->field_180 = a1->field_180;
    *(int128_t *)(a0->padding_181)[1] = *(int128_t *)(a1->padding_181)[1];
    sub_1b76ac((char *)&a0->field_188 + 8, (char *)&a1->field_188 + 8);
    sub_1e524(&v0, &a1->padding_199[31]);
    sub_1b53b8(&v0, &a0->padding_199[31]);
    sub_181a8(&v0);
    sub_1e524(&v0, &a1->padding_1c1[23]);
    sub_1bf410(&v0, &a0->padding_1c1[23]);
    sub_181a8(&v0);
    sub_1e524(&v0, &a1->padding_1e1[23]);
    sub_1b434c(&v0, &a0->padding_1e1[23]);
    sub_181a8(&v0);
    sub_1e524(&v0, &a1->padding_201[23]);
    sub_1b66b4(&v0, &a0->padding_201[23]);
    sub_181a8(&v0);
    v4 = *(int128_t *)&a1->padding_221[23];
    *(long long *)&a0->field_240 = a1->field_240;
    *(uint128_t *)&a0->padding_221[23] = v4;
    sub_1e524(&v0, (char *)&a1->field_240 + 8);
    sub_1b115c(&v0, (char *)&a0->field_240 + 8);
    sub_181a8(&v0);
    v5 = *(int128_t *)&a1->padding_259[15];
    *(long long *)&(a0->padding_259)[1] = *(long long *)&(a1->padding_259)[1];
    *(uint128_t *)&a0->padding_259[15] = v5;
    if (*(long long *)&g_10002b0 == v1)
        return a0;
    ___stack_chk_fail();
}
