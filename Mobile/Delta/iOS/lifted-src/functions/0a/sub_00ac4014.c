/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac4014..0xac4024 (16 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac4014_1 {
    char padding_0[160];
    struct st_ac4014_0 *field_a0;
} st_ac4014_1;

typedef struct st_ac4014_0 {
    char padding_0[16];
    unsigned int field_10;
} st_ac4014_0;


unsigned int sub_ac4014(st_ac4014_1 *a0)
{
    return a0->field_a0->field_10 * 2;
}
