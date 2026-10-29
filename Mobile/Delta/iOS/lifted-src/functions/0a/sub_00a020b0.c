/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa020b0..0xa020b8 (8 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a020b0_0 {
    char padding_0[184];
    unsigned long long field_b8;
} st_a020b0_0;


st_a020b0_0 * sub_a020b0(st_a020b0_0 *a0, unsigned long a1)
{
    a0->field_b8 = a1;
    return a0;
}
