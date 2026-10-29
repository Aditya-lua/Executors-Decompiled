/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7a480..0xa7a494 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7a480_0 {
    char padding_0[168];
    unsigned long long field_a8;
} st_a7a480_0;


void sub_a7a480(st_a7a480_0 *a0)
{
    if (!a0->field_a8)
        return;
    goto *((void *)(a0->field_a8));
}
