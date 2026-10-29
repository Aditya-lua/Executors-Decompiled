/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x85b0..0x85c8 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_85b0_0 {
    unsigned int field_0;
    unsigned long long field_4;
    unsigned long long field_c;
} st_85b0_0;

extern unsigned int g_f00f60;

st_85b0_0 * sub_85b0(st_85b0_0 *a0, unsigned long a1, unsigned long a2)
{
    a0->field_0 = g_f00f60;
    *(unsigned long *)&(&a0->field_0)[1] = a1;
    *(unsigned long *)((char *)&a0->field_4 + 4) = a2;
    return a0;
}
