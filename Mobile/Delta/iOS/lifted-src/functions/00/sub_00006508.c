/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6508..0x6548 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6508_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char field_1c;
    char padding_1d[3];
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
    char field_40;
} st_6508_0;

extern char g_e60fa8;
extern char g_e61360;
extern unsigned int g_f00d50;

double sub_6508(st_6508_0 *a0, uint128_t *a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5, char a6)
{
    uint128_t v0;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00d50;
    v0 = *a1;
    *(uint128_t *)&(&a0->field_8)[1] = v0;
    *((char *)&a0->field_c + 12) = 0;
    a0->field_0 = &g_e60fa8;
    *(unsigned long *)&a0->field_1c = a2;
    a0->field_20 = a3;
    a0->field_28 = a4;
    a0->field_30 = a5;
    *(char *)&a0->field_38 = a6;
    return (unsigned long long)v0;
}
