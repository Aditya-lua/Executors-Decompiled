/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x715e8..0x716a0 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

long long sub_715e8(long long a0)
{
    long long v2;  // x8
    long long v3;  // x0
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(v2, a0);
    v3 = sub_a0c8(v2);
    v4 = sub_a0c8(v2);
    v5 = sub_716ac(v3, v4 + sub_6b08(v2));
    v6 = sub_a0c8(v2);
    v7 = sub_6b08(v2);
    return std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::erase(v2, v5 - sub_a0c8(v2), v6 + v7 - v5);
}
