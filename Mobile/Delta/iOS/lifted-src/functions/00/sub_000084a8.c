/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x84a8..0x84bc (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_84a8_0 {
    unsigned int field_0;
    unsigned long long field_4;
} st_84a8_0;

extern unsigned int g_f00f70;

st_84a8_0 * sub_84a8(st_84a8_0 *a0, unsigned long a1)
{
    a0->field_0 = g_f00f70;
    *(unsigned long *)&(&a0->field_0)[1] = a1;
    return a0;
}
