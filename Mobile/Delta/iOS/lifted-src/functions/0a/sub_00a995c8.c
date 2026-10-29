/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa995c8..0xa995dc (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a995c8_1 {
    char padding_0[8];
    struct st_a995c8_0 *field_8;
} st_a995c8_1;

typedef struct st_a995c8_0 {
    char padding_0[16];
    unsigned int field_10;
} st_a995c8_0;


st_a995c8_1 * sub_a995c8(st_a995c8_1 *a0)
{
    a0->field_8->field_10 = a0->field_8->field_10 + 1;
    return a0;
}
