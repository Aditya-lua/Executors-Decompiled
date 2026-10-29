/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x88e0..0x88f8 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_88e0_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_88e0_0;

extern unsigned int g_f00fe0;

st_88e0_0 * sub_88e0(st_88e0_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    a0->field_0 = g_f00fe0;
    a0->field_8 = a1;
    a0->field_10 = a2;
    a0->field_18 = a3;
    return a0;
}
