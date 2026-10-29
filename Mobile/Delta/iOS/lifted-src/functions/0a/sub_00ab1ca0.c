/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab1ca0..0xab1cb0 (16 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab1ca0_0 {
    char padding_0[164];
    unsigned int field_a4;
} st_ab1ca0_0;


st_ab1ca0_0 * sub_ab1ca0(st_ab1ca0_0 *a0, unsigned int a1)
{
    a0->field_a4 = a0->field_a4 & ~a1;
    return a0;
}
