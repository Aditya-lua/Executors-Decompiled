/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6a8fc..0x6aa44 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e69a98;
extern unsigned long long g_e69ac0;
extern char g_e69ae8;
extern unsigned long long g_e69c70;
extern char g_10001c8;

char * sub_6a8fc(void)
{
    long long v10;  // x8
    char v0;  // [bp-0x148], Other Possible Types: unsigned long long
    char v1;  // [bp-0x138], Other Possible Types: unsigned long long
    char v2;  // [bp-0x130], Other Possible Types: unsigned long long
    unsigned long v3;  // [bp-0xc8]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    sub_62748(&v0);
    sub_60404(sub_60404(&v1, "ixwebsocket/", 12), "11.4.6", 6);
    sub_60404(sub_60404(&v1, " ", 1), "ios", 3);
    sub_60404(sub_60404(&v1, " ssl/OpenSSL ", 13), "OpenSSL 3.5.8 25 Aug 2026", 25);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(v10, sub_62368(&v2), "OpenSSL 3.5.8 25 Aug 2026", "OpenSSL 3.5.8 25 Aug 2026");
    v0 = &g_e69a98;
    v1 = &g_e69ac0;
    v3 = &g_e69ae8;
    v2 = &g_e69c70;
    v2 = &g_10001c8;
    return &v3;
}
