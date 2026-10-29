/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x856c..0x8580 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_856c_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
    unsigned long long field_10;
} st_856c_0;

extern unsigned int g_f00f80;

st_856c_0 * sub_856c(st_856c_0 *a0, unsigned long a1, unsigned long a2)
{
    a0->field_0 = g_f00f80;
    a0->field_8 = a1;
    a0->field_10 = a2;
    return a0;
}
