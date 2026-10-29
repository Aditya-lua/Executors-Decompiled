/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6304c..0x6306c (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6304c_0 {
    char padding_0[32];
    unsigned int field_20;
    char padding_24[4];
    unsigned long long field_28;
} st_6304c_0;


st_6304c_0 * sub_6304c(st_6304c_0 *a0, unsigned int a1)
{
    a0->field_20 = a0->field_20 | a1 | !a0->field_28;
    return a0;
}
