/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7370..0x73bc (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7370_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char field_1c;
    char padding_1d[3];
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    uint128_t field_38;
    unsigned long long field_48;
} st_7370_0;

extern char g_e60fe0;
extern char g_e61360;
extern unsigned int g_f00d60;

double sub_7370(st_7370_0 *a0, uint128_t *a1, unsigned long long *a2, unsigned long a3, unsigned long a4, uint128_t *a5, unsigned long a6)
{
    uint128_t v0;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00d60;
    *(uint128_t *)&(&a0->field_8)[1] = *a1;
    *((char *)&a0->field_c + 12) = 0;
    a0->field_0 = &g_e60fe0;
    *(unsigned long long *)&a0->field_1c = *a2;
    a0->field_20 = a3;
    a0->field_28 = a4;
    v0 = *a5;
    *(uint128_t *)&a0->field_30 = v0;
    *(unsigned long *)((char *)&a0->field_38 + 8) = a6;
    return (unsigned long long)v0;
}
