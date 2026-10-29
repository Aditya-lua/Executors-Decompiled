/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab8c88..0xab8c98 (16 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab8c88_0 {
    char padding_0[12];
    unsigned int field_c;
} st_ab8c88_0;


int sub_ab8c88(st_ab8c88_0 *a0, unsigned int a1)
{
    if (a0)
    {
        a0->field_c = a1;
        a0 = 1;
    }
    return (unsigned int)a0;
}
