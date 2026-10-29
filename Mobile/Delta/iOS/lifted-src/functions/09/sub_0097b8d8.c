/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97b8d8..0x97b8f0 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97b8d8_0 {
    char padding_0[160];
    char field_a0;
} st_97b8d8_0;


st_97b8d8_0 * sub_97b8d8(st_97b8d8_0 *a0, unsigned int a1)
{
    char v0;  // x8

    v0 = a0->field_a0 & 254;
    if (a1)
        v0 += 1;
    a0->field_a0 = v0;
    return a0;
}
