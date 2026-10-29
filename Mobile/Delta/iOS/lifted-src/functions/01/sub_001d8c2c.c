/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d8c2c..0x1d8c58 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1d8c2c_0 {
    unsigned int field_0;
    char padding_4[8];
    unsigned int field_c;
} st_1d8c2c_0;

typedef struct st_1d8c2c_1 {
    char padding_0[2];
    char field_2;
    char padding_3[85];
    struct st_1d8c2c_0 *field_58;
} st_1d8c2c_1;


int sub_1d8c2c(st_1d8c2c_1 *a0)
{
    st_1d8c2c_0 *v0;  // x9

    v0 = a0->field_58;
    v0->field_0 = __ROL__(a0->field_2, 28) & 4026531841 & 1;
    v0->field_c = 1;
    a0->field_58 = a0->field_58 + 1;
    return 1;
}
