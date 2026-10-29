/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd5114..0xd524c (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_d5114_0 {
    char field_0;
} st_d5114_0;

typedef struct st_d5114_2 {
    unsigned long long field_0;
} st_d5114_2;

typedef struct st_d5114_1 {
    char padding_0[376];
    struct st_d5114_2 *field_178;
} st_d5114_1;

extern st_d5114_1 *g_f0d3d8;

void sub_d5114(unsigned long a0)
{
    st_d5114_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_d5114_0 *v1;  // [bp-0x38]
    st_d5114_0 **v2;  // [bp-0x30], Other Possible Types: char
    st_d5114_0 *v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (!a0)
        return;
    v3 = &v2;
    v2 = &v3;
    g_f0d3d8->field_178();
}
