/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa80964..0xa80970 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a80964_1 {
    char padding_0[8];
    struct st_a80964_0 *field_8;
} st_a80964_1;

typedef struct st_a80964_0 {
    char padding_0[80];
    unsigned long long field_50;
} st_a80964_0;


long long sub_a80964(st_a80964_1 *a0)
{
    return a0->field_8->field_50;
}
