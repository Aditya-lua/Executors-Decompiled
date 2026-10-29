/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2d00c..0xa2d018 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2d00c_0 {
    char padding_0[32];
    struct st_a2d00c_0 *field_20;
} st_a2d00c_0;


st_a2d00c_0 * sub_a2d00c(st_a2d00c_0 *iter)
{
    if (iter)
        iter = iter->field_20;
    return iter;
}
