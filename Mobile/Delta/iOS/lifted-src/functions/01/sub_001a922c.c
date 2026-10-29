/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a922c..0x1a9328 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a922c_0 {
    char padding_0[24];
    unsigned int field_18;
    char padding_1c[4];
    char field_20;
    char padding_21[23];
    char field_38;
    char padding_39[39];
    char field_60;
    char padding_61[23];
    char field_78;
    char padding_79[23];
    unsigned long long field_90;
    char field_98;
    char padding_99[31];
    char field_b8;
    char padding_b9[31];
    unsigned short field_d8;
} st_1a922c_0;

extern char g_10002b0;

st_1a922c_0 * sub_1a922c(st_1a922c_0 *a0, st_1a922c_0 *a1)
{
    char v0;  // [bp-0x48]
    unsigned long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=();
    a0->field_18 = a1->field_18;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_20, &a1->field_20);
    sub_1a9e04(&a0->field_38, &a1->field_38);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_60, &a1->field_60);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_78, &a1->field_78);
    a0->field_90 = a1->field_90;
    sub_1e524(&v0, &a1->field_98);
    sub_1b115c(&v0, &a0->field_98);
    sub_181a8(&v0);
    sub_1e524(&v0, &a1->field_b8);
    sub_1af5c4(&v0, &a0->field_b8);
    sub_181a8(&v0);
    a0->field_d8 = a1->field_d8;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0[1].padding_0[6], &a1[1].padding_0[6]);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0[1].padding_1c[2], &a1[1].padding_1c[2]);
    if (*(long long *)&g_10002b0 == v1)
        return a0;
    ___stack_chk_fail();
}
