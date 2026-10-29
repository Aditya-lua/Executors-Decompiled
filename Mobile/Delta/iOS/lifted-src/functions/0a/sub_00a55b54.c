/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa55b54..0xa55b74 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a55b54_0 {
    char padding_0[160];
    struct st_a55b54_0 *field_a0;
} st_a55b54_0;


st_a55b54_0 * sub_a55b54(st_a55b54_0 *a0, unsigned long a1, unsigned long a2)
{
    if (!a0)
    {
        return 0;
    }
    else if (a0->field_a0)
    {
        goto *((void *)(a0->field_a0));
    }
    else
    {
        return 0;
    }
}
