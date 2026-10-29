/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa0a420..0xa0a654 (564 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a0a420_0 {
    unsigned long long field_0;
    unsigned int field_4;
    unsigned short field_6;
    char field_7;
    unsigned long long field_8;
    unsigned int field_c;
    unsigned short field_e;
    char field_f;
    unsigned long long field_10;
    unsigned int field_14;
    unsigned short field_16;
    char field_17;
    unsigned long long field_18;
    unsigned int field_1c;
    unsigned short field_1e;
    char field_1f;
    unsigned long long field_20;
    unsigned int field_24;
    unsigned short field_26;
    char field_27;
    unsigned long long field_28;
    unsigned int field_2c;
    unsigned short field_2e;
    char field_2f;
    unsigned long long field_30;
    unsigned int field_34;
    unsigned short field_36;
    char field_37;
} st_a0a420_0;


char * sub_a0a420(char *a0, st_a0a420_0 *a1)
{
    *a0 = a1->field_0;
    a0[1] = a1->field_0 >> 8;
    a0[2] = a1->field_0 >> 16;
    a0[3] = a1->field_0 >> 24;
    a0[4] = *(int *)((char *)&a1->field_0 + 4);
    a0[5] = a1->field_0 >> 40;
    a0[6] = *(short *)((char *)&a1->field_0 + 6);
    a0[7] = *((char *)&a1->field_0 + 7);
    a0[8] = *(long long *)&a1->field_4;
    a0[9] = (unsigned long long)(*(long long *)&a1->field_4) >> 8;
    a0[10] = (unsigned long long)(*(long long *)&a1->field_4) >> 16;
    a0[11] = (unsigned long long)(*(long long *)&a1->field_4) >> 24;
    a0[12] = *(int *)&a1->field_6;
    a0[13] = (unsigned long long)(*(long long *)&a1->field_4) >> 40;
    a0[14] = *(short *)&a1->field_7;
    a0[15] = (&a1->field_7)[1];
    a0[16] = a1->field_8;
    a0[0x11] = a1->field_8 >> 8;
    a0[18] = a1->field_8 >> 16;
    a0[19] = a1->field_8 >> 24;
    a0[20] = *(int *)((char *)&a1->field_8 + 4);
    a0[21] = a1->field_8 >> 40;
    a0[22] = *(short *)((char *)&a1->field_8 + 6);
    a0[23] = *((char *)&a1->field_8 + 7);
    a0[24] = *(long long *)&a1->field_c;
    a0[25] = (unsigned long long)(*(long long *)&a1->field_c) >> 8;
    a0[26] = (unsigned long long)(*(long long *)&a1->field_c) >> 16;
    a0[27] = (unsigned long long)(*(long long *)&a1->field_c) >> 24;
    a0[28] = *(int *)&a1->field_e;
    a0[29] = (unsigned long long)(*(long long *)&a1->field_c) >> 40;
    a0[30] = *(short *)&a1->field_f;
    a0[31] = (&a1->field_f)[1];
    a0[32] = a1->field_10;
    a0[33] = a1->field_10 >> 8;
    a0[0x22] = a1->field_10 >> 16;
    a0[35] = a1->field_10 >> 24;
    a0[36] = *(int *)((char *)&a1->field_10 + 4);
    a0[37] = a1->field_10 >> 40;
    a0[38] = *(short *)((char *)&a1->field_10 + 6);
    a0[39] = *((char *)&a1->field_10 + 7);
    a0[40] = *(long long *)&a1->field_14;
    a0[41] = (unsigned long long)(*(long long *)&a1->field_14) >> 8;
    a0[42] = (unsigned long long)(*(long long *)&a1->field_14) >> 16;
    a0[43] = (unsigned long long)(*(long long *)&a1->field_14) >> 24;
    a0[44] = *(int *)&a1->field_16;
    a0[45] = (unsigned long long)(*(long long *)&a1->field_14) >> 40;
    a0[46] = *(short *)&a1->field_17;
    a0[47] = (&a1->field_17)[1];
    a0[48] = a1->field_18;
    a0[49] = a1->field_18 >> 8;
    a0[50] = a1->field_18 >> 16;
    a0[0x33] = a1->field_18 >> 24;
    a0[52] = *(int *)((char *)&a1->field_18 + 4);
    a0[53] = a1->field_18 >> 40;
    a0[54] = *(short *)((char *)&a1->field_18 + 6);
    a0[55] = *((char *)&a1->field_18 + 7);
    return a0;
}
