/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4dd70..0xa4dd90 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4dd70_0 {
    char padding_0[240];
    struct st_a4dd70_0 *field_f0;
} st_a4dd70_0;


st_a4dd70_0 * sub_a4dd70(st_a4dd70_0 **a0)
{
    if (!*a0)
    {
        return 0;
    }
    else if (*a0->field_f0)
    {
        goto *((void *)(*a0->field_f0));
    }
    else
    {
        return 0;
    }
}
