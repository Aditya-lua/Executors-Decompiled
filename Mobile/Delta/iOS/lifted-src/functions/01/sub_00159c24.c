/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x159c24..0x159ccc (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_159c24_1 {
    char padding_0[32];
    unsigned int field_20;
} st_159c24_1;

typedef struct st_159c24_0 {
    char field_0;
} st_159c24_0;


char * sub_159c24(st_159c24_1 *a0, long long a1, long long a2)
{
    st_159c24_0 **v0;  // [bp-0x68], Other Possible Types: char
    st_159c24_0 *v1;  // [bp-0x60]
    char v2;  // [bp-0x58]
    st_159c24_0 **v3;  // [bp-0x40], Other Possible Types: char
    st_159c24_0 *v4;  // [bp-0x38]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    if (!sub_14fb54())
        return std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(a1, a2);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v2, a2);
    v4 = &v3;
    v3 = &v4;
    sub_15b6c0(a0);
    sub_5c38(a0, &v2);
    a0->field_20 = 0;
    return &v2;
}
