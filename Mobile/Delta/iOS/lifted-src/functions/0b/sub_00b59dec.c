/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb59dec..0xb59e60 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b59dec_0 {
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
    unsigned long long field_a0;
} st_b59dec_0;


double sub_b59dec(st_b59dec_0 *a0)
{
    st_b59dec_0 *v2;  // x0
    uint128_t v3;  // q1
    uint128_t v4;  // q1
    uint128_t v5;  // q0
    uint128_t v6;  // q1
    uint128_t v7;  // q0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a2f9e0() && !(v2 = sub_a6bf4c(168, "providers/implementations/digests/wp_prov.c", 24), !v2))
    {
        v3 = a0->field_90;
        v2->field_80 = a0->field_80;
        v2->field_90 = v3;
        v2->field_a0 = a0->field_a0;
        v4 = a0->field_50;
        v2->field_40 = a0->field_40;
        v2->field_50 = v4;
        v5 = a0->field_70;
        v2->field_60 = a0->field_60;
        v2->field_70 = v5;
        v6 = a0->field_10;
        v2->field_0 = a0->field_0;
        v2->field_10 = v6;
        v7 = a0->field_30;
        v2->field_20 = a0->field_20;
        v2->field_30 = v7;
    }
    return (unsigned long long)v7;
}
