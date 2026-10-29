/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c7254..0x1c7324 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_1c7254(long long a0)
{
    long long v4;  // x21
    long long v5;  // x0
    long long v6;  // x22
    long long v9;  // x8
    char v0;  // [bp-0x50]
    char v1;  // [bp-0x31]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_6b08();
    sub_64128(&v0, v4 + 2, &v1);
    v5 = sub_a0c8(&v0);
    sub_12478(v5, "--", 2);
    v6 = v5 + 2;
    sub_12478(v6, sub_a0c8(a0), v4);
    v1 = 0;
    sub_348a4(v6 + v4, 1, &v1);
    sub_5c38(v9, std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v0, "--\r\n", 4));
    return &v0;
}
