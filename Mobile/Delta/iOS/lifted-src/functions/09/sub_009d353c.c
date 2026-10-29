/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d353c..0x9d3558 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d353c_0 {
    char field_0[16];
    char field_1;
    char padding_2[14];
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    char field_50[28];
    char field_5c;
} st_9d353c_0;


double sub_9d353c(st_9d353c_0 *a0)
{
    *(uint128_t *)((char *)&a0->field_40 + 12) = 0;
    a0->field_30 = 0;
    a0->field_40 = 0;
    a0->field_10 = 0;
    a0->field_20 = 0;
    *(uint128_t *)a0->field_0 = 0;
    *(uint128_t *)&a0->field_1 = 0;
    a0->field_0[1] = 0;
    return 0;
}
