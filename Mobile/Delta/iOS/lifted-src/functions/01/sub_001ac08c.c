/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ac08c..0x1ac1bc (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

char * sub_1ac08c(long long a0, long long a1, long long a2, long long a3, long long a4)
{
    long long v10;  // x0
    long long v12;  // x0
    long long v13;  // x0
    char v0;  // [bp-0xd0]
    char v1;  // [bp-0xb8]
    unsigned long long v2;  // [bp-0xa0]
    char v3;  // [bp-0x98]
    unsigned long long v4;  // [bp-0x80]
    char v5;  // [bp-0x78]
    unsigned long long v6;  // [bp-0x60]
    unsigned long v7;  // [bp-0x58]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v0, "PUT", 3);
    v10 = sub_a0c8(a3);
    v6 = 0;
    v4 = 0;
    v2 = 0;
    sub_1a9e44(a0, &v0, a1, a2, v10, sub_6b08(a3), &v5, &v3, a4, &v1);
    sub_181a8(&v1);
    sub_181a8(&v3);
    sub_181a8(&v5);
    if (*(long long *)&g_10002b0 == v7)
        return &v0;
    v12 = ___stack_chk_fail();
    sub_181a8(&v1);
    sub_181a8(&v3);
    sub_181a8(&v5);
    v13 = __Unwind_Resume(v12);
    __Unwind_Resume(v13);
}
