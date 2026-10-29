/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bb238..0x1bb32c (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bb238_2 {
    struct st_1bb238_1 *field_0;
    long long field_8;
    long long field_10;
} st_1bb238_2;

typedef struct st_1bb238_1 {
    char padding_0[424];
    long long field_1a8;
} st_1bb238_1;

typedef struct st_1bb238_0 {
    char field_0;
} st_1bb238_0;

extern char g_10002b0;

unsigned long long sub_1bb238(st_1bb238_2 *a0, long long a1)
{
    st_1bb238_1 *v8;  // x20
    unsigned long long v9;  // x0
    long long v10;  // x0
    st_1bb238_0 **v0;  // [bp-0x2e8], Other Possible Types: char
    st_1bb238_0 *v1;  // [bp-0x2e0]
    char v2;  // [bp-0x2d8]
    char v3;  // [bp-0x2c0]
    unsigned long long t;  // [bp-0x50]
    unsigned long v5;  // [bp-0x48]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v8 = a0->field_0;
    sub_1ac5d0(&v2);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(&v2, "CONNECT");
    v3 = (char)(v8 + 40);
    if (v8->field_1a8 >= 1)
        t = std::__1::chrono::steady_clock::now();
    v9 = sub_1d2e2c(v8, a1, &v2, a0->field_8, 0, a0->field_10);
    sub_1adb9c(&v2);
    if (*(long long *)&g_10002b0 == v5)
        return v9;
    v10 = __Unwind_Resume(___stack_chk_fail());
    sub_1adb9c(&v2);
    __Unwind_Resume(v10);
}
