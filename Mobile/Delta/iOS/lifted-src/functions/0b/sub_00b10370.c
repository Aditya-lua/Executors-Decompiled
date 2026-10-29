/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb10370..0xb103ac (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b10370_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
    uint128_t field_80;
    uint128_t field_90;
    uint128_t field_a0;
    char field_ac;
} st_b10370_0;


double sub_b10370(st_b10370_0 *a0, st_b10370_0 *a1)
{
    uint128_t v0;  // q0
    uint128_t v1;  // q1
    uint128_t v2;  // q3
    uint128_t v3;  // q0
    uint128_t v4;  // q1
    uint128_t v5;  // q3
    uint128_t v6;  // q0
    uint128_t v7;  // q1
    uint128_t v8;  // q2

    v0 = a1->field_0;
    v1 = a1->field_10;
    v2 = a1->field_30;
    a0->field_20 = a1->field_20;
    a0->field_30 = v2;
    a0->field_0 = v0;
    a0->field_10 = v1;
    v3 = a1->field_40;
    v4 = a1->field_50;
    v5 = a1->field_70;
    a0->field_60 = a1->field_60;
    a0->field_70 = v5;
    a0->field_40 = v3;
    a0->field_50 = v4;
    v6 = a1->field_80;
    v7 = a1->field_90;
    v8 = a1->field_a0;
    *(int128_t *)((char *)&a0->field_a0 + 12) = *(int128_t *)((char *)&a1->field_a0 + 12);
    a0->field_90 = v7;
    a0->field_a0 = v8;
    a0->field_80 = v6;
    return (unsigned long long)v6;
}
