/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x68e8..0x6924 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_68e8_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    unsigned int field_1c;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
} st_68e8_0;

extern char g_e60640;
extern char g_e61360;
extern unsigned int g_f00ab0;

double sub_68e8(st_68e8_0 *a0, uint128_t *a1, unsigned int a2, unsigned long a3, unsigned long a4, unsigned long a5)
{
    uint128_t v0;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00ab0;
    v0 = *a1;
    *(uint128_t *)&(&a0->field_8)[1] = v0;
    a0->field_0 = &g_e60640;
    *(unsigned int *)((char *)&a0->field_c + 12) = a2;
    *(unsigned long *)&a0->field_1c = a3;
    a0->field_20 = a4;
    a0->field_28 = a5;
    return (unsigned long long)v0;
}
