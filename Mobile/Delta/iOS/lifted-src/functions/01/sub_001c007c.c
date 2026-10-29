/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c007c..0x1c035c (736 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c007c_1 {
    struct st_1c007c_1 *field_0;
    char padding_8[8];
    struct st_1c007c_1 *field_10;
    char field_18;
    char padding_19[7];
    struct st_1c007c_1 *field_20;
    char padding_28[8];
    struct st_1c007c_1 *field_30;
    char padding_38[8];
    struct st_1c007c_1 *field_40;
    char padding_48[8];
    struct st_1c007c_1 *field_50;
    char field_58;
    char padding_59[7];
    struct st_1c007c_1 *field_60;
    char padding_68[8];
    struct st_1c007c_1 *field_70;
    char padding_78[8];
    struct st_1c007c_1 *field_80;
    char padding_88[8];
    struct st_1c007c_1 *field_90;
    char padding_98[8];
    struct st_1c007c_1 *field_a0;
    char padding_a8[8];
    struct st_1c007c_1 *field_b0;
    char padding_b8[8];
    struct st_1c007c_1 *field_c0;
    char padding_c8[8];
    struct st_1c007c_1 *field_d0;
    char padding_d8[1];
    struct st_1c007c_1 *field_d9;
} st_1c007c_1;

typedef struct st_1c007c_4 {
    struct st_1c007c_4 *field_0;
    char padding_8[8];
    struct st_1c007c_4 *field_10;
    unsigned int field_18;
    char padding_1c[4];
    struct st_1c007c_4 *field_20;
    char padding_28[8];
    struct st_1c007c_4 *field_30;
    char padding_38[8];
    struct st_1c007c_4 *field_40;
    char padding_48[8];
    struct st_1c007c_4 *field_50;
    unsigned int field_58;
    char padding_5c[4];
    struct st_1c007c_4 *field_60;
    char padding_68[8];
    struct st_1c007c_4 *field_70;
    char padding_78[8];
    struct st_1c007c_4 *field_80;
    char padding_88[8];
    struct st_1c007c_4 *field_90;
    char padding_98[8];
    struct st_1c007c_4 *field_a0;
    char padding_a8[8];
    struct st_1c007c_4 *field_b0;
    char padding_b8[8];
    struct st_1c007c_4 *field_c0;
    char padding_c8[8];
    struct st_1c007c_4 *field_d0;
    char padding_d8[1];
    struct st_1c007c_4 *field_d9;
} st_1c007c_4;

typedef struct st_1c007c_3 {
    char padding_0[24];
    struct st_1c007c_1 *field_18;
} st_1c007c_3;

typedef struct st_1c007c_2 {
    char padding_0[112];
    char field_70;
    char padding_71[479];
    struct st_1c007c_1 *field_250;
    char field_258;
    char padding_259[31];
    struct st_1c007c_1 *field_278;
} st_1c007c_2;

typedef struct st_1c007c_0 {
    char field_0;
} st_1c007c_0;

extern char g_10002b0;

unsigned long long sub_1c007c(long long a0, st_1c007c_2 *a1, long long a2, st_1c007c_4 *a3, st_1c007c_3 *a4, st_1c007c_3 *a5, long long a6, long long a7)
{
    st_1c007c_4 *v9;  // x23
    st_1c007c_1 **v10;  // x8
    unsigned long long v11;  // x0
    long long v12;  // x0
    long long v13;  // x19
    st_1c007c_0 **v0;  // [bp-0xe0], Other Possible Types: char
    st_1c007c_0 *v1;  // [bp-0xd8]
    char v2;  // [bp-0xc9]
    char v3;  // [bp-0xc8]
    st_1c007c_0 **v4;  // [bp-0xa8], Other Possible Types: char
    char *v5;  // [bp-0x88], Other Possible Types: st_1c007c_4 *
    unsigned long v6;  // [bp-0x68]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v5 = &v4;
    v4 = &v5;
    if (sub_6b08(a6))
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v5, "Content-Type", 12);
        sub_1bdca8(a1, &v5, a6);
    }
    if (a4->field_18)
    {
        a1->field_250 = a3;
        sub_1b41f8(&a1->field_258, a4);
        *(char *)&a1->field_278 = 0;
    }
    else if (a5->field_18)
    {
        a1->field_250 = 0;
        sub_1e524(&v3, a5);
        sub_1af858(&v4, &v3);
        sub_1be410(&v5, &v4, &v2);
        sub_1b115c(&v5, &a1->field_258);
        sub_181a8(&v5);
        sub_181a8(&v4);
        sub_181a8(&v3);
        *(char *)&a1->field_278 = 1;
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v5, "Transfer-Encoding", 0x11);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v4, "chunked", 7);
        sub_1bdca8(a1, &v5, &v4);
    }
    else
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(&a1->field_70, a2, a3);
    }
    v9 = operatornew(272);
    *(uint128_t *)&v9->field_c0 = 0;
    *(uint128_t *)&v9->field_d0 = 0;
    *(uint128_t *)&v9->field_a0 = 0;
    *(uint128_t *)&v9->field_b0 = 0;
    *(uint128_t *)&v9->field_80 = 0;
    *(uint128_t *)&v9->field_90 = 0;
    *(uint128_t *)&v9->field_60 = 0;
    *(uint128_t *)&v9->field_70 = 0;
    *(uint128_t *)&v9->field_40 = 0;
    *(uint128_t *)&v9->field_50 = 0;
    *(uint128_t *)&v9->field_0 = 0;
    *(uint128_t *)&v9->field_10 = 0;
    *(uint128_t *)&v9->field_20 = 0;
    *(uint128_t *)&v9->field_30 = 0;
    v9->field_18 = 0xffffffff;
    v9->field_50 = 0;
    v9->field_58 = 0x3f800000;
    *(char *)(v9->padding_d8)[1] = 0;
    v9->field_90 = 0;
    memset(&v9->field_d9, 0, 48);
    v5 = v9;
    if (sub_1bcd6c(a0, a1, v9, a7))
        v5 = 0;
    else
        v9 = 0;
    *v10 = v9;
    v11 = sub_1c1dec(&v5, 0);
    if (*(long long *)&g_10002b0 == v6)
        return v11;
    v12 = __Unwind_Resume(__Unwind_Resume(___stack_chk_fail()));
    sub_181a8(&v4);
    sub_181a8(&v3);
    v13 = __Unwind_Resume(v12);
    __Unwind_Resume(v13);
}
