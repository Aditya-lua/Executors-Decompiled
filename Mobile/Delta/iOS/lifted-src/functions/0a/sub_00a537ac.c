/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa537ac..0xa537c8 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a537ac_0 {
    char padding_0[112];
    unsigned long long field_70;
} st_a537ac_0;


int sub_a537ac(st_a537ac_0 **a0)
{
    if (!*a0->field_70)
        return 1;
    goto *((void *)(*a0->field_70));
}
