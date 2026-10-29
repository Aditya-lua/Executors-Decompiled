/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d500c..0x9d5018 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d500c_0 {
    char padding_0[72];
    struct st_9d500c_0 *field_48;
} st_9d500c_0;


st_9d500c_0 * sub_9d500c(st_9d500c_0 *iter)
{
    if (iter)
        iter = iter->field_48;
    return iter;
}
