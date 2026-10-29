/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x854c..0x856c (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_854c_0 {
    unsigned int field_0;
    unsigned long long field_4;
    unsigned long long field_c;
    char padding_14[4];
    unsigned long long field_18;
    unsigned long long field_20;
} st_854c_0;

extern unsigned int g_f010c0;

st_854c_0 * sub_854c(st_854c_0 *a0)
{
    a0->field_0 = g_f010c0;
    *(unsigned long long *)&(&a0->field_0)[1] = 0xffffffffffffffff;
    *(unsigned long long *)((char *)&a0->field_4 + 4) = 0xffffffffffffffff;
    *(unsigned long long *)a0->padding_14 = 0;
    a0->field_18 = 0;
    return a0;
}
