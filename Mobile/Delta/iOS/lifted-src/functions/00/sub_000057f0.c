/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x57f0..0x5830 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_57f0_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char padding_1c[4];
    uint128_t field_20;
    uint128_t field_30;
} st_57f0_0;

extern char g_e60b10;
extern char g_e61360;
extern unsigned int g_f00c00;

double sub_57f0(st_57f0_0 *a0, uint128_t *a1, uint128_t *a2, uint128_t *a3)
{
    uint128_t v0;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00c00;
    *(uint128_t *)&(&a0->field_8)[1] = *a1;
    a0->field_0 = &g_e60b10;
    *(uint128_t *)a0->padding_1c = *a2;
    v0 = *a3;
    a0->field_20 = v0;
    return (unsigned long long)v0;
}
