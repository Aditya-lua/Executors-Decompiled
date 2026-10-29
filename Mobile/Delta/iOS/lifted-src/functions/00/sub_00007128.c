/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7128..0x7158 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7128_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
} st_7128_0;

extern char g_e61130;
extern char g_e61360;
extern unsigned int g_f00db0;

double sub_7128(st_7128_0 *a0, uint128_t *a1)
{
    uint128_t v0;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00db0;
    v0 = *a1;
    *(uint128_t *)&(&a0->field_8)[1] = v0;
    a0->field_0 = &g_e61130;
    return (unsigned long long)v0;
}
