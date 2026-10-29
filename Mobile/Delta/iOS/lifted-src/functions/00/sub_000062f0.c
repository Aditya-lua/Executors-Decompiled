/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x62f0..0x6330 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_62f0_1 {
    uint128_t field_0;
    unsigned long long field_10;
} st_62f0_1;

typedef struct st_62f0_0 {
    unsigned long long field_0;
    unsigned int field_8;
    uint128_t field_c;
    char padding_1c[4];
    uint128_t field_20;
    unsigned long long field_30;
} st_62f0_0;

extern char g_e612b8;
extern char g_e61360;
extern unsigned int g_f00e40;

double sub_62f0(st_62f0_0 *a0, uint128_t *a1, st_62f0_1 *a2)
{
    uint128_t v0;  // q0

    a0->field_0 = &g_e61360;
    a0->field_8 = g_f00e40;
    *(uint128_t *)&(&a0->field_8)[1] = *a1;
    a0->field_0 = &g_e612b8;
    v0 = a2->field_0;
    *(unsigned long long *)&a0->field_20 = a2->field_10;
    *(uint128_t *)a0->padding_1c = v0;
    return (unsigned long long)v0;
}
