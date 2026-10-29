/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b5180..0x1b52a0 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_1b5180(long long a0, unsigned int a1)
{
    long long v5;  // x22
    long long v6;  // x0
    long long v7;  // x23
    long long v9;  // x8
    long long v11;  // x8
    long long v0;  // [bp-0x78], Other Possible Types: char
    char v1;  // [bp-0x70]
    char v2;  // [bp-0x58]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = sub_6b08();
    sub_64128(&v2, v5 + 7, &v0);
    v6 = sub_a0c8(&v2);
    sub_12478(v6, "Bearer ", 7);
    v7 = v6 + 7;
    sub_12478(v7, sub_a0c8(a0), v5);
    v0 = 0;
    sub_348a4(v7 + v5, 1, &v0);
    v9 = "Authorization";
    if (a1)
        v9 = "Proxy-Authorization";
    v0 = v9;
    sub_5c38();
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(v11, v0, _strlen(v0));
    sub_5c38(v11 + 24, &v1);
    return &v2;
}
