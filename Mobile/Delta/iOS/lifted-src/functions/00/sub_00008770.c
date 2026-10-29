/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8770..0x8788 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8770_0 {
    unsigned int field_0;
    unsigned long long field_4;
    char padding_c[4];
    unsigned long long field_10;
    unsigned long long field_18;
} st_8770_0;

extern unsigned int g_f01080;

st_8770_0 * sub_8770(st_8770_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    a0->field_0 = g_f01080;
    *(unsigned long *)&(&a0->field_0)[1] = a1;
    *(unsigned long *)a0->padding_c = a2;
    a0->field_10 = a3;
    return a0;
}
