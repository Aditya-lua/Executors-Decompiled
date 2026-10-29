/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a8d78..0x2a8eec (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a8d78_0 {
    char field_0;
} st_2a8d78_0;

typedef struct st_2a8d78_1 {
    unsigned long long field_0;
    unsigned int field_8;
} st_2a8d78_1;

extern long long g_c7c2eb;
extern char g_e7b9a0;
extern char g_e7b9e0;

char * sub_2a8d78(unsigned long long a0, long long a1)
{
    long long v9;  // x0
    st_2a8d78_1 *v10;  // x8
    char v0;  // [bp-0xa8]
    char v1;  // [bp-0x90]
    char v2;  // [bp-0x78]
    st_2a8d78_0 **v3;  // [bp-0x60], Other Possible Types: char
    st_2a8d78_0 *v4;  // [bp-0x58]
    char v5;  // [bp-0x50]
    char v6;  // [bp-0x31]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v0, "out_of_range", 12);
    v4 = &v3;
    v3 = &v4;
    v6 = 46;
    std::__1::to_string(a0);
    sub_2aa2b8("[json.exception.", &v0, &v6, &v5, "] ");
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v5, &g_c7c2eb, 0);
    sub_2a5c70(&v1, &v5, a1);
    v9 = sub_a0c8(&v2);
    v10->field_0 = &g_e7b9a0;
    v10->field_8 = a0;
    std::runtime_error::runtime_error((char *)&v10[1].field_0 + 4, v9);
    v10->field_0 = &g_e7b9e0;
    return &v2;
}
