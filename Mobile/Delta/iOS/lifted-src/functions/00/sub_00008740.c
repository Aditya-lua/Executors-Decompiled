/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8740..0x8770 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8740_0 {
    unsigned int field_0;
    unsigned long long field_4;
    char padding_c[4];
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
    uint128_t field_40;
    unsigned long long field_50;
    unsigned long long field_58;
} st_8740_0;

extern unsigned int g_f01060;

double sub_8740(st_8740_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long a6, unsigned long a7, uint128_t a8, unsigned long a9, unsigned long a10, unsigned long a11)
{
    a0->field_0 = g_f01060;
    *(unsigned long *)&(&a0->field_0)[1] = a1;
    *(unsigned long *)a0->padding_c = a2;
    a0->field_10 = a3;
    a0->field_18 = a4;
    a0->field_20 = a5;
    a0->field_28 = a6;
    a0->field_30 = a7;
    *(uint128_t *)&a0->field_38 = a8;
    *(unsigned long *)&a0->field_40 = a10;
    *(unsigned long *)((char *)&a0->field_40 + 8) = a11;
    return *(unsigned long long *)&a8;
}
