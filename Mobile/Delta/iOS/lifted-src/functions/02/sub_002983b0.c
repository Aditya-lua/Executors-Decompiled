/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2983b0..0x2985f4 (580 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2983b0_0 {
    char field_0;
} st_2983b0_0;

typedef struct st_2983b0_2 {
    unsigned long long field_0;
} st_2983b0_2;

typedef struct st_2983b0_1 {
    char padding_0[376];
    struct st_2983b0_2 *field_178;
} st_2983b0_1;

extern st_2983b0_1 *g_f0d3d8;

unsigned int sub_2983b0(unsigned long a0)
{
    st_2983b0_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_2983b0_0 *v1;  // [bp-0x48]
    st_2983b0_0 **v2;  // [bp-0x40], Other Possible Types: char
    st_2983b0_0 *v3;  // [bp-0x38]
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
