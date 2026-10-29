/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x75508..0x75860 (856 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_75508_3 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
    uint128_t field_28;
    uint128_t field_38;
    uint128_t field_48;
    unsigned long long field_58;
    unsigned short field_60;
    char padding_62[6];
    unsigned long long field_68;
    char field_70;
    char padding_71[7];
    unsigned long long field_78;
    char padding_80[5];
    char field_85;
    char padding_86[2];
    uint128_t field_88;
    uint128_t field_98;
    char padding_a8[112];
    unsigned short field_118;
    char padding_11a[6];
    unsigned long long field_120;
    unsigned long long field_128;
    unsigned long long field_130;
    char field_138;
    char padding_139[7];
    char field_140;
    char padding_141[7];
    unsigned long long field_148;
    char padding_150[48];
    unsigned long long field_180;
    unsigned long long field_188;
    char field_190;
    char padding_191[3];
    unsigned int field_194;
    unsigned short field_198;
    char padding_19a[30];
    unsigned int field_1b8;
    char padding_1bc[4];
    uint128_t field_1c0;
    char padding_1d0[48];
    unsigned long long field_200;
    unsigned long long field_208;
} st_75508_3;

typedef struct st_75508_1 {
    struct st_75508_1 *field_0;
    struct st_75508_1 *field_8;
    unsigned long long field_10;
    char padding_18[4];
    char field_1c;
    char padding_1d[3];
    unsigned long long field_20;
    unsigned long long field_28;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    unsigned long long field_60;
    unsigned int field_68;
    char padding_6c[4];
    unsigned long long field_70;
    char padding_78[48];
    unsigned long long field_a8;
    char padding_b0[24];
    uint128_t field_c8;
    uint128_t field_d8;
    unsigned long long field_e8;
    uint128_t field_f0;
    uint128_t field_100;
    uint128_t field_110;
    unsigned long long field_120;
    unsigned short field_128;
    char padding_12a[6];
    unsigned long long field_130;
    char field_138;
    char padding_139[7];
    unsigned long long field_140;
    char padding_148[5];
    char field_14d;
    char padding_14e[2];
    uint128_t field_150;
    uint128_t field_160;
    char padding_170[112];
    unsigned short field_1e0;
    char padding_1e2[6];
    unsigned long long field_1e8;
    unsigned long long field_1f0;
    unsigned long long field_1f8;
    char field_200;
    char padding_201[7];
    char field_208;
    char padding_209[7];
    unsigned long long field_210;
    char padding_218[48];
    unsigned long long field_248;
    unsigned long long field_250;
    char field_258;
    char padding_259[3];
    unsigned int field_25c;
    unsigned short field_260;
    char padding_262[30];
    unsigned int field_280;
    char padding_284[4];
    uint128_t field_288;
    char padding_298[48];
    unsigned long long field_2c8;
    unsigned long long field_2d0;
} st_75508_1;

typedef struct st_75508_2 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned short field_18;
    char padding_1a[2];
    unsigned int field_1c;
    uint128_t field_20;
    char field_30;
    char padding_31[63];
    unsigned long long field_70;
    char field_78;
    char padding_79[47];
    unsigned long long field_a8;
    struct st_75508_1 *field_b0;
    struct st_75508_1 *field_b8;
    unsigned long long field_c0;
    char padding_c8[4];
    char field_cc;
    char padding_cd[3];
    unsigned long long field_d0;
    unsigned long long field_d8;
    uint128_t field_e0;
    uint128_t field_f0;
    uint128_t field_100;
    unsigned long long field_110;
    unsigned int field_118;
    char padding_11c[4];
    unsigned long long field_120;
    char field_128;
    char padding_129[47];
    unsigned long long field_158;
    char padding_160[24];
    uint128_t field_178;
    char field_180;
    char padding_181[7];
    uint128_t field_188;
    unsigned long long field_198;
    uint128_t field_1a0;
    uint128_t field_1b0;
    uint128_t field_1c0;
    unsigned long long field_1d0;
    unsigned short field_1d8;
    char padding_1da[6];
    unsigned long long field_1e0;
    char field_1e8;
    char padding_1e9[7];
    unsigned long long field_1f0;
    char field_1f8;
    char padding_1f9[4];
    char field_1fd;
    char padding_1fe[2];
    uint128_t field_200;
    uint128_t field_210;
    char field_220;
    char padding_221[63];
    char field_260;
    char padding_261[23];
    char field_278;
    char padding_279[23];
    unsigned short field_290;
    char padding_292[6];
    unsigned long long field_298;
    unsigned long long field_2a0;
    unsigned long long field_2a8;
    char field_2b0;
    char padding_2b1[7];
    char field_2b8;
    char padding_2b9[7];
    unsigned long long field_2c0;
    char field_2c8;
    char padding_2c9[47];
    unsigned long long field_2f8;
    unsigned long long field_300;
    char field_308;
    char padding_309[3];
    unsigned int field_30c;
    unsigned short field_310;
    char padding_312[6];
    char field_318;
    char padding_319[23];
    unsigned int field_330;
    char padding_334[4];
    uint128_t field_338;
    char field_348;
    char padding_349[47];
    unsigned long long field_378;
    unsigned long long field_380;
} st_75508_2;

