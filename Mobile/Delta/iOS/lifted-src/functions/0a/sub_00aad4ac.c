/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaad4ac..0xaad4b8 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aad4ac_0 {
    char padding_0[216];
    unsigned int field_d8;
} st_aad4ac_0;

typedef struct st_aad4ac_1 {
    char padding_0[32];
    struct st_aad4ac_0 *field_20;
} st_aad4ac_1;


int sub_aad4ac(st_aad4ac_1 *a0)
{
    return a0->field_20->field_d8;
}
