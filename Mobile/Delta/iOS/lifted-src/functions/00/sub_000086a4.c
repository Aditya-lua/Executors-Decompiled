/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x86a4..0x86c4 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_86a4_0 {
    unsigned int field_0;
    unsigned long long field_4;
    unsigned long long field_c;
    char padding_14[4];
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
} st_86a4_0;

extern unsigned int g_f01020;

st_86a4_0 * sub_86a4(st_86a4_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long a6)
{
    a0->field_0 = g_f01020;
    *(unsigned long *)&(&a0->field_0)[1] = a1;
    *(unsigned long *)((char *)&a0->field_4 + 4) = a2;
    *(unsigned long *)a0->padding_14 = a3;
    a0->field_18 = a4;
    a0->field_20 = a5;
    a0->field_28 = a6;
    return a0;
}
