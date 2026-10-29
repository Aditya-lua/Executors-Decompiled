/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4bb4c..0xb4bb68 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4bb4c_0 {
    char padding_0[28];
    char field_1c;
} st_b4bb4c_0;


char sub_b4bb4c(st_b4bb4c_0 *a0)
{
    if (!a0)
    {
        return 0;
    }
    else if (a0->field_1c & 1)
    {
        return 0;
    }
}
