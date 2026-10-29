/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa80970..0xa8097c (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a80970_0 {
    char padding_0[8];
    struct st_a80970_1 *field_8;
} st_a80970_0;

typedef struct st_a80970_1 {
    unsigned long long field_0;
} st_a80970_1;


long long sub_a80970(st_a80970_0 *a0)
{
    return *(long long *)a0->field_8;
}
