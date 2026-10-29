/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x29816c..0x2983b0 (580 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_29816c_0 {
    char field_0;
} st_29816c_0;

typedef struct st_29816c_2 {
    unsigned long long field_0;
} st_29816c_2;

typedef struct st_29816c_1 {
    char padding_0[376];
    struct st_29816c_2 *field_178;
} st_29816c_1;

extern st_29816c_1 *g_f0d3d8;

unsigned int sub_29816c(unsigned long a0)
{
    st_29816c_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_29816c_0 *v1;  // [bp-0x48]
    st_29816c_0 **v2;  // [bp-0x40], Other Possible Types: char
    st_29816c_0 *v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (!sub_2a3e68())
        return 0xffffffff;
    v3 = &v2;
    v2 = &v3;
    g_f0d3d8->field_178();
}
