/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa55c40..0xa55c5c (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a55c40_0 {
    char padding_0[248];
    unsigned long long field_f8;
} st_a55c40_0;


int sub_a55c40(st_a55c40_0 *a0, unsigned long a1, unsigned long a2)
{
    if (!a0->field_f8)
        return 0;
    goto *((void *)(a0->field_f8));
}
