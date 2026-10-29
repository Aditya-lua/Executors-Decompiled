/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb55cd4..0xb55d68 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b55cd4_0 {
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
} st_b55cd4_0;


st_b55cd4_0 * sub_b55cd4(st_b55cd4_0 *a0, char *a1)
{
    *a1 = a0->field_0;
    a1[1] = a0->field_0 >> 8;
    a1[2] = *(short *)((char *)&a0->field_0 + 2);
    a1[3] = *((char *)&a0->field_0 + 3);
    a1[4] = *(int *)&a0->field_2;
    a1[5] = (unsigned int)(*(int *)&a0->field_2) >> 8;
    a1[6] = *(short *)&a0->field_3;
    a1[7] = (&a0->field_3)[1];
    a1[8] = a0->field_4;
    a1[9] = a0->field_4 >> 8;
    a1[10] = *(short *)((char *)&a0->field_4 + 2);
    a1[11] = *((char *)&a0->field_4 + 3);
    a1[12] = *(int *)&a0->field_6;
    a1[13] = (unsigned int)(*(int *)&a0->field_6) >> 8;
    a1[14] = *(short *)&a0->field_7;
    a1[15] = (&a0->field_7)[1];
    return a0;
}
