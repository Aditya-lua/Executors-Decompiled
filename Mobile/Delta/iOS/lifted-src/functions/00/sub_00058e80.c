/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x58e80..0x58ec4 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_58e80_0 {
    char field_0;
} st_58e80_0;

typedef struct st_58e80_1 {
    char field_0;
    char padding_1[7];
    unsigned int field_8;
} st_58e80_1;


double sub_58e80(float a0)
{
    st_58e80_1 *v4;  // x0
    st_58e80_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_58e80_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_60194();
    v4->field_0 = 13;
    v4->field_8 = a0;
    return a0;
}
