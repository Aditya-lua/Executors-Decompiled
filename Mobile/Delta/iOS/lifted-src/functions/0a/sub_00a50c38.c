/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa50c38..0xa50c54 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a50c38_0 {
    char padding_0[76];
    unsigned int field_4c;
} st_a50c38_0;


int sub_a50c38(st_a50c38_0 *a0, unsigned int a1)
{
    if (!a0->field_4c)
    {
        a0->field_4c = a1;
        return 1;
    }
    return 0;
}
