/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97bea8..0x97bebc (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97bea8_0 {
    char padding_0[88];
    char field_58;
} st_97bea8_0;


long long sub_97bea8(st_97bea8_0 *a0, char a1)
{
    unsigned long v0;  // x0

    v0 = a0->field_58;
    if (a1)
        a0->field_58 = 0;
    return v0;
}
