/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac0418..0xac044c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac0418_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    unsigned int field_60[4];
    char field_6c;
} st_ac0418_0;


int sub_ac0418(st_ac0418_0 *a0)
{
    a0->field_50 = 0;
    *(uint128_t *)a0->field_60 = 0;
    a0->field_30 = 0;
    a0->field_40 = 0;
    a0->field_0 = 0xa54ff53a3c6ef372bb67ae856a09e667;
    a0->field_10 = 0x5be0cd191f83d9ab9b05688c510e527f;
    a0->field_20 = 0;
    a0->field_60[3] = 24;
    return 1;
}
