/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x86c4..0x86d8 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_86c4_0 {
    unsigned int field_0;
    unsigned long long field_4;
} st_86c4_0;

extern unsigned int g_f00fd0;

st_86c4_0 * sub_86c4(st_86c4_0 *a0, unsigned long a1)
{
    a0->field_0 = g_f00fd0;
    *(unsigned long *)&(&a0->field_0)[1] = a1;
    return a0;
}
