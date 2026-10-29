/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x54b4..0x54e8 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_54b4_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char field_1c;
} st_54b4_0;

extern char g_e60c98;
extern char g_e61360;
extern unsigned int g_f00c70;

double sub_54b4(st_54b4_0 *a0, uint128_t *a1)
{
    uint128_t v0;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00c70;
    v0 = *a1;
    *(uint128_t *)&(&a0->field_8)[1] = v0;
    *((char *)&a0->field_c + 12) = 0;
    a0->field_0 = &g_e60c98;
    return (unsigned long long)v0;
}
