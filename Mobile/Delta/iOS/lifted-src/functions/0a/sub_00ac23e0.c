/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac23e0..0xac2420 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac23e0_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    unsigned long long field_40;
    unsigned long long field_48;
} st_ac23e0_0;


int sub_ac23e0(st_ac23e0_0 *a0)
{
    a0->field_0 = 0x629a292a367cd507cbbb9d5dc1059ed8;
    a0->field_10 = 0x152fecd8f70e59399159015a3070dd17;
    a0->field_20 = 0x8eb44a876858151167332667ffc00b31;
    a0->field_30 = 0x47b5481dbefa4fa4db0c2e0d64f98fa7;
    a0->field_40 = 0;
    a0->field_48 = 0;
    *(double *)&a0[2].field_30 = 1.018557979663e-312;
    return 1;
}
