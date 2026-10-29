/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb59a84..0xb59aa8 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b59a84_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    char field_4c;
} st_b59a84_0;


double sub_b59a84(st_b59a84_0 *a0, st_b59a84_0 *a1)
{
    uint128_t v0;  // q1
    uint128_t v1;  // q0
    uint128_t v2;  // q1
    uint128_t v3;  // q2

    v0 = a1->field_10;
    a0->field_0 = a1->field_0;
    a0->field_10 = v0;
    v1 = a1->field_20;
    v2 = a1->field_30;
    v3 = a1->field_40;
    *(int128_t *)((char *)&a0->field_40 + 12) = *(int128_t *)((char *)&a1->field_40 + 12);
    a0->field_30 = v2;
    a0->field_40 = v3;
    a0->field_20 = v1;
    return (unsigned long long)v1;
}
