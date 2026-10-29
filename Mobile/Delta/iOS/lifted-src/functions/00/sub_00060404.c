/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x60404..0x60524 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_60404_1 {
    unsigned long long *field_0;
    unsigned int field_8;
    char padding_c[20];
    unsigned int field_20;
} st_60404_1;

typedef struct st_60404_0 {
    char field_0;
} st_60404_0;


st_60404_1 * sub_60404(st_60404_1 *a0, unsigned long a1, unsigned long a2)
{
    st_60404_1 *v6;  // x0
    st_60404_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_60404_0 *v1;  // [bp-0x58]
    char v2;  // [bp-0x50]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    std::__1::basic_ostream<char, std::__1::char_traits<char>>::sentry::sentry(&v2, a0);
    if (v2 != 1)
        return a0;
    sub_60658((char *)a0 + *(long long *)((char *)a0->field_0 - 24));
    if (sub_60524())
        return a0;
    v6 = (char *)a0 + *(long long *)((char *)a0->field_0 - 24);
    std::__1::ios_base::clear(v6, v6->field_20 | 5);
    return a0;
}
