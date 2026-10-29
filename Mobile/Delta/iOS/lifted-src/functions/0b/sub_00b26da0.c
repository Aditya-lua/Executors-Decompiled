/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb26da0..0xb26dd8 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b26da0_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_b26da0_0;


void sub_b26da0(st_b26da0_0 *a0, unsigned long a1)
{
    unsigned long long *iter;  // x8
    unsigned int i;  // w9

    iter = &a0->field_8;
    i = *(int *)((char *)iter - 8);
    if (!*(int *)((char *)iter - 8))
        return;
    while (i != 10)
    {
        iter += 2;
        i = *(int *)((char *)iter - 8);
        if (!*(int *)((char *)iter - 8))
            return;
    }
    if (!*iter)
        return;
    goto *((void *)(*iter));
}
