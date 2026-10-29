/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa33004..0xa33034 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a33004_0 {
    int field_0;
    char padding_4[12];
    int field_10;
    char padding_14[12];
    int field_20;
    char padding_24[12];
    char field_30;
    char padding_31[39];
    char field_58;
    char padding_59[55];
    int field_90;
    char padding_94[4];
    int field_98;
    char padding_9c[60];
    int field_d8;
} st_a33004_0;


double sub_a33004(st_a33004_0 *a0)
{
    *(unsigned long long *)&a0->field_90 = 0;
    a0->field_98 = 0;
    *(unsigned long long *)&a0->field_d8 = 0;
    *(uint128_t *)&a0->field_0 = 0;
    *(uint128_t *)&a0->field_10 = 0;
    *(unsigned long long *)&a0->field_20 = 0;
    memset(&a0->field_30, 0, 24);
    memset(&a0->field_58, 0, 48);
    return 0;
}
