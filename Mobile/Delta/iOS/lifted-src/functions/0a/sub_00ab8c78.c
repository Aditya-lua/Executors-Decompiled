/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab8c78..0xab8c88 (16 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab8c78_0 {
    char padding_0[8];
    unsigned int field_8;
} st_ab8c78_0;


int sub_ab8c78(st_ab8c78_0 *a0, unsigned int a1)
{
    if (a0)
    {
        a0->field_8 = a1;
        a0 = 1;
    }
    return (unsigned int)a0;
}
