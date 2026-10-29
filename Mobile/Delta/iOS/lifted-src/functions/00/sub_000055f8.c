/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x55f8..0x5648 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_55f8_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char padding_1c[4];
    unsigned long long field_20;
    uint128_t field_28;
    uint128_t field_38;
    char field_48;
    char padding_49[3];
    uint128_t field_4c;
} st_55f8_0;

extern char g_e608e0;
extern char g_e61360;
extern unsigned int g_f00b70;

double sub_55f8(st_55f8_0 *a0, uint128_t *a1, unsigned long a2, uint128_t *a3, char a4, uint128_t *a5, uint128_t *a6)
{
    uint128_t v0;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00b70;
    *(uint128_t *)&(&a0->field_8)[1] = *a1;
    a0->field_0 = &g_e608e0;
    *(unsigned long *)a0->padding_1c = a2;
    *(uint128_t *)&a0->field_20 = *a5;
    *(uint128_t *)((char *)&a0->field_28 + 8) = *a3;
    *((char *)&a0->field_38 + 8) = a4;
    v0 = *a6;
    *(uint128_t *)((char *)&a0->field_38 + 12) = v0;
    return (unsigned long long)v0;
}
