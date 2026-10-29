/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x84f8..0x8510 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_84f8_0 {
    unsigned int field_0;
    unsigned long long field_4;
    unsigned long long field_c;
} st_84f8_0;

extern unsigned int g_f00ee0;

st_84f8_0 * sub_84f8(st_84f8_0 *a0, unsigned long a1, unsigned long a2)
{
    a0->field_0 = g_f00ee0;
    *(unsigned long *)&(&a0->field_0)[1] = a1;
    *(unsigned long *)((char *)&a0->field_4 + 4) = a2;
    return a0;
}
