/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x88cc..0x88e0 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_88cc_0 {
    unsigned int field_0;
    unsigned long long field_4;
} st_88cc_0;

extern unsigned int g_f00f20;

st_88cc_0 * sub_88cc(st_88cc_0 *a0, unsigned long a1)
{
    a0->field_0 = g_f00f20;
    *(unsigned long *)&(&a0->field_0)[1] = a1;
    return a0;
}
