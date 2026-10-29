/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ad80..0x2ae24 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2ad80_1 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[16];
    unsigned int field_20;
    char padding_24[972];
    unsigned long long field_3f0;
    unsigned long long field_3f8;
} st_2ad80_1;

typedef struct st_2ad80_0 {
    char field_0;
} st_2ad80_0;


char * sub_2ad80(st_2ad80_1 *a0, long long a1, long long a2)
{
    char *v5;  // x0
    st_2ad80_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_2ad80_0 *v1;  // [bp-0x50]
    char v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v5 = sub_2dc60();
    *(unsigned int *)(a0->field_8 + a0->field_20 * 0x88 + 28) = (unsigned int)v5;
    if (!(a0->field_3f8 & 1) && !a0->field_3f0)
        return v5;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v2, a1, a2);
    sub_5ccc(a0->field_8 + a0->field_20 * 0x88 + 64, &v2);
    return &v2;
}
