/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3be6a4..0x3be718 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3be6a4_0 {
    int field_0;
    char padding_4[12];
    int field_10;
    char padding_14[12];
    int field_20;
    char padding_24[12];
    int field_30;
    char padding_34[4];
    unsigned int field_38;
    char padding_3c[4];
    int field_40;
    char padding_44[12];
    int field_50;
    char padding_54[12];
    int field_60;
    char padding_64[12];
    int field_70;
    char padding_74[4];
    unsigned int field_78;
    char padding_7c[4];
    int field_80;
    char padding_84[12];
    int field_90;
    char padding_94[12];
    unsigned int field_a0;
    char padding_a4[4];
    int field_a8;
    char padding_ac[12];
    int field_b8;
    char padding_bc[12];
    unsigned int field_c8;
    char padding_cc[4];
    int field_d0;
    char padding_d4[4];
    int field_d8;
    char padding_dc[12];
    int field_e8;
    char padding_ec[12];
    int field_f8;
    char padding_fc[12];
    char field_108;
    char padding_109[223];
    int field_1e8;
} st_3be6a4_0;


double sub_3be6a4(st_3be6a4_0 *a0)
{
    *(unsigned long long *)&a0->field_30 = 0;
    *(uint128_t *)&a0->field_10 = 0;
    *(uint128_t *)&a0->field_20 = 0;
    *(uint128_t *)&a0->field_0 = 0;
    a0->field_38 = 0x3f800000;
    *(uint128_t *)&a0->field_40 = 0;
    *(uint128_t *)&a0->field_50 = 0;
    *(uint128_t *)&a0->field_60 = 0;
    *(unsigned long long *)&a0->field_70 = 0;
    a0->field_78 = 0x3f800000;
    *(uint128_t *)&a0->field_80 = 0;
    *(uint128_t *)&a0->field_90 = 0;
    a0->field_a0 = 0x3f800000;
    *(uint128_t *)&a0->field_a8 = 0;
    *(uint128_t *)&a0->field_b8 = 0;
    a0->field_c8 = 0x3f800000;
    *(char *)&a0->field_d0 = 0;
    *(uint128_t *)&a0->field_f8 = 0;
    *(uint128_t *)&a0->field_e8 = 0;
    *(char *)&a0->field_1e8 = 0;
    *(uint128_t *)&a0->field_d8 = 0;
    memset(&a0->field_108, 0, 224);
    return 0;
}
