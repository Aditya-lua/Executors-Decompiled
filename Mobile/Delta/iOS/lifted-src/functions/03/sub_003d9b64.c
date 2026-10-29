/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d9b64..0x3d9bdc (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d9b64_0 {
    char field_0;
} st_3d9b64_0;


char * sub_3d9b64(char *a0)
{
    unsigned long v4;  // x8
    unsigned int i;  // w8
    char *v6;  // x20
    char *v7;  // x0
    st_3d9b64_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_3d9b64_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    memset(v4, 0, 24);
    i = *a0;
    if (!i)
        return a0;
    v6 = a0 + 1;
    do
    {
        v7 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(v4, (char)___toupper((char)i));
        i = *v6;
        v6 += 1;
    } while (i);
    return v7;
}
