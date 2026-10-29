/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8618..0x8630 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8618_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
} st_8618_0;

extern unsigned int g_f00ff0;

st_8618_0 * sub_8618(st_8618_0 *a0, unsigned long a1, unsigned long a2)
{
    a0->field_0 = g_f00ff0;
    a0->field_8 = 0;
    a0->field_10 = 0;
    a0->field_18 = a1;
    a0->field_20 = a2;
    return a0;
}
