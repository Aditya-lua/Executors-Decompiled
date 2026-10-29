/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b464..0x1b5e4 (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b464_2 {
    unsigned long long field_0;
    uint128_t field_8;
} st_1b464_2;

typedef struct st_1b464_1 {
    char padding_0[89];
    char field_59;
    char padding_5a[374];
    unsigned long long field_1d0;
    unsigned long long field_1d8;
} st_1b464_1;

typedef struct st_1b464_0 {
    char field_0;
} st_1b464_0;

extern char g_e61f08;
extern long long g_e61f20;
extern unsigned int g_f0c990;

char * sub_1b464(st_1b464_1 *a0, uint128_t *a1, long long a2, long long a3)
{
    char *v7;  // x0
    st_1b464_2 *v8;  // x20
    unsigned long long v0;  // [bp-0x80]
    st_1b464_0 **v1;  // [bp-0x70], Other Possible Types: char
    st_1b464_0 *v2;  // [bp-0x68]
    char v3;  // [bp-0x60]
    char v4;  // [bp-0x48]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v2 = &v1;
    v1 = &v2;
    if (a0->field_1d0 != a0->field_1d8)
    {
        v7 = sub_22910(a1, a0->field_1d8 - 40);
        if (v7 & 0x1)
            return v7;
    }
    sub_31f54(a2, a3);
    if (g_f0c990 != 1)
    {
        sub_23758(&a0->field_1d0, a1, &v4);
        if (((long long)(a0->field_1d8 - a0->field_1d0) >> 4) * 12297829382473034411 < g_f0c990 || a0->field_59 & 1)
            return &v4;
        v0 = g_f0c990;
        sub_24dec(a1, "Reached error limit (%d)");
    }
    else
    {
        v8 = ___cxa_allocate_exception(48);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v3, &v4);
        v8->field_0 = &g_e61f08;
        *(uint128_t *)&(&v8->field_0)[1] = *a1;
        sub_5c38((char *)&v8->field_8 + 8, &v3);
        ___cxa_throw(v8, &g_e61f20, 0x184c4);
    }
    __debugbreak();
}
