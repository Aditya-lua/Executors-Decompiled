/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c5a80..0x1c5b94 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_1c5a80(unsigned long a0, long long i, long long a2, unsigned long a3)
{
    unsigned long v8;  // x19
    unsigned long v0;  // [bp-0x60]
    char *v1;  // [bp-0x58]
    char *v2;  // [bp-0x50]
    char v3;  // [bp-0x48]
    unsigned long v4;  // [bp-0x40]
    unsigned long v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = a3;
    v4 = a3;
    v5 = a3;
    v0 = a0;
    v1 = &v4;
    v2 = &v5;
    v3 = 0;
    if (i != a2)
    {
        do
        {
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(v8, i);
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(v8 + 24, i + 24);
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(v8 + 48, i + 48);
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(v8 + 72, i + 72);
            v8 = v5 + 96;
            v5 = v8;
            i += 96;
        } while (i != a2);
    }
    v3 = 1;
    sub_1aa014(&v0);
    return v8;
}
