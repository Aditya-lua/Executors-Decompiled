/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98b938..0x98b948 (16 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98b938_0 {
    char padding_0[488];
    unsigned short field_1e8;
} st_98b938_0;


st_98b938_0 * sub_98b938(st_98b938_0 *a0)
{
    a0->field_1e8 = a0->field_1e8 | 1;
    return a0;
}
