/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac4040..0xac404c (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac4040_1 {
    char padding_0[160];
    struct st_ac4040_0 *field_a0;
} st_ac4040_1;

typedef struct st_ac4040_0 {
    char padding_0[52];
    unsigned int field_34;
} st_ac4040_0;


int sub_ac4040(st_ac4040_1 *a0)
{
    return a0->field_a0->field_34;
}
