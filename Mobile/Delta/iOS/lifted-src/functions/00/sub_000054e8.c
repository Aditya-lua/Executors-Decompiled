/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x54e8..0x5520 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_54e8_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    unsigned int field_1c;
    unsigned long long field_20;
    unsigned long long field_28;
} st_54e8_0;

extern char g_e60a30;
extern char g_e61360;
extern unsigned int g_f00bd0;

double sub_54e8(st_54e8_0 *a0, uint128_t *a1, unsigned int a2, unsigned long a3, unsigned long a4)
{
    uint128_t v0;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00bd0;
    v0 = *a1;
    *(uint128_t *)&(&a0->field_8)[1] = v0;
    a0->field_0 = &g_e60a30;
    *(unsigned int *)((char *)&a0->field_c + 12) = a2;
    *(unsigned long *)&a0->field_1c = a3;
    a0->field_20 = a4;
    return (unsigned long long)v0;
}
