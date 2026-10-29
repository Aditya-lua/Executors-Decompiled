/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7bf10..0xa7bf24 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7bf10_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    struct st_a7bf10_0 *field_10;
} st_a7bf10_0;


st_a7bf10_0 ** sub_a7bf10(st_a7bf10_0 **a0, st_a7bf10_0 *a1, unsigned long a2, unsigned long a3)
{
    a1->field_0 = a2;
    a1->field_8 = a3;
    a1->field_10 = *a0;
    *a0 = a1;
    return a0;
}
