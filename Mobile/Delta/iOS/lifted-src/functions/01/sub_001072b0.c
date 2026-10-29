/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1072b0..0x107300 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1072b0_0 {
    unsigned int field_0;
    char padding_4[8];
    unsigned int field_c;
} st_1072b0_0;

typedef struct st_1072b0_1 {
    char padding_0[2];
    char field_2;
    char padding_3[85];
    struct st_1072b0_0 *field_58;
} st_1072b0_1;

typedef struct st_1072b0_2 {
    char field_0;
} st_1072b0_2;


int sub_1072b0(st_1072b0_1 *a0)
{
    st_1072b0_0 *v2;  // x9
    st_1072b0_2 **v0;  // [bp-0x10], Other Possible Types: char
    st_1072b0_2 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a0->field_58;
    v2->field_0 = a0->field_2 >> 7;
    v2->field_c = 1;
    a0->field_58 = a0->field_58 + 1;
    return 1;
}
