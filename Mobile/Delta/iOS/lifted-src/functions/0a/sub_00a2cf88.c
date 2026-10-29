/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2cf88..0xa2cf94 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2cf88_0 {
    char padding_0[16];
    struct st_a2cf88_0 *field_10;
} st_a2cf88_0;


st_a2cf88_0 * sub_a2cf88(st_a2cf88_0 *iter)
{
    if (iter)
        iter = iter->field_10;
    return iter;
}
