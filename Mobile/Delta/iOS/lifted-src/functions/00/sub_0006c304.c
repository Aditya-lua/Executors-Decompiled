/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6c304..0x6c5b0 (684 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6c304_0 {
    char field_0;
} st_6c304_0;

extern char g_e6a688;
extern char g_10002b0;

void* sub_6c304(void* a0)
{
    void* v9;  // x8
    void* v10;  // x21
    long long v11;  // x0
    long long v12;  // x0
    st_6c304_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_6c304_0 *v1;  // [bp-0x78]
    st_6c304_0 **v2;  // [bp-0x70], Other Possible Types: char
    st_6c304_0 *v3;  // [bp-0x68], Other Possible Types: void*, unsigned long
    void* v4;  // [bp-0x60]
    char *v5;  // [bp-0x50]
    unsigned long v6;  // [bp-0x48]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    sub_724d8();
    *(unsigned long long *)&a0[920] = 0;
    *(uint128_t *)&a0[904] = 0;
    v9 = a0 + 936;
    *(uint128_t *)v9 = 0;
    *(void* *)&a0[928] = v9;
    sub_717c0(a0 + 952, 0, 0, 0, 15, 15);
    v3 = &v2;
    v2 = &v3;
    memset(a0 + 960, 0, 48);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(a0 + 1008, "SYSTEM", 6);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(a0 + 1032, "DEFAULT", 7);
    *(unsigned short *)&a0[1056] = 0;
    *(unsigned long long *)&a0[1064] = 0;
    *(uint128_t *)&a0[1072] = 0;
    *(char *)&a0[1088] = 0;
    *(unsigned long *)&a0[1096] = 850045863;
    *(uint128_t *)&a0[1104] = 0;
    *(uint128_t *)&a0[1120] = 0;
    *(uint128_t *)&a0[1136] = 0;
    *(unsigned long long *)&a0[1152] = 0;
    *(unsigned long long *)&a0[1184] = 0;
    *(char *)&a0[1192] = 0;
    *(unsigned long long *)&a0[1200] = 0;
    *(unsigned long *)&a0[1208] = 850045863;
    *(uint128_t *)&a0[1216] = 0;
    *(uint128_t *)&a0[1232] = 0;
    *(uint128_t *)&a0[1248] = 0;
    *(unsigned long long *)&a0[1264] = 0;
    *(char *)&a0[1272] = 1;
    *(unsigned long *)&a0[1276] = 4294977296;
    *(unsigned long *)&a0[1288] = 850045863;
    *(uint128_t *)&a0[1296] = 0;
    *(uint128_t *)&a0[1312] = 0;
    *(uint128_t *)&a0[1328] = 0;
    *(unsigned long long *)&a0[1344] = 0;
    *(unsigned long long *)&a0[1352] = 1018212795;
    *(uint128_t *)&a0[1360] = 0;
    *(uint128_t *)&a0[1376] = 0;
    *(unsigned long long *)&a0[1392] = 0;
    *(unsigned int *)&a0[1400] = 60;
    *(char *)&a0[1404] = 1;
    *(unsigned int *)&a0[1408] = 0xffffffff;
    *(unsigned long long *)&a0[1432] = 0;
    *(uint128_t *)&a0[1416] = 0;
    *(unsigned int *)&a0[1440] = 2;
    v10 = a0 + 1448;
    *(unsigned long long *)&a0[1464] = 0;
    *(uint128_t *)v10 = 0;
    *(char *)&a0[1472] = 1;
    v3 = &g_e6a688;
    v4 = a0;
    v5 = &v3;
    sub_758ec(a0, &v3);
    sub_181a8(&v3);
    if (*(long long *)&g_10002b0 == v6)
        return a0;
    v11 = ___stack_chk_fail();
    sub_181a8(&v3);
    v3 = v10;
    sub_271a8(&v3);
    sub_181a8(a0 + 1160);
    sub_63bc8(a0 + 960);
    sub_62aa0(a0 + 928, (long long)a0[936]);
    sub_74ccc(a0);
    v12 = __Unwind_Resume(v11);
    __Unwind_Resume(v12);
}
