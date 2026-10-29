/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8838..0x884c (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8838_0 {
    unsigned int field_0;
    unsigned long long field_4;
} st_8838_0;

extern unsigned int g_f00e90;

st_8838_0 * sub_8838(st_8838_0 *a0, unsigned long a1)
{
    a0->field_0 = g_f00e90;
    *(unsigned long *)&(&a0->field_0)[1] = a1;
    return a0;
}
