/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa66e2c..0xa66e38 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a66e2c_0 {
    char padding_0[88];
    struct st_a66e2c_0 *field_58;
} st_a66e2c_0;


st_a66e2c_0 * sub_a66e2c(st_a66e2c_0 *iter)
{
    if (iter)
        iter = iter->field_58;
    return iter;
}
