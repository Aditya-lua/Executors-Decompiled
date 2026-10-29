/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa50c1c..0xa50c38 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a50c1c_0 {
    char padding_0[8];
    unsigned int field_8;
} st_a50c1c_0;


int sub_a50c1c(st_a50c1c_0 *a0, unsigned int a1)
{
    if (!a0->field_8)
    {
        a0->field_8 = a1;
        return 1;
    }
    return 0;
}
