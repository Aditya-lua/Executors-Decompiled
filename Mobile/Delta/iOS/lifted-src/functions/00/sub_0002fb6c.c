/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2fb6c..0x2fc4c (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2fb6c_0 {
    char padding_0[24];
    unsigned long long field_18;
    unsigned int field_20;
} st_2fb6c_0;

typedef struct st_2fb6c_1 {
    char padding_0[24];
    unsigned long long field_18;
    unsigned int field_20;
    char padding_24[4];
    char field_28;
    char padding_29[23];
    char field_40;
    char padding_41[23];
    long long field_58;
    long long field_60;
} st_2fb6c_1;

typedef struct st_2fb6c_2 {
    char padding_0[64];
    char field_40;
    char padding_41[23];
    unsigned long long field_58;
    unsigned long long field_60;
    unsigned long long field_68;
} st_2fb6c_2;


st_2fb6c_2 * sub_2fb6c(st_2fb6c_2 *a0, st_2fb6c_1 *a1)
{
    st_2fb6c_0 *v2;  // x0
    unsigned long long v3;  // x8
    st_2fb6c_2 *v4;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string();
    v3 = a1->field_18;
    v2->field_20 = a1->field_20;
    v2->field_18 = v3;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v2[1].padding_0[4], &a1->field_28);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&a0->field_40, &a1->field_40);
    a0->field_58 = 0;
    a0->field_60 = 0;
    v4 = &a0->field_58;
    *(unsigned long long *)&v4->padding_0[16] = 0;
    sub_2f658(v4, a1->field_58, a1->field_60, a1->field_60 - a1->field_58 >> 2);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(a0 + 1, &a1[1].padding_0[8]);
    return a0;
}
