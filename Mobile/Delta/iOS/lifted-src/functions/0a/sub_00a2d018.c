/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2d018..0xa2d024 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2d018_0 {
    char padding_0[48];
    struct st_a2d018_0 *field_30;
} st_a2d018_0;


st_a2d018_0 * sub_a2d018(st_a2d018_0 *iter)
{
    if (iter)
        iter = iter->field_30;
    return iter;
}
