/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6e970..0xa6e990 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6e970_1 {
    char padding_0[40];
    struct st_a6e970_0 *field_28;
} st_a6e970_1;

typedef struct st_a6e970_0 {
    struct st_a6e970_0 *field_0;
} st_a6e970_0;


st_a6e970_0 ** sub_a6e970(st_a6e970_1 *a0)
{
    if (!a0->field_28)
    {
        return 0;
    }
    else if (!*(long long *)a0->field_28)
    {
        return 0;
    }
}
