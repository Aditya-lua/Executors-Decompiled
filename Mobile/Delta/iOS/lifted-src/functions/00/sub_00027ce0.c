/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x27ce0..0x2811c (1084 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f0d658;
extern unsigned long long g_f0d660;
extern unsigned long long g_f0d668;
extern char g_10002b0;

int sub_27ce0(void)
{
    unsigned int v24;  // w0
    char *i;  // x19
    char v0;  // [bp-0x230]
    char v1;  // [bp-0x218]
    char v2;  // [bp-0x200]
    char v3;  // [bp-0x1e8]
    char v4;  // [bp-0x1d0]
    char v5;  // [bp-0x1b8]
    char v6;  // [bp-0x1a0]
    char v7;  // [bp-0x188]
    char v8;  // [bp-0x170]
    char v9;  // [bp-0x158]
    char v10;  // [bp-0x140]
    char v11;  // [bp-0x128]
    char v12;  // [bp-0x110]
    char v13;  // [bp-0xf8]
    char v14;  // [bp-0xe0]
    char v15;  // [bp-0xc8]
    char v16;  // [bp-0xb0]
    char v17;  // [bp-0x98]
    char v18;  // [bp-0x80]
    char v19;  // [bp-0x68]
    char v20;  // [bp-0x50]
    unsigned long v21;  // [bp-0x38]
    char *v22;  // [bp-0x10]
    char v23;  // [bp+0x0]

    v22 = &v23;
    v21 = *(long long *)&g_10002b0;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v0, "and", 3);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v1, "break", 5);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v2, "do", 2);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, "else", 4);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v4, "elseif", 6);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v5, "end", 3);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v6, "false", 5);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v7, "for", 3);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v8, "function", 8);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v9, "if", 2);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v10, "in", 2);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v11, "local", 5);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v12, "nil", 3);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v13, "not", 3);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v14, "or", 2);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v15, "repeat", 6);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v16, "return", 6);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v17, "then", 4);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v18, "true", 4);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v19, "until", 5);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v20, "while", 5);
    g_f0d658 = 0;
    g_f0d660 = 0;
    g_f0d668 = 0;
    sub_273b0(&g_f0d658, &v0, &v21, 21);
    v24 = ___cxa_atexit(0x2737c, &g_f0d658, 0);
    if (*(long long *)&g_10002b0 == v21)
        return v24;
    i = &v0;
    do
    {
        i -= 24;
    } while (i != &v0);
    __Unwind_Resume(__Unwind_Resume(__Unwind_Resume(___stack_chk_fail())));
}
