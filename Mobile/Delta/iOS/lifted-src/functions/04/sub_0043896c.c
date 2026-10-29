/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x43896c..0x4389d8 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

void sub_43896c(long long a0, unsigned long a1, long long a2, long long a3)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    long long v12;  // x0
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
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back();
    v12 = sub_a0c8(a2);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a0, v12, sub_6b08(a2));
    _strlen(a3);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append();
    return;
}
