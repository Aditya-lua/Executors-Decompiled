/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7088..0x70bc (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7088_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char padding_1c[4];
    unsigned long long field_20;
    unsigned long long field_28;
} st_7088_0;

extern char g_e60950;
extern char g_e61360;
extern unsigned int g_f00b90;

double sub_7088(st_7088_0 *a0, uint128_t *a1, unsigned long a2, unsigned long a3)
{
    uint128_t v0;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00b90;
    v0 = *a1;
    *(uint128_t *)&(&a0->field_8)[1] = v0;
    a0->field_0 = &g_e60950;
    *(unsigned long *)a0->padding_1c = a2;
    a0->field_20 = a3;
    return (unsigned long long)v0;
}
