/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa50c00..0xa50c1c (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a50c00_0 {
    char padding_0[72];
    unsigned int field_48;
} st_a50c00_0;


int sub_a50c00(st_a50c00_0 *a0, unsigned int a1)
{
    if (!a0->field_48)
    {
        a0->field_48 = a1;
        return 1;
    }
    return 0;
}
