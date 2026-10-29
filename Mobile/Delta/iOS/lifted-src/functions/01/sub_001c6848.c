/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c6848..0x1c691c (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c6848_0 {
    char padding_0[48];
    struct st_1c6848_1 *field_30;
} st_1c6848_0;

typedef struct st_1c6848_1 {
    unsigned long long field_0;
} st_1c6848_1;


void sub_1c6848(st_1c6848_0 **a0, unsigned long a1, long long a2)
{
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    long long v13;  // x0
    char v0;  // [bp-0x48]
    unsigned long long v1;  // [bp-0x30]
    unsigned long long v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = &v7;
    v6 = v12;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v0);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v0, " ", 1);
    v13 = sub_a0c8(a2);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v0, v13, sub_6b08(a2));
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v0, " HTTP/1.1\r\n", 11);
    sub_a0c8(&v0);
    sub_6b08(&v0);
    *a0->field_30();
}
