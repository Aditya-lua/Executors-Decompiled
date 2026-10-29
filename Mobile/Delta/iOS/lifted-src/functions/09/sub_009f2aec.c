/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f2aec..0x9f2af8 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f2aec_0 {
    char padding_0[8];
    struct st_9f2aec_0 *field_8;
} st_9f2aec_0;


st_9f2aec_0 * sub_9f2aec(st_9f2aec_0 *iter)
{
    if (iter)
        iter = iter->field_8;
    return iter;
}
