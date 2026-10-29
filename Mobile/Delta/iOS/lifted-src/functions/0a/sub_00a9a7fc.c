/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9a7fc..0xa9a808 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a9a7fc_0 {
    char padding_0[24];
    struct st_a9a7fc_0 *field_18;
} st_a9a7fc_0;


st_a9a7fc_0 * sub_a9a7fc(st_a9a7fc_0 *iter)
{
    if (iter)
        iter = iter->field_18;
    return iter;
}
