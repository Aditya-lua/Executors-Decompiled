/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa198f0..0xa1990c (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a198f0_0 {
    char padding_0[60];
    unsigned int field_3c;
    char padding_40[32];
    unsigned long long field_60;
} st_a198f0_0;


st_a198f0_0 * sub_a198f0(st_a198f0_0 *a0, unsigned int a1)
{
    a0->field_3c = a0->field_3c & ~a1;
    a0->field_60 = a0->field_60 + 1;
    return a0;
}
