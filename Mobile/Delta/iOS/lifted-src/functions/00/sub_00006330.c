/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6330..0x6364 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6330_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char padding_1c[4];
    unsigned long long field_20;
    unsigned long long field_28;
} st_6330_0;

extern char g_e60a68;
extern char g_e61360;
extern unsigned int g_f00be0;

double sub_6330(st_6330_0 *a0, uint128_t *a1, unsigned long a2, unsigned long a3)
{
    uint128_t v0;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00be0;
    v0 = *a1;
    *(uint128_t *)&(&a0->field_8)[1] = v0;
    a0->field_0 = &g_e60a68;
    *(unsigned long *)a0->padding_1c = a2;
    a0->field_20 = a3;
    return (unsigned long long)v0;
}
