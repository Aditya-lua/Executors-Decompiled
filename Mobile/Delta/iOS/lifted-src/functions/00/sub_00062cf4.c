/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x62cf4..0x62e44 (336 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_62cf4_2 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned int field_20;
    char padding_24[4];
    unsigned long long field_28;
    char padding_30[40];
    unsigned long long field_58;
    char padding_60[80];
    unsigned long long field_b0;
    unsigned int field_b8;
} st_62cf4_2;

typedef struct st_62cf4_0 {
    unsigned long long field_0;
    int field_8;
    char padding_c[4];
    unsigned long long field_10;
    unsigned long long field_18;
    char field_20;
    char padding_21[7];
    char field_28;
    char padding_29[47];
    int field_58;
    char padding_5c[12];
    int field_68;
    char padding_6c[12];
    unsigned int field_78;
    char padding_7c[4];
    unsigned long long field_80;
    char padding_88[40];
    int field_b0;
    char padding_b4[84];
    int field_108;
    char padding_10c[4];
    unsigned int field_110;
} st_62cf4_0;

typedef struct st_62cf4_1 {
    char field_0;
} st_62cf4_1;

extern char g_e69a98;
extern char g_e69ac0;
extern char g_e69ae8;
extern char g_e69bd8;
extern char g_e69c00;
extern unsigned long long g_e69c70;
extern char g_10001c8;

st_62cf4_0 * sub_62cf4(st_62cf4_0 *a0, long long a1, unsigned int a2)
{
    st_62cf4_2 *v4;  // x23
    st_62cf4_1 **v0;  // [bp-0x50], Other Possible Types: char
    st_62cf4_1 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    *(unsigned long long *)&a0->field_b0 = 0;
    *(unsigned long long *)&a0->field_8 = 0;
    a0->field_10 = &g_e69ac0;
    a0->field_80 = &g_e69c00;
    v1 = &v0;
    v0 = &v1;
    a0->field_0 = &g_e69bd8;
    std::__1::ios_base::init(&a0->field_80, &a0->field_18);
    *(unsigned long long *)&a0->field_108 = 0;
    a0->field_110 = 0xffffffff;
    a0->field_0 = &g_e69a98;
    a0->field_80 = &g_e69ae8;
    a0->field_10 = &g_e69ac0;
    a0->field_18 = &g_10001c8;
    std::__1::locale::locale(&a0->field_20);
    *(uint128_t *)&a0->field_58 = 0;
    v4 = &a0->field_58;
    memset((char *)v4 - 48, 0, 48);
    a0->field_18 = &g_e69c70;
    v4->field_10 = 0;
    v4->field_20 = a2;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(v4, a1);
    sub_6292c(&a0->field_18);
    return a0;
}
