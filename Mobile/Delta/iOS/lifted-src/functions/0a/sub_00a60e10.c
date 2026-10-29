/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa60e10..0xa60e34 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a60e10_0 {
    char padding_0[64];
    unsigned int field_40;
} st_a60e10_0;


st_a60e10_0 * sub_a60e10(st_a60e10_0 *a0, unsigned int a1, unsigned int a2)
{
    if (!a2)
    {
        a0->field_40 = a0->field_40 & ~a1;
        return a0;
    }
    a0->field_40 = a0->field_40 | a1;
    return a0;
}
