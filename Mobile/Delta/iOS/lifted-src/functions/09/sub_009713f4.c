/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9713f4..0x971430 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9713f4_0 {
    char padding_0[16];
    unsigned long long field_10;
    char padding_18[16];
    unsigned int field_28;
    char padding_2c[12];
    unsigned long long field_38;
    unsigned long long field_40;
    uint128_t field_48;
    unsigned long long field_58;
    unsigned int field_60;
    char padding_64[4];
    unsigned long long field_68;
    unsigned int field_70;
} st_9713f4_0;


double sub_9713f4(st_9713f4_0 *a0)
{
    unsigned long long v0;  // x8

    *(double *)&a0->padding_18[8] = 4.2439915824e-314;
    a0->field_28 = 3;
    v0 = a0->field_10;
    a0->field_38 = 0;
    a0->field_40 = v0;
    *(uint128_t *)&(&a0->field_40)[1] = 0xffffffffffffffff;
    *(unsigned long long *)((char *)&a0->field_48 + 8) = 0;
    *(unsigned int *)&a0->field_58 = 0;
    *(unsigned long long *)&a0->field_60 = 0;
    *(unsigned int *)&a0->field_68 = 0;
    return 0xffffffffffffffff;
}
