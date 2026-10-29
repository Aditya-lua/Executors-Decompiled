/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3ac74..0xa3ac90 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3ac74_0 {
    char padding_0[12];
    unsigned int field_c;
} st_a3ac74_0;


int sub_a3ac74(st_a3ac74_0 *a0, unsigned int a1)
{
    if (!a0->field_c)
    {
        a0->field_c = a1;
        return 1;
    }
    return 0;
}
