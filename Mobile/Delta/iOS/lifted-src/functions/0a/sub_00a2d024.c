/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2d024..0xa2d030 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2d024_0 {
    char padding_0[40];
    struct st_a2d024_0 *field_28;
} st_a2d024_0;


st_a2d024_0 * sub_a2d024(st_a2d024_0 *iter)
{
    if (iter)
        iter = iter->field_28;
    return iter;
}
