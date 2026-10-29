/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x85c8..0x85e0 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_85c8_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
} st_85c8_0;

extern unsigned int g_f00ff0;

st_85c8_0 * sub_85c8(st_85c8_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    a0->field_0 = g_f00ff0;
    a0->field_8 = a1;
    a0->field_10 = a2;
    a0->field_18 = a3;
    a0->field_20 = a4;
    return a0;
}
