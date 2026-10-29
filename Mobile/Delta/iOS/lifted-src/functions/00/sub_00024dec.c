/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x24dec..0x24ec8 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_24dec_1 {
    unsigned long long field_0;
    uint128_t field_8;
} st_24dec_1;

typedef struct st_24dec_0 {
    char field_0;
} st_24dec_0;

extern char g_e61f08;
extern long long g_e61f20;

void sub_24dec(uint128_t *a0, long long a1)
{
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    st_24dec_1 *v13;  // x19
    st_24dec_0 **v0;  // [bp-0x68], Other Possible Types: char
    st_24dec_0 *v1;  // [bp-0x60]
    char v2;  // [bp-0x58]
    char v3;  // [bp-0x40]
    char *v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    v5 = v10;
    v6 = v11;
    v7 = &v9;
    v8 = v12;
    v1 = &v0;
    v0 = &v1;
    v4 = &v9;
    sub_31f54(a1, &v9);
    v13 = ___cxa_allocate_exception(48);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v2, &v3);
    v13->field_0 = &g_e61f08;
    *(uint128_t *)&(&v13->field_0)[1] = *a0;
    sub_5c38((char *)&v13->field_8 + 8, &v2);
    ___cxa_throw(v13, &g_e61f20, 0x184c4);
    __debugbreak();
}
