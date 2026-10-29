/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa79f54..0xa79f60 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a79f54_0 {
    char padding_0[216];
    struct st_a79f54_0 *field_d8;
} st_a79f54_0;


st_a79f54_0 * sub_a79f54(st_a79f54_0 *iter)
{
    if (iter)
        iter = iter->field_d8;
    return iter;
}
