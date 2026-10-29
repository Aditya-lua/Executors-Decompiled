/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5428..0x5460 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5428_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char padding_1c[4];
    unsigned long long field_20;
    unsigned int field_28;
} st_5428_0;

extern char g_e60790;
extern char g_e61360;
extern unsigned int g_f00b10;

st_5428_0 * sub_5428(st_5428_0 *a0, uint128_t *a1, unsigned int a2, double a3)
{
    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00b10;
    *(uint128_t *)&(&a0->field_8)[1] = *a1;
    a0->field_0 = &g_e60790;
    *(unsigned long *)a0->padding_1c = a3;
    *(unsigned int *)&a0->field_20 = a2;
    return a0;
}
