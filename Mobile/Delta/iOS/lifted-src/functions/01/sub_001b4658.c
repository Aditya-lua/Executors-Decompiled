/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b4658..0x1b4794 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

char * sub_1b4658(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6)
{
    long long v9;  // x0
    long long v10;  // x0
    char v0;  // [bp-0xe0]
    char v1;  // [bp-0xc8]
    char v2;  // [bp-0xa8]
    unsigned long long v3;  // [bp-0x90]
    char v4;  // [bp-0x88]
    unsigned long long v5;  // [bp-0x70]
    unsigned long v6;  // [bp-0x68]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v0, "PATCH", 5);
    v5 = 0;
    v3 = 0;
    sub_1e524(&v1, a6);
    sub_1a9e44(a0, &v0, a1, a2, a3, a4, &v4, &v2, a5, &v1);
    sub_181a8(&v1);
    sub_181a8(&v2);
    sub_181a8(&v4);
    if (*(long long *)&g_10002b0 == v6)
        return &v0;
    v9 = ___stack_chk_fail();
    sub_181a8(&v1);
    sub_181a8(&v2);
    sub_181a8(&v4);
    v10 = __Unwind_Resume(v9);
    __Unwind_Resume(v10);
}
