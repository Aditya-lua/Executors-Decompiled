/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1eca80..0x1ecac4 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1eca80_1 {
    struct st_1eca80_2 *field_0;
    unsigned long long field_8;
} st_1eca80_1;

typedef struct st_1eca80_2 {
    unsigned int field_0;
    unsigned int field_4;
} st_1eca80_2;

typedef struct st_1eca80_0 {
    char field_0;
} st_1eca80_0;


long long sub_1eca80(st_1eca80_1 *a0)
{
    st_1eca80_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1eca80_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a0->field_8 < 2)
        return 0;
    return a0->field_0->field_0 != a0->field_0->field_4;
}
