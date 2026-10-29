/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1aed64..0x1aef00 (412 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1aed64_2 {
    struct st_1aed64_1 *field_0;
    long long field_8;
    long long field_10;
    long long field_18;
} st_1aed64_2;

typedef struct st_1aed64_1 {
    char padding_0[424];
    long long field_1a8;
} st_1aed64_1;

typedef struct st_1aed64_0 {
    char field_0;
} st_1aed64_0;

extern char g_10002b0;

unsigned long long sub_1aed64(st_1aed64_2 *a0, long long a1)
{
    st_1aed64_1 *v11;  // x20
    unsigned long long v12;  // x0
    long long v13;  // x0
    long long v14;  // x0
    long long v15;  // x0
    st_1aed64_0 **v0;  // [bp-0x330], Other Possible Types: char
    st_1aed64_0 *v1;  // [bp-0x328]
    char v2;  // [bp-0x320]
    char v3;  // [bp-0x308]
    char v4;  // [bp-0x2d8]
    char v5;  // [bp-0x2c0]
    char v6;  // [bp-0x290]
    unsigned long long t;  // [bp-0x50]
    unsigned long v8;  // [bp-0x48]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v11 = a0->field_0;
    sub_1ac5d0(&v4);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(&v4, "CONNECT");
    v5 = (char)(v11 + 40);
    sub_1bd564(10);
    sub_1aaba4(&v4, a0->field_8, 1, &v2, &v11[1].padding_0[304], &v11[1].padding_0[328], 1);
    sub_1bd4b4(&v6, &v3);
    if (v11->field_1a8 >= 1)
        t = std::__1::chrono::steady_clock::now();
    v12 = sub_1d2e2c(v11, a1, &v4, a0->field_10, 0, a0->field_18);
    sub_1adb9c(&v4);
    if (*(long long *)&g_10002b0 == v8)
        return v12;
    v13 = ___stack_chk_fail();
    sub_1adb9c(&v4);
    v14 = __Unwind_Resume(v13);
    sub_1adb9c(&v4);
    v15 = __Unwind_Resume(__Unwind_Resume(v14));
    sub_1adb9c(&v4);
    __Unwind_Resume(v15);
}
