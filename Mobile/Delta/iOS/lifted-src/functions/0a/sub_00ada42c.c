/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xada42c..0xada448 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ada42c_0 {
    char padding_0[40];
    unsigned long long field_28;
} st_ada42c_0;


st_ada42c_0 * sub_ada42c(st_ada42c_0 *a0, unsigned long a1)
{
    if (!a0)
        return 0xffffffff;
    a0->field_28 = a1;
    return 0;
}
