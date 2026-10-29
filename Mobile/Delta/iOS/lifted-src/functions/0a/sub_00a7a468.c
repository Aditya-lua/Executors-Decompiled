/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7a468..0xa7a480 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7a468_0 {
    char padding_0[160];
    unsigned long long field_a0;
} st_a7a468_0;


int sub_a7a468(st_a7a468_0 *a0)
{
    if (!a0->field_a0)
        return 0;
    goto *((void *)(a0->field_a0));
}
