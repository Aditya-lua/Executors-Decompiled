/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8728..0x8740 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8728_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_8728_0;

extern unsigned int g_f00fe0;

st_8728_0 * sub_8728(st_8728_0 *a0, unsigned long a1)
{
    a0->field_0 = g_f00fe0;
    a0->field_8 = 0;
    a0->field_10 = 0;
    a0->field_18 = a1;
    return a0;
}
