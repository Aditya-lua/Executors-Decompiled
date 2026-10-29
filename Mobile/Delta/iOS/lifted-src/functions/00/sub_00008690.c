/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8690..0x86a4 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8690_0 {
    unsigned int field_0;
    unsigned long long field_4;
} st_8690_0;

extern unsigned int g_f01000;

st_8690_0 * sub_8690(st_8690_0 *a0, unsigned long a1)
{
    a0->field_0 = g_f01000;
    *(unsigned long *)&(&a0->field_0)[1] = a1;
    return a0;
}
