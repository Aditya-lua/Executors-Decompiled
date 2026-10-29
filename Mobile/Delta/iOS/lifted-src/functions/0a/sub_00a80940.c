/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa80940..0xa8094c (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a80940_1 {
    char padding_0[8];
    struct st_a80940_0 *field_8;
} st_a80940_1;

typedef struct st_a80940_0 {
    char padding_0[72];
    unsigned long long field_48;
} st_a80940_0;


long long sub_a80940(st_a80940_1 *a0)
{
    return a0->field_8->field_48;
}
