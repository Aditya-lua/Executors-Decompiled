/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa50dd0..0xa50de8 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a50dd0_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_a50dd0_0;


st_a50dd0_0 * sub_a50dd0(st_a50dd0_0 *a0, int a1)
{
    a0->field_18 = a0->field_18 & ~a1;
    return a0;
}
