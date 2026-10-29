/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb12120..0xb12184 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b12120_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    char field_5c;
} st_b12120_0;

typedef struct st_b12120_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    char field_50[28];
    char field_5c;
} st_b12120_1;


double sub_b12120(st_b12120_0 *a0)
{
    st_b12120_1 *v2;  // x0
    uint128_t v3;  // q1
    uint128_t v4;  // q1
    uint128_t v5;  // q0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a2f9e0() && !(v2 = sub_a6bf4c(108, "providers/implementations/digests/sm3_prov.c", 18), !v2))
    {
        v3 = a0->field_50;
        v2->field_40 = a0->field_40;
        *(uint128_t *)&v2->field_50[0] = v3;
        *(int128_t *)&v2->field_50[12] = *(int128_t *)((char *)&a0->field_50 + 12);
        v4 = a0->field_10;
        v2->field_0 = a0->field_0;
        v2->field_10 = v4;
        v5 = a0->field_30;
        v2->field_20 = a0->field_20;
        v2->field_30 = v5;
    }
    return (unsigned long long)v5;
}
