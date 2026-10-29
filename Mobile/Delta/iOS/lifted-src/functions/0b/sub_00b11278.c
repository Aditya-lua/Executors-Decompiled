/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb11278..0xb112bc (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b11278_0 {
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
    uint128_t field_b0;
    uint128_t field_c0;
    unsigned long long field_d0;
} st_b11278_0;


double sub_b11278(st_b11278_0 *a0, st_b11278_0 *a1)
{
    uint128_t v0;  // q1
    uint128_t v1;  // q0
    uint128_t v2;  // q1
    uint128_t v3;  // q3
    uint128_t v4;  // q0
    uint128_t v5;  // q1
    uint128_t v6;  // q3
    uint128_t v7;  // q0
    uint128_t v8;  // q1
    uint128_t v9;  // q2

    v0 = a1->field_10;
    a0->field_0 = a1->field_0;
    a0->field_10 = v0;
    v1 = a1->field_20;
    v2 = a1->field_30;
    v3 = a1->field_50;
    a0->field_40 = a1->field_40;
    a0->field_50 = v3;
    a0->field_20 = v1;
    a0->field_30 = v2;
    v4 = a1->field_60;
    v5 = a1->field_70;
    v6 = a1->field_90;
    a0->field_80 = a1->field_80;
    a0->field_90 = v6;
    a0->field_60 = v4;
    a0->field_70 = v5;
    v7 = a1->field_a0;
    v8 = a1->field_b0;
    v9 = a1->field_c0;
    a0->field_d0 = a1->field_d0;
    a0->field_b0 = v8;
    a0->field_c0 = v9;
    a0->field_a0 = v7;
    return (unsigned long long)v7;
}
