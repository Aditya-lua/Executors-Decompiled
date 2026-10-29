/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab1cb0..0xab1cbc (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab1cb0_0 {
    char padding_0[164];
    unsigned int field_a4;
} st_ab1cb0_0;


unsigned int sub_ab1cb0(st_ab1cb0_0 *a0, unsigned int a1)
{
    return a0->field_a4 & a1;
}
