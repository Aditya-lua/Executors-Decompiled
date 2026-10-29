/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8808..0x8838 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8808_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
    uint128_t field_40;
    uint128_t field_50;
    unsigned long long field_60;
    unsigned long long field_68;
} st_8808_0;

extern unsigned int g_f00ef0;

double sub_8808(st_8808_0 *a0)
{
    a0->field_0 = g_f00ef0;
    a0->field_8 = 0;
    a0->field_10 = 0;
    a0->field_18 = 0xffffffffffffffff;
    a0->field_20 = 0xffffffffffffffff;
    a0->field_28 = 0;
    a0->field_30 = 0;
    a0->field_38 = 0xffffffffffffffff;
    a0->field_40 = 0;
    a0->field_50 = 0;
    a0->field_60 = 0xffffffffffffffff;
    a0->field_68 = 0xffffffffffffffff;
    return 0;
}
