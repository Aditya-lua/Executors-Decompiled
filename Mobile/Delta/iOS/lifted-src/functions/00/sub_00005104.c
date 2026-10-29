/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5104..0x513c (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5104_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char padding_1c[4];
    uint128_t field_20;
} st_5104_0;

extern char g_e611a0;
extern char g_e61360;
extern unsigned int g_f00dd0;

double sub_5104(st_5104_0 *a0, uint128_t *a1, uint128_t *a2)
{
    uint128_t v0;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00dd0;
    *(uint128_t *)&(&a0->field_8)[1] = *a1;
    a0->field_0 = &g_e611a0;
    v0 = *a2;
    *(uint128_t *)a0->padding_1c = v0;
    return (unsigned long long)v0;
}
