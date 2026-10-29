/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac2360..0xac23a0 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac2360_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    unsigned long long field_40;
    unsigned long long field_48;
} st_ac2360_0;


int sub_ac2360(st_ac2360_0 *a0)
{
    a0->field_0 = 0x73e1996689dcd4d68c3d37c819544da2;
    a0->field_10 = 0x679dd514582f9fcf1dfab7ae32ff9c82;
    a0->field_20 = 0x77e36f7304c489420f6d2b697bd44da8;
    a0->field_30 = 0x1112e6ad91d692a13f9d85a86a1d36c8;
    a0->field_40 = 0;
    a0->field_48 = 0;
    *(double *)&a0[2].field_30 = 5.9415882147e-313;
    return 1;
}
