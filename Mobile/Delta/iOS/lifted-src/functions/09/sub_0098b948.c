/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98b948..0x98b964 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98b948_0 {
    char padding_0[488];
    unsigned short field_1e8;
} st_98b948_0;


st_98b948_0 * sub_98b948(st_98b948_0 *a0, char a1)
{
    a0->field_1e8 = a0->field_1e8 | (unsigned short)(__ROL__((unsigned int)(1 << (a1 & 63)), 7)) & 896 & 0x3ff;
    return a0;
}
