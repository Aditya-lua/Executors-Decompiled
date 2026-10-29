/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa45e0..0xaa4640 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa45e0_0 {
    unsigned int field_0;
    char padding_4[12];
    unsigned int field_10;
    char padding_14[12];
    unsigned int field_20;
    char padding_24[12];
    unsigned int field_30;
    char padding_34[12];
    unsigned int field_40;
    char padding_44[12];
    unsigned int field_50;
    char padding_54[12];
    unsigned int field_60;
    char padding_64[12];
    unsigned int field_70;
    char padding_74[12];
    unsigned int field_80;
} st_aa45e0_0;

extern char _NSHomeDirectory;

st_aa45e0_0 * sub_aa45e0(st_aa45e0_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long long a4, unsigned long long a5, unsigned int a6)
{
    unsigned int v0;  // w13
    unsigned int v1;  // w14
    unsigned int v2;  // w15
    unsigned int v3;  // w16

    v0 = ((unsigned int)a4 * 0 | (unsigned int)(a4 >> 26)) & 0x3ffffff;
    v1 = ((unsigned int)a5 * 0x1000 | (unsigned int)(a4 >> 52)) & 0x3ffffff;
    v2 = ((unsigned int)a5 * 0 | (unsigned int)(a5 >> 14)) & 0x3ffffff;
    v3 = a6 * &_NSHomeDirectory | (unsigned int)(a5 >> 40);
    a0->field_0 = (unsigned int)a4 & 0x3ffffff;
    a0->field_10 = v0;
    a0->field_20 = v0 * 5;
    a0->field_30 = v1;
    a0->field_40 = v1 * 5;
    a0->field_50 = v2;
    a0->field_60 = v2 * 5;
    a0->field_70 = v3;
    a0->field_80 = v3 * 5;
    return a0;
}
