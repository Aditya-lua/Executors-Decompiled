/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99c110..0x99c124 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99c110_0 {
    char padding_0[120];
    unsigned int field_78;
    char padding_7c[2772];
    unsigned short field_b50;
} st_99c110_0;


int sub_99c110(st_99c110_0 *a0)
{
    if (a0->field_78)
        a0->field_b50 = 0;
    return 1;
}
