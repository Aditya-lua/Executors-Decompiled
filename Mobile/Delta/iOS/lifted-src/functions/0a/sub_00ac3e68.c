/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac3e68..0xac3e78 (16 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac3e68_1 {
    char padding_0[160];
    struct st_ac3e68_0 *field_a0;
} st_ac3e68_1;

typedef struct st_ac3e68_0 {
    char padding_0[16];
    unsigned int field_10;
} st_ac3e68_0;


unsigned int sub_ac3e68(st_ac3e68_1 *a0)
{
    return a0->field_a0->field_10 * 4;
}
