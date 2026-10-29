/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x865c..0x867c (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_865c_0 {
    unsigned int field_0;
    unsigned long long field_4;
    unsigned long long field_c;
    unsigned long long field_14;
    unsigned long long field_1c;
} st_865c_0;

extern unsigned int g_f00fa0;

st_865c_0 * sub_865c(st_865c_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    a0->field_0 = g_f00fa0;
    *(unsigned long *)&(&a0->field_0)[1] = a1;
    *(unsigned long *)((char *)&a0->field_4 + 4) = a2;
    *(unsigned long *)((char *)&a0->field_c + 4) = a3;
    *(unsigned long *)((char *)&a0->field_14 + 4) = a4;
    return a0;
}
