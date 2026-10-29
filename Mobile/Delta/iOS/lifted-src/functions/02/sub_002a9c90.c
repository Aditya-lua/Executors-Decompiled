/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a9c90..0x2a9e4c (444 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a9c90_2 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[4];
    char field_10;
    char padding_11[15];
    unsigned long long field_20;
} st_2a9c90_2;

typedef struct st_2a9c90_0 {
    char field_0;
} st_2a9c90_0;

extern long long g_c7c2eb;
extern char g_e7b9a0;
extern char g_e7ba30;

char * sub_2a9c90(unsigned long long a0, unsigned long long *a1, long long a2)
{
    unsigned long long v9;  // x21
    long long v10;  // x0
    st_2a9c90_2 *v11;  // x8
    st_2a9c90_0 *v0;  // [bp-0xb8]
    char v1;  // [bp-0xa0]
    char v2;  // [bp-0x88]
    char v3;  // [bp-0x70]
    st_2a9c90_0 **v4;  // [bp-0x58], Other Possible Types: char
    char v5;  // [bp-0x50]
    char v6;  // [bp-0x31]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v1, "parse_error", 11);
    v0 = &v4;
    v4 = &v0;
    v6 = 46;
    std::__1::to_string(a0);
    sub_2aa2b8("[json.exception.", &v1, &v6, &v5, "] ");
    sub_2ab044(a1);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v0, &g_c7c2eb, 0);
    sub_2afe80(&v2, "parse error", &v5, ": ", &v0, a2);
    v9 = *a1;
    v10 = sub_a0c8(&v3);
    v11->field_0 = &g_e7b9a0;
    v11->field_8 = a0;
    std::runtime_error::runtime_error(&v11->field_10, v10);
    v11->field_0 = &g_e7ba30;
    v11->field_20 = v9;
    return &v3;
}
