/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6af00..0x6b024 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6af00_1 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
    unsigned long long field_10;
    uint128_t field_18;
    unsigned int field_28;
    char padding_2c[4];
    char field_30;
    char padding_31[23];
    char field_48;
    char padding_49[7];
    char field_50;
    char padding_51[23];
    struct st_6af00_1 *field_68;
    unsigned long long field_70;
    unsigned long long field_78;
    char field_80;
    char padding_81[23];
    unsigned short field_98;
    char padding_9a[6];
    char field_a0;
    char padding_a1[23];
    char field_b8;
    char padding_b9[7];
    char field_c0;
} st_6af00_1;

typedef struct st_6af00_3 {
    char padding_0[24];
    long long field_18;
} st_6af00_3;

typedef struct st_6af00_2 {
    unsigned short field_0;
    char padding_2[6];
    char field_8;
    char padding_9[23];
    char field_20;
} st_6af00_2;

typedef struct st_6af00_0 {
    uint128_t field_0;
    unsigned int field_10;
    char padding_14[4];
    char field_18;
    char padding_19[23];
    char field_30;
} st_6af00_0;

typedef struct st_6af00_4 {
    struct st_6af00_1 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    char padding_18[24];
    unsigned short field_30;
    char padding_32[30];
    char field_50;
    char padding_51[7];
    char field_58;
} st_6af00_4;


st_6af00_1 * sub_6af00(st_6af00_1 *a0, unsigned int a1, unsigned long a2, unsigned long a3, st_6af00_0 *a4, st_6af00_3 *a5, st_6af00_2 *a6, char a7)
{
    uint128_t v2;  // q0
    st_6af00_1 *v3;  // x24
    st_6af00_1 *v4;  // x23
    st_6af00_4 *v5;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a0->field_0 = a1;
    a0->field_8 = a2;
    a0->field_10 = a3;
    v2 = a4->field_0;
    *(unsigned int *)((char *)&a0->field_18 + 8) = a4->field_10;
    *(uint128_t *)&(&a0->field_10)[1] = v2;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&a0->field_28, &a4->field_18);
    a0->padding_31[15] = a4->field_30;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&a0->field_48, a5);
    v3 = a0;
    v3->field_68 = 0;
    v4 = a0;
    *(st_6af00_1 **)&v4->padding_51[15] = &v3->field_68;
    v5 = &v4->padding_51[15];
    v5->field_10 = 0;
    sub_62144(v5, a5->field_18, a5 + 1);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&a0->field_78, &a5[1].padding_0[16]);
    *(unsigned short *)&a0->padding_81[15] = a6->field_0;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&a0->field_98, &a6->field_8);
    a0->padding_a1[15] = a6->field_20;
    a0->field_b8 = a7;
    return a0;
}
