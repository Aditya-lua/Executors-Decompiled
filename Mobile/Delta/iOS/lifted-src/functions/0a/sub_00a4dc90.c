/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4dc90..0xa4dcac (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4dc90_0 {
    char padding_0[232];
    struct st_a4dc90_0 *field_e8;
} st_a4dc90_0;


st_a4dc90_0 * sub_a4dc90(st_a4dc90_0 *a0, unsigned long a1)
{
    if (!a0)
    {
        return 0;
    }
    else if (a0->field_e8)
    {
        goto *((void *)(a0->field_e8));
    }
    else
    {
        return 0;
    }
}
