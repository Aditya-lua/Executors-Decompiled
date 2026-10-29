/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c306c..0x1c3138 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c306c_1 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned int field_18;
} st_1c306c_1;

typedef struct st_1c306c_0 {
    char field_0;
} st_1c306c_0;

extern char g_1000140;
extern char g_1000168;

st_1c306c_1 * sub_1c306c(st_1c306c_1 *a0, long long a1, unsigned int a2)
{
    st_1c306c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1c306c_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    a0->field_8 = std::__1::locale::use_facet(std::__1::locale::locale(), &g_1000140);
    a0->field_10 = std::__1::locale::use_facet(a0, &g_1000168);
    a0->field_18 = a2;
    memset(a0 + 1, 0, 36);
    sub_1a91e8(a0, a1, a1 + _strlen(a1));
    return a0;
}
