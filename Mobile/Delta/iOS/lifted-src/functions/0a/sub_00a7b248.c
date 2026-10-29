/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7b248..0xa7b324 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7b248_0 {
    long long field_0;
    long long field_8;
    long long field_10;
    unsigned long long field_18;
    uint128_t field_20;
    uint128_t field_30;
    unsigned long long field_40;
    uint128_t field_48;
    uint128_t field_58;
    unsigned long long field_68;
    uint128_t field_70;
    uint128_t field_80;
    unsigned long long field_90;
} st_a7b248_0;


double sub_a7b248(st_a7b248_0 *a0)
{
    unsigned long v5;  // x8
    st_a7b248_0 *v6;  // x19
    uint128_t v0;  // [bp-0x48]
    uint128_t v1;  // [bp-0x38]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a0->field_18;
    if (v5)
    {
        sub_a71618("st-phase", a0->field_0, 0);
        a0->field_20 = v0;
        a0->field_30 = v1;
        a0->field_40 = v2;
        sub_a71618("st-type", a0->field_8, 0);
        *(uint128_t *)&(&a0->field_40)[1] = v0;
        *(uint128_t *)((char *)&a0->field_48 + 8) = v1;
        *(unsigned long *)((char *)&a0->field_58 + 8) = v2;
        sub_a71618("st-desc", a0->field_10, 0);
        *(uint128_t *)&a0->field_68 = v0;
        a0->field_70 = v1;
        *(unsigned long *)&a0->field_80 = v2;
        v5 = 3;
    }
    v6 = (char *)a0 + (unsigned int)v5 * 40;
    sub_a71bbc();
    v6->field_20 = v0;
    v6->field_30 = v1;
    v6->field_40 = v2;
    return *(unsigned long long *)&v0;
}
