/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x51d098..0x51d0e4 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_51d098_0 {
    unsigned int field_0;
    char field_4;
    char padding_5[3];
    unsigned long long field_8;
    unsigned short field_10;
    char padding_12[6];
    unsigned long long field_18;
    char field_20;
    char padding_21[3];
    unsigned int field_24;
    unsigned int field_28;
    char field_2c;
    char padding_2d[3075];
    unsigned long long field_c30;
} st_51d098_0;


st_51d098_0 * sub_51d098(st_51d098_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    _bzero(&a0->field_2c, 0xc00);
    a0->field_0 = 0;
    a0->field_4 = 0;
    a0->field_8 = 0;
    a0->field_10 = 0;
    a0->field_18 = 0;
    a0->field_20 = 0;
    a0->field_24 = 0;
    a0->field_28 = 0;
    a0->field_c30 = 0;
    return a0;
}
