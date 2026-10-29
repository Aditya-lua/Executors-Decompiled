/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac2cf0..0xac2cfc (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac2cf0_0 {
    char padding_0[10];
    unsigned int field_a;
} st_ac2cf0_0;


st_ac2cf0_0 * sub_ac2cf0(st_ac2cf0_0 *a0, st_ac2cf0_0 *a1)
{
    *(int *)&(a0->padding_0)[1] = *(int *)&(a1->padding_0)[1];
    return a0;
}
