/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4fdf4..0xa4fe08 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4fdf4_0 {
    char padding_0[16];
    unsigned int field_10;
} st_a4fdf4_0;


int sub_a4fdf4(st_a4fdf4_0 *a0)
{
    if (a0)
        a0 = a0->field_10 & 0xfffff & 0xffff0007;
    return (unsigned int)a0;
}
