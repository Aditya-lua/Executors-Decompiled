/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb59a20..0xb59a84 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b59a20_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    char field_40[28];
    char field_4c;
} st_b59a20_0;


double sub_b59a20(st_b59a20_0 *a0)
{
    st_b59a20_0 *v2;  // x0
    uint128_t v3;  // q1
    uint128_t v4;  // q0
    uint128_t v5;  // q1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a2f9e0() && !(v2 = sub_a6bf4c(92, "providers/implementations/digests/md4_prov.c", 24), !v2))
    {
        v3 = a0->field_30;
        v2->field_20 = a0->field_20;
        v2->field_30 = v3;
        *(int128_t *)&v2->field_40[0] = *(int128_t *)&a0->field_40[0];
        *(int128_t *)&v2->field_40[12] = *(int128_t *)&a0->field_40[12];
        v4 = a0->field_0;
        v5 = a0->field_10;
        v2->field_0 = v4;
        v2->field_10 = v5;
    }
    return (unsigned long long)v4;
}
