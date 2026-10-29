/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6f98..0x6ff4 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6f98_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char field_1c;
    char padding_1d[3];
    unsigned long long field_20;
    uint128_t field_28;
    uint128_t field_38;
    uint128_t field_48;
    unsigned long long field_58;
    char field_60;
} st_6f98_0;

extern char g_e60ec8;
extern char g_e61360;
extern unsigned int g_f00d10;

double sub_6f98(st_6f98_0 *a0, uint128_t *a1, unsigned long long *a2, uint128_t *a3, uint128_t *a4, uint128_t *a5, unsigned long a6, char a7)
{
    uint128_t v0;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00d10;
    *(uint128_t *)&(&a0->field_8)[1] = *a1;
    *((char *)&a0->field_c + 12) = 0;
    a0->field_0 = &g_e60ec8;
    *(unsigned long long *)&a0->field_1c = *a2;
    *(uint128_t *)&a0->field_20 = *a3;
    *(uint128_t *)((char *)&a0->field_28 + 8) = *a4;
    v0 = *a5;
    *(uint128_t *)((char *)&a0->field_38 + 8) = v0;
    *(unsigned long *)((char *)&a0->field_48 + 8) = a6;
    *(char *)&a0->field_58 = a7;
    return (unsigned long long)v0;
}
