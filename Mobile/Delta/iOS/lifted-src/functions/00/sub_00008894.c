/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8894..0x88b0 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8894_0 {
    unsigned int field_0;
    unsigned long long field_4;
    unsigned long long field_c;
    char field_14;
} st_8894_0;

extern unsigned int g_f00f30;

st_8894_0 * sub_8894(st_8894_0 *a0, unsigned long a1, unsigned long a2, char a3)
{
    a0->field_0 = g_f00f30;
    *(unsigned long *)&(&a0->field_0)[1] = a1;
    *(unsigned long *)((char *)&a0->field_4 + 4) = a2;
    *((char *)&a0->field_c + 4) = a3;
    return a0;
}
