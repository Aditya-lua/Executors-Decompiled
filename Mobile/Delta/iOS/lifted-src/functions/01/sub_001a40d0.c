/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a40d0..0x1a413c (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a40d0_1 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    char padding_18[8];
    unsigned long long field_20;
} st_1a40d0_1;

typedef struct st_1a40d0_0 {
    char field_0;
} st_1a40d0_0;


long long sub_1a40d0(st_1a40d0_1 *a0)
{
    unsigned long v2;  // x9
    st_1a40d0_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1a40d0_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = (a0->field_20 >> 1) / 21;
    if (a0->field_10 == a0->field_8)
        return a0->field_8 + v2 * 8;
    return a0->field_8 + v2 * 8;
}
