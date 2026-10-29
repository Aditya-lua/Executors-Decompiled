/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb12184..0xb121b0 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b12184_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    char field_5c;
} st_b12184_0;


double sub_b12184(st_b12184_0 *a0, st_b12184_0 *a1)
{
    uint128_t v0;  // q0
    uint128_t v1;  // q2
    uint128_t v2;  // q0
    uint128_t v3;  // q1
    uint128_t v4;  // q2

    v0 = a1->field_0;
    v1 = a1->field_20;
    a0->field_10 = a1->field_10;
    a0->field_20 = v1;
    a0->field_0 = v0;
    v2 = a1->field_30;
    v3 = a1->field_40;
    v4 = a1->field_50;
    *(int128_t *)((char *)&a0->field_50 + 12) = *(int128_t *)((char *)&a1->field_50 + 12);
    a0->field_40 = v3;
    a0->field_50 = v4;
    a0->field_30 = v2;
    return (unsigned long long)v2;
}
