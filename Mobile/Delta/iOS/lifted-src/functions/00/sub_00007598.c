/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7598..0x75cc (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7598_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char field_1c;
} st_7598_0;

extern char g_e60758;
extern char g_e61360;
extern unsigned int g_f00b00;

double sub_7598(st_7598_0 *a0, uint128_t *a1, char a2)
{
    uint128_t v0;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00b00;
    v0 = *a1;
    *(uint128_t *)&(&a0->field_8)[1] = v0;
    a0->field_0 = &g_e60758;
    *((char *)&a0->field_c + 12) = a2;
    return (unsigned long long)v0;
}
