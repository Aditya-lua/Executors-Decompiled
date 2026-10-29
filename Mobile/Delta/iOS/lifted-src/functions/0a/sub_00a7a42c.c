/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7a42c..0xa7a438 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7a42c_0 {
    char padding_0[80];
    struct st_a7a42c_0 *field_50;
} st_a7a42c_0;


st_a7a42c_0 * sub_a7a42c(st_a7a42c_0 *iter)
{
    if (iter)
        iter = iter->field_50;
    return iter;
}
