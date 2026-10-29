/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb102f4..0xb10370 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b102f4_0 {
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
    char field_a0[28];
    char field_ac;
} st_b102f4_0;


double sub_b102f4(st_b102f4_0 *a0)
{
    st_b102f4_0 *v2;  // x0
    uint128_t v3;  // q1
    uint128_t v4;  // q1
    uint128_t v5;  // q1
    uint128_t v6;  // q1
    uint128_t v7;  // q0
    uint128_t v8;  // q1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a2f9e0() && !(v2 = sub_a6bf4c(188, "providers/implementations/digests/md5_sha1_prov.c", 61), !v2))
    {
        v3 = a0->field_90;
        v2->field_80 = a0->field_80;
        v2->field_90 = v3;
        *(int128_t *)&v2->field_a0[0] = *(int128_t *)&a0->field_a0[0];
        *(int128_t *)&v2->field_a0[12] = *(int128_t *)&a0->field_a0[12];
        v4 = a0->field_50;
        v2->field_40 = a0->field_40;
        v2->field_50 = v4;
        v5 = a0->field_70;
        v2->field_60 = a0->field_60;
        v2->field_70 = v5;
        v6 = a0->field_10;
        v2->field_0 = a0->field_0;
        v2->field_10 = v6;
        v7 = a0->field_20;
        v8 = a0->field_30;
        v2->field_20 = v7;
        v2->field_30 = v8;
    }
    return (unsigned long long)v7;
}
