/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7a420..0xa7a42c (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7a420_0 {
    char padding_0[224];
    struct st_a7a420_0 *field_e0;
} st_a7a420_0;


st_a7a420_0 * sub_a7a420(st_a7a420_0 *iter)
{
    if (iter)
        iter = iter->field_e0;
    return iter;
}
