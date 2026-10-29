/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa995ac..0xa995c8 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a995ac_1 {
    char padding_0[8];
    struct st_a995ac_0 *field_8;
} st_a995ac_1;

typedef struct st_a995ac_0 {
    char padding_0[16];
    unsigned int field_10;
    char padding_14[12];
    unsigned int field_20;
} st_a995ac_0;


st_a995ac_1 * sub_a995ac(st_a995ac_1 *a0)
{
    st_a995ac_0 *v0;  // x8

    v0 = a0->field_8;
    v0->field_10 = 0;
    v0->field_20 = v0->field_20 | 13;
    return a0;
}