typedef struct st_75508_0 {
    char field_0;
} st_75508_0;


st_75508_2 * sub_75508(st_75508_2 *a0)
{
    st_75508_1 *v6;  // x22
    st_75508_3 *v7;  // x8
    long long v8;  // x0
    long long v9;  // x0
    st_75508_0 **v0;  // [bp-0x88], Other Possible Types: char
    st_75508_0 *v1;  // [bp-0x80]
    st_75508_0 **v2;  // [bp-0x78], Other Possible Types: char
    st_75508_0 *v3;  // [bp-0x70]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    a0->field_8 = 0;
    a0->field_10 = 0;
    a0->field_0 = 0;
    a0->field_18 = 1;
    a0->field_1c = 0xffffffff;
    a0->field_20 = 0;
    a0->field_70 = 850045863;
    memset(&a0->field_30, 0, 64);
    memset(&a0->field_78, 0, 48);
    v6 = &a0->field_b0;
    a0->field_a8 = 0;
    a0->field_b0 = v6;
    a0->field_b8 = v6;
    a0->field_c0 = 0;
    a0->field_d0 = 0;
    a0->field_cc = 0;
    a0->field_d8 = 850045863;
    a0->field_110 = 0;
    a0->field_f0 = 0;
    a0->field_100 = 0;
    a0->field_e0 = 0;
    a0->field_118 = 1;
    a0->field_120 = 850045863;
    memset(&a0->field_128, 0, 48);
    a0->field_158 = 0;
    v7 = (a0->padding_160)[1];
    v7->field_0 = 0;
    v7->field_10 = 0;
    *(unsigned long *)(a0->padding_181)[1] = 850045863;
    a0->field_188 = 0;
    *(uint128_t *)&a0->field_198 = 0;
    a0->field_1a0 = 0;
    *(unsigned long long *)&a0->field_1b0 = 0;
    *(unsigned short *)((char *)&a0->field_1b0 + 8) = 1011;
    *(unsigned long long *)&a0->field_1c0 = 0;
    *((char *)&a0->field_1c0 + 8) = 0;
    a0->field_1d0 = 0;
    sub_717c0(&a0->field_1d8, 0, 0, 0, 15, 15);
    a0->padding_1da[3] = 0;
    *(uint128_t *)&a0->field_1e0 = 0;
    *(uint128_t *)&a0->field_1f0 = 0;
    v3 = &v2;
    v2 = &v3;
    memset(&a0->field_200, 0, 64);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&a0->padding_221[31], "SYSTEM", 6);
    v8 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&a0->padding_221[55], "DEFAULT", 7);
    *(unsigned short *)&a0->padding_261[15] = 0;
    *(unsigned long long *)&a0->field_278 = 0;
    *(unsigned long long *)&a0->padding_279[15] = 0;
    *(unsigned long long *)&a0->padding_279[7] = 0;
    *(char *)&a0->field_290 = 0;
    *(char *)&a0->field_298 = 0;
    a0->field_2a0 = 850045863;
    memset(&a0->field_2a8, 0, 48);
    *(unsigned long long *)&a0->padding_2c9[15] = 0;
    *(unsigned long long *)&a0->padding_2c9[23] = std::__1::chrono::steady_clock::now(v8, "DEFAULT", 7);
    a0->padding_2c9[31] = 1;
    *(unsigned int *)&a0->padding_2c9[35] = 0xffffffff;
    *(unsigned short *)&a0->padding_2c9[39] = 0;
    v9 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&a0->field_2f8, "ixwebsocket::heartbeat", 22);
    *(unsigned int *)&a0->field_310 = 2;
    *(uint128_t *)&a0->field_318 = 0x32aaaba70000000000000000;
    *(unsigned long long *)&a0->padding_349[7] = 0;
    memset(&a0->padding_319[15], 0, 48);
    *(unsigned long long *)&a0->padding_349[15] = std::__1::chrono::steady_clock::now(v9, "ixwebsocket::heartbeat", 22);
    std::__1::mutex::lock((a0->padding_181)[1]);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_178, "Internal error");
    std::__1::mutex::unlock((a0->padding_181)[1]);
    sub_31ef8(&a0->field_20, "(x");
    return a0;
}
