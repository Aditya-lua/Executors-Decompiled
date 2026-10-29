/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ad000..0x2ad10c (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2ad000_0 {
    char field_0;
} st_2ad000_0;

extern char g_10002b0;

st_2ad000_0 ** sub_2ad000(st_2ad000_0 **a0)
{
    unsigned long v8;  // x8
    char *v9;  // x21
    st_2ad000_0 **v10;  // x0
    unsigned long v11;  // x8
    unsigned long v0;  // [bp-0x60]
    st_2ad000_0 **v1;  // [bp-0x58], Other Possible Types: char
    st_2ad000_0 *v2;  // [bp-0x50]
    unsigned long v3;  // [bp-0x48]
    char v4;  // [bp-0x40]
    unsigned long v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v2 = &v1;
    v1 = &v2;
    memset(v8, 0, 24);
    v9 = a0[7];
    v10 = a0;
    if (v10[7] != v10[8])
    {
        do
        {
            v11 = *v9;
            if (31 < (unsigned int)v11)
            {
                v10 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(v8, (char)v11);
            }
            else
            {
                v4 = 0;
                v3 = 0;
                v0 = v11;
                _snprintf(&v3, 9, "<U+%.4X>");
                v10 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v8, &v3, _strlen(&v3));
            }
        } while ((v9 += 1, v9 != a0[8]));
    }
    if (*(long long *)&g_10002b0 == v5)
        return v10;
    __Unwind_Resume(__Unwind_Resume(___stack_chk_fail()));
}
