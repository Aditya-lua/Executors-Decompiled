/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5b108..0xb5b114 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5b108_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_b5b108_0;


st_b5b108_0 * sub_b5b108(st_b5b108_0 *a0, unsigned long a1)
{
    if (a0)
        a0->field_8 = a1;
    return a0;
}
