/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5520..0x5558 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5520_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char padding_1c[4];
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
} st_5520_0;

extern char g_e60b48;
extern char g_e61360;
extern unsigned int g_f00c10;

double sub_5520(st_5520_0 *a0, uint128_t *a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    uint128_t v0;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00c10;
    v0 = *a1;
    *(uint128_t *)&(&a0->field_8)[1] = v0;
    a0->field_0 = &g_e60b48;
    *(unsigned long *)a0->padding_1c = a2;
    a0->field_20 = a3;
    a0->field_28 = a4;
    return (unsigned long long)v0;
}
