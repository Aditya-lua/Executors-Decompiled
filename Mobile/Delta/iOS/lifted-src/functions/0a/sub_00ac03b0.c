/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac03b0..0xac03e4 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac03b0_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    unsigned int field_60[4];
    char field_6c;
} st_ac03b0_0;


int sub_ac03b0(st_ac03b0_0 *a0)
{
    a0->field_50 = 0;
    *(uint128_t *)a0->field_60 = 0;
    a0->field_30 = 0;
    a0->field_40 = 0;
    a0->field_0 = 0xf70e59393070dd17367cd507c1059ed8;
    a0->field_10 = 0xbefa4fa464f98fa768581511ffc00b31;
    a0->field_20 = 0;
    a0->field_60[3] = 28;
    return 1;
}
