/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4ed8..0x4f18 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4ed8_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char padding_1c[4];
    uint128_t field_20;
    char field_30;
    char padding_31[3];
    unsigned int field_34;
} st_4ed8_0;

extern char g_e61280;
extern char g_e61360;
extern unsigned int g_f00e00;

double sub_4ed8(st_4ed8_0 *a0, uint128_t *a1, uint128_t *a2, char a3, unsigned int a4)
{
    uint128_t v0;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00e00;
    *(uint128_t *)&(&a0->field_8)[1] = *a1;
    a0->field_0 = &g_e61280;
    v0 = *a2;
    *(uint128_t *)a0->padding_1c = v0;
    *(char *)&a0->field_20 = a3;
    *(unsigned int *)((char *)&a0->field_20 + 4) = a4;
    return (unsigned long long)v0;
}
