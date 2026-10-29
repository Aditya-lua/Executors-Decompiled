/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6cf00..0x6d008 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_f0d120;
extern long long g_f0d138;
extern long long g_f0d150;
extern long long g_f0d168;
extern long long g_f0d180;
extern char g_1000090;

void sub_6cf00(void)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&g_f0d120, "Ping reason control frame with payload length > 125 octets", 58);
    ___cxa_atexit(&g_1000090, &g_f0d120, 0);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&g_f0d138, "Control message fragmented", 26);
    ___cxa_atexit(&g_1000090, &g_f0d138, 0);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&g_f0d150, "Fragmentation: data message out of sequence", 43);
    ___cxa_atexit(&g_1000090, &g_f0d150, 0);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&g_f0d168, "Fragmentation: continuation opcode out of sequence", 50);
    ___cxa_atexit(&g_1000090, &g_f0d168, 0);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&g_f0d180, "Invalid frame payload data", 26);
    ___cxa_atexit();
    return;
}
