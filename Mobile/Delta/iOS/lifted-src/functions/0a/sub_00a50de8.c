/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa50de8..0xa50df4 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a50de8_0 {
    char padding_0[112];
    unsigned int field_70;
} st_a50de8_0;


unsigned int sub_a50de8(st_a50de8_0 *a0, unsigned int a1)
{
    return a0->field_70 & a1;
}
