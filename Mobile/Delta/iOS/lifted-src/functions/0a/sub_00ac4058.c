/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac4058..0xac4064 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac4058_1 {
    char padding_0[160];
    struct st_ac4058_0 *field_a0;
} st_ac4058_1;

typedef struct st_ac4058_0 {
    char padding_0[8];
    unsigned int field_8;
} st_ac4058_0;


int sub_ac4058(st_ac4058_1 *a0)
{
    return a0->field_a0->field_8;
}
