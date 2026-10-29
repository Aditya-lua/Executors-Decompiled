/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8880..0x8894 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8880_0 {
    unsigned int field_0;
    char field_4;
} st_8880_0;

extern unsigned int g_f00e70;

st_8880_0 * sub_8880(st_8880_0 *a0, char a1)
{
    a0->field_0 = g_f00e70;
    a0->field_4 = a1;
    return a0;
}
