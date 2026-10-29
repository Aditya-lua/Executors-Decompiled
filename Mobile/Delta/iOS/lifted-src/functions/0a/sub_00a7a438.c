/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7a438..0xa7a450 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7a438_0 {
    char padding_0[152];
    unsigned long long field_98;
} st_a7a438_0;


int sub_a7a438(st_a7a438_0 *a0)
{
    if (!a0->field_98)
        return 0;
    goto *((void *)(a0->field_98));
}
