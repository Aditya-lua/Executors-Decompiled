/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2ae68..0xa2ae9c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2ae68_0 {
    char padding_0[8];
    struct st_a2ae68_1 *field_8;
} st_a2ae68_0;

typedef struct st_a2ae68_1 {
    unsigned int field_0;
} st_a2ae68_1;


int sub_a2ae68(st_a2ae68_0 *a0)
{
    switch (*(int *)a0->field_8)
    {
    case 1034:
        return 253;
    case 1087:
        return 253;
    case 1035:
        return 448;
    default:
        return 456;
    }
}
