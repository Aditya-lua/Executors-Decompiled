/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d1c..0x9d64 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d1c_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    int field_10;
    unsigned int field_14;
    unsigned int field_18;
    char padding_1c[4];
    int field_20;
    unsigned long long field_24;
    unsigned int field_2c;
    unsigned int field_30;
    char field_34;
    char padding_35[27];
    unsigned long long field_50;
    unsigned short field_58;
} st_9d1c_0;


st_9d1c_0 * sub_9d1c(st_9d1c_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long long a4)
{
    unsigned int v0;  // w8

    a0->field_0 = a1;
    a0->field_8 = a2;
    v0 = a4 >> 32;
    a0->field_10 = 0;
    a0->field_14 = a4;
    a0->field_18 = -v0;
    a0->field_20 = 0;
    *(unsigned long long *)&(&a0->field_20)[1] = a4;
    *(unsigned int *)((char *)&a0->field_24 + 4) = a4;
    a0->field_2c = v0;
    memset(&a0->field_30, 0, 28);
    *(unsigned long *)&a0->padding_35[23] = a3;
    *(unsigned short *)&a0->field_50 = 0x100;
    memset(&a0->field_58, 0, 24);
    return a0;
}
