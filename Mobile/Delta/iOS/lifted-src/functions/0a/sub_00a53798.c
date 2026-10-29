/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa53798..0xa537ac (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a53798_0 {
    char padding_0[72];
    unsigned long long field_48;
} st_a53798_0;


void sub_a53798(st_a53798_0 **a0)
{
    if (!a0)
        return;
    goto *((void *)(*a0->field_48));
}
