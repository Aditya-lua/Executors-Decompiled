/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3acac..0xa3acc8 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3acac_0 {
    char padding_0[56];
    unsigned int field_38;
} st_a3acac_0;


int sub_a3acac(st_a3acac_0 *a0, unsigned int a1)
{
    if (!a0->field_38)
    {
        a0->field_38 = a1;
        return 1;
    }
    return 0;
}
