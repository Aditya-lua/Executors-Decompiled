/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6abc..0x6af0 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6abc_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char padding_1c[4];
    unsigned long long field_20;
} st_6abc_0;

extern char g_e61328;
extern char g_e61360;
extern unsigned int g_f00e60;

double sub_6abc(st_6abc_0 *a0, uint128_t *a1, unsigned long a2)
{
    uint128_t v0;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00e60;
    v0 = *a1;
    *(uint128_t *)&(&a0->field_8)[1] = v0;
    a0->field_0 = &g_e61328;
    *(unsigned long *)a0->padding_1c = a2;
    return (unsigned long long)v0;
}
