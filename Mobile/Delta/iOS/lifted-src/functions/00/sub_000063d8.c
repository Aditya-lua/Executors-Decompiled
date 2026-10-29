/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x63d8..0x643c (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_63d8_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char padding_1c[4];
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    unsigned long long field_60;
    uint128_t field_68;
    unsigned long long field_78;
} st_63d8_0;

typedef struct st_63d8_1 {
    uint128_t field_0;
    unsigned long long field_10;
} st_63d8_1;

extern char g_e610c0;
extern char g_e61360;
extern unsigned int g_f00d90;

double sub_63d8(st_63d8_0 *a0, uint128_t *a1, uint128_t *a2, uint128_t *a3, uint128_t *a4, st_63d8_1 *a5, uint128_t *a6, unsigned long a7)
{
    unsigned long long v0;  // x8
    uint128_t v1;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00d90;
    *(uint128_t *)&(&a0->field_8)[1] = *a1;
    a0->field_0 = &g_e610c0;
    *(uint128_t *)a0->padding_1c = *a2;
    a0->field_20 = *a3;
    a0->field_30 = *a4;
    v0 = a5->field_10;
    a0->field_40 = a5->field_0;
    *(unsigned long long *)&a0->field_50 = v0;
    v1 = *a6;
    *(uint128_t *)((char *)&a0->field_50 + 8) = v1;
    (&a0->field_60)[1] = a7;
    return (unsigned long long)v1;
}
