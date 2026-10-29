/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa58410..0xa5842c (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a58410_0 {
    char padding_0[128];
    unsigned long long field_80;
} st_a58410_0;


int sub_a58410(st_a58410_0 **a0)
{
    if (!*a0->field_80)
        return 1;
    goto *((void *)(*a0->field_80));
}
