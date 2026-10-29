/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac2d20..0xac2d34 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac2d20_0 {
    uint128_t field_0;
    char field_e;
} st_ac2d20_0;


double sub_ac2d20(st_ac2d20_0 *a0, st_ac2d20_0 *a1)
{
    uint128_t v0;  // q0

    v0 = a1->field_0;
    *(long long *)((char *)&a0->field_0 + 14) = *(long long *)((char *)&a1->field_0 + 14);
    a0->field_0 = v0;
    return (unsigned long long)v0;
}
