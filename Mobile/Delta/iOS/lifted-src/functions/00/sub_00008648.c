/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8648..0x865c (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8648_0 {
    unsigned int field_0;
    unsigned long long field_4;
} st_8648_0;

extern unsigned int g_f010b0;

st_8648_0 * sub_8648(st_8648_0 *a0, unsigned long a1)
{
    a0->field_0 = g_f010b0;
    *(unsigned long *)&(&a0->field_0)[1] = a1;
    return a0;
}
