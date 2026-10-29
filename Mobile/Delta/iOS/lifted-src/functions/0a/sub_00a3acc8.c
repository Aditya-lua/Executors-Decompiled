/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3acc8..0xa3ace4 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3acc8_0 {
    char padding_0[32];
    unsigned long long field_20;
} st_a3acc8_0;


int sub_a3acc8(st_a3acc8_0 *a0, unsigned long a1)
{
    if (!a0->field_20)
    {
        a0->field_20 = a1;
        return 1;
    }
    return 0;
}
