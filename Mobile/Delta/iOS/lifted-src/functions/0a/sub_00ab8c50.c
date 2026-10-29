/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab8c50..0xab8c68 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab8c50_0 {
    uint128_t field_0;
    unsigned int field_10;
} st_ab8c50_0;


int sub_ab8c50(st_ab8c50_0 *a0, st_ab8c50_0 *a1)
{
    uint128_t v0;  // q0

    v0 = a1->field_0;
    a0->field_10 = a1->field_10;
    a0->field_0 = v0;
    return 1;
}
