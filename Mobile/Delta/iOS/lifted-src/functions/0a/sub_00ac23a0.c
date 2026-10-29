/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac23a0..0xac23e0 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac23a0_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    unsigned long long field_40;
    unsigned long long field_48;
} st_ac23a0_0;


int sub_ac23a0(st_ac23a0_0 *a0)
{
    a0->field_0 = 0x9f555fa3c84c64c222312194fc2bf72c;
    a0->field_10 = 0x963877195940eabd2393b86b6f53b151;
    a0->field_20 = 0xbe5e1e255386399296283ee2a88effe3;
    a0->field_30 = 0xeb72ddc81c52ca22b0199fc2c85b8aa;
    a0->field_40 = 0;
    a0->field_48 = 0;
    *(double *)&a0[2].field_30 = 6.7903865311e-313;
    return 1;
}
