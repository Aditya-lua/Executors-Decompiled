/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x74c0..0x7500 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_74c0_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char field_1c;
    char padding_1d[3];
    unsigned long long field_20;
    unsigned long long field_28;
    char field_30;
    char padding_31[3];
    unsigned long long field_34;
} st_74c0_0;

extern char g_e60e90;
extern char g_e61360;
extern unsigned int g_f00d00;

double sub_74c0(st_74c0_0 *a0, uint128_t *a1, unsigned long a2, unsigned long a3, char a4, unsigned long a5)
{
    uint128_t v0;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00d00;
    v0 = *a1;
    *(uint128_t *)&(&a0->field_8)[1] = v0;
    *((char *)&a0->field_c + 12) = 0;
    a0->field_0 = &g_e60e90;
    *(unsigned long *)&a0->field_1c = a2;
    a0->field_20 = a3;
    *(char *)&a0->field_28 = a4;
    *(unsigned long *)((char *)&a0->field_28 + 4) = a5;
    return (unsigned long long)v0;
}
