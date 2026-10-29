/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8580..0x8598 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8580_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
    unsigned long long field_10;
    char field_18;
} st_8580_0;

extern unsigned int g_f01050;

st_8580_0 * sub_8580(st_8580_0 *a0, unsigned long a1, unsigned long a2, char a3)
{
    a0->field_0 = g_f01050;
    a0->field_8 = a1;
    a0->field_10 = a2;
    a0->field_18 = a3;
    return a0;
}
