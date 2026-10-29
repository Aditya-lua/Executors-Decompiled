/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x433f0..0x436f8 (776 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_433f0_2 {
    char padding_0[16];
    struct st_433f0_3 *field_10;
} st_433f0_2;

typedef struct st_433f0_4 {
    struct st_433f0_2 *field_0;
} st_433f0_4;

typedef struct st_433f0_3 {
    unsigned long long field_0;
} st_433f0_3;

typedef struct st_433f0_1 {
    unsigned short field_0;
    char padding_2[6];
    char field_8;
    char padding_9[79];
    unsigned short field_58;
} st_433f0_1;

typedef struct st_433f0_0 {
    char field_0;
} st_433f0_0;

extern char g_10002b0;

unsigned long long sub_433f0(long long a0, long long a1, st_433f0_1 *a2, long long a3)
{
    long long v19;  // x0
    long long v20;  // x0
    long long v21;  // x8
    unsigned long long v22;  // x0
    long long v23;  // x20
    st_433f0_2 **v24;  // x0
    st_433f0_0 **v0;  // [bp-0x5a0], Other Possible Types: char
    st_433f0_0 *v1;  // [bp-0x598]
    char v2;  // [bp-0x590]
    st_433f0_4 **v3;  // [bp-0x580], Other Possible Types: char *, char
    char v4;  // [bp-0x1f8]
    unsigned short v5;  // [bp-0x180]
    char v6;  // [bp-0x178]
    char v7;  // [bp-0x130]
    unsigned short v8;  // [bp-0x128]
    char v9;  // [bp-0x120]
    char v10;  // [bp-0x110]
    st_433f0_2 **v11;  // [bp-0xf8]
    st_433f0_2 **v12;  // [bp-0xf0]
    char v13;  // [bp-0xe0]
    char v14;  // [bp-0xc8]
    char v15;  // [bp-0xa0]
    unsigned long v16;  // [bp-0x68]
    char *v17;  // [bp-0x10]
    char v18;  // [bp+0x0]

    v17 = &v18;
    v16 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    sub_4000(&v2);
    sub_ce28(&v15, &v2);
    v19 = sub_a0c8(a0);
    v20 = sub_6b08(a0);
    v5 = a2->field_0;
    v6 = 0;
    v7 = 0;
    sub_1097c(&v6, &a2->field_8);
    v8 = a2->field_58;
    sub_16b00(v19, v20, &v15, &v2, &v5);
    sub_138cc(&v6);
    if (v11 != v12)
    {
        sub_12738(v11);
        *v11->field_10();
    }
    sub_2f828(&v3, a3);
    sub_47694(&v3, &v9, &v15, a1);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(v21, &v4);
    sub_2e724(&v3);
    sub_a070(&v14);
    v3 = &v13;
    sub_13870(&v3);
    v3 = &v11;
    sub_1241c(&v3);
    v3 = &v10;
    sub_1e6e0(&v3);
    sub_a070(&v15);
    v22 = sub_4048(&v2);
    if (*(long long *)&g_10002b0 == v16)
        return v22;
    v23 = ___stack_chk_fail();
    if ((unsigned int)&v4 != 1)
    {
        sub_2745c(&v9);
        sub_a070(&v15);
        sub_4048(&v2);
        __Unwind_Resume(v23);
    }
    v24 = ___cxa_begin_catch(v23);
    *v24->field_10();
}
