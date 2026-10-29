/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c4218..0x1c43f4 (476 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c4218_0 {
    char padding_0[328];
    char field_148;
    char padding_149[23];
    char field_160;
    char padding_161[23];
    unsigned long long field_178;
    char padding_180[8];
    unsigned long long field_188;
    uint128_t field_190;
    uint128_t field_1a0;
    char field_1b0;
    char padding_1b1[23];
    char field_1c8;
    char padding_1c9[23];
    char field_1e0;
    char padding_1e1[23];
    char field_1f8;
    char padding_1f9[23];
    char field_210;
    char padding_211[23];
    char field_228;
    unsigned short field_229;
    char padding_22b[1];
    unsigned int field_22c;
    unsigned short field_230;
    char padding_232[6];
    char field_238;
    char padding_239[31];
    unsigned short field_258;
    char padding_25a[6];
    char field_260;
    char padding_261[23];
    char field_278;
    char padding_279[23];
    unsigned int field_290;
    char padding_294[4];
    char field_298;
    char padding_299[23];
    char field_2b0;
    char padding_2b1[23];
    char field_2c8;
    char padding_2c9[23];
    char field_2e0;
    char padding_2e1[23];
    char field_2f8;
    char padding_2f9[23];
    char field_310;
    char padding_311[23];
    char field_328;
    char padding_329[23];
    unsigned long long field_340;
    unsigned short field_348;
} st_1c4218_0;

extern char g_10002b0;

unsigned long long sub_1c4218(st_1c4218_0 *a0, st_1c4218_0 *a1)
{
    unsigned long long v4;  // x0
    char v0;  // [bp-0x48]
    unsigned long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_148, &a1->field_148);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_160, &a1->field_160);
    a0->field_178 = a1->field_178;
    a0->field_188 = a1->field_188;
    a0->field_190 = a1->field_190;
    a0->field_1a0 = a1->field_1a0;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_1b0, &a1->field_1b0);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_1c8, &a1->field_1c8);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_1e0, &a1->field_1e0);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_1f8, &a1->field_1f8);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_210, &a1->field_210);
    a0->field_228 = a1->field_228;
    *(short *)&(&a0->field_228)[1] = *(short *)&(&a1->field_228)[1];
    *(int *)a0->padding_22b = *(int *)a1->padding_22b;
    *(short *)&a0->field_22c = a1->field_22c;
    sub_1e524(&v0, &a1->padding_232[2]);
    sub_1c69d8(&v0, &a0->padding_232[2]);
    sub_181a8(&v0);
    *(short *)&a0->padding_239[27] = *(short *)&a1->padding_239[27];
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->padding_25a[2], &a1->padding_25a[2]);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->padding_261[19], &a1->padding_261[19]);
    *(int *)&a0->padding_279[19] = *(int *)&a1->padding_279[19];
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(a0->padding_294, a1->padding_294);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->padding_299[19], &a1->padding_299[19]);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->padding_2b1[19], &a1->padding_2b1[19]);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->padding_2c9[19], &a1->padding_2c9[19]);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->padding_2e1[19], &a1->padding_2e1[19]);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->padding_2f9[19], &a1->padding_2f9[19]);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->padding_311[19], &a1->padding_311[19]);
    *(long long *)&a0->padding_329[19] = *(long long *)&a1->padding_329[19];
    *(short *)&a0->field_340 = a1->field_340;
    sub_1e524(&v0, &a1->field_348);
    sub_1c4664(&v0, &a0->field_348);
    sub_181a8(&v0);
    sub_1e524(&v0, &a1[1].padding_0[30]);
    sub_1c4474(&v0, &a0[1].padding_0[30]);
    v4 = sub_181a8(&v0);
    if (*(long long *)&g_10002b0 == v1)
        return v4;
    ___stack_chk_fail();
}
