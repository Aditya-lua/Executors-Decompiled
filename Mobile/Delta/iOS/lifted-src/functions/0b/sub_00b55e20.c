/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb55e20..0xb55f44 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b55e20_0 {
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
    unsigned int field_14;
    unsigned short field_16;
    char field_17;
    unsigned int field_18;
    unsigned short field_1a;
    char field_1b;
    unsigned int field_1c;
    unsigned short field_1e;
    char field_1f;
} st_b55e20_0;


st_b55e20_0 * sub_b55e20(st_b55e20_0 *a0, char *a1)
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
    a1[20] = (&a0->field_b)[1];
    a1[21] = *(short *)&a0->field_b;
    a1[22] = (unsigned int)(*(int *)&a0->field_a) >> 8;
    a1[23] = *(int *)&a0->field_a;
    a1[24] = *((char *)&a0->field_c + 3);
    a1[25] = *(short *)((char *)&a0->field_c + 2);
    a1[26] = a0->field_c >> 8;
    a1[27] = a0->field_c;
    a1[28] = (&a0->field_f)[1];
    a1[29] = *(short *)&a0->field_f;
    a1[30] = (unsigned int)(*(int *)&a0->field_e) >> 8;
    a1[31] = *(int *)&a0->field_e;
    return a0;
}
