/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9de514..0x9de520 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9de514_0 {
    char padding_0[64];
    struct st_9de514_0 *field_40;
} st_9de514_0;


st_9de514_0 * sub_9de514(st_9de514_0 *iter)
{
    if (iter)
        iter = iter->field_40;
    return iter;
}
