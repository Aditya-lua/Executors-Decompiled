/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97be94..0x97bea8 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97be94_0 {
    char padding_0[89];
    char field_59;
} st_97be94_0;


long long sub_97be94(st_97be94_0 *a0, char a1)
{
    unsigned long v0;  // x0

    v0 = a0->field_59;
    if (a1)
        a0->field_59 = 0;
    return v0;
}
