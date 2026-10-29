/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x84bc..0x84d4 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_84bc_0 {
    unsigned int field_0;
    unsigned long long field_4;
    unsigned long long field_c;
} st_84bc_0;

extern unsigned int g_f01010;

st_84bc_0 * sub_84bc(st_84bc_0 *a0, unsigned long a1, unsigned long a2)
{
    a0->field_0 = g_f01010;
    *(unsigned long *)&(&a0->field_0)[1] = a1;
    *(unsigned long *)((char *)&a0->field_4 + 4) = a2;
    return a0;
}
