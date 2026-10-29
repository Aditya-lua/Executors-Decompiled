/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7a5e8..0xa7a600 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7a5e8_0 {
    char padding_0[200];
    unsigned long long field_c8;
    char field_d0;
} st_a7a5e8_0;


int sub_a7a5e8(st_a7a5e8_0 *a0, unsigned long a1)
{
    a0->field_c8 = a1;
    a0->field_d0 = a0->field_d0 | 1;
    return 1;
}
