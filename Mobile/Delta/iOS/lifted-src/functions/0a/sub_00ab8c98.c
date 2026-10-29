/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab8c98..0xab8ca8 (16 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab8c98_0 {
    char padding_0[16];
    unsigned int field_10;
} st_ab8c98_0;


int sub_ab8c98(st_ab8c98_0 *a0, unsigned int a1)
{
    if (a0)
    {
        a0->field_10 = a1;
        a0 = 1;
    }
    return (unsigned int)a0;
}
