/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x256c4..0x25870 (428 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern uint128_t g_f0d630;
extern uint128_t g_f0d640;
extern unsigned int g_f0d650;
extern char g_10002b0;

int sub_256c4(void)
{
    unsigned int v8;  // w0
    long long v9;  // x0
    char *i;  // x19
    long long v11;  // x0
    char v0;  // [bp-0xb0]
    char v1;  // [bp-0x98]
    char v2;  // [bp-0x80]
    char v3;  // [bp-0x68]
    char v4;  // [bp-0x50]
    unsigned long v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v0, "__index", 7);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v1, "__newindex", 10);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v2, "__mode", 6);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, "__metatable", 11);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v4, "__type", 6);
    g_f0d630 = 0;
    g_f0d640 = 0;
    g_f0d650 = 0x3f800000;
    sub_18050(&g_f0d630, &v0, &v5);
    v8 = ___cxa_atexit(0x14f1c, &g_f0d630, 0);
    if (*(long long *)&g_10002b0 == v5)
        return v8;
    v9 = ___stack_chk_fail();
    sub_100d0(&g_f0d630);
    i = &v0;
    v11 = __Unwind_Resume(__Unwind_Resume(v9));
    do
    {
        i -= 24;
    } while (i != &v0);
    __Unwind_Resume(v11);
}
