/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x61370..0x613f4 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_61370_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char field_10;
    char padding_11[23];
    unsigned int field_28;
    char padding_2c[4];
    unsigned long long field_30;
    unsigned long long field_38;
    unsigned long long field_40;
    unsigned long long field_48;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
    uint128_t field_80;
    uint128_t field_90;
    unsigned long long field_a0;
    uint128_t field_a8;
    uint128_t field_b8;
    char field_c8[25];
    char field_d1;
} st_61370_0;


st_61370_0 * sub_61370(st_61370_0 *a0, unsigned long a1, unsigned int a2, unsigned long a3)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a0->field_0 = 0;
    a0->field_8 = 0;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&a0->field_10);
    a0->field_28 = a2;
    a0->field_30 = a3;
    a0->field_38 = 0;
    a0->field_40 = 0;
    a0->field_48 = 850045863;
    a0->field_50 = 0;
    a0->field_60 = 0;
    a0->field_70 = 0;
    a0->field_80 = 0;
    a0->field_90 = 0;
    a0->field_a0 = 850045863;
    *(uint128_t *)&(&a0->field_a0)[1] = 0;
    *(uint128_t *)((char *)&a0->field_a8 + 8) = 0;
    *(uint128_t *)((char *)&a0->field_b8 + 8) = 0;
    *(uint128_t *)&a0->field_c8[1] = 0;
    return a0;
}
