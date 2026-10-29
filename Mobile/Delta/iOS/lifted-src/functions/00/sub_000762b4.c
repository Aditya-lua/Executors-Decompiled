/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x762b4..0x7644c (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_762b4_0 {
    char field_0;
} st_762b4_0;

extern long long g_c7c2eb;
extern char g_10002b0;

char * sub_762b4(long long a0, unsigned int a1, long long a2)
{
    long long v12;  // x0
    long long v14;  // x0
    long long v15;  // x0
    st_762b4_0 **v0;  // [bp-0xa8], Other Possible Types: char
    st_762b4_0 *v1;  // [bp-0xa0]
    unsigned long v2;  // [bp-0x80]
    unsigned long long v3;  // [bp-0x78]
    char v4;  // [bp-0x70]
    char v5;  // [bp-0x58]
    char v6;  // [bp-0x57]
    char v7;  // [bp-0x56]
    long long v8;  // [bp-0x40]
    unsigned long v9;  // [bp-0x38]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v9 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    if (a1 == 1005)
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v4, &g_c7c2eb, 0);
        v2 = sub_a0c8(&v4);
        v3 = sub_6b08(&v4);
        v8 = 0;
        sub_749a8(a0, 8, &v2, 0, &v5);
    }
    else
    {
        v5 = a1 >> 8;
        v6 = a1;
        sub_181f0(&v4, &v5, &v7, 2);
        v12 = sub_a0c8(a2);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v4, v12, sub_6b08(a2));
        v2 = sub_a0c8(&v4);
        v3 = sub_6b08(&v4);
        v8 = 0;
        sub_749a8(a0, 8, &v2, 0, &v5);
    }
    sub_181a8(&v5);
    if (*(long long *)&g_10002b0 == v9)
        return &v4;
    v14 = ___stack_chk_fail();
    sub_181a8(&v5);
    v15 = __Unwind_Resume(v14);
    __Unwind_Resume(v15);
}
