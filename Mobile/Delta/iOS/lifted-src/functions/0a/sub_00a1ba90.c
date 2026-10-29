/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1ba90..0xa1baa8 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1ba90_0 {
    char padding_0[408];
    unsigned long long field_198;
} st_a1ba90_0;


int sub_a1ba90(st_a1ba90_0 **a0)
{
    if (!*a0->field_198)
        return 1;
    goto *((void *)(*a0->field_198));
}
