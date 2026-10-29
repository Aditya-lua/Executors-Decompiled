/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x16b48c..0x16b4d4 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_16b48c_1 {
    unsigned int field_0;
    char padding_4[8];
    unsigned int field_c;
} st_16b48c_1;

typedef struct st_16b48c_0 {
    char padding_0[88];
    struct st_16b48c_1 *field_58;
} st_16b48c_0;

typedef struct st_16b48c_2 {
    char field_0;
} st_16b48c_2;


int sub_16b48c(st_16b48c_0 *a0)
{
    unsigned int *v2;  // x8
    st_16b48c_2 **v0;  // [bp-0x10], Other Possible Types: char
    st_16b48c_2 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = &a0->field_58->field_0;
    *v2 = 1;
    v2[3] = 1;
    a0->field_58 = a0->field_58 + 1;
    return 1;
}
