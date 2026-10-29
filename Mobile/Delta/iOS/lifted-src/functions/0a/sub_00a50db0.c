/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa50db0..0xa50dbc (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a50db0_0 {
    char padding_0[24];
    unsigned int field_18;
} st_a50db0_0;


unsigned int sub_a50db0(st_a50db0_0 *a0, unsigned int a1)
{
    return a0->field_18 & a1;
}
