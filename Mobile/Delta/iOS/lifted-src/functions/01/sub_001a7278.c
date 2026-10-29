/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a7278..0x1a73a0 (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a7278_1 {
    char padding_0[424];
    long long field_1a8;
} st_1a7278_1;

typedef struct st_1a7278_0 {
    char field_0;
} st_1a7278_0;

extern char g_10002b0;

unsigned long long sub_1a7278(st_1a7278_1 *a0, long long a1, long long a2, long long a3)
{
    unsigned long long v10;  // x0
    long long v11;  // x19
    long long v12;  // x0
    st_1a7278_0 **v0;  // [bp-0x2f8], Other Possible Types: char
    st_1a7278_0 *v1;  // [bp-0x2f0]
    char v2;  // [bp-0x2e8]
    char v3;  // [bp-0x2d0]
    char v4;  // [bp-0x2a0]
    char v5;  // [bp-0xc8]
    unsigned long long t;  // [bp-0x60]
    unsigned long v7;  // [bp-0x58]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    sub_1ac5d0(&v2);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(&v2, "GET");
    v3 = a1;
    sub_1a9e04(&v4, a2);
    sub_1b41f8(&v5, a3);
    if (a0->field_1a8 >= 1)
        t = std::__1::chrono::steady_clock::now();
    sub_1c36ec(a0, &v2);
    v10 = sub_1adb9c(&v2);
    if (*(long long *)&g_10002b0 == v7)
        return v10;
    v11 = ___stack_chk_fail();
    if ((unsigned int)&v2)
        v11 = sub_6138(v11);
    v12 = __Unwind_Resume(v11);
    sub_1adb9c(&v2);
    __Unwind_Resume(v12);
}
