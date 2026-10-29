/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98b964..0x98b980 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98b964_0 {
    char padding_0[488];
    unsigned short field_1e8;
} st_98b964_0;


st_98b964_0 * sub_98b964(st_98b964_0 *a0, char a1)
{
    a0->field_1e8 = a0->field_1e8 | (unsigned short)(__ROL__((unsigned int)(1 << (a1 & 63)), 4)) & 112 & 127;
    return a0;
}
