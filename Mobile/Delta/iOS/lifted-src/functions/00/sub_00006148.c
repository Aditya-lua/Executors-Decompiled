/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6148..0x6194 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6148_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char padding_1c[4];
    unsigned long long field_20;
    unsigned long long field_28;
    uint128_t field_30;
    unsigned long long field_40;
    char field_48;
} st_6148_0;

extern char g_e60918;
extern char g_e61360;
extern unsigned int g_f00b80;

double sub_6148(st_6148_0 *a0, uint128_t *a1, unsigned long a2, unsigned long long *a3, uint128_t *a4, unsigned long long *a5, char a6)
{
    unsigned long long v0;  // x8
    uint128_t v1;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00b80;
    *(uint128_t *)&(&a0->field_8)[1] = *a1;
    a0->field_0 = &g_e60918;
    v0 = *a3;
    *(unsigned long *)a0->padding_1c = a2;
    a0->field_20 = v0;
    v1 = *a4;
    *(uint128_t *)&a0->field_28 = v1;
    *(unsigned long long *)&a0->field_30 = *a5;
    *((char *)&a0->field_30 + 8) = a6;
    return (unsigned long long)v1;
}
