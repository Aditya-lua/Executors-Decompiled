/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x26c00..0x26f74 (884 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern uint128_t g_f0d608;
extern uint128_t g_f0d618;
extern unsigned int g_f0d628;
extern char g_10002b0;

int sub_26c00(void)
{
    char *i;  // x19
    unsigned int v20;  // w0
    long long v21;  // x0
    long long v22;  // x0
    char v0;  // [bp-0x1b8]
    char v1;  // [bp-0x1a0]
    char v2;  // [bp-0x188]
    char v3;  // [bp-0x170]
    char v4;  // [bp-0x158]
    char v5;  // [bp-0x140]
    char v6;  // [bp-0x128]
    char v7;  // [bp-0x110]
    char v8;  // [bp-0xf8]
    char v9;  // [bp-0xe0]
    char v10;  // [bp-0xc8]
    char v11;  // [bp-0xb0]
    char v12;  // [bp-0x98]
    char v13;  // [bp-0x80]
    char v14;  // [bp-0x68]
    char v15;  // [bp-0x50]
    unsigned long v16;  // [bp-0x38]
    char *v17;  // [bp-0x10]
    char v18;  // [bp+0x0]

    v17 = &v18;
    v16 = *(long long *)&g_10002b0;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v0, "__call", 6);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v1, "__concat", 8);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v2, "__unm", 5);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, "__add", 5);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v4, "__sub", 5);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v5, "__mul", 5);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v6, "__div", 5);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v7, "__mod", 5);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v8, "__pow", 5);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v9, "__tostring", 10);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v10, "__eq", 4);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v11, "__lt", 4);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v12, "__le", 4);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v13, "__iter", 6);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v14, "__len", 5);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v15, "__idiv", 6);
    g_f0d608 = 0;
    g_f0d618 = 0;
    g_f0d628 = 0x3f800000;
    i = &v0;
    sub_18050(&g_f0d608, &v0, &v16);
    v20 = ___cxa_atexit(0x14f1c, &g_f0d608, 0);
    if (*(long long *)&g_10002b0 == v16)
        return v20;
    v21 = ___stack_chk_fail();
    sub_100d0(&g_f0d608);
    v22 = __Unwind_Resume(__Unwind_Resume(v21));
    do
    {
        i -= 24;
    } while (i != &v0);
    __Unwind_Resume(v22);
}
