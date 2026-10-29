/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa8092c..0xa80940 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a8092c_1 {
    char padding_0[8];
    struct st_a8092c_0 *field_8;
} st_a8092c_1;

typedef struct st_a8092c_0 {
    char padding_0[8];
    unsigned int field_8;
} st_a8092c_0;


long long sub_a8092c(st_a8092c_1 *a0, unsigned int a1)
{
    return a0->field_8->field_8 == a1;
}
