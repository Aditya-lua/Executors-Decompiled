/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6294..0x62d8 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6294_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char padding_1c[4];
    unsigned long long field_20;
    char field_28;
    char padding_29[7];
    unsigned long long field_30;
    char field_38;
    char padding_39[7];
    unsigned long long field_40;
} st_6294_0;

extern char g_e60aa0;
extern char g_e61360;
extern unsigned int g_f00bf0;

double sub_6294(st_6294_0 *a0, uint128_t *a1, unsigned long a2, char a3, unsigned long a4, char a5, unsigned long a6)
{
    uint128_t v0;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00bf0;
    v0 = *a1;
    *(uint128_t *)&(&a0->field_8)[1] = v0;
    a0->field_0 = &g_e60aa0;
    *(unsigned long *)a0->padding_1c = a2;
    *(char *)&a0->field_20 = a3;
    *(unsigned long *)&a0->field_28 = a4;
    *(char *)&a0->field_30 = a5;
    *(unsigned long *)&a0->field_38 = a6;
    return (unsigned long long)v0;
}
