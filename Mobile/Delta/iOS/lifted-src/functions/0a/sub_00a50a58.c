/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa50a58..0xa50a7c (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a50a58_0 {
    char padding_0[96];
    struct st_a50a58_0 *field_60;
} st_a50a58_0;


st_a50a58_0 * sub_a50a58(st_a50a58_0 *a0)
{
    if (!a0)
    {
        return 0;
    }
    else if (a0->field_60)
    {
        return a0->field_60;
    }
}
