/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac4034..0xac4040 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac4034_1 {
    char padding_0[160];
    struct st_ac4034_0 *field_a0;
} st_ac4034_1;

typedef struct st_ac4034_0 {
    char padding_0[16];
    unsigned int field_10;
} st_ac4034_0;


int sub_ac4034(st_ac4034_1 *a0)
{
    return a0->field_a0->field_10;
}
