/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5ec84..0xa5ecb8 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5ec84_0 {
    char padding_0[56];
    unsigned long long field_38;
    char padding_40[16];
    char field_50;
} st_a5ec84_0;


int sub_a5ec84(st_a5ec84_0 *a0)
{
    if (!(a0->field_50 & 1))
        return 1;
}
