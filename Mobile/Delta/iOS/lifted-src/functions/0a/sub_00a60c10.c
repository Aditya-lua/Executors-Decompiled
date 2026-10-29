/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa60c10..0xa60c38 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a60c10_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    unsigned int field_30[4];
    unsigned int field_38;
    char padding_3c[4];
    unsigned int field_40[4];
    uint128_t field_50;
} st_a60c10_0;


double sub_a60c10(st_a60c10_0 *a0)
{
    *(uint128_t *)&a0->field_38 = 0;
    *(uint128_t *)&a0->field_40[2] = 0;
    a0->field_20 = 0;
    *(uint128_t *)a0->field_30 = 0;
    a0->field_0 = 0;
    a0->field_10 = 0;
    a0->field_30[0] = 0xffffffff;
    a0->field_30[2] = 0xffffffff;
    a0->field_38 = 3;
    return 0;
}
