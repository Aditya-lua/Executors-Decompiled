/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2ae3c..0xa2ae68 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2ae3c_0 {
    char padding_0[8];
    struct st_a2ae3c_1 *field_8;
} st_a2ae3c_0;

typedef struct st_a2ae3c_1 {
    unsigned int field_0;
} st_a2ae3c_1;


long long sub_a2ae3c(st_a2ae3c_0 *a0)
{
    switch (*(int *)a0->field_8)
    {
    case 1034:
        return 32;
    case 1087:
        return 32;
    case 1035:
        return 56;
    default:
        return 57;
    }
}
