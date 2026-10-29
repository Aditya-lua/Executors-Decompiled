/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa537c8..0xa537e4 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a537c8_0 {
    char padding_0[120];
    unsigned long long field_78;
} st_a537c8_0;


int sub_a537c8(st_a537c8_0 **a0)
{
    if (!*a0->field_78)
        return 1;
    goto *((void *)(*a0->field_78));
}
