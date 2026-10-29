/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x87b8..0x87cc (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_87b8_0 {
    unsigned int field_0;
    unsigned long long field_4;
} st_87b8_0;

extern unsigned int g_f00f10;

st_87b8_0 * sub_87b8(st_87b8_0 *a0, unsigned long a1)
{
    a0->field_0 = g_f00f10;
    *(unsigned long *)&(&a0->field_0)[1] = a1;
    return a0;
}
