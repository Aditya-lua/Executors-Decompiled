/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa0c8..0xa0dc (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a0c8_0 {
    struct st_a0c8_0 *field_0;
    char padding_8[15];
    char field_17;
} st_a0c8_0;


st_a0c8_0 * sub_a0c8(st_a0c8_0 *a0)
{
    if (a0->field_17 < 0)
        return a0->field_0;
    return a0;
}
