/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd6108..0xd611c (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_d6108_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_d6108_0;


long long sub_d6108(st_d6108_0 *a0, st_d6108_0 *a1)
{
    return a1->field_8 == a0->field_8;
}
