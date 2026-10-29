/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x740c..0x7448 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_740c_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char padding_1c[4];
    uint128_t field_20;
    unsigned int field_30;
} st_740c_0;

extern char g_e60ad8;
extern char g_e61360;
extern unsigned int g_f00de0;

double sub_740c(st_740c_0 *a0, uint128_t *a1, uint128_t *a2, unsigned int a3)
{
    uint128_t v0;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00de0;
    *(uint128_t *)&(&a0->field_8)[1] = *a1;
    a0->field_0 = &g_e60ad8;
    v0 = *a2;
    *(uint128_t *)a0->padding_1c = v0;
    *(unsigned int *)&a0->field_20 = a3;
    return (unsigned long long)v0;
}
