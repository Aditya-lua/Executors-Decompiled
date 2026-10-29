/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac0918..0xac0974 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac0918_0 {
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
    uint128_t field_a0;
    uint128_t field_b0;
    unsigned long long field_c0;
    char padding_c8[168];
    unsigned long long field_170;
    unsigned long long field_178;
    unsigned long long field_180;
    char field_188;
    char padding_189[31];
    unsigned int field_1a8;
} st_ac0918_0;


int sub_ac0918(st_ac0918_0 *a0, char a1, unsigned long long a2)
{
    unsigned long long v0;  // x8

    v0 = 1600 - a2 * 2;
    if (1351 < v0)
        return 0;
    a0->field_c0 = 0;
    a0->field_a0 = 0;
    a0->field_b0 = 0;
    a0->field_80 = 0;
    a0->field_90 = 0;
    a0->field_60 = 0;
    a0->field_70 = 0;
    a0->field_40 = 0;
    a0->field_50 = 0;
    a0->field_20 = 0;
    a0->field_30 = 0;
    a0->field_0 = 0;
    a0->field_10 = 0;
    a0->field_1a8 = 0;
    a0->field_170 = v0 >> 3;
    a0->field_178 = a2 >> 3;
    a0->field_180 = 0;
    a0->field_188 = a1;
    return 1;
}
