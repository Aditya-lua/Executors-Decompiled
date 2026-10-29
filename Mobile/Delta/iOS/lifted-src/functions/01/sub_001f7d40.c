/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f7d40..0x1f7d6c (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f7d40_0 {
    unsigned long long field_0;
    uint128_t field_8;
} st_1f7d40_0;


double sub_1f7d40(st_1f7d40_0 *a0, st_1f7d40_0 *a1)
{
    unsigned long long v0;  // x8
    uint128_t v1;  // q0
    uint128_t v2;  // q1

    if (a0 != a1)
    {
        v0 = a0->field_0;
        a0->field_0 = a1->field_0;
        v1 = *(int128_t *)&(&a1->field_0)[1];
        a1->field_0 = v0;
        v2 = *(int128_t *)&(&a0->field_0)[1];
        *(uint128_t *)&(&a0->field_0)[1] = v1;
        *(uint128_t *)&(&a1->field_0)[1] = v2;
    }
    return (unsigned long long)v1;
}
