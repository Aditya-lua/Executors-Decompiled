/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x86d8..0x86f0 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_86d8_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned int field_18;
    unsigned int field_1c;
} st_86d8_0;

extern unsigned int g_f00ec0;

st_86d8_0 * sub_86d8(st_86d8_0 *a0, unsigned long a1, unsigned long a2, unsigned int a3, unsigned int a4)
{
    a0->field_0 = g_f00ec0;
    a0->field_8 = a1;
    a0->field_10 = a2;
    a0->field_18 = a3;
    a0->field_1c = a4;
    return a0;
}
