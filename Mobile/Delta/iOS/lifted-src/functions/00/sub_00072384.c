/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x72384..0x72478 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_72384_1 {
    char padding_0[8];
    struct st_72384_1 *field_8;
} st_72384_1;

typedef struct st_72384_2 {
    char padding_0[184];
    struct st_72384_1 *field_b8;
} st_72384_2;

typedef struct st_72384_0 {
    char field_0;
} st_72384_0;


unsigned long long sub_72384(st_72384_2 *a0)
{
    st_72384_1 *i;  // x22
    st_72384_1 *v5;  // x23
    long long v6;  // x21
    st_72384_1 *v7;  // x23
    unsigned long v8;  // x8
    unsigned long long v9;  // x0
    st_72384_1 *v10;  // x21
    st_72384_1 *v11;  // x21
    long long v12;  // x0
    unsigned long long v13;  // x0
    st_72384_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_72384_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    i = &a0->padding_0[176];
    v5 = a0->field_b8;
    if (a0->field_b8 != i)
    {
        v6 = 0;
        do
        {
            v7 = v5;
            v6 += sub_6b08(v7 + 1);
            v5 = v7->field_8;
        } while (v7->field_8 != i);
    }
    else
    {
        v6 = 0;
    }
    memset(v8, 0, 24);
    v9 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::reserve(v8, v6);
    v10 = a0->field_b8;
    if (a0->field_b8 == i)
        return v9;
    do
    {
        v11 = v10;
        v12 = sub_a0c8(v11 + 1);
        v13 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v8, v12, sub_6b08(v11 + 1));
        v10 = v11->field_8;
    } while (v11->field_8 != i);
    return v13;
}
