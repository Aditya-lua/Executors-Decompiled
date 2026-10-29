/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x867c..0x8690 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_867c_0 {
    unsigned int field_0;
    unsigned long long field_4;
} st_867c_0;

extern unsigned int g_f010d0;

st_867c_0 * sub_867c(st_867c_0 *a0, unsigned long a1)
{
    a0->field_0 = g_f010d0;
    *(unsigned long *)&(&a0->field_0)[1] = a1;
    return a0;
}
