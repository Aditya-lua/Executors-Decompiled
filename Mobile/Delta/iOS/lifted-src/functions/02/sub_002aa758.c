/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2aa758..0x2aa86c (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2aa758_1 {
    char padding_0[56];
    struct st_2aa758_1 *field_38;
} st_2aa758_1;

typedef struct st_2aa758_0 {
    char field_0;
} st_2aa758_0;


st_2aa758_1 * sub_2aa758(long long a0, unsigned long a1, unsigned long a2, long long *a3)
{
    st_2aa758_1 **v12;  // x0
    st_2aa758_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_2aa758_0 *v1;  // [bp-0x68]
    st_2aa758_1 *v2;  // [bp-0x60]
    st_2aa758_1 *v3;  // [bp-0x60]
    long long v4;  // [bp-0x58]
    st_2aa758_1 *v5;  // [bp-0x50], Other Possible Types: long long
    char v6;  // [bp-0x4f]
    long long v7;  // [bp-0x48]
    st_2aa758_0 **v8;  // [bp-0x40], Other Possible Types: char
    st_2aa758_0 *v9;  // [bp-0x38]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v1 = &v0;
    v0 = &v1;
    v12 = sub_71c98();
    if (!*v12)
    {
        v9 = &v8;
        v8 = &v9;
        v3 = sub_46c80(a0, 1);
        v4 = a0;
        v5 = (st_2aa758_1 *)0;
        sub_16f34(&v6);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v3->padding_0[32], *a3);
        *(char *)&v3->field_38 = 0;
        sub_2ae53c(v3 + 1, 0);
        v5 = 1;
        sub_626e0(a0, v7, v12, v3);
        v2 = 0;
        sub_2aa29c(&v2, 0);
        return v3;
    }
    return *v12;
}
