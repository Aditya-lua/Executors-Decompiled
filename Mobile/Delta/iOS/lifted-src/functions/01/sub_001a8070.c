/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a8070..0x1a8234 (452 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a8070_1 {
    char padding_0[424];
    long long field_1a8;
} st_1a8070_1;

typedef struct st_1a8070_0 {
    char field_0;
} st_1a8070_0;

extern char g_10002b0;

unsigned long long sub_1a8070(st_1a8070_1 *a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6)
{
    unsigned long long v14;  // x0
    long long v15;  // x0
    long long v16;  // x0
    long long v17;  // x0
    st_1a8070_0 **v0;  // [bp-0x330], Other Possible Types: char
    st_1a8070_0 *v1;  // [bp-0x328]
    st_1a8070_0 **v2;  // [bp-0x320], Other Possible Types: char
    char v3;  // [bp-0x318]
    char v4;  // [bp-0x300]
    char v5;  // [bp-0x2d0]
    char v6;  // [bp-0x2a8]
    char v7;  // [bp-0xf8]
    unsigned long long t;  // [bp-0x90]
    st_1a8070_0 *v9;  // [bp-0x88], Other Possible Types: char
    unsigned long v10;  // [bp-0x68]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v10 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    sub_1ac5d0(&v3);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(&v3, "DELETE");
    sub_1a9e04(&v5, a2);
    v4 = a1;
    sub_1b66b4(sub_1e524(&v9, a6), &v7);
    sub_181a8(&v9);
    if (a0->field_1a8 >= 1)
        t = std::__1::chrono::steady_clock::now();
    v9 = &v2;
    v2 = &v9;
    if (sub_6b08(a5))
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v9, "Content-Type", 12);
        sub_1bdca8(&v3, &v9, a5);
    }
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(&v6, a3, a4);
    sub_1c36ec(a0, &v3);
    v14 = sub_1adb9c(&v3);
    if (*(long long *)&g_10002b0 == v10)
        return v14;
    v15 = ___stack_chk_fail();
    sub_1adb9c(&v3);
    v16 = __Unwind_Resume(v15);
    sub_1adb9c(&v3);
    v17 = __Unwind_Resume(__Unwind_Resume(v16));
    sub_1adb9c(&v3);
    __Unwind_Resume(v17);
}
