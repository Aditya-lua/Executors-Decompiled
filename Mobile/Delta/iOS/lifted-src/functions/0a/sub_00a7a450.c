/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7a450..0xa7a468 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7a450_0 {
    char padding_0[136];
    unsigned long long field_88;
} st_a7a450_0;


int sub_a7a450(st_a7a450_0 *a0)
{
    if (!a0->field_88)
        return 1;
    goto *((void *)(a0->field_88));
}
