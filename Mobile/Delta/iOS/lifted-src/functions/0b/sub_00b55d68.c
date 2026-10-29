/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb55d68..0xb55e20 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b55d68_0 {
    unsigned int field_0;
    unsigned short field_2;
    char field_3;
    unsigned int field_4;
    unsigned short field_6;
    char field_7;
    unsigned int field_8;
    unsigned short field_a;
    char field_b;
    unsigned int field_c;
    unsigned short field_e;
    char field_f;
    unsigned int field_10;
    unsigned short field_12;
    char field_13;
} st_b55d68_0;


st_b55d68_0 * sub_b55d68(st_b55d68_0 *a0, char *a1)
{
    *a1 = *((char *)&a0->field_0 + 3);
    a1[1] = *(short *)((char *)&a0->field_0 + 2);
    a1[2] = a0->field_0 >> 8;
    a1[3] = a0->field_0;
    a1[4] = (&a0->field_3)[1];
    a1[5] = *(short *)&a0->field_3;
    a1[6] = (unsigned int)(*(int *)&a0->field_2) >> 8;
    a1[7] = *(int *)&a0->field_2;
    a1[8] = *((char *)&a0->field_4 + 3);
    a1[9] = *(short *)((char *)&a0->field_4 + 2);
    a1[10] = a0->field_4 >> 8;
    a1[11] = a0->field_4;
    a1[12] = (&a0->field_7)[1];
    a1[13] = *(short *)&a0->field_7;
    a1[14] = (unsigned int)(*(int *)&a0->field_6) >> 8;
    a1[15] = *(int *)&a0->field_6;
    a1[16] = *((char *)&a0->field_8 + 3);
    a1[0x11] = *(short *)((char *)&a0->field_8 + 2);
    a1[18] = a0->field_8 >> 8;
    a1[19] = a0->field_8;
    return a0;
}
