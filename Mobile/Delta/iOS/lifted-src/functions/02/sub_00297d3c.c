/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x297d3c..0x29816c (1072 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_297d3c_0 {
    char field_0;
} st_297d3c_0;

typedef struct st_297d3c_2 {
    unsigned long long field_0;
} st_297d3c_2;

typedef struct st_297d3c_1 {
    char padding_0[376];
    struct st_297d3c_2 *field_178;
} st_297d3c_1;

extern st_297d3c_1 *g_f0d3d8;

unsigned int sub_297d3c(unsigned long a0)
{
    st_297d3c_0 **v0;  // [bp-0x68], Other Possible Types: char
    st_297d3c_0 *v1;  // [bp-0x60]
    st_297d3c_0 *v2;  // [bp-0x58]
    st_297d3c_0 **v3;  // [bp-0x38], Other Possible Types: char
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (!sub_2a3e68())
        return 0xffffffff;
    v2 = &v3;
    v3 = &v2;
    g_f0d3d8->field_178();
}
