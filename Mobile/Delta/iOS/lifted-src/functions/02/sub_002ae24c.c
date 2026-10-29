/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ae24c..0x2ae354 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

void sub_2ae24c(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6)
{
    unsigned long long v11;  // x26
    unsigned long long v12;  // x25
    long long v23;  // x0
    long long v26;  // x0
    unsigned long long v13;  // x24
    unsigned long long v14;  // x23
    unsigned long long v15;  // x22
    unsigned long long v16;  // x21
    unsigned long long v17;  // x20
    unsigned long long v18;  // x19
    unsigned long long v19;  // x30
    long long v20;  // x0
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    v0 = v11;
    v1 = v12;
    v2 = v13;
    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = &v10;
    v9 = v19;
    v20 = sub_a0c8(a1);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a0, v20, sub_6b08(a1));
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a0, a2, _strlen(a2));
    v23 = sub_a0c8(a3);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a0, v23, sub_6b08(a3));
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a0, a4, _strlen(a4));
    v26 = sub_a0c8(a5);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a0, v26, sub_6b08(a5));
    sub_a0c8(a6);
    sub_6b08(a6);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append();
    return;
}
