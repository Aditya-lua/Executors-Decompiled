/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98b928..0x98b938 (16 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98b928_0 {
    char padding_0[488];
    unsigned short field_1e8;
} st_98b928_0;


st_98b928_0 * sub_98b928(st_98b928_0 *a0)
{
    a0->field_1e8 = a0->field_1e8 | 0x800;
    return a0;
}
