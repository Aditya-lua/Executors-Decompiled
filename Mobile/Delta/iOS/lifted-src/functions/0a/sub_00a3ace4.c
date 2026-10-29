/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3ace4..0xa3ad00 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3ace4_0 {
    char padding_0[40];
    unsigned long long field_28;
} st_a3ace4_0;


int sub_a3ace4(st_a3ace4_0 *a0, unsigned long a1)
{
    if (!a0->field_28)
    {
        a0->field_28 = a1;
        return 1;
    }
    return 0;
}
