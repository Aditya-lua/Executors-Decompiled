/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a85f4..0x1a87e0 (492 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a85f4_0 {
    char field_0;
} st_1a85f4_0;


long long * sub_1a85f4(long long *a0, long long a1, unsigned long a2)
{
    unsigned long v6;  // x8
    unsigned long i;  // x23
    long long v16;  // x0
    long long *v8;  // x0
    long long v9;  // x0
    unsigned long v11;  // x23
    long long v12;  // x0
    long long v13;  // x0
    long long v14;  // x0
    st_1a85f4_0 **v0;  // [bp-0x90], Other Possible Types: char
    st_1a85f4_0 *v1;  // [bp-0x88]
    long long v2;  // [bp-0x80]
    long long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    memset(v6, 0, 24);
    i = *a0;
    v8 = a0;
    if (*v8 != v8[1])
    {
        do
        {
            sub_1a5f48(i, a1);
            v9 = sub_a0c8(&v3);
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v6, v9, sub_6b08(&v3));
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v2, "\r\n", 2);
            v11 = i + 24;
            v12 = sub_a0c8(v11);
            v13 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::insert(&v2, 0, v12, sub_6b08(v11));
            sub_5c38(&v3, v13);
            v14 = sub_a0c8(&v3);
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v6, v14, sub_6b08(&v3));
            v8 = &v2;
            i = v11 + 72;
        } while (i != a0[1]);
    }
    if (!(a2 & 1))
        return v8;
    sub_1c7254(a1);
    v16 = sub_a0c8(&v3);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v6, v16, sub_6b08(&v3));
    return &v3;
}
