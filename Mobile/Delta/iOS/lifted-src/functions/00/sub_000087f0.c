/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x87f0..0x8808 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_87f0_0 {
    unsigned int field_0;
    unsigned long long field_4;
    unsigned long long field_c;
} st_87f0_0;

extern unsigned int g_f01030;

st_87f0_0 * sub_87f0(st_87f0_0 *a0, unsigned long a1, unsigned long a2)
{
    a0->field_0 = g_f01030;
    *(unsigned long *)&(&a0->field_0)[1] = a1;
    *(unsigned long *)((char *)&a0->field_4 + 4) = a2;
    return a0;
}
