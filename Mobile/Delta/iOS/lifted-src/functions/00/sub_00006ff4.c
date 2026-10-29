/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6ff4..0x7024 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6ff4_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
} st_6ff4_0;

extern char g_e60720;
extern char g_e61360;
extern unsigned int g_f00af0;

double sub_6ff4(st_6ff4_0 *a0, uint128_t *a1)
{
    uint128_t v0;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00af0;
    v0 = *a1;
    *(uint128_t *)&(&a0->field_8)[1] = v0;
    a0->field_0 = &g_e60720;
    return (unsigned long long)v0;
}
