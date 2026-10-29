/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x80188..0x801cc (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_80188_0 {
    struct st_80188_0 *field_0;
    char padding_8[8];
    struct st_80188_0 *field_10;
    char padding_18[8];
    struct st_80188_0 *field_20;
    char padding_28[4];
    char field_2c;
    char padding_2d[3];
    struct st_80188_0 *field_30;
    char padding_38[8];
    struct st_80188_0 *field_40;
    char padding_48[8];
    struct st_80188_0 *field_50;
    char padding_58[8];
    struct st_80188_0 *field_60;
    char padding_68[8];
    struct st_80188_0 *field_70;
    char padding_78[8];
    struct st_80188_0 *field_80;
    char padding_88[8];
    struct st_80188_0 *field_90;
    char padding_98[8];
    struct st_80188_0 *field_a0;
    char padding_a8[8];
    struct st_80188_0 *field_b0;
    char padding_b8[8];
    struct st_80188_0 *field_c0;
    char padding_c8[8];
    struct st_80188_0 *field_d0;
} st_80188_0;


st_80188_0 * sub_80188(st_80188_0 *a0, unsigned int a1)
{
    if (!a0)
        return 0xffffffffffffffff;
    *(uint128_t *)&a0->field_20 = 0;
    *(uint128_t *)&a0->field_30 = 0;
    *(unsigned int *)&a0->field_2c = a1;
    *(unsigned int *)&a0->field_20 = 1;
    *(uint128_t *)&a0->field_c0 = 0;
    *(uint128_t *)&a0->field_d0 = 0;
    *(uint128_t *)&a0->field_a0 = 0;
    *(uint128_t *)&a0->field_b0 = 0;
    *(uint128_t *)&a0->field_80 = 0;
    *(uint128_t *)&a0->field_90 = 0;
    *(uint128_t *)&a0->field_60 = 0;
    *(uint128_t *)&a0->field_70 = 0;
    *(uint128_t *)&a0->field_40 = 0;
    *(uint128_t *)&a0->field_50 = 0;
    *(uint128_t *)&a0->field_0 = 0;
    *(uint128_t *)&a0->field_10 = 0;
    return 0;
}
