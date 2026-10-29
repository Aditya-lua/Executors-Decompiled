/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18de8..0x18e0c (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_18de8_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    unsigned long long field_40;
} st_18de8_0;


double sub_18de8(st_18de8_0 *a0, st_18de8_0 *a1)
{
    uint128_t v0;  // q0
    uint128_t v1;  // q1
    uint128_t v2;  // q2

    a0->field_0 = a1->field_0;
    v0 = a1->field_10;
    v1 = a1->field_20;
    v2 = a1->field_30;
    a0->field_40 = a1->field_40;
    a0->field_20 = v1;
    a0->field_30 = v2;
    a0->field_10 = v0;
    return (unsigned long long)v0;
}
