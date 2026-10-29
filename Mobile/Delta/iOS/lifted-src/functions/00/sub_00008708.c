/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8708..0x8728 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8708_0 {
    unsigned int field_0;
    unsigned long long field_4;
    unsigned long long field_c;
    char padding_14[4];
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
} st_8708_0;

extern unsigned int g_f01040;

st_8708_0 * sub_8708(st_8708_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5)
{
    a0->field_0 = g_f01040;
    *(unsigned long *)&(&a0->field_0)[1] = a1;
    *(unsigned long *)((char *)&a0->field_4 + 4) = a2;
    *(unsigned long *)a0->padding_14 = a3;
    a0->field_18 = a4;
    a0->field_20 = a5;
    return a0;
}
