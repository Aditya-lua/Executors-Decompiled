/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x92ffd4..0x93035c (904 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_d252c8;
extern unsigned long long g_e82b78;
extern long long g_f125e8;
extern char g_1000090;
extern char g_10002b0;

void sub_92ffd4(void)
{
    unsigned long long v19;  // x24
    unsigned long long v20;  // x23
    unsigned long long v21;  // x22
    unsigned long long v22;  // x21
    unsigned long long v23;  // x20
    unsigned long long v24;  // x19
    unsigned long long v25;  // x30
    unsigned long long i;  // [bp-0xae0]
    char v1;  // [bp-0xac0]
    uint128_t v2;  // [bp-0xab0]
    uint128_t v3;  // [bp-0xaa0]
    unsigned int v4;  // [bp-0xa90]
    double v5;  // [bp-0xa8c]
    unsigned short v6;  // [bp-0xa84]
    unsigned long long v7;  // [bp-0xa82]
    unsigned long long v8;  // [bp-0xa7a]
    unsigned long v9;  // [bp-0x48]
    unsigned long long v10;  // [bp-0x40]
    unsigned long long v11;  // [bp-0x38]
    unsigned long long v12;  // [bp-0x30]
    unsigned long long v13;  // [bp-0x28]
    unsigned long long v14;  // [bp-0x20]
    unsigned long long v15;  // [bp-0x18]
    char *v16;  // [bp-0x10]
    unsigned long long v17;  // [bp-0x8]
    char v18;  // [bp+0x0]

    v10 = v19;
    v11 = v20;
    v12 = v21;
    v13 = v22;
    v14 = v23;
    v15 = v24;
    v16 = &v18;
    v17 = v25;
    v9 = *(long long *)&g_10002b0;
    sub_922d70(sub_929e94(sub_93636c(sub_944d6c())));
    v1 = 0xdfa1a3a1a7a1a3a1afa1a3a1a7a1a3a1;
    v2 = 0xf9fbf9fff9fbe3e1efe1e3e1e7e1e3e1;
    v3 = 0xd9dbd9dfd9dbd9e7e9ebe9efe9ebe9e7;
    v4 = (unsigned int)(1.4064070654e-314 >> 0);
    v5 = -4.985716963154762e+216;
    v6 = 15844;
    v8 = 0;
    v7 = 0;
    i = 0;
    if (77 >= i)
    {
        do
        {
            (&v1)[i] = (&v1)[i] + (char)i + 16 - (((char)(111 - i) | (&v1)[i]) + (char)i + 16) * 2 - 114;
            i = i + (i | 1) + (~i | 1) + 1;
        } while (i < 78);
    }
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&g_f125e8, &v1, _strlen(&v1));
    ___cxa_atexit(&g_1000090, &g_f125e8, 0);
    _memcpy(&v1, &g_d252c8, 738);
    (g_e82b78 - 0x759fb000)();
}
