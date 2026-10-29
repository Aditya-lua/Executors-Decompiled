/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xf01d4..0xf0280 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_f01d4_0 {
    char field_0;
} st_f01d4_0;

typedef struct st_f01d4_2 {
    unsigned long long field_0;
} st_f01d4_2;

typedef struct st_f01d4_1 {
    char padding_0[368];
    struct st_f01d4_2 *field_170;
} st_f01d4_1;

extern st_f01d4_1 *g_f0d3d8;

unsigned long long sub_f01d4(unsigned long long *a0, unsigned int a1)
{
    st_f01d4_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_f01d4_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    switch (a1)
    {
    case 2:
        sub_104a04();
        g_f0d3d8->field_170();
    case 0:
        return a0[11] - a0[9] >> 4;
    default:
        g_f0d3d8->field_170();
    }
}
