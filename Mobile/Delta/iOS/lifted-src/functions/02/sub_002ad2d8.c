/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ad2d8..0x2ad5b4 (732 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2ad2d8_2 {
    char padding_0[32];
    unsigned int field_20;
    char padding_24[4];
    char field_28;
    char padding_29[103];
    unsigned long long field_90;
} st_2ad2d8_2;

typedef struct st_2ad2d8_0 {
    char field_0;
} st_2ad2d8_0;


char * sub_2ad2d8(st_2ad2d8_2 *a0, unsigned long long a1, long long a2)
{
    long long v11;  // x8
    long long v12;  // x0
    long long ptr;  // x20
    long long v25;  // x0
    unsigned long v14;  // x0
    long long v15;  // x0
    long long ptr1;  // x21
    long long v20;  // x0
    st_2ad2d8_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_2ad2d8_0 *v1;  // [bp-0x78]
    char v2;  // [bp-0x69]
    st_2ad2d8_0 **v3;  // [bp-0x68], Other Possible Types: char
    char v4;  // [bp-0x68]
    unsigned long v5;  // [bp-0x50]
    st_2ad2d8_0 *v6;  // [bp-0x48], Other Possible Types: unsigned long
    unsigned long v7;  // [bp-0x40]
    unsigned long v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v1 = &v0;
    v0 = &v1;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(v11, "syntax error ", 13);
    v6 = &v3;
    v3 = &v6;
    if (sub_6b08(a2))
    {
        v4 = 32;
        sub_2aa110("while parsing ", a2, &v4);
        v12 = sub_a0c8(&v6);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v11, v12, sub_6b08(&v6));
    }
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v11, "- ", 2);
    v14 = a0->field_20;
    if ((unsigned int)v14 == 14)
    {
        v5 = a0->field_90;
        sub_2ad000(&a0->field_28);
        v2 = 39;
        sub_2ab22c(&v5, "; last read: '", &v4, &v2);
        v15 = sub_a0c8(&v6);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v11, v15, sub_6b08(&v6));
        if (!(unsigned int)a1)
            return &v4;
    }
    else
    {
        ptr1 = sub_2a589c(v14);
        v7 = 0;
        v8 = 0;
        v6 = 0;
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::reserve(&v6, _strlen(ptr1) + 11);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v6, "unexpected ", 11);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v6, ptr1, _strlen(ptr1));
        v20 = sub_a0c8(&v6);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v11, v20, sub_6b08(&v6));
        if (!(unsigned int)a1)
            return &v6;
    }
    ptr = sub_2a589c(a1);
    v7 = 0;
    v8 = 0;
    v6 = 0;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::reserve(&v6, _strlen(ptr) + 11);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v6, "; expected ", 11);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v6, ptr, _strlen(ptr));
    v25 = sub_a0c8(&v6);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v11, v25, sub_6b08(&v6));
    return &v6;
}
